package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hxd0 implements rxd0 {
    public final String a;

    public hxd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxd0) && this.a.equals(((hxd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
