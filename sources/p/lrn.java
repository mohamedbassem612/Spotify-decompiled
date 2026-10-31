package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lrn implements mrn {
    public final String a;

    public lrn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrn) && this.a.equals(((lrn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
