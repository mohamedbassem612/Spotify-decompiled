package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ac81 {
    public final String a;
    public final String b;
    public final String c;

    public ac81(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac81)) {
            return false;
        }
        ac81 ac81Var = (ac81) obj;
        return this.a.equals(ac81Var.a) && this.b.equals(ac81Var.b) && this.c.equals(ac81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
