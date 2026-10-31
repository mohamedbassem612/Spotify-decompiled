package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dph implements iph {
    public final String a;
    public final Throwable b;

    public dph(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dph)) {
            return false;
        }
        dph dphVar = (dph) obj;
        return u890.j(this.a, dphVar.a) && this.b.equals(dphVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
