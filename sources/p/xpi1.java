package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xpi1 {
    public static final long a = jjl.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final ri7 a(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        if (!((Boolean) x340Var.k(cn80.a)).booleanValue()) {
            x340Var.i0(2019129125);
            x340Var.r(false);
            return null;
        }
        x340Var.i0(2019071620);
        ri7 ri7Var = (ri7) x340Var.k(qce0.a());
        x340Var.r(false);
        return ri7Var;
    }

    public static final z291 b(j6m j6mVar, b0k b0kVar) {
        boolean zJ = u890.j(j6mVar, mif1.U0);
        x340 x340Var = (x340) b0kVar;
        boolean zH = x340Var.h(zJ);
        Object objT = x340Var.T();
        if (zH || objT == fkj0.X) {
            objT = zJ ? z291.l0 : new ljl();
            x340Var.s0(objT);
        }
        return (z291) objT;
    }

    public static final zy70 c(Object obj, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1319639034);
        if (obj instanceof zy70) {
            x340Var.i0(1530922508);
            zy70 zy70Var = (zy70) obj;
            x340Var.r(false);
            x340Var.r(false);
            return zy70Var;
        }
        x340Var.i0(1530961754);
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        boolean zG = x340Var.g(context) | x340Var.g(obj);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            vy70 vy70Var = new vy70(context);
            vy70Var.c = obj;
            objT = vy70Var.a();
            x340Var.s0(objT);
        }
        zy70 zy70Var2 = (zy70) objT;
        x340Var.r(false);
        x340Var.r(false);
        return zy70Var2;
    }

    public static final long d(long j) {
        int iU = jch0.U(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) jch0.U(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iU) << 32);
    }

    public static void e(String str) {
        throw new IllegalArgumentException(gvg.h("Unsupported type: ", str, ". ", f4i1.f("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void f(zy70 zy70Var) {
        Object obj = zy70Var.b;
        if (obj instanceof vy70) {
            hhg1.n("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof yk4) {
            e("ImageBitmap");
            throw null;
        }
        if (obj instanceof b180) {
            e("ImageVector");
            throw null;
        }
        if (obj instanceof jmr0) {
            e("Painter");
            throw null;
        }
        wwo1.O(zy70Var);
    }
}
