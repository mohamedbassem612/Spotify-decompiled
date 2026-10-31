package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yv01 implements zv01 {
    public final boolean a;

    public yv01(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv01)) {
            return false;
        }
        yv01 yv01Var = (yv01) obj;
        x47 x47Var = x47.a;
        return x47Var.equals(x47Var) && this.a == yv01Var.a;
    }

    public final boolean h() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + 998809616;
    }

    public final x47 i() {
        return x47.a;
    }
}
