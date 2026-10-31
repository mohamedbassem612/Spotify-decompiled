package p;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aav0 extends tua0 {
    public final PointF i;

    public aav0(List list) {
        super(list);
        this.i = new PointF();
    }

    @Override // p.fba
    public final Object f(sua0 sua0Var, float f) {
        return g(sua0Var, f, f, f);
    }

    @Override // p.fba
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF g(sua0 sua0Var, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = sua0Var.b;
        if (obj2 == null || (obj = sua0Var.c) == null) {
            eg.m("Missing values for keyframe.");
            return null;
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        j2e0 j2e0Var = this.e;
        if (j2e0Var != null && (pointF = (PointF) j2e0Var.j(sua0Var.g, sua0Var.h.floatValue(), pointF2, pointF3, f, d(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF2.x;
        float fE = l1d.e(pointF3.x, f4, f2, f4);
        float f5 = pointF2.y;
        float fE2 = l1d.e(pointF3.y, f5, f3, f5);
        PointF pointF4 = this.i;
        pointF4.set(fE, fE2);
        return pointF4;
    }
}
