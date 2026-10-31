package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import j$.time.temporal.ChronoUnit;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import spotify.your_library.esperanto.proto.PinRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zxl1 implements l381, jec, Function, i2q0, wax, vy11, tcn1, mnm {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public zxl1(Context context) {
        this.a = (byte) 28;
        this.c = new AtomicLong(-1L);
        this.b = new o9n1(context, (Activity) null, o9n1.m, new ixd1("mlkit:vision"), jz40.c);
    }

    public static List u(bip1 bip1Var) throws GeneralSecurityException {
        pno1 jdp1Var;
        boolean z;
        zap1 zap1Var = vqo1.a;
        a2x0 a2x0Var = a2x0.c1;
        ArrayList arrayList = new ArrayList(bip1Var.z());
        for (aip1 aip1Var : bip1Var.y()) {
            int iY = aip1Var.y();
            try {
                kap1 kap1VarV = v(aip1Var);
                map1 map1Var = (map1) (map1.class.equals(map1.class) ? map1.class.cast(zap1Var) : (!map1.class.equals(vap1.class) || ((AtomicBoolean) ibp1.a.b).get()) ? null : map1.class.cast(new vap1((byte) 0)));
                if (map1Var == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to serialize into proto keyset format.");
                }
                jdp1Var = map1Var.a(kap1VarV, a2x0Var);
                z = false;
            } catch (GeneralSecurityException e) {
                if ((vap1.class.equals(map1.class) ? vap1.class.cast(zap1Var) : (!vap1.class.equals(vap1.class) || ((AtomicBoolean) ibp1.a.b).get()) ? null : vap1.class.cast(new vap1((byte) 0))) == null) {
                    throw e;
                }
                jdp1Var = new jdp1(v(aip1Var));
                z = true;
            }
            if ((vap1.class.equals(map1.class) ? vap1.class.cast(zap1Var) : (!vap1.class.equals(vap1.class) || ((AtomicBoolean) ibp1.a.b).get()) ? null : vap1.class.cast(new vap1((byte) 0))) == null && !w(aip1Var.C())) {
                k220.r("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            arrayList.add(new q9p1(jdp1Var, aip1Var.C(), iY, iY == bip1Var.x(), z));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static kap1 v(aip1 aip1Var) {
        return kap1.a(aip1Var.x().x(), aip1Var.x().y(), yoo1.F(aip1Var.x().D()), yoo1.G(aip1Var.D()), aip1Var.D() == 5 ? null : Integer.valueOf(aip1Var.y()));
    }

    public static boolean w(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public void accept(Object obj, Object obj2) {
        rbo1 rbo1Var = new rbo1((pxo1) this.b, (bsd1) obj2);
        whn1 whn1VarN = ((mzo1) obj).n();
        hi5 hi5VarA = oho1.A();
        String[] strArr = (String[]) this.c;
        Parcel parcelA1 = whn1VarN.a1();
        osn1.c(parcelA1, rbo1Var);
        parcelA1.writeStringArray(strArr);
        osn1.b(parcelA1, hi5VarA);
        whn1VarN.d1(5, parcelA1);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 7:
                Map map = (Map) obj;
                boolean zL = y7y0.L(map);
                vxm1 vxm1Var = (vxm1) this.b;
                boolean zC = rh11.c(map);
                Observable observable = vxm1Var.c;
                r9c r9cVar = (r9c) this.c;
                return observable.flatMap(new uxm1(vxm1Var, r9cVar)).switchMap(new ltf1(vxm1Var, (byte) 19)).takeUntil(hcx0.Z0).takeLast(1).singleOrError().map(new m3c(vxm1Var, zL, r9cVar, zC));
            case 8:
                vum1 vum1Var = (vum1) obj;
                if (!vum1Var.equals(sum1.a)) {
                    return Single.just(vum1Var);
                }
                mwm1 mwm1Var = ((zxm1) this.b).a;
                c2t0 c2t0VarN = PinRequest.n();
                c2t0VarN.n((String) this.c);
                return mwm1Var.callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "Pin", (PinRequest) c2t0VarN.build()).map(ytw0.X).map(icx0.Y0);
            case 9:
                yut0 yut0Var = (yut0) this.b;
                return ((mwm1) yut0Var.c).b((YourLibraryRequest) obj).map(new frl1(yut0Var, (r9c) this.c, (byte) 8));
            default:
                mmr0 mmr0Var = new mmr0(Long.valueOf(ChronoUnit.HOURS.getDuration().getSeconds()), TimeUnit.SECONDS);
                Observable observableJust = Observable.just(obj);
                i0n1 i0n1Var = (i0n1) this.b;
                Single singleDelay = ((Single) this.c).delay(((Number) mmr0Var.a).longValue(), (TimeUnit) mmr0Var.b);
                return Observable.merge(observableJust, singleDelay.toObservable().concatMap(new zxl1(i0n1Var, singleDelay, (byte) 10)));
        }
    }

    public o3r b() {
        switch (this.a) {
            case 0:
                break;
        }
        return (o3r) this.b;
    }

    public /* bridge */ /* synthetic */ wax c(Class cls, ifp0 ifp0Var) {
        ((HashMap) this.b).put(cls, ifp0Var);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    public Object d(Task task) {
        Bundle bundle;
        return (task.j() && (bundle = (Bundle) task.g()) != null && bundle.containsKey("google.messenger")) ? ((ny31) this.b).a((Bundle) this.c).k(m5u.c, r3x0.d1) : task;
    }

    public void e(hg70 hg70Var, bsd1 bsd1Var) {
        hg70Var.f0((Bundle) this.c, new ibn1((ndn1) this.b, bsd1Var, (byte) 3));
    }

    public ldn1 f() {
        v311 v311Var;
        xii0 xii0Var = (xii0) this.b;
        if (xii0Var != null && (v311Var = (v311) this.c) != null) {
            return new ldn1(xii0Var, v311Var);
        }
        StringBuilder sb = new StringBuilder();
        if (((xii0) this.b) == null) {
            sb.append(" status");
        }
        if (((v311) this.c) == null) {
            sb.append(" recordingInfo");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public Observable g(String str, r9c r9cVar) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(r9cVar.b);
        v5b1 v5b1Var = s4b1VarX.d;
        return ((Observable) this.c).map(new vrv0(u890.j(v5b1Var != null ? v5b1Var.getType() : null, bzu0.f), s4b1VarX, this, r9cVar, str));
    }

    public Object h() {
        Object objRemoveLast;
        synchronized (this.c) {
            objRemoveLast = ((ArrayDeque) this.b).removeLast();
        }
        return objRemoveLast;
    }

    public void i(zx70 zx70Var) throws Exception {
        Object objH;
        k2d k2dVarQ0 = zx70Var.Q0();
        j2d j2dVar = k2dVarQ0 instanceof k2d ? k2dVarQ0.a : null;
        if ((j2dVar.c() != h2d.f && j2dVar.c() != h2d.d) || j2dVar.e() != g2d.e || j2dVar.d() != i2d.d) {
            zx70Var.close();
            return;
        }
        synchronized (this.c) {
            try {
                objH = ((ArrayDeque) this.b).size() >= 3 ? h() : null;
                ((ArrayDeque) this.b).addFirst(zx70Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objH != null) {
            ((zx70) objH).close();
        }
    }

    public void j() {
        i8h1 i8h1Var = (i8h1) this.b;
        zok0 zok0Var = (zok0) this.c;
        zok0Var.getClass();
        x6h1 x6h1VarC = zok0Var.b.c();
        x6h1VarC.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void k(v311 v311Var) {
        if (v311Var != null) {
            this.c = v311Var;
        } else {
            bhn0.i("Null recordingInfo");
        }
    }

    public void l(xii0 xii0Var) {
        this.b = xii0Var;
    }

    public /* synthetic */ String[] m() {
        return (String[]) this.b;
    }

    public /* synthetic */ ArrayList n() {
        return (ArrayList) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(cln1 cln1Var, onm onmVar) {
        uxo1 uxo1Var;
        if (onmVar instanceof uxo1) {
            uxo1Var = (uxo1) onmVar;
            int i = uxo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxo1Var.c = i - Integer.MIN_VALUE;
            } else {
                uxo1Var = new uxo1(this, onmVar);
            }
        } else {
            uxo1Var = new uxo1(this, onmVar);
        }
        Object objA = uxo1Var.a;
        int i2 = uxo1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            lyo1 lyo1Var = (lyo1) this.c;
            String str = (String) ((brk1) this.b).c;
            byte[] bArrD = cln1Var.d();
            uxo1Var.c = 1;
            objA = lyo1Var.a(str, bArrD, uxo1Var);
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
        return Boolean.valueOf(((oyo1) objA).a.getHttpStatusCode() == 200);
    }

    public void onComplete(Task task) {
        switch (this.a) {
            case 13:
                ((Map) ((frl1) this.c).c).remove((bsd1) this.b);
                return;
            default:
                gzo1 gzo1Var = (gzo1) this.b;
                bsd1 bsd1Var = (bsd1) this.c;
                synchronized (gzo1Var.f) {
                    gzo1Var.e.remove(bsd1Var);
                    break;
                }
                return;
        }
    }

    public Object p(q9p1 q9p1Var) throws GeneralSecurityException {
        ncp1 ncp1Var = (ncp1) this.b;
        kgp1 kgp1Var = (kgp1) this.c;
        pno1 pno1Var = q9p1Var.a;
        Class<?> cls = pno1Var.getClass();
        Class cls2 = kgp1Var.a;
        sfp1 sfp1Var = (sfp1) ncp1Var.a.get(new ggp1(cls, cls2));
        if (sfp1Var != null) {
            return sfp1Var.c.b(pno1Var);
        }
        String name = pno1Var.getClass().getName();
        String name2 = cls2.getName();
        throw new GeneralSecurityException(rjx.o(new StringBuilder(name.length() + 64 + name2.length()), "No PrimitiveConstructor registered for key class ", name, " and primitive ", name2));
    }

    public xab1 q(iu30 iu30Var, gla0 gla0Var) {
        return fn31.T((llm) this.b, (o8n) null, 0, new q4m1(this, gla0Var, iu30Var, (lnm) null, (byte) 16), 3);
    }

    public q9p1 r() {
        for (q9p1 q9p1Var : (List) this.b) {
            if (q9p1Var != null && q9p1Var.d) {
                if (q9p1Var.b == k9p1.c) {
                    return q9p1Var;
                }
                eg.m("Keyset has primary which isn't enabled");
                return null;
            }
        }
        eg.m("Keyset has no valid primary");
        return null;
    }

    public q9p1 s(int i) {
        List list = (List) this.b;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            x4n1.f(String.valueOf(i).length() + 34 + String.valueOf(size).length(), "Invalid index ", i, " for keyset of size ", size);
            return null;
        }
        q9p1 q9p1Var = (q9p1) list.get(i);
        if (!w(q9p1Var.f)) {
            eg.m(fd21.h(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
            return null;
        }
        if (!q9p1Var.e) {
            return (q9p1) list.get(i);
        }
        eg.m(fd21.h(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
        return null;
    }

    public boolean t(Object obj) {
        String string;
        Boolean boolD1;
        switch (this.a) {
            case 0:
                qxc0 qxc0Var = (qxc0) obj;
                Map map = qxc0Var.X;
                Set set = h4d0.a;
                String str = (String) map.get("generation_status");
                if (str == null || (string = ihc1.e1(str).toString()) == null) {
                    string = "";
                }
                h4d0 h4d0VarU = qyo1.u(string);
                if (qxc0Var.h || h4d0VarU.b() || qxc0Var.S0 <= 0 || h4d0.a.contains(h4d0VarU)) {
                    return false;
                }
                String str2 = (String) map.get("is_personalized_playlist");
                return ((str2 == null || (boolD1 = ihc1.d1(str2)) == null) ? false : boolD1.booleanValue()) && ((xyl1) ((z2y0) this.c).c.c).a(map);
            default:
                return ((w5m1) this.c).c.a(((u5m1) obj).a.X);
        }
    }

    public String toString() {
        int i;
        switch (this.a) {
            case 26:
                try {
                    xhp1 xhp1VarB = bip1.B();
                    for (q9p1 q9p1Var : (List) this.b) {
                        pno1 pno1Var = q9p1Var.a;
                        int i2 = q9p1Var.c;
                        int i3 = q9p1Var.f;
                        map1 map1Var = (map1) (map1.class.equals(map1.class) ? map1.class.cast(vqo1.a) : (!map1.class.equals(vap1.class) || ((AtomicBoolean) ibp1.a.b).get()) ? null : map1.class.cast(new vap1((byte) 0)));
                        if (map1Var == null) {
                            throw new GeneralSecurityException("Passed in configuration cannot be used to parse and serialize proto keysets.");
                        }
                        kap1 kap1VarB = map1Var.b(pno1Var, a2x0.c1);
                        Integer numV = pno1Var.v();
                        if (numV != null && numV.intValue() != i2) {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                        zhp1 zhp1VarZ = aip1.z();
                        php1 php1VarZ = qhp1.z();
                        String str = (String) kap1VarB.a;
                        php1VarZ.d();
                        ((kin1) php1VarZ).b.B(str);
                        ain1 ain1Var = (ain1) kap1VarB.b;
                        php1VarZ.d();
                        ((kin1) php1VarZ).b.C(ain1Var);
                        gap1 gap1Var = (gap1) kap1VarB.c;
                        int i4 = 2;
                        if (gap1Var == gap1.c) {
                            i = 2;
                        } else if (gap1Var == gap1.d) {
                            i = 3;
                        } else if (gap1Var == gap1.e) {
                            i = 4;
                        } else if (gap1Var == gap1.f) {
                            i = 5;
                        } else {
                            if (gap1Var != gap1.g) {
                                throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(gap1Var.b));
                            }
                            i = 6;
                        }
                        php1VarZ.d();
                        ((kin1) php1VarZ).b.E(i);
                        zhp1VarZ.d();
                        ((kin1) zhp1VarZ).b.A(php1VarZ.e());
                        zhp1VarZ.d();
                        ((kin1) zhp1VarZ).b.E(i3);
                        zhp1VarZ.d();
                        ((kin1) zhp1VarZ).b.B(i2);
                        clv clvVar = (clv) kap1VarB.d;
                        if (clvVar != clv.e) {
                            if (clvVar == clv.f) {
                                i4 = 3;
                            } else if (clvVar == clv.g) {
                                i4 = 4;
                            } else if (clvVar == clv.h) {
                                i4 = 5;
                            } else if (clvVar == clv.i) {
                                i4 = 6;
                            } else {
                                if (clvVar != clv.t) {
                                    throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(clvVar.b));
                                }
                                i4 = 7;
                            }
                        }
                        zhp1VarZ.d();
                        ((kin1) zhp1VarZ).b.F(i4);
                        aip1 aip1VarE = zhp1VarZ.e();
                        xhp1VarB.d();
                        ((kin1) xhp1VarB).b.D(aip1VarE);
                        if (q9p1Var.d) {
                            xhp1VarB.d();
                            ((kin1) xhp1VarB).b.C(i2);
                        }
                    }
                    bip1 bip1VarE = xhp1VarB.e();
                    int i5 = gbp1.a;
                    dip1 dip1VarX = hip1.x();
                    int iX = bip1VarE.x();
                    dip1VarX.d();
                    ((kin1) dip1VarX).b.y(iX);
                    for (aip1 aip1Var : bip1VarE.y()) {
                        fip1 fip1VarX = gip1.x();
                        String strX = aip1Var.x().x();
                        fip1VarX.d();
                        ((kin1) fip1VarX).b.y(strX);
                        int iC = aip1Var.C();
                        fip1VarX.d();
                        ((kin1) fip1VarX).b.A(iC);
                        int iD = aip1Var.D();
                        fip1VarX.d();
                        ((kin1) fip1VarX).b.B(iD);
                        int iY = aip1Var.y();
                        fip1VarX.d();
                        ((kin1) fip1VarX).b.z(iY);
                        gip1 gip1VarE = fip1VarX.e();
                        dip1VarX.d();
                        ((kin1) dip1VarX).b.z(gip1VarE);
                    }
                    return dip1VarX.e().toString();
                } catch (GeneralSecurityException e) {
                    throw new IllegalArgumentException("Cannot get keyset info: key cannot be serialized", e);
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zxl1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public zxl1() {
        this.a = (byte) 15;
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public zxl1(AppMeasurementSdk appMeasurementSdk, oql oqlVar) {
        this.a = (byte) 18;
        this.c = oqlVar;
        appMeasurementSdk.a(new ghk1(this, (byte) 8));
        this.b = new HashSet();
    }

    public zxl1(bil1 bil1Var) {
        this.a = (byte) 22;
        this.b = bil1Var == null ? null : bil1Var.b;
    }

    public zxl1(frl1 frl1Var) {
        this.a = (byte) 17;
        this.b = new bym1((frl1) frl1Var.c);
        this.c = (String) frl1Var.b;
    }

    public zxl1(frl1 frl1Var, bsd1 bsd1Var) {
        this.a = (byte) 13;
        this.b = bsd1Var;
        this.c = frl1Var;
    }

    public zxl1(fqn1 fqn1Var) {
        this.a = (byte) 23;
        this.c = new bz11();
        this.b = fqn1Var;
        cxo1.c();
    }

    public zxl1(String[] strArr) {
        this.a = (byte) 12;
        this.b = strArr;
        this.c = new ArrayList();
        new HashMap();
    }

    public zxl1(z2y0 z2y0Var) {
        this.a = (byte) 0;
        this.c = z2y0Var;
        this.b = z2y0Var.d;
    }

    public zxl1(t8e1 t8e1Var) {
        this.a = (byte) 11;
        this.c = new Object();
        this.b = new ArrayDeque(3);
    }

    public zxl1(w5m1 w5m1Var) {
        this.a = (byte) 2;
        this.c = w5m1Var;
        this.b = w5m1Var.f;
    }
}
