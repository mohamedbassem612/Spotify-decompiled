package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ipn0 extends zpn1 {
    public final String c;

    public ipn0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipn0) && u890.j(this.c, ((ipn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String z() {
        return this.c;
    }
}
