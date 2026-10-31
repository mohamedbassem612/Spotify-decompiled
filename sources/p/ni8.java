package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ni8 {
    public final di8 a;

    public ni8(di8 di8Var) {
        this.a = di8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni8) && u890.j(this.a, ((ni8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
