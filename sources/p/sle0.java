package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sle0 extends hme0 {
    public final String a;

    public sle0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sle0) && this.a.equals(((sle0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
