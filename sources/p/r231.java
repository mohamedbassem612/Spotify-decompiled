package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r231 extends k331 {
    public final String a;
    public final String b;

    public r231(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r231)) {
            return false;
        }
        r231 r231Var = (r231) obj;
        return u890.j(this.a, r231Var.a) && u890.j(this.b, r231Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
