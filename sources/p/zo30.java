package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zo30 {
    public final String a;
    public final String b;
    public final String c;

    public zo30(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo30)) {
            return false;
        }
        zo30 zo30Var = (zo30) obj;
        return this.a.equals(zo30Var.a) && this.b.equals(zo30Var.b) && this.c.equals(zo30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
