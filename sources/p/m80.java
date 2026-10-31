package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m80 implements n80 {
    public final String a;
    public final String b;

    public m80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        return this.a.equals(m80Var.a) && this.b.equals(m80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
