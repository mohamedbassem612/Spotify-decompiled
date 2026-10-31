package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class td50 extends yon1 {
    public final String d;

    public td50(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td50) && this.d.equals(((td50) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
