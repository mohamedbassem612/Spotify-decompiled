package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cyj1 implements eyj1 {
    public final String a;

    public cyj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyj1) && this.a.equals(((cyj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
