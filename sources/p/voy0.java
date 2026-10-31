package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class voy0 implements yoy0 {
    public final int a;

    public voy0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof voy0) && this.a == ((voy0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
