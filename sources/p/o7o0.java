package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o7o0 implements k120 {
    public final idd1 a;
    public final idd1 b;
    public final nn61 c;

    public o7o0(Function0 function0) {
        el70 el70Var = new el70((byte) 17);
        n7o0 n7o0Var = n7o0.a;
        this.a = new idd1(function0);
        this.b = new idd1(el70Var);
        this.c = cbp1.p();
    }

    @Override // p.k120
    public final l120 a(Object obj, dqq0 dqq0Var, rf01 rf01Var) {
        j2i1 j2i1Var = (j2i1) obj;
        if (!u890.j(j2i1Var.c, "http") && !u890.j(j2i1Var.c, "https")) {
            return null;
        }
        return new u7o0(j2i1Var.a, dqq0Var, this.a, new idd1(new g030(rf01Var, (byte) 22)), this.b, (qbl) this.c.d(dqq0Var.a));
    }
}
