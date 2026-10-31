package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ov10 implements rv10 {
    public final String a;
    public final String b;

    public ov10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov10)) {
            return false;
        }
        ov10 ov10Var = (ov10) obj;
        return this.a.equals(ov10Var.a) && u890.j(this.b, ov10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
