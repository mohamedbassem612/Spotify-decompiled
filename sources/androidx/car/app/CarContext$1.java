package androidx.car.app;

import java.util.Arrays;
import java.util.concurrent.Executor;
import p.w8c0;
import p.x8c0;
import p.z7q0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ k this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ x8c0 val$lifecycle;
    final /* synthetic */ z7q0 val$listener;

    public CarContext$1(k kVar, x8c0 x8c0Var, Executor executor, z7q0 z7q0Var) {
        this.this$0 = kVar;
        this.val$lifecycle = x8c0Var;
        this.val$executor = executor;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (this.val$lifecycle.b().a(w8c0.c)) {
            this.val$executor.execute(new e(Arrays.asList(strArr), Arrays.asList(strArr2), (byte) 2));
        }
    }
}
