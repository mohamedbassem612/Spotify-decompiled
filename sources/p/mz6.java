package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mz6 implements h0r0 {
    public final qyj a;
    public final pz6 b;
    public final d0r c;
    public final ynb0 d;
    public final cbr0 e;

    public mz6(p6r0 p6r0Var, qyj qyjVar, pz6 pz6Var, d0r d0rVar, ynb0 ynb0Var) {
        String str = pz6Var.b;
        this.a = qyjVar;
        this.b = pz6Var;
        this.c = d0rVar;
        this.d = ynb0Var;
        List list = pz6Var.d;
        lik1 lik1VarB = !list.isEmpty() ? nik1.J6.b(str) : nik1.I6.b(str);
        boolean zIsEmpty = list.isEmpty();
        String str2 = pz6Var.c;
        String str3 = p6r0Var.c;
        this.e = new cbr0(new dbr0[]{new bn70(p6r0Var, lik1VarB, new nar0(!zIsEmpty ? new brl0(str3, str2, (byte) 9) : new brl0(str3, str2, (byte) 8))), new t1r0(true), new s9h1(12, true, true, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1860995155, new fc3(this, (byte) 1), true));
    }
}
