package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i9m extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9m(Function0 function0, float f, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(1);
        this.a = b;
        this.b = function0;
        this.c = f;
        this.d = iu30Var;
        this.e = ven0Var;
        this.f = ven0Var2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        float f = this.c;
        Function0 function0 = this.b;
        ven0 ven0Var = this.e;
        ven0 ven0Var2 = this.f;
        switch (b) {
            case 0:
                y9e1 y9e1Var = (y9e1) obj;
                if (y9e1Var.d()) {
                    if (((Boolean) ven0Var.getValue()).booleanValue() && ((Integer) ven0Var2.getValue()) == null && function0 != null) {
                        ven0Var2.setValue(Integer.valueOf(irn1.P(y9e1Var, f)));
                    }
                    iu30Var.invoke(new b9m(true));
                }
                break;
            case 1:
                y9e1 y9e1Var2 = (y9e1) obj;
                if (y9e1Var2.d() && !((Boolean) ven0Var.getValue()).booleanValue() && function0 != null) {
                    ven0Var.setValue(Boolean.TRUE);
                    ven0Var2.setValue(Integer.valueOf(irn1.P(y9e1Var2, f)));
                    iu30Var.invoke(new b9m(true));
                }
                break;
            default:
                y9e1 y9e1Var3 = (y9e1) obj;
                ven0Var.setValue(Boolean.valueOf(y9e1Var3.d()));
                if (((Boolean) ven0Var.getValue()).booleanValue() && ((Integer) ven0Var2.getValue()) == null && function0 != null) {
                    zrm0 zrm0Var = y9e1Var3.b;
                    int i = zrm0Var.f;
                    long j = y9e1Var3.c;
                    Iterator it = yoi1.Q(0, i).iterator();
                    Object obj2 = null;
                    while (((sr80) it).c) {
                        Object next = ((lr80) it).next();
                        it = it;
                        if (zrm0Var.b(((Number) next).intValue()) <= ((int) (j & 4294967295L))) {
                            obj2 = next;
                        }
                    }
                    Integer num = (Integer) obj2;
                    int iIntValue = num != null ? num.intValue() : i - 1;
                    float f2 = (int) (j >> 32);
                    int iCeil = ((int) Math.ceil(f / f2)) - 1;
                    if (iCeil < 0) {
                        iCeil = 0;
                    }
                    int i2 = iIntValue - iCeil;
                    int i3 = i2 < 0 ? 0 : i2;
                    float f3 = f - ((iIntValue - i3) * f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    int iC = zrm0Var.c(i3, true);
                    int i4 = y9e1Var3.i(i3);
                    if (i4 <= iC) {
                        while (true) {
                            if (f2 - y9e1Var3.e(iC, true) >= f3) {
                                i4 = iC;
                            } else if (iC != i4) {
                                iC--;
                            }
                        }
                    }
                    ven0Var2.setValue(Integer.valueOf(i4));
                }
                iu30Var.invoke(new mz71(((Boolean) ven0Var.getValue()).booleanValue()));
                break;
        }
        return rih1Var;
    }
}
