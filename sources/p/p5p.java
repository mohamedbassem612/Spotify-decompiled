package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p5p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ p5p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final mxf0 a(c9n c9nVar, String str, String str2) {
        byte b = this.a;
        tsq tsqVar = this.b;
        switch (b) {
            case 0:
                k42 k42Var = (k42) ((b2p) tsqVar).c;
                Context context = (Context) ((lof) k42Var.a).a.get();
                c8o.l(context);
                r35 r35Var = (r35) ((lof) k42Var.a).e.get();
                c8o.l(r35Var);
                jjz jjzVar = (jjz) ((lof) k42Var.a).g.get();
                c8o.l(jjzVar);
                return new mxf0(context, str, str2, r35Var, c9nVar, jjzVar, (pd71) ((jly0) k42Var.h).get());
            default:
                byp bypVar = (byp) tsqVar.c;
                Context context2 = (Context) ((fwg1) bypVar.c).a.a;
                c8o.l(context2);
                r35 r35Var2 = (r35) ((fwg1) bypVar.c).c.get();
                c8o.l(r35Var2);
                jjz jjzVar2 = (jjz) ((fwg1) bypVar.c).e.get();
                c8o.l(jjzVar2);
                return new mxf0(context2, str, str2, r35Var2, c9nVar, jjzVar2, (pd71) ((jly0) bypVar.a).get());
        }
    }
}
