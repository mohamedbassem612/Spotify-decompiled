package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lkx0 implements i0u0, a4l {
    public final dfs a;

    public lkx0(dfs dfsVar) {
        this.a = dfsVar;
    }

    @Override // p.a4l
    public final void a() {
        this.a.b.remove(this);
    }

    @Override // p.a4l
    public final void b() {
        this.a.b.add(this);
    }

    @Override // p.i0u0
    public final String c() {
        return "ProjectedCarPlaybackGrabbingException";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0023 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    @Override // p.i0u0
    public final l650 d(k650 k650Var) {
        boolean z;
        int i;
        kx7 kx7VarB = k650Var.b();
        if (kx7VarB != null) {
            luq0 luq0Var = kx7VarB.d;
            up7 up7Var = kx7VarB.e;
            if (luq0Var != luq0.CAR_PROJECTED) {
                if (luq0Var != luq0.BLUETOOTH) {
                    if (luq0Var == luq0.WIRED) {
                        if (up7Var != null) {
                            i = up7Var.a;
                        } else {
                            i = 0;
                        }
                        if (i == 2) {
                        }
                    }
                    z = false;
                } else {
                    if ((up7Var != null ? up7Var.a : 0) != 2) {
                        if (luq0Var == luq0.WIRED) {
                            if (up7Var != null) {
                                i = up7Var.a;
                            } else {
                                i = 0;
                            }
                            if (i == 2) {
                            }
                        }
                        z = false;
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        boolean z2 = k650Var.c().getType() == f0u.Z;
        if (!z || z2) {
            return l650.c;
        }
        return (k650Var.a() || !k650Var.e()) ? l650.a : l650.b;
    }
}
