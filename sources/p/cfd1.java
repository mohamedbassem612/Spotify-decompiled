package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cfd1 implements efd1 {
    public final nsn a;

    public cfd1(nsn nsnVar) {
        this.a = nsnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfd1) && this.a.equals(((cfd1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
