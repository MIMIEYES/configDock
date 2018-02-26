"==========================================
" HotKey Settings  自定义快捷键设置
"==========================================

nnoremap s viw"_dP
" share system clipboard

" Go to home and end using capitalized directions
noremap dL d$
noremap W viw
noremap yw yiw
nnoremap dw diw
noremap <C-i> o<Esc>

" copy text to clipboard
vnoremap Y "+y
" paste from clipboard
nnoremap <C-p> "+p
nnoremap + ddp
nnoremap _ ddkP
nnoremap - $

" 替换 Esc 并切换为相对行号
inoremap <C-g> <Esc>:set relativenumber number<CR>



