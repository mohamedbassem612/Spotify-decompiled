package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k8k0 implements l8k0 {
    public final cio a;

    public k8k0(cio cioVar) {
        this.a = cioVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8k0) && this.a.equals(((k8k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
