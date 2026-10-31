package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a180 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final z080 j;
    public boolean k;

    public a180(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long jP;
        str = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 32) != 0) {
            int i3 = u7h.l;
            jP = nfb.p();
        } else {
            jP = j;
        }
        int i4 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = jP;
        this.g = i4;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        z080 z080Var = new z080(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = z080Var;
        t2p1.f(arrayList, z080Var);
    }

    public static void a(a180 a180Var, ArrayList arrayList, n6a1 n6a1Var, float f, int i, float f2) {
        if (a180Var.k) {
            qf80.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((z080) t2p1.d(a180Var.i)).j.add(new eui1("", arrayList, 0, n6a1Var, 1.0f, null, 1.0f, f, 0, i, f2, 0.0f, 1.0f, 0.0f));
    }

    public final b180 b() {
        if (this.k) {
            qf80.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                z080 z080Var = this.j;
                b180 b180Var = new b180(this.a, this.b, this.c, this.d, this.e, new aui1(z080Var.a, z080Var.b, z080Var.c, z080Var.d, z080Var.e, z080Var.f, z080Var.g, z080Var.h, z080Var.i, z080Var.j), this.f, this.g, this.h);
                this.k = true;
                return b180Var;
            }
            if (this.k) {
                qf80.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            z080 z080Var2 = (z080) t2p1.e(arrayList);
            ((z080) t2p1.d(arrayList)).j.add(new aui1(z080Var2.a, z080Var2.b, z080Var2.c, z080Var2.d, z080Var2.e, z080Var2.f, z080Var2.g, z080Var2.h, z080Var2.i, z080Var2.j));
        }
    }
}
