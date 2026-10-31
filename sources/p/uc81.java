package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uc81 extends cd81 {
    public final boolean a;
    public final boolean b;

    public uc81(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc81)) {
            return false;
        }
        uc81 uc81Var = (uc81) obj;
        return this.a == uc81Var.a && this.b == uc81Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
