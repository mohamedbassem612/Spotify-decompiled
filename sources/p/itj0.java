package p;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class itj0 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void d(lw61 lw61Var, Path path) {
        Path path2;
        path.reset();
        PointF pointF = lw61Var.b;
        ArrayList arrayList = lw61Var.a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            deo deoVar = (deo) arrayList.get(i);
            PointF pointF3 = deoVar.a;
            PointF pointF4 = deoVar.b;
            PointF pointF5 = deoVar.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (lw61Var.c) {
            path3.close();
        }
    }

    public static float e(float f, float f2, float f3) {
        return l1d.e(f2, f, f3, f);
    }

    public static void f(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2, mpa0 mpa0Var) {
        if (kpa0Var.b(i, mpa0Var.getName())) {
            arrayList.add(kpa0Var2.a(mpa0Var.getName()).g(mpa0Var));
        }
    }
}
