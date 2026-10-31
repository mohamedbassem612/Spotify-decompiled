package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uwk implements fxk {
    public final String a;
    public final qxk b;
    public final c380 c;
    public final String d;

    public uwk(String str, qxk qxkVar, c380 c380Var, String str2) {
        this.a = str;
        this.b = qxkVar;
        this.c = c380Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwk)) {
            return false;
        }
        uwk uwkVar = (uwk) obj;
        return u890.j(this.a, uwkVar.a) && this.b.equals(uwkVar.b) && this.c.equals(uwkVar.c) && u890.j(this.d, uwkVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kk0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
