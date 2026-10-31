package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p0l1 extends f1l1 {
    public final String a;

    public p0l1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0l1) && u890.j(this.a, ((p0l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
