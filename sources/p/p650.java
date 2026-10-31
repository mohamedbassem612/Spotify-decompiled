package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p650 extends tua0 {
    public final /* synthetic */ byte i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p650(List list, byte b) {
        super(list);
        this.i = b;
        switch (b) {
            case 1:
                super(list);
                this.j = new pg41();
                break;
            default:
                int iMax = 0;
                for (int i = 0; i < list.size(); i++) {
                    o650 o650Var = (o650) ((sua0) list.get(i)).b;
                    if (o650Var != null) {
                        iMax = Math.max(iMax, o650Var.b.length);
                    }
                }
                this.j = new o650(new float[iMax], new int[iMax]);
                break;
        }
    }

    public final Object f(sua0 sua0Var, float f) {
        Object obj;
        float f2;
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                o650 o650Var = (o650) obj2;
                o650 o650Var2 = (o650) sua0Var.b;
                o650 o650Var3 = (o650) sua0Var.c;
                int[] iArr = o650Var.b;
                float[] fArr = o650Var.a;
                boolean zEquals = o650Var2.equals(o650Var3);
                int[] iArr2 = o650Var2.b;
                if (zEquals || f <= 0.0f) {
                    o650Var.a(o650Var2);
                } else if (f >= 1.0f) {
                    o650Var.a(o650Var3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = o650Var3.b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        hhg1.n(gvg.j(sb, iArr3.length, ")"));
                        return null;
                    }
                    for (int i = 0; i < iArr2.length; i++) {
                        fArr[i] = itj0.e(o650Var2.a[i], o650Var3.a[i], f);
                        iArr[i] = cxm.t(iArr2[i], iArr3[i], f);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return o650Var;
            default:
                pg41 pg41Var = (pg41) obj2;
                Object obj3 = sua0Var.b;
                if (obj3 == null || (obj = sua0Var.c) == null) {
                    eg.m("Missing values for keyframe.");
                    return null;
                }
                pg41 pg41Var2 = (pg41) obj3;
                pg41 pg41Var3 = (pg41) obj;
                j2e0 j2e0Var = ((fba) this).e;
                if (j2e0Var != null) {
                    f2 = f;
                    pg41 pg41Var4 = (pg41) j2e0Var.j(sua0Var.g, sua0Var.h.floatValue(), pg41Var2, pg41Var3, f2, d(), ((fba) this).d);
                    if (pg41Var4 != null) {
                        return pg41Var4;
                    }
                } else {
                    f2 = f;
                }
                float fE = itj0.e(pg41Var2.a, pg41Var3.a, f2);
                float fE2 = itj0.e(pg41Var2.b, pg41Var3.b, f2);
                pg41Var.a = fE;
                pg41Var.b = fE2;
                return pg41Var;
        }
    }
}
