package p;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.time.Duration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ejb implements Predicate, rzm, BiFunction, au11, n2i1, c290, Init, e5q0, gdt0, Function, owg1 {
    public final /* synthetic */ byte a;

    public static final y9e1 b(x9e1 x9e1Var) {
        af5 af5Var = x9e1Var.a;
        int i = x9e1Var.f;
        wp20 wp20Var = new wp20(x9e1Var.c, af5Var, x9e1Var.g, x9e1Var.i, z6p1.F(x9e1Var.b, x9e1Var.h), x9e1Var.e);
        long j = x9e1Var.j;
        int iK = hjl.k(j);
        boolean z = x9e1Var.e;
        int i2 = ((z || i == 2 || i == 4 || i == 5) && hjl.e(j)) ? hjl.i(j) : Integer.MAX_VALUE;
        int i3 = (z || !(i == 2 || i == 4 || i == 5)) ? x9e1Var.d : 1;
        if (iK != i2) {
            i2 = yoi1.p(sjo0.k(wp20Var.d()), iK, i2);
        }
        zrm0 zrm0Var = new zrm0(wp20Var, m5n1.v(0, i2, 0, hjl.h(j)), i3, x9e1Var.f);
        return new y9e1(x9e1Var, zrm0Var, jjl.d(j, (((long) ((int) Math.ceil(zrm0Var.e))) & 4294967295L) | (((long) ((int) Math.ceil(zrm0Var.d))) << 32)));
    }

    public static ivd d(List list, r87 r87Var, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return new ivd(list, z, (el51) null, w7x.a, r87Var);
    }

    public static a680 e() {
        Class clsX = c680.x("com.android.billingclient.api.SkuDetailsParams");
        Class clsX2 = c680.x("com.android.billingclient.api.SkuDetailsParams$Builder");
        if (clsX == null || clsX2 == null) {
            return null;
        }
        Method methodA = c680.A(clsX, "newBuilder", new Class[0]);
        Method methodA2 = c680.A(clsX2, "setType", new Class[]{String.class});
        Method methodA3 = c680.A(clsX2, "setSkusList", new Class[]{List.class});
        Method methodA4 = c680.A(clsX2, "build", new Class[0]);
        if (methodA == null || methodA2 == null || methodA3 == null || methodA4 == null) {
            return null;
        }
        a680 a680Var = new a680(clsX, clsX2, methodA, methodA2, methodA3, methodA4);
        if (!dhn.a.contains(a680.class)) {
            try {
                a680.h = a680Var;
            } catch (Throwable th) {
                dhn.a(a680.class, th);
            }
        }
        if (dhn.a.contains(a680.class)) {
            return null;
        }
        try {
            return a680.h;
        } catch (Throwable th2) {
            dhn.a(a680.class, th2);
            return null;
        }
    }

    public static String f() {
        return UUID.randomUUID().toString();
    }

    public static f2b g(long j) {
        return new f2b(j, 5);
    }

    public static f2b h(long j) {
        return new f2b(j, 5);
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
        return bundle;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 6:
                spq0 spq0Var = (spq0) obj;
                return spq0Var.c() ? spq0Var : hqq0.L((List) obj2);
            default:
                Boolean bool = (Boolean) obj;
                jdu0 jdu0Var = (jdu0) obj2;
                Set set = jdu0Var.s;
                List list = jdu0Var.r;
                return new sm81(list.contains("plus") && !set.contains("plus"), false, list.contains("minus") && !set.contains("minus"), bool.booleanValue());
        }
    }

    public Object convert(int i) {
        xls0 xls0VarA = xls0.a(i);
        return xls0VarA == null ? xls0.h : xls0VarA;
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 14:
                return First.b((cib0) obj);
            case 21:
                return First.b((fuy0) obj);
            case 26:
                occ1 occ1Var = (occ1) obj;
                return First.c(occ1Var, Collections.singleton(new ecc1(occ1Var.a, occ1Var.b, occ1Var.e, occ1Var.f)));
            default:
                ecs0 ecs0Var = (ecs0) obj;
                Duration duration = ove0.a;
                ecs0Var.toString();
                return First.b(ecs0Var);
        }
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return ((unb1Var instanceof jmb1) && ((jmb1) unb1Var).b.y == ktl.b) ? eu11.a : gu11.a;
        }
        if (fe00Var.equals(ce00.a)) {
            return iu11.a;
        }
        return null;
    }

    public boolean s(Uri uri) {
        return ras0.a(uri) || nhc1.Y(uri.toString(), "https://play.google.com/store/account/subscriptions", true);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((Set) ((mmr0) obj).b).contains("social_radar");
            default:
                return ((cxc0) obj).f.x.a(s211.class) != null;
        }
    }

    public void c() {
    }

    public Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        return arrayList;
    }
}
