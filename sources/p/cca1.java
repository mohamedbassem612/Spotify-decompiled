package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cca1 implements dca1 {
    public final String a;

    public cca1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cca1) && this.a.equals(((cca1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
