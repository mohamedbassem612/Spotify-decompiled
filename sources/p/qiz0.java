package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qiz0 implements riz0 {
    public final boolean a;

    public qiz0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qiz0) && this.a == ((qiz0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
