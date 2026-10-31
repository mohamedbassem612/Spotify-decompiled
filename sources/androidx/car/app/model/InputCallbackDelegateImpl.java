package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import java.util.Objects;
import p.ai80;
import p.b5q0;
import p.bi80;
import p.eg;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class InputCallbackDelegateImpl implements bi80 {
    private final IInputCallback mCallback;

    @qrd
    public static class OnInputCallbackStub extends IInputCallback.Stub {
        private final ai80 mCallback;

        public OnInputCallbackStub(ai80 ai80Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputSubmitted$0(String str) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputTextChanged$1(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onInputSubmitted", new c(this, str, (byte) 1));
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onInputTextChanged", new c(this, str, (byte) 0));
        }
    }

    private InputCallbackDelegateImpl(ai80 ai80Var) {
        this.mCallback = new OnInputCallbackStub(ai80Var);
    }

    public static bi80 create(ai80 ai80Var) {
        Objects.requireNonNull(ai80Var);
        throw new ClassCastException();
    }

    public void sendInputSubmitted(String str, b5q0 b5q0Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    public void sendInputTextChanged(String str, b5q0 b5q0Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
