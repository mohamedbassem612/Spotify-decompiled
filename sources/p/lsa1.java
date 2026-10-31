package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lsa1 implements dta1 {
    public final boolean a;

    public lsa1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsa1) && this.a == ((lsa1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
