package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gkz {
    public final Object a;

    public gkz(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkz) && this.a.equals(((gkz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(true) * 31);
    }
}
