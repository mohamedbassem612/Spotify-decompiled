package androidx.car.app.model;

import android.os.Binder;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class a implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Binder b;

    public /* synthetic */ a(Binder binder, byte b) {
        this.a = b;
        this.b = binder;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        Binder binder = this.b;
        switch (b) {
            case 0:
                return ((AlertCallbackDelegateImpl.AlertCallbackStub) binder).lambda$onAlertDismissed$1();
            case 1:
                return ((OnClickDelegateImpl.OnClickListenerStub) binder).lambda$onClick$0();
            default:
                return ((OnContentRefreshDelegateImpl.OnContentRefreshListenerStub) binder).lambda$onContentRefreshRequested$0();
        }
    }
}
