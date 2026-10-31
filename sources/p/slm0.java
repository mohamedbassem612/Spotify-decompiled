package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class slm0 extends a8d1 implements vu30 {
    public float a;
    public byte b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ s69 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ o95 g;
    public final /* synthetic */ xu30 h;
    public final /* synthetic */ a6y i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slm0(ven0 ven0Var, s69 s69Var, ven0 ven0Var2, ven0 ven0Var3, o95 o95Var, xu30 xu30Var, a6y a6yVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = ven0Var;
        this.d = s69Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
        this.g = o95Var;
        this.h = xu30Var;
        this.i = a6yVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new slm0(this.c, this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        rih1 rih1Var;
        o4w o4wVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        double d;
        o4w o4wVarT;
        float f;
        byte b = this.b;
        rih1 rih1Var2 = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.c.setValue((Object) null);
            o95 o95Var = this.g;
            ven0 ven0Var = this.e;
            ven0 ven0Var2 = this.f;
            s69 s69Var = this.d;
            if (s69Var == null) {
                ven0Var.setValue((Object) null);
                ven0Var2.setValue((Object) null);
                Float f2 = new Float(1.0f);
                this.b = (byte) 1;
                if (o95Var.g(f2, this) != d9nVar) {
                    return rih1Var2;
                }
            } else {
                double d2 = s69Var.c;
                double d3 = s69Var.b;
                ArrayList arrayList3 = s69Var.a;
                if (arrayList3.isEmpty()) {
                    rih1Var = rih1Var2;
                    o4wVar = null;
                    break;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                int i = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    xu30 xu30Var = this.h;
                    if (!zHasNext) {
                        double d4 = d3;
                        rih1Var = rih1Var2;
                        double d5 = d2;
                        int i2 = 10;
                        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList3, 10));
                        int i3 = 0;
                        for (Object obj2 : arrayList3) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                p7h.T();
                                throw null;
                            }
                            p69 p69Var = (p69) obj2;
                            if (p69Var.a.size() > 2) {
                                List<y9v0> listL0 = o7h.l0(1, o7h.k0(p69Var.a, 1));
                                arrayList2 = new ArrayList(q7h.U(listL0, i2));
                                for (y9v0 y9v0Var : listL0) {
                                    arrayList2.add(new Offset((((long) Float.floatToRawIntBits((float) y9v0Var.a)) << 32) | (((long) Float.floatToRawIntBits((float) yoi1.n(((Number) xu30Var.invoke(Double.valueOf(y9v0Var.b), Double.valueOf(d4), Double.valueOf(d5))).doubleValue(), 0.0d, 1.0d))) & 4294967295L)));
                                    arrayList4 = arrayList4;
                                }
                                arrayList = arrayList4;
                            } else {
                                arrayList = arrayList4;
                                arrayList2 = z6x.a;
                            }
                            arrayList5.add(new c4w(i3, i4, arrayList2, (float) p69Var.b, (float) p69Var.c));
                            arrayList4 = arrayList;
                            i3 = i4;
                            i2 = 10;
                        }
                        o4wVar = new o4w(arrayList4, arrayList5, null, s69Var.b, s69Var.c);
                        break;
                    }
                    Object next = it.next();
                    int i5 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    p69 p69Var2 = (p69) next;
                    double d6 = d3;
                    List list = p69Var2.a;
                    double d7 = p69Var2.c;
                    double d8 = p69Var2.b;
                    if (list.isEmpty()) {
                        rih1Var = rih1Var2;
                        o4wVar = null;
                        break;
                    }
                    boolean z = i == 0;
                    boolean z2 = i == p7h.L(arrayList3);
                    a6y a6yVar = this.i;
                    if (z) {
                        y9v0 y9v0Var2 = (y9v0) o7h.q0(list);
                        d = d2;
                        arrayList4.add(new xz3((((long) Float.floatToRawIntBits((float) yoi1.n(((Number) xu30Var.invoke(Double.valueOf(y9v0Var2.b), Double.valueOf(d6), Double.valueOf(d))).doubleValue(), 0.0d, 1.0d))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) (((d7 - d8) * y9v0Var2.a) + d8))) << 32), c14.a, a6yVar.a));
                    } else {
                        d = d2;
                    }
                    y9v0 y9v0Var3 = (y9v0) o7h.A0(list);
                    arrayList4.add(new xz3((((long) Float.floatToRawIntBits((float) yoi1.n(((Number) xu30Var.invoke(Double.valueOf(y9v0Var3.b), Double.valueOf(d6), Double.valueOf(d))).doubleValue(), 0.0d, 1.0d))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) (((d7 - d8) * y9v0Var3.a) + d8))) << 32), z2 ? c14.c : c14.b, z2 ? a6yVar.b : true));
                    i = i5;
                    d3 = d6;
                    rih1Var2 = rih1Var2;
                    d2 = d;
                }
                if (o4wVar == null) {
                    return rih1Var;
                }
                if (ven0Var2.getValue() == null) {
                    ven0Var2.setValue(o4wVar);
                    ven0Var.setValue(o4wVar);
                    Float f3 = new Float(1.0f);
                    this.b = (byte) 2;
                    if (o95Var.g(f3, this) != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    float fFloatValue = ((Number) o95Var.e()).floatValue();
                    if (fFloatValue >= 1.0f || ven0Var.getValue() == null) {
                        o4wVarT = (o4w) ven0Var2.getValue();
                    } else {
                        Object value = ven0Var.getValue();
                        value.getClass();
                        Object value2 = ven0Var2.getValue();
                        value2.getClass();
                        o4wVarT = lrn1.t((o4w) value, (o4w) value2, fFloatValue);
                    }
                    ven0Var.setValue(o4wVarT);
                    ven0Var2.setValue(o4wVar);
                    Float f4 = new Float(0.0f);
                    this.a = fFloatValue;
                    this.b = (byte) 3;
                    if (o95Var.g(f4, this) != d9nVar) {
                        f = fFloatValue;
                    }
                }
            }
        }
        if (b == 1) {
            hm5.M(obj);
            return rih1Var2;
        }
        if (b == 2) {
            hm5.M(obj);
            return rih1Var2;
        }
        if (b != 3) {
            if (b == 4) {
                hm5.M(obj);
                return rih1Var2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f = this.a;
        hm5.M(obj);
        rih1Var = rih1Var2;
        Float f5 = new Float(1.0f);
        pxg1 pxg1VarO0 = irn1.o0(250, 0, d9b.c, 2);
        this.a = f;
        this.b = (byte) 4;
        return o95.b(this.g, f5, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
    }
}
