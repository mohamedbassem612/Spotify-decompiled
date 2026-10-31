package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y1g1 {
    public final String a;

    public y1g1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1g1) && this.a.equals(((y1g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
