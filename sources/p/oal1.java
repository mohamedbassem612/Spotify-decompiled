package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oal1 extends qal1 {
    public final String a;

    public oal1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oal1) && this.a.equals(((oal1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
