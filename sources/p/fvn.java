package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fvn {
    public final boolean a;
    public final boolean b;
    public final ioc c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final PlayOrigin h;
    public final boolean i;
    public final mr20 j;
    public final km90 k;
    public final mr20 l;
    public final guh0 m;
    public final boolean n;

    public fvn(boolean z, boolean z2, ioc iocVar, boolean z3, boolean z4, PlayOrigin playOrigin, boolean z5, mr20 mr20Var, km90 km90Var, mr20 mr20Var2, guh0 guh0Var, boolean z6, int i) {
        boolean z7 = (i & 8) == 0;
        boolean z8 = (i & 16) != 0 ? false : z3;
        boolean z9 = (i & 32) == 0;
        boolean z10 = (i & 64) != 0 ? false : z4;
        boolean z11 = (i & 256) != 0 ? false : z5;
        mr20 mr20Var3 = (i & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : mr20Var;
        km90 km90Var2 = (i & 1024) != 0 ? im90.a : km90Var;
        mr20 huzVar = (i & 2048) != 0 ? new huz(Boolean.TRUE, (byte) 10) : mr20Var2;
        guh0 guh0Var2 = (i & 4096) == 0 ? guh0Var : null;
        boolean z12 = (i & 8192) == 0 ? z6 : false;
        this.a = z;
        this.b = z2;
        this.c = iocVar;
        this.d = z7;
        this.e = z8;
        this.f = z9;
        this.g = z10;
        this.h = playOrigin;
        this.i = z11;
        this.j = mr20Var3;
        this.k = km90Var2;
        this.l = huzVar;
        this.m = guh0Var2;
        this.n = z12;
    }
}
