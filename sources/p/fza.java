package p;

import android.content.Intent;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.your_library_esperanto.proto.AlsoAvailableOfflineSuggestion;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fza implements ya, Function, BiFunction, nq41, jrn0, mfv0, Init, jgi0, av30, h271 {
    public final /* synthetic */ byte a;

    public /* synthetic */ fza(byte b) {
        this.a = b;
    }

    public static void c(ArrayList arrayList, StringBuilder sb, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        String string = sb.toString();
        int i = 0;
        int length = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            kwz0 kwz0Var = (kwz0) obj;
            if (i > 0) {
                length++;
            }
            length += kwz0Var.a.length();
            arrayList2.add(new iyv0(string, length, kwz0Var.b));
            i = i2;
        }
        arrayList.clear();
        sb.setLength(0);
    }

    public static void d() {
        ln00 ln00Var = ln00.b;
    }

    public static void e(zue0 zue0Var) {
        synchronized (wf10.b) {
        }
    }

    public static void f(zue0 zue0Var) {
        synchronized (wf10.b) {
        }
    }

    public static void g(zue0 zue0Var) {
        synchronized (wf10.b) {
        }
    }

    public static r4p1 h(String str) {
        if (str.length() != 0) {
            if (iro1.s(str)) {
                return new i8h("#".concat(ihc1.M0(iro1.y(str.substring(1)), 0, ((rr80) new tr80(0, 1, 1)).b + 1, "80").toString()));
            }
            if (iro1.s("#".concat(str))) {
                return new i8h("#".concat(ihc1.M0(iro1.y(str), 0, ((rr80) new tr80(0, 1, 1)).b + 1, "80").toString()));
            }
        }
        return j8h.c;
    }

    public static jyv0 i(mwz0 mwz0Var, gcg1 gcg1Var) {
        boolean z;
        List list = mwz0Var.a;
        if (list.isEmpty()) {
            return new jyv0(z6x.a);
        }
        int i = gcg1Var.a;
        int i2 = gcg1Var.b;
        wae1 wae1Var = gcg1Var.c;
        List<kwz0> listA1 = o7h.a1(list, k0d.Q0);
        ArrayList arrayList = new ArrayList();
        kwz0 kwz0Var = (kwz0) o7h.q0(listA1);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        long jLongValue = Long.valueOf(kwz0Var.b.b).longValue();
        boolean zContains = false;
        boolean z2 = true;
        boolean z3 = i2 > 1;
        for (kwz0 kwz0Var2 : listA1) {
            String str = kwz0Var2.a;
            n5f0 n5f0Var = kwz0Var2.b;
            if (ihc1.y0(str)) {
                z = z3;
            } else {
                z = z3;
                if (z3 || (!zContains && Long.valueOf(n5f0Var.a).longValue() - jLongValue <= 0.1f)) {
                    int length = sb.length();
                    if (sb.length() > 0) {
                        sb.append(' ');
                    }
                    sb.append(str);
                    if (wae1Var.a(sb) > (z ? (i2 + 1) * i : i)) {
                        sb.setLength(length);
                        c(arrayList2, sb, arrayList);
                        sb.append(str);
                        arrayList2.add(kwz0Var2);
                    } else {
                        arrayList2.add(kwz0Var2);
                    }
                } else {
                    c(arrayList2, sb, arrayList);
                    sb.append(str);
                    arrayList2.add(kwz0Var2);
                }
                jLongValue = Long.valueOf(n5f0Var.b).longValue();
                zContains = fcg1.a.contains(Character.valueOf(ihc1.z0(str)));
            }
            z2 = z2;
            z3 = z;
        }
        c(arrayList2, sb, arrayList);
        return new jyv0(arrayList);
    }

    public static bc71 k(bc71 bc71Var, String str) {
        rb71 rb71Var = new rb71(0.0f, new ob71(str));
        if (bc71Var instanceof yb71) {
            return yb71.j((yb71) bc71Var, rb71Var);
        }
        if (bc71Var instanceof wb71) {
            wb71 wb71Var = (wb71) bc71Var;
            return new wb71(wb71Var.a, wb71Var.b, rb71Var, wb71Var.d, wb71Var.e, wb71Var.f, wb71Var.g, wb71Var.h);
        }
        if (!(bc71Var instanceof sb71)) {
            return bc71Var;
        }
        sb71 sb71Var = (sb71) bc71Var;
        zb71 zb71Var = sb71Var.b;
        bc71 bc71VarK = zb71Var != null ? k(zb71Var, str) : null;
        return new sb71(sb71Var.a, bc71VarK instanceof zb71 ? (zb71) bc71VarK : null);
    }

    public long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        return 0L;
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.g;
    }

    public Object apply(Object obj, Object obj2) {
        aey aeyVar;
        List<AlsoAvailableOfflineSuggestion> list = (List) obj;
        Boolean bool = (Boolean) obj2;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (AlsoAvailableOfflineSuggestion alsoAvailableOfflineSuggestion : list) {
            alsoAvailableOfflineSuggestion.getClass();
            boolean zBooleanValue = bool.booleanValue();
            ttm1 ttm1Var = null;
            if (alsoAvailableOfflineSuggestion.r() != yy3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_OFFLINE_BACKUP || zBooleanValue) {
                int iOrdinal = alsoAvailableOfflineSuggestion.r().ordinal();
                aey aeyVar2 = aey.O0;
                aey aeyVar3 = aey.t;
                if (iOrdinal == 1) {
                    aeyVar = aeyVar3;
                } else {
                    if (iOrdinal == 2) {
                        aeyVar3 = aey.f;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            aeyVar = aeyVar2;
                        } else {
                            aeyVar3 = aey.c;
                        }
                    }
                    aeyVar = aeyVar3;
                }
                if (aeyVar != aeyVar2) {
                    YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoE = alsoAvailableOfflineSuggestion.p().e();
                    String uri = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoE.getUri();
                    uri.getClass();
                    String name = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoE.getName();
                    String strQ = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoE.q();
                    if (strQ.length() == 0) {
                        strQ = "";
                    }
                    sy3 sy3Var = new sy3(aeyVar, alsoAvailableOfflineSuggestion.o(), alsoAvailableOfflineSuggestion.q(), alsoAvailableOfflineSuggestion.n(), uri);
                    ttm1Var = new ttm1(uri, name, strQ, aey.N0, sy3Var);
                }
            }
            if (ttm1Var != null) {
                arrayList.add(ttm1Var);
            }
        }
        return new xo3(arrayList);
    }

    public Object b(u171 u171Var) {
        qz61 qz61Var = u171Var.a;
        if (!u890.j(qz61Var.c, ysd.a)) {
            hhg1.n("Expected Unknown card data for prompted playlist card");
            return null;
        }
        String strZ = qz61Var.b.z();
        if (strZ != null) {
            return new a3y0(strZ);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public kgi0 create() {
        return new kgi0();
    }

    public First e0(Object obj) {
        return First.b((qva0) obj);
    }

    public synchronized void j(String str) {
        synchronized (wf10.b) {
        }
        synchronized (this) {
            oue0.b.put(str, "ACCESS_TOKEN_REMOVED");
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        return new hrn0(c4t0.class, new wau(lvx.k(s4b1VarX), e9k.s(s4b1VarX), e9k.r(s4b1VarX), true, khc.g()), a6w0.a);
    }

    public Object s(t171 t171Var) {
        throw new UnsupportedOperationException("Chat preview input not supported for prompted playlist cards");
    }

    public Object t(v171 v171Var) {
        throw new UnsupportedOperationException("URI input not supported for prompted playlist cards");
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Throwable th = (Throwable) obj;
                n57.g("Cannot start playing from PlayAction", th);
                return new beh(l1d.m("Cannot start playing from PlayAction", th.getLocalizedMessage()));
            case 2:
                return k4h.d((CollectionPlatformEsperantoItemsResponse) obj);
            case 3:
                return jc9.s((sy21) obj);
            case 17:
                return hkn0.b.get(obj);
            default:
                return cr51.d((feh) obj);
        }
    }
}
