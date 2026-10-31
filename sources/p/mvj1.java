package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class mvj1 {
    public static final lvj1 Companion = new lvj1();
    public static final znb0[] l = {null, null, null, null, null, null, null, null, null, null, dm5.S(2, kvj1.b)};
    public final long a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final List k;

    public mvj1(aww0 aww0Var) {
        long j = aww0Var.a;
        Integer num = aww0Var.b;
        num.getClass();
        int iIntValue = num.intValue();
        String str = aww0Var.c;
        str.getClass();
        Integer num2 = aww0Var.d;
        num2.getClass();
        int iIntValue2 = num2.intValue();
        Integer num3 = aww0Var.e;
        num3.getClass();
        int iIntValue3 = num3.intValue();
        Integer num4 = aww0Var.f;
        num4.getClass();
        int iIntValue4 = num4.intValue();
        String str2 = aww0Var.i;
        String str3 = aww0Var.j;
        int i = aww0Var.k;
        List list = aww0Var.n;
        this.a = j;
        this.b = iIntValue;
        this.c = str;
        this.d = iIntValue2;
        this.e = iIntValue3;
        this.f = iIntValue4;
        this.g = str2;
        this.h = null;
        this.i = str3;
        this.j = i;
        this.k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvj1)) {
            return false;
        }
        mvj1 mvj1Var = (mvj1) obj;
        return this.a == mvj1Var.a && this.b == mvj1Var.b && u890.j(this.c, mvj1Var.c) && this.d == mvj1Var.d && this.e == mvj1Var.e && this.f == mvj1Var.f && u890.j(this.g, mvj1Var.g) && u890.j(this.h, mvj1Var.h) && u890.j(this.i, mvj1Var.i) && this.j == mvj1Var.j && u890.j(this.k, mvj1Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.f, kaa0.f(this.e, kaa0.f(this.d, cy30.d(kaa0.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31), 31), 31), 31, this.g);
        String str = this.h;
        int iF = kaa0.f(this.j, cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31);
        List list = this.k;
        return iF + (list != null ? list.hashCode() : 0);
    }

    public /* synthetic */ mvj1(int i, long j, int i2, String str, int i3, int i4, int i5, String str2, String str3, String str4, int i6, List list) {
        if (895 != (i & 895)) {
            o6p1.t(i, 895, jvj1.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = str2;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        this.i = str4;
        this.j = i6;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
    }
}
