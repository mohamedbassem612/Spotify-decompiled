package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xsu implements btu {
    public final p0v a;

    public xsu(p0v p0vVar) {
        this.a = p0vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsu) && this.a.equals(((xsu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
