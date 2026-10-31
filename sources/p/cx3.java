package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cx3 extends ex3 {
    public final kza0 a;

    public cx3(kza0 kza0Var) {
        this.a = kza0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx3) && this.a == ((cx3) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
