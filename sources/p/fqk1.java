package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fqk1 implements gqk1 {
    public final String a;

    public fqk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqk1) && this.a.equals(((fqk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
