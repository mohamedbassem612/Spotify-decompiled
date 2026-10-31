package androidx.car.app;

import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class a implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, byte b) {
        this.a = b;
        this.b = kVar;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        k kVar = this.b;
        switch (b) {
            case 0:
                return AppManager$1.lambda$onBackPressed$0(kVar);
            case 1:
                return AppManager$1.lambda$stopLocationUpdates$2(kVar);
            default:
                return AppManager$1.lambda$startLocationUpdates$1(kVar);
        }
    }
}
