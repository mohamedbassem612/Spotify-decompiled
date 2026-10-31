package p;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fw40 extends l5t implements m7v {
    public final be4 Q0;
    public final wlv R0;
    public final zzq0 S0;

    public fw40(j8d1 j8d1Var, be4 be4Var, wlv wlvVar, zzq0 zzq0Var) {
        this.Q0 = be4Var;
        this.R0 = wlvVar;
        this.S0 = zzq0Var;
        H1(j8d1Var);
    }

    public static boolean K1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p.m7v
    public final void t0(lsl lslVar) {
        boolean zK1;
        char c;
        long j;
        long j2 = lslVar.j();
        be4 be4Var = this.Q0;
        be4Var.l(j2);
        if (Size.g(lslVar.j())) {
            lslVar.s1();
            return;
        }
        lslVar.s1();
        be4Var.d.getValue();
        fid fidVarP = lslVar.a1().p();
        Canvas canvas = v84.a;
        Canvas canvas2 = ((u84) fidVarP).a;
        wlv wlvVar = this.R0;
        boolean zF = wlv.f(wlvVar.f);
        zzq0 zzq0Var = this.S0;
        if (zF) {
            zK1 = K1(270.0f, (((long) Float.floatToRawIntBits(lslVar.X0(zzq0Var.b(lslVar.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)))) << 32), wlvVar.c(), canvas2);
        } else {
            zK1 = false;
        }
        if (wlv.f(wlvVar.d)) {
            c = ' ';
            j = 4294967295L;
            zK1 = K1(0.0f, (((long) Float.floatToRawIntBits(lslVar.X0(zzq0Var.c))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), wlvVar.e(), canvas2) || zK1;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (wlv.f(wlvVar.g)) {
            zK1 = K1(90.0f, (((long) Float.floatToRawIntBits(lslVar.X0(zzq0Var.c(lslVar.getLayoutDirection())) + (-((float) jch0.U(Float.intBitsToFloat((int) (lslVar.j() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), wlvVar.d(), canvas2) || zK1;
        }
        if (wlv.f(wlvVar.e)) {
            EdgeEffect edgeEffectB = wlvVar.b();
            zK1 = K1(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (lslVar.j() & j))) + lslVar.X0(zzq0Var.e))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (lslVar.j() >> c)))) << c), edgeEffectB, canvas2) || zK1;
        }
        if (zK1) {
            be4Var.g();
        }
    }
}
