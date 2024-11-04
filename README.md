When including another page within a fragment, the rendered=false of fragments within the other page are ignored.

In this example, there are to pages A and B.
Page A has a fragment named content, inside of this fragment, the Page B is included.
Page B has two fragments with rendered=false, only the first one is rendered with include.

There are two endpoints:
/page/ok -> Renders the Page A completet
/page/wrong -> Only renders the content fragment within Page A.

The endpoint "ok" renders as expected.
The endpoint "worng" contains the fragments A and B from page B, although the rendered property was set to false. 

Expected Behaviour:
Both endpoints should produce the same output on screen. 
