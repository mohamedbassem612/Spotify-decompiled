package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iik1 implements xpx0 {
    public final String a;

    public iik1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iik1) && u890.j(this.a, ((iik1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
