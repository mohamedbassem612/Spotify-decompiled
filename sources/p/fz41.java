package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fz41 extends q151 {
    public final String a;

    public fz41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz41) && u890.j(this.a, ((fz41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
