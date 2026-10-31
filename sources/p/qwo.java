package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qwo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ qwo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ix7 a(w6h1 w6h1Var) {
        byte b = this.a;
        blp blpVar = this.b;
        switch (b) {
            case 0:
                qq qqVar = (qq) ((fwo) blpVar).c;
                rwo rwoVar = (rwo) ((jly0) qqVar.g).get();
                kt91 kt91Var = (kt91) ((mb1) qqVar.a).d.get();
                c8o.l(kt91Var);
                Resources resources = (Resources) ((mb1) qqVar.a).n.get();
                c8o.l(resources);
                return new ix7(w6h1Var, rwoVar, kt91Var, resources);
            default:
                wj3 wj3Var = (wj3) blpVar.c;
                rwo rwoVar2 = (rwo) ((jly0) wj3Var.h).get();
                kt91 kt91Var2 = (kt91) ((d7g0) wj3Var.b).c.get();
                c8o.l(kt91Var2);
                Resources resources2 = (Resources) ((d7g0) wj3Var.b).j.get();
                c8o.l(resources2);
                return new ix7(w6h1Var, rwoVar2, kt91Var2, resources2);
        }
    }
}
