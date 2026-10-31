package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jv51 {
    public final String a;
    public final aey b;
    public final boolean c;

    public jv51(String str, aey aeyVar, boolean z) {
        this.a = str;
        this.b = aeyVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv51)) {
            return false;
        }
        jv51 jv51Var = (jv51) obj;
        return u890.j(this.a, jv51Var.a) && this.b == jv51Var.b && this.c == jv51Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
