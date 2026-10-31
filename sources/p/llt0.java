package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class llt0 implements nlt0 {
    public final String a;

    public llt0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof llt0) && this.a.equals(((llt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
