package p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class gaa0 extends saa0 {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaa0(faa0 faa0Var) {
        super(true);
        boolean z = true;
        j0(faa0Var);
        Unsafe unsafe = avg.a;
        long j = saa0.b;
        m0g m0gVar = (m0g) unsafe.getObjectVolatile(this, j);
        n0g n0gVar = m0gVar instanceof n0g ? (n0g) m0gVar : null;
        if (n0gVar == null) {
            z = false;
            break;
        }
        saa0 saa0VarJ = n0gVar.j();
        while (!saa0VarJ.c0()) {
            m0g m0gVar2 = (m0g) avg.a.getObjectVolatile(saa0VarJ, j);
            n0g n0gVar2 = m0gVar2 instanceof n0g ? (n0g) m0gVar2 : null;
            if (n0gVar2 == null) {
                z = false;
                break;
            }
            saa0VarJ = n0gVar2.j();
        }
        this.d = z;
    }

    @Override // p.saa0
    public final boolean c0() {
        return this.d;
    }

    @Override // p.saa0
    public final boolean e0() {
        return true;
    }
}
