package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pxj extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxj(upb0 upb0Var, float f, wat watVar, tob1 tob1Var) {
        super(0);
        this.a = (byte) 1;
        this.c = upb0Var;
        this.b = f;
        this.d = watVar;
        this.e = tob1Var;
    }

    public final Object invoke() {
        Float fValueOf;
        byte b = this.a;
        float fO = 0.0f;
        rih1 rih1Var = rih1.a;
        Object obj = this.e;
        float f = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) ((ven0) obj2).getValue()).floatValue() + f;
                drr0 drr0Var = (drr0) obj;
                y6 it = ((dw91) obj3).d.iterator();
                y6 y6Var = it;
                if (y6Var.hasNext()) {
                    tpb1 tpb1Var = (tpb1) it;
                    uwj uwjVar = (uwj) tpb1Var.next();
                    float fMax = (Math.max(uwjVar.a, fFloatValue) + uwjVar.b) - drr0Var.s();
                    if (fMax < 0.0f) {
                        fMax = 0.0f;
                    }
                    while (y6Var.hasNext()) {
                        uwj uwjVar2 = (uwj) tpb1Var.next();
                        float fMax2 = (Math.max(uwjVar2.a, fFloatValue) + uwjVar2.b) - drr0Var.s();
                        if (fMax2 < 0.0f) {
                            fMax2 = 0.0f;
                        }
                        fMax = Math.max(fMax, fMax2);
                    }
                    fValueOf = Float.valueOf(fMax);
                } else {
                    fValueOf = null;
                }
                return Float.valueOf(fValueOf != null ? fValueOf.floatValue() : 0.0f);
            case 1:
                upb0 upb0Var = (upb0) obj3;
                gg50 gg50Var = (gg50) ((tob1) obj).getValue();
                if (gg50Var.b != 0) {
                    List list = upb0Var.h().n;
                    if (!list.isEmpty()) {
                        float f2 = gg50Var.f - f;
                        if (!upb0Var.d()) {
                            fO = 1.0f;
                        } else if (upb0Var.c()) {
                            mpb0 mpb0Var = (mpb0) o7h.q0(list);
                            int i = (int) (mpb0Var.v & 4294967295L);
                            float fS = mpb0Var.x + (i > 0 ? ((err0) upb0Var.d.d).s() / i : 0.0f);
                            int i2 = gg50Var.b - gg50Var.d;
                            if (i2 < 1) {
                                i2 = 1;
                            }
                            fO = yoi1.o(fS / i2, 0.0f, 1.0f);
                        }
                        fO = (fO * f2) / ((wat) obj2).h();
                    }
                }
                return new p3v(fO);
            case 2:
                iu30 iu30Var = (iu30) obj;
                if (((zl11) obj3).h) {
                    pfu0 pfu0Var = (u4p1) obj2;
                    iu30Var.invoke(new vl11(pfu0Var instanceof pfu0 ? (long) (f * pfu0Var.d) : 0L));
                } else {
                    iu30Var.invoke(ul11.a);
                }
                return rih1Var;
            default:
                s24 s24Var = (s24) obj;
                ((iu30) obj3).invoke(new vxl(((wat) obj2).i0(((f - ((p3v) ((hrr0) s24Var.Z).getValue()).a) - ((p3v) ((hrr0) s24Var.Y).getValue()).a) - ((p3v) ((hrr0) s24Var.N0).getValue()).a)));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pxj(Object obj, Object obj2, float f, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = f;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxj(float f, dw91 dw91Var, ven0 ven0Var, drr0 drr0Var) {
        super(0);
        this.a = (byte) 0;
        this.b = f;
        this.c = dw91Var;
        this.d = ven0Var;
        this.e = drr0Var;
    }
}
