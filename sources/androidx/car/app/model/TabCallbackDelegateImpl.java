package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import java.util.Objects;
import p.b5q0;
import p.eg;
import p.qrd;
import p.wed1;
import p.wjd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class TabCallbackDelegateImpl implements wed1 {
    private final ITabCallback mStubCallback;

    @qrd
    public static class TabCallbackStub extends ITabCallback.Stub {
        private final wjd1 mCallback;

        public TabCallbackStub(wjd1 wjd1Var) {
            this.mCallback = wjd1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object lambda$onTabSelected$0(String str) {
            this.mCallback.b.invoke(str);
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onTabSelected", new c(this, str, (byte) 2));
        }
    }

    private TabCallbackDelegateImpl(wjd1 wjd1Var) {
        this.mStubCallback = new TabCallbackStub(wjd1Var);
    }

    public static wed1 create(wjd1 wjd1Var) {
        return new TabCallbackDelegateImpl(wjd1Var);
    }

    public void sendTabSelected(String str, b5q0 b5q0Var) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            Objects.requireNonNull(iTabCallback);
            iTabCallback.onTabSelected(str, androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
