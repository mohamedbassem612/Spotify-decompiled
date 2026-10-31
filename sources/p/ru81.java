package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ru81 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ru81(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru81)) {
            return false;
        }
        ru81 ru81Var = (ru81) obj;
        return this.a.equals(ru81Var.a) && u890.j(this.b, ru81Var.b) && u890.j(this.c, ru81Var.c) && u890.j(this.d, ru81Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
