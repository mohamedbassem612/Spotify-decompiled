package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oav {
    public final String a;
    public final long b;
    public final long c;
    public final qd00 d;

    public oav(String str, long j, long j2, qd00 qd00Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = qd00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!oav.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        oav oavVar = (oav) obj;
        return this.d == oavVar.d && u890.j(this.a, oavVar.a) && this.b == oavVar.b && this.c == oavVar.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + (((((this.a.hashCode() * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31);
    }
}
