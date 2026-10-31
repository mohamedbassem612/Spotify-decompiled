package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fk71 extends jk71 {
    public final boolean a;

    public fk71(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk71) && this.a == ((fk71) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
