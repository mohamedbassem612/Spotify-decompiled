package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rpw {
    public final String a;
    public final String b;

    public rpw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpw)) {
            return false;
        }
        rpw rpwVar = (rpw) obj;
        return u890.j(this.a, rpwVar.a) && u890.j(this.b, rpwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
