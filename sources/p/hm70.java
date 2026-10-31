package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hm70 implements jm70 {
    public final String a;

    public hm70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm70) && u890.j(this.a, ((hm70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
