package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class cld {
    public static final bld Companion = new bld();
    public static final znb0[] k = {null, null, null, null, null, null, null, null, null, dm5.S(2, xrc.e)};
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final Map j;

    public /* synthetic */ cld(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Map map) {
        if (511 != (i & 511)) {
            o6p1.t(i, 511, zkd.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cld)) {
            return false;
        }
        cld cldVar = (cld) obj;
        return this.a == cldVar.a && this.b == cldVar.b && this.c == cldVar.c && this.d == cldVar.d && this.e == cldVar.e && this.f == cldVar.f && this.g == cldVar.g && this.h == cldVar.h && this.i == cldVar.i && u890.j(this.j, cldVar.j);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.i, kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Map map = this.j;
        return iF + (map == null ? 0 : map.hashCode());
    }

    public cld(int i, int i2, Map map) {
        this.a = 1;
        this.b = i;
        this.c = i2;
        this.d = 1;
        this.e = 1;
        this.f = 2;
        this.g = 1;
        this.h = 2;
        this.i = 3;
        this.j = map;
    }
}
