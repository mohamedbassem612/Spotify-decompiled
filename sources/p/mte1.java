package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mte1 {
    public final String a;

    public mte1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mte1) && this.a.equals(((mte1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
