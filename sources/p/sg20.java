package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sg20 extends vg20 {
    public final String a;
    public final boolean b;

    public sg20(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg20)) {
            return false;
        }
        sg20 sg20Var = (sg20) obj;
        return this.a.equals(sg20Var.a) && this.b == sg20Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
