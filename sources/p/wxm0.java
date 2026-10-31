package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wxm0 {
    public final boolean a;
    public final vu30 b;

    public wxm0(boolean z, vu30 vu30Var) {
        this.a = z;
        this.b = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxm0)) {
            return false;
        }
        wxm0 wxm0Var = (wxm0) obj;
        return this.a == wxm0Var.a && this.b.equals(wxm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
