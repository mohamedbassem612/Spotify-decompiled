package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class frm0 implements jrm0 {
    public final boolean a;

    public frm0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof frm0) && this.a == ((frm0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
