package p;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class fva implements jly0 {
    public static nwf1 A(ynb0 ynb0Var) {
        return (nwf1) ynb0Var.get();
    }

    public static oj3 B(ghl ghlVar, pj3 pj3Var) {
        return pj3Var.a(ghlVar);
    }

    public static oj3 C(ll3 ll3Var) {
        return ((pj3) ll3Var.a.get()).a((r290) ll3Var.b.get());
    }

    public static h21 a(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 9);
    }

    public static rva b(r7q r7qVar, r7q r7qVar2, kly0 kly0Var, jo80 jo80Var, caq caqVar, caq caqVar2, g5t g5tVar, caq caqVar3) {
        rva rvaVar = new rva();
        rvaVar.a = r7qVar;
        rvaVar.b = r7qVar2;
        rvaVar.c = kly0Var;
        rvaVar.d = jo80Var;
        rvaVar.e = caqVar;
        rvaVar.f = caqVar2;
        rvaVar.g = g5tVar;
        rvaVar.h = caqVar3;
        return rvaVar;
    }

    public static sva c(ynb0 ynb0Var) {
        return new sva(ynb0Var, (byte) 0);
    }

    public static tgb d(caq caqVar) {
        return new tgb(caqVar, (byte) 0);
    }

    public static tgb e(caq caqVar) {
        return new tgb(caqVar, (byte) 1);
    }

    public static tk0 f(caq caqVar) {
        return new tk0(caqVar);
    }

    public static zxa g(ajq0 ajq0Var) {
        Context context = (Context) ajq0Var.a;
        c8o.l(context);
        return new zxa(context, (gya) ajq0Var.b, (eyh0) ajq0Var.c, (o771) ajq0Var.d, (iyu) ajq0Var.e);
    }

    public static j2b h(RetrofitMaker retrofitMaker) {
        return (j2b) retrofitMaker.createWebgateService(j2b.class, "android-blend-endpoints");
    }

    public static hpo0 i(Resources resources) {
        return new hpo0(resources.getString(2131952899), resources.getString(2131952896), resources.getString(2131952842), 1, apo0.a);
    }

    public static r9b j(jly0 jly0Var, u9b u9bVar) {
        jf4 jf4Var = u9bVar.a;
        return (jf4Var.v() && jf4Var.g()) ? (r9b) jly0Var.get() : cxm.a;
    }

    public static hpo0 k(Resources resources) {
        return new hpo0(resources.getString(2131952899), resources.getString(2131952897), resources.getString(2131952895), 1, new bpo0(resources.getString(2131952898), resources.getString(2131952901), resources.getString(2131952900)));
    }

    public static ObservableRefCount l(jfb jfbVar, tfb tfbVar, b54 b54Var) {
        ObservableRefCount observableRefCount = b54Var.a() ? tfbVar.a : jfbVar.d;
        c8o.m(observableRefCount);
        return observableRefCount;
    }

    public static gxn m(RetrofitMaker retrofitMaker) {
        gxn gxnVar = (gxn) retrofitMaker.createWebgateService(gxn.class, "android-artist-creatorartist");
        c8o.m(gxnVar);
        return gxnVar;
    }

    public static bv40 n(a0b a0bVar) {
        a0m a0mVar = new a0m((byte) 7);
        a0mVar.b = iy81.a(new fyo((byte) 4));
        return new bv40(a0mVar, (byte) 29);
    }

    public static hpo0 o(Resources resources) {
        return new hpo0(resources.getString(2131952844), resources.getString(2131952843), resources.getString(2131952842), 2, apo0.a);
    }

    public static r210 p(RetrofitMaker retrofitMaker) {
        return (r210) retrofitMaker.createWebgateService(r210.class, "android-bluetooth-categorizer-impl");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    public static Set q(eb80 eb80Var) {
        Integer numValueOf;
        ActivityInfo activityInfo;
        ArrayList arrayList = new ArrayList();
        for (do5 do5Var : do5.b) {
            if (nyf0.a[do5Var.ordinal()] != 1) {
                eg.o();
                return null;
            }
            Context context = ((no5) eb80Var.b).a;
            try {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 513).activities;
                if (activityInfoArr != null) {
                    int length = activityInfoArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            activityInfo = null;
                            break;
                        }
                        activityInfo = activityInfoArr[i];
                        if (u890.j(activityInfo.name, "com.spotify.music.MainActivity")) {
                            break;
                        }
                        i++;
                    }
                    if (activityInfo != null) {
                        numValueOf = Integer.valueOf(activityInfo.getIconResource());
                    } else {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            mo5 mo5Var = numValueOf != null ? new mo5(do5Var, numValueOf.intValue()) : null;
            if (mo5Var != null) {
                arrayList.add(mo5Var);
            }
        }
        return o7h.p1(arrayList);
    }

    public static vq6 r(kzp kzpVar) {
        return new vq6(kzpVar, (byte) 17);
    }

    public static vq6 s(mzp mzpVar) {
        return new vq6(mzpVar, (byte) 18);
    }

    public static vq6 t(nzp nzpVar) {
        return new vq6(nzpVar, (byte) 20);
    }

    public static vq6 u(ozp ozpVar) {
        return new vq6(ozpVar, (byte) 16);
    }

    public static vq6 v(uzp uzpVar) {
        return new vq6(uzpVar, (byte) 19);
    }

    public static q58 w(t2b t2bVar) {
        return new q58(t2bVar, (byte) 14);
    }

    public static vq6 x(kzp kzpVar) {
        return new vq6(kzpVar, (byte) 22);
    }

    public static vq6 y(nzp nzpVar) {
        return new vq6(nzpVar, (byte) 23);
    }

    public static vq6 z(ozp ozpVar) {
        return new vq6(ozpVar, (byte) 21);
    }
}
