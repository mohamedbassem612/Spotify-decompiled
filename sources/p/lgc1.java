package p;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lgc1 extends l5t implements m7v {
    public final be4 Q0;
    public final wlv R0;
    public RenderNode S0;

    public lgc1(j8d1 j8d1Var, be4 be4Var, wlv wlvVar) {
        this.Q0 = be4Var;
        this.R0 = wlvVar;
        H1(j8d1Var);
    }

    public static boolean K1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode L1() {
        RenderNode renderNode = this.S0;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM = i15.m();
        this.S0 = renderNodeM;
        return renderNodeM;
    }

    public final void t0(lsl lslVar) {
        float f;
        boolean zK1;
        qqq0 qqq0Var;
        char c;
        float f2;
        long j = lslVar.j();
        be4 be4Var = this.Q0;
        be4Var.l(j);
        u84 u84VarP = lslVar.a1().p();
        Canvas canvas = v84.a;
        Canvas canvas2 = u84VarP.a;
        be4Var.d.getValue();
        if (Size.g(lslVar.j())) {
            lslVar.s1();
            return;
        }
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        wlv wlvVar = this.R0;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = wlvVar.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = wlvVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = wlvVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = wlvVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = wlvVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = wlvVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = wlvVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = wlvVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            lslVar.s1();
            return;
        }
        float fX0 = lslVar.X0(30.0f);
        boolean z = wlv.f(wlvVar.d) || wlv.g(wlvVar.h) || wlv.f(wlvVar.e) || wlv.g(wlvVar.i);
        boolean z2 = wlv.f(wlvVar.f) || wlv.g(wlvVar.j) || wlv.f(wlvVar.g) || wlv.g(wlvVar.k);
        if (z && z2) {
            L1().setPosition(0, 0, canvas2.getWidth(), canvas2.getHeight());
        } else if (z) {
            L1().setPosition(0, 0, (jch0.U(fX0) * 2) + canvas2.getWidth(), canvas2.getHeight());
        } else {
            if (!z2) {
                lslVar.s1();
                return;
            }
            L1().setPosition(0, 0, canvas2.getWidth(), (jch0.U(fX0) * 2) + canvas2.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = L1().beginRecording();
        boolean zG = wlv.g(wlvVar.j);
        qqq0 qqq0Var2 = qqq0.b;
        if (zG) {
            EdgeEffect edgeEffectA = wlvVar.j;
            if (edgeEffectA == null) {
                edgeEffectA = wlvVar.a(qqq0Var2);
                wlvVar.j = edgeEffectA;
            }
            K1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (wlv.f(wlvVar.f)) {
            EdgeEffect edgeEffectC = wlvVar.c();
            zK1 = K1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            f = 1.0f;
            if (wlv.g(wlvVar.f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (be4Var.f() & 4294967295L));
                EdgeEffect edgeEffectA2 = wlvVar.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = wlvVar.a(qqq0Var2);
                    wlvVar.j = edgeEffectA2;
                }
                int i = Build.VERSION.SDK_INT;
                float fP = i >= 31 ? mb4.p(edgeEffectC) : 0.0f;
                float f3 = 1.0f - fIntBitsToFloat;
                if (i >= 31) {
                    mb4.A(edgeEffectA2, fP, f3);
                } else {
                    edgeEffectA2.onPull(fP, f3);
                }
            }
        } else {
            f = 1.0f;
            zK1 = false;
        }
        boolean zG2 = wlv.g(wlvVar.h);
        qqq0 qqq0Var3 = qqq0.a;
        if (zG2) {
            EdgeEffect edgeEffectA3 = wlvVar.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = wlvVar.a(qqq0Var3);
                wlvVar.h = edgeEffectA3;
            }
            K1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (wlv.f(wlvVar.d)) {
            EdgeEffect edgeEffectE = wlvVar.e();
            zK1 = K1(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zK1;
            c = ' ';
            if (wlv.g(wlvVar.d)) {
                qqq0Var = qqq0Var2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (be4Var.f() >> 32));
                EdgeEffect edgeEffectA4 = wlvVar.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = wlvVar.a(qqq0Var3);
                    wlvVar.h = edgeEffectA4;
                }
                int i2 = Build.VERSION.SDK_INT;
                float fP2 = i2 >= 31 ? mb4.p(edgeEffectE) : 0.0f;
                if (i2 >= 31) {
                    mb4.A(edgeEffectA4, fP2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fP2, fIntBitsToFloat2);
                }
            } else {
                qqq0Var = qqq0Var2;
            }
        } else {
            qqq0Var = qqq0Var2;
            c = ' ';
        }
        if (wlv.g(wlvVar.k)) {
            EdgeEffect edgeEffectA5 = wlvVar.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = wlvVar.a(qqq0Var);
                wlvVar.k = edgeEffectA5;
            }
            K1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (wlv.f(wlvVar.g)) {
            EdgeEffect edgeEffectD = wlvVar.d();
            zK1 = K1(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zK1;
            if (wlv.g(wlvVar.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (be4Var.f() & 4294967295L));
                EdgeEffect edgeEffectA6 = wlvVar.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = wlvVar.a(qqq0Var);
                    wlvVar.k = edgeEffectA6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fP3 = i3 >= 31 ? mb4.p(edgeEffectD) : 0.0f;
                if (i3 >= 31) {
                    mb4.A(edgeEffectA6, fP3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fP3, fIntBitsToFloat3);
                }
            }
        }
        if (wlv.g(wlvVar.i)) {
            EdgeEffect edgeEffectA7 = wlvVar.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = wlvVar.a(qqq0Var3);
                wlvVar.i = edgeEffectA7;
            }
            f2 = 0.0f;
            K1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f2 = 0.0f;
        }
        if (wlv.f(wlvVar.e)) {
            EdgeEffect edgeEffectB = wlvVar.b();
            boolean z3 = K1(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zK1;
            if (wlv.g(wlvVar.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (be4Var.f() >> c));
                EdgeEffect edgeEffectA8 = wlvVar.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = wlvVar.a(qqq0Var3);
                    wlvVar.i = edgeEffectA8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fP4 = i4 >= 31 ? mb4.p(edgeEffectB) : f2;
                float f4 = f - fIntBitsToFloat4;
                if (i4 >= 31) {
                    mb4.A(edgeEffectA8, fP4, f4);
                } else {
                    edgeEffectA8.onPull(fP4, f4);
                }
            }
            zK1 = z3;
        }
        if (zK1) {
            be4Var.g();
        }
        float f5 = z2 ? f2 : fX0;
        if (z) {
            fX0 = f2;
        }
        flb0 layoutDirection = lslVar.getLayoutDirection();
        u84 u84Var = new u84();
        u84Var.a = recordingCanvasBeginRecording;
        long j2 = lslVar.j();
        wat watVarR = lslVar.a1().r();
        flb0 flb0VarT = lslVar.a1().t();
        fid fidVarP = lslVar.a1().p();
        long jU = lslVar.a1().u();
        be50 be50Var = (be50) lslVar.a1().c;
        cab cabVarA1 = lslVar.a1();
        cabVarA1.A(lslVar);
        cabVarA1.C(layoutDirection);
        cabVarA1.z(u84Var);
        cabVarA1.D(j2);
        cabVarA1.c = null;
        u84Var.q();
        try {
            ((dg8) lslVar.a1().b).z(f5, fX0);
            try {
                lslVar.s1();
                float f6 = -f5;
                float f7 = -fX0;
                ((dg8) lslVar.a1().b).z(f6, f7);
                u84Var.i();
                cab cabVarA2 = lslVar.a1();
                cabVarA2.A(watVarR);
                cabVarA2.C(flb0VarT);
                cabVarA2.z(fidVarP);
                cabVarA2.D(jU);
                cabVarA2.c = be50Var;
                L1().endRecording();
                int iSave = canvas2.save();
                canvas2.translate(f6, f7);
                canvas2.drawRenderNode(L1());
                canvas2.restoreToCount(iSave);
            } catch (Throwable th) {
                ((dg8) lslVar.a1().b).z(-f5, -fX0);
                throw th;
            }
        } catch (Throwable th2) {
            u84Var.i();
            cab cabVarA3 = lslVar.a1();
            cabVarA3.A(watVarR);
            cabVarA3.C(flb0VarT);
            cabVarA3.z(fidVarP);
            cabVarA3.D(jU);
            cabVarA3.c = be50Var;
            throw th2;
        }
    }
}
