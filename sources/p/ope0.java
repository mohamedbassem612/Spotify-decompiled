package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ope0 extends spe0 {
    public final String a;
    public final boolean b;

    public ope0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ope0)) {
            return false;
        }
        ope0 ope0Var = (ope0) obj;
        return this.a.equals(ope0Var.a) && this.b == ope0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
