package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class el11 implements fl11 {
    public final String a;

    public el11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el11) && this.a.equals(((el11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
