package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fyn0 extends bzn1 {
    public final String c;

    public fyn0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyn0) && this.c.equals(((fyn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
