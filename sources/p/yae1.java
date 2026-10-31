package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yae1 {
    public final f930 a;
    public final wat b;
    public final flb0 c;
    public final lvc1 d;

    static {
        new ejb((byte) 27);
    }

    public yae1(f930 f930Var, wat watVar, flb0 flb0Var, int i) {
        this.a = f930Var;
        this.b = watVar;
        this.c = flb0Var;
        this.d = i > 0 ? new lvc1(i) : null;
    }

    public static y9e1 a(yae1 yae1Var, String str, lee1 lee1Var, int i, boolean z, int i2, long j, flb0 flb0Var, xat xatVar, int i3) {
        int i4 = (i3 & 4) != 0 ? 1 : i;
        boolean z2 = (i3 & 8) != 0 ? true : z;
        int i5 = (i3 & 16) != 0 ? Integer.MAX_VALUE : i2;
        long jB = (i3 & 32) != 0 ? jjl.b(0, 0, 0, 0, 15) : j;
        flb0 flb0Var2 = (i3 & 64) != 0 ? yae1Var.c : flb0Var;
        wat watVar = (i3 & 128) != 0 ? yae1Var.b : xatVar;
        f930 f930Var = yae1Var.a;
        yae1Var.getClass();
        return b(yae1Var, new af5(str), lee1Var, i4, z2, i5, jB, flb0Var2, watVar, f930Var, 32);
    }

    public static y9e1 b(yae1 yae1Var, af5 af5Var, lee1 lee1Var, int i, boolean z, int i2, long j, flb0 flb0Var, wat watVar, f930 f930Var, int i3) {
        if ((i3 & 4) != 0) {
            i = 1;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 & 64) != 0) {
            j = jjl.b(0, 0, 0, 0, 15);
        }
        if ((i3 & 128) != 0) {
            flb0Var = yae1Var.c;
        }
        if ((i3 & 256) != 0) {
            watVar = yae1Var.b;
        }
        if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
            f930Var = yae1Var.a;
        }
        lvc1 lvc1Var = yae1Var.d;
        long j2 = j;
        x9e1 x9e1Var = new x9e1(af5Var, lee1Var, z6x.a, i2, z, i, watVar, flb0Var, f930Var, j2);
        y9e1 y9e1VarC = lvc1Var != null ? lvc1Var.c(x9e1Var) : null;
        if (y9e1VarC != null) {
            zrm0 zrm0Var = y9e1VarC.b;
            return new y9e1(x9e1Var, zrm0Var, jjl.d(j2, (((long) sjo0.k(zrm0Var.e)) & 4294967295L) | (((long) sjo0.k(zrm0Var.d)) << 32)));
        }
        y9e1 y9e1VarB = ejb.b(x9e1Var);
        if (lvc1Var != null) {
            lvc1Var.H(x9e1Var, y9e1VarB);
        }
        return y9e1VarB;
    }
}
