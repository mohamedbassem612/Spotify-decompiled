package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pho implements tho {
    public final boolean a;
    public final yf b;
    public final boolean c;

    public pho(boolean z, yf yfVar, boolean z2) {
        this.a = z;
        this.b = yfVar;
        this.c = z2;
    }

    public final boolean a() {
        return this.c;
    }

    public final yf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pho)) {
            return false;
        }
        pho phoVar = (pho) obj;
        return this.a == phoVar.a && u890.j(this.b, phoVar.b) && this.c == phoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
