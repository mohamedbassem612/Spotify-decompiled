package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gxd0 implements rxd0 {
    public final String a;

    public gxd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxd0) && this.a.equals(((gxd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
