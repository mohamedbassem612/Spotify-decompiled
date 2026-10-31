package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f2k1 {
    public final String a;

    public f2k1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2k1) && this.a.equals(((f2k1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
