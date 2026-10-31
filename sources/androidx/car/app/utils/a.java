package androidx.car.app.utils;

import p.tcc;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class a implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ tcc c;

    public /* synthetic */ a(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, tcc tccVar, byte b) {
        this.a = b;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = tccVar;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        tcc tccVar = this.c;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.b;
        switch (b) {
            case 0:
                return remoteUtils$SurfaceCallbackStub.lambda$onSurfaceDestroyed$3(tccVar);
            default:
                return remoteUtils$SurfaceCallbackStub.lambda$onSurfaceAvailable$0(tccVar);
        }
    }
}
