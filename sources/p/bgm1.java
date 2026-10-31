package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bgm1 {
    public final String a;
    public final String b;

    public bgm1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgm1)) {
            return false;
        }
        bgm1 bgm1Var = (bgm1) obj;
        return this.a.equals(bgm1Var.a) && this.b.equals(bgm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
