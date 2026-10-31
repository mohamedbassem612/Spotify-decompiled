package p;

import android.content.Intent;
import android.media.MediaDrmException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hwb implements ya, ao00, Function, kvn0, hj71, jrn0 {
    public final /* synthetic */ byte a;

    public static WindowInsets A(WindowInsets windowInsets, nk80 nk80Var) {
        url1 prl1Var;
        hsl1 hsl1VarG = hsl1.g((View) null, windowInsets);
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            prl1Var = new url1(hsl1VarG);
        } else if (i >= 35) {
            prl1Var = new trl1(hsl1VarG);
        } else if (i >= 34) {
            prl1Var = new srl1(hsl1VarG);
        } else if (i >= 31) {
            prl1Var = new rrl1(hsl1VarG);
        } else if (i >= 30) {
            prl1Var = new qrl1(hsl1VarG);
        } else {
            prl1Var = i >= 29 ? new prl1(hsl1VarG) : new nrl1(hsl1VarG);
        }
        prl1Var.d(519, nk80Var);
        return prl1Var.b().f();
    }

    public static tto B(mtl mtlVar, jo70 jo70Var, boolean z) {
        if (z) {
            uto utoVar = null;
            if ((mtlVar != null ? mtlVar.a : null) == ktl.b && jo70Var != null) {
                List<ho70> list = jo70Var.d;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (ho70 ho70Var : list) {
                    arrayList.add(new uto(ho70Var.b, ho70Var.a));
                }
                if (arrayList.isEmpty()) {
                    return sto.a;
                }
                io70 io70Var = jo70Var.e;
                if (io70Var != null) {
                    Set set = s4b1.f;
                    if (!uic.g(io70Var.b, blc0.fh)) {
                        io70Var = null;
                    }
                    if (io70Var != null) {
                        utoVar = new uto(io70Var.b, io70Var.a);
                    }
                }
                return new qto(o7h.N0(p7h.N(utoVar), arrayList));
            }
        }
        return rto.a;
    }

    public static void C() {
        File[] fileArrListFiles;
        if (fpi1.v()) {
            return;
        }
        File fileI = fap1.i();
        if (fileI == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileI.listFiles((FilenameFilter) new yin((byte) 2));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(v9p1.K(file));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ep80) obj).a()) {
                arrayList2.add(obj);
            }
        }
        List listA1 = o7h.a1(arrayList2, new m((byte) 5));
        JSONArray jSONArray = new JSONArray();
        lr80 it = yoi1.Q(0, Math.min(listA1.size(), 5)).iterator();
        while (((sr80) it).c) {
            jSONArray.put(listA1.get(it.nextInt()));
        }
        fap1.o("crash_reports", jSONArray, new n(listA1, (byte) 1));
    }

    public static dn90 D(sri1 sri1Var) {
        Iterator it = p7h.M(new p[]{r.b, s.a, r.e, r.d, r.c}).iterator();
        while (it.hasNext()) {
            dn90 dn90VarA = ((p) it.next()).a(sri1Var);
            if (dn90VarA != null) {
                return dn90VarA;
            }
        }
        return null;
    }

    public static final Scheduler s() {
        AtomicInteger atomicInteger = ym41.c;
        Scheduler scheduler = ym41.e;
        return scheduler == null ? (Scheduler) ym41.d.getValue() : scheduler;
    }

    public static final float t(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static sam0 u(String str, mr20 mr20Var, Set set, dc31 dc31Var, dn41 dn41Var) {
        boolean z = dn41Var.c;
        e95 e95Var = xco0.a;
        if (z && ihc1.h0("profile", "release", false)) {
            e95Var = e95.a;
        }
        return new sam0(str, mr20Var, dc31Var, set, dn41Var, e95Var);
    }

    public static String w() {
        return nhc1.W(UUID.randomUUID().toString(), "-", "");
    }

    public static String x() {
        return UUID.randomUUID().toString();
    }

    public static List y(ArrayList arrayList, boolean z) {
        mls mlsVar = mls.a1;
        String strY0 = o7h.y0(arrayList, " ", (String) null, (String) null, mlsVar, 30);
        int i = 1;
        int i2 = 0;
        if (!z) {
            return Collections.singletonList(new jcg1(strY0, new tr80(0, strY0.length(), 1), new n5f0(Long.valueOf(((jwz0) o7h.q0(arrayList)).b.a).longValue(), Long.valueOf(((jwz0) o7h.A0(arrayList)).b.b).longValue()), -1));
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            jwz0 jwz0Var = (jwz0) obj;
            jwz0 jwz0Var2 = (jwz0) o7h.t0(i4, arrayList);
            List listSubList = arrayList.subList(i2, i4);
            int length = (listSubList != null ? o7h.y0(listSubList, " ", (String) null, (String) null, mlsVar, 30) : "").length();
            arrayList2.add(new jcg1(strY0, new tr80(i2, length, i), new n5f0(Long.valueOf(jwz0Var.b.a).longValue(), (jwz0Var2 != null ? Long.valueOf(jwz0Var2.b.a) : Long.valueOf(jwz0Var.b.b)).longValue()), length - jwz0Var.a.length()));
            i3 = i4;
            strY0 = strY0;
            i = 1;
            i2 = 0;
        }
        return arrayList2;
    }

    public static void z(Scheduler scheduler) {
        ym41.e = scheduler;
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.h;
    }

    public Object apply(Object obj) {
        int i;
        switch (this.a) {
            case 12:
                r0e0 r0e0Var = (r0e0) obj;
                return new ef50(r0e0Var.d, r0e0Var.c);
            case 20:
                return huv0.a((Throwable) obj);
            case 25:
                sy21 sy21Var = (sy21) obj;
                if (!sy21Var.a.Q0) {
                    Single singleError = Single.error(new HttpException(sy21Var));
                    singleError.getClass();
                    return singleError;
                }
                ga61 ga61Var = (ga61) sy21Var.b;
                if (ga61Var == null) {
                    ga61Var = ga61.C;
                }
                Single singleJust = Single.just(ga61Var);
                singleJust.getClass();
                return singleJust;
            default:
                wtw0 wtw0Var = (wtw0) obj;
                boolean z = wtw0Var.a;
                if (z) {
                    i = 1;
                } else if (wtw0Var.b) {
                    i = 2;
                } else {
                    i = !z ? 3 : 4;
                }
                return new hgc1(i);
        }
    }

    public Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    public zn00 c() {
        throw new IllegalStateException();
    }

    public byte[] d() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public void e(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void f(byte[] bArr) {
        throw new IllegalStateException();
    }

    public int g() {
        return 1;
    }

    public nco j(byte[] bArr) {
        throw new IllegalStateException();
    }

    public irn0 l(Intent intent, th61 th61Var) {
        b7x b7xVarT;
        String dataString = intent.getDataString();
        if (dataString != null) {
            Uri uri = Uri.parse(dataString);
            if (uri.isHierarchical()) {
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                int iS = zno1.s(q7h.U(queryParameterNames, 10));
                if (iS < 16) {
                    iS = 16;
                }
                b7xVarT = new LinkedHashMap(iS);
                for (Object obj : queryParameterNames) {
                    String queryParameter = uri.getQueryParameter((String) obj);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    b7xVarT.put(obj, queryParameter);
                }
            } else {
                int iV0 = ihc1.v0(dataString, '?', 0, 6);
                if (iV0 == -1) {
                    b7xVarT = b7x.a;
                } else {
                    List listP0 = ihc1.P0(dataString.substring(iV0 + 1), new char[]{'&'}, 6);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listP0.iterator();
                    while (it.hasNext()) {
                        List listP1 = ihc1.P0((String) it.next(), new char[]{'='}, 2);
                        mmr0 mmr0Var = listP1.size() == 2 ? new mmr0(listP1.get(0), listP1.get(1)) : null;
                        if (mmr0Var != null) {
                            arrayList.add(mmr0Var);
                        }
                    }
                    b7xVarT = sqg0.T(arrayList);
                }
            }
        } else {
            b7xVarT = null;
        }
        String str = b7xVarT != null ? (String) b7xVarT.get("redirectUri") : null;
        if (str == null) {
            return crn0.a;
        }
        intent.setData(Uri.parse(str));
        return new drn0(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object n(k371 k371Var, lnm lnmVar) {
        b471 b471Var;
        if (lnmVar instanceof b471) {
            b471Var = (b471) lnmVar;
            int i = b471Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b471Var.c = i - Integer.MIN_VALUE;
            } else {
                b471Var = new b471(this, (onm) lnmVar);
            }
        } else {
            b471Var = new b471(this, (onm) lnmVar);
        }
        Object obj = b471Var.a;
        int i2 = b471Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            wa71 wa71Var = k371Var.a;
            if (wa71Var == null) {
                return null;
            }
            b471Var.c = 1;
            n1f1 n1f1Var = new n1f1(true);
            d9n b871Var = new b871(syo1.D(wa71Var.a, Collections.singletonList(new u771(new t771(wa71Var, tyo1.p(blc0.mg, new String[0])), new pz61(new y171(rc11.a.b(zwy.class)), new exy((String) null, n1f1Var, 0, false, new rhy(xny.a, 62), (bwe1) null, (cuu0) null), dz61.d, true), new bj71(w7x.a, true, (String) null)))), 0);
            d9n d9nVar = d9n.a;
            if (b871Var == d9nVar) {
                return d9nVar;
            }
            obj = b871Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        b871 b871Var2 = (b871) obj;
        return new qj71(b871Var2.a, b871Var2.b, puk.d);
    }

    public byte[] o(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public xn00 p(byte[] bArr, List list, int i, HashMap map) {
        throw new IllegalStateException();
    }

    public boolean q(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    public void v() {
    }

    public void release() {
    }

    public void h(String str) {
    }

    public void i(sun sunVar) {
    }

    public void k(byte[] bArr) {
    }

    public void a(String str, tv80 tv80Var, Bundle bundle) {
    }
}
