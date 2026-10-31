package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q341 extends r341 {
    public final di8 a;

    public q341(di8 di8Var) {
        this.a = di8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q341) && this.a.equals(((q341) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
