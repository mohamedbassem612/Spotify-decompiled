package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import java.util.Objects;
import p.b5q0;
import p.eg;
import p.nh3;
import p.oh3;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class AlertCallbackDelegateImpl implements oh3 {
    private final IAlertCallback mCallback;

    @qrd
    public static class AlertCallbackStub extends IAlertCallback.Stub {
        private final nh3 mCallback;

        public AlertCallbackStub(nh3 nh3Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertCancelled$0(int i) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertDismissed$1() {
            throw null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onCancel", new b(this, i, (byte) 0));
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onDismiss", new a(this, (byte) 0));
        }
    }

    private AlertCallbackDelegateImpl(nh3 nh3Var) {
        this.mCallback = new AlertCallbackStub(nh3Var);
    }

    public static oh3 create(nh3 nh3Var) {
        return new AlertCallbackDelegateImpl(nh3Var);
    }

    public void sendCancel(int i, b5q0 b5q0Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertCancelled(i, androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    public void sendDismiss(b5q0 b5q0Var) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertDismissed(androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
