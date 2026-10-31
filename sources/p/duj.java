package p;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class duj extends View.DragShadowBuilder {
    public final xat a;
    public final long b;
    public final iu30 c;

    public duj(xat xatVar, long j, iu30 iu30Var) {
        this.a = xatVar;
        this.b = j;
        this.c = iu30Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        vid vidVar = new vid();
        Canvas canvas2 = v84.a;
        u84 u84Var = new u84();
        u84Var.a = canvas;
        uid uidVar = vidVar.a;
        wat watVar = uidVar.a;
        flb0 flb0Var = uidVar.b;
        fid fidVar = uidVar.c;
        long j = uidVar.d;
        uidVar.a = this.a;
        uidVar.b = flb0.a;
        uidVar.c = u84Var;
        uidVar.d = this.b;
        u84Var.q();
        this.c.invoke(vidVar);
        u84Var.i();
        uidVar.a = watVar;
        uidVar.b = flb0Var;
        uidVar.c = fidVar;
        uidVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        xat xatVar = this.a;
        point.set(xatVar.i0(fIntBitsToFloat / xatVar.h()), xatVar.i0(Float.intBitsToFloat((int) (j & 4294967295L)) / xatVar.h()));
        point2.set(point.x / 2, point.y / 2);
    }
}
