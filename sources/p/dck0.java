package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dck0 implements qck0 {
    public final String a;

    public dck0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dck0) && this.a.equals(((dck0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
