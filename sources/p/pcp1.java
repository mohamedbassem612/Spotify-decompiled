package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pcp1 implements mbp1 {
    public final aob0 a;
    public final kbp1 b;

    public pcp1(Context context, kbp1 kbp1Var) {
        this.b = kbp1Var;
        xhc xhcVar = xhc.e;
        jog1.b(context);
        hog1 hog1VarC = jog1.a().c(xhcVar);
        if (xhc.d.contains(new bbx("json"))) {
            new aob0(new gwo1(hog1VarC, (byte) 2));
        }
        this.a = new aob0(new gwo1(hog1VarC, (byte) 3));
    }

    @Override // p.mbp1
    public final void a(jcp1 jcp1Var) {
        this.b.getClass();
        ((iog1) this.a.get()).b(jcp1Var.a ? r09.a(jcp1Var.a()) : new r09((Integer) null, jcp1Var.a(), xnw0.b));
    }
}
