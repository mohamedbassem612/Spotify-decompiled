package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eww extends fww {
    public final di8 a;

    public eww(di8 di8Var) {
        this.a = di8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eww) && this.a.equals(((eww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
