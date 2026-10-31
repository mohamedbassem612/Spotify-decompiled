package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mxd0 implements rxd0 {
    public final String a;

    public mxd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxd0) && this.a.equals(((mxd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
