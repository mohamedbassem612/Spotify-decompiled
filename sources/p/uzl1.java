package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uzl1 implements g0m1 {
    public final String a;

    public uzl1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzl1) && this.a.equals(((uzl1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
