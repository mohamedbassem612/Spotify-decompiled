package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tf81 extends w0h1 {
    public final String d;

    public tf81(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tf81) && this.d.equals(((tf81) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
