package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wg7 {
    public final String a;
    public final String b;

    public wg7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg7)) {
            return false;
        }
        wg7 wg7Var = (wg7) obj;
        return u890.j(this.a, wg7Var.a) && u890.j(this.b, wg7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ wg7() {
        this("", "");
    }
}
