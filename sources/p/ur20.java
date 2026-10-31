package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ur20 {
    public final String a;
    public final f10 b;

    public ur20(String str, f10 f10Var) {
        this.a = str;
        this.b = f10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur20)) {
            return false;
        }
        ur20 ur20Var = (ur20) obj;
        return this.a.equals(ur20Var.a) && this.b.equals(ur20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
