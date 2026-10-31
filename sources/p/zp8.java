package p;

import android.content.Intent;
import android.media.audiofx.AcousticEchoCanceler;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.VolumeMessages;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zp8 implements Predicate, s2i1, Function, jrn0, t2n, Init, hiy {
    public final /* synthetic */ byte a;
    public static final zp8 b = new zp8(0);
    public static final zp8 c = new zp8(1);
    public static final zp8 d = new zp8(2);
    public static final zp8 e = new zp8(3);
    public static final zp8 f = new zp8(4);
    public static final zp8 g = new zp8(5);
    public static final zp8 h = new zp8(6);
    public static final zp8 i = new zp8(7);
    public static final zp8 t = new zp8(9);
    public static final zp8 X = new zp8(10);
    public static final zp8 Y = new zp8(11);
    public static final zp8 Z = new zp8(12);
    public static final zp8 N0 = new zp8(13);
    public static final zp8 O0 = new zp8(14);
    public static final zp8 P0 = new zp8(15);
    public static final zp8 Q0 = new zp8(16);
    public static final zp8 R0 = new zp8(17);
    public static final zp8 S0 = new zp8(18);
    public static final zp8 T0 = new zp8(19);
    public static final zp8 U0 = new zp8(20);
    public static final zp8 V0 = new zp8(21);
    public static final zp8 W0 = new zp8(22);
    public static final zp8 X0 = new zp8(23);
    public static final zp8 Y0 = new zp8(24);
    public static final zp8 Z0 = new zp8(26);
    public static final zp8 a1 = new zp8(27);
    public static final zp8 b1 = new zp8(28);
    public static final zp8 c1 = new zp8(29);

    public /* synthetic */ zp8(byte b2) {
        this.a = b2;
    }

    public static a9u a(abu abuVar, s9l1 s9l1Var) {
        String str;
        String contextUri = abuVar.getContextUri();
        String str2 = s9l1Var.d;
        String contextUri2 = s9l1Var.j;
        if (contextUri2.length() == 0) {
            contextUri2 = abuVar.getContextUri();
        }
        xau xauVar = abuVar instanceof xau ? (xau) abuVar : null;
        if (xauVar == null || (str = xauVar.g) == null) {
            str = "";
        }
        return new a9u(contextUri, str2, contextUri2, str);
    }

    public static HashSet b(d9u... d9uVarArr) {
        HashSet hashSetA = Effects.a(new d9u[0]);
        Iterator it = f46.i0(d9uVarArr).iterator();
        while (it.hasNext()) {
            hashSetA.add((d9u) it.next());
        }
        return hashSetA;
    }

    public static r160 c(qau qauVar, int i2) {
        s9l1 s9l1Var = qauVar.g;
        z0i z0iVar = s9l1Var != null ? (z0i) s9l1Var.b.get(i2) : null;
        w8l1 w8l1Var = z0iVar instanceof w8l1 ? (w8l1) z0iVar : null;
        if (w8l1Var != null) {
            return w8l1Var.b();
        }
        return null;
    }

    public static Integer d(String str, s9l1 s9l1Var) {
        if (str == null) {
            return null;
        }
        Iterator it = s9l1Var.b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (e((z0i) it.next()).equals(str)) {
                return Integer.valueOf(i2);
            }
            i2++;
        }
        i2 = -1;
        return Integer.valueOf(i2);
    }

    public static String e(z0i z0iVar) {
        if (!(z0iVar instanceof w8l1)) {
            String strO = rc11.a.b(z0iVar.getClass()).o();
            if (strO != null) {
                return strO;
            }
            hhg1.n("Required value was null.");
            return null;
        }
        w8l1 w8l1Var = (w8l1) z0iVar;
        String itemId = w8l1Var.getItemId();
        if (itemId != null) {
            String str = itemId.length() > 0 ? itemId : null;
            if (str != null) {
                return str;
            }
        }
        String uri = w8l1Var.getUri();
        return uri == null ? "" : uri;
    }

    public static List f(int i2, List list) {
        if (i2 == p7h.L(list)) {
            return z6x.a;
        }
        List<z0i> listSubList = list.subList(i2 + 1, list.size());
        ArrayList arrayList = new ArrayList();
        for (z0i z0iVar : listSubList) {
            w8l1 w8l1Var = z0iVar instanceof w8l1 ? (w8l1) z0iVar : null;
            vpl vplVarA = w8l1Var != null ? w8l1Var.a() : null;
            if (vplVarA != null) {
                arrayList.add(vplVarA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((vpl) it.next()).l(), arrayList2);
        }
        return arrayList2;
    }

    public static vq71 h(qau qauVar, int i2) {
        s9l1 s9l1Var = qauVar.g;
        z0i z0iVar = s9l1Var != null ? (z0i) s9l1Var.b.get(i2) : null;
        w8l1 w8l1Var = z0iVar instanceof w8l1 ? (w8l1) z0iVar : null;
        if (w8l1Var != null) {
            return w8l1Var.h();
        }
        return null;
    }

    public static boolean j(qau qauVar) {
        vpl vplVarA;
        Integer num = qauVar.a;
        if (num != null) {
            int iIntValue = num.intValue();
            s9l1 s9l1Var = qauVar.g;
            z0i z0iVar = s9l1Var != null ? (z0i) s9l1Var.b.get(iIntValue) : null;
            w8l1 w8l1Var = z0iVar instanceof w8l1 ? (w8l1) z0iVar : null;
            if (((w8l1Var == null || (vplVarA = w8l1Var.a()) == null) ? false : vplVarA.k()) || h(qauVar, iIntValue) != null) {
                return true;
            }
        }
        return false;
    }

    public static AcousticEchoCanceler k(int i2) {
        return AcousticEchoCanceler.create(i2);
    }

    public Object apply(Object obj) {
        h7z h7zVar;
        boolean z = false;
        switch (this.a) {
            case 3:
                return x051.a;
            case 4:
                return new hm2(((pk2) obj).b);
            case 5:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 17:
            default:
                k1r k1rVar = (k1r) obj;
                i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
                return (i1rVar == null || (h7zVar = (h7z) i1rVar.a) == null) ? new h7z(false, false, false, false, false, true) : h7zVar;
            case 6:
                return (t0i0) ((spq0) obj).b();
            case 10:
                l851 l851Var = (l851) obj;
                return new q39(l851Var.a, l851Var.b);
            case 11:
                return Integer.valueOf((int) ((Long) obj).longValue());
            case 15:
                Logger.e((Throwable) obj, "Error calling getSessionStatus()", new Object[0]);
                return e7g.a;
            case 16:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionContainsResponse.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionContainsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 18:
                h290 h290VarO = ((YourLibraryContainsResponse) obj).o();
                if (h290VarO.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = h290VarO.iterator();
                    while (it.hasNext()) {
                        if (!((YourLibraryContainsResponseEntity) it.next()).o()) {
                        }
                    }
                    z = true;
                }
                return new m781(z);
            case 19:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 20:
                return ((th61) obj).a;
            case 21:
                return (Observable) obj;
            case 22:
                jh20 jh20Var = (jh20) obj;
                zsq0 zsq0Var = jh20Var.a;
                return ((zsq0Var instanceof xsq0) || ((m851) zsq0Var.a).a.b.isEmpty()) ? Observable.just(jh20Var).cast(lh20.class).mergeWith(Observable.just(hh20.a)) : Observable.just(jh20Var).cast(lh20.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:1: B:36:0x0087->B:50:?, LOOP_END, SYNTHETIC] */
    public First e0(Object obj) {
        List list;
        Iterator it;
        List list2;
        Iterator it2;
        switch (this.a) {
            case 17:
                ca00 ca00Var = (ca00) obj;
                xj61 xj61Var = new xj61();
                la00 la00Var = ca00Var.a;
                ma00 ma00Var = la00Var.l;
                if (ma00Var != null) {
                    xj61Var.add(new xfk(ma00Var));
                }
                List list3 = ca00Var.b;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    list = ca00Var.c;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            list2 = ((ved1) it.next()).d;
                            if (list2 instanceof Collection) {
                            }
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    continue;
                                } else if (((e6m) it2.next()) instanceof t5m) {
                                    xj61Var.add(new pfk(la00Var.d));
                                }
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            list2 = ((ved1) it.next()).d;
                            if (list2 instanceof Collection) {
                            }
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    continue;
                                } else if (((e6m) it2.next()) instanceof t5m) {
                                    xj61Var.add(new pfk(la00Var.d));
                                }
                            }
                        }
                    }
                } else {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            list = ca00Var.c;
                            if ((list instanceof Collection) || !list.isEmpty()) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    list2 = ((ved1) it.next()).d;
                                    if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                        it2 = list2.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                continue;
                                            } else if (((e6m) it2.next()) instanceof t5m) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (((e6m) it3.next()) instanceof t5m) {
                        }
                        xj61Var.add(new pfk(la00Var.d));
                    }
                }
                return First.c(ca00Var, cwl1.j(xj61Var));
            case 26:
                return First.b((kvv) obj);
            default:
                return First.b((o800) obj);
        }
    }

    public Object g(Object obj) {
        ((uz21) obj).close();
        return rih1.a;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 2:
                return new ml0(xkg0Var, str2, str);
            default:
                return new uab(xkg0Var, str2, str);
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        String strJ = uic.x(intent.getDataString()).j();
        if (strJ == null) {
            strJ = "";
        }
        return new hrn0(tv3.class, new vv3("OFFER_REQUEST", "NoDialog_OFFER_REQUEST", false, strJ), new c6w0(3, false, (hd5) null, 14));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return !((uv00) obj).f;
            case 7:
                return !((List) obj).isEmpty();
            case 9:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            case 14:
                return ((Boolean) obj).booleanValue();
            case 23:
                return ((VolumeMessages.VolumeResponse) obj).p() == psh.b;
            default:
                return ((th61) obj).b;
        }
    }
}
