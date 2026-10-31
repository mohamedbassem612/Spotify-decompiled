package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ky8 {
    public final int a;
    public final Throwable b;

    public ky8(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ky8) {
            ky8 ky8Var = (ky8) obj;
            if (this.a == ky8Var.a) {
                Throwable th = ky8Var.b;
                Throwable th2 = this.b;
                if (th2 != null ? th2.equals(th) : th == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ i;
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
