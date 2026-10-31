package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class guh0 {
    public final o3e0 a;

    public guh0(o3e0 o3e0Var) {
        this.a = o3e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof guh0) && this.a == ((guh0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(10) * 31);
    }
}
