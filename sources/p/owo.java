package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class owo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ owo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yu3 a(w6h1 w6h1Var) {
        byte b = this.a;
        blp blpVar = this.b;
        switch (b) {
            case 0:
                qq qqVar = (qq) ((fwo) blpVar).c;
                pwo pwoVar = (pwo) ((jly0) qqVar.e).get();
                Resources resources = (Resources) ((mb1) qqVar.a).n.get();
                c8o.l(resources);
                mb1 mb1Var = (mb1) qqVar.a;
                kt91 kt91Var = (kt91) mb1Var.d.get();
                c8o.l(kt91Var);
                kt91 kt91Var2 = (kt91) mb1Var.d.get();
                c8o.l(kt91Var2);
                Resources resources2 = (Resources) mb1Var.n.get();
                c8o.l(resources2);
                q8n q8nVar = (q8n) mb1Var.a.get();
                c8o.l(q8nVar);
                return new yu3(w6h1Var, pwoVar, resources, kt91Var, new dlg1(kt91Var2, resources2, q8nVar));
            default:
                wj3 wj3Var = (wj3) blpVar.c;
                pwo pwoVar2 = (pwo) ((jly0) wj3Var.f).get();
                Resources resources3 = (Resources) ((d7g0) wj3Var.b).j.get();
                c8o.l(resources3);
                d7g0 d7g0Var = (d7g0) wj3Var.b;
                kt91 kt91Var3 = (kt91) d7g0Var.c.get();
                c8o.l(kt91Var3);
                kt91 kt91Var4 = (kt91) d7g0Var.c.get();
                c8o.l(kt91Var4);
                Resources resources4 = (Resources) d7g0Var.j.get();
                c8o.l(resources4);
                q8n q8nVar2 = (q8n) d7g0Var.a.get();
                c8o.l(q8nVar2);
                return new yu3(w6h1Var, pwoVar2, resources3, kt91Var3, new dlg1(kt91Var4, resources4, q8nVar2));
        }
    }
}
