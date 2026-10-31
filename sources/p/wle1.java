package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wle1 implements yle1 {
    public final String a;

    public wle1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wle1) && this.a.equals(((wle1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
