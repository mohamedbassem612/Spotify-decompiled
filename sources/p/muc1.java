package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class muc1 {
    public final vvc1 a;
    public final esa1 b;
    public final llm c;
    public final bpb1 d;

    public muc1(vvc1 vvc1Var, esa1 esa1Var, q8n q8nVar) {
        this.a = vvc1Var;
        this.b = esa1Var;
        j0d1 j0d1VarB = guo1.B();
        p8n p8nVar = q8n.b;
        this.c = smo1.e(ha71.A(j0d1VarB, q8nVar.M(1)));
        this.d = gio1.b(b7x.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(kuc1 kuc1Var, nfu nfuVar) throws NoWhenBranchMatchedException {
        String str;
        String strE = kuc1Var.c().e();
        String strA = kuc1Var.b().b().a();
        String strE2 = kuc1Var.b().a().e();
        if (u890.j(nfuVar, ifu.a)) {
            str = "TIMEOUT";
        } else if (u890.j(nfuVar, dfu.a)) {
            str = "DEVICE_UNAVAILABLE";
        } else if (u890.j(nfuVar, kfu.a)) {
            str = "USER";
        } else if (u890.j(nfuVar, hfu.a)) {
            str = "REPLACED";
        } else if (u890.j(nfuVar, ffu.a)) {
            str = "ERROR";
        } else if (u890.j(nfuVar, lfu.a)) {
            str = "WITHDRAWN";
        } else {
            if (!u890.j(nfuVar, jfu.a)) {
                eg.o();
                return;
            }
            str = "UNKNOWN";
        }
        this.b.u(kuc1Var.a() == 1 ? new qvc1(strE, strA, strE2, str) : new ovc1(strE, strA, strE2, str));
    }
}
