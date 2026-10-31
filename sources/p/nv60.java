package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nv60 implements ov60 {
    public final String a;

    public nv60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nv60) && this.a.equals(((nv60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
