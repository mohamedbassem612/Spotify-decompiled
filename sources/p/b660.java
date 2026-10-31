package p;

import android.util.Pair;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b660 implements ec10 {
    public final /* synthetic */ byte a;
    public final j191 b;
    public gc10 c;
    public ec10 d;
    public Pair e;
    public final ec10 f;

    public b660(int i, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new j191(65496, 2, "image/jpeg");
                this.f = (i & 1) == 0 ? new lfa0() : null;
                break;
            default:
                this.b = new j191(-1, -1, "image/heif");
                this.f = (i & 1) != 0 ? null : new a660();
                break;
        }
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        switch (this.a) {
            case 0:
                ec10 ec10Var = this.d;
                if (ec10Var == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                } else {
                    ec10Var.a(j, j2);
                }
                break;
            default:
                ec10 ec10Var2 = this.d;
                if (ec10Var2 == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                } else {
                    ec10Var2.a(j, j2);
                }
                break;
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        byte b = this.a;
        j191 j191Var = this.b;
        ec10 ec10Var = this.f;
        switch (b) {
            case 0:
                this.c = gc10Var;
                if (((a660) ec10Var) == null) {
                    this.d = j191Var;
                    j191Var.b(gc10Var);
                }
                break;
            default:
                this.c = gc10Var;
                if (((lfa0) ec10Var) == null) {
                    this.d = j191Var;
                    j191Var.b(gc10Var);
                }
                break;
        }
    }

    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) {
        byte b = this.a;
        ec10 ec10Var = this.b;
        ec10 ec10Var2 = this.f;
        switch (b) {
            case 0:
                ec10 ec10Var3 = this.d;
                if (ec10Var3 == null) {
                    a660 a660Var = (a660) ec10Var2;
                    dm5.y(ec10Var3 == null);
                    a660Var.getClass();
                    if (eio1.D(fc10Var, true)) {
                        ec10Var = a660Var;
                    }
                    this.d = ec10Var;
                    fc10Var.f();
                    Pair pair = this.e;
                    if (pair != null) {
                        this.d.a(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    ec10 ec10Var4 = this.d;
                    gc10 gc10Var = this.c;
                    gc10Var.getClass();
                    ec10Var4.b(gc10Var);
                }
                break;
            default:
                ec10 ec10Var5 = this.d;
                if (ec10Var5 == null) {
                    lfa0 lfa0Var = (lfa0) ec10Var2;
                    dm5.y(ec10Var5 == null);
                    lfa0Var.getClass();
                    if (lfa0Var.d(fc10Var)) {
                        ec10Var = lfa0Var;
                    }
                    this.d = ec10Var;
                    fc10Var.f();
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        this.d.a(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    ec10 ec10Var6 = this.d;
                    gc10 gc10Var2 = this.c;
                    gc10Var2.getClass();
                    ec10Var6.b(gc10Var2);
                }
                break;
        }
        return this.d.c(fc10Var, sfv0Var);
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        byte b = this.a;
        ec10 ec10Var = this.f;
        switch (b) {
            case 0:
                if (((a660) ec10Var) != null && eio1.D(fc10Var, true)) {
                    return true;
                }
                ((uyr) fc10Var).f = 0;
                return eio1.D(fc10Var, false);
            default:
                lfa0 lfa0Var = (lfa0) ec10Var;
                if (lfa0Var != null && lfa0Var.d(fc10Var)) {
                    return true;
                }
                ((uyr) fc10Var).f = 0;
                return this.b.d(fc10Var);
        }
    }

    @Override // p.ec10
    public final void release() {
        byte b = this.a;
        ec10 ec10Var = this.f;
        switch (b) {
            case 0:
                a660 a660Var = (a660) ec10Var;
                if (a660Var != null) {
                    a660Var.release();
                }
                break;
            default:
                lfa0 lfa0Var = (lfa0) ec10Var;
                if (lfa0Var != null) {
                    lfa0Var.release();
                }
                break;
        }
    }
}
