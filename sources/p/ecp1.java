package p;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ecp1 {
    public static vtn1 k;
    public static final pun1 l;
    public final String a;
    public final String b;
    public final pbp1 c;
    public final ot71 d;
    public final hfp1 e;
    public final hfp1 f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        l = new pun1(objArr, (byte) 0);
    }

    public ecp1(Context context, ot71 ot71Var, pbp1 pbp1Var, String str) {
        this.a = context.getPackageName();
        this.b = dth.a(context);
        this.d = ot71Var;
        this.c = pbp1Var;
        wcp1.f();
        this.g = str;
        x6o0.k();
        this.e = x6o0.t(new u1o1(this, (byte) 3));
        x6o0.k();
        Objects.requireNonNull(ot71Var);
        this.f = x6o0.t(new wvo1(ot71Var, (byte) 2));
        pun1 pun1Var = l;
        this.h = pun1Var.containsKey(str) ? gjv.d(context, (String) pun1Var.get(str), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    public final void b(dcp1 dcp1Var, r0p1 r0p1Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (d(r0p1Var, jElapsedRealtime)) {
            this.i.put(r0p1Var, Long.valueOf(jElapsedRealtime));
            lqn1.a(1, new hw9(this, dcp1Var.zza(), r0p1Var, c(), (byte) 18));
        }
    }

    public final String c() {
        hfp1 hfp1Var = this.e;
        if (hfp1Var.j()) {
            return (String) hfp1Var.g();
        }
        return a8c0.c.a(this.g);
    }

    public final boolean d(r0p1 r0p1Var, long j) {
        HashMap map = this.i;
        return map.get(r0p1Var) == null || j - ((Long) map.get(r0p1Var)).longValue() > 30000;
    }
}
