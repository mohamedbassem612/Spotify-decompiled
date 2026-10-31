package p;

import android.graphics.Matrix;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.recaptcha.internal.zzhm;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.personalizedepisodes.contentservice.v1.GetVoicesResponse;
import com.spotify.personalizedepisodes.contentservice.v1.Voice;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class utw0 implements BiFunction, f420, ObservableOnSubscribe, tl00, nkb1, qfz0, bxh1, Init, d5q0, acp1 {
    public Object a;

    public utw0(byte b) {
        switch (b) {
            case 13:
                this.a = new ThreadLocal();
                break;
            case 20:
                this.a = new uml1((byte) 0);
                break;
            case 25:
                this.a = new AtomicReference(null);
                break;
            case 27:
                this.a = new idd1(vrl.d);
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void A(String str, Object... objArr) {
        for (utw0 utw0Var : ike1.b) {
            utw0Var.A(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public void B(Throwable th, String str, Object... objArr) {
        for (utw0 utw0Var : ike1.b) {
            utw0Var.B(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(String str, ann1 ann1Var, onm onmVar) throws zzhm {
        xxo1 xxo1Var;
        if (onmVar instanceof xxo1) {
            xxo1Var = (xxo1) onmVar;
            int i = xxo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xxo1Var.c = i - Integer.MIN_VALUE;
            } else {
                xxo1Var = new xxo1(this, onmVar);
            }
        } else {
            xxo1Var = new xxo1(this, onmVar);
        }
        Object objA = xxo1Var.a;
        int i2 = xxo1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                lyo1 lyo1Var = (lyo1) this.a;
                byte[] bArrD = ann1Var.d();
                xxo1Var.c = 1;
                objA = lyo1Var.a(str, bArrD, xxo1Var);
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
            return ((oyo1) objA).b(cnn1.A());
        } catch (zzhm e) {
            throw e;
        } catch (Exception e2) {
            throw new zzhm(tgo1.d, ij81.N0, e2.getMessage(), (Exception) null);
        }
    }

    public void D(Object[] objArr, Object obj) {
        List listAsList = Arrays.asList(objArr);
        boolean z = true;
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder("[");
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            p2p1 p2p1Var = (p2p1) this.a;
            if (p2p1Var == null) {
                p2p1Var = new p2p1();
                p2p1Var.e = kno1.D(3, 1);
                this.a = p2p1Var;
            }
            g4p1 g4p1Var = (e3p1) p2p1Var.get(obj);
            if (g4p1Var == null) {
                int iMax = listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4;
                eqr0.X(iMax, "expectedSize");
                g4p1Var = new g4p1(iMax);
                p2p1 p2p1Var2 = (p2p1) this.a;
                if (p2p1Var2 == null) {
                    p2p1Var2 = new p2p1();
                    p2p1Var2.e = kno1.D(3, 1);
                    this.a = p2p1Var2;
                }
                p2p1Var2.put(obj, g4p1Var);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                eqr0.W(obj, next);
                g4p1Var.b(next);
            }
        }
    }

    public SecretKey E() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        SecretKey secretKey;
        KeyStore.Entry entry = ((KeyStore) ((idd1) this.a).getValue()).getEntry("recck", null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null && (secretKey = secretKeyEntry.getSecretKey()) != null) {
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder("recck", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        return keyGenerator.generateKey();
    }

    public pfz0 a() {
        return ((qvb1) this.a).d();
    }

    public Object apply(Object obj, Object obj2) {
        return vtw0.a((vtw0) this.a, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }

    public kf01 b() throws Throwable {
        IOException iOException = null;
        while (!((zf01) this.a).l.R0) {
            try {
                es31 es31VarB = ((zf01) this.a).b();
                if (!es31VarB.isReady()) {
                    ds31 ds31VarF = es31VarB.f();
                    if (ds31VarF.b == null && ds31VarF.c == null) {
                        ds31VarF = es31VarB.c();
                    }
                    es31 es31Var = ds31VarF.b;
                    Throwable th = ds31VarF.c;
                    if (th != null) {
                        throw th;
                    }
                    if (es31Var != null) {
                        ((zf01) this.a).q.addFirst(es31Var);
                    }
                }
                return es31VarB.a();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    j2h1.h(iOException, e);
                }
                if (!((zf01) this.a).a((kf01) null)) {
                    throw iOException;
                }
            }
        }
        k220.i("Canceled");
        return null;
    }

    public FileChannel c() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.a;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        hhg1.n("Not a file: ".concat(String.valueOf(parcelFileDescriptor)));
        return null;
    }

    public void e(int i) {
        ((qvb1) this.a).e(i);
    }

    public First e0(Object obj) {
        p2l1 p2l1Var = (p2l1) obj;
        dlb1 dlb1Var = (dlb1) this.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (p2l1Var.b() == 1) {
            linkedHashSet.add(new p0l1(dlb1Var.a()));
        }
        if (p2l1Var.b() == 1) {
            linkedHashSet.add(b1l1.a);
            if (dlb1Var.b().a()) {
                linkedHashSet.add(new s0l1(true));
            }
        }
        return First.c(p2l1Var, linkedHashSet);
    }

    public zf01 f() {
        return (zf01) this.a;
    }

    public void g(pfz0 pfz0Var) {
        ((qvb1) this.a).g(pfz0Var);
    }

    public mkb1 h(uvl1 uvl1Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        Object mkb1Var = linkedHashMap.get(uvl1Var);
        if (mkb1Var == null) {
            mkb1Var = new mkb1(uvl1Var);
            linkedHashMap.put(uvl1Var, mkb1Var);
        }
        return (mkb1) mkb1Var;
    }

    @Override // p.d5q0
    public void i(Exception exc) {
        ((ohd) this.a).resumeWith((Object) null);
    }

    @Override // p.f420
    public m420 j(l420 l420Var) {
        return ((oi) this.a).j(l420Var);
    }

    @Override // p.f420
    public l420 k(String str) {
        return ((oi) this.a).k(str);
    }

    @Override // p.f420
    public r420 l(l420 l420Var) {
        return ((oi) this.a).l(l420Var);
    }

    public void m(SecurityException securityException, Object... objArr) {
        for (utw0 utw0Var : ike1.b) {
            utw0Var.m(securityException, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public mkb1 n(uvl1 uvl1Var) {
        return (mkb1) ((LinkedHashMap) this.a).remove(uvl1Var);
    }

    public void o(String str, Object... objArr) {
        for (utw0 utw0Var : ike1.b) {
            utw0Var.o(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable p(List list, onm onmVar) {
        a1x0 a1x0Var;
        ArrayList<String> arrayList;
        LinkedHashMap linkedHashMap;
        Object next;
        fbh0 fbh0Var;
        if (onmVar instanceof a1x0) {
            a1x0Var = (a1x0) onmVar;
            int i = a1x0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1x0Var.e = i - Integer.MIN_VALUE;
            } else {
                a1x0Var = new a1x0(this, onmVar);
            }
        } else {
            a1x0Var = new a1x0(this, onmVar);
        }
        Object obj = a1x0Var.c;
        int i2 = a1x0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            List<amk> list2 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add("spotify:user:" + ((amk) it.next()).b());
            }
            int iS = zno1.s(q7h.U(list2, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
            for (amk amkVar : list2) {
                mmr0 mmr0VarN = oqn1.n(l1d.m("spotify:user:", amkVar.b()), "spotify:concert:" + amkVar.a().a());
                linkedHashMap2.put(mmr0VarN.a, mmr0VarN.b);
            }
            Flowable flowable = ((zu00) ((uu00) this.a)).b(new oi("concert-friend-matcher", new ib5(arrayList2, (byte) 27))).toFlowable(BackpressureStrategy.d);
            vbm[] vbmVarArr = q601.a;
            dy20 dy20Var = new dy20(new kge(flowable), (byte) 28);
            a1x0Var.a = arrayList2;
            a1x0Var.b = linkedHashMap2;
            a1x0Var.e = 1;
            Object objI = b5p1.i(dy20Var, a1x0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
            arrayList = arrayList2;
            obj = objI;
            linkedHashMap = linkedHashMap2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = a1x0Var.b;
            arrayList = a1x0Var.a;
            hm5.M(obj);
        }
        uv00 uv00Var = (uv00) obj;
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList) {
            zei1 zei1Var = uv00Var.a(zei1.class, str).b;
            if (zei1Var == null) {
                fbh0Var = null;
            } else {
                String str2 = zei1Var.b;
                Iterator it2 = zei1Var.e.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        yp70 yp70Var = (yp70) next;
                        int iB = yp70Var.b() * yp70Var.a();
                        do {
                            Object next2 = it2.next();
                            yp70 yp70Var2 = (yp70) next2;
                            int iB2 = yp70Var2.b() * yp70Var2.a();
                            if (iB < iB2) {
                                next = next2;
                                iB = iB2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                yp70 yp70Var3 = (yp70) next;
                String strC = yp70Var3 != null ? yp70Var3.c() : null;
                if (strC == null) {
                    strC = "";
                }
                String str3 = (String) linkedHashMap.get(str);
                fbh0Var = new fbh0(str, str2, strC, str3 != null ? str3 : "");
            }
            if (fbh0Var != null) {
                arrayList3.add(fbh0Var);
            }
        }
        return arrayList3;
    }

    public void q(String str, Object... objArr) {
        for (utw0 utw0Var : ike1.b) {
            utw0Var.q(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public void r(Throwable th) {
        for (utw0 utw0Var : ike1.b) {
            utw0Var.r(th);
        }
    }

    public void s(Throwable th, String str, Object... objArr) {
        for (utw0 utw0Var : ike1.b) {
            utw0Var.s(th, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        sam0 sam0Var = (xm41) this.a;
        sam0 sam0Var2 = sam0Var;
        observableEmitter.setCancellable(new qlv0(sam0Var2.e(new l5v0(observableEmitter, (byte) 10), new hbz0(observableEmitter, (byte) 15)), (byte) 1));
    }

    public long t() {
        StatFs statFs = (StatFs) this.a;
        if (statFs == null) {
            eg.m("Required value was null.");
            return 0L;
        }
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        StatFs statFs2 = (StatFs) this.a;
        if (statFs2 != null) {
            return statFs2.getBlockSizeLong() * availableBlocksLong;
        }
        eg.m("Required value was null.");
        return 0L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(onm onmVar) throws HttpException {
        zpk1 zpk1Var;
        if (onmVar instanceof zpk1) {
            zpk1Var = (zpk1) onmVar;
            int i = zpk1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zpk1Var.c = i - Integer.MIN_VALUE;
            } else {
                zpk1Var = new zpk1(this, onmVar);
            }
        } else {
            zpk1Var = new zpk1(this, onmVar);
        }
        Object objA = zpk1Var.a;
        int i2 = zpk1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            sqk1 sqk1Var = (sqk1) this.a;
            zpk1Var.c = 1;
            objA = sqk1Var.a(zpk1Var);
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
        sy21 sy21Var = (sy21) objA;
        if (!sy21Var.a.Q0) {
            throw new HttpException(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful get voices response");
            return null;
        }
        h290<Voice> h290VarN = ((GetVoicesResponse) obj).n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (Voice voice : h290VarN) {
            arrayList.add(new zlk1(voice.getId(), voice.getName(), voice.getDescription(), voice.o()));
        }
        return new rqk1(arrayList);
    }

    public void v(String str, Object... objArr) {
        for (utw0 utw0Var : ike1.b) {
            utw0Var.v(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    public void w(zrj1 zrj1Var) {
        kz50 kz50Var = (kz50) this.a;
        kz50Var.a = zrj1Var;
        Iterator it = ((LinkedList) kz50Var.b).iterator();
        while (it.hasNext()) {
            ((o8n1) it.next()).a();
        }
        ((LinkedList) kz50Var.b).clear();
    }

    public List x(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (u890.j(((uvl1) entry.getKey()).a, str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((uvl1) it.next());
        }
        return o7h.l1(linkedHashMap2.values());
    }

    public void y(String str) {
        utw0[] utw0VarArr = ike1.b;
        int length = utw0VarArr.length;
        int i = 0;
        while (i < length) {
            utw0 utw0Var = utw0VarArr[i];
            i++;
            ((ThreadLocal) utw0Var.a).set(str);
        }
    }

    public void z(String str, Object... objArr) {
        for (utw0 utw0Var : ike1.b) {
            utw0Var.z(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // p.acp1
    public Object zza(Object obj) {
        return new szd1((rdp1) obj, (Matrix) this.a);
    }

    public utw0(String str) throws IOException {
        try {
            this.a = new StatFs(str);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    public /* synthetic */ utw0(Object obj) {
        this.a = obj;
    }
}
