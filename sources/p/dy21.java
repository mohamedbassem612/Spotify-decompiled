package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dy21 extends jy21 {
    public final String a;

    public dy21(String str) {
        this.a = str;
    }

    public final String a() {
        return "gone";
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dy21) && this.a.equals(((dy21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
