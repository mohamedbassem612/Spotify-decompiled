package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@adt
@o661
public final class aww0 {
    public static final xvw0 Companion = new xvw0();
    public static final znb0[] o = {null, null, null, null, null, null, null, null, null, null, null, null, dm5.S(2, tnt0.e1)};
    public final long a;
    public final Integer b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final Integer l;
    public final List m;
    public final List n;

    public aww0(int i, long j, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, String str2, String str3, String str4, int i2, Integer num6, List list) {
        Integer num7;
        List list2;
        List listSingletonList = null;
        if (1793 != (i & 1793)) {
            o6p1.t(i, 1793, vvw0.a.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        this.i = str3;
        this.j = str4;
        this.k = i2;
        if ((i & 2048) == 0) {
            this.l = null;
            num7 = null;
        } else {
            num7 = num6;
            this.l = num7;
        }
        if ((i & 4096) == 0) {
            this.m = null;
            list2 = null;
        } else {
            list2 = list;
            this.m = list2;
        }
        if (list2 == null) {
            if ((num7 != null ? this : null) != null) {
                num7.getClass();
                listSingletonList = Collections.singletonList(num7);
            }
        } else {
            listSingletonList = list2;
        }
        this.n = listSingletonList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aww0)) {
            return false;
        }
        aww0 aww0Var = (aww0) obj;
        return this.a == aww0Var.a && u890.j(this.b, aww0Var.b) && u890.j(this.c, aww0Var.c) && u890.j(this.d, aww0Var.d) && u890.j(this.e, aww0Var.e) && u890.j(this.f, aww0Var.f) && u890.j(this.g, aww0Var.g) && u890.j(this.h, aww0Var.h) && u890.j(this.i, aww0Var.i) && u890.j(this.j, aww0Var.j) && this.k == aww0Var.k && u890.j(this.l, aww0Var.l) && u890.j(this.m, aww0Var.m);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.g;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.h;
        int iF = kaa0.f(this.k, cy30.d(cy30.d((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.j), 31);
        Integer num6 = this.l;
        int iHashCode8 = (iF + (num6 == null ? 0 : num6.hashCode())) * 31;
        List list = this.m;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }
}
