package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u300 implements t600 {
    public final wuz a;

    public u300(wuz wuzVar) {
        this.a = wuzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u300) && this.a == ((u300) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
