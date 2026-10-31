package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class hen1 implements bgp1, cgp1, v0i, fjv {
    public static final /* synthetic */ hen1 a = new hen1();
    public static final /* synthetic */ hen1 b = new hen1();

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
      0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public cc9 c(Context context, String str, ejv ejvVar) {
        cc9 cc9Var = new cc9();
        cc9Var.a = ejvVar.m(context, str);
        int i = 1;
        int iC = ejvVar.c(context, str, true);
        cc9Var.b = iC;
        int i2 = cc9Var.a;
        if (i2 == 0) {
            i2 = 0;
            if (iC == 0) {
                i = 0;
            } else if (i2 >= iC) {
                i = -1;
            }
        } else if (i2 >= iC) {
            i = -1;
        }
        cc9Var.c = i;
        return cc9Var;
    }

    public Object m(dxy dxyVar) {
        return new tok0();
    }
}
