package androidx.car.app.navigation.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.f;
import java.util.Objects;
import p.b5q0;
import p.eg;
import p.gnr0;
import p.hnr0;
import p.qrd;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class PanModeDelegateImpl implements gnr0 {
    private final IPanModeListener mStub;

    @qrd
    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final hnr0 mListener;

        public PanModeListenerStub(hnr0 hnr0Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            f.b(iOnDoneCallback, "onPanModeChanged", new z321() { // from class: androidx.car.app.navigation.model.a
                @Override // p.z321
                public final Object b() {
                    return this.a.lambda$onPanModeChanged$0(z);
                }
            });
        }
    }

    private PanModeDelegateImpl(hnr0 hnr0Var) {
        this.mStub = new PanModeListenerStub(hnr0Var);
    }

    public static gnr0 create(hnr0 hnr0Var) {
        return new PanModeDelegateImpl(hnr0Var);
    }

    public void sendPanModeChanged(boolean z, b5q0 b5q0Var) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z, f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
