package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kzc1 implements lzc1 {
    public final String a;

    public kzc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzc1) && u890.j(this.a, ((kzc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
