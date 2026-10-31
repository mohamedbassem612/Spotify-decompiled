package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y1l1 extends j2l1 {
    public final String a;

    public y1l1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1l1) && this.a.equals(((y1l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
