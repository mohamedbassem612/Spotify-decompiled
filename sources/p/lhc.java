package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import j$.util.DesugarTimeZone;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lhc implements chc, ya, luo, Function, siz, y190, Init, BiFunction, vjm1, c290 {
    public final /* synthetic */ byte a;

    public lhc() {
        this.a = (byte) 26;
        new LinkedHashMap();
    }

    public static b5p1 f(lhc lhcVar, String str) {
        Date date = new Date();
        lhcVar.getClass();
        Date dateM = m(str);
        if (dateM == null) {
            return new cy11(0);
        }
        try {
            int time = (int) ((dateM.getTime() - date.getTime()) / 3600000);
            if (time == 0) {
                return ey11.c;
            }
            return time < 24 ? new dy11(time) : new cy11((int) ((dateM.getTime() - date.getTime()) / 86400000));
        } catch (Exception e) {
            Logger.e(e, "While daysBetween()", new Object[0]);
            return ey11.d;
        }
    }

    public static osl1 g(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
        osl1 osl1VarI = i(view);
        boolean zI = x340Var.i(osl1VarI) | x340Var.i(view);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new vae1(osl1VarI, view, (byte) 11);
            x340Var.s0(objT);
        }
        qxd0.i(osl1VarI, (iu30) objT, x340Var);
        return osl1VarI;
    }

    public static osl1 i(View view) {
        osl1 osl1Var;
        WeakHashMap weakHashMap = osl1.x;
        synchronized (weakHashMap) {
            try {
                Object osl1Var2 = weakHashMap.get(view);
                if (osl1Var2 == null) {
                    osl1Var2 = new osl1(view);
                    weakHashMap.put(view, osl1Var2);
                }
                osl1Var = (osl1) osl1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return osl1Var;
    }

    public static Next l(xz41 xz41Var) {
        return Next.a(f46.S0(new hd51[]{sc51.b, new tc51(xz41Var.a, xz41Var.c, new sb10(xz41Var.b, xz41Var.d, xz41Var.e), 8)}));
    }

    public static Date m(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            Logger.e(e, "While toDateOrNull", new Object[0]);
            return null;
        }
    }

    public static long n(String str) {
        if (str.length() > 0) {
            try {
                Float fB0 = nhc1.b0(str.substring(0, str.length() - 1));
                return (long) (fB0 != null ? fB0.floatValue() : 0.0f);
            } catch (Exception e) {
                Logger.e(e, "While secondsToHours", new Object[0]);
            }
        }
        return 0L;
    }

    public static psi1 o(int i, String str) {
        return new psi1(new wk80(0, 0, 0, 0), str);
    }

    @Override // p.chc
    public byte[] a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public boolean accept(Object obj) {
        switch (this.a) {
            case 2:
                return ((ksk) obj).c == le30.t;
            default:
                return ((ksk) obj).c == le30.T0;
        }
    }

    public Object apply(Object obj) {
        int i;
        switch (this.a) {
            case 8:
                sp91 sp91Var = (sp91) obj;
                int iOrdinal = sp91Var.a.ordinal();
                int i2 = 3;
                if (iOrdinal == 0) {
                    i = 1;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i = 3;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    i = 2;
                }
                int iOrdinal2 = sp91Var.c.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 1;
                } else if (iOrdinal2 == 1) {
                    i2 = 2;
                } else if (iOrdinal2 != 2) {
                    eg.o();
                    return null;
                }
                return new jf81(i, i2);
            case 17:
                throw td6.k(obj);
            default:
                return Boolean.valueOf(rh11.c((Map) obj));
        }
    }

    public Object convert(int i) {
        ie71 ie71Var = i != 0 ? null : ie71.b;
        return ie71Var == null ? ie71.c : ie71Var;
    }

    public void d(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Integer num = go90.a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
            return;
        }
        Method method = tct0.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public Iterable e(Object obj) {
        Collection collectionL;
        jyc jycVar = (jyc) obj;
        return (jycVar == null || (collectionL = jycVar.l()) == null) ? z6x.a : collectionL;
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 11:
                return First.b((wb40) obj);
            default:
                b9g0 b9g0Var = (b9g0) obj;
                Map map = b9g0Var.d;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), a9g0.a((a9g0) entry.getValue(), false));
                }
                return First.b(b9g0.a(b9g0Var, linkedHashMap, (LinkedHashSet) null, false, 55));
        }
    }

    public v190 findValueByNumber(int i) {
        if (i == 0) {
            return yy10.a;
        }
        if (i == 1) {
            return yy10.b;
        }
        if (i == 2) {
            return yy10.c;
        }
        if (i == 3) {
            return yy10.d;
        }
        if (i != 4) {
            return null;
        }
        return yy10.e;
    }

    public e9 h() {
        Integer num = ho90.a;
        return (num == null || num.intValue() >= 34) ? new ydt0() : new oi10();
    }

    public qwa j(String str, int i, int i2, int i3, Map map) {
        ijv jcx0Var;
        switch (l1d.C(i)) {
            case 0:
                jcx0Var = new jcx0((byte) 29);
                break;
            case 1:
                jcx0Var = new bwg();
                break;
            case 2:
                jcx0Var = new hk70((byte) 2);
                break;
            case 3:
                jcx0Var = new hk70((byte) 3);
                break;
            case 4:
                jcx0Var = new hk70((byte) 1);
                break;
            case 5:
                jcx0Var = new mka((byte) 6);
                break;
            case 6:
                jcx0Var = new ijv((byte) 1);
                break;
            case 7:
                jcx0Var = new ijv((byte) 0);
                break;
            case 8:
                jcx0Var = new hk70((byte) 0);
                break;
            case 9:
            case 12:
            case 13:
            default:
                hhg1.n("No encoder available for format ".concat(l1d.D(i)));
                return null;
            case 10:
                jcx0Var = new c9c((byte) 18);
                break;
            case 11:
                jcx0Var = new pob((byte) 21, false);
                break;
            case 14:
                jcx0Var = new c681((byte) 26);
                break;
            case 15:
                jcx0Var = new ijv((byte) 2);
                break;
        }
        return jcx0Var.j(str, i, 200, 200, map);
    }

    public m78 k(hp40 hp40Var) {
        z6x z6xVar = hp40Var.a;
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        plz0 plz0Var = hp40Var.b;
        wlz0 wlz0Var = hp40Var.d;
        List<plz0> list = (Iterable) z6xVar;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (plz0 plz0Var2 : list) {
            long jN = n(plz0Var2.d);
            long jN2 = n(plz0Var2.e);
            String str = plz0Var2.c;
            b5p1 b5p1VarF = f(this, str);
            Date dateM = m(plz0Var2.b);
            if (dateM == null) {
                dateM = new Date();
            }
            Date dateM2 = m(str);
            if (dateM2 == null) {
                dateM2 = new Date();
            }
            arrayList.add(new mlz0(jN, jN2, b5p1VarF, dateM, dateM2));
        }
        Iterator it = list.iterator();
        long jN3 = 0;
        while (it.hasNext()) {
            jN3 += n(((plz0) it.next()).e);
        }
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.g;
        long jK0 = fdg1.k0(1, ngvVar);
        ngv ngvVar2 = ngv.e;
        float fU = jfv.u(jK0, ngvVar2);
        ngv ngvVar3 = ngv.f;
        int iFloor = (int) Math.floor((jfv.u(fdg1.k0(29, ngvVar3), ngvVar2) + jN3) / fU);
        Iterator it2 = list.iterator();
        long jN4 = 0;
        while (it2.hasNext()) {
            jN4 = n(((plz0) it2.next()).d) + jN4;
        }
        ytw0 ytw0Var2 = jfv.b;
        ngf1 ngf1Var = new ngf1(arrayList, new ogf1(iFloor, (int) Math.floor((jfv.u(fdg1.k0(29, ngvVar3), ngvVar2) + jN4) / jfv.u(fdg1.k0(1, ngvVar), ngvVar2))));
        akm0 akm0Var = new akm0(n(plz0Var.d), n(plz0Var.e), f(this, plz0Var.c));
        List<plz0> list2 = hp40Var.c;
        ArrayList<akm0> arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (plz0 plz0Var3 : list2) {
            arrayList2.add(new akm0(n(plz0Var3.d), n(plz0Var3.e), f(this, plz0Var3.c)));
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        for (akm0 akm0Var2 : arrayList2) {
            arrayList3.add(new akm0(akm0Var2.a, akm0Var2.b, akm0Var2.c));
        }
        return new m78(akm0Var, arrayList3, ngf1Var, new tlz0(wlz0Var.a, wlz0Var.b, wlz0Var.c, wlz0Var.d, wlz0Var.e, wlz0Var.f, wlz0Var.i, wlz0Var.j, wlz0Var.k, wlz0Var.g, wlz0Var.h, wlz0Var.l));
    }

    public /* synthetic */ lhc(byte b) {
        this.a = b;
    }

    public lhc(Context context, xna0 xna0Var, ena0 ena0Var) {
        this.a = (byte) 6;
    }

    public lhc(daq daqVar, teq teqVar) {
        this.a = (byte) 4;
    }

    @Override // p.siz
    public void b(jyc jycVar) {
    }

    @Override // p.siz
    public void c(beg begVar, ArrayList arrayList) {
    }

    public Object apply(Object obj, Object obj2) {
        int i = tr60.y1;
        return new sr60(((Boolean) obj).booleanValue(), (twj1) obj2);
    }
}
