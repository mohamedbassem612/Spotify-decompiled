package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tl1 implements vl1 {
    public final String a;

    public tl1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl1) && this.a.equals(((tl1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
