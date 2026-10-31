package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eu6 extends fu6 {
    public final String a;

    public eu6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eu6) && this.a.equals(((eu6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
