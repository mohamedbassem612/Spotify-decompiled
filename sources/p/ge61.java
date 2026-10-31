package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ge61 implements ie61 {
    public final j4e a;

    public ge61(j4e j4eVar) {
        this.a = j4eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge61) && this.a.equals(((ge61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
