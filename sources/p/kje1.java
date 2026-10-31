package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kje1 implements oje1 {
    public final String a;

    public kje1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kje1) && this.a.equals(((kje1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
