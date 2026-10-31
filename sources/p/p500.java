package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p500 implements a700 {
    public final String a;

    public p500(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p500) && u890.j(this.a, ((p500) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
