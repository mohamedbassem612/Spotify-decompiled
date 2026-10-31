package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qcc1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g2x0 b;

    public /* synthetic */ qcc1(g2x0 g2x0Var, byte b) {
        this.a = b;
        this.b = g2x0Var;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                nt21 nt21Var = (nt21) this.b.b;
                t45 t45VarA = ((zle1) nt21Var.b).a("generate_instant_mix_playlist_search");
                t45VarA.h = "android-feature-search";
                t45.m(t45VarA, "generate_instant_mix_playlist_search", 4);
                nt21Var.c = new vv41("generate_instant_mix_playlist_search", t45VarA);
                break;
            default:
                ((nt21) this.b.b).i(2);
                break;
        }
    }
}
