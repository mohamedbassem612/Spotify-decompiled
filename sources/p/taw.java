package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class taw {
    public final ww30 a;
    public final boolean b;

    public taw(ww30 ww30Var, boolean z) {
        this.a = ww30Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taw)) {
            return false;
        }
        taw tawVar = (taw) obj;
        return this.a == tawVar.a && this.b == tawVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
