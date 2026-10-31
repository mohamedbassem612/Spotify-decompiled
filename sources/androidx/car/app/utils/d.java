package androidx.car.app.utils;

import android.graphics.Rect;
import p.z321;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class d implements z321 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RemoteUtils$SurfaceCallbackStub b;
    public final /* synthetic */ Rect c;

    public /* synthetic */ d(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect, byte b) {
        this.a = b;
        this.b = remoteUtils$SurfaceCallbackStub;
        this.c = rect;
    }

    @Override // p.z321
    public final Object b() {
        byte b = this.a;
        Rect rect = this.c;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = this.b;
        switch (b) {
            case 0:
                return remoteUtils$SurfaceCallbackStub.lambda$onVisibleAreaChanged$1(rect);
            default:
                return remoteUtils$SurfaceCallbackStub.lambda$onStableAreaChanged$2(rect);
        }
    }
}
