package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ku60 extends ru60 {
    public final vr60 a;

    public ku60(vr60 vr60Var) {
        this.a = vr60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku60) && this.a.equals(((ku60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
