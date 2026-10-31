package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f1c1 implements h1c1 {
    public final gax a;

    public f1c1(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1c1) && this.a.equals(((f1c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
