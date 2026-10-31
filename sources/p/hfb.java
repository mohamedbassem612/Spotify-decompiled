package p;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hfb implements BiFunction, Function, fr61, jrn0, c290, xz20, ya, Init, mc41, h271, dsn {
    public final /* synthetic */ byte a;

    public static final String a(y2j0 y2j0Var) {
        if (y2j0Var instanceof w2j0) {
            return "appoperation";
        }
        if (y2j0Var instanceof x2j0) {
            return "none";
        }
        eg.o();
        return null;
    }

    public static final String c(c3j0 c3j0Var) {
        if (c3j0Var instanceof b3j0) {
            return ((b3j0) c3j0Var).a ? "userinteraction_immediate" : "userinteraction";
        }
        if (c3j0Var instanceof z2j0) {
            return ((z2j0) c3j0Var).a ? "background_timesensitive" : "background";
        }
        if (c3j0Var instanceof a3j0) {
            return "unknown";
        }
        eg.o();
        return null;
    }

    public static final String f(q4j0 q4j0Var) {
        if (q4j0Var instanceof k4j0) {
            return "banner";
        }
        if (q4j0Var instanceof o4j0) {
            return "snackbar";
        }
        if (q4j0Var instanceof n4j0) {
            return "promobar";
        }
        if (q4j0Var instanceof l4j0) {
            return "bottomsheet";
        }
        if (q4j0Var instanceof m4j0) {
            return "dialog";
        }
        if (q4j0Var instanceof p4j0) {
            return "tooltip";
        }
        eg.o();
        return null;
    }

    public static final boolean h(Request request) {
        Map headers = request.getHeaders();
        if (headers == null || !headers.containsKey("force-request") || !u890.j(headers.get("force-request"), "true")) {
            String uri = request.getUri();
            if (uri == null) {
                eg.m("Required value was null.");
                return false;
            }
            if (!nhc1.Y(uri, "sp://esperanto/spotify.connectivity.auth.client_token.esperanto.proto.ClientTokenProvider/getToken", false) && !nhc1.Y(uri, "sp://esperanto/spotify.authentication.login5esperanto.Login5/", false)) {
                return true;
            }
        }
        return false;
    }

    public static final c350 i(String str, String str2, String str3) {
        c350 c350Var = new c350();
        Bundle bundleF = pzm.f("title", str, "positive_button_text", str2);
        bundleF.putString("negative_button_text", str3);
        c350Var.T0(bundleF);
        return c350Var;
    }

    public static jm61 j(mta mtaVar) {
        return new jm61(System.currentTimeMillis() + 3600000, new ho41(8), new yw7(true, false, false), 10.0d, 1.2d, 60);
    }

    public static p0b0 k(n0b0 n0b0Var) {
        String str = n0b0Var.a;
        of8 of8Var = new of8(str, n0b0Var.b.getBytes(nne.e));
        k0b0 k0b0Var = n0b0Var.c;
        return new p0b0(new di8(str, k0b0Var != null ? new wd(k0b0Var.a, k0b0Var.b, k0b0Var.c) : null, of8Var), n0b0Var.d, n0b0Var.e, n0b0Var.f, n0b0Var.g, n0b0Var.h);
    }

    public static int m() {
        int i;
        synchronized (b180.l) {
            i = b180.k;
            b180.k = i + 1;
        }
        return i;
    }

    public static n0b0 o(p0b0 p0b0Var) {
        di8 di8Var = p0b0Var.a;
        of8 of8Var = di8Var.c;
        if (of8Var == null) {
            of8Var = null;
        }
        byte[] bArr = of8Var != null ? of8Var.b : null;
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr, nne.e);
        String str2 = di8Var.a;
        wd wdVar = di8Var.b;
        return new n0b0(str2, str, wdVar != null ? new k0b0(wdVar.a, wdVar.b, wdVar.c) : null, p0b0Var.b, p0b0Var.c, p0b0Var.d, p0b0Var.e, p0b0Var.f);
    }

    public static final int p(int i, String str) {
        int i2 = 1;
        int iN = 0;
        if (1 <= i) {
            while (true) {
                iN += ((i + 2) - i2) * eth.n(str.charAt(i2 - 1));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        int i3 = (iN * 10) % 11;
        if (i3 >= 10) {
            return 0;
        }
        return i3;
    }

    public boolean accept(Object obj) {
        return !((ksk) obj).b;
    }

    public Object apply(Object obj, Object obj2) {
        xjd xjdVar = (xjd) obj;
        PlayerState playerState = (PlayerState) obj2;
        return u890.j((String) playerState.track().i(bx8.c).e(""), xjdVar.a) ? new i5w0(ne.w(playerState, xjdVar.b)) : j5.a;
    }

    public Object b(u171 u171Var) {
        amz0 amz0Var;
        qz61 qz61Var = u171Var.a;
        wsd wsdVar = qz61Var.c;
        wsd wsdVar2 = wsdVar instanceof wsd ? wsdVar : null;
        if (wsdVar2 == null || (amz0Var = wsdVar2.a) == null) {
            hhg1.n("Expected Quote card data");
            return null;
        }
        String strZ = qz61Var.b.z();
        if (strZ != null) {
            return new a1e1(strZ, amz0Var.b, amz0Var.c);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public Object convert(int i) {
        cm7 cm7Var;
        switch (i) {
            case 0:
                cm7Var = cm7.b;
                break;
            case 1:
                cm7Var = cm7.c;
                break;
            case 2:
                cm7Var = cm7.d;
                break;
            case 3:
                cm7Var = cm7.e;
                break;
            case 4:
                cm7Var = cm7.f;
                break;
            case 5:
                cm7Var = cm7.g;
                break;
            case 6:
                cm7Var = cm7.h;
                break;
            case 7:
                cm7Var = cm7.i;
                break;
            default:
                cm7Var = null;
                break;
        }
        return cm7Var == null ? cm7.t : cm7Var;
    }

    public Bundle d(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("activeFilterIds", new ArrayList<>(tx9.j((th91) obj)));
        return bundle;
    }

    public Object e(Bundle bundle, Object obj) {
        ArrayList arrayList = ((sh91) obj).a;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("activeFilterIds");
        if (stringArrayList != null) {
            if (stringArrayList.isEmpty()) {
                stringArrayList = null;
            }
            if (stringArrayList != null) {
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((oh91) it.next()).a);
                }
                Set setP1 = o7h.p1(arrayList2);
                if (!stringArrayList.isEmpty()) {
                    Iterator<T> it2 = stringArrayList.iterator();
                    while (it2.hasNext()) {
                        if (setP1.contains((String) it2.next())) {
                            ArrayList arrayListS = tx9.s(stringArrayList, arrayList);
                            return tx9.k(tx9.y(arrayList, arrayListS), arrayListS, 0, true, (List) null);
                        }
                    }
                }
            }
        }
        return null;
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 20:
                grv0 grv0Var = (grv0) obj;
                prv0 prv0Var = grv0Var.a;
                if (prv0Var instanceof orv0) {
                    return First.c(grv0Var, Collections.singleton(nqv0.a));
                }
                if ((prv0Var instanceof mrv0) || (prv0Var instanceof nrv0)) {
                    return First.b(grv0Var);
                }
                eg.o();
                return null;
            default:
                return First.b((z011) obj);
        }
    }

    public jm61 g(mta mtaVar, JSONObject jSONObject) {
        return j(mtaVar);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        Uri uri = s4b1VarX.a;
        if (uri == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        if (pathSegments.size() <= 2) {
            return crn0.a;
        }
        String str = pathSegments.get(2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rr80 rr80VarO = yoi1.O(yoi1.Q(3, pathSegments.size()), 2);
        int i = rr80VarO.a;
        int i2 = rr80VarO.b;
        int i3 = rr80VarO.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                String str2 = pathSegments.get(i);
                String str3 = (String) o7h.t0(i + 1, pathSegments);
                if (str3 != null) {
                    linkedHashMap.put(str2, str3);
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        for (String str4 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str4);
            if (queryParameter != null) {
                linkedHashMap.put(str4, nhc1.W(queryParameter, "/", ":"));
            }
        }
        str.getClass();
        return new hrn0(c4t0.class, new zau(str, linkedHashMap, e9k.s(s4b1VarX), e9k.r(s4b1VarX), true, khc.g()), a6w0.a);
    }

    public void n(Object obj, Rect rect) {
        ((kg) obj).f(rect);
    }

    public Object s(t171 t171Var) {
        throw new UnsupportedOperationException("Chat preview input not supported for text content cards");
    }

    public Object t(v171 v171Var) {
        throw new UnsupportedOperationException("URI input not supported for text content cards");
    }

    public String toString() {
        switch (this.a) {
            case 29:
                int iHashCode = hashCode();
                eth.h(16);
                return cy30.p("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", rc11.a.b(String.class).r(), ">");
            default:
                return super.toString();
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return k4h.c((Throwable) obj);
            default:
                return Observable.just(((sj91) obj).a);
        }
    }
}
