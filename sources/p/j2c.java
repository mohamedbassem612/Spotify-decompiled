package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j2c extends x2g0 {
    public final String e;

    public j2c(String str) {
        this.e = str;
    }

    public final String C() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2c) && this.e.equals(((j2c) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
