package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rrf1 implements srf1 {
    public final String a;

    public rrf1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrf1) && this.a.equals(((rrf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
