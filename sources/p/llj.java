package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class llj implements vu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ llj(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:162:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0230 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0232 A[LOOP:1: B:49:0x01eb->B:62:0x0232, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r7v10, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var = (x340) b0kVar;
                if (!x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var.b0();
                }
                return rih1Var;
            case 1:
                b0k b0kVar2 = (b0k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                x340 x340Var2 = (x340) b0kVar2;
                if (!x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((hmb0) ((hzj) obj)).e0((qim0) obj2);
                return rih1Var;
            case 3:
                ((hmb0) ((hzj) obj)).a0((wat) obj2);
                return rih1Var;
            case 4:
                m4k m4kVar = (m4k) obj2;
                hmb0 hmb0Var = (hmb0) ((hzj) obj);
                jdo0 jdo0Var = hmb0Var.e1;
                hmb0Var.c1 = m4kVar;
                kiv kivVar = t4k.h;
                xos0 xos0Var = (xos0) m4kVar;
                xos0Var.getClass();
                hmb0Var.a0((wat) d7e.x(xos0Var, kivVar));
                xos0 xos0Var2 = (xos0) m4kVar;
                flb0 flb0Var = (flb0) d7e.x(xos0Var2, t4k.n);
                if (hmb0Var.a1 != flb0Var) {
                    hmb0Var.a1 = flb0Var;
                    hmb0Var.F();
                    hmb0 hmb0VarV = hmb0Var.v();
                    if (hmb0VarV != null) {
                        hmb0VarV.D();
                    } else {
                        oxq0 oxq0Var = hmb0Var.O0;
                        if (oxq0Var != null) {
                            ((ha4) oxq0Var).invalidate();
                        }
                    }
                    hmb0Var.E();
                    for (pim0 pim0Var = (pim0) jdo0Var.g; pim0Var != null; pim0Var = pim0Var.f) {
                        pim0Var.T();
                    }
                }
                hmb0Var.f0((e8k1) d7e.x(xos0Var2, t4k.t));
                pim0 pim0Var2 = (pim0) jdo0Var.g;
                if ((pim0Var2.d & 32768) != 0) {
                    while (pim0Var2 != null) {
                        if ((pim0Var2.c & 32768) != 0) {
                            ?? E = pim0Var2;
                            ?? bfn0Var = 0;
                            while (E != 0) {
                                if (E instanceof j4k) {
                                    pim0 pim0Var3 = ((pim0) ((j4k) E)).a;
                                    if (pim0Var3.N0) {
                                        odo0.c(pim0Var3);
                                    } else {
                                        pim0Var3.t = true;
                                    }
                                } else if ((E.c & 32768) != 0 && (E instanceof l5t)) {
                                    pim0 pim0Var4 = ((l5t) E).P0;
                                    int i = 0;
                                    while (pim0Var4 != null) {
                                        if ((pim0Var4.c & 32768) != 0) {
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                bfn0Var = bfn0Var;
                                                bfn0Var = bfn0Var;
                                                E = pim0Var4;
                                            } else {
                                                if (bfn0Var == 0) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (E != 0) {
                                                    bfn0Var.b(E);
                                                    E = 0;
                                                }
                                                bfn0Var.b(pim0Var4);
                                            }
                                        } else {
                                            E = E;
                                            bfn0Var = bfn0Var;
                                        }
                                        pim0Var4 = pim0Var4.f;
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    }
                                    if (i == 1) {
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    } else {
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    }
                                }
                                E = oap1.e((bfn0) bfn0Var);
                            }
                        }
                        if ((pim0Var2.d & 32768) != 0) {
                            pim0Var2 = pim0Var2.f;
                        }
                    }
                }
                return rih1Var;
            case 5:
                ((hmb0) ((hzj) obj)).d0((gfh0) obj2);
                return rih1Var;
            case 6:
                flb0 flb0Var2 = (flb0) obj2;
                hmb0 hmb0Var2 = (hmb0) ((hzj) obj);
                if (hmb0Var2.a1 != flb0Var2) {
                    hmb0Var2.a1 = flb0Var2;
                    hmb0Var2.F();
                    hmb0 hmb0VarV2 = hmb0Var2.v();
                    if (hmb0VarV2 != null) {
                        hmb0VarV2.D();
                    } else {
                        oxq0 oxq0Var2 = hmb0Var2.O0;
                        if (oxq0Var2 != null) {
                            ((ha4) oxq0Var2).invalidate();
                        }
                    }
                    hmb0Var2.E();
                    for (pim0 pim0Var5 = (pim0) hmb0Var2.e1.g; pim0Var5 != null; pim0Var5 = pim0Var5.f) {
                        pim0Var5.T();
                    }
                }
                return rih1Var;
            case 7:
                ((hmb0) ((hzj) obj)).f0((e8k1) obj2);
                return rih1Var;
            case 8:
                ((Integer) obj2).getClass();
                ((hmb0) ((hzj) obj)).getClass();
                return rih1Var;
            case 9:
                kes kesVar = (kes) obj2;
                return p7h.M(new Object[]{Integer.valueOf(kesVar.d.p()), Float.valueOf(yoi1.o(kesVar.d.q(), -0.5f, 0.5f)), Integer.valueOf(kesVar.l())});
            case 10:
                xtb0 xtb0Var = (xtb0) obj2;
                return p7h.M(new Integer[]{Integer.valueOf(((err0) xtb0Var.e.b).s()), Integer.valueOf(((err0) xtb0Var.e.c).s())});
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 12:
                ld41 ld41Var = (ld41) obj2;
                Map map = ld41Var.a;
                nen0 nen0Var = ld41Var.b;
                Object[] objArr = nen0Var.b;
                Object[] objArr2 = nen0Var.c;
                long[] jArr = nen0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj3 = objArr[i5];
                                    Map mapE = ((nd41) objArr2[i5]).e();
                                    if (mapE.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapE);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 13:
                return obj2;
            case 14:
                af5 af5Var = (af5) obj2;
                return p7h.H(new Object[]{af5Var.b, jf41.a(af5Var.a, jf41.b, (id41) obj)});
            case 15:
                return Integer.valueOf(((TextDecoration) obj2).a);
            case 16:
                TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj2;
                return p7h.H(new Float[]{Float.valueOf(textGeometricTransform.a), Float.valueOf(textGeometricTransform.b)});
            case 17:
                id41 id41Var = (id41) obj;
                u8e1 u8e1Var = (u8e1) obj2;
                TextUnit textUnit = new TextUnit(u8e1Var.a);
                if41 if41Var = jf41.x;
                return p7h.H(new Object[]{jf41.a(textUnit, if41Var, id41Var), jf41.a(new TextUnit(u8e1Var.b), if41Var, id41Var)});
            case 18:
                return Integer.valueOf(((FontWeight) obj2).a);
            case 19:
                ljc0 ljc0Var = (ljc0) obj2;
                return p7h.H(new Object[]{ljc0Var.c(), jf41.a(ljc0Var.b(), jf41.j, (id41) obj)});
            case 20:
                return Float.valueOf(((BaselineShift) obj2).a);
            case 21:
                id41 id41Var2 = (id41) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add(jf41.a((ze5) list.get(i6), jf41.c, id41Var2));
                }
                return arrayList;
            case 22:
                nbe1 nbe1Var = (nbe1) obj2;
                return p7h.H(new Integer[]{Integer.valueOf((int) (nbe1Var.a >> 32)), Integer.valueOf((int) (nbe1Var.a & 4294967295L))});
            case 23:
                id41 id41Var3 = (id41) obj;
                Shadow shadow = (Shadow) obj2;
                return p7h.H(new Object[]{jf41.a(new u7h(shadow.a), jf41.r, id41Var3), jf41.a(new Offset(shadow.b), jf41.z, id41Var3), Float.valueOf(shadow.c)});
            case 24:
                return Integer.valueOf(((a0e1) obj2).a);
            case 25:
                return Integer.valueOf(((z3e1) obj2).e());
            case 26:
                return Integer.valueOf(((yf70) obj2).e());
            case 27:
                return Integer.valueOf(((FontStyle) obj2).a);
            case 28:
                return Integer.valueOf(((FontSynthesis) obj2).a);
            default:
                id41 id41Var4 = (id41) obj;
                TextUnit textUnit2 = (TextUnit) obj2;
                wee1[] wee1VarArr = TextUnit.b;
                return textUnit2 != null ? TextUnit.a(textUnit2.a, f7p1.k()) : false ? Boolean.FALSE : p7h.H(new Object[]{Float.valueOf(TextUnit.c(textUnit2.a)), jf41.a(new wee1(TextUnit.b(textUnit2.a)), jf41.y, id41Var4)});
        }
    }
}
