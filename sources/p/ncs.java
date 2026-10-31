package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ncs implements t2p0 {
    public final p2p0 a;
    public final Function0 b;
    public final bpb1 c;
    public final xe01 d;

    public ncs(pqq0 pqq0Var, p2p0 p2p0Var, Function0 function0) {
        this.a = p2p0Var;
        this.b = function0;
        bpb1 bpb1VarB = gio1.b((pqq0Var == pqq0.b && ((Boolean) function0.invoke()).booleanValue()) ? s2p0.b : s2p0.a);
        this.c = bpb1VarB;
        this.d = d5p1.h(bpb1VarB);
    }

    @Override // p.t2p0
    public final xe01 a() {
        return this.d;
    }

    @Override // p.t2p0
    public final void b(s2p0 s2p0Var) {
        int iOrdinal = s2p0Var.ordinal();
        p2p0 p2p0Var = this.a;
        bpb1 bpb1Var = this.c;
        if (iOrdinal == 0) {
            bpb1Var.getClass();
            bpb1Var.m((Object) null, s2p0.a);
            p2p0Var.c(yqq0.a, true);
        } else if (iOrdinal != 1) {
            eg.o();
        } else if (((Boolean) this.b.invoke()).booleanValue()) {
            bpb1Var.getClass();
            bpb1Var.m((Object) null, s2p0.b);
            p2p0Var.c(yqq0.b, true);
        }
    }
}
