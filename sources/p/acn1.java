package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.searchview.proto.NativeViewResponse;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class acn1 implements Function, Predicate {
    public static final acn1 c;
    public static final acn1 d;
    public static final acn1 e;
    public static final acn1 f;
    public final /* synthetic */ byte a;
    public final String b;

    static {
        byte b = 0;
        c = new acn1("TINK", b);
        d = new acn1("CRUNCHY", b);
        e = new acn1("LEGACY", b);
        f = new acn1("NO_PREFIX", b);
    }

    public acn1() {
        this.a = (byte) 2;
        this.b = UUID.randomUUID().toString();
    }

    public String a() {
        return this.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public Object apply(Object obj) throws HttpException {
        List list;
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 1:
                return ((uv00) obj).a(iam.class, str);
            case 2:
            case 6:
            case 7:
            case 8:
            default:
                Logger.e((Throwable) obj, "Error loading stories for feature ".concat(str), new Object[0]);
                return q4c1.a;
            case 3:
                dma1 dma1Var = (dma1) obj;
                bma1 bma1Var = qhr.b;
                w7x w7xVar = w7x.a;
                w7x w7xVarB = dma1Var.b(bma1Var, w7xVar);
                if (w7xVarB != null) {
                    w7xVar = w7xVarB;
                }
                Set setO1 = o7h.o1((Iterable) w7xVar);
                setO1.add(str);
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.e(bma1Var, setO1);
                hma1VarEdit.h();
                return rih1.a;
            case 4:
                spq0 spq0Var = (spq0) obj;
                return spq0Var.c() ? Single.just(spq0Var.b()) : Single.error(new m9(f4i1.f("The filter with id ", str, " could not be found locally"), (byte) 5));
            case 5:
                l1z l1zVar = ((uv00) obj).a(l1z.class, str).b;
                return Boolean.valueOf(l1zVar != null && l1zVar.e);
            case 9:
                return new k851(str, (z2g0) obj);
            case 10:
                zd3 zd3Var = ((uv00) obj).a(zd3.class, str).b;
                return Boolean.valueOf(zd3Var != null ? zd3Var.e : false);
            case 11:
                hll hllVar = ((uv00) obj).a(hll.class, str).b;
                if (hllVar == null || (list = hllVar.d) == null) {
                    list = z6x.a;
                }
                return Boolean.valueOf(list.contains(fll.c) && !list.contains(fll.b));
            case 12:
                sy21 sy21Var = (sy21) obj;
                NativeViewResponse nativeViewResponse = (NativeViewResponse) sy21Var.b;
                if (nativeViewResponse == null) {
                    throw new HttpException(sy21Var);
                }
                String strC = sy21Var.a.f.c("x-search-request-id");
                if (strC != null) {
                    str = strC;
                }
                h290 h290VarO = nativeViewResponse.o();
                ArrayList arrayList = new ArrayList();
                Iterator it = h290VarO.iterator();
                while (true) {
                    epyVar = null;
                    epy epyVar = null;
                    if (!it.hasNext()) {
                        return new l851(str, new j39(arrayList, nativeViewResponse.p() ? n851.a(nativeViewResponse.n()) : null));
                    }
                    NativeViewResponse.SearchRow searchRow = (NativeViewResponse.SearchRow) it.next();
                    String uri = searchRow.n().getUri();
                    kw91 kw91VarC = uy41.c(searchRow.n().p());
                    int iO = searchRow.n().o();
                    int i = iO == 0 ? -1 : ty41.b[l1d.C(iO)];
                    if (i != -1) {
                        if (i == 1) {
                            epyVar = epy.a;
                        } else if (i != 2) {
                            eg.o();
                            return null;
                        }
                    }
                    arrayList.add(new ma51(new fpy(uri, kw91VarC, epyVar)));
                }
                break;
            case 13:
                return ((uv00) obj).a(jo70.class, str);
        }
    }

    public boolean test(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 6:
                return !((String) obj).equals(str);
            case 7:
            default:
                wv00 wv00Var = (uv00) obj;
                return (wv00Var.f || wv00Var.a(mdz.class, str).b == null) ? false : true;
            case 8:
                return u890.j(((mmr0) obj).a, str);
        }
    }

    public String toString() {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
            case 7:
                return str;
            default:
                return super.toString();
        }
    }

    public acn1(String str, vi11 vi11Var) {
        this.a = (byte) 12;
        this.b = str;
    }

    public acn1(qhr qhrVar, String str) {
        this.a = (byte) 3;
        this.b = str;
    }

    public /* synthetic */ acn1(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
