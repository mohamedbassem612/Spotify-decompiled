package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qtz0 implements ttz0 {
    public final int a;

    public qtz0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qtz0) && this.a == ((qtz0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
