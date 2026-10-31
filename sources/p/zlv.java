package p;

import android.graphics.Color;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zlv {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static final void a(g0i g0iVar, qdd1 qdd1Var, qdd1 qdd1Var2) {
        hm5 bmvVar;
        View decorView = g0iVar.getWindow().getDecorView();
        boolean zBooleanValue = ((Boolean) qdd1Var.d.invoke(decorView.getResources())).booleanValue();
        boolean zBooleanValue2 = ((Boolean) qdd1Var2.d.invoke(decorView.getResources())).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            bmvVar = new emv();
        } else if (i >= 29) {
            bmvVar = new dmv();
        } else if (i >= 28) {
            bmvVar = new cmv();
        } else {
            bmvVar = i >= 26 ? new bmv() : new amv();
        }
        hm5 hm5Var = bmvVar;
        hm5Var.K(qdd1Var, qdd1Var2, g0iVar.getWindow(), decorView, zBooleanValue, zBooleanValue2);
        hm5Var.j(g0iVar.getWindow());
    }

    public static /* synthetic */ void b(t3b1 t3b1Var, qdd1 qdd1Var, int i) {
        if ((i & 1) != 0) {
            qdd1Var = jma.e(0, 0);
        }
        a(t3b1Var, qdd1Var, jma.e(a, b));
    }
}
