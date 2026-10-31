package p;

import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s8s extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8s(Set set, Function0 function0, float f, Function0 function1, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3) {
        super(1);
        this.e = set;
        this.f = function0;
        this.b = f;
        this.g = function1;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.h = ven0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x010e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0155  */
    /* JADX WARN: Code duplicated, block: B:37:0x0181  */
    /* JADX WARN: Code duplicated, block: B:38:0x0187  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x00d4, please report this as an issue */
    public final Object invoke(Object obj) {
        boolean z;
        long j;
        byte b = this.a;
        float f = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.h;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                Set set = (Set) obj7;
                ven0 ven0Var = (ven0) obj3;
                ven0 ven0Var2 = (ven0) obj2;
                ven0 ven0Var3 = (ven0) obj4;
                int action = motionEvent.getAction();
                if (action == 0) {
                    float x = motionEvent.getX();
                    kaa0.j((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (((long) Float.floatToRawIntBits(x)) << 32), ven0Var3);
                    if (!tm80.J(set, motionEvent)) {
                    }
                } else if (action == 1) {
                    if (Offset.d(Offset.f((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Offset.a(((Offset) ven0Var3.getValue()).a, 1, 0.0f, 0.0f))) < f) {
                        j = 0;
                        kaa0.j(0L, ven0Var2);
                    } else {
                        j = 0;
                        ((Function0) obj5).invoke();
                        ven0Var2.setValue(new Offset(0L));
                    }
                    kaa0.j(j, ven0Var3);
                    if (tm80.J(set, motionEvent)) {
                    }
                } else {
                    if (action != 2) {
                        if (action == 3) {
                            if (Offset.d(Offset.f((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Offset.a(((Offset) ven0Var3.getValue()).a, 1, 0.0f, 0.0f))) < f) {
                                j = 0;
                                kaa0.j(0L, ven0Var2);
                            } else {
                                j = 0;
                                ((Function0) obj5).invoke();
                                ven0Var2.setValue(new Offset(0L));
                            }
                            kaa0.j(j, ven0Var3);
                            z = tm80.J(set, motionEvent) ? false : true;
                        }
                    } else if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        if (tm80.J(set, motionEvent)) {
                            ven0Var.setValue(Boolean.FALSE);
                            ven0Var3.setValue(new Offset(0L));
                        } else {
                            kaa0.j((((long) Float.floatToRawIntBits(motionEvent.getX() - Float.intBitsToFloat((int) (((Offset) ven0Var3.getValue()).a >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), ven0Var2);
                        }
                    } else if (!tm80.J(set, motionEvent)) {
                        ven0Var.setValue(Boolean.TRUE);
                        ((Function0) obj6).invoke();
                        kaa0.j((((long) Float.floatToRawIntBits(motionEvent.getX() - Float.intBitsToFloat((int) (((Offset) ven0Var3.getValue()).a >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), ven0Var2);
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                drr0 drr0Var = (drr0) obj2;
                drr0 drr0Var2 = (drr0) obj5;
                ((ven0) obj4).setValue((Object) null);
                if (zBooleanValue || drr0Var2.s() > 1.01f || drr0Var.s() < f) {
                    drr0Var.t(0.0f);
                    if (drr0Var2.s() <= 1.01f) {
                        drr0Var2.t(1.0f);
                        kaa0.j(0L, (ven0) obj3);
                    }
                } else {
                    ((ss50) obj7).a(0);
                    ((iu30) obj6).invoke(yie1.b);
                }
                return rih1Var;
            default:
                z7l1 z7l1Var = (z7l1) obj7;
                List list = z7l1Var.a.a.b;
                ((rtb0) obj).e(list.size(), new vse1(list, (byte) 18), new vse1(list, (byte) 19), new j2i(2039820996, new c8l1(list, z7l1Var, this.b, (zau0) obj6, (l6k1) obj5, (lvd) obj4, (iac0) obj3, (a9l1) obj2), true));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8s(float f, iu30 iu30Var, ss50 ss50Var, ven0 ven0Var, ven0 ven0Var2, drr0 drr0Var, drr0 drr0Var2) {
        super(1);
        this.b = f;
        this.e = ss50Var;
        this.f = iu30Var;
        this.c = ven0Var;
        this.g = drr0Var;
        this.h = drr0Var2;
        this.d = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8s(z7l1 z7l1Var, float f, zau0 zau0Var, l6k1 l6k1Var, lvd lvdVar, iac0 iac0Var, a9l1 a9l1Var) {
        super(1);
        this.e = z7l1Var;
        this.b = f;
        this.f = zau0Var;
        this.g = l6k1Var;
        this.c = lvdVar;
        this.d = iac0Var;
        this.h = a9l1Var;
    }
}
