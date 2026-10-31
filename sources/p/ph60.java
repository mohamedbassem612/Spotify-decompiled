package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ph60 implements vh60 {
    public final zzm a;

    public ph60(zzm zzmVar) {
        this.a = zzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph60) && u890.j(this.a, ((ph60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
