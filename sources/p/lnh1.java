package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lnh1 {
    public final String a;

    public lnh1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnh1) && u890.j(this.a, ((lnh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
