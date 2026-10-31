package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class ff41 implements vu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ff41(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        yf5 yf5Var;
        Object objA;
        switch (this.a) {
            case 0:
                kjc0 kjc0Var = (kjc0) obj2;
                return p7h.H(new Object[]{kjc0Var.c(), jf41.a(kjc0Var.b(), jf41.j, (id41) obj)});
            case 1:
                long j = ((wee1) obj2).a;
                if (wee1.a(j, 8589934592L)) {
                    return 0;
                }
                if (wee1.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 2:
                Offset offset = (Offset) obj2;
                return offset != null ? Offset.c(offset.a, 9205357640488583168L) : false ? Boolean.FALSE : p7h.H(new Float[]{Float.valueOf(Float.intBitsToFloat((int) (offset.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (offset.a & 4294967295L)))});
            case 3:
                id41 id41Var = (id41) obj;
                ze5 ze5Var = (ze5) obj2;
                Object obj3 = ze5Var.a;
                if (obj3 instanceof cpr0) {
                    yf5Var = yf5.a;
                } else if (obj3 instanceof zma1) {
                    yf5Var = yf5.b;
                } else if (obj3 instanceof uyi1) {
                    yf5Var = yf5.c;
                } else if (obj3 instanceof h3i1) {
                    yf5Var = yf5.d;
                } else if (obj3 instanceof ljc0) {
                    yf5Var = yf5.e;
                } else if (obj3 instanceof kjc0) {
                    yf5Var = yf5.f;
                } else {
                    if (!(obj3 instanceof qgc1)) {
                        k220.c();
                        return null;
                    }
                    yf5Var = yf5.g;
                }
                switch (yf5Var.ordinal()) {
                    case 0:
                        objA = jf41.a((cpr0) obj3, jf41.h, id41Var);
                        break;
                    case 1:
                        objA = jf41.a((zma1) obj3, jf41.i, id41Var);
                        break;
                    case 2:
                        objA = jf41.a((uyi1) obj3, jf41.d, id41Var);
                        break;
                    case 3:
                        objA = jf41.a((h3i1) obj3, jf41.e, id41Var);
                        break;
                    case 4:
                        objA = jf41.a((ljc0) obj3, jf41.f, id41Var);
                        break;
                    case 5:
                        objA = jf41.a((kjc0) obj3, jf41.g, id41Var);
                        break;
                    case 6:
                        objA = ((qgc1) obj3).b();
                        break;
                    default:
                        eg.o();
                        return null;
                }
                return p7h.H(new Object[]{yf5Var, objA, Integer.valueOf(ze5Var.b), Integer.valueOf(ze5Var.c), ze5Var.d});
            case 4:
                id41 id41Var2 = (id41) obj;
                List list = ((LocaleList) obj2).a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(jf41.a((ehe0) list.get(i), jf41.B, id41Var2));
                }
                return arrayList;
            case 5:
                return ((ehe0) obj2).a.toLanguageTag();
            case 6:
                id41 id41Var3 = (id41) obj;
                shc0 shc0Var = (shc0) obj2;
                return p7h.H(new Object[]{jf41.a(new phc0(shc0Var.a), jf41.D, id41Var3), jf41.a(rhc0.a(shc0Var.b), jf41.E, id41Var3), jf41.a(qhc0.a(shc0Var.c), jf41.F, id41Var3)});
            case 7:
                return Float.valueOf(((phc0) obj2).a);
            case 8:
                return Integer.valueOf(((rhc0) obj2).e());
            case 9:
                return Integer.valueOf(((qhc0) obj2).e());
            case 10:
                return ((uyi1) obj2).a();
            case 11:
                id41 id41Var4 = (id41) obj;
                cpr0 cpr0Var = (cpr0) obj2;
                Object objA2 = jf41.a(new a0e1(cpr0Var.a), jf41.s, id41Var4);
                Object objA3 = jf41.a(z3e1.a(cpr0Var.b), jf41.t, id41Var4);
                Object objA4 = jf41.a(new TextUnit(cpr0Var.c), jf41.x, id41Var4);
                u8e1 u8e1Var = cpr0Var.d;
                u8e1 u8e1Var2 = u8e1.c;
                Object objA5 = jf41.a(u8e1Var, jf41.m, id41Var4);
                Object objA6 = jf41.a(cpr0Var.e, f6o1.a, id41Var4);
                shc0 shc0Var2 = cpr0Var.f;
                shc0 shc0Var3 = shc0.d;
                return p7h.H(new Object[]{objA2, objA3, objA4, objA5, objA6, jf41.a(shc0Var2, jf41.C, id41Var4), jf41.a(new mhc0(cpr0Var.g), f6o1.c, id41Var4), jf41.a(yf70.a(cpr0Var.h), jf41.u, id41Var4), jf41.a(cpr0Var.i, f6o1.d, id41Var4)});
            case 12:
                return ((h3i1) obj2).a();
            case 13:
                id41 id41Var5 = (id41) obj;
                zma1 zma1Var = (zma1) obj2;
                u7h u7hVar = new u7h(zma1Var.a.a());
                if41 if41Var = jf41.r;
                Object objA7 = jf41.a(u7hVar, if41Var, id41Var5);
                TextUnit textUnit = new TextUnit(zma1Var.b);
                if41 if41Var2 = jf41.x;
                Object objA8 = jf41.a(textUnit, if41Var2, id41Var5);
                FontWeight fontWeight = zma1Var.c;
                FontWeight fontWeight2 = FontWeight.b;
                Object objA9 = jf41.a(fontWeight, jf41.n, id41Var5);
                Object objA10 = jf41.a(zma1Var.d, jf41.v, id41Var5);
                Object objA11 = jf41.a(zma1Var.e, jf41.w, id41Var5);
                String str = zma1Var.g;
                Object objA12 = jf41.a(new TextUnit(zma1Var.h), if41Var2, id41Var5);
                Object objA13 = jf41.a(zma1Var.i, jf41.o, id41Var5);
                Object objA14 = jf41.a(zma1Var.j, jf41.l, id41Var5);
                LocaleList localeList = zma1Var.k;
                LocaleList localeList2 = LocaleList.c;
                Object objA15 = jf41.a(localeList, jf41.A, id41Var5);
                Object objA16 = jf41.a(new u7h(zma1Var.l), if41Var, id41Var5);
                Object objA17 = jf41.a(zma1Var.m, jf41.k, id41Var5);
                Shadow shadow = zma1Var.n;
                Shadow shadow2 = Shadow.d;
                return p7h.H(new Object[]{objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, jf41.a(shadow, jf41.q, id41Var5)});
            case 14:
                id41 id41Var6 = (id41) obj;
                pae1 pae1Var = (pae1) obj2;
                zma1 zma1VarD = pae1Var.d();
                df41 df41Var = jf41.i;
                return p7h.H(new Object[]{jf41.a(zma1VarD, df41Var, id41Var6), jf41.a(pae1Var.a(), df41Var, id41Var6), jf41.a(pae1Var.b(), df41Var, id41Var6), jf41.a(pae1Var.c(), df41Var, id41Var6)});
            case 15:
                z6x z6xVar = (List) obj;
                List list2 = (List) obj2;
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                return o7h.N0(list2, (Collection) z6xVar);
            case 16:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                return arrayList2;
            case 17:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 18:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 19:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 20:
                return (pm31) obj;
            case 21:
                return (String) obj;
            case 22:
                return (rih1) obj;
            case 23:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                if (list5 == null) {
                    return list6;
                }
                ArrayList arrayList3 = new ArrayList(list5);
                arrayList3.addAll(list6);
                return arrayList3;
            case 24:
                return (hw61) obj;
            case 25:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 26:
                return (fam) obj;
            case 27:
                return (pb4) obj;
            case 28:
                return (f620) obj;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
        }
    }
}
