package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t7d1 {
    public final String a;
    public final String b;

    public t7d1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7d1)) {
            return false;
        }
        t7d1 t7d1Var = (t7d1) obj;
        return this.a.equals(t7d1Var.a) && this.b.equals(t7d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
