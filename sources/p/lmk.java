package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lmk implements omk {
    public final String a;

    public lmk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmk) && u890.j(this.a, ((lmk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
