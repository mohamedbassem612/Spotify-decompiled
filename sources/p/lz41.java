package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lz41 extends q151 {
    public final String a;

    public lz41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz41) && u890.j(this.a, ((lz41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
