package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v0l1 extends f1l1 {
    public final i3l1 a;
    public final String b;
    public final String c;

    public v0l1(i3l1 i3l1Var, String str, String str2) {
        this.a = i3l1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0l1)) {
            return false;
        }
        v0l1 v0l1Var = (v0l1) obj;
        return this.a.equals(v0l1Var.a) && u890.j(this.b, v0l1Var.b) && u890.j(this.c, v0l1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(-1517667893, 31, this.b);
    }
}
