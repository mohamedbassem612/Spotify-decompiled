package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xo91 extends yo91 {
    public final String a;

    public xo91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo91) && u890.j(this.a, ((xo91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
