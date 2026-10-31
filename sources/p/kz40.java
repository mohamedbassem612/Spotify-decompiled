package p;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class kz40 implements mt50 {
    public final Context a;
    public final String b;
    public final cp5 c;
    public final em3 d;
    public final mh5 e;
    public final gi5 f;
    public final Looper g;
    public final int h;
    public final j8n1 i;
    public final s9x0 j;
    public final pz40 k;

    public kz40(Context context, Activity activity, em3 em3Var, mh5 mh5Var, jz40 jz40Var) {
        wxn1 wxn1VarB;
        zod.t(context, "Null context is not permitted.");
        zod.t(em3Var, "Api must not be null.");
        zod.t(jz40Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        zod.t(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String strB = i >= 30 ? x74.B(context) : null;
        this.b = strB;
        this.c = i >= 31 ? new cp5(context.getAttributionSource(), (byte) 23) : null;
        this.d = em3Var;
        this.e = mh5Var;
        this.g = jz40Var.b;
        gi5 gi5Var = new gi5(em3Var, mh5Var, strB);
        this.f = gi5Var;
        this.i = new j8n1(this);
        pz40 pz40VarD = pz40.d(applicationContext);
        this.k = pz40VarD;
        this.h = pz40VarD.h.getAndIncrement();
        this.j = jz40Var.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            if (activity instanceof dg30) {
                dg30 dg30Var = (dg30) activity;
                WeakHashMap weakHashMap = wxn1.G1;
                th30 th30VarE0 = dg30Var.e0();
                WeakHashMap weakHashMap2 = wxn1.G1;
                WeakReference weakReference = (WeakReference) weakHashMap2.get(dg30Var);
                if (weakReference == null || (wxn1VarB = (wxn1) weakReference.get()) == null) {
                    try {
                        wxn1VarB = (wxn1) th30VarE0.G("SLifecycleFragmentImpl");
                        if (wxn1VarB == null || wxn1VarB.Y) {
                            wxn1VarB = new wxn1();
                            nu9 nu9Var = new nu9(th30VarE0);
                            nu9Var.k(0, wxn1VarB, "SLifecycleFragmentImpl", 1);
                            nu9Var.g(true, true);
                        }
                        weakHashMap2.put(dg30Var, new WeakReference(wxn1VarB));
                    } catch (ClassCastException e) {
                        k220.p("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                        throw null;
                    }
                }
            } else {
                wxn1VarB = ran1.b(activity);
            }
            c8n1 c8n1VarL = wxn1VarB.l();
            if (c8n1VarL == null) {
                Object obj = lz40.d;
                c8n1VarL = new c8n1(wxn1VarB, pz40VarD);
            }
            c8n1VarL.f.add(gi5Var);
            pz40VarD.e(c8n1VarL);
        }
        jim0 jim0Var = pz40VarD.N0;
        jim0Var.sendMessage(jim0Var.obtainMessage(7, this));
    }

    public final cce a() {
        cce cceVar = new cce((byte) 14);
        Set set = Collections.EMPTY_SET;
        cceVar.H();
        Context context = this.a;
        cceVar.I(context.getClass().getName());
        cceVar.C(context.getPackageName());
        return cceVar;
    }

    public final hfp1 b(uxy0 uxy0Var) {
        lne lneVar = (lne) uxy0Var.b;
        zod.t(lneVar.a(), "Listener has already been released.");
        bym1 bym1Var = (bym1) uxy0Var.c;
        zod.t(bym1Var.a(), "Listener has already been released.");
        pz40 pz40Var = this.k;
        pz40Var.getClass();
        bsd1 bsd1Var = new bsd1();
        pz40Var.b(bsd1Var, lneVar.e(), this);
        q8n1 q8n1Var = new q8n1(new a9n1(new r8n1(lneVar, bym1Var), bsd1Var), pz40Var.i.get(), this);
        jim0 jim0Var = pz40Var.N0;
        jim0Var.sendMessage(jim0Var.obtainMessage(8, q8n1Var));
        return bsd1Var.a;
    }

    public final hfp1 c(c9d0 c9d0Var, int i) {
        pz40 pz40Var = this.k;
        pz40Var.getClass();
        bsd1 bsd1Var = new bsd1();
        pz40Var.b(bsd1Var, i, this);
        q8n1 q8n1Var = new q8n1(new a9n1(c9d0Var, bsd1Var), pz40Var.i.get(), this);
        jim0 jim0Var = pz40Var.N0;
        jim0Var.sendMessage(jim0Var.obtainMessage(13, q8n1Var));
        return bsd1Var.a;
    }

    public final void d(int i, jan1 jan1Var) {
        boolean z = true;
        if (!jan1Var.l && !((Boolean) BasePendingResult.m.get()).booleanValue()) {
            z = false;
        }
        jan1Var.l = z;
        pz40 pz40Var = this.k;
        pz40Var.getClass();
        q8n1 q8n1Var = new q8n1(new w8n1(i, jan1Var), pz40Var.i.get(), this);
        jim0 jim0Var = pz40Var.N0;
        jim0Var.sendMessage(jim0Var.obtainMessage(4, q8n1Var));
    }

    public final hfp1 e(int i, asd1 asd1Var) {
        bsd1 bsd1Var = new bsd1();
        pz40 pz40Var = this.k;
        pz40Var.getClass();
        pz40Var.b(bsd1Var, asd1Var.j(), this);
        q8n1 q8n1Var = new q8n1(new d9n1(i, asd1Var, bsd1Var, this.j), pz40Var.i.get(), this);
        jim0 jim0Var = pz40Var.N0;
        jim0Var.sendMessage(jim0Var.obtainMessage(4, q8n1Var));
        return bsd1Var.a;
    }
}
