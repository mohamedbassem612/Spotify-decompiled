package p;

import com.spotify.nowplaying.scroll.view.NowPlayingScrollView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fr41 {
    public final int a;
    public final bpb1 b;
    public final xe01 c;
    public int d;
    public Integer e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    public fr41(NowPlayingScrollView nowPlayingScrollView, int i, llm llmVar, q8n q8nVar) {
        this.a = (int) (i * nowPlayingScrollView.getResources().getDisplayMetrics().density);
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.b = bpb1VarB;
        this.c = d5p1.h(bpb1VarB);
        fn31.T(llmVar, q8nVar, 0, new lc41(nowPlayingScrollView, this, (lnm) null, (byte) 8), 2);
    }
}
