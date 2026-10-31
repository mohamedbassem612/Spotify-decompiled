package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wr70 {
    public final String a;

    public wr70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr70) && this.a.equals(((wr70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
