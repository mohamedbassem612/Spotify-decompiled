package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dzi1 {
    public final String a;

    public dzi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzi1) && this.a.equals(((dzi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
