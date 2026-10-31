package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class mc7 implements xpw {
    public final ljm0 a = h7w.B(new rr6(this, 10), (o8n) null, (iu30) null, new v72(this, 24), 6);
    public final ia00 b = n3o1.q(this).a(d27.h, d27.i);
    public final psw c;

    public mc7() {
        j2i j2iVar = new j2i(1453497097, new i43(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    public vu30 e(lc7 lc7Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1211682124);
        x340Var.r(false);
        return null;
    }

    public abstract Object f(kc7 kc7Var);

    public abstract hux g();

    public final mqw getBehavior() {
        return this.a;
    }

    public abstract int h();

    public boolean i(kc7 kc7Var) {
        i iVar = kc7Var.b;
        if (!iVar.h()) {
            return false;
        }
        if (iVar.g() && kc7Var.i) {
            return false;
        }
        if (iVar.b()) {
            return (kc7Var.f || kc7Var.g) ? false : true;
        }
        return true;
    }

    public mr20 j(String str, boolean z) {
        return new huz(Boolean.FALSE, (byte) 10);
    }

    public boolean k(kc7 kc7Var) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final lc7 l(kc7 kc7Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        i iVar = kc7Var.b;
        boolean z6 = kc7Var.h;
        boolean z7 = kc7Var.f;
        boolean z8 = kc7Var.g;
        boolean z9 = kc7Var.i;
        boolean z10 = false;
        ?? r7 = 1;
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            boolean z11 = gVar.f;
            boolean z12 = gVar.i;
            boolean z13 = gVar.Y;
            boolean z14 = gVar.h;
            if (z6 && z11 && ((z7 || z8) && !z12 && !z13 && (!z14 || !z9))) {
                z10 = true;
            }
        }
        if (kc7Var.l == qb7.b || !kc7Var.c.contains(iVar.getUri())) {
            z2 = z10;
            z3 = z2;
        } else {
            z2 = false;
            z3 = true;
        }
        boolean zI = i(kc7Var);
        if (ihc1.y0(iVar.a()) || kc7Var.j) {
            z4 = z2;
            z5 = z4;
        } else {
            z4 = z2;
            z5 = true;
        }
        if (z10 || k(kc7Var)) {
            z4 = true;
        }
        if (!iVar.g()) {
            r7 = iVar.b() ? 2 : z4;
        }
        new lc7(iVar, z3, zI, z5, z4, z10, (int) r7, kc7Var.e, f(kc7Var), z);
        return r2;
    }

    public j2i m(lc7 lc7Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1065868492);
        j2i j2iVarR = apo.r(-52981001, new cc8(lc7Var, (byte) 3), x340Var);
        x340Var.r(false);
        return j2iVarR;
    }

    public vu30 n(lc7 lc7Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(2358677);
        x340Var.r(false);
        return null;
    }
}
