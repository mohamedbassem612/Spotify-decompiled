package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import java.util.Objects;
import p.b5q0;
import p.e2q0;
import p.eg;
import p.f2q0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class OnClickDelegateImpl implements e2q0 {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    public static class OnClickListenerStub extends IOnClickListener.Stub {
        private final f2q0 mOnClickListener;

        public OnClickListenerStub(f2q0 f2q0Var) {
            this.mOnClickListener = f2q0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onClick$0() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onClick", new a(this, (byte) 1));
        }
    }

    private OnClickDelegateImpl(f2q0 f2q0Var, boolean z) {
        this.mListener = new OnClickListenerStub(f2q0Var);
        this.mIsParkedOnly = z;
    }

    public static e2q0 create(f2q0 f2q0Var) {
        return new OnClickDelegateImpl(f2q0Var, f2q0Var instanceof ParkedOnlyOnClickListener);
    }

    @Override // p.e2q0
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(b5q0 b5q0Var) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
