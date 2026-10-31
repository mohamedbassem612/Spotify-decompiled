package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rpx0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public rpx0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpx0)) {
            return false;
        }
        rpx0 rpx0Var = (rpx0) obj;
        return this.a.equals(rpx0Var.a) && this.b.equals(rpx0Var.b) && this.c.equals(rpx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
