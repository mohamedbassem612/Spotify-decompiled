package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zew implements kiw {
    public final uvg1 a;

    public zew(uvg1 uvg1Var) {
        this.a = uvg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zew) && u890.j(this.a, ((zew) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
