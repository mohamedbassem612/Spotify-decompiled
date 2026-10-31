package p;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qkb0 {
    public final List a;
    public final fcf0 b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final w95 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f101p;
    public final u95 q;
    public final yu3 r;
    public final q95 s;
    public final List t;
    public final int u;
    public final boolean v;
    public final dp5 w;
    public final tjq x;
    public final int y;

    public qkb0(List list, fcf0 fcf0Var, String str, long j, int i, long j2, String str2, List list2, w95 w95Var, int i2, int i3, int i4, float f, float f2, float f3, float f4, u95 u95Var, yu3 yu3Var, List list3, int i5, q95 q95Var, boolean z, dp5 dp5Var, tjq tjqVar, int i6) {
        this.a = list;
        this.b = fcf0Var;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = w95Var;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.f101p = f4;
        this.q = u95Var;
        this.r = yu3Var;
        this.t = list3;
        this.u = i5;
        this.s = q95Var;
        this.v = z;
        this.w = dp5Var;
        this.x = tjqVar;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str);
        sb.append(this.c);
        sb.append("\n");
        long j = this.f;
        fcf0 fcf0Var = this.b;
        qkb0 qkb0Var = (qkb0) fcf0Var.i.b(j);
        if (qkb0Var != null) {
            sb.append("\t\tParents: ");
            sb.append(qkb0Var.c);
            for (qkb0 qkb0Var2 = (qkb0) fcf0Var.i.b(qkb0Var.f); qkb0Var2 != null; qkb0Var2 = (qkb0) fcf0Var.i.b(qkb0Var2.f)) {
                sb.append("->");
                sb.append(qkb0Var2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
