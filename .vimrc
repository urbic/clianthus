se rtp+=src/vim
se indentexpr=

au BufNewFile,BufRead *.java se tw=100

au BufNewFile,BufRead Containerfile se ft=dockerfile

au FileType {yaml} se expandtab |se ts=2
