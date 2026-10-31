package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mfn implements ugn {
    public final String a;

    public mfn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfn) && this.a.equals(((mfn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
