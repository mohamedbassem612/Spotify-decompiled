package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bgu0 {
    public final String a;
    public final String b;

    public bgu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgu0)) {
            return false;
        }
        bgu0 bgu0Var = (bgu0) obj;
        return u890.j(this.a, bgu0Var.a) && u890.j(this.b, bgu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
