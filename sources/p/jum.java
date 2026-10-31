package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jum {
    public final tjn a;
    public final Throwable b;

    public jum(tjn tjnVar, Throwable th) {
        this.a = tjnVar;
        this.b = th;
    }

    public final Throwable a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jum)) {
            return false;
        }
        jum jumVar = (jum) obj;
        return u890.j(this.a, jumVar.a) && this.b.equals(jumVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
