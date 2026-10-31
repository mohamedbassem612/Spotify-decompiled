package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hm21 implements chu {
    public final String a;

    public hm21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm21) && u890.j(this.a, ((hm21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
