package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cvi1 extends dvi1 {
    public final String a;

    public cvi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvi1) && this.a.equals(((cvi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
