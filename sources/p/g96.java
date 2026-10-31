package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g96 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g96(iu30 iu30Var, boolean z, mqt0 mqt0Var, zau0 zau0Var, tob1 tob1Var) {
        super(0);
        this.a = (byte) 2;
        this.d = iu30Var;
        this.b = z;
        this.c = mqt0Var;
        this.e = zau0Var;
        this.f = tob1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((ven0) obj3).setValue(Boolean.TRUE);
                ((iu30) obj).invoke(new u76((String) ((ven0) obj2).getValue(), ((l96) obj4).e.g().a.a, z));
                return rih1Var;
            case 1:
                ((x860) obj4).b((String) obj, (String) obj3, (tv80) obj2, z);
                return rih1Var;
            case 2:
                kly0 kly0Var = ((mqt0) obj4).c;
                tob1 tob1Var = (tob1) obj2;
                zau0 zau0Var = (zau0) obj3;
                ((iu30) obj).invoke(new iqt0(z));
                if (z) {
                    r091 r091Var = (r091) tob1Var.getValue();
                    if (r091Var != null) {
                        r091Var.c();
                    }
                    ((ttm0) kly0Var.get()).b(zau0Var);
                } else if (((Boolean) zau0Var.b.getValue()).booleanValue()) {
                    r091 r091Var2 = (r091) tob1Var.getValue();
                    if (r091Var2 != null) {
                        r091Var2.k();
                        r091.f(r091Var2, (tv80) null, (Long) null, uky0.a, 7);
                    }
                } else {
                    ((ttm0) kly0Var.get()).a(zau0Var);
                }
                return rih1Var;
            case 3:
                ((wmy) obj4).s((String) obj, (String) obj3, (tv80) obj2, z);
                return rih1Var;
            case 4:
                ven0 ven0Var = (ven0) obj3;
                hjn hjnVar = (hjn) ven0Var.getValue();
                if (hjnVar != null) {
                    if (hjnVar.c) {
                        if (z) {
                            k5k k5kVar = sam1.a;
                            ((qam1) obj4).a(4);
                        }
                        ((Function0) obj).invoke();
                    }
                    ((drr0) obj2).t(0.0f);
                    ven0Var.setValue((Object) null);
                }
                return rih1Var;
            case 5:
                ((ven0) obj3).setValue(z ? null : ((g7m1) obj4).d);
                ((ven0) obj2).setValue(Boolean.valueOf(!z));
                ((svh0) obj).b = false;
                return rih1Var;
            default:
                float fFloatValue = ((Number) ((tob1) obj4).getValue()).floatValue();
                return Boolean.valueOf(((Number) ((ven0) obj).getValue()).intValue() > 0 && (!z ? fFloatValue > 0.0f : fFloatValue < 1.0f) && (!Offset.c(((Offset) ((ven0) obj3).getValue()).a, 9205357640488583168L) && !Offset.c(((Offset) ((ven0) obj2).getValue()).a, 9205357640488583168L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g96(l96 l96Var, iu30 iu30Var, boolean z, ven0 ven0Var, ven0 ven0Var2) {
        super(0);
        this.a = (byte) 0;
        this.c = l96Var;
        this.d = iu30Var;
        this.b = z;
        this.e = ven0Var;
        this.f = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g96(Object obj, String str, String str2, boolean z, tv80 tv80Var, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.d = str;
        this.e = str2;
        this.b = z;
        this.f = tv80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g96(ven0 ven0Var, boolean z, g7m1 g7m1Var, ven0 ven0Var2, svh0 svh0Var) {
        super(0);
        this.a = (byte) 5;
        this.e = ven0Var;
        this.b = z;
        this.c = g7m1Var;
        this.f = ven0Var2;
        this.d = svh0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g96(boolean z, tob1 tob1Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3) {
        super(0);
        this.a = (byte) 6;
        this.b = z;
        this.c = tob1Var;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.d = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g96(boolean z, qam1 qam1Var, Function0 function0, ven0 ven0Var, drr0 drr0Var) {
        super(0);
        this.a = (byte) 4;
        this.b = z;
        this.c = qam1Var;
        this.d = function0;
        this.e = ven0Var;
        this.f = drr0Var;
    }
}
