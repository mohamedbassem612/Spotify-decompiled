package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class us01 extends vs01 {
    public final String a;

    public us01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us01) && this.a.equals(((us01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
