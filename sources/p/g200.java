package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g200 extends g600 {
    public final String a;

    public g200(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g200) && this.a.equals(((g200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
