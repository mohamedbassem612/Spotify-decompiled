package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f560 extends j560 {
    public final c560 a;
    public final dam b;
    public final boolean c;

    public f560(c560 c560Var, dam damVar, boolean z) {
        this.a = c560Var;
        this.b = damVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f560)) {
            return false;
        }
        f560 f560Var = (f560) obj;
        return this.a.equals(f560Var.a) && this.b.equals(f560Var.b) && this.c == f560Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
