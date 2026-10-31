package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zpc0 implements aqc0 {
    public final vr41 a;

    public zpc0(vr41 vr41Var) {
        this.a = vr41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zpc0) && this.a.equals(((zpc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
