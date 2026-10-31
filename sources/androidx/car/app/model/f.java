package androidx.car.app.model;

import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class f implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, byte b) {
        this.a = b;
        this.b = searchCallbackStub;
        this.c = str;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        String str = this.c;
        SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub = this.b;
        switch (b) {
            case 0:
                return searchCallbackStub.lambda$onSearchSubmitted$1(str);
            default:
                return searchCallbackStub.lambda$onSearchTextChanged$0(str);
        }
    }
}
