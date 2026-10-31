package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ho41 implements Function, hui1 {
    public int a;

    public ho41(byte b, int i, int i2) {
        switch (b) {
            case 5:
                this.a = (i2 & 2) != 0 ? 0 : i;
                break;
            default:
                this.a = (i2 & 1) != 0 ? 0 : i;
                break;
        }
    }

    public int a() {
        return this.a;
    }

    public Object apply(Object obj) {
        tvw0 tvw0Var = (tvw0) obj;
        return new fw41(this.a, tvw0Var.b, tvw0Var.c, tvw0Var.a, tvw0Var.d, tvw0Var.e, tvw0Var.f);
    }

    public boolean c(int i) {
        return (this.a & i) == i;
    }

    public boolean d() {
        return !(!c(32) || c(64) || c(128)) || c(64);
    }

    public int f() {
        return 0;
    }

    public int h() {
        return this.a;
    }

    public boolean i() {
        return d() || c(128);
    }

    public oe5 n(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return j < ((long) this.a) * 1000000 ? oe5Var : oe5Var2;
    }

    public oe5 g(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return oe5Var3;
    }
}
