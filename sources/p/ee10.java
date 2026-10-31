package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ee10 implements fe10 {
    public final eww0 a;

    public ee10(eww0 eww0Var) {
        this.a = eww0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee10) && this.a.equals(((ee10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
