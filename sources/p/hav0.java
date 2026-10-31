package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hav0 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f60p;
    public hav0 q;

    public hav0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.f60p = z3;
    }

    public static hav0 b(hav0 hav0Var, long j, long j2, ArrayList arrayList) {
        hav0 hav0Var2 = hav0Var;
        hav0 hav0Var3 = new hav0(hav0Var2.a, hav0Var2.b, j, hav0Var2.d, hav0Var2.e, hav0Var2.f, j2, hav0Var2.h, hav0Var2.i, arrayList, hav0Var2.j, hav0Var2.k, hav0Var2.l, hav0Var2.n);
        hav0 hav0Var4 = hav0Var2.q;
        if (hav0Var4 == null) {
            hav0Var4 = hav0Var2;
        }
        hav0Var3.q = hav0Var4;
        hav0 hav0Var5 = hav0Var2.q;
        if (hav0Var5 != null) {
            hav0Var2 = hav0Var5;
        }
        hav0Var3.q = hav0Var2;
        return hav0Var3;
    }

    public final void a() {
        hav0 hav0Var = this.q;
        if (hav0Var == null) {
            this.o = true;
            this.f60p = true;
        } else if (hav0Var != null) {
            hav0Var.a();
        }
    }

    public final List c() {
        ArrayList arrayList = this.m;
        return arrayList == null ? z6x.a : arrayList;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }

    public final float g() {
        return this.e;
    }

    public final long h() {
        return this.g;
    }

    public final boolean i() {
        return this.h;
    }

    public final int j() {
        return this.i;
    }

    public final long k() {
        return this.b;
    }

    public final boolean l() {
        hav0 hav0Var = this.q;
        if (hav0Var != null) {
            return hav0Var.l();
        }
        return this.o || this.f60p;
    }

    public final String toString() {
        String strZ = w8p1.z(this.a);
        String strI = Offset.i(this.c);
        String strI2 = Offset.i(this.g);
        boolean zL = l();
        String strC = rav0.c(this.i);
        List listC = c();
        String strI3 = Offset.i(this.j);
        String strI4 = Offset.i(this.l);
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append(strZ);
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(strI);
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append(strI2);
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(zL);
        sb.append(", type=");
        sb.append(strC);
        sb.append(", historical=");
        sb.append(listC);
        sb.append(", scrollDelta=");
        sb.append(strI3);
        sb.append(", scaleFactor=");
        sb.append(this.k);
        return l1d.q(sb, ", panOffset=", strI4, ")");
    }

    public hav0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }

    public hav0(long j, long j2, long j3, float f, long j4, long j5, boolean z, boolean z2, int i) {
        this(j, j2, j3, false, f, j4, j5, z, z2, i, 0L, 1.0f, 0L);
    }
}
