package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g0d1 extends fuo1 {
    public final String b;

    public g0d1(String str) {
        this.b = str;
    }

    public final String E() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0d1) && u890.j(this.b, ((g0d1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
