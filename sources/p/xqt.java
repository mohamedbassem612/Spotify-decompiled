package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xqt {
    public static final xqt e = new a9a(0).h();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        String str = zoi1.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public xqt(a9a a9aVar) {
        this.a = a9aVar.b;
        this.b = a9aVar.c;
        this.c = a9aVar.d;
        this.d = (String) a9aVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqt)) {
            return false;
        }
        xqt xqtVar = (xqt) obj;
        return this.a == xqtVar.a && this.b == xqtVar.b && this.c == xqtVar.c && Objects.equals(this.d, xqtVar.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
