package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bbr extends ebr {
    public final Object a;

    public bbr(Object obj) {
        this.a = obj;
    }

    @Override // p.ebr
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbr) && this.a.equals(((bbr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
