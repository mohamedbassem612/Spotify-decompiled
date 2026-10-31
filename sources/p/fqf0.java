package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fqf0 implements gqf0 {
    public final String a;

    public fqf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqf0) && this.a.equals(((fqf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
