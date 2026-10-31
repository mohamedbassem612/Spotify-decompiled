package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Parcelable;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class c implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CarAppBinder b;
    public final /* synthetic */ Parcelable c;

    public /* synthetic */ c(CarAppBinder carAppBinder, Parcelable parcelable, byte b) {
        this.a = b;
        this.b = carAppBinder;
        this.c = parcelable;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        Parcelable parcelable = this.c;
        CarAppBinder carAppBinder = this.b;
        switch (b) {
            case 0:
                return carAppBinder.lambda$onConfigurationChanged$6((Configuration) parcelable);
            default:
                return carAppBinder.lambda$onNewIntent$5((Intent) parcelable);
        }
    }
}
