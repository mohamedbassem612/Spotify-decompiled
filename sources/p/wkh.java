package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wkh implements hlh {
    public final pkh a;
    public final int b;
    public final boolean c;

    public wkh(int i, pkh pkhVar, boolean z) {
        this.a = pkhVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkh)) {
            return false;
        }
        wkh wkhVar = (wkh) obj;
        return this.a.equals(wkhVar.a) && this.b == wkhVar.b && this.c == wkhVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
