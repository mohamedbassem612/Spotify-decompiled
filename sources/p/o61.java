package p;

import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o61 extends hab0 implements iu30 {
    public final /* synthetic */ lee1 X;
    public final /* synthetic */ Map Y;
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ m61 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ m61 f;
    public final /* synthetic */ s61 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ yae1 i;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o61(ven0 ven0Var, m61 m61Var, ven0 ven0Var2, boolean z, String str, m61 m61Var2, s61 s61Var, int i, yae1 yae1Var, int i2, lee1 lee1Var, Map map) {
        super(1);
        this.a = ven0Var;
        this.b = m61Var;
        this.c = ven0Var2;
        this.d = z;
        this.e = str;
        this.f = m61Var2;
        this.g = s61Var;
        this.h = i;
        this.i = yae1Var;
        this.t = i2;
        this.X = lee1Var;
        this.Y = map;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0152  */
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        byte b;
        int i;
        m61 m61Var;
        m61 m61Var2;
        boolean z;
        y9e1 y9e1Var;
        Map map;
        lee1 lee1Var;
        ArrayList arrayList2;
        Float fValueOf;
        int i2;
        int iL;
        Float f;
        m61 m61Var3;
        y9e1 y9e1Var2 = (y9e1) obj;
        ((iu30) this.a.getValue()).invoke(y9e1Var2);
        x9e1 x9e1Var = y9e1Var2.a;
        long j = x9e1Var.j;
        ven0 ven0Var = this.c;
        su21 su21Var = ((n61) ven0Var.getValue()).a;
        hjl hjlVar = su21Var != null ? new hjl(su21Var.a) : null;
        if (hjlVar == null ? false : hjl.c(hjlVar.a, j)) {
            ven0Var.setValue(new n61(((n61) ven0Var.getValue()).a, true));
        } else {
            s61 s61Var = this.g;
            float f2 = s61Var.d;
            float f3 = s61Var.c;
            long j2 = x9e1Var.j;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z2 = this.d;
            long j3 = j2;
            String str = this.e;
            if (z2 && hjl.e(j3)) {
                List listH = r61.a.h(str);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listH) {
                    if (((String) obj2).length() > 0) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            m61 m61Var4 = this.b;
            m61 m61Var5 = this.f;
            boolean zEquals = m61Var4.equals(m61Var5);
            int i3 = this.h;
            yae1 yae1Var = this.i;
            byte b2 = this.t;
            lee1 lee1Var2 = this.X;
            Map map2 = this.Y;
            if (zEquals) {
                b = b2;
                i = i3;
                m61Var = m61Var5;
                m61Var2 = m61Var4;
                yae1Var = yae1Var;
                z = z2;
                y9e1Var = y9e1Var2;
                str = str;
            } else {
                Object obj3 = linkedHashMap.get(m61Var5);
                if (obj3 == null) {
                    m61Var2 = m61Var4;
                    m61Var = m61Var5;
                    y9e1 y9e1VarA = yae1.a(yae1Var, str, r61.c(lee1Var2, map2, m61Var5), b2, z2, i3, j3, (flb0) null, (xat) null, 960);
                    b = b2;
                    i = i3;
                    z = z2;
                    j3 = j3;
                    linkedHashMap.put(m61Var, y9e1VarA);
                    obj3 = y9e1VarA;
                } else {
                    b = b2;
                    i = i3;
                    m61Var = m61Var5;
                    m61Var2 = m61Var4;
                    z = z2;
                }
                y9e1Var = (y9e1) obj3;
            }
            linkedHashMap.put(m61Var, y9e1Var);
            if (y9e1Var.d()) {
                map = map2;
                lee1Var = lee1Var2;
                arrayList2 = arrayList;
            } else {
                lee1Var = lee1Var2;
                ArrayList arrayList4 = arrayList;
                map = map2;
                arrayList2 = arrayList4;
                if (!r61.b(arrayList4, lee1Var, map2, yae1Var, j3, m61Var)) {
                    m61Var3 = m61Var;
                }
                ven0Var.setValue(new n61(new su21(j, m61Var3), m61Var3.equals(m61Var2)));
            }
            boolean z3 = z;
            int i4 = i;
            long j4 = j3;
            q61 q61Var = new q61(linkedHashMap, arrayList2, yae1Var, str, b, z3, i4, j4, lee1Var, map);
            float fNextDown = m61Var.a;
            if (!hjl.e(j4) || !z3 || i4 == Integer.MAX_VALUE || f3 <= 0.0f) {
                fValueOf = null;
            } else {
                float fD = (y9e1Var.b.a.d() * f2) / f3;
                if (fD <= 0.0f) {
                    fValueOf = null;
                } else {
                    double d = fNextDown;
                    double dI = (((double) i4) * ((double) hjl.i(j4))) / ((double) fD);
                    if (dI > 1.0d) {
                        dI = 1.0d;
                    }
                    fValueOf = Float.valueOf((float) (d * dI));
                }
            }
            float fC = TextUnit.c(s61Var.b);
            if (fNextDown > fC) {
                fNextDown = fC;
            }
            float fC2 = TextUnit.c(s61Var.a);
            if (fC2 > fNextDown) {
                fC2 = fNextDown;
            }
            if (((Boolean) q61Var.invoke(Float.valueOf(fNextDown), Float.valueOf(f3))).booleanValue()) {
                m61Var3 = new m61(fNextDown, f3);
            } else {
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(Float.valueOf(fNextDown));
                while (fNextDown > fC2) {
                    fNextDown = Math.nextDown(fNextDown - ((fNextDown - fC2) / 2.0f));
                    if (fNextDown < fC2) {
                        fNextDown = fC2;
                    }
                    smc0VarN.add(Float.valueOf(fNextDown));
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                if (fValueOf != null) {
                    float fFloatValue = fValueOf.floatValue();
                    i2 = 0;
                    rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
                    iL = 0;
                    while (true) {
                        rmc0 rmc0Var = rmc0VarListIterator;
                        if (!rmc0Var.hasNext()) {
                            iL = -1;
                            break;
                        }
                        if (((Number) rmc0Var.next()).floatValue() <= fFloatValue) {
                            break;
                        }
                        iL++;
                    }
                    if (iL < 0) {
                        iL = p7h.L(smc0VarK);
                    }
                } else {
                    i2 = 0;
                    iL = 0;
                }
                boolean zBooleanValue = ((Boolean) q61Var.invoke(smc0VarK.get(iL), Float.valueOf(f2))).booleanValue();
                while (!zBooleanValue && iL < p7h.L(smc0VarK)) {
                    iL++;
                    zBooleanValue = ((Boolean) q61Var.invoke(smc0VarK.get(iL), Float.valueOf(f2))).booleanValue();
                }
                if (zBooleanValue) {
                    while (iL > 0 && ((Boolean) q61Var.invoke(smc0VarK.get(iL - 1), Float.valueOf(f2))).booleanValue()) {
                        iL--;
                    }
                    f = (Float) smc0VarK.get(iL);
                } else {
                    f = null;
                }
                if (f != null) {
                    float fFloatValue2 = f.floatValue();
                    if (((Boolean) q61Var.invoke(f, Float.valueOf(f3))).booleanValue()) {
                        m61Var3 = new m61(fFloatValue2, f3);
                    } else {
                        List listD = r61.d(s61Var);
                        int iL2 = p7h.L(listD);
                        while (i2 < iL2) {
                            int i5 = ((i2 + iL2) + 1) / 2;
                            if (((Boolean) q61Var.invoke(f, listD.get(i5))).booleanValue()) {
                                i2 = i5;
                            } else {
                                iL2 = i5 - 1;
                            }
                        }
                        m61Var3 = new m61(fFloatValue2, ((Number) listD.get(i2)).floatValue());
                    }
                } else {
                    m61Var3 = new m61(fC2, f2);
                }
            }
            ven0Var.setValue(new n61(new su21(j, m61Var3), m61Var3.equals(m61Var2)));
        }
        return rih1.a;
    }
}
