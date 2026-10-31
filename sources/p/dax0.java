package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dax0 extends yax0 {
    public final String a;

    public dax0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dax0) && u890.j(this.a, ((dax0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
