package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zk7 extends bro1 {
    public final String b;
    public final String c;

    public zk7(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk7)) {
            return false;
        }
        zk7 zk7Var = (zk7) obj;
        return this.b.equals(zk7Var.b) && this.c.equals(zk7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String m() {
        return this.c;
    }
}
