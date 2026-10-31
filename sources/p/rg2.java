package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rg2 implements sg2 {
    public final String a;

    public rg2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg2) && this.a.equals(((rg2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
