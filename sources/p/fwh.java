package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fwh implements hwh {
    public final String a;

    public fwh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwh) && this.a.equals(((fwh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
