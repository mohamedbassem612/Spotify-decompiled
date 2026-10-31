package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f6d {
    public final String a;

    public f6d(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6d) && this.a.equals(((f6d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
