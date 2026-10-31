package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i7r {
    public final String a;
    public final int b;

    public i7r(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7r)) {
            return false;
        }
        i7r i7rVar = (i7r) obj;
        return this.a.equals(i7rVar.a) && this.b == i7rVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
