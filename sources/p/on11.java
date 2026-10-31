package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class on11 extends pn11 {
    public final String a;

    public on11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof on11) && this.a.equals(((on11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
