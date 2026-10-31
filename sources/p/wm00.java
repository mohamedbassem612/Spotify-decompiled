package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wm00 {
    public final String a;
    public final String b;

    public wm00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm00)) {
            return false;
        }
        wm00 wm00Var = (wm00) obj;
        return this.a.equals(wm00Var.a) && this.b.equals(wm00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
