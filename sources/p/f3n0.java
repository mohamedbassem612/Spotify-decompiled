package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class f3n0 {
    public static final e3n0 Companion = new e3n0();
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof f3n0) {
            return u890.j(this.a, ((f3n0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("MusicGenre(key=", this.a, ")");
    }
}
