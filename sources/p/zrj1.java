package p;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.TextView;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.voiceassistants.playermodels.SourceDevice;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class zrj1 implements Function, ipc1, vy11 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public zrj1(ArrayList arrayList) {
        this.a = (byte) 12;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            ull1 ull1Var = (ull1) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = ull1Var.b;
            jArr[i2 + 1] = ull1Var.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public int a(long j) {
        long[] jArr = (long[]) this.d;
        int iB = zoi1.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public void accept(Object obj, Object obj2) {
        bsd1 bsd1Var = (bsd1) obj2;
        switch (this.a) {
            case 28:
                arn1 arn1Var = (arn1) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                zod.v("Not connected to device", arn1Var.k());
                cgn1 cgn1Var = (cgn1) ((vhp1) obj).n();
                hi5 hi5VarA = oho1.A();
                Parcel parcelA1 = cgn1Var.a1();
                parcelA1.writeString(str);
                parcelA1.writeString(str2);
                int i = osn1.a;
                parcelA1.writeInt(0);
                osn1.b(parcelA1, hi5VarA);
                cgn1Var.d1(14, parcelA1);
                synchronized (arn1Var.s) {
                    try {
                        if (arn1Var.f3p != null) {
                            arn1Var.l(2477);
                        }
                        arn1Var.f3p = bsd1Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                arn1 arn1Var2 = (arn1) this.b;
                String str3 = (String) this.c;
                o2e o2eVar = (o2e) this.d;
                px40 px40Var = (vhp1) obj;
                zod.v("Not active connection", arn1Var2.G != 1);
                Context context = px40Var.c;
                hi5 hi5VarA2 = oho1.A();
                cgn1 cgn1Var2 = (cgn1) px40Var.n();
                Parcel parcelA2 = cgn1Var2.a1();
                parcelA2.writeString(str3);
                osn1.b(parcelA2, hi5VarA2);
                cgn1Var2.d1(12, parcelA2);
                if (o2eVar != null) {
                    cgn1 cgn1Var3 = (cgn1) px40Var.n();
                    Parcel parcelA3 = cgn1Var3.a1();
                    parcelA3.writeString(str3);
                    osn1.b(parcelA3, hi5VarA2);
                    cgn1Var3.d1(11, parcelA3);
                }
                bsd1Var.b((Object) null);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                uv00 uv00Var = (uv00) obj;
                List list = (List) this.b;
                iu30 iu30Var = (iu30) this.d;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : list) {
                    xkk1 xkk1Var = uv00Var.a(xkk1.class, (String) obj2).b;
                    mq70 mq70Var = xkk1Var != null ? (mq70) iu30Var.invoke(xkk1Var) : null;
                    linkedHashMap.put(obj2, (mq70Var == null || mq70Var.a.isEmpty()) ? tu21.a : new vu21(mq70Var));
                }
                return sqg0.O(linkedHashMap, (LinkedHashMap) this.c);
            case 9:
                String str = (String) obj;
                ((t45) this.b).g("switch-to-local");
                m210 m210Var = (m210) this.c;
                return new SourceDevice(m210Var.g, m210Var.h, ((tp7) this.d).a ? "TABLET".toLowerCase(Locale.ROOT) : "SMARTPHONE".toLowerCase(Locale.ROOT), str, true);
            case 10:
                f291 f291Var = (f291) obj;
                vi11 vi11Var = (vi11) this.d;
                String str2 = f291Var.b;
                Uri.Builder builderBuildUpon = Uri.parse(str2).buildUpon();
                String str3 = (String) this.b;
                if (str3 != null) {
                    builderBuildUpon.appendPath(str3);
                }
                String str4 = (String) this.c;
                if (str4 != null) {
                    builderBuildUpon.getClass();
                    String encodedQuery = builderBuildUpon.build().getEncodedQuery();
                    builderBuildUpon.encodedQuery((encodedQuery != null ? encodedQuery.concat("&") : "").concat(str4));
                }
                builderBuildUpon.getClass();
                ajg ajgVar = (ajg) vi11Var.d;
                ilh1 ilh1Var = (ilh1) vi11Var.f;
                builderBuildUpon.appendQueryParameter("utm_app_version", ajgVar.a()).appendQueryParameter("utm_session_id", (String) vi11Var.e);
                int iOrdinal = f291Var.c.ordinal();
                if (iOrdinal == 0) {
                    return Single.just(new dlb1(f291Var, builderBuildUpon.build().toString(), (String) null));
                }
                if (iOrdinal == 1) {
                    return ilh1Var.e(1, f291Var.d, str2).flatMap(new ilh1(f291Var, vi11Var, builderBuildUpon));
                }
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                String string = builderBuildUpon.build().toString();
                String strEncode = Uri.encode(string);
                return ((yze1) ilh1Var.b).b(strEncode).flatMap(bjx0.X0).doOnSubscribe(new e0l1(ilh1Var, strEncode)).doOnSuccess(new e0l1(ilh1Var, (byte) 1)).doOnError(new e0l1(ilh1Var, (byte) 2)).flatMap(new bih1(f291Var, string, (byte) 20));
            case 18:
                if (((Boolean) obj).booleanValue()) {
                    return Single.just(wpm1.a);
                }
                dqm1 dqm1Var = (dqm1) this.b;
                return rqt0.F(dqm1Var.j, new l3g1(dqm1Var, (String) this.c, (String) this.d, false, (lnm) null, (byte) 15)).map(i2x0.W0);
            default:
                Set set = s4b1.f;
                r9c r9cVar = (r9c) this.b;
                return new mmr0((YourLibraryRequest) obj, ((vxm1) this.c).f.j(r9cVar, (String) this.d, uic.x(r9cVar.b)));
        }
    }

    public List b(long j) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                ull1 ull1Var = (ull1) list.get(i);
                feo feoVar = ull1Var.a;
                if (feoVar.e == -3.4028235E38f) {
                    arrayList2.add(ull1Var);
                } else {
                    arrayList.add(feoVar);
                }
            }
        }
        Collections.sort(arrayList2, new ena1((byte) 5));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            eeo eeoVarA = ((ull1) arrayList2.get(i3)).a.a();
            eeoVarA.e = (-1) - i3;
            eeoVarA.f = 1;
            arrayList.add(eeoVarA.a());
        }
        return arrayList;
    }

    public long c(int i) {
        long[] jArr = (long[]) this.d;
        dm5.m(i >= 0);
        dm5.m(i < jArr.length);
        return jArr[i];
    }

    public int d() {
        return ((long[]) this.d).length;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(onm onmVar) {
        opl1 opl1Var;
        if (onmVar instanceof opl1) {
            opl1Var = (opl1) onmVar;
            int i = opl1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                opl1Var.c = i - Integer.MIN_VALUE;
            } else {
                opl1Var = new opl1(this, onmVar);
            }
        } else {
            opl1Var = new opl1(this, onmVar);
        }
        Object objO = opl1Var.a;
        int i2 = opl1Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            if (Build.VERSION.SDK_INT >= 26 && ((e26) this.b).b()) {
                em3 em3Var = (em3) this.d;
                opl1Var.c = 1;
                objO = em3Var.o();
                Object obj = d9n.a;
                if (objO == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objO);
        boolean z = ((Boolean) objO).booleanValue() ? false : true;
        return Boolean.valueOf(z);
    }

    public xt61 f() {
        xtx xtxVar = xtx.c;
        eah1 eah1Var = (eah1) this.d;
        qoj0 qoj0Var = (qoj0) this.c;
        qpj1 qpj1Var = qoj0Var.c;
        nwj1 nwj1Var = qoj0Var.a;
        byte bE = xvj1.e(nwj1Var.b().a);
        zia ziaVar = nwj1Var.d;
        if (!ziaVar.c()) {
            ziaVar.accept(nwj1Var.b());
        }
        sq61 sq61VarL = qpj1Var.l("nonMeteredVideoQuality", 6, 2131961914, 2131961913, bE, yoi1.g(ziaVar), new y3o0(qoj0Var, (byte) 5));
        qoj0 qoj0Var2 = (qoj0) this.b;
        qpj1 qpj1Var2 = qoj0Var2.c;
        nwj1 nwj1Var2 = qoj0Var2.a;
        byte bE2 = xvj1.e(nwj1Var2.c().a);
        zia ziaVar2 = nwj1Var2.c;
        if (!ziaVar2.c()) {
            ziaVar2.accept(nwj1Var2.c());
        }
        return new xt61(xtxVar, 2131962179, 2131962178, eah1Var, mqo1.s(sq61VarL, qpj1Var2.l("meteredVideoQuality", 4, 2131961896, 2131961895, bE2, yoi1.g(ziaVar2), new r7j0(qoj0Var2, (byte) 10))), 105);
    }

    public void g(iyi1 iyi1Var) {
        try {
            qso1 qso1Var = (qso1) this.c;
            mh70 xen1Var = new xen1(iyi1Var);
            Parcel parcelA1 = qso1Var.a1();
            tsn1.b(parcelA1, xen1Var);
            qso1Var.c1(9, parcelA1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException((Throwable) e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum h(onm onmVar) {
        cjm1 cjm1Var;
        if (onmVar instanceof cjm1) {
            cjm1Var = (cjm1) onmVar;
            int i = cjm1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cjm1Var.c = i - Integer.MIN_VALUE;
            } else {
                cjm1Var = new cjm1(this, onmVar);
            }
        } else {
            cjm1Var = new cjm1(this, onmVar);
        }
        Object objI = cjm1Var.a;
        int i2 = cjm1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                cjm1Var.c = 1;
                objI = i(cjm1Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objI);
            }
            return (bjm1) objI;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.l(e2, "Failed to resolve Wrapped widget variant", new Object[0]);
            return bjm1.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[LOOP:1: B:53:0x00cb->B:69:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum i(onm onmVar) {
        djm1 djm1Var;
        List list;
        Object objC;
        List list2;
        w7x w7xVar;
        List<List> list3;
        List list4;
        Iterator it;
        if (onmVar instanceof djm1) {
            djm1Var = (djm1) onmVar;
            int i = djm1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                djm1Var.d = i - Integer.MIN_VALUE;
            } else {
                djm1Var = new djm1(this, onmVar);
            }
        } else {
            djm1Var = new djm1(this, onmVar);
        }
        Object objC2 = djm1Var.b;
        int i2 = djm1Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objC2);
            cv71 cv71Var = (cv71) this.d;
            djm1Var.d = 1;
            objC2 = cv71Var.c(djm1Var);
            if (objC2 != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objC2);
        } else {
            if (i2 == 2) {
                hm5.M(objC2);
                list = (List) objC2;
                if (!list.isEmpty()) {
                    ohm1 ohm1Var = (ohm1) this.c;
                    djm1Var.a = list;
                    djm1Var.d = 3;
                    objC = ohm1Var.c("2026_wrapped_seen_story_cards", djm1Var);
                    if (objC != d9nVar) {
                        objC2 = objC;
                        list2 = list;
                    }
                    return d9nVar;
                }
                return bjm1.a;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = djm1Var.a;
            hm5.M(objC2);
        }
        w7xVar = (Set) objC2;
        if (w7xVar == null) {
            w7xVar = w7x.a;
        }
        list3 = list2;
        if ((list3 instanceof Collection) || !list3.isEmpty()) {
            for (List list5 : list3) {
                if (!list5.isEmpty()) {
                    list4 = list5;
                    if ((list4 instanceof Collection) || !list4.isEmpty()) {
                        it = list4.iterator();
                        while (it.hasNext()) {
                            if (!w7xVar.contains((String) it.next())) {
                            }
                        }
                    }
                }
                return bjm1.a;
            }
        }
        return bjm1.b;
        if (((Number) objC2).intValue() < 3) {
            ezb1 ezb1Var = (ezb1) this.b;
            djm1Var.d = 2;
            objC2 = ezb1Var.f(djm1Var);
            if (objC2 != d9nVar) {
                list = (List) objC2;
                if (!list.isEmpty()) {
                    ohm1 ohm1Var2 = (ohm1) this.c;
                    djm1Var.a = list;
                    djm1Var.d = 3;
                    objC = ohm1Var2.c("2026_wrapped_seen_story_cards", djm1Var);
                    if (objC != d9nVar) {
                        objC2 = objC;
                        list2 = list;
                        w7xVar = (Set) objC2;
                        if (w7xVar == null) {
                            w7xVar = w7x.a;
                        }
                        list3 = list2;
                        if (list3 instanceof Collection) {
                        }
                        while (r7.hasNext()) {
                            if (!list5.isEmpty()) {
                                list4 = list5;
                                if (list4 instanceof Collection) {
                                }
                                it = list4.iterator();
                                while (it.hasNext()) {
                                    if (!w7xVar.contains((String) it.next())) {
                                    }
                                }
                            }
                        }
                    }
                }
                return bjm1.a;
            }
            return d9nVar;
        }
        return bjm1.b;
    }

    public void j(long j, String str, String str2) {
        arn1 arn1Var = (arn1) this.b;
        if (arn1Var != null) {
            arn1Var.p(str, str2).m(new o0g(this, j, (byte) 19));
        } else {
            eg.m("Device is not connected");
        }
    }

    public long k() {
        return ((AtomicLong) this.c).getAndIncrement();
    }

    public sbn1 l() {
        mhn1 mhn1VarA;
        bkp1 bkp1Var = (bkp1) this.b;
        if (bkp1Var == null) {
            k220.r("Cannot build without parameters");
            return null;
        }
        ECPoint eCPoint = (ECPoint) this.c;
        if (eCPoint == null) {
            k220.r("Cannot build without public point");
            return null;
        }
        lcp1.a(eCPoint, bkp1Var.b.b.getCurve());
        akp1 akp1Var = ((bkp1) this.b).d;
        akp1 akp1Var2 = akp1.f;
        if (akp1Var != akp1Var2 && ((Integer) this.d) == null) {
            k220.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (akp1Var == akp1Var2 && ((Integer) this.d) != null) {
            k220.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (akp1Var == akp1Var2) {
            mhn1VarA = sep1.a;
        } else if (akp1Var == akp1.e || akp1Var == akp1.d) {
            mhn1VarA = sep1.a(((Integer) this.d).intValue());
        } else {
            if (akp1Var != akp1.c) {
                eg.m("Unknown EcdsaParameters.Variant: ".concat(akp1Var.b));
                return null;
            }
            mhn1VarA = sep1.b(((Integer) this.d).intValue());
        }
        return new sbn1((bkp1) this.b, (ECPoint) this.c, mhn1VarA, (Integer) this.d);
    }

    public pdn1 m() {
        mhn1 mhn1VarA;
        if (((idn1) this.b) == null) {
            k220.r("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.c;
        if (bigInteger == null) {
            k220.r("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        idn1 idn1Var = (idn1) this.b;
        int i = idn1Var.a;
        if (iBitLength != i) {
            StringBuilder sb = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length());
            sb.append("Got modulus size ");
            sb.append(iBitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(i);
            throw new GeneralSecurityException(sb.toString());
        }
        hdn1 hdn1Var = idn1Var.c;
        hdn1 hdn1Var2 = hdn1.f;
        if (hdn1Var != hdn1Var2 && ((Integer) this.d) == null) {
            k220.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (hdn1Var == hdn1Var2 && ((Integer) this.d) != null) {
            k220.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (hdn1Var == hdn1Var2) {
            mhn1VarA = sep1.a;
        } else if (hdn1Var == hdn1.e || hdn1Var == hdn1.d) {
            mhn1VarA = sep1.a(((Integer) this.d).intValue());
        } else {
            if (hdn1Var != hdn1.c) {
                eg.m("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(hdn1Var)));
                return null;
            }
            mhn1VarA = sep1.b(((Integer) this.d).intValue());
        }
        return new pdn1((idn1) this.b, (BigInteger) this.c, mhn1VarA, (Integer) this.d);
    }

    public ydn1 n() {
        mhn1 mhn1VarA;
        if (((wdn1) this.b) == null) {
            k220.r("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.c;
        if (bigInteger == null) {
            k220.r("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        wdn1 wdn1Var = (wdn1) this.b;
        int i = wdn1Var.a;
        if (iBitLength != i) {
            StringBuilder sb = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length());
            sb.append("Got modulus size ");
            sb.append(iBitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(i);
            throw new GeneralSecurityException(sb.toString());
        }
        vdn1 vdn1Var = wdn1Var.c;
        vdn1 vdn1Var2 = vdn1.f;
        if (vdn1Var != vdn1Var2 && ((Integer) this.d) == null) {
            k220.r("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (vdn1Var == vdn1Var2 && ((Integer) this.d) != null) {
            k220.r("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (vdn1Var == vdn1Var2) {
            mhn1VarA = sep1.a;
        } else if (vdn1Var == vdn1.e || vdn1Var == vdn1.d) {
            mhn1VarA = sep1.a(((Integer) this.d).intValue());
        } else {
            if (vdn1Var != vdn1.c) {
                eg.m("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(vdn1Var)));
                return null;
            }
            mhn1VarA = sep1.b(((Integer) this.d).intValue());
        }
        return new ydn1((wdn1) this.b, (BigInteger) this.c, mhn1VarA, (Integer) this.d);
    }

    public /* synthetic */ zrj1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ zrj1(boolean z) {
        this.a = (byte) 25;
    }

    public zrj1(y1g0 y1g0Var, qso1 qso1Var) {
        this.a = (byte) 26;
        this.c = qso1Var;
        zod.s(y1g0Var);
        this.b = y1g0Var;
    }

    public zrj1(e321 e321Var) {
        this.a = (byte) 27;
        this.d = e321Var;
        this.c = new AtomicLong((o4e.b.nextLong() & 65535) * 10000);
    }

    public zrj1(yqg yqgVar, dma1 dma1Var) {
        this.a = (byte) 11;
        this.b = dma1Var;
        this.c = yqgVar;
        this.d = bma1.b.n("watch_feed_app_in_background_timestamp");
    }

    public zrj1(f8e1 f8e1Var, TextInputEditText textInputEditText, TextView textView, TextInputLayout textInputLayout) {
        this.a = (byte) 7;
        this.b = textInputEditText;
        this.c = textView;
        this.d = textInputLayout;
    }

    public /* synthetic */ zrj1(byte b) {
        this.a = b;
    }

    public zrj1(zrj1 zrj1Var, cik1 cik1Var, erm1 erm1Var, gqm1 gqm1Var) {
        this.a = (byte) 19;
        this.b = zrj1Var;
        this.c = cik1Var;
        this.d = erm1Var;
    }

    public zrj1(e781 e781Var, asi0 asi0Var) {
        this.a = (byte) 13;
        Scheduler scheduler = Schedulers.b;
        this.b = e781Var;
        this.c = asi0Var;
        this.d = scheduler;
    }
}
