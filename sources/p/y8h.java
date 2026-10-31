package p;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y8h extends tua0 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8h(List list, byte b) {
        super(list);
        this.i = b;
    }

    public final Object f(sua0 sua0Var, float f) {
        switch (this.i) {
            case 0:
                break;
        }
        return Integer.valueOf(l(sua0Var, f));
    }

    public int k() {
        return l(((fba) this).c.c(), c());
    }

    public final int l(sua0 sua0Var, float f) {
        Float f2;
        Integer num;
        int iIntValue;
        float f3;
        switch (this.i) {
            case 0:
                Object obj = sua0Var.b;
                Object obj2 = sua0Var.b;
                if (obj == null || sua0Var.c == null) {
                    eg.m("Missing values for keyframe.");
                    return 0;
                }
                j2e0 j2e0Var = ((fba) this).e;
                return (j2e0Var == null || (f2 = sua0Var.h) == null || (num = (Integer) j2e0Var.j(sua0Var.g, f2.floatValue(), (Integer) obj2, (Integer) sua0Var.c, f, d(), ((fba) this).d)) == null) ? cxm.t(((Integer) obj2).intValue(), ((Integer) sua0Var.c).intValue(), itj0.b(f, 0.0f, 1.0f)) : num.intValue();
            default:
                Object obj3 = sua0Var.b;
                Object obj4 = sua0Var.b;
                if (obj3 == null) {
                    eg.m("Missing values for keyframe.");
                    return 0;
                }
                Object obj5 = sua0Var.c;
                if (obj5 == null) {
                    iIntValue = sua0Var.k;
                    if (iIntValue == 784923401) {
                        iIntValue = ((Integer) obj3).intValue();
                        sua0Var.k = iIntValue;
                    }
                } else {
                    int iIntValue2 = sua0Var.l;
                    if (iIntValue2 == 784923401) {
                        iIntValue2 = ((Integer) obj5).intValue();
                        sua0Var.l = iIntValue2;
                    }
                    iIntValue = iIntValue2;
                }
                j2e0 j2e0Var2 = ((fba) this).e;
                if (j2e0Var2 != null) {
                    f3 = f;
                    Integer num2 = (Integer) j2e0Var2.j(sua0Var.g, sua0Var.h.floatValue(), (Integer) obj4, Integer.valueOf(iIntValue), f3, d(), ((fba) this).d);
                    if (num2 != null) {
                        return num2.intValue();
                    }
                } else {
                    f3 = f;
                }
                int iIntValue3 = sua0Var.k;
                if (iIntValue3 == 784923401) {
                    iIntValue3 = ((Integer) obj4).intValue();
                    sua0Var.k = iIntValue3;
                }
                PointF pointF = itj0.a;
                return (int) ((f3 * (iIntValue - iIntValue3)) + iIntValue3);
        }
    }
}
