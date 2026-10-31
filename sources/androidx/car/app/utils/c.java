package androidx.car.app.utils;

import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class c implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ c(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2, byte b) {
        this.a = b;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = f;
        this.d = f2;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.b;
        switch (b) {
            case 0:
                return remoteUtils$SurfaceCallbackStub.lambda$onClick$7(f2, f);
            case 1:
                return remoteUtils$SurfaceCallbackStub.lambda$onScroll$4(f2, f);
            default:
                return remoteUtils$SurfaceCallbackStub.lambda$onFling$5(f2, f);
        }
    }
}
