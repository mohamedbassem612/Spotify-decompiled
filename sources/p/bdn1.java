package p;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class bdn1 implements ufp1, egp1, zgn1, fjv {
    public static final /* synthetic */ bdn1 a = new bdn1();
    public static final /* synthetic */ bdn1 b = new bdn1();

    public /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // p.ufp1
    public Object b(pno1 pno1Var) throws GeneralSecurityException {
        a2x0 a2x0Var = a2x0.c1;
        kap1 kap1Var = ((jdp1) pno1Var).d;
        jdp1.w(kap1Var, a2x0Var);
        bgn1.c(kap1Var);
        return new zfn1();
    }

    public cc9 c(Context context, String str, ejv ejvVar) {
        cc9 cc9Var = new cc9();
        int iM = ejvVar.m(context, str);
        cc9Var.a = iM;
        if (iM != 0) {
            cc9Var.c = -1;
            return cc9Var;
        }
        int iC = ejvVar.c(context, str, true);
        cc9Var.b = iC;
        if (iC != 0) {
            cc9Var.c = 1;
        }
        return cc9Var;
    }
}
