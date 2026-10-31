package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mzl implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nzl b;

    public /* synthetic */ mzl(nzl nzlVar, byte b) {
        this.a = b;
        this.b = nzlVar;
    }

    public final void accept(Object obj) {
        tv80 tv80VarH;
        byte b = this.a;
        nzl nzlVar = this.b;
        switch (b) {
            case 0:
                yyl yylVar = (yyl) obj;
                if (nzlVar.e) {
                    tv80VarH = yylVar.d;
                } else {
                    i3h1 i3h1Var = nzlVar.c;
                    String str = yylVar.a;
                    gxs0 gxs0Var = yylVar.b;
                    tv80VarH = i3h1Var.h(str, gxs0Var.b, yylVar.c, gxs0Var);
                }
                ms3 ms3Var = nzlVar.b;
                gxs0 gxs0Var2 = yylVar.b;
                fn31.T(ms3Var.b, (o8n) null, 0, new kv1(!gxs0Var2.d, ms3Var, (qpl) gxs0Var2.c, tv80VarH != null ? new ubc0(tv80VarH) : null, (lnm) null, (byte) 1), 3);
                break;
            case 1:
                czl czlVar = (czl) obj;
                if (!nzlVar.e) {
                    i3h1 i3h1Var2 = nzlVar.c;
                    String str2 = czlVar.a;
                    gxs0 gxs0Var3 = czlVar.b;
                    i3h1Var2.h(str2, gxs0Var3.b, czlVar.c, gxs0Var3);
                }
                break;
            case 2:
                nzlVar.c.b(((bzl) obj).a);
                break;
            case 3:
                dzl dzlVar = (dzl) obj;
                if (!nzlVar.e) {
                    nzlVar.c.f(dzlVar.a, true);
                }
                break;
            default:
                fzl fzlVar = (fzl) obj;
                if (!nzlVar.e) {
                    nzlVar.c.f(fzlVar.a, false);
                }
                break;
        }
    }
}
