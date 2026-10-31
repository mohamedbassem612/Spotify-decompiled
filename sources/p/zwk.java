package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zwk implements fxk {
    public final s781 a;
    public final int b;

    public zwk(s781 s781Var, int i) {
        this.a = s781Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwk)) {
            return false;
        }
        zwk zwkVar = (zwk) obj;
        return this.a.equals(zwkVar.a) && this.b == zwkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
