package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hvd0 {
    public final String a;
    public final String b;

    public hvd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvd0)) {
            return false;
        }
        hvd0 hvd0Var = (hvd0) obj;
        return this.a.equals(hvd0Var.a) && this.b.equals(hvd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
