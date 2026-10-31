package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class blh implements hlh {
    public final pkh a;
    public final int b;
    public final boolean c;

    public blh(int i, pkh pkhVar, boolean z) {
        this.a = pkhVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blh)) {
            return false;
        }
        blh blhVar = (blh) obj;
        return this.a.equals(blhVar.a) && this.b == blhVar.b && this.c == blhVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
