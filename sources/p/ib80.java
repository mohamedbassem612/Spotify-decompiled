package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ib80 implements jb80 {
    public final String a;
    public final String b;

    public ib80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib80)) {
            return false;
        }
        ib80 ib80Var = (ib80) obj;
        return this.a.equals(ib80Var.a) && this.b.equals(ib80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
