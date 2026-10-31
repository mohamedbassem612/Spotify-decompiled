package p;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.media3.datasource.HttpDataSource;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.p4p.ucp.seedsearch.v1.GetSeedSearchResultsRequest;
import com.spotify.p4p.ucp.seedsearch.v1.GetSeedSearchResultsResponse;
import com.spotify.p4p.ucp.seedsearch.v1.SeedSearchResult;
import com.spotify.signup.signup.v2.proto.CompleteAccountCreationRequest;
import com.spotify.signup.signup.v2.proto.CompleteAccountCreationResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class up41 implements Function, qiw, Predicate, SingleOnSubscribe, fyf, Init, d9e0, akh0, BiFunction, nu11 {
    public final /* synthetic */ byte a;
    public final Object b;

    public up41(View view) {
        this.a = (byte) 17;
        if (Build.VERSION.SDK_INT < 30) {
            this.b = new c681(view, (byte) 9);
            return;
        }
        m6a1 m6a1Var = new m6a1(view, (byte) 9);
        m6a1Var.c = view;
        this.b = m6a1Var;
    }

    public void a(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vp41 vp41Var = (vp41) obj2;
                Observable observable = vp41Var.a;
                Flowable flowable = vp41Var.c;
                return Observable.zip(observable, x0d.j(flowable, flowable), njx0.i).take(1L);
            case 11:
                ywv0 ywv0Var = (ywv0) obj2;
                return (ywv0Var != null ? ywv0Var.l(((oi91) obj).e) : CompletableEmpty.a).w();
            case 13:
                br81 br81Var = ((ar81) obj2).a;
                dyh dyhVarO = CompleteAccountCreationRequest.o();
                dyhVarO.n(((eyh) obj).a);
                return br81Var.b(dyhVarO.build()).onErrorResumeNext(new xq81(CompleteAccountCreationResponse.parser(), (byte) 0)).map(w1x0.R0).onErrorReturn(y1x0.Z);
            case 14:
                bkf1 bkf1Var = (bkf1) obj2;
                return bkf1.h(bkf1Var, bkf1Var.d.j((List) obj), (LinkedHashSet) null, 23);
            case 15:
                hxe0 hxe0Var = (hxe0) obj2;
                uf8 uf8Var = hxe0Var.b;
                return new sxe0((r341) obj, uf8Var.c, hxe0Var.a, uf8Var.d);
            case 16:
                return new w3a1(((x1a1) obj2).a, (sy21) obj);
            case 22:
                return ((sjb1) obj2).a(((hon) obj).a);
            default:
                return rmy.a((rmy) obj, (kk3) obj2);
        }
    }

    public void b(long j, int i, int i2, int i3) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void c(int i, oco ocoVar, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, ocoVar.i, j, i2);
    }

    public void d(long j, String str) {
        ((xev0) ((iz6) this.b).d).e();
    }

    public void e(long j, String str) {
        ((xev0) ((iz6) this.b).d).f();
    }

    public First e0(Object obj) {
        nhm0 nhm0Var = (nhm0) obj;
        nhm0Var.getClass();
        d3b1 d3b1Var = ((m3b1) this.b).a;
        if (nhm0Var instanceof tgm0) {
            if (d3b1Var instanceof c3b1) {
                return First.c(nhm0Var, Collections.singleton(kbw.a));
            }
            if (d3b1Var instanceof e3b1) {
                return First.c(new rgm0(((e3b1) d3b1Var).c, (qgm0) null, 6), Collections.singleton(dcw.a));
            }
            if (d3b1Var instanceof d3b1) {
                return First.c(nhm0Var, f46.S0(new diw[]{new hhw(d3b1Var.c), new chw(h3b1.a)}));
            }
            eg.o();
            return null;
        }
        if ((nhm0Var instanceof ggm0) || (nhm0Var instanceof xfm0) || (nhm0Var instanceof zfm0) || (nhm0Var instanceof rgm0) || (nhm0Var instanceof egm0)) {
            return First.b(nhm0Var);
        }
        eg.o();
        return null;
    }

    public void g() {
        ((a1r0) this.b).g();
    }

    public void h(f9e0 f9e0Var, long j, long j2, int i) {
        vzr0 vzr0Var = (vzr0) f9e0Var;
        w62 w62Var = (w62) this.b;
        if (w62Var.b) {
            d2e0 d2e0VarD = w62.d(vzr0Var, j, j2);
            mgc mgcVar = (mgc) w62Var.h;
            mgcVar.getClass();
            mgcVar.L(d2e0VarD, 8, -1, (ie30) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, i);
        }
    }

    public void j(f9e0 f9e0Var, long j, long j2) {
        vzr0 vzr0Var = (vzr0) f9e0Var;
        if (((w62) this.b).b) {
            pub1 pub1Var = (pub1) vzr0Var.f;
            pub1Var.getClass();
            w62 w62Var = (w62) this.b;
            w62Var.i = pub1Var;
            ((wdd1) w62Var.e).f(new qub1(this, pub1Var, (byte) 0));
            w62 w62Var2 = (w62) this.b;
            Uri uriQ = (Uri) w62Var2.f;
            uriQ.getClass();
            Uri uri = pub1Var.c;
            if (uri != null) {
                String string = uri.toString();
                uriQ = (string == null || pno1.e(string)[0] == -1) ? pno1.q(uriQ.toString(), uri.toString()) : uri;
            }
            w62Var2.f = uriQ;
            long j3 = pub1Var.b;
            if (j3 == -9223372036854775807L) {
                j3 = 300000;
            }
            wdd1 wdd1Var = (wdd1) ((w62) this.b).j;
            wdd1Var.getClass();
            wdd1Var.g(new rub1((w62) this.b, (byte) 0), j3);
            d2e0 d2e0VarD = w62.d(vzr0Var, j, j2);
            mgc mgcVar = (mgc) ((w62) this.b).h;
            mgcVar.getClass();
            mgcVar.I(d2e0VarD, 8, -1, (ie30) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    public String k(String str) {
        Set set = (Set) ((HashMap) this.b).get(str);
        if (set == null) {
            return "";
        }
        if (set.size() <= 1) {
            return (String) set.iterator().next();
        }
        hhg1.n(f4i1.f("The key '", str, "' has more than one value"));
        return null;
    }

    public void l() {
        ((c681) this.b).u();
    }

    public iw41 m(s851 s851Var, d8r0 d8r0Var) {
        yfz yfzVar;
        yfz agzVar;
        xo20 xo20Var;
        Resources resources = ((l1e) this.b).a;
        if (!(s851Var instanceof p851)) {
            boolean z = s851Var instanceof r851;
            if (z) {
                boolean z2 = false;
                if (z && (xo20Var = ((r851) s851Var).a) != null) {
                    wo20 wo20Var = xo20Var.b;
                    to20 to20Var = wo20Var instanceof to20 ? (to20) wo20Var : null;
                    if (to20Var != null && to20Var.a == 2) {
                        z2 = true;
                    }
                }
                agzVar = new agz(z2, ((r851) s851Var).b);
            } else {
                if (!s851Var.equals(q851.a)) {
                    eg.o();
                    return null;
                }
                yfzVar = zfz.e;
            }
            return new iw41(new xfz(resources.getString(2131954603), resources.getString(2131954604), resources.getString(2131954605), d8r0Var, agzVar));
        }
        yfzVar = new yfz(((p851) s851Var).a);
        agzVar = yfzVar;
        return new iw41(new xfz(resources.getString(2131954603), resources.getString(2131954604), resources.getString(2131954605), d8r0Var, agzVar));
    }

    public void n(f9e0 f9e0Var, long j, long j2, boolean z) {
        vzr0 vzr0Var = (vzr0) f9e0Var;
        w62 w62Var = (w62) this.b;
        if (w62Var.b) {
            d2e0 d2e0VarD = w62.d(vzr0Var, j, j2);
            mgc mgcVar = (mgc) w62Var.h;
            mgcVar.getClass();
            mgcVar.H(d2e0VarD, 8, -1, (ie30) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    public o4t o(f9e0 f9e0Var, long j, long j2, IOException iOException, int i) {
        long j3;
        vzr0 vzr0Var = (vzr0) f9e0Var;
        o4t o4tVar = eyh0.Y;
        w62 w62Var = (w62) this.b;
        if (!w62Var.b) {
            return o4tVar;
        }
        int i2 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).d : Integer.MAX_VALUE;
        if (i2 == 410) {
            eyh0 eyh0Var = (eyh0) w62Var.k;
            eyh0Var.getClass();
            eyh0Var.x((g9e0) null);
            wdd1 wdd1Var = (wdd1) w62Var.j;
            wdd1Var.getClass();
            wdd1Var.h();
            j3 = -9223372036854775807L;
        } else {
            j3 = 300000;
            if (i2 == 429) {
                List list = (List) vzr0Var.d.d.get("Retry-After");
                if (list != null) {
                    try {
                        j3 = 1000 * Long.parseLong((String) list.get(0));
                    } catch (NumberFormatException unused) {
                        oon1.H("Retry-After header string doesn't contain a parsable long");
                    }
                }
            } else {
                pub1 pub1Var = (pub1) w62Var.i;
                if (pub1Var != null) {
                    long j4 = pub1Var.b;
                    if (j4 != -9223372036854775807L) {
                        j3 = j4;
                    }
                }
            }
        }
        if (j3 != -9223372036854775807L) {
            wdd1 wdd1Var2 = (wdd1) w62Var.j;
            wdd1Var2.getClass();
            wdd1Var2.g(new rub1(w62Var, (byte) 1), j3);
        }
        boolean z = j3 == -9223372036854775807L;
        ((wdd1) w62Var.e).f(new s38(this, iOException, z));
        d2e0 d2e0VarD = w62.d(vzr0Var, j, j2);
        mgc mgcVar = (mgc) w62Var.h;
        mgcVar.getClass();
        mgcVar.K(d2e0VarD, 8, iOException, z);
        return o4tVar;
    }

    public void p(String str, String str2) {
        HashMap map = (HashMap) this.b;
        Set set = (Set) map.get(str);
        if (set == null) {
            int i = t380.c;
            map.put(str, new b291(str2));
        } else {
            HashSet hashSet = new HashSet(set);
            hashSet.add(str2);
            map.put(str, t380.p(hashSet));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, onm onmVar) throws Throwable {
        gl51 gl51Var;
        m231 m231Var;
        if (onmVar instanceof gl51) {
            gl51Var = (gl51) onmVar;
            int i = gl51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gl51Var.c = i - Integer.MIN_VALUE;
            } else {
                gl51Var = new gl51(this, onmVar);
            }
        } else {
            gl51Var = new gl51(this, onmVar);
        }
        Object objA = gl51Var.a;
        int i2 = gl51Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                up40 up40VarO = GetSeedSearchResultsRequest.o();
                up40VarO.r(str);
                up40VarO.n();
                up40VarO.q();
                GetSeedSearchResultsRequest getSeedSearchResultsRequestBuild = up40VarO.build();
                vl51 vl51Var = (vl51) this.b;
                getSeedSearchResultsRequestBuild.getClass();
                gl51Var.c = 1;
                objA = vl51Var.a(getSeedSearchResultsRequestBuild, gl51Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            m231Var = (GetSeedSearchResultsResponse) objA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (!(m231Var instanceof m231)) {
            h290 h290VarN = ((GetSeedSearchResultsResponse) m231Var).n();
            ArrayList arrayList = new ArrayList();
            for (Object obj : h290VarN) {
                if (((SeedSearchResult) obj).n() == ul51.c) {
                    arrayList.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList<SeedSearchResult> arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (hashSet.add(((SeedSearchResult) obj2).getUri())) {
                    arrayList2.add(obj2);
                }
            }
            m231 arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            for (SeedSearchResult seedSearchResult : arrayList2) {
                arrayList3.add(new fl51(seedSearchResult.getUri(), seedSearchResult.getName()));
            }
            m231Var = arrayList3;
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(String str, String str2, tom tomVar, boolean z, boolean z2, onm onmVar) {
        g461 g461Var;
        if (onmVar instanceof g461) {
            g461Var = (g461) onmVar;
            int i = g461Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g461Var.c = i - Integer.MIN_VALUE;
            } else {
                g461Var = new g461(this, onmVar);
            }
        } else {
            g461Var = new g461(this, onmVar);
        }
        Object objG = g461Var.a;
        int i2 = g461Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                bfd bfdVar = (bfd) this.b;
                g8d g8dVar = new g8d(str, str2, new a8d(tomVar, z), z2);
                g461Var.c = 1;
                objG = bfdVar.G(g8dVar, g461Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objG);
            }
            return (goe) objG;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public void s() {
        ((c681) this.b).y();
    }

    public void subscribe(SingleEmitter singleEmitter) {
        xh61 xh61Var = (xh61) this.b;
        singleEmitter.setCancellable(new ci0(xh61Var, (byte) 7));
        xh61Var.a = singleEmitter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    public boolean test(Object obj) {
        m980 m980Var;
        hkt0 hkt0Var = (hkt0) obj;
        zsc zscVar = ((ha61) this.b).e;
        hkt0Var.getClass();
        yfu yfuVar = (yfu) zscVar.e;
        String str = hkt0Var.a;
        if (((ki4) zscVar.b).b()) {
            if (!((t380) zscVar.d).contains(str)) {
                yfuVar.m(hkt0Var.f(), 4);
                yfu.p(yfuVar, hkt0Var.e, hkt0Var.a, hkt0Var.c, hkt0Var.b, hkt0Var.d, "ERROR", "UNAUTHORIZED_CLIENT_ID", (String) null, 128);
                return false;
            }
            ki4 ki4Var = ((ey40) zscVar.c).a;
            switch (str) {
                case "76642c7bcc9c466bb99a44ce206edbbe":
                    m980Var = new m980((byte) 10, ki4Var.m());
                    break;
                case "c2d7f5fe99d84e04b64cbc1d012d457a":
                    m980Var = new m980((byte) 10, ki4Var.e());
                    break;
                case "ce581542d24c47ff957d86f7e1b286ce":
                    m980Var = new m980((byte) 10, ki4Var.h());
                    break;
                case "3e3c91ea35fd41f8925d7bb68f07d3da":
                    m980Var = new m980((byte) 10, ki4Var.u());
                    break;
                case "a56a9ca4c3224149844c062bbebf64a4":
                    m980Var = new m980((byte) 10, ki4Var.o());
                    break;
                case "212b005bde914f2c97ab6f310c28ad98":
                    m980Var = new m980((byte) 10, ki4Var.t());
                    break;
                case "microsoft-surface-buds-legacy-client-id":
                    m980Var = new m980((byte) 10, ki4Var.q());
                    break;
                case "ddc0016fed8048ad8c61d32f69afb6f1":
                    m980Var = new m980((byte) 10, ki4Var.x());
                    break;
                case "c7204c31f95344a6872edd10937c12b3":
                    m980Var = new m980((byte) 10, ki4Var.n());
                    break;
                case "434d885d509143d9b772a0d46a9e5804":
                    m980Var = new m980((byte) 10, ki4Var.p());
                    break;
                case "82c4b4cd1a034256bd2a190cdcafdd0a":
                    m980Var = new m980((byte) 10, ki4Var.s());
                    break;
                case "3e46a9fbac3c4e14b342390f6dcbc9c1":
                    m980Var = new m980((byte) 10, ki4Var.r());
                    break;
                case "0f6ab2c3f985452a83b1609ce37afc65":
                    m980Var = new m980((byte) 10, ki4Var.k());
                    break;
                case "e11b1a8713164f739d2a9d9fed5a4c01":
                    m980Var = new m980((byte) 10, ki4Var.j());
                    break;
                case "bdbbbe571cef4b148a51a0defb957475":
                    m980Var = new m980((byte) 10, ki4Var.l());
                    break;
                case "2a1cd724fd0446d389b39036a6323547":
                    m980Var = new m980((byte) 10, ki4Var.c());
                    break;
                case "1d2cf25b1643474983fae381b00cea3c":
                    m980Var = new m980((byte) 10, ki4Var.d());
                    break;
                default:
                    m980Var = new m980((byte) 10, true);
                    break;
            }
            if (!m980Var.b) {
                yfuVar.m(hkt0Var.f(), 3);
                yfu.p(yfuVar, hkt0Var.e, hkt0Var.a, hkt0Var.c, hkt0Var.b, hkt0Var.d, "ERROR", "DISABLED_CLIENT_ID", (String) null, 128);
                return false;
            }
        }
        return true;
    }

    public void v(Object obj) {
        ((e061) this.b).t.setEnabled(!((ly31) obj).equals(jy31.a));
    }

    public void f() {
    }

    public void flush() {
    }

    public void shutdown() {
    }

    public void start() {
    }

    public up41(Context context) {
        this.a = (byte) 24;
        this.b = new iqc1(context);
    }

    public up41() {
        this.a = (byte) 18;
        this.b = new HashMap(10);
    }

    public /* synthetic */ up41(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void i(long j, String str) {
    }

    public Object apply(Object obj, Object obj2) {
        return Single.fromCallable(new wra((im0) this.b, (String) obj, (fvf1) obj2, (byte) 8));
    }
}
