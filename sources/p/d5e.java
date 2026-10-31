package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d5e extends j5e {
    public final u8e a;
    public final int b;

    public d5e(u8e u8eVar, int i) {
        this.a = u8eVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5e)) {
            return false;
        }
        d5e d5eVar = (d5e) obj;
        return u890.j(this.a, d5eVar.a) && this.b == d5eVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
