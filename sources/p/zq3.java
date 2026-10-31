package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zq3 extends hr3 {
    public final tv80 a;

    public zq3(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq3) && this.a.equals(((zq3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
