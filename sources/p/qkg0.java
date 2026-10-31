package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qkg0 extends tkg0 {
    public final hkz a;

    public qkg0(hkz hkzVar) {
        this.a = hkzVar;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qkg0) && this.a.equals(((qkg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
