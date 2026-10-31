package p;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xxj implements ScrollCaptureCallback {
    public final v161 a;
    public final ur80 b;
    public final rcl c;
    public final ha4 d;
    public final llm e;
    public final p8a f;

    public xxj(v161 v161Var, ur80 ur80Var, llm llmVar, rcl rclVar, ha4 ha4Var) {
        this.a = v161Var;
        this.b = ur80Var;
        this.c = rclVar;
        this.d = ha4Var;
        this.e = new llm(llmVar.a.y(w5u.b));
        this.f = new p8a(ur80Var.b(), new wxj(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollCaptureSession scrollCaptureSession, ur80 ur80Var, onm onmVar) {
        vxj vxjVar;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSession2;
        int i3;
        ur80 ur80Var2;
        int i4;
        int iP;
        int iP2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (onmVar instanceof vxj) {
            vxjVar = (vxj) onmVar;
            int i7 = vxjVar.g;
            if ((i7 & os00.INVALID_ID) != 0) {
                vxjVar.g = i7 - os00.INVALID_ID;
            } else {
                vxjVar = new vxj(this, onmVar);
            }
        } else {
            vxjVar = new vxj(this, onmVar);
        }
        Object obj = vxjVar.e;
        int i8 = vxjVar.g;
        p8a p8aVar = this.f;
        d9n d9nVar = d9n.a;
        if (i8 == 0) {
            hm5.M(obj);
            i = ur80Var.b;
            i2 = ur80Var.d;
            vxjVar.a = scrollCaptureSession;
            vxjVar.b = ur80Var;
            vxjVar.c = i;
            vxjVar.d = i2;
            vxjVar.g = 1;
            if (i > i2) {
                p8aVar.getClass();
                k220.d(i, i2, " ≤ max=", "Expected min=");
                return null;
            }
            int i9 = i2 - i;
            int i10 = p8aVar.a;
            if (i9 > i10) {
                hhg1.f(cy30.i(i9, "Expected range (", i10, ") to be ≤ viewportSize="));
                return null;
            }
            Object objC = p8aVar.c((((i9 / 2) + i) - (i10 / 2)) - p8aVar.b, vxjVar);
            Object obj2 = rih1.a;
            if (objC != d9nVar) {
                objC = obj2;
            }
            if (objC == d9nVar) {
                obj2 = objC;
            }
            if (obj2 != d9nVar) {
            }
            return d9nVar;
        }
        if (i8 == 1) {
            int i11 = vxjVar.d;
            int i12 = vxjVar.c;
            ur80 ur80Var3 = vxjVar.b;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) vxjVar.a;
            hm5.M(obj);
            i = i12;
            ur80Var = ur80Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i8 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = vxjVar.d;
            i4 = vxjVar.c;
            ur80Var2 = vxjVar.b;
            scrollCaptureSession2 = (ScrollCaptureSession) vxjVar.a;
            hm5.M(obj);
        }
        iP = yoi1.p(i4 - jch0.U(p8aVar.b), 0, p8aVar.a);
        iP2 = yoi1.p(i3 - jch0.U(p8aVar.b), 0, p8aVar.a);
        i5 = ur80Var2.a;
        i6 = ur80Var2.c;
        if (iP == iP2) {
            return ur80.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iP);
            ur80 ur80Var4 = this.b;
            canvasLockHardwareCanvas.translate(-ur80Var4.a, -ur80Var4.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iU = jch0.U(p8aVar.b);
            return new ur80(i5, iP + iU, i6, iP2 + iU);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        u1c u1cVar = new u1c((byte) 9);
        vxjVar.a = scrollCaptureSession;
        vxjVar.b = ur80Var;
        vxjVar.c = i;
        vxjVar.d = i2;
        vxjVar.g = 2;
        if (s110.h(vxjVar.getContext()).D(u1cVar, vxjVar) != d9nVar) {
            scrollCaptureSession2 = scrollCaptureSession;
            i3 = i2;
            ur80Var2 = ur80Var;
            i4 = i;
            iP = yoi1.p(i4 - jch0.U(p8aVar.b), 0, p8aVar.a);
            iP2 = yoi1.p(i3 - jch0.U(p8aVar.b), 0, p8aVar.a);
            i5 = ur80Var2.a;
            i6 = ur80Var2.c;
            if (iP == iP2) {
                return ur80.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iP);
            ur80 ur80Var5 = this.b;
            canvasLockHardwareCanvas.translate(-ur80Var5.a, -ur80Var5.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iU2 = jch0.U(p8aVar.b);
            return new ur80(i5, iP + iU2, i6, iP2 + iU2);
        }
        return d9nVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        fn31.T(this.e, geo0.b, 0, new bag(this, runnable, (lnm) null, (byte) 20), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        xab1 xab1VarT = fn31.T(this.e, null, 0, new x4c(this, scrollCaptureSession, rect, consumer, (lnm) null, (byte) 15), 3);
        xab1VarT.L(new j6(cancellationSignal, (byte) 14));
        cancellationSignal.setOnCancelListener(new yxj(xab1VarT, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(l0p1.t(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((hrr0) this.c.b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
