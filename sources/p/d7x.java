package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d7x implements gfh0 {
    public static final d7x b = new d7x(0);
    public static final ia4 c = new ia4((byte) 8);
    public static final d7x d = new d7x(1);
    public static final d7x e = new d7x(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ d7x(byte b2) {
        this.a = b2;
    }

    @Override // p.gfh0
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return ifh0Var.S(hjl.i(j), hjl.h(j), b7xVar, c);
            case 1:
                return ifh0Var.S(hjl.k(j), hjl.j(j), b7xVar, new pv40((byte) 3));
            default:
                return ifh0Var.S(hjl.g(j) ? hjl.i(j) : 0, hjl.f(j) ? hjl.h(j) : 0, b7xVar, new cix0((byte) 21));
        }
    }
}
