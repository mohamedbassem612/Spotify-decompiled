package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uvf1 {
    public final g7h a;
    public final dxz0 b;
    public final oi4 c;
    public final buf0 d;
    public final opv0 e;
    public final waz0 f;
    public final q8n g;
    public final ux3 h;
    public final by3 i;
    public final idd1 j = new idd1(new j4f1(this, (byte) 11));

    public uvf1(ux3 ux3Var, by3 by3Var, oi4 oi4Var, g7h g7hVar, q8n q8nVar, buf0 buf0Var, opv0 opv0Var, waz0 waz0Var, dxz0 dxz0Var) {
        this.a = g7hVar;
        this.b = dxz0Var;
        this.c = oi4Var;
        this.d = buf0Var;
        this.e = opv0Var;
        this.f = waz0Var;
        this.g = q8nVar;
        this.h = ux3Var;
        this.i = by3Var;
    }

    public static kdn0 a(ymd0 ymd0Var, Function0 function0) {
        if (ymd0Var == null) {
            return new kdn0(Boolean.FALSE);
        }
        fai0 fai0Var = new fai0();
        l811 l811Var = new l811();
        l811 l811Var2 = new l811();
        fai0Var.m(Boolean.FALSE);
        fai0Var.n((ymd0) function0.invoke(), new mvf1(l811Var2, fai0Var, l811Var, (byte) 0));
        fai0Var.n(ymd0Var, new mvf1(l811Var, fai0Var, l811Var2, (byte) 1));
        return fai0Var;
    }

    public static tvf1 b(uvf1 uvf1Var, y1c1 y1c1Var, String str, s24 s24Var, btt0 btt0Var, yt11 yt11Var, vu30 vu30Var, r3x0 r3x0Var, e10 e10Var, e10 e10Var2, boolean z, boolean z2, vu30 vu30Var2, kko kkoVar, boolean z3, boolean z4, boolean z5, int i) {
        y1c1 y1c1Var2 = (i & 1) != 0 ? null : y1c1Var;
        String str2 = (i & 2) != 0 ? "" : str;
        s24 s24Var2 = (i & 4) != 0 ? null : s24Var;
        r3x0 r3x0Var2 = (i & 64) != 0 ? null : r3x0Var;
        e10 e10Var3 = (i & 128) != 0 ? null : e10Var;
        e10 e10Var4 = (i & 256) != 0 ? null : e10Var2;
        boolean z6 = (i & 512) == 0;
        boolean z7 = (i & 1024) != 0;
        boolean z8 = (i & 2048) != 0 ? false : z;
        boolean z9 = (i & 4096) == 0;
        boolean z10 = (i & 8192) != 0 ? false : z2;
        long j = (i & 16384) != 0 ? 0L : 1000L;
        kko kkoVar2 = (65536 & i) != 0 ? null : kkoVar;
        boolean z11 = (131072 & i) != 0 ? false : z3;
        boolean z12 = (262144 & i) != 0 ? false : z4;
        boolean z13 = (i & 524288) != 0 ? false : z5;
        uvf1Var.getClass();
        return new tvf1(uvf1Var, z6, z10, z7, z9, j, z12, z13, vu30Var2, y1c1Var2, btt0Var, s24Var2, e10Var3, e10Var4, z8, yt11Var, r3x0Var2, vu30Var, z11, kkoVar2, str2);
    }
}
