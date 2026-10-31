package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fph implements iph {
    public final String a;

    public fph(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fph) && this.a.equals(((fph) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
