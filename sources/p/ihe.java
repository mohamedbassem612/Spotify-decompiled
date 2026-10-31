package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ihe implements flb {
    public final String a;

    public ihe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihe) && this.a.equals(((ihe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
