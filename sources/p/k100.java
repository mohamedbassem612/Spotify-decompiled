package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k100 implements j600 {
    public final b8w a;

    public k100(b8w b8wVar) {
        this.a = b8wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k100) && this.a.equals(((k100) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
