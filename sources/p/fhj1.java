package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fhj1 extends khj1 {
    public final String a;

    public fhj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhj1) && this.a.equals(((fhj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
