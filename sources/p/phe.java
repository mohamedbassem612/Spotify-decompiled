package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class phe extends qhe {
    public final String a;

    public phe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phe) && this.a.equals(((phe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
