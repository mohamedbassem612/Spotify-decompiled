package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gga {
    public final Object a;
    public final Object b;

    public gga(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gga)) {
            return false;
        }
        gga ggaVar = (gga) obj;
        return u890.j(this.a, ggaVar.a) && this.b.equals(ggaVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
