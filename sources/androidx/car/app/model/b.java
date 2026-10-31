package androidx.car.app.model;

import android.os.Binder;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class b implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Binder c;

    public /* synthetic */ b(Binder binder, int i, byte b) {
        this.a = b;
        this.c = binder;
        this.b = i;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        int i = this.b;
        Binder binder = this.c;
        switch (b) {
            case 0:
                return ((AlertCallbackDelegateImpl.AlertCallbackStub) binder).lambda$onAlertCancelled$0(i);
            default:
                return ((OnSelectedDelegateImpl.OnSelectedListenerStub) binder).lambda$onSelected$0(i);
        }
    }
}
