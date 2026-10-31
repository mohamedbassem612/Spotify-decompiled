package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iia extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public float b;
    public byte c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ven0 e;
    public Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iia(boolean z, c380 c380Var, ven0 ven0Var, ven0 ven0Var2, o95 o95Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = z;
        this.f = c380Var;
        this.e = ven0Var;
        this.g = ven0Var2;
        this.h = o95Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new iia(this.d, this.e, this.b, (jfe) this.g, (tia) this.h, lnmVar);
            default:
                return new iia(this.d, (c380) this.f, this.e, (ven0) this.g, (o95) this.h, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0310  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        p811 p811Var;
        oo6 oo6Var;
        Object obj2;
        rih1 rih1Var;
        List listL1;
        rih1 rih1Var2;
        float f;
        long j;
        float fIntBitsToFloat;
        int i;
        float f2;
        Float f3;
        pxg1 pxg1VarO0;
        iia iiaVar = this;
        byte b = iiaVar.a;
        boolean z = iiaVar.d;
        d9n d9nVar = d9n.a;
        ven0 ven0Var = iiaVar.e;
        Object obj3 = iiaVar.g;
        int i2 = 1;
        rih1 rih1Var3 = rih1.a;
        Object obj4 = iiaVar.h;
        switch (b) {
            case 0:
                tia tiaVar = (tia) obj4;
                jfe jfeVar = (jfe) obj3;
                byte b2 = iiaVar.c;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p811Var = (p811) iiaVar.f;
                        hm5.M(obj);
                    }
                    do {
                        oo6Var = new oo6((Object) tiaVar, (Object) p811Var, (Object) jfeVar, (byte) 12);
                        iiaVar.f = p811Var;
                        iiaVar.c = (byte) 2;
                    } while (s110.h(iiaVar.getContext()).D(oo6Var, iiaVar) != d9nVar);
                    return d9nVar;
                }
                hm5.M(obj);
                if (!z) {
                    if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                        float f4 = iiaVar.b;
                        if (f4 > 0.0f) {
                            rj31 rj31Var = new rj31("beatsPerMinute", f4);
                            iiaVar.c = (byte) 1;
                            if (jfeVar.b(rj31Var, iiaVar) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                    if (tiaVar != null) {
                        p811Var = new p811();
                        do {
                            oo6Var = new oo6((Object) tiaVar, (Object) p811Var, (Object) jfeVar, (byte) 12);
                            iiaVar.f = p811Var;
                            iiaVar.c = (byte) 2;
                        } while (s110.h(iiaVar.getContext()).D(oo6Var, iiaVar) != d9nVar);
                        return d9nVar;
                    }
                }
                return rih1Var3;
                ven0Var.setValue(Boolean.TRUE);
                if (tiaVar != null) {
                    p811Var = new p811();
                    do {
                        oo6Var = new oo6((Object) tiaVar, (Object) p811Var, (Object) jfeVar, (byte) 12);
                        iiaVar.f = p811Var;
                        iiaVar.c = (byte) 2;
                    } while (s110.h(iiaVar.getContext()).D(oo6Var, iiaVar) != d9nVar);
                    return d9nVar;
                }
                return rih1Var3;
            default:
                o95 o95Var = (o95) obj4;
                ven0 ven0Var2 = (ven0) obj3;
                byte b3 = iiaVar.c;
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            f2 = iiaVar.b;
                            hm5.M(obj);
                            i = 2;
                            rih1Var = rih1Var3;
                            obj2 = obj4;
                            f3 = new Float(1.0f);
                            pxg1VarO0 = irn1.o0(250, 0, d9b.d, i);
                            iiaVar.b = f2;
                            iiaVar.c = (byte) 3;
                            if (o95.b((o95) obj2, f3, pxg1VarO0, (Float) null, (iu30) null, iiaVar, 12) == d9nVar) {
                                return d9nVar;
                            }
                        } else if (b3 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    hm5.M(obj);
                    return rih1Var3;
                }
                hm5.M(obj);
                if (z) {
                    c380 c380Var = (c380) iiaVar.f;
                    if (c380Var.size() >= 2) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = c380Var.iterator();
                        if (it.hasNext()) {
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((Offset) it.next()).a >> 32));
                            while (it.hasNext()) {
                                fIntBitsToFloat2 = Math.min(fIntBitsToFloat2, Float.intBitsToFloat((int) (((Offset) it.next()).a >> 32)));
                                obj4 = obj4;
                            }
                            obj2 = obj4;
                            Iterator it2 = c380Var.iterator();
                            if (it2.hasNext()) {
                                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (((Offset) it2.next()).a >> 32));
                                while (it2.hasNext()) {
                                    fIntBitsToFloat3 = Math.max(fIntBitsToFloat3, Float.intBitsToFloat((int) (((Offset) it2.next()).a >> 32)));
                                    fIntBitsToFloat2 = fIntBitsToFloat2;
                                }
                                float f5 = fIntBitsToFloat2;
                                if (fIntBitsToFloat3 <= f5) {
                                    listL1 = o7h.l1(c380Var);
                                    rih1Var = rih1Var3;
                                } else {
                                    float f6 = f5;
                                    int i3 = 0;
                                    while (f6 <= fIntBitsToFloat3) {
                                        while (true) {
                                            if (i3 < c380Var.size() - i2) {
                                                int i4 = i3 + 1;
                                                rih1Var2 = rih1Var3;
                                                if (Float.intBitsToFloat((int) (((Offset) c380Var.get(i4)).a >> 32)) < f6) {
                                                    i3 = i4;
                                                    rih1Var3 = rih1Var2;
                                                    i2 = 1;
                                                }
                                            } else {
                                                rih1Var2 = rih1Var3;
                                            }
                                        }
                                        long j2 = ((Offset) c380Var.get(i3)).a;
                                        int i5 = i3 + 1;
                                        if (i5 < c380Var.size()) {
                                            f = Float.MAX_VALUE;
                                            j = ((Offset) c380Var.get(i5)).a;
                                        } else {
                                            f = Float.MAX_VALUE;
                                            j = j2;
                                        }
                                        float f7 = f6;
                                        int i6 = (int) (j >> 32);
                                        float f8 = fIntBitsToFloat3;
                                        int i7 = i3;
                                        int i8 = (int) (j2 >> 32);
                                        if (Math.abs(Float.intBitsToFloat(i6) - Float.intBitsToFloat(i8)) < 1.0E-4f) {
                                            fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
                                        } else {
                                            float fIntBitsToFloat4 = (f7 - Float.intBitsToFloat(i8)) / (Float.intBitsToFloat(i6) - Float.intBitsToFloat(i8));
                                            int i9 = (int) (j2 & 4294967295L);
                                            fIntBitsToFloat = ((Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat(i9)) * fIntBitsToFloat4) + Float.intBitsToFloat(i9);
                                        }
                                        if (Math.abs(fIntBitsToFloat) > f) {
                                            fIntBitsToFloat = 0.0f;
                                        }
                                        arrayList.add(new Offset((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(f7)) << 32)));
                                        f6 = f7 + 0.0025f;
                                        rih1Var3 = rih1Var2;
                                        fIntBitsToFloat3 = f8;
                                        i3 = i7;
                                        i2 = 1;
                                    }
                                    float f9 = fIntBitsToFloat3;
                                    rih1Var = rih1Var3;
                                    if (arrayList.isEmpty() || Float.intBitsToFloat((int) (((Offset) o7h.A0(arrayList)).a >> 32)) < f9 - 0.00125f) {
                                        long j3 = ((Offset) o7h.A0(c380Var)).a;
                                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j3 >> 32));
                                        int i10 = (int) (j3 & 4294967295L);
                                        arrayList.add(new Offset((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat(i10)) <= Float.MAX_VALUE ? Float.intBitsToFloat(i10) : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32)));
                                    }
                                    listL1 = arrayList;
                                }
                            } else {
                                hhg1.k();
                            }
                        } else {
                            hhg1.k();
                        }
                        return null;
                    }
                    listL1 = o7h.l1(c380Var);
                    rih1Var = rih1Var3;
                    obj2 = obj4;
                    if (((List) ven0Var.getValue()).isEmpty()) {
                        ven0Var.setValue(listL1);
                        ven0Var2.setValue(listL1);
                        Float f10 = new Float(1.0f);
                        this.c = (byte) 1;
                        if (o95Var.g(f10, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        iiaVar = this;
                        float fFloatValue = ((Number) o95Var.e()).floatValue();
                        ven0Var2.setValue((fFloatValue >= 1.0f || ((Collection) ven0Var2.getValue()).isEmpty()) ? (List) ven0Var.getValue() : apo.n((List) ven0Var2.getValue(), (List) ven0Var.getValue(), fFloatValue));
                        ven0Var.setValue(listL1);
                        Float f11 = new Float(0.0f);
                        iiaVar.b = fFloatValue;
                        i = 2;
                        iiaVar.c = (byte) 2;
                        if (o95Var.g(f11, iiaVar) == d9nVar) {
                            return d9nVar;
                        }
                        f2 = fFloatValue;
                        f3 = new Float(1.0f);
                        pxg1VarO0 = irn1.o0(250, 0, d9b.d, i);
                        iiaVar.b = f2;
                        iiaVar.c = (byte) 3;
                        if (o95.b((o95) obj2, f3, pxg1VarO0, (Float) null, (iu30) null, iiaVar, 12) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    rih1Var = rih1Var3;
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iia(boolean z, ven0 ven0Var, float f, jfe jfeVar, tia tiaVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = z;
        this.e = ven0Var;
        this.b = f;
        this.g = jfeVar;
        this.h = tiaVar;
    }
}
