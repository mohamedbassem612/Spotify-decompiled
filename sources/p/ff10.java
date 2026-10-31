package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ff10 extends if10 {
    public final String a;

    public ff10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff10) && this.a.equals(((ff10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
