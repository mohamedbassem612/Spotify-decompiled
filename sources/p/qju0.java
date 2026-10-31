package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qju0 implements tju0 {
    public final int a;

    public qju0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qju0) && this.a == ((qju0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
