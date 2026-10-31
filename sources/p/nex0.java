package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nex0 {
    public final String a;

    public nex0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nex0) && this.a.equals(((nex0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
