package p;

import android.content.Intent;
import android.net.Uri;
import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s6d implements it80 {
    public static final List e = p7h.M(new String[]{"spotify.com", "www.spotify.com", "open.spotify.com"});
    public final r84 a;
    public final ohm1 b;
    public final xvo c;
    public final q8n d;

    public s6d(r84 r84Var, ohm1 ohm1Var, xvo xvoVar, q8n q8nVar) {
        this.a = r84Var;
        this.b = ohm1Var;
        this.c = xvoVar;
        this.d = q8nVar;
    }

    public static String d(String str, String str2) {
        Object next;
        Iterator it = ihc1.Q0(str, new String[]{"&"}, 0, 6).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ihc1.j0((String) next, str2));
        String str3 = (String) next;
        if (str3 == null) {
            str3 = "";
        }
        List listQ0 = ihc1.Q0(str3, new String[]{"="}, 2, 2);
        return listQ0.size() < 2 ? "" : (String) listQ0.get(1);
    }

    public final void a(ajq0 ajq0Var) {
        wmo1.p(ajq0Var, m6d.c, "Campaign Route", new n6d(this, (lnm) null, (byte) 0));
        wmo1.p(ajq0Var, m6d.b, "Campaign Route", new ew0(this, (lnm) null, (byte) 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Intent intent, onm onmVar) {
        o6d o6dVar;
        String strJ;
        List<String> pathSegments;
        String strPrevious;
        Set<String> queryParameterNames;
        if (onmVar instanceof o6d) {
            o6dVar = (o6d) onmVar;
            int i = o6dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o6dVar.d = i - Integer.MIN_VALUE;
            } else {
                o6dVar = new o6d(this, onmVar);
            }
        } else {
            o6dVar = new o6d(this, onmVar);
        }
        Object objE = o6dVar.b;
        int i2 = o6dVar.d;
        LinkedHashMap linkedHashMap = null;
        if (i2 == 0) {
            hm5.M(objE);
            o6dVar.a = intent;
            o6dVar.d = 1;
            objE = e(o6dVar);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intent = o6dVar.a;
            hm5.M(objE);
        }
        if (((Boolean) objE).booleanValue()) {
            intent.setData(Uri.parse("spotify:home"));
            return lfb.h(intent);
        }
        Uri data = intent.getData();
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        if (s4b1VarX.c == blc0.Rj) {
            strJ = s4b1VarX.j();
        } else if (data == null || (pathSegments = data.getPathSegments()) == null) {
            strJ = null;
        } else {
            ListIterator<String> listIterator = pathSegments.listIterator(pathSegments.size());
            do {
                if (!listIterator.hasPrevious()) {
                    strPrevious = null;
                    break;
                }
                strPrevious = listIterator.previous();
            } while (ihc1.k0(strPrevious));
            strJ = strPrevious;
        }
        if ((strJ == null || nzy.i(strJ)) && strJ != null) {
            Set set2 = s4b1.f;
            Uri.Builder builderBuildUpon = Uri.parse(uic.D(strJ).y()).buildUpon();
            if (data != null && data.isOpaque()) {
                data = s4b1VarX.a;
            }
            if (data != null && (queryParameterNames = data.getQueryParameterNames()) != null) {
                Set<String> set3 = queryParameterNames;
                int iS = zno1.s(q7h.U(set3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                for (Object obj : set3) {
                    String queryParameter = data.getQueryParameter((String) obj);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    linkedHashMap.put(obj, queryParameter);
                }
            }
            if (linkedHashMap != null) {
                builderBuildUpon.getClass();
                linkedHashMap.forEach(new p6d(builderBuildUpon, (byte) 0));
            }
            Uri uriBuild = builderBuildUpon.build();
            if (uriBuild != null) {
                intent.setData(uriBuild);
                return lfb.h(intent);
            }
        }
        return crn0.a;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0152  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x014e A[SYNTHETIC] */
    public final Object c(Intent intent, onm onmVar) {
        q6d q6dVar;
        String strConcat;
        String strD;
        String str;
        Uri uri;
        String dataString;
        String[] strArr;
        int i;
        Uri uri2;
        int iOrdinal;
        String str2;
        String strD2;
        if (onmVar instanceof q6d) {
            q6dVar = (q6d) onmVar;
            int i2 = q6dVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q6dVar.e = i2 - Integer.MIN_VALUE;
            } else {
                q6dVar = new q6d(this, onmVar);
            }
        } else {
            q6dVar = new q6d(this, onmVar);
        }
        Object objE = q6dVar.c;
        int i3 = q6dVar.e;
        r84 r84Var = this.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objE);
            q6dVar.a = intent;
            q6dVar.e = 1;
            objE = e(q6dVar);
            if (objE != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            intent = q6dVar.a;
            hm5.M(objE);
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = q6dVar.b;
            intent = q6dVar.a;
            hm5.M(objE);
        }
        if (!((Boolean) objE).booleanValue() && (str == null || ihc1.y0(str))) {
            Set set = s4b1.f;
            return lfb.j(uic.x(nik1.O5.a));
        }
        if (str != null || ihc1.y0(str)) {
            strConcat = f4i1.e(nik1.P5.a, "?loadingPlaceholder=pageApiDefault");
        } else {
            strConcat = xcg1.i(nik1.P5.a, "?loadingPlaceholder=pageApiDefault&target=", str);
        }
        strD = str;
        uri = Uri.parse(strConcat);
        dataString = intent.getDataString();
        strArr = new String[]{"artist-id", "track-id", "show-id"};
        i = 0;
        while (true) {
            if (i < 3) {
                uri2 = null;
                break;
            }
            str2 = strArr[i];
            if (dataString != null) {
                strD2 = d(dataString, str2);
            } else {
                strD2 = null;
            }
            if (strD2 == null && !ihc1.y0(strD2)) {
                uri2 = Uri.parse("spotify:" + ihc1.m0(3, str2) + ":" + strD2);
                break;
            }
            i++;
        }
        if (uri2 != null) {
            uri = uri2;
        }
        intent.setData(uri);
        if (strD != null && !ihc1.y0(strD) && (iOrdinal = r84Var.a().ordinal()) != 0) {
            if (iOrdinal != 1) {
                intent.putExtra("target", strD);
            } else if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return null;
            }
        }
        return lfb.h(intent);
        strConcat = "spotify:home";
        if (((Boolean) objE).booleanValue()) {
            intent.setData(Uri.parse("spotify:home"));
            return lfb.h(intent);
        }
        String dataString2 = intent.getDataString();
        strD = dataString2 != null ? d(dataString2, "target") : null;
        int iOrdinal2 = r84Var.a().ordinal();
        if (iOrdinal2 == 0) {
            q6dVar.a = intent;
            q6dVar.b = strD;
            q6dVar.e = 2;
            Object objH = c921.H(this.d, new vk6(this, (lnm) null, (byte) 21), q6dVar);
            if (objH != d9nVar) {
                String str3 = strD;
                objE = objH;
                str = str3;
                if (!((Boolean) objE).booleanValue()) {
                }
                if (str != null) {
                    strConcat = f4i1.e(nik1.P5.a, "?loadingPlaceholder=pageApiDefault");
                } else {
                    strConcat = f4i1.e(nik1.P5.a, "?loadingPlaceholder=pageApiDefault");
                }
                strD = str;
            }
            return d9nVar;
        }
        if (iOrdinal2 == 1) {
            Uri data = intent.getData();
            String encodedQuery = data != null ? data.getEncodedQuery() : null;
            strConcat = (encodedQuery == null || encodedQuery.length() == 0) ? "spotify:sitemodal:watchfeed-fallback" : "spotify:sitemodal:watchfeed-fallback?".concat(encodedQuery);
        } else if (iOrdinal2 == 2) {
            strConcat = "spotify:playlist:37i9dQZEVXgvuLLK4005a0";
        } else if (iOrdinal2 != 3) {
            eg.o();
            return null;
        }
        uri = Uri.parse(strConcat);
        dataString = intent.getDataString();
        strArr = new String[]{"artist-id", "track-id", "show-id"};
        i = 0;
        while (true) {
            if (i < 3) {
                uri2 = null;
                break;
            }
            str2 = strArr[i];
            if (dataString != null) {
                strD2 = d(dataString, str2);
            } else {
                strD2 = null;
            }
            if (strD2 == null) {
            }
            i++;
        }
        if (uri2 != null) {
            uri = uri2;
        }
        intent.setData(uri);
        if (strD != null) {
            if (iOrdinal != 1) {
                intent.putExtra("target", strD);
            } else if (iOrdinal != 2) {
                eg.o();
                return null;
            }
        }
        return lfb.h(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        r6d r6dVar;
        if (onmVar instanceof r6d) {
            r6dVar = (r6d) onmVar;
            int i = r6dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6dVar.c = i - Integer.MIN_VALUE;
            } else {
                r6dVar = new r6d(this, onmVar);
            }
        } else {
            r6dVar = new r6d(this, onmVar);
        }
        Object objL = r6dVar.a;
        int i2 = r6dVar.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableOnErrorReturnItem = this.c.a(true).timeout(1000L, TimeUnit.MILLISECONDS).onErrorReturnItem(yah0.m(false));
            r6dVar.c = 1;
            objL = fc11.l(observableOnErrorReturnItem, 1, (Object) null, r6dVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return objL;
    }
}
