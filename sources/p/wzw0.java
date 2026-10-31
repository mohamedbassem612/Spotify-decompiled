package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wzw0 {
    public static final wzw0 c = new wzw0(false, false);
    public final boolean a;
    public final boolean b;

    public wzw0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzw0)) {
            return false;
        }
        wzw0 wzw0Var = (wzw0) obj;
        return this.a == wzw0Var.a && this.b == wzw0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
