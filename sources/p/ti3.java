package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ti3 extends vi3 {
    public final String a;
    public final String b;

    public ti3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti3)) {
            return false;
        }
        ti3 ti3Var = (ti3) obj;
        return this.a.equals(ti3Var.a) && this.b.equals(ti3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
