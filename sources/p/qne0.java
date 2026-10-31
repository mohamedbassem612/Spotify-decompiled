package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qne0 implements xpx0 {
    public final String a;

    public qne0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qne0) && this.a.equals(((qne0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
