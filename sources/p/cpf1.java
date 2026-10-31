package p;

import android.content.res.Resources;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cpf1 implements syq {
    public final js20 X;
    public final kjv Y;
    public final eih1 Z;
    public final FlowableMap a;
    public final d0r b;
    public final xrn0 c;
    public final kof1 d;
    public final Resources e;
    public final boolean f;
    public final vbs g;
    public final qzh h;
    public final o3r i;
    public final km1 t;

    public cpf1(FlowableMap flowableMap, d0r d0rVar, xrn0 xrn0Var, yna0 yna0Var, kof1 kof1Var, Resources resources, boolean z, vbs vbsVar, qzh qzhVar) {
        this.a = flowableMap;
        this.b = d0rVar;
        this.c = xrn0Var;
        this.d = kof1Var;
        this.e = resources;
        this.f = z;
        this.g = vbsVar;
        this.h = qzhVar;
        ppa0 ppa0Var = lo70.a;
        jd11 jd11Var = rc11.a;
        o3r o3rVarL = w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 2, smf1.X, new j4r(smf1.a1), smf1.Z), new l4r(new wlu(jd11Var.b(jo70.class)), 2, smf1.O0, new k4r(smf1.c1, ppa0Var), smf1.Q0), new l4r(new xv00(jd11Var.b(mtl.class)), 2, smf1.S0, new j4r(smf1.e1), smf1.U0), new l4r(jd0.h, 2, smf1.W0, new j4r(new wof1(this, (byte) 2)), smf1.Y0), kle1.b1);
        this.i = o3rVarL;
        this.t = new km1(o3rVarL, (byte) 16);
        this.X = w3p1.q(new wof1(this, (byte) 0), smf1.e, new yof1(this, (byte) 0), (o8n) null, new wof1(this, (byte) 1), 8);
        this.Y = lnn1.g(bpf1.d, bpf1.e, new wof1(this, (byte) 3));
        this.Z = new eih1();
    }

    public static boolean f(iof1 iof1Var) {
        return l4o1.T(iof1Var.a) && iof1Var.a().a == ktl.b;
    }

    public final rqw a() {
        return this.Z;
    }

    public final rsw c() {
        return this.Y;
    }

    public final d0r e() {
        return this.b;
    }

    public final String g(int i, String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return this.e.getString(i, str, str2);
        }
        if (str == null || str.length() == 0) {
            return (str2 == null || str2.length() == 0) ? "" : str2;
        }
        return str;
    }

    public final mqw getBehavior() {
        return this.X;
    }

    public final f4r getData() {
        return this.t;
    }
}
