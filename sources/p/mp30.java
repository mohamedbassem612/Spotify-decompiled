package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mp30 {
    public final String a;

    public mp30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp30) && this.a.equals(((mp30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
