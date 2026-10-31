package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f6x {
    public final String a;
    public final String b;
    public final d8r0 c;
    public final sio1 d;

    public f6x(String str, String str2, d8r0 d8r0Var, sio1 sio1Var) {
        this.a = str;
        this.b = str2;
        this.c = d8r0Var;
        this.d = sio1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6x)) {
            return false;
        }
        f6x f6xVar = (f6x) obj;
        return this.a.equals(f6xVar.a) && this.b.equals(f6xVar.b) && this.c.equals(f6xVar.c) && this.d.equals(f6xVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + hrt.i(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
