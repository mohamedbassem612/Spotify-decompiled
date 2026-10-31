package p;

import android.content.Intent;
import android.util.Base64;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.player.model.PlayerState;
import com.spotify.playlistreaction.v1.ReactionsRow;
import com.spotify.show_esperanto.proto.SectionsPolicy;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pvc implements av30, Function4, Function, p641, c290, ya, skh0, jrn0, BiFunction, b8x0, Predicate {
    public final /* synthetic */ byte a;

    public pvc(daq daqVar, teq teqVar) {
        this.a = (byte) 4;
    }

    public static rd70 b(String str, String str2, y570 y570Var, List list, List list2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        gd70 gd70VarP;
        if (y570Var == null) {
            gd70VarP = null;
        } else {
            gd70 gd70Var = gd70.c;
            gd70VarP = cyo1.p(y570Var);
        }
        gd70 gd70Var2 = gd70VarP;
        b380 b380VarR = zxo1.r(list);
        b380 b380VarR2 = zxo1.r(list2);
        HubsImmutableComponentBundle hubsImmutableComponentBundle2 = HubsImmutableComponentBundle.b;
        return new rd70(str, str2, gd70Var2, b380VarR, b380VarR2, str3, lqc.v(hubsImmutableComponentBundle));
    }

    public static ioj0 h(pvc pvcVar, Map map) {
        h3r h3rVar;
        Set<jh5> setKeySet = map.keySet();
        pvcVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (jh5 jh5Var : setKeySet) {
            if (!jh5Var.a()) {
                xv00 xv00Var = jh5Var.a;
                xv00 xv00Var2 = xv00Var instanceof xv00 ? xv00Var : null;
                if (xv00Var2 != null && (h3rVar = (k3r) map.get(jh5Var)) != null) {
                    Class clsN = xv00Var2.a.n();
                    String str = (String) jh5Var.b;
                    if (h3rVar instanceof j3r) {
                        Object linkedHashMap2 = linkedHashMap.get(str);
                        if (linkedHashMap2 == null) {
                            linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap.put(str, linkedHashMap2);
                        }
                        ((Map) linkedHashMap2).put(clsN, new goj0(((j3r) h3rVar).a));
                    } else if (h3rVar instanceof i3r) {
                        Object linkedHashMap3 = linkedHashMap.get(str);
                        if (linkedHashMap3 == null) {
                            linkedHashMap3 = new LinkedHashMap();
                            linkedHashMap.put(str, linkedHashMap3);
                        }
                        ((Map) linkedHashMap3).remove(clsN);
                    } else {
                        if (!(h3rVar instanceof h3r)) {
                            eg.o();
                            return null;
                        }
                        if (h3rVar.a instanceof c3r) {
                            Object linkedHashMap4 = linkedHashMap.get(str);
                            if (linkedHashMap4 == null) {
                                linkedHashMap4 = new LinkedHashMap();
                                linkedHashMap.put(str, linkedHashMap4);
                            }
                            ((Map) linkedHashMap4).put(clsN, new foj0(2));
                        } else {
                            Object linkedHashMap5 = linkedHashMap.get(str);
                            if (linkedHashMap5 == null) {
                                linkedHashMap5 = new LinkedHashMap();
                                linkedHashMap.put(str, linkedHashMap5);
                            }
                            ((Map) linkedHashMap5).put(clsN, new foj0(1));
                        }
                    }
                }
            }
        }
        return new ioj0(linkedHashMap);
    }

    public static wyz0 i(Map map) {
        String str = (String) map.get("reactions_row");
        if (str == null) {
            return null;
        }
        try {
            ReactionsRow reactionsRowQ = ReactionsRow.q(Base64.decode(str, 0));
            return new wyz0(reactionsRowQ.n(), reactionsRowQ.p(), reactionsRowQ.o());
        } catch (IllegalArgumentException | InvalidProtocolBufferException unused) {
            return null;
        }
    }

    public static rd70 j(re70 re70Var) {
        return re70Var instanceof rd70 ? (rd70) re70Var : b(re70Var.a(), re70Var.b(), re70Var.l(), re70Var.k(), re70Var.j(), re70Var.h(), re70Var.g());
    }

    public static void k(r6h1 r6h1Var) {
        wqk0 wqk0Var = r6h1Var != null ? new wqk0(r6h1Var, (byte) 21) : null;
        if (wqk0Var != null) {
            x6h1 x6h1VarC = wqk0Var.c.c();
            x6h1VarC.i.add(new a7h1("cancel", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1VarC.a();
            b7x b7xVar = b7x.a;
            new z7h1("hit", 1, b7xVar);
            new x7h1("ui_hide", 1, b7xVar);
            System.currentTimeMillis();
        }
    }

    public static void m(String str, r6h1 r6h1Var) {
        wqk0 wqk0Var = r6h1Var != null ? new wqk0(r6h1Var, (byte) 21) : null;
        if (wqk0Var != null) {
            x6h1 x6h1VarC = wqk0Var.c.c();
            x6h1VarC.i.add(new a7h1("confirm", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1VarC.a();
            new z7h1("hit", 1, b7x.a);
            new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", str));
            System.currentTimeMillis();
        }
    }

    public static SectionsPolicy n(aqa0 aqa0Var) {
        vj51 vj51VarN = SectionsPolicy.n();
        Map map = aqa0Var.a;
        vj51VarN.getClass();
        Object obj = map.get("trailer");
        if (obj != null && (obj instanceof Boolean)) {
            vj51VarN.q(((Boolean) obj).booleanValue());
        }
        Object obj2 = map.get("nextBestEpisode");
        if (obj2 != null && (obj2 instanceof Boolean)) {
            vj51VarN.n(((Boolean) obj2).booleanValue());
        }
        return vj51VarN.build();
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean z = !zBooleanValue3;
        return new pdm(true, false, false, true, false, zBooleanValue || (((Boolean) obj4).booleanValue() && zBooleanValue3), z, z, false, false, zBooleanValue2, false, false, 245286);
    }

    public boolean accept(Object obj) {
        switch (this.a) {
            case 14:
                Set set = s4b1.f;
                return uic.x(((ksk) obj).a).c == blc0.ka;
            default:
                int iOrdinal = ((ksk) obj).c.ordinal();
                if (iOrdinal != 1) {
                    switch (iOrdinal) {
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                            break;
                        default:
                            return false;
                    }
                }
                return true;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return zcg.b.get(obj);
            case 7:
                return Boolean.valueOf(yto.k((String) ((Map) obj).get("other-video-disabled"), false));
            case 10:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add((InputStream) obj2);
                }
                return arrayList;
            case 23:
                return o751.f((Throwable) obj);
            default:
                mmr0 mmr0Var = (mmr0) obj;
                return mtf1.b((PlayerState) mmr0Var.a, ((Boolean) mmr0Var.b).booleanValue(), false);
        }
    }

    public int c(w2z w2zVar, gar garVar, int i) {
        ((oac) garVar).a = 4;
        return -4;
    }

    public Object convert(int i) {
        r8p0 r8p0Var = null;
        switch (this.a) {
            case 9:
                moz mozVarA = moz.a(i);
                return mozVarA == null ? moz.f : mozVarA;
            case 11:
                nig nigVarA = nig.a(i);
                return nigVarA == null ? nig.UNRECOGNIZED : nigVarA;
            case 16:
                if (i == 0) {
                    r8p0Var = oan0.b;
                } else if (i == 1) {
                    r8p0Var = oan0.c;
                } else if (i == 2) {
                    r8p0Var = oan0.d;
                }
                return r8p0Var == null ? oan0.e : r8p0Var;
            case 17:
                if (i == 0) {
                    r8p0Var = r8p0.b;
                } else if (i == 1) {
                    r8p0Var = r8p0.c;
                } else if (i == 2) {
                    r8p0Var = r8p0.d;
                }
                return r8p0Var == null ? r8p0.e : r8p0Var;
            default:
                cki1 cki1VarA = cki1.a(i);
                return cki1VarA == null ? cki1.f : cki1VarA;
        }
    }

    public void d(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    public boolean isReady() {
        return true;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        return qv3.b(intent, th61Var, nik1.Q3);
    }

    public int s(long j) {
        return 0;
    }

    public boolean test(Object obj) {
        return !c6b1.a((PlayerState) obj);
    }

    public void e() {
    }

    public Object apply(Object obj, Object obj2) {
        return (List) obj;
    }
}
