package androidx.car.app.dialer;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITelephoneKeypadCallback;
import androidx.car.app.utils.f;
import java.util.Objects;
import p.b5q0;
import p.eg;
import p.lxd1;
import p.mxd1;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class TelephoneKeypadCallbackDelegateImpl implements mxd1 {
    private final ITelephoneKeypadCallback mBinder;

    @qrd
    public static class TelephoneKeypadCallbackStub extends ITelephoneKeypadCallback.Stub {
        private final lxd1 mTelephoneKeypadCallback;

        public TelephoneKeypadCallbackStub(lxd1 lxd1Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onKeyDown$1(int i) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onKeyLongPress$0(int i) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onKeyUp$2(int i) {
            throw null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyDown(int i, IOnDoneCallback iOnDoneCallback) {
            f.b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyDown", new a(this, i, (byte) 1));
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyLongPress(int i, IOnDoneCallback iOnDoneCallback) {
            f.b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyLongPress", new a(this, i, (byte) 0));
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyUp(int i, IOnDoneCallback iOnDoneCallback) {
            f.b(iOnDoneCallback, "TelephoneKeypadCallback#onKeyUp", new a(this, i, (byte) 2));
        }
    }

    private TelephoneKeypadCallbackDelegateImpl(lxd1 lxd1Var) {
        this.mBinder = new TelephoneKeypadCallbackStub(lxd1Var);
    }

    public static mxd1 create(lxd1 lxd1Var) {
        return new TelephoneKeypadCallbackDelegateImpl(lxd1Var);
    }

    public void sendKeyDown(int i, b5q0 b5q0Var) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            Objects.requireNonNull(iTelephoneKeypadCallback);
            iTelephoneKeypadCallback.onKeyDown(i, f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    public void sendKeyLongPress(int i, b5q0 b5q0Var) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            Objects.requireNonNull(iTelephoneKeypadCallback);
            iTelephoneKeypadCallback.onKeyLongPress(i, f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    public void sendKeyUp(int i, b5q0 b5q0Var) {
        try {
            ITelephoneKeypadCallback iTelephoneKeypadCallback = this.mBinder;
            Objects.requireNonNull(iTelephoneKeypadCallback);
            iTelephoneKeypadCallback.onKeyUp(i, f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private TelephoneKeypadCallbackDelegateImpl() {
        this.mBinder = null;
    }
}
