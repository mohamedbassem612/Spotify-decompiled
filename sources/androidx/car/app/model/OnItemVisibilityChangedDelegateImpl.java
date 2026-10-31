package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import java.util.Objects;
import p.b5q0;
import p.eg;
import p.ek90;
import p.k5q0;
import p.qrd;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class OnItemVisibilityChangedDelegateImpl implements k5q0 {
    private final IOnItemVisibilityChangedListener mStub;

    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final ek90 mListener;

        public OnItemVisibilityChangedListenerStub(ek90 ek90Var) {
            this.mListener = ek90Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i, int i2) {
            this.mListener.c(i, i2);
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onItemVisibilityChanged", new z321() { // from class: androidx.car.app.model.e
                @Override // p.z321
                public final Object b() {
                    return this.a.lambda$onItemVisibilityChanged$0(i, i2);
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(ek90 ek90Var) {
        this.mStub = new OnItemVisibilityChangedListenerStub(ek90Var);
    }

    public static k5q0 create(ek90 ek90Var) {
        return new OnItemVisibilityChangedDelegateImpl(ek90Var);
    }

    public void sendItemVisibilityChanged(int i, int i2, b5q0 b5q0Var) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
