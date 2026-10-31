package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xxe1 extends m87 {
    public final String d;

    public xxe1(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxe1) && this.d.equals(((xxe1) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
