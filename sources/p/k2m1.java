package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k2m1 extends sgc1 {
    public final String b;

    public k2m1(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2m1) && u890.j(this.b, ((k2m1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
