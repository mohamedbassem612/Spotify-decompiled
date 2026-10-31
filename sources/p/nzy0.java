package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nzy0 extends gho1 {
    public final wxm0 d;

    public nzy0(wxm0 wxm0Var) {
        this.d = wxm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzy0) && this.d.equals(((nzy0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
