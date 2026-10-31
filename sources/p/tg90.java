package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tg90 {
    public final String a;
    public final String b;

    public tg90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg90)) {
            return false;
        }
        tg90 tg90Var = (tg90) obj;
        return u890.j(this.a, tg90Var.a) && this.b.equals(tg90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
