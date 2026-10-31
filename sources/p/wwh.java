package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wwh implements xwh {
    public final rzh a;

    public wwh(rzh rzhVar) {
        this.a = rzhVar;
    }

    public final rzh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wwh) && this.a.equals(((wwh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
