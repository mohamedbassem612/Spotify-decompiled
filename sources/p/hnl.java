package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hnl {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final u601 c;
    public final u601 d;
    public final /* synthetic */ dg30 e;

    public hnl(ah4 ah4Var, t2p0 t2p0Var, n2p0 n2p0Var, dg30 dg30Var, pqq0 pqq0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.e = dg30Var;
                this.b = mth1.F(ah4Var.a(), t2p0Var, new gmj(pqq0Var, this, (byte) 20));
                this.c = new jqg0(n2p0Var.a(), vll.P0);
                this.d = new jqg0(n2p0Var.a(), vll.N0);
                break;
            default:
                this.e = dg30Var;
                this.b = mth1.F(ah4Var.a(), t2p0Var, new gmj(pqq0Var, this, (byte) 19));
                this.c = new jqg0(n2p0Var.a(), vll.O0);
                this.d = new jqg0(n2p0Var.a(), vll.Z);
                break;
        }
    }

    public final boolean a() {
        boolean zI;
        switch (this.a) {
            case 0:
                zI = i();
                break;
            case 1:
                zI = g();
                break;
            default:
                zI = h();
                break;
        }
        return !zI;
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    public final boolean c() {
        boolean z;
        switch (this.a) {
            case 0:
                z = this.b;
                break;
            case 1:
                z = this.b;
                break;
            default:
                return (h() || this.b) ? false : true;
        }
        return !z;
    }

    public final u601 d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    public final boolean e() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    public boolean g() {
        dg30 dg30Var = this.e;
        return xoi1.b(dg30Var) || bqn1.z(dg30Var);
    }

    public boolean h() {
        dg30 dg30Var = this.e;
        return xoi1.b(dg30Var) || bqn1.z(dg30Var);
    }

    public boolean i() {
        dg30 dg30Var = this.e;
        return xoi1.b(dg30Var) || bqn1.z(dg30Var);
    }

    public hnl(ah4 ah4Var, t2p0 t2p0Var, dg30 dg30Var, pqq0 pqq0Var) {
        this.a = (byte) 2;
        this.e = dg30Var;
        this.b = mth1.F(ah4Var.a(), t2p0Var, new gmj(pqq0Var, this, (byte) 18));
        this.c = new ien0(bq00.a);
        this.d = new ien0(weu.b);
    }
}
