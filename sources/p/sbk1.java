package p;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sbk1 extends View {
    public static final b4u P0 = new b4u((byte) 2);
    public float N0;
    public float O0;
    public final l7v a;
    public final ljd b;
    public final vid c;
    public boolean d;
    public Outline e;
    public boolean f;
    public wat g;
    public flb0 h;
    public iu30 i;
    public be50 t;

    public sbk1(l7v l7vVar, ljd ljdVar, vid vidVar) {
        super(l7vVar.getContext());
        this.a = l7vVar;
        this.b = ljdVar;
        this.c = vidVar;
        setOutlineProvider(P0);
        this.f = true;
        this.g = yoi1.d;
        this.h = flb0.a;
        fe50.a.getClass();
        this.i = r850.P0;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.N0;
        vid vidVar = this.c;
        ljd ljdVar = this.b;
        if (f > 0.0f || this.O0 > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.N0, this.O0);
            u84 u84Var = ljdVar.a;
            Canvas canvas2 = u84Var.a;
            u84Var.a = canvas;
            wat watVar = this.g;
            flb0 flb0Var = this.h;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            be50 be50Var = this.t;
            iu30 iu30Var = this.i;
            cab cabVar = vidVar.b;
            cab cabVar2 = vidVar.b;
            wat watVarR = cabVar.r();
            flb0 flb0VarT = cabVar2.t();
            fid fidVarP = cabVar2.p();
            long jU = cabVar2.u();
            be50 be50Var2 = (be50) cabVar2.c;
            cabVar2.A(watVar);
            cabVar2.C(flb0Var);
            cabVar2.z(u84Var);
            cabVar2.D(jFloatToRawIntBits);
            cabVar2.c = be50Var;
            u84Var.q();
            try {
                iu30Var.invoke(vidVar);
                u84Var.i();
                cabVar2.A(watVarR);
                cabVar2.C(flb0VarT);
                cabVar2.z(fidVarP);
                cabVar2.D(jU);
                cabVar2.c = be50Var2;
                ljdVar.a.a = canvas2;
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                u84Var.i();
                cabVar2.A(watVarR);
                cabVar2.C(flb0VarT);
                cabVar2.z(fidVarP);
                cabVar2.D(jU);
                cabVar2.c = be50Var2;
                throw th;
            }
        } else {
            u84 u84Var2 = ljdVar.a;
            Canvas canvas3 = u84Var2.a;
            u84Var2.a = canvas;
            wat watVar2 = this.g;
            flb0 flb0Var2 = this.h;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            be50 be50Var3 = this.t;
            iu30 iu30Var2 = this.i;
            cab cabVar3 = vidVar.b;
            cab cabVar4 = vidVar.b;
            wat watVarR2 = cabVar3.r();
            flb0 flb0VarT2 = cabVar4.t();
            fid fidVarP2 = cabVar4.p();
            long jU2 = cabVar4.u();
            be50 be50Var4 = (be50) cabVar4.c;
            cabVar4.A(watVar2);
            cabVar4.C(flb0Var2);
            cabVar4.z(u84Var2);
            cabVar4.D(jFloatToRawIntBits2);
            cabVar4.c = be50Var3;
            u84Var2.q();
            try {
                iu30Var2.invoke(vidVar);
                u84Var2.i();
                cabVar4.A(watVarR2);
                cabVar4.C(flb0VarT2);
                cabVar4.z(fidVarP2);
                cabVar4.D(jU2);
                cabVar4.c = be50Var4;
                ljdVar.a.a = canvas3;
            } catch (Throwable th2) {
                u84Var2.i();
                cabVar4.A(watVarR2);
                cabVar4.C(flb0VarT2);
                cabVar4.z(fidVarP2);
                cabVar4.D(jU2);
                cabVar4.c = be50Var4;
                throw th2;
            }
        }
        this.d = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f;
    }

    public final ljd getCanvasHolder() {
        return this.b;
    }

    public final View getOwnerView() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
