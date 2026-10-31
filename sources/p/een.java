package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.connect.esperanto.proto.VolumeMessages$VolumeResponse;
import com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken$AcquireResult;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class een implements Function, hg30, Predicate, Function3, v0i, s2i1, usi1 {
    public final /* synthetic */ byte a;
    public static final een b = new een(0);
    public static final een c = new een(1);
    public static final gra d = new gra(-1.0f, -1.0f);
    public static final gra e = new gra(0.0f, -1.0f);
    public static final gra f = new gra(1.0f, -1.0f);
    public static final gra g = new gra(-1.0f, 0.0f);
    public static final gra h = new gra(0.0f, 0.0f);
    public static final gra i = new gra(1.0f, 0.0f);
    public static final gra t = new gra(-1.0f, 1.0f);
    public static final gra X = new gra(0.0f, 1.0f);
    public static final gra Y = new gra(1.0f, 1.0f);
    public static final fra Z = new fra(-1.0f);
    public static final fra N0 = new fra(0.0f);
    public static final fra O0 = new fra(1.0f);
    public static final era P0 = new era(-1.0f);
    public static final era Q0 = new era(0.0f);
    public static final era R0 = new era(1.0f);
    public static final een S0 = new een(3);
    public static final een T0 = new een(4);
    public static final een U0 = new een(5);
    public static final een V0 = new een(6);
    public static final een W0 = new een(7);
    public static final een X0 = new een(8);
    public static final een Y0 = new een(9);
    public static final een Z0 = new een(10);
    public static final een a1 = new een(11);
    public static final een b1 = new een(12);
    public static final een c1 = new een(13);
    public static final een d1 = new een(14);
    public static final een e1 = new een(15);
    public static final een f1 = new een(16);
    public static final een g1 = new een(17);
    public static final een h1 = new een(18);
    public static final een i1 = new een(19);
    public static final een j1 = new een(21);
    public static final een k1 = new een(22);
    public static final een l1 = new een(24);
    public static final een m1 = new een(25);
    public static final een n1 = new een(26);
    public static final een o1 = new een(27);
    public static final een p1 = new een(28);
    public static final een q1 = new een(29);

    public /* synthetic */ een(byte b2) {
        this.a = b2;
    }

    public static Set b(u3a0 u3a0Var) {
        c3a0 c3a0Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        t3a0 t3a0Var = u3a0Var.a;
        boolean z = t3a0Var.a && (t3a0Var.b || t3a0Var.c);
        Set set = u3a0Var.b;
        ee9 ee9Var = r2a0.b.a;
        e3a0 e3a0Var = null;
        c3a0 e3a0Var2 = (!z || set.contains(ee9Var)) ? (z || !set.contains(ee9Var)) ? null : new e3a0(Collections.singleton(ee9Var)) : new c3a0(Collections.singleton(ee9Var));
        if (e3a0Var2 != null) {
            linkedHashSet.add(e3a0Var2);
        }
        boolean z2 = t3a0Var.a && (t3a0Var.b || t3a0Var.c);
        ee9 ee9Var2 = r2a0.c.a;
        c3a0 e3a0Var3 = (!z2 || set.contains(ee9Var2)) ? (z2 || !set.contains(ee9Var2)) ? null : new e3a0(Collections.singleton(ee9Var2)) : new c3a0(Collections.singleton(ee9Var2));
        if (e3a0Var3 != null) {
            linkedHashSet.add(e3a0Var3);
        }
        boolean z3 = t3a0Var.e && t3a0Var.a && (t3a0Var.b || t3a0Var.c);
        ce9 ce9Var = new ce9(cih1.JAM_CLOSE);
        c3a0 e3a0Var4 = (!z3 || set.contains(ce9Var)) ? (z3 || !set.contains(ce9Var)) ? null : new e3a0(Collections.singleton(ce9Var)) : new c3a0(Collections.singleton(ce9Var));
        if (e3a0Var4 != null) {
            linkedHashSet.add(e3a0Var4);
        }
        boolean z4 = t3a0Var.e && t3a0Var.a && (t3a0Var.b || t3a0Var.c);
        ce9 ce9Var2 = new ce9(cih1.JAM_FAR);
        c3a0 e3a0Var5 = (!z4 || set.contains(ce9Var2)) ? (z4 || !set.contains(ce9Var2)) ? null : new e3a0(Collections.singleton(ce9Var2)) : new c3a0(Collections.singleton(ce9Var2));
        if (e3a0Var5 != null) {
            linkedHashSet.add(e3a0Var5);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (obj instanceof c3a0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r7h.W(((c3a0) it.next()).a, arrayList2);
            }
            c3a0Var = new c3a0(o7h.p1(arrayList2));
        } else {
            c3a0Var = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            if (obj2 instanceof e3a0) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                r7h.W(((e3a0) it2.next()).a, arrayList4);
            }
            e3a0Var = new e3a0(o7h.p1(arrayList4));
        }
        return dm61.B0(new g3a0[]{c3a0Var, e3a0Var});
    }

    public static Set c(boolean z, boolean z2) {
        Set setW0 = dm61.w0(new aq21[]{z2 ? new yp21(pjw0.class) : new zp21(pjw0.class), new zp21(mtl.class), new zp21(nbw0.class), new zp21(jo70.class), new yp21(prl.class), new yp21(xkk1.class), new yp21(hzy.class)});
        if (z) {
            setW0.add(new yp21(e2k1.class));
        }
        return setW0;
    }

    public static Set d(u3a0 u3a0Var) {
        d3a0 d3a0Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        t3a0 t3a0Var = u3a0Var.a;
        Set set = u3a0Var.c;
        boolean z = t3a0Var.a && (t3a0Var.b || t3a0Var.c) && t3a0Var.d;
        ee9 ee9Var = r2a0.d.a;
        f3a0 f3a0Var = null;
        d3a0 f3a0Var2 = (!z || set.contains(ee9Var)) ? (z || !set.contains(ee9Var)) ? null : new f3a0(Collections.singleton(ee9Var)) : new d3a0(Collections.singleton(ee9Var));
        if (f3a0Var2 != null) {
            linkedHashSet.add(f3a0Var2);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (obj instanceof d3a0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r7h.W(((d3a0) it.next()).a, arrayList2);
            }
            d3a0Var = new d3a0(o7h.p1(arrayList2));
        } else {
            d3a0Var = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            if (obj2 instanceof f3a0) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                r7h.W(((f3a0) it2.next()).a, arrayList4);
            }
            f3a0Var = new f3a0(o7h.p1(arrayList4));
        }
        return dm61.B0(new g3a0[]{d3a0Var, f3a0Var});
    }

    public Bundle a(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Bundle extras = intent.getExtras();
        return extras == null ? new Bundle() : extras;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return (ug8) obj;
            case 2:
            case 5:
            case 6:
            case 8:
            case 12:
            case 14:
            case 18:
            case 20:
            case 22:
            case 23:
            case 26:
            default:
                return j5.a;
            case 3:
                return Boolean.valueOf(((zs4) obj).a);
            case 4:
                return Boolean.valueOf(((EsOffline.TotalProgressResponse) obj).o().s());
            case 7:
                EsClientToken$AcquireResult esClientToken$AcquireResult = (EsClientToken$AcquireResult) obj;
                if (esClientToken$AcquireResult.r()) {
                    return new klg(esClientToken$AcquireResult.p().t(), esClientToken$AcquireResult.p().r(), esClientToken$AcquireResult.p().s(), esClientToken$AcquireResult.p().o(), esClientToken$AcquireResult.p().q());
                }
                if (esClientToken$AcquireResult.q()) {
                    return new elg(esClientToken$AcquireResult.o().o(), esClientToken$AcquireResult.o().getMessage());
                }
                throw new RuntimeException("Unexpected client-token esperanto response: " + esClientToken$AcquireResult);
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return VolumeMessages$VolumeResponse.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.VolumeMessages.VolumeResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 11:
                return (eww0) ((spq0) obj).b();
            case 13:
                Double d2 = ((l0u) obj).a;
                return Double.valueOf(d2 != null ? d2.doubleValue() : -1.0d);
            case 15:
                jn41 jn41Var = (ln41) obj;
                return jn41Var instanceof jn41 ? new gpw(((vuk) jn41Var.a).f()) : hpw.a;
            case 16:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
            case 17:
                chm0 chm0Var = (chm0) obj;
                return oqn1.n(chm0Var.b(), chm0Var.f);
            case 19:
                return sih1.a;
            case 21:
                return Boolean.valueOf(((egd0) obj).a);
            case 24:
                return Boolean.valueOf(((vir0) obj) instanceof sir0);
            case 25:
                return Boolean.valueOf(y7y0.F((Map) obj));
            case 27:
                return new csp0(new qsp0(((EsOffline.Error) obj).n().getNumber()));
        }
    }

    @Override // p.usi1
    public Object h(eha0 eha0Var, float f2) {
        return pha0.b(eha0Var, f2);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new ctf0(xkg0Var, str2, str);
    }

    @Override // p.v0i
    public Object m(dxy dxyVar) {
        return qgo1.q((Executor) dxyVar.d(new lzy0(fw9.class, Executor.class)));
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        Boolean bool3 = (Boolean) obj3;
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        bool2.getClass();
        boolean zBooleanValue2 = bool2.booleanValue();
        bool3.getClass();
        return fjb.e(zBooleanValue, zBooleanValue2, bool3.booleanValue());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 6:
                return ((Boolean) obj).booleanValue();
            case 8:
                return ((k78) obj).a();
            case 12:
                return ((Boolean) obj).booleanValue();
            default:
                return ((b021) obj).equals(yz11.a);
        }
    }
}
