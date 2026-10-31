package p;

import android.content.res.Resources;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dpf1 implements syq {
    public final nsw N0;
    public final ia00 O0;
    public final o3r X;
    public final km1 Y;
    public final js20 Z;
    public final d0r a;
    public final FlowableMap b;
    public final FlowableTransformer c;
    public final FlowableTransformer d;
    public final FlowableTransformer e;
    public final ynb0 f;
    public final ynb0 g;
    public final Resources h;
    public final ln4 i;
    public final vbs t;

    public dpf1(d0r d0rVar, FlowableMap flowableMap, FlowableTransformer flowableTransformer, FlowableTransformer flowableTransformer2, FlowableTransformer flowableTransformer3, yna0 yna0Var, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, Resources resources, ln4 ln4Var, vbs vbsVar) {
        this.a = d0rVar;
        this.b = flowableMap;
        this.c = flowableTransformer;
        this.d = flowableTransformer2;
        this.e = flowableTransformer3;
        this.f = ynb0Var;
        this.g = ynb0Var2;
        this.h = resources;
        this.i = ln4Var;
        this.t = vbsVar;
        ppa0 ppa0Var = lo70.a;
        jd11 jd11Var = rc11.a;
        o3r o3rVarL = w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 2, smf1.Y, new j4r(smf1.b1), smf1.N0), new l4r(new xv00(jd11Var.b(mtl.class)), 2, smf1.P0, new j4r(smf1.d1), smf1.R0), new l4r(jd0.h, 2, smf1.T0, new j4r(bpf1.b), smf1.V0), new l4r(new wlu(jd11Var.b(jo70.class)), 2, smf1.X0, new k4r(bpf1.c, ppa0Var), smf1.Z0), kle1.c1);
        this.X = o3rVarL;
        this.Y = new km1(o3rVarL, (byte) 16);
        this.Z = w3p1.q(new xof1(this, (byte) 0), smf1.f, new zof1(this, (byte) 0), (o8n) null, new xof1(this, (byte) 1), 8);
        this.N0 = jch0.j(kle1.d1);
        this.O0 = n3o1.q(this).a(kle1.Z0, kle1.a1);
    }

    public static boolean f(jof1 jof1Var) {
        ContextTrack contextTrack = jof1Var.a;
        return l4o1.U(contextTrack) && !l4o1.T(contextTrack) && jof1Var.b.b.a == ktl.b;
    }

    public final rqw a() {
        return this.O0;
    }

    public final rsw c() {
        return this.N0;
    }

    public final d0r e() {
        return this.a;
    }

    public final String g(int i, String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return this.h.getString(i, str, str2);
        }
        if (str == null || str.length() == 0) {
            return (str2 == null || str2.length() == 0) ? "" : str2;
        }
        return str;
    }

    public final mqw getBehavior() {
        return this.Z;
    }

    public final f4r getData() {
        return this.Y;
    }
}
