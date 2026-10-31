package p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.Range;
import android.util.Size;
import android.util.TypedValue;
import com.comscore.streaming.AdvertisementType;
import com.facebook.FacebookException;
import io.reactivex.rxjava3.functions.Function;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zwg implements Function, r6b0 {
    public static zwg g;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public static final sua f = new sua((byte) 2);
    public static final p0d h = new p0d((byte) 11);

    public zwg(byte b) {
        switch (b) {
            case 14:
                break;
            case 18:
                this.a = new Object();
                this.c = new uj7(0);
                this.d = new wdn0();
                this.e = new wdn0();
                break;
            default:
                this.a = new Handler(Looper.getMainLooper());
                this.b = Collections.newSetFromMap(new WeakHashMap());
                this.c = new LinkedHashSet();
                this.d = new HashSet();
                this.e = new HashMap();
                break;
        }
    }

    public static x78 u(zwg zwgVar, lby lbyVar, v68 v68Var, boolean z, d8r0 d8r0Var, String str, int i) {
        return zwgVar.t(lbyVar, v68Var, z, d8r0Var, str, tb51.g((tb51) zwgVar.a, lbyVar), i, null, null);
    }

    public static void w(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    public static int x(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static int y(int i) {
        int iC = l1d.C(i);
        if (iC == 1) {
            return 2131952347;
        }
        if (iC == 2) {
            return 2131952338;
        }
        if (iC != 3) {
            return iC != 5 ? 2131952348 : 2131952352;
        }
        return 2131952334;
    }

    public void A(Activity activity) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            ((Set) this.b).remove(activity);
            ((LinkedHashSet) this.c).clear();
            ((HashMap) this.e).put(Integer.valueOf(activity.hashCode()), (HashSet) ((HashSet) this.d).clone());
            ((HashSet) this.d).clear();
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public void B(xhn xhnVar) {
        this.c = xhnVar;
    }

    public void C(List list) {
        if (list != null) {
            this.e = list;
        } else {
            bhn0.i("Null binaries");
        }
    }

    public void D(bbx bbxVar) {
        this.e = bbxVar;
    }

    public void E(r09 r09Var) {
        this.c = r09Var;
    }

    public void F(tz8 tz8Var) {
        this.b = tz8Var;
    }

    public void G(vz8 vz8Var) {
        this.d = vz8Var;
    }

    public void H(List list) {
        this.a = list;
    }

    public void I(jgg1 jgg1Var) {
        if (jgg1Var != null) {
            this.d = jgg1Var;
        } else {
            bhn0.i("Null transformer");
        }
    }

    public void J(s29 s29Var) {
        this.a = s29Var;
    }

    public void K(String str) {
        this.b = str;
    }

    public String L(m4v0 m4v0Var) {
        String string;
        Resources resources = ((Context) this.e).getResources();
        int i = m4v0Var.k;
        String str = m4v0Var.i;
        int i2 = m4v0Var.m;
        long j = m4v0Var.b;
        String string2 = null;
        if (i != 3) {
            if (m4v0Var.f) {
                if (m4v0Var.g) {
                    string2 = resources.getString(2131952637);
                }
            } else if (str == null || str.isEmpty()) {
                String str2 = m4v0Var.l;
                string2 = str2 != null ? resources.getString(2131959398, str2, z(resources, m4v0Var)) : z(resources, m4v0Var);
            } else {
                string2 = resources.getString(2131959398, str, z(resources, m4v0Var));
            }
            if (i2 == 1) {
                return string2 == null ? resources.getString(2131952351, t3k1.r(resources, spw.e(j))) : resources.getString(2131959398, string2, resources.getString(2131952351, t3k1.r(resources, spw.e(j))));
            }
            if (i2 != 2) {
                return string2 == null ? t3k1.r(resources, spw.e(j)) : resources.getString(2131959398, string2, t3k1.r(resources, spw.e(j)));
            }
            String string3 = resources.getString(y(i));
            return string2 == null ? string3 : resources.getString(2131959398, string2, string3);
        }
        yqg yqgVar = (yqg) this.d;
        Date date = m4v0Var.d;
        if (date.getTime() > 0) {
            switch ((int) spw.d(yqgVar.b() - date.getTime()).a) {
                case 0:
                    string = resources.getString(2131952336);
                    break;
                case 1:
                    string = resources.getString(2131952337);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    string = resources.getString(2131952335, ((SimpleDateFormat) this.c).format(Long.valueOf(date.getTime())));
                    break;
                default:
                    Calendar calendar = (Calendar) yqgVar.d().clone();
                    calendar.setTime(date);
                    string = yqgVar.d().get(1) != calendar.get(1) ? resources.getString(2131952335, ((DateFormat) this.a).format(Long.valueOf(date.getTime()))) : resources.getString(2131952335, ((SimpleDateFormat) this.b).format(Long.valueOf(date.getTime())));
                    break;
            }
        } else {
            string = null;
        }
        if (i2 == 1) {
            string2 = resources.getString(2131952351, t3k1.r(resources, spw.e(j)));
        } else if (i2 == 2) {
            string2 = resources.getString(y(i));
        } else if (m4v0Var.a > 0) {
            string2 = t3k1.r(resources, spw.e(j));
        }
        if (string != null && string2 != null) {
            return resources.getString(2131959398, string, string2);
        }
        if (string != null) {
            return string;
        }
        return string2 != null ? string2 : "";
    }

    public boolean M() {
        ((AtomicBoolean) this.e).set(true);
        return N((l420) this.a, (l420) this.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lcd1 */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    public boolean N(l420 l420Var, l420 l420Var2) throws Throwable {
        boolean zN;
        oi oiVar = ((hn60) this.d).b;
        l420[] l420VarArrB = l420Var.b();
        if (l420VarArrB != null) {
            boolean z = false;
            for (l420 l420Var3 : l420VarArrB) {
                File file = l420Var3.b;
                if (!file.isDirectory()) {
                    l420 l420VarP = oiVar.p(l420Var2, file.getName());
                    if (file.getName().equals(".tag")) {
                        ((jdd1) this.c).a(l420VarP);
                        zN = false;
                    } else {
                        File file2 = l420VarP.b;
                        if (file2.exists() && file.length() == file2.length() && file.lastModified() <= file2.lastModified()) {
                            ((jdd1) this.c).a(l420VarP);
                            zN = false;
                        } else {
                            try {
                                p(l420Var3, l420VarP);
                                zN = true;
                            } catch (IOException unused) {
                                throw new lcd1("Unable to copy file " + l420Var3 + " to " + l420VarP);
                            }
                        }
                    }
                } else if (((AtomicBoolean) this.e).get()) {
                    l420 l420VarP2 = oiVar.p(l420Var2, file.getName());
                    File file3 = l420VarP2.b;
                    if (!file3.exists() && !l420VarP2.mkdir()) {
                        q58.h(l420VarP2, "Unable to create nested folder ");
                        return false;
                    }
                    if (file3.isFile() && (!l420VarP2.delete() || !l420VarP2.mkdir())) {
                        q58.h(l420VarP2, "Unable to replace existed file with folder ");
                        return false;
                    }
                    if (!file3.isDirectory() || !file3.canWrite()) {
                        throw new lcd1(l420VarP2 + " is not writable folder");
                    }
                    zN = N(l420Var3, l420VarP2);
                }
                z |= zN;
            }
            return z;
        }
        return false;
    }

    public void a() {
        ((d520) this.b).a();
        d520 d520Var = (d520) this.c;
        ((HashMap) d520Var.c).put((ajn0) this.d, new dg5((pf5) o7h.V0((ArrayList) this.e)));
    }

    public Object apply(Object obj) {
        nl8 nl8Var = (nl8) obj;
        tif1 tif1Var = (tif1) this.a;
        if (!(nl8Var instanceof kl8)) {
            return bn41.a;
        }
        tif1.d(tif1Var, "authenticated_scope");
        ((lxg) this.b).e("auth_flow");
        an41 an41Var = new an41(new vt1((tif1) this.a, (vuk) this.c, (dn41) this.d, (kly0) this.e, nl8Var, (byte) 3));
        tif1Var.f("authenticated_scope", "cst");
        return an41Var;
    }

    public void b(Activity activity) {
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            ((Set) this.b).add(activity);
            ((HashSet) this.d).clear();
            HashSet hashSet = (HashSet) ((HashMap) this.e).get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.d = hashSet;
            }
            if (set.contains(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    v();
                } else {
                    ((Handler) this.a).post(new fe(this, (byte) 22));
                }
            } catch (Throwable th) {
                dhn.a(this, th);
            }
        } catch (Throwable th2) {
            dhn.a(this, th2);
        }
    }

    public uhd c(vc9 vc9Var, Function0 function0) {
        int i;
        int i2;
        int i3;
        n811 n811Var = new n811();
        n811Var.a = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                vc9Var.b(th);
                return fmv.O0;
            }
            uj7 uj7Var = (uj7) this.c;
            do {
                i = uj7Var.get();
                i2 = i + 1;
            } while (!uj7Var.compareAndSet(i, i2));
            byte b = 0;
            boolean z = (134217727 & i2) == 1;
            n811Var.a = (i2 >>> 27) & 15;
            ((wdn0) this.d).b(vc9Var);
            if (z) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                wdn0 wdn0Var = (wdn0) this.d;
                                Object[] objArr = wdn0Var.a;
                                int i4 = wdn0Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((vc9) objArr[i5]).b(th2);
                                }
                                ((wdn0) this.d).e();
                                uj7 uj7Var2 = (uj7) this.c;
                                do {
                                    i3 = uj7Var2.get();
                                } while (!uj7Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new zhq0(new uc9(vc9Var, this, n811Var, b));
        }
    }

    public pz8 d() {
        List list;
        vz8 vz8Var = (vz8) this.d;
        if (vz8Var != null && (list = (List) this.e) != null) {
            return new pz8((List) this.a, (tz8) this.b, (xhn) this.c, vz8Var, list);
        }
        StringBuilder sb = new StringBuilder();
        if (((vz8) this.d) == null) {
            sb.append(" signal");
        }
        if (((List) this.e) == null) {
            sb.append(" binaries");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public void e(ajn0 ajn0Var, Object obj) {
        ((d520) this.a).e(ajn0Var, obj);
    }

    public void f(ajn0 ajn0Var, heg hegVar, ajn0 ajn0Var2) {
        ((d520) this.a).f(ajn0Var, hegVar, ajn0Var2);
    }

    public a29 g() {
        String strConcat = ((s29) this.a) == null ? " transportContext" : "";
        if (((String) this.b) == null) {
            strConcat = strConcat.concat(" transportName");
        }
        if (((r09) this.c) == null) {
            strConcat = strConcat.concat(" event");
        }
        if (((jgg1) this.d) == null) {
            strConcat = strConcat.concat(" transformer");
        }
        if (((bbx) this.e) == null) {
            strConcat = strConcat.concat(" encoding");
        }
        if (strConcat.isEmpty()) {
            return new a29((s29) this.a, (String) this.b, (r09) this.c, (jgg1) this.d, (bbx) this.e);
        }
        eg.m("Missing required properties:".concat(strConcat));
        return null;
    }

    public r6b0 h(heg hegVar, ajn0 ajn0Var) {
        return ((d520) this.a).h(hegVar, ajn0Var);
    }

    public i29 i() {
        String strConcat = ((Size) this.a) == null ? " resolution" : "";
        if (((liv) this.b) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (((Range) this.c) == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.e) == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new i29((Size) this.a, (liv) this.b, (Range) this.c, (qsk) this.d, ((Boolean) this.e).booleanValue());
        }
        eg.m("Missing required properties:".concat(strConcat));
        return null;
    }

    public wp20 j() {
        return ((yuj) this.c).a(f4p1.g((xb7) this.d), new j2i(-535173000, new v72(this, (byte) 22), true), new n7e0(new k87(this), new mu6(this, (byte) 5), ios.h, l87.a), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }

    public ys11 k(d0r d0rVar, iu30 iu30Var, x6o0 x6o0Var) {
        return ((zs11) this.a).a(d0rVar, new ls11((ds11) null, (ds11) null, (ds11) null, (ds11) null, (iu30) null, (iu30) null, (qrk) null, (iu30) null, (iu30) null, new se3((q8n) this.e, (lzn0) this.c), b6j0.d, 2, new o27(0, 1, (l1d) null), dye1.a, npc1.a, (sb2) null, (rru) null, false, (o3r) null, (o3r) null, (o3r) null, (o3r) null, bf3.a((bf3) this.b, ((abm) this.d).a(), 2), (o3r) null, new ze3(iu30Var, (byte) 0), (y5z) null, (bnw0) null, (bt11) null, 1, (o3r) null, -167837185, 495), x6o0Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:18:0x007f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x0103  */
    /* JADX WARN: Code duplicated, block: B:40:0x0107  */
    public jhm l(String str, String str2, kk3 kk3Var) {
        fhm fhmVar;
        fhm fhmVar2;
        hux huxVar;
        hux huxVar2;
        String string;
        if (kk3Var.equals(gk3.a)) {
            n57.e("Destination.Unknown: contextUri " + str2 + " - itemUri " + str);
            return null;
        }
        rl1 rl1Var = (rl1) this.c;
        lik1 lik1Var = (lik1) this.a;
        dg30 dg30Var = (dg30) rl1Var.c;
        ltm1 ltm1Var = (ltm1) rl1Var.d;
        boolean z = kk3Var instanceof ek3;
        if (z) {
            ltm1Var.getClass();
            fhmVar2 = new fhm(new rhm(ltm1.b(dg30Var)));
        } else {
            if (!(kk3Var instanceof ik3)) {
                if (kk3Var instanceof hk3) {
                    ltm1Var.getClass();
                    Drawable drawable = dg30Var.getDrawable(2131234038);
                    drawable.getClass();
                    fhmVar2 = new fhm(new rhm(ltm1.a(dg30Var, drawable, 2131232807, x74.E(dg30Var, 2131104462), 0.375f)));
                } else {
                    fhmVar = null;
                }
                huxVar = irx.c;
                if (fhmVar == null) {
                    huxVar2 = huxVar;
                } else {
                    huxVar2 = null;
                }
                if (kk3Var instanceof ik3) {
                    string = dg30Var.getString(2131952225);
                } else if (kk3Var instanceof hk3) {
                    string = dg30Var.getString(2131952224);
                } else if (kk3Var instanceof jk3) {
                    string = dg30Var.getString(bro1.n(false, rl1Var.b));
                } else {
                    if (!(kk3Var instanceof gk3)) {
                        hhg1.g(kk3Var, "No title available for ");
                        return null;
                    }
                    if (kk3Var instanceof fk3) {
                        string = dg30Var.getString(2131952222, ((fk3) kk3Var).a);
                    } else {
                        if (z) {
                            eg.o();
                            return null;
                        }
                        string = dg30Var.getString(2131952221);
                    }
                }
                String str3 = string;
                str3.getClass();
                return new jhm("aligned_curation_add_to_destination", huxVar2, fhmVar, (Integer) null, str3, false, (tm81) null, new ihm(new ygm(1), new ghm(uh1.b1, new d4((byte) 19, kk3Var, str)), new db(rl1Var, str, lik1Var, str2, (byte) 5)), AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL);
            }
            ltm1Var.getClass();
            fhmVar2 = new fhm(new rhm(ltm1.e(dg30Var)));
        }
        fhmVar = fhmVar2;
        huxVar = irx.c;
        if (fhmVar == null) {
            huxVar2 = huxVar;
        } else {
            huxVar2 = null;
        }
        if (kk3Var instanceof ik3) {
            string = dg30Var.getString(2131952225);
        } else if (kk3Var instanceof hk3) {
            string = dg30Var.getString(2131952224);
        } else if (kk3Var instanceof jk3) {
            string = dg30Var.getString(bro1.n(false, rl1Var.b));
        } else {
            if (!(kk3Var instanceof gk3)) {
                hhg1.g(kk3Var, "No title available for ");
                return null;
            }
            if (kk3Var instanceof fk3) {
                string = dg30Var.getString(2131952222, ((fk3) kk3Var).a);
            } else {
                if (z) {
                    eg.o();
                    return null;
                }
                string = dg30Var.getString(2131952221);
            }
        }
        String str4 = string;
        str4.getClass();
        return new jhm("aligned_curation_add_to_destination", huxVar2, fhmVar, (Integer) null, str4, false, (tm81) null, new ihm(new ygm(1), new ghm(uh1.b1, new d4((byte) 19, kk3Var, str)), new db(rl1Var, str, lik1Var, str2, (byte) 5)), AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL);
    }

    public s6b0 m(ajn0 ajn0Var) {
        return ((d520) this.a).m(ajn0Var);
    }

    public void n(ajn0 ajn0Var, jeg jegVar) {
        ((d520) this.a).n(ajn0Var, jegVar);
    }

    public jhm o(String str) {
        pn1 pn1Var = (pn1) this.e;
        lik1 lik1Var = (lik1) this.a;
        int iN = bro1.n(true, pn1Var.c);
        return new jhm("aligned_curation_remove_from_your_library", klx.c, (fhm) null, Integer.valueOf(iN), (String) null, false, (tm81) null, new ihm(new ygm(2), hhm.b, new ghm(i021.b1, new q4z0(str, (byte) 28)), new v721(pn1Var, str, lik1Var, (byte) 3)), 244);
    }

    public void p(l420 l420Var, l420 l420Var2) throws Throwable {
        char c;
        char c2;
        char c3;
        char c4;
        Closeable closeableJ;
        q320 q320VarL;
        q320 q320Var;
        v520 v520Var;
        Exception exc;
        Long lValueOf;
        File file = l420Var2.b;
        File file2 = l420Var.b;
        if (!file2.exists()) {
            throw new FileNotFoundException("Source '" + l420Var + "' does not exist");
        }
        if (file2.isDirectory()) {
            n9v.n("Source '", l420Var, "' exists but is a directory");
            return;
        }
        if (file2.getCanonicalPath().equals(file.getCanonicalPath())) {
            n9v.l(l420Var, l420Var2);
            return;
        }
        l420 l420VarA = l420Var2.a();
        if (l420VarA != null && !l420VarA.mkdirs() && !l420VarA.b.isDirectory()) {
            n9v.n("Destination '", l420VarA, "' directory cannot be created");
            return;
        }
        if (file.exists() && !file.canWrite()) {
            n9v.n("Destination '", l420Var2, "' exists but is read-only");
            return;
        }
        if (file.exists() && file.isDirectory()) {
            n9v.n("Destination '", l420Var2, "' exists but is a directory");
            return;
        }
        q320 q320Var2 = null;
        try {
            closeableJ = l420Var.a.j(l420Var);
            try {
                q320VarL = l420Var2.a.l(l420Var2);
                try {
                    FileChannel channel = ((m420) closeableJ).a.getChannel();
                    c2 = 3;
                    try {
                        c3 = 2;
                        try {
                            q320Var = new q320(channel, ((m420) closeableJ).b, ((m420) closeableJ).c, ((m420) closeableJ).d, ((m420) closeableJ).e);
                            try {
                                q320 q320Var3 = new q320(((r420) q320VarL).a.getChannel(), ((r420) q320VarL).b, ((r420) q320VarL).c, ((r420) q320VarL).d, ((r420) q320VarL).e);
                                try {
                                    long size = channel.size();
                                    long j = 0;
                                    while (true) {
                                        if (j >= size) {
                                            c = 0;
                                            c4 = 1;
                                            break;
                                        }
                                        long j2 = size - j;
                                        if (j2 > 31457280) {
                                            j2 = 31457280;
                                        }
                                        String str = q320Var3.b;
                                        v520 v520Var2 = q320Var3.d;
                                        System.currentTimeMillis();
                                        q320 q320Var4 = q320Var;
                                        try {
                                            v520Var = v520Var2;
                                            c4 = 1;
                                            try {
                                                q320Var = q320Var4;
                                                try {
                                                    try {
                                                        lValueOf = Long.valueOf(q320Var3.a.transferFrom(q320Var4, j, j2));
                                                        exc = null;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        c = 0;
                                                        q320Var2 = q320Var3;
                                                        Closeable[] closeableArr = new Closeable[4];
                                                        closeableArr[c] = q320Var2;
                                                        closeableArr[c4] = q320VarL;
                                                        closeableArr[c3] = q320Var;
                                                        closeableArr[c2] = closeableJ;
                                                        uh70.b(closeableArr);
                                                        throw th;
                                                    }
                                                } catch (Exception e) {
                                                    e = e;
                                                    exc = e;
                                                    lValueOf = null;
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                q320Var = q320Var4;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                q320Var = q320Var4;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            q320Var = q320Var4;
                                            v520Var = v520Var2;
                                            c4 = 1;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            q320Var = q320Var4;
                                            c4 = 1;
                                        }
                                        System.currentTimeMillis();
                                        c = 0;
                                        try {
                                            if (q320Var3.c) {
                                                v520Var.r(str);
                                                if (exc == null) {
                                                    lValueOf.getClass();
                                                }
                                                gvg.s();
                                            }
                                            if (exc != null) {
                                                throw exc;
                                            }
                                            lValueOf.getClass();
                                            long jLongValue = lValueOf.longValue();
                                            if (jLongValue == 0) {
                                                break;
                                            } else {
                                                j += jLongValue;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            q320Var2 = q320Var3;
                                            Closeable[] closeableArr2 = new Closeable[4];
                                            closeableArr2[c] = q320Var2;
                                            closeableArr2[c4] = q320VarL;
                                            closeableArr2[c3] = q320Var;
                                            closeableArr2[c2] = closeableJ;
                                            uh70.b(closeableArr2);
                                            throw th;
                                        }
                                    }
                                    Closeable[] closeableArr3 = new Closeable[4];
                                    closeableArr3[c] = q320Var3;
                                    closeableArr3[c4] = q320VarL;
                                    closeableArr3[2] = q320Var;
                                    closeableArr3[3] = closeableJ;
                                    uh70.b(closeableArr3);
                                    long length = file2.length();
                                    long length2 = file.length();
                                    if (length == length2) {
                                        l420Var2.setLastModified(file2.lastModified());
                                        ((jdd1) this.c).a(l420Var2);
                                        return;
                                    }
                                    throw new IOException("Failed to copy full contents from '" + l420Var + "' to '" + l420Var2 + "' Expected length: " + length + " Actual: " + length2);
                                } catch (Throwable th5) {
                                    th = th5;
                                    c = 0;
                                    c4 = 1;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                c = 0;
                                c4 = 1;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            c = 0;
                            c4 = 1;
                            q320Var = null;
                            Closeable[] closeableArr4 = new Closeable[4];
                            closeableArr4[c] = q320Var2;
                            closeableArr4[c4] = q320VarL;
                            closeableArr4[c3] = q320Var;
                            closeableArr4[c2] = closeableJ;
                            uh70.b(closeableArr4);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        c = 0;
                        c3 = 2;
                        c4 = 1;
                        q320Var = null;
                        Closeable[] closeableArr5 = new Closeable[4];
                        closeableArr5[c] = q320Var2;
                        closeableArr5[c4] = q320VarL;
                        closeableArr5[c3] = q320Var;
                        closeableArr5[c2] = closeableJ;
                        uh70.b(closeableArr5);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    c = 0;
                    c2 = 3;
                }
            } catch (Throwable th10) {
                th = th10;
                c = 0;
                c2 = 3;
                c3 = 2;
                c4 = 1;
                q320VarL = null;
                q320Var = q320VarL;
                Closeable[] closeableArr6 = new Closeable[4];
                closeableArr6[c] = q320Var2;
                closeableArr6[c4] = q320VarL;
                closeableArr6[c3] = q320Var;
                closeableArr6[c2] = closeableJ;
                uh70.b(closeableArr6);
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            c = 0;
            c2 = 3;
            c3 = 2;
            c4 = 1;
            closeableJ = null;
            q320VarL = null;
        }
    }

    public void q(iu30 iu30Var) {
        int i;
        synchronized (this.a) {
            try {
                wdn0 wdn0Var = (wdn0) this.d;
                this.d = (wdn0) this.e;
                this.e = wdn0Var;
                uj7 uj7Var = (uj7) this.c;
                do {
                    i = uj7Var.get();
                } while (!uj7Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = wdn0Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    iu30Var.invoke(wdn0Var.g(i3));
                }
                wdn0Var.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean r() {
        return (((uj7) this.c).get() & 134217727) > 0;
    }

    public q59 s() {
        q59 q59Var = (q59) this.d;
        if (q59Var != null) {
            return q59Var;
        }
        u890.C("logger");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0151  */
    public x78 t(lby lbyVar, v68 v68Var, boolean z, d8r0 d8r0Var, String str, String str2, int i, Integer num, String str3) {
        Drawable drawable;
        String string;
        boolean z2;
        int i2;
        String str4;
        String string2;
        int i3;
        Drawable drawable2;
        di4 di4Var = (di4) this.d;
        tb51 tb51Var = (tb51) this.a;
        double d = v68Var.h;
        boolean z3 = v68Var.b;
        String str5 = v68Var.d;
        r68 r68Var = v68Var.g;
        String str6 = "";
        String str7 = (d <= 0.0d || !di4Var.F()) ? "" : String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        if ((r68Var instanceof s68) || (r68Var instanceof q68)) {
            drawable = null;
            string = null;
        } else {
            if (!(r68Var instanceof r68)) {
                eg.o();
                return null;
            }
            drawable = null;
            string = ((Resources) this.b).getString(2131961549, ((o5r) this.c).c.format(new Date(r68Var.a.a * 1000)));
        }
        rle1 rle1VarF = tb51Var.f(v68Var.c.a);
        String str8 = rle1VarF != null ? rle1VarF.a : "";
        boolean z4 = z && z3;
        Activity activity = (Activity) this.e;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = str7.length();
        int i4 = R.attr.state_enabled;
        if (length > 0) {
            Drawable drawable3 = activity.getDrawable(2131232678);
            if (drawable3 != null) {
                z2 = z4;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 10.0f, activity.getResources().getDisplayMetrics());
                ColorStateList colorStateListE = x74.E(activity, 2131101384);
                int color = activity.getColor(2131101384);
                if (colorStateListE != null) {
                    color = colorStateListE.getColorForState(new int[]{z2 ? -16842910 : 16842910}, color);
                }
                drawable3.setTint(color);
                i3 = 0;
                drawable3.setBounds(0, 0, iApplyDimension, iApplyDimension);
                drawable2 = drawable3;
            } else {
                z2 = z4;
                i3 = 0;
                drawable2 = drawable;
            }
            if (drawable2 != null) {
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable2, 1), i3, 1, 33);
            }
        } else {
            di4Var = di4Var;
            z3 = z3;
            z2 = z4;
            str6 = "";
        }
        String strK0 = bmq0.k0(p7h.M(new String[]{str7, string, str8}));
        String strJ0 = bmq0.j0(strK0, str5);
        ColorStateList colorStateListE2 = x74.E(activity, 2131101384);
        int color2 = activity.getColor(2131101384);
        if (colorStateListE2 != null) {
            if (z2) {
                i4 = -16842910;
            }
            color2 = colorStateListE2.getColorForState(new int[]{i4}, color2);
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color2);
        spannableStringBuilder.append((CharSequence) strJ0);
        if (strK0.length() == 0) {
            i2 = 0;
        } else if (str5.length() > 0 && str7.length() > 0) {
            i2 = 4;
        } else if (str5.length() <= 0 && str7.length() <= 0) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, strK0.length() + i2, 34);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        String str9 = lbyVar.a;
        String str10 = lbyVar.b;
        String str11 = lbyVar.c;
        int i5 = z3 ? 2 : 3;
        String str12 = v68Var.e;
        boolean z5 = (v68Var.f || (r68Var instanceof r68)) ? false : true;
        boolean z6 = z && z3;
        if (di4Var.F()) {
            if (string == null) {
                string = str6;
            }
            List listM = p7h.M(new String[]{string, str8, str5});
            if (d == 0.0d) {
                string2 = str6;
            } else {
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList(listM);
                Activity activity2 = tb51Var.a;
                if (d == 1.0d) {
                    arrayList.add(0, activity2.getResources().getString(2131961551));
                } else {
                    arrayList.add(0, activity2.getResources().getString(2131961552, String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1))));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                sb.append(o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, (iu30) null, 63));
                string2 = sb.toString();
            }
            str4 = string2;
        } else {
            str4 = str6;
        }
        return new x78(str9, str10, str2, spannedString, str4, str11, i5, z6, str, d8r0Var, str12, z5, i, r68Var instanceof r68, num, str3);
    }

    public void v() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            for (Activity activity : (Set) this.b) {
                if (activity != null) {
                    ((LinkedHashSet) this.c).add(new ywg(jm5.k(activity), (Handler) this.a, (HashSet) this.d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public String z(Resources resources, m4v0 m4v0Var) {
        yqg yqgVar = (yqg) this.d;
        long jB = yqgVar.b();
        Date date = m4v0Var.d;
        switch ((int) spw.d(jB - date.getTime()).a) {
            case 0:
                return resources.getString(2131952349);
            case 1:
                return resources.getString(2131952350);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return ((SimpleDateFormat) this.c).format(Long.valueOf(date.getTime()));
            default:
                Calendar calendar = (Calendar) yqgVar.d().clone();
                calendar.setTime(date);
                return yqgVar.d().get(1) == calendar.get(1) ? ((SimpleDateFormat) this.b).format(Long.valueOf(date.getTime())) : ((DateFormat) this.a).format(Long.valueOf(date.getTime()));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lcd1 */
    public zwg(l420 l420Var, l420 l420Var2, jdd1 jdd1Var, hn60 hn60Var) throws lcd1 {
        File file = l420Var2.b;
        this.a = l420Var;
        this.b = l420Var2;
        this.c = jdd1Var;
        this.d = hn60Var;
        this.e = new AtomicBoolean(false);
        File file2 = l420Var.b;
        if (file2.exists() && file2.isDirectory() && file2.canRead()) {
            if (file.exists() && file.isDirectory() && file.canWrite()) {
                return;
            }
            q58.h(l420Var2, "Unable to access destination directory: ");
            throw null;
        }
        q58.h(l420Var, "Unable to access source directory: ");
        throw null;
    }

    public zwg(onv0 onv0Var, onv0 onv0Var2, Set set, Set set2, Set set3) {
        this.a = onv0Var;
        this.c = onv0Var2;
        this.b = set;
        this.d = set2;
        this.e = set3;
    }

    public zwg(z0p z0pVar, x5j1 x5j1Var, i3b i3bVar, l1p0 l1p0Var, lag lagVar, le7 le7Var) {
        l2a l2aVar;
        this.a = x5j1Var;
        this.b = i3bVar;
        this.c = l1p0Var;
        this.d = lagVar;
        switch (z0pVar.a) {
            case 0:
                l2aVar = new l2a(le7Var, (byte) 27);
                break;
            default:
                l2aVar = new l2a(le7Var, (byte) 27);
                break;
        }
        this.e = l2aVar;
    }

    public /* synthetic */ zwg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }
}
