package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xhy {
    public final why a;
    public final boolean b;

    public xhy(why whyVar, boolean z) {
        this.a = whyVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhy)) {
            return false;
        }
        xhy xhyVar = (xhy) obj;
        return this.a.equals(xhyVar.a) && this.b == xhyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
