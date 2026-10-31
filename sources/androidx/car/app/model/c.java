package androidx.car.app.model;

import android.os.Binder;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class c implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Binder b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(Binder binder, String str, byte b) {
        this.a = b;
        this.b = binder;
        this.c = str;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        String str = this.c;
        Binder binder = this.b;
        switch (b) {
            case 0:
                return ((InputCallbackDelegateImpl.OnInputCallbackStub) binder).lambda$onInputTextChanged$1(str);
            case 1:
                return ((InputCallbackDelegateImpl.OnInputCallbackStub) binder).lambda$onInputSubmitted$0(str);
            default:
                return ((TabCallbackDelegateImpl.TabCallbackStub) binder).lambda$onTabSelected$0(str);
        }
    }
}
