package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rs9 {
    public final String a;
    public final boolean b;

    public rs9(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs9)) {
            return false;
        }
        rs9 rs9Var = (rs9) obj;
        return u890.j(this.a, rs9Var.a) && this.b == rs9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
