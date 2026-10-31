package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ivc1 implements xpx0 {
    public final String a;

    public ivc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivc1) && u890.j(this.a, ((ivc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
