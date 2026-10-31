package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class loa0 implements qoa0 {
    public final String a;

    public loa0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof loa0) && u890.j(this.a, ((loa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
