package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import java.util.Objects;
import p.aw41;
import p.b5q0;
import p.db51;
import p.eg;
import p.qrd;
import p.zv41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class SearchCallbackDelegateImpl implements aw41 {
    private final ISearchCallback mStubCallback;

    @qrd
    public static class SearchCallbackStub extends ISearchCallback.Stub {
        private final zv41 mSearchCallback;

        public SearchCallbackStub(zv41 zv41Var) {
            this.mSearchCallback = zv41Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object lambda$onSearchSubmitted$1(String str) {
            ((db51) this.mSearchCallback.b).c1.a(str);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object lambda$onSearchTextChanged$0(String str) {
            ((db51) this.mSearchCallback.b).b1.a(str);
            return null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onSearchSubmitted", new f(this, str, (byte) 0));
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.f.b(iOnDoneCallback, "onSearchTextChanged", new f(this, str, (byte) 1));
        }
    }

    private SearchCallbackDelegateImpl(zv41 zv41Var) {
        this.mStubCallback = new SearchCallbackStub(zv41Var);
    }

    public static aw41 create(zv41 zv41Var) {
        return new SearchCallbackDelegateImpl(zv41Var);
    }

    public void sendSearchSubmitted(String str, b5q0 b5q0Var) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchSubmitted(str, androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    public void sendSearchTextChanged(String str, b5q0 b5q0Var) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchTextChanged(str, androidx.car.app.utils.f.a());
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
