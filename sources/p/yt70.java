package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yt70 implements l0i {
    public final au70 a;

    public yt70(au70 au70Var) {
        this.a = au70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt70) && this.a.equals(((yt70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
