package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bav implements cav {
    public final String a;
    public final String b;

    public bav(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bav)) {
            return false;
        }
        bav bavVar = (bav) obj;
        return u890.j(this.a, bavVar.a) && u890.j(this.b, bavVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
