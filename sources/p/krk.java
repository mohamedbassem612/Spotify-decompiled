package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class krk {
    public final String a;
    public final x360 b;
    public final c380 c;

    public krk(String str, x360 x360Var, c380 c380Var) {
        this.a = str;
        this.b = x360Var;
        this.c = c380Var;
    }

    public final c380 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krk)) {
            return false;
        }
        krk krkVar = (krk) obj;
        return this.a.equals(krkVar.a) && u890.j(this.b, krkVar.b) && u890.j(this.c, krkVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return this.c.hashCode() + ((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31);
    }
}
