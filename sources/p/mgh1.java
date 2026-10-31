package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mgh1 {
    public final lgo1 a = lgh1.d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgh1) && this.a.equals(((mgh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(true) * 31);
    }
}
