package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import java.util.Objects;
import p.aze1;
import p.b5q0;
import p.d2q0;
import p.eg;
import p.qrd;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class OnCheckedChangeDelegateImpl implements d2q0 {
    private final IOnCheckedChangeListener mStub;

    @qrd
    public static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final aze1 mListener;

        public OnCheckedChangeListenerStub(aze1 aze1Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onCheckedChange$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onCheckedChange", new z321() { // from class: androidx.car.app.model.d
                @Override // p.z321
                public final Object b() {
                    return this.a.lambda$onCheckedChange$0(z);
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(aze1 aze1Var) {
        this.mStub = new OnCheckedChangeListenerStub(aze1Var);
    }

    public static d2q0 create(aze1 aze1Var) {
        return new OnCheckedChangeDelegateImpl(aze1Var);
    }

    public void sendCheckedChange(boolean z, b5q0 b5q0Var) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            Objects.requireNonNull(iOnCheckedChangeListener);
            iOnCheckedChangeListener.onCheckedChange(z, androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}
