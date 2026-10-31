package androidx.car.app.dialer;

import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class a implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TelephoneKeypadCallbackDelegateImpl.TelephoneKeypadCallbackStub b;
    public final /* synthetic */ int c;

    public /* synthetic */ a(TelephoneKeypadCallbackDelegateImpl.TelephoneKeypadCallbackStub telephoneKeypadCallbackStub, int i, byte b) {
        this.a = b;
        this.b = telephoneKeypadCallbackStub;
        this.c = i;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        int i = this.c;
        TelephoneKeypadCallbackDelegateImpl.TelephoneKeypadCallbackStub telephoneKeypadCallbackStub = this.b;
        switch (b) {
            case 0:
                return telephoneKeypadCallbackStub.lambda$onKeyLongPress$0(i);
            case 1:
                return telephoneKeypadCallbackStub.lambda$onKeyDown$1(i);
            default:
                return telephoneKeypadCallbackStub.lambda$onKeyUp$2(i);
        }
    }
}
