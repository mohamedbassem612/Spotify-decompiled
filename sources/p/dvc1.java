package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dvc1 implements evc1 {
    public final l7y a;

    public dvc1(l7y l7yVar) {
        this.a = l7yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvc1) && this.a.equals(((dvc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
