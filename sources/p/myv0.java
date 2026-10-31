package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class myv0 implements ez00 {
    public final String a;
    public final long b;
    public final jby c;

    public myv0(String str, long j, jby jbyVar) {
        this.a = str;
        this.b = j;
        this.c = jbyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myv0)) {
            return false;
        }
        myv0 myv0Var = (myv0) obj;
        return this.a.equals(myv0Var.a) && this.b == myv0Var.b && this.c.equals(myv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
