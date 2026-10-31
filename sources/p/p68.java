package p;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p68 implements k2i1, Function, t1s0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public p68(wi20 wi20Var) {
        Object obj = new Object();
        this.d = obj;
        this.e = new bsd1();
        this.a = false;
        this.g = new bsd1();
        wi20Var.a();
        Context context = wi20Var.a;
        this.c = wi20Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.b = sharedPreferences;
        Boolean boolValueOf = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        this.f = boolValueOf == null ? c(context) : boolValueOf;
        synchronized (obj) {
            try {
                if (f()) {
                    ((bsd1) this.e).d((Object) null);
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        Dialog dialog;
        Dialog dialog2 = (Dialog) this.g;
        if (dialog2 == null || !dialog2.isShowing() || (dialog = (Dialog) this.g) == null) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    public Object apply(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String strZ;
        boolean z;
        tvv0 tvv0Var;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        mmr0 mmr0Var = (mmr0) obj;
        djw0 djw0Var = (djw0) this.e;
        mzr0 mzr0Var = (mzr0) this.b;
        uov0 uov0Var = (vov0) mmr0Var.a;
        Boolean bool = (Boolean) mmr0Var.b;
        if (uov0Var instanceof uov0) {
            uov0 uov0Var2 = uov0Var;
            String str12 = uov0Var2.a;
            str2 = uov0Var2.b;
            str = str12;
        } else {
            str = "";
            str2 = str;
        }
        wdm wdmVar = (wdm) mzr0Var.g;
        String str13 = (String) wdmVar.e;
        if (str13 == null) {
            str13 = (String) wdmVar.d;
        }
        String str14 = str13;
        String str15 = Build.MANUFACTURER;
        String str16 = (String) wdmVar.Z;
        if (!u890.j(str16, "com.android.vending")) {
            if (u890.j(str16, "com.amazon.venezia")) {
                str4 = "amazon";
            } else {
                str3 = null;
            }
            if (bool.booleanValue()) {
                strZ = null;
            } else {
                strZ = nyn1.Z(new upc(false, false, -1, -1, false, false, false, nyn1.S(604800L), -1, true, false, false, (String) null));
            }
            z = this.a;
            if (z) {
                tvv0Var = (tvv0) mzr0Var.c;
            } else {
                tvv0Var = (tvv0) mzr0Var.b;
            }
            tvv0 tvv0Var2 = tvv0Var;
            String str17 = (String) this.c;
            str5 = (String) this.d;
            if (str5 == null) {
                str5 = (String) wdmVar.b;
            }
            String str18 = (String) wdmVar.c;
            String str19 = (String) wdmVar.g;
            String str20 = (String) wdmVar.h;
            if (djw0Var != null || (str6 = djw0Var.a) == null) {
                str6 = (String) wdmVar.i;
            }
            String str21 = str6;
            String strE = f4i1.e((String) this.f, z ? "_early" : "");
            if (djw0Var != null) {
                str7 = "scheduler-api";
            } else {
                str7 = null;
            }
            if (djw0Var != null || (str11 = djw0Var.c) == null) {
                str8 = str15;
            } else {
                str8 = str11;
            }
            if (djw0Var != null || (str9 = djw0Var.d) == null) {
                str9 = (String) this.g;
            }
            String str22 = str9;
            if (djw0Var != null || (str10 = djw0Var.e) == null) {
                str10 = (String) wdmVar.t;
            }
            return tvv0Var2.a(str17, str5, str18, str, str2, str14, str19, str20, str21, strE, str7, "false", str8, str22, str10, (String) wdmVar.X, (String) wdmVar.Y, str3, strZ);
        }
        str4 = "google";
        str3 = str4;
        if (bool.booleanValue()) {
            strZ = nyn1.Z(new upc(false, false, -1, -1, false, false, false, nyn1.S(604800L), -1, true, false, false, (String) null));
        } else {
            strZ = null;
        }
        z = this.a;
        if (z) {
            tvv0Var = (tvv0) mzr0Var.c;
        } else {
            tvv0Var = (tvv0) mzr0Var.b;
        }
        tvv0 tvv0Var3 = tvv0Var;
        String str110 = (String) this.c;
        str5 = (String) this.d;
        if (str5 == null) {
            str5 = (String) wdmVar.b;
        }
        String str111 = (String) wdmVar.c;
        String str112 = (String) wdmVar.g;
        String str23 = (String) wdmVar.h;
        if (djw0Var != null) {
            str6 = (String) wdmVar.i;
        } else {
            str6 = (String) wdmVar.i;
        }
        String str24 = str6;
        String strE2 = f4i1.e((String) this.f, z ? "_early" : "");
        if (djw0Var != null) {
            str7 = "scheduler-api";
        } else {
            str7 = null;
        }
        if (djw0Var != null) {
            str8 = str15;
        } else {
            str8 = str15;
        }
        if (djw0Var != null) {
            str9 = (String) this.g;
        } else {
            str9 = (String) this.g;
        }
        String str25 = str9;
        if (djw0Var != null) {
            str10 = (String) wdmVar.t;
        } else {
            str10 = (String) wdmVar.t;
        }
        return tvv0Var3.a(str110, str5, str111, str, str2, str14, str112, str23, str24, strE2, str7, "false", str8, str25, str10, (String) wdmVar.X, (String) wdmVar.Y, str3, strZ);
    }

    public void b(Uri uri) {
        a();
        Dialog dialog = new Dialog((Context) this.e, 2132018118);
        dialog.setContentView(2131625158);
        dialog.setCancelable(false);
        this.g = dialog;
        dialog.show();
        g341 g341Var = (g341) this.b;
        ((CompositeDisposable) this.f).b(g341Var.a().flatMap(new e341(g341Var, uri, (byte) 0)).onErrorReturn(new e810(uri, (byte) 0)).subscribe(new lgr(this, uri, (byte) 18), new cfs(this, (byte) 27)));
    }

    public Boolean c(Context context) {
        Boolean boolValueOf;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (boolValueOf == null) {
            return null;
        }
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    public mr20 d() {
        return h4p1.g(new q721(this, (lnm) null, (byte) 4));
    }

    public void e() {
        n57.e("Partner Integration is pre-installed on Samsung devices.");
    }

    public synchronized boolean f() {
        boolean zG;
        Boolean bool = (Boolean) this.f;
        if (bool != null) {
            zG = bool.booleanValue();
        } else {
            try {
                zG = ((wi20) this.c).g();
            } catch (IllegalStateException unused) {
                zG = false;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return zG;
    }

    public void g(tv80 tv80Var) {
        this.a = true;
        fn31.T(smo1.e(flo1.l(op71.f(), igu.b)), (o8n) null, 0, new n641(this, tv80Var, (lnm) null, (byte) 1), 3);
    }

    public synchronized void h(Boolean bool) {
        Boolean boolC;
        if (bool != null) {
            boolC = bool;
        } else {
            wi20 wi20Var = (wi20) this.c;
            wi20Var.a();
            boolC = c(wi20Var.a);
        }
        this.f = boolC;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.b).edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
        synchronized (this.d) {
            try {
                boolean zF = f();
                boolean z = this.a;
                if (zF) {
                    if (!z) {
                        ((bsd1) this.e).d((Object) null);
                        this.a = true;
                    }
                } else if (z) {
                    this.e = new bsd1();
                    this.a = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r6 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.h841
            if (r0 == 0) goto L13
            r0 = r6
            p.h841 r0 = (p.h841) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.h841 r0 = new p.h841
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            p.hm5.M(r6)
            goto L74
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r2
        L2f:
            p.hm5.M(r6)
            return r6
        L33:
            p.hm5.M(r6)
            boolean r6 = r5.a
            p.d9n r1 = p.d9n.a
            if (r6 == 0) goto L56
            java.lang.Object r5 = r5.d
            p.goq r5 = (p.goq) r5
            p.hxn r6 = new p.hxn
            r3 = 13
            r6.<init>(r5, r2, r3)
            p.m441 r5 = new p.m441
            r5.<init>(r6)
            r0.c = r4
            java.lang.Object r5 = p.b5p1.i(r5, r0)
            if (r5 != r1) goto L55
            goto L73
        L55:
            return r5
        L56:
            java.lang.Object r5 = r5.c
            p.g931 r5 = (p.g931) r5
            p.nnw r6 = new p.nnw
            r6.<init>(r5, r3)
            io.reactivex.rxjava3.core.Single r6 = io.reactivex.rxjava3.core.Single.defer(r6)
            java.lang.Object r5 = r5.d
            io.reactivex.rxjava3.core.Scheduler r5 = (io.reactivex.rxjava3.core.Scheduler) r5
            io.reactivex.rxjava3.core.Single r5 = r6.subscribeOn(r5)
            r0.c = r3
            java.lang.Object r6 = p.fc11.j(r5, r0)
            if (r6 != r1) goto L74
        L73:
            return r1
        L74:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p68.i(p.onm):java.lang.Object");
    }

    public mr20 k() {
        return new huz(Boolean.valueOf(((g741) this.e).b()), (byte) 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object l(onm onmVar) {
        i841 i841Var;
        gj5 gj5Var = (gj5) this.b;
        if (onmVar instanceof i841) {
            i841Var = (i841) onmVar;
            int i = i841Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i841Var.c = i - Integer.MIN_VALUE;
            } else {
                i841Var = new i841(this, onmVar);
            }
        } else {
            i841Var = new i841(this, onmVar);
        }
        Object obj = i841Var.a;
        int i2 = i841Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (!this.a) {
                if (gj5Var.e0().U()) {
                    return Boolean.FALSE;
                }
                int iA = ((s741) this.e).a();
                z641 z641Var = new z641();
                Bundle bundle = new Bundle();
                bundle.putInt("times_dialog_shown", iA);
                z641Var.T0(bundle);
                th30 th30VarE0 = gj5Var.e0();
                dwb dwbVarG = th30VarE0.G("SamsungAccountLinkingBottomSheetDialog");
                dwb dwbVar = dwbVarG instanceof dwb ? dwbVarG : null;
                if (dwbVar != null) {
                    dwbVar.Y0();
                }
                z641Var.g1(th30VarE0, "SamsungAccountLinkingBottomSheetDialog");
                t741 t741Var = (t741) this.f;
                s741 s741Var = t741Var.a;
                int iA2 = s741Var.a();
                if (iA2 == 0) {
                    long jB = t741Var.b.b();
                    if (!s741Var.c.c()) {
                        jah.g("setup needs to be called first");
                        return null;
                    }
                    hma1 hma1VarEdit = ((dma1) s741Var.c.b()).edit();
                    hma1VarEdit.c(s741.d, jB);
                    hma1VarEdit.g();
                }
                int i3 = iA2 + 1;
                if (!s741Var.c.c()) {
                    jah.g("setup needs to be called first");
                    return null;
                }
                hma1 hma1VarEdit2 = ((dma1) s741Var.c.b()).edit();
                hma1VarEdit2.b(s741.e, i3);
                hma1VarEdit2.g();
                return Boolean.TRUE;
            }
            q741 q741Var = (q741) this.g;
            i841Var.c = 1;
            Object objA = q741Var.a(f841.a, i841Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return Boolean.TRUE;
    }

    public void m(String str, tv80 tv80Var) {
        eoc0 eoc0Var = new eoc0(str, ((c4n0) this.b).getViewUri(), mno1.k0);
        if (this.a) {
            ((yhm) this.e).a(eoc0Var, tv80Var);
            return;
        }
        mfm mfmVar = (mfm) ((idd1) this.g).getValue();
        Observable observableA = ((ywc0) this.d).a(eoc0Var);
        bjm bjmVar = new bjm(6, str, (String) null);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVar, observableA, yon1.a1(), bjmVar, tv80Var, 16);
    }

    public hfp1 n() {
        hfp1 hfp1Var;
        synchronized (this.d) {
            hfp1Var = ((bsd1) this.e).a;
        }
        return hfp1Var;
    }

    public /* synthetic */ p68(Object obj, boolean z, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.b = obj;
        this.a = z;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public p68(uvy uvyVar, hre1 hre1Var, boolean z, q8n q8nVar, Flowable flowable, yqg yqgVar, xd0 xd0Var) {
        this.b = uvyVar;
        this.c = hre1Var;
        this.a = z;
        this.d = q8nVar;
        this.e = flowable;
        this.f = yqgVar;
        this.g = xd0Var;
    }

    public p68(g341 g341Var, lan1 lan1Var, fyf fyfVar, iac0 iac0Var, Context context, boolean z) {
        this.b = g341Var;
        this.c = lan1Var;
        this.d = fyfVar;
        this.e = context;
        this.a = z;
        this.f = new CompositeDisposable();
        iac0Var.getLifecycle().a(new ct6(this, (byte) 6));
    }

    public p68(lik1 lik1Var, o241 o241Var, a6z a6zVar, dlg1 dlg1Var, i4q i4qVar, boolean z, waz0 waz0Var) {
        this.b = lik1Var;
        this.c = a6zVar;
        this.d = dlg1Var;
        this.e = i4qVar;
        this.a = z;
        this.f = waz0Var;
        this.g = ((p241) o241Var).a.map(rh20.c1).distinctUntilChanged();
    }

    public p68(dg30 dg30Var, xov0 xov0Var, lvc lvcVar, g741 g741Var, a741 a741Var, n2s0 n2s0Var) {
        this.b = dg30Var;
        this.c = xov0Var;
        this.d = lvcVar;
        this.e = g741Var;
        this.f = a741Var;
        this.g = n2s0Var;
    }

    public p68(c4n0 c4n0Var, js6 js6Var, ywc0 ywc0Var, i4q i4qVar, yhm yhmVar, em6 em6Var, boolean z) {
        this.b = c4n0Var;
        this.c = js6Var;
        this.d = ywc0Var;
        this.e = yhmVar;
        this.f = em6Var;
        this.a = z;
        this.g = new idd1(new g1x0(i4qVar, this, (byte) 4));
    }

    public /* synthetic */ p68(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.a = z;
    }

    public p68(yix0 yix0Var, yll yllVar, q8n q8nVar, q8n q8nVar2, mr20 mr20Var, n6r0 n6r0Var, boolean z) {
        this.b = yix0Var;
        this.c = yllVar;
        this.d = mr20Var;
        this.e = n6r0Var;
        this.a = z;
        this.f = q8nVar;
        this.g = q8nVar2;
    }
}
