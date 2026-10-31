package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yhe1 implements aie1 {
    public final String a;

    public yhe1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhe1) && this.a.equals(((yhe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
