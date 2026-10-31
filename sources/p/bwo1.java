package p;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bwo1 {
    public static zbp1 j;
    public static final pun1 k;
    public final String a;
    public final String b;
    public final tvo1 c;
    public final ot71 d;
    public final hfp1 e;
    public final hfp1 f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new pun1(objArr, (byte) 2);
    }

    public bwo1(Context context, ot71 ot71Var, tvo1 tvo1Var) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = dth.a(context);
        this.d = ot71Var;
        this.c = tvo1Var;
        cxo1.c();
        this.g = "vision-common";
        x6o0.k();
        this.e = x6o0.t(new u1o1(this, (byte) 1));
        x6o0.k();
        ot71Var.getClass();
        this.f = x6o0.t(new wvo1(ot71Var, (byte) 0));
        pun1 pun1Var = k;
        this.h = pun1Var.containsKey("vision-common") ? gjv.d(context, (String) pun1Var.get("vision-common"), false) : -1;
    }
}
