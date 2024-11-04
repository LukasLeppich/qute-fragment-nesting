If another page is included within a fragment, the rendered=false of fragments within the other page will be ignored.

In this example, there are two pages A and B. Page A has a fragment called "content" which includes page B. Page B has two fragments with rendered=false, only the first is rendered with include.

There are two endpoints:
- /page/ok -> renders page A completely
- /page/wrong -> renders only the content fragment within page A.

The "ok" endpoint renders as expected. The "wrong" endpoint contains the A and B fragments from page B, even though the rendered property was set to false.

Expected behaviour: Both endpoints should produce the same output on screen.
