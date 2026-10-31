package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lxw0 implements mxw0 {
    public final String a;

    public lxw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxw0) && this.a.equals(((lxw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
