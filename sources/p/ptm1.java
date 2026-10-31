package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ptm1 extends rtm1 {
    public final String a;

    public ptm1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ptm1) && this.a.equals(((ptm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
