package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lx2 {
    public final String a;

    public lx2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lx2) && this.a.equals(((lx2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
