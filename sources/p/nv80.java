package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nv80 extends lm5 {
    public final String d;

    public nv80(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nv80) && this.d.equals(((nv80) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
