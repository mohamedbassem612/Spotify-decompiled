package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import java.util.Objects;
import p.b5q0;
import p.c8q0;
import p.eg;
import p.fk90;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class OnSelectedDelegateImpl implements c8q0 {
    private final IOnSelectedListener mStub;

    @qrd
    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final fk90 mListener;

        public OnSelectedListenerStub(fk90 fk90Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSelected$0(int i) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onSelectedListener", new b(this, i, (byte) 1));
        }
    }

    private OnSelectedDelegateImpl(fk90 fk90Var) {
        this.mStub = new OnSelectedListenerStub(fk90Var);
    }

    public static c8q0 create(fk90 fk90Var) {
        return new OnSelectedDelegateImpl(fk90Var);
    }

    public void sendSelected(int i, b5q0 b5q0Var) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i, androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
