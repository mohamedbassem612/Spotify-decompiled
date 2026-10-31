package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ju {
    public final ev a;
    public final boolean b;

    public ju(ev evVar, boolean z) {
        this.a = evVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju)) {
            return false;
        }
        ju juVar = (ju) obj;
        return u890.j(this.a, juVar.a) && this.b == juVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
