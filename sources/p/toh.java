package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class toh implements iph {
    public final Exception a;
    public final String b;
    public final String c;

    public toh(Exception exc, String str, String str2) {
        this.a = exc;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toh)) {
            return false;
        }
        toh tohVar = (toh) obj;
        return this.a.equals(tohVar.a) && this.b.equals(tohVar.b) && u890.j(this.c, tohVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
