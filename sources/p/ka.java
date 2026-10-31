package p;

import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ka implements Function0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ka(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x023d  */
    public final Object invoke() throws IllegalAccessException {
        int iHashCode;
        float fO;
        b8f1 state;
        byte b = this.a;
        int iHashCode2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new la(((ma) obj).a());
            case 1:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                na naVar = (na) obj;
                sb.append(((ajn0) naVar.c).b());
                return ryn1.q(sb.toString(), ((pa) naVar.b).getUpperBounds());
            case 2:
                return (h22) obj;
            case 3:
                return (sck1) ((ka) obj).invoke();
            case 4:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 5:
                ((t98) obj).f.d();
                return rih1Var;
            case 6:
                qbc qbcVar = (qbc) obj;
                return qbcVar.a.k(qbcVar.b).m();
            case 7:
                xvc xvcVar = (xvc) obj;
                ((ap41) xvcVar).b.a(xvcVar);
                return rih1Var;
            case 8:
                return ((e1h1) obj).b();
            case 9:
                return (CarouselFragment) obj;
            case 10:
                return (sck1) ((ka) obj).invoke();
            case 11:
                sie sieVar = (sie) obj;
                sieVar.V0 = sieVar.Q0.a(sieVar.T0.a);
                return rih1Var;
            case 12:
                dxz0 dxz0Var = (dxz0) obj;
                return dxz0Var.c().startWithItem(dxz0Var.b());
            case 13:
                return (ContentPickerFragment) obj;
            case 14:
                return (sck1) ((ka) obj).invoke();
            case 15:
                return (Class) obj;
            case 16:
                Object obj2 = ((p811) obj).a;
                if (obj2 != null) {
                    return (ax81) obj2;
                }
                u890.C("result");
                throw null;
            case 17:
                Type typeL = ((b7) obj).l();
                typeL.getClass();
                return bb11.c(typeL);
            case 18:
                i191 i191Var = (i191) obj;
                a8f1 a8f1Var = i191Var.k;
                if (a8f1Var == null || (state = a8f1Var.getState()) == null) {
                    fO = 0.0f;
                } else {
                    float f = state.a;
                    if (f == 0.0f) {
                        fO = 0.0f;
                    } else {
                        fO = 1.0f - (yoi1.o(f - state.b.s(), state.a, 0.0f) / state.a);
                    }
                }
                x7f1 x7f1Var = i191Var.j;
                return new u7h(z4p1.A(mlv.c.a(fO <= 0.01f ? 0.0f : 1.0f), x7f1Var.a, x7f1Var.b));
            case 19:
                return new oft((pft) obj);
            case 20:
                return new qft((rft) obj);
            case 21:
                return new sft((tft) obj);
            case 22:
                return new uft((vft) obj);
            case 23:
                return ((lgt) obj).y();
            case 24:
                return new ngt((ogt) obj);
            case 25:
                fht fhtVar = ((cht) obj).a;
                fht fhtVar2 = new fht();
                for (Field field : fht.class.getDeclaredFields()) {
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj3 = field.get(fhtVar);
                        sgp0 sgp0Var = obj3 instanceof sgp0 ? (sgp0) obj3 : null;
                        if (sgp0Var != null) {
                            nhc1.Y(field.getName(), "is", false);
                            wdg wdgVarB = rc11.a.b(fht.class);
                            field.getName();
                            String name = field.getName();
                            if (name.length() > 0) {
                                name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
                            }
                            "get".concat(name);
                            Object obj4 = lyc.NO_RECEIVER;
                            wdgVarB.n();
                            field.set(fhtVar2, new ce0(sgp0Var.a, fhtVar2, (byte) 6));
                        }
                    }
                }
                cht chtVar = cht.c;
                fhtVar2.k(dm61.y0(fhtVar2.e(), p7h.M(new kf30[]{rfb1.p, rfb1.q})));
                fhtVar2.a = true;
                return new cht(fhtVar2);
            case 26:
                HashSet hashSet = new HashSet();
                wht whtVar = (wht) ((mxr) obj).d;
                vht vhtVar = whtVar.N0;
                byp bypVar = whtVar.Y;
                hfy0 hfy0Var = whtVar.e;
                Iterator it = vhtVar.d().iterator();
                while (it.hasNext()) {
                    for (n9r n9rVar : c8o.o(((a8b0) it.next()).E(), null, 3)) {
                        if ((n9rVar instanceof xw81) || (n9rVar instanceof tdy0)) {
                            hashSet.add(((jyc) n9rVar).getName());
                        }
                    }
                }
                Iterator it2 = hfy0Var.Q0.iterator();
                while (it2.hasNext()) {
                    hashSet.add(dem1.y((zjn0) bypVar.c, ((yfy0) it2.next()).f));
                }
                Iterator it3 = hfy0Var.R0.iterator();
                while (it3.hasNext()) {
                    hashSet.add(dem1.y((zjn0) bypVar.c, ((ggy0) it3.next()).f));
                }
                return dm61.y0(hashSet, hashSet);
            case 27:
                fit fitVar = (fit) obj;
                Set setN = fitVar.n();
                if (setN == null) {
                    return null;
                }
                return dm61.y0(dm61.y0(fitVar.m(), fitVar.c.c.keySet()), setN);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                Set setKeySet = ((LinkedHashMap) ((zbc) obj).t.b).keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : setKeySet) {
                    heg hegVar = (heg) obj5;
                    if (!hegVar.g() && !geg.c.contains(hegVar)) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((heg) it4.next()).f());
                }
                return arrayList2;
            default:
                kit kitVar = (kit) obj;
                byp bypVar2 = kitVar.Y;
                return o7h.l1(((kf5) ((ks6) bypVar2.b).e).e(kitVar.Z, (zjn0) bypVar2.c));
        }
    }
}
