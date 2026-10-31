package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zvf1 {
    public final jma a;
    public final oi4 b;

    public zvf1(jma jmaVar, oi4 oi4Var) {
        this.a = jmaVar;
        this.b = oi4Var;
    }

    public static ls11 a(zvf1 zvf1Var, au11 au11Var, String str, o3r o3rVar, iu30 iu30Var, iu30 iu30Var2, kwf1 kwf1Var, sb2 sb2Var, int i) {
        boolean z = (i & 2) != 0;
        String str2 = (i & 32) != 0 ? null : str;
        o3r o3rVar2 = (i & 64) != 0 ? null : o3rVar;
        rru rruVar = (i & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? qru.a : oru.a;
        sb2 sb2Var2 = (i & 2048) != 0 ? rb2.a : sb2Var;
        o3r o3rVarO = w3p1.o(new l4r(pwc0.d, 2, xvf1.e, new j4r(xvf1.g), xvf1.f), new qd81(zvf1Var, (byte) 29));
        hvm hvmVar = hvm.b;
        l4r l4rVar = new l4r(hvmVar, 2, wvf1.S0, new j4r(wvf1.b1), wvf1.T0);
        l4r l4rVar2 = new l4r(hvmVar, 2, wvf1.U0, new k4r(wvf1.c1, lo70.c), wvf1.V0);
        l4r l4rVar3 = new l4r(pwc0.r, 2, wvf1.W0, new j4r(wvf1.d1), wvf1.X0);
        l4r l4rVar4 = new l4r(b2v.a, 2, wvf1.Y0, new j4r(wvf1.e1), wvf1.Z0);
        l4r l4rVar5 = new l4r(jd0.z, 2, wvf1.a1, new j4r(xvf1.b), wvf1.N0);
        hvm hvmVar2 = hvm.d;
        return new ls11(null, null, null, null, iu30Var, iu30Var2, null, null, null, kwf1Var, au11Var, 2, null, dye1.a, kpc1.a, sb2Var2, rruVar, false, o3rVarO, w3p1.i(l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, new l4r(hvmVar2, 2, wvf1.O0, new j4r(xvf1.c), wvf1.P0), new l4r(hvmVar2, 2, wvf1.Q0, new j4r(xvf1.d), wvf1.R0), a4r.e), w3p1.o(new l4r(pwc0.v, 2, wvf1.b, new j4r(wvf1.f), wvf1.c), wvf1.g), w3p1.o(new l4r(pwc0.h, 2, wvf1.d, new j4r(wvf1.h), wvf1.e), wvf1.i), jma.g(zvf1Var.a, z, zvf1Var.b.a(), str2, false, 32), o3rVar2, null, null, null, null, 0, null, -132935217, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_INVALID_BUFFER_CAPACITY);
    }
}
