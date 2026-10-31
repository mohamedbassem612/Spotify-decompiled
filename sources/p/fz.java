package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fz implements f10 {
    public final String a;

    public fz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz) && this.a.equals(((fz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
