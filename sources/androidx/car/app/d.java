package androidx.car.app;

import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class d implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarAppBinder b;

    public /* synthetic */ d(CarAppBinder carAppBinder, byte b) {
        this.a = b;
        this.b = carAppBinder;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        CarAppBinder carAppBinder = this.b;
        switch (b) {
            case 0:
                return carAppBinder.lambda$onAppResume$2();
            case 1:
                return carAppBinder.lambda$getAppTheme$9();
            case 2:
                return carAppBinder.lambda$onAppPause$3();
            case 3:
                return carAppBinder.lambda$onAppStart$1();
            default:
                return carAppBinder.lambda$onAppStop$4();
        }
    }
}
