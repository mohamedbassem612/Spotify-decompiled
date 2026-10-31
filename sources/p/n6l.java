package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n6l implements t6l {
    public final zfr a;

    public n6l(zfr zfrVar) {
        this.a = zfrVar;
    }

    public final zfr a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6l) && this.a == ((n6l) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
