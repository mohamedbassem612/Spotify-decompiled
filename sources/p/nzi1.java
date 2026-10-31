package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nzi1 implements pzi1 {
    public final String a;

    public nzi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzi1) && this.a.equals(((nzi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
