package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eyg {
    public final String a;
    public final String b;
    public final int c;

    public eyg(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyg)) {
            return false;
        }
        eyg eygVar = (eyg) obj;
        return u890.j(this.a, eygVar.a) && u890.j(this.b, eygVar.b) && this.c == eygVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
