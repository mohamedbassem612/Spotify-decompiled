package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import p.f3d1;
import p.sge1;
import p.tcc;
import p.x8c0;
import p.z321;
import p.zyh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    public static final /* synthetic */ int a = 0;
    private final x8c0 mLifecycle;
    private f3d1 mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(x8c0 x8c0Var, f3d1 f3d1Var) {
        this.mLifecycle = x8c0Var;
        x8c0Var.a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onClick$7(float f, float f2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onFling$5(float f, float f2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScale$6(float f, float f2, float f3) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScroll$4(float f, float f2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceAvailable$0(tcc tccVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceDestroyed$3(tcc tccVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
        return null;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(float f, float f2) {
        sge1.b(new zyh0(this.mLifecycle, new c(this, f, f2, (byte) 0), "onClick"));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f, float f2) {
        sge1.b(new zyh0(this.mLifecycle, new c(this, f, f2, (byte) 2), "onFling"));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f, final float f2, final float f3) {
        sge1.b(new zyh0(this.mLifecycle, new z321() { // from class: androidx.car.app.utils.e
            @Override // p.z321
            public final Object b() {
                return this.a.lambda$onScale$6(f, f2, f3);
            }
        }, "onScale"));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f, float f2) {
        sge1.b(new zyh0(this.mLifecycle, new c(this, f, f2, (byte) 1), "onScroll"));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        f.c(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new d(this, rect, (byte) 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(tcc tccVar, IOnDoneCallback iOnDoneCallback) {
        f.c(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new a(this, tccVar, (byte) 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(tcc tccVar, IOnDoneCallback iOnDoneCallback) {
        f.c(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new a(this, tccVar, (byte) 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        f.c(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new d(this, rect, (byte) 0));
    }
}
