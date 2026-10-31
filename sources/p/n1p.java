package p;

import android.app.Application;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n1p implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public n1p(r5n1 r5n1Var, jo80 jo80Var) {
        this.a = (byte) 3;
        this.b = jo80Var;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o1p o1pVar = (o1p) obj;
                ym7 ym7Var = o1pVar.a;
                return bvf1.j(new xte0(ym7Var.e()), new w741(ym7Var.b(), false), o1pVar.a(), o1pVar.b(), new em3(ym7Var.d(), ym7Var.c(), (byte) 23));
            case 1:
                wtp wtpVar = (wtp) obj;
                z710 z710VarA = ((e1t0) wtpVar.d).a();
                c8o.l(z710VarA);
                return new ae30(z710VarA, wtpVar.B());
            case 2:
                return new q701((t701) ((v5q) obj).l3.get());
            default:
                return r5n1.a((Application) ((jo80) obj).a);
        }
    }

    public /* synthetic */ n1p(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
