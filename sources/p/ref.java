package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ref extends zro1 {
    public final ctf b;
    public final boolean c;
    public final boolean d;

    public ref(ctf ctfVar, boolean z, boolean z2) {
        this.b = ctfVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ref)) {
            return false;
        }
        ref refVar = (ref) obj;
        return u890.j(this.b, refVar.b) && this.c == refVar.c && this.d == refVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(this.b.hashCode() * 31, 31, this.c);
    }
}
