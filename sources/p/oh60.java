package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oh60 implements vh60 {
    public final zzm a;

    public oh60(zzm zzmVar) {
        this.a = zzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh60) && u890.j(this.a, ((oh60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
