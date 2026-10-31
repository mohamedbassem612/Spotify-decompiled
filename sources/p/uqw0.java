package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uqw0 implements brw0 {
    public final ivf a;

    public uqw0(ivf ivfVar) {
        this.a = ivfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqw0) && this.a.equals(((uqw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
