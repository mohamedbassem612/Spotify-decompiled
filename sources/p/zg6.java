package p;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zg6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg6(boolean z, String str, Function0 function0, iu30 iu30Var) {
        super(0);
        this.a = (byte) 10;
        this.b = z;
        this.e = str;
        this.d = function0;
        this.c = iu30Var;
    }

    public final Object invoke() {
        boolean z = false;
        switch (this.a) {
            case 0:
                ((ven0) this.c).setValue(Boolean.TRUE);
                if (this.b) {
                    ((Function0) this.d).invoke();
                    ((Function0) this.e).invoke();
                }
                return rih1.a;
            case 1:
                mbm1 mbm1Var = ((a6d) this.d).e;
                Object obj = this.e;
                if (this.b && ((Boolean) ((ven0) this.c).getValue()).booleanValue()) {
                    z = true;
                }
                synchronized (mbm1Var) {
                    LinkedHashSet linkedHashSet = mbm1Var.d;
                    if (z) {
                        linkedHashSet.add(obj);
                    } else {
                        linkedHashSet.remove(obj);
                    }
                }
                return rih1.a;
            case 2:
                ((iu30) this.d).invoke(new cih((sn51) this.c, ((ewe1) this.e).c, this.b));
                return rih1.a;
            case 3:
                if (this.b) {
                    ((ven0) this.c).setValue(Boolean.TRUE);
                } else {
                    String string = ihc1.e1(((y7e1) this.d).d().d.toString()).toString();
                    if (string.length() > 0) {
                        ((iu30) this.e).invoke(string);
                    }
                }
                return rih1.a;
            case 4:
                zc20 zc20Var = (zc20) this.c;
                yc20 yc20Var = (yc20) this.e;
                boolean z2 = this.b;
                iu30 iu30Var = (iu30) this.d;
                if (z2) {
                    iu30Var.invoke(new vc20(yc20Var, zc20Var));
                } else {
                    iu30Var.invoke(new wc20(yc20Var, zc20Var));
                }
                return rih1.a;
            case 5:
                upb0 upb0Var = (upb0) this.d;
                fdc fdcVar = upb0Var.d;
                int iS = ((err0) fdcVar.c).s();
                int[] iArr = (int[]) this.e;
                boolean z3 = this.b || Math.abs(iS - iArr[0]) > 3;
                iArr[0] = iS;
                return new pkk1(upb0Var.h().n.size() + ((err0) fdcVar.c).s(), ((err0) fdcVar.c).s(), ((Boolean) ((tob1) this.c).getValue()).booleanValue() ? 2 : 1, z3);
            case 6:
                if (((e0q0) this.e) instanceof b0q0) {
                    ((ss50) this.c).a(17);
                }
                if (!this.b) {
                    ((Function0) this.d).invoke();
                }
                return rih1.a;
            case 7:
                float fFloatValue = ((Number) ((tob1) this.d).getValue()).floatValue();
                if (this.b) {
                    ((drr0) this.e).t(fFloatValue);
                }
                return Float.valueOf(dm5.T(0.16666667f, fFloatValue, ((Number) ((tob1) this.c).getValue()).floatValue()));
            case 8:
                xfx xfxVar = (xfx) this.d;
                ufx ufxVar = xfxVar.d;
                return new uhs(ufxVar.a, (ivj1) this.e, ufxVar.b, (af10) this.c, new nzj(xfxVar.a.a, q9j.a), this.b);
            case 9:
                String str = null;
                if (this.b) {
                    String string2 = ((y7e1) ((ven0) this.c).getValue()).d().d.toString();
                    if (!ihc1.y0(string2)) {
                        str = string2;
                    }
                }
                ((iu30) this.d).invoke(new irz0(o7h.l1((Set) ((ven0) this.e).getValue()), str));
                return rih1.a;
            case 10:
                if (this.b) {
                    String str2 = (String) this.e;
                    iu30 iu30Var2 = (iu30) this.c;
                    if (iu30Var2 != null) {
                        iu30Var2.invoke(str2);
                    }
                } else {
                    Function0 function0 = (Function0) this.d;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return rih1.a;
            default:
                ((ven0) this.c).setValue(Boolean.FALSE);
                ven0 ven0Var = (ven0) this.e;
                if (this.b && !((rk41) this.d).a) {
                    z = true;
                }
                ven0Var.setValue(Boolean.valueOf(z));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg6(Object obj, Object obj2, boolean z, tob1 tob1Var, byte b) {
        super(0);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = tob1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg6(e0q0 e0q0Var, ss50 ss50Var, boolean z, Function0 function0) {
        super(0);
        this.a = (byte) 6;
        this.e = e0q0Var;
        this.c = ss50Var;
        this.b = z;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg6(tob1 tob1Var, boolean z, drr0 drr0Var, tob1 tob1Var2) {
        super(0);
        this.a = (byte) 7;
        this.d = tob1Var;
        this.b = z;
        this.e = drr0Var;
        this.c = tob1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg6(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg6(boolean z, Object obj, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.d = obj;
        this.c = ven0Var;
        this.e = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg6(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        super(0);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = z;
    }
}
