package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class drl implements grl {
    public final String a;

    public drl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drl) && this.a.equals(((drl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
