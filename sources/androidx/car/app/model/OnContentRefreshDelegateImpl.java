package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import java.util.Objects;
import p.b5q0;
import p.eg;
import p.l2q0;
import p.m2q0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class OnContentRefreshDelegateImpl implements l2q0 {
    private final IOnContentRefreshListener mListener;

    @qrd
    public static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final m2q0 mOnContentRefreshListener;

        public OnContentRefreshListenerStub(m2q0 m2q0Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onContentRefreshRequested$0() {
            throw null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onClick", new a(this, (byte) 2));
        }
    }

    private OnContentRefreshDelegateImpl(m2q0 m2q0Var) {
        this.mListener = new OnContentRefreshListenerStub(m2q0Var);
    }

    public static l2q0 create(m2q0 m2q0Var) {
        return new OnContentRefreshDelegateImpl(m2q0Var);
    }

    public void sendContentRefreshRequested(b5q0 b5q0Var) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
