package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lff1 {
    public final String a;

    public lff1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lff1) && u890.j(this.a, ((lff1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
