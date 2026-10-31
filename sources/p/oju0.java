package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oju0 implements tju0 {
    public final String a;
    public final String b;

    public oju0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oju0)) {
            return false;
        }
        oju0 oju0Var = (oju0) obj;
        return u890.j(this.a, oju0Var.a) && u890.j(this.b, oju0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
