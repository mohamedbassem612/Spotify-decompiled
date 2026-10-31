package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o231 extends k331 {
    public final String a;
    public final String b;

    public o231(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o231)) {
            return false;
        }
        o231 o231Var = (o231) obj;
        return u890.j(this.a, o231Var.a) && u890.j(this.b, o231Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
