package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class la1 extends wa1 {
    public final String a;

    public la1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la1) && this.a.equals(((la1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
