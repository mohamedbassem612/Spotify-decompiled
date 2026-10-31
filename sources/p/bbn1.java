package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class bbn1 implements ka00, cgp1, adp1, fjv, cgo1 {
    public static final /* synthetic */ bbn1 a = new bbn1();
    public static final /* synthetic */ bbn1 b = new bbn1();
    public static final /* synthetic */ bbn1 c = new bbn1();
    public static final /* synthetic */ bbn1 d = new bbn1();

    public cc9 c(Context context, String str, ejv ejvVar) {
        cc9 cc9Var = new cc9();
        int iC = ejvVar.c(context, str, true);
        cc9Var.b = iC;
        if (iC != 0) {
            cc9Var.c = 1;
            return cc9Var;
        }
        int iM = ejvVar.m(context, str);
        cc9Var.a = iM;
        if (iM != 0) {
            cc9Var.c = -1;
        }
        return cc9Var;
    }

    @Override // p.adp1
    public /* synthetic */ kap1 f(pno1 pno1Var, a2x0 a2x0Var) {
        return hgn1.a((odn1) pno1Var, a2x0Var);
    }

    public Object zza() {
        pue0 pue0Var = nbn1.v;
        pue0 pue0Var2 = b3e.l;
        zod.n("Must be called from the main thread.");
        b3e b3eVar = b3e.n;
        zod.s(b3eVar);
        zod.n("Must be called from the main thread.");
        return b3eVar.d.a;
    }
}
