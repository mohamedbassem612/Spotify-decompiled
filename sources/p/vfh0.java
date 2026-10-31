package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vfh0 implements afh0 {
    public final /* synthetic */ byte a;
    public final afh0 b;
    public final int c;
    public final int d;

    public /* synthetic */ vfh0(afh0 afh0Var, int i, int i2, byte b) {
        this.a = b;
        this.b = afh0Var;
        this.c = i;
        this.d = i2;
    }

    public final int C(int i) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.C(i);
    }

    public final q5t0 H(long j) {
        switch (this.a) {
            case 0:
                afh0 afh0Var = this.b;
                int i = this.d;
                int i2 = this.c;
                if (i == 1) {
                    return new wfh0((byte) 0, i2 == 2 ? afh0Var.C(hjl.h(j)) : afh0Var.w(hjl.h(j)), hjl.d(j) ? hjl.h(j) : 32767);
                }
                return new wfh0((byte) 0, hjl.e(j) ? hjl.i(j) : 32767, i2 == 2 ? afh0Var.d(hjl.i(j)) : afh0Var.n(hjl.i(j)));
            default:
                afh0 afh0Var2 = this.b;
                int i3 = this.d;
                int i4 = this.c;
                if (i3 == 1) {
                    return new wfh0((byte) 1, i4 == 2 ? afh0Var2.C(hjl.h(j)) : afh0Var2.w(hjl.h(j)), hjl.d(j) ? hjl.h(j) : 32767);
                }
                return new wfh0((byte) 1, hjl.e(j) ? hjl.i(j) : 32767, i4 == 2 ? afh0Var2.d(hjl.i(j)) : afh0Var2.n(hjl.i(j)));
        }
    }

    public final int d(int i) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.d(i);
    }

    public final Object g() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.g();
    }

    public final int n(int i) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.n(i);
    }

    public final int w(int i) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.w(i);
    }
}
