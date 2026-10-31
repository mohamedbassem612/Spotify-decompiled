package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m3d0 {
    public final String a;
    public final boolean b;

    public m3d0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3d0)) {
            return false;
        }
        m3d0 m3d0Var = (m3d0) obj;
        return this.a.equals(m3d0Var.a) && this.b == m3d0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
