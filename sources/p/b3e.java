package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.spotify.connect.castbasic.config.CastOptionsProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b3e {
    public static final pue0 l = new pue0("CastContext", null);
    public static final Object m = new Object();
    public static volatile b3e n;
    public final Context a;
    public final wf61 b;
    public final jbn1 c;
    public final p3e d;
    public final pxo1 e;
    public final son1 f;
    public final krn1 g;
    public final List h;
    public final ytn1 i;
    public final ppn1 j;
    public q3e k;

    /* JADX WARN: Type inference failed for: r11v5, types: [android.os.IInterface, p.son1] */
    public b3e(Context context, p3e p3eVar, List list, fsn1 fsn1Var, pxo1 pxo1Var) throws ModuleUnavailableException {
        rjn1 rjn1Var;
        pon1 pon1Var;
        this.a = context;
        this.d = p3eVar;
        this.e = pxo1Var;
        this.h = list;
        this.g = new krn1(context);
        this.i = fsn1Var.o;
        if (TextUtils.isEmpty(p3eVar.a)) {
            this.j = null;
        } else {
            this.j = new ppn1(context, p3eVar, fsn1Var);
        }
        HashMap map = new HashMap();
        ppn1 ppn1Var = this.j;
        if (ppn1Var != null) {
            map.put(ppn1Var.b, ppn1Var.c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ppn1 ppn1Var2 = (ppn1) it.next();
                zod.t(ppn1Var2, "Additional SessionProvider must not be null.");
                String str = ppn1Var2.b;
                zod.p(str, "Category for SessionProvider must not be null or empty string.");
                zod.j("SessionProvider for category " + str + " already added", !map.containsKey(str));
                map.put(str, ppn1Var2.c);
            }
        }
        p3eVar.P0 = new uso1(1);
        try {
            ggn1 ggn1VarA = xon1.a(context, p3eVar, fsn1Var, map);
            try {
                afn1 afn1Var = (afn1) ggn1VarA;
                Parcel parcelB1 = afn1Var.b1(6, afn1Var.a1());
                IBinder strongBinder = parcelB1.readStrongBinder();
                if (strongBinder == null) {
                    rjn1Var = null;
                } else {
                    Object objQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    rjn1Var = objQueryLocalInterface instanceof rjn1 ? (rjn1) objQueryLocalInterface : new rjn1(strongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", (byte) 1);
                }
                parcelB1.recycle();
                this.c = new jbn1(rjn1Var);
                try {
                    afn1 afn1Var2 = (afn1) ggn1VarA;
                    Parcel parcelB2 = afn1Var2.b1(5, afn1Var2.a1());
                    IBinder strongBinder2 = parcelB2.readStrongBinder();
                    if (strongBinder2 == null) {
                        pon1Var = null;
                    } else {
                        Object objQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        pon1Var = objQueryLocalInterface2 instanceof pon1 ? (pon1) objQueryLocalInterface2 : new pon1(strongBinder2, "com.google.android.gms.cast.framework.ISessionManager", (byte) 1);
                    }
                    parcelB2.recycle();
                    wf61 wf61Var = new wf61(pon1Var, context);
                    this.b = wf61Var;
                    zod.p("PrecacheManager", "The log tag cannot be null or empty.");
                    ytn1 ytn1Var = this.i;
                    if (ytn1Var != null) {
                        ytn1Var.f = wf61Var;
                        ytn1Var.c.post(new g54(ytn1Var, (byte) 22));
                    }
                    j4o1 j4o1Var = new j4o1(context, voo1.z(Executors.newFixedThreadPool(3)));
                    zod.p("BaseNetUtils", "The log tag cannot be null or empty.");
                    j4o1Var.a();
                    ?? son1Var = new son1();
                    this.f = son1Var;
                    try {
                        afn1 afn1Var3 = (afn1) ggn1VarA;
                        Parcel parcelA1 = afn1Var3.a1();
                        osn1.c(parcelA1, son1Var);
                        afn1Var3.c1(3, parcelA1);
                        son1Var.l.add(this.g.a);
                        if (!Collections.unmodifiableList(p3eVar.Y).isEmpty()) {
                            l.c("Setting Route Discovery for appIds: ".concat(String.valueOf(Collections.unmodifiableList(this.d.Y))), new Object[0]);
                            krn1 krn1Var = this.g;
                            List listUnmodifiableList = Collections.unmodifiableList(this.d.Y);
                            krn1Var.getClass();
                            pue0 pue0Var = krn1.f;
                            int size = listUnmodifiableList.size();
                            pue0Var.a(fd21.h(new StringBuilder(String.valueOf(size).length() + 26), "SetRouteDiscovery for ", size, " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(dio1.G((String) it2.next()));
                            }
                            Map map2 = krn1Var.c;
                            pue0Var.a("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
                            HashMap map3 = new HashMap();
                            synchronized (map2) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        brn1 brn1Var = (brn1) map2.get(dio1.G(str2));
                                        if (brn1Var != null) {
                                            map3.put(str2, brn1Var);
                                        }
                                    }
                                    map2.clear();
                                    map2.putAll(map3);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            pue0Var.a("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
                            LinkedHashSet linkedHashSet2 = krn1Var.d;
                            synchronized (linkedHashSet2) {
                                linkedHashSet2.clear();
                                linkedHashSet2.addAll(linkedHashSet);
                            }
                            krn1Var.m();
                        }
                        pxo1Var.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"}).n(new i2i1(this, (byte) 16));
                        asd1 asd1VarB = asd1.b();
                        asd1VarB.d(new kpo1(pxo1Var, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, (byte) 1));
                        asd1VarB.f(new pl10[]{hm5.h});
                        asd1VarB.e();
                        asd1VarB.g(8427);
                        pxo1Var.e(0, asd1VarB.a()).n(new ssk1(this));
                    } catch (RemoteException e) {
                        k220.p("Failed to call addAppVisibilityListener", e);
                        throw null;
                    }
                } catch (RemoteException e2) {
                    k220.p("Failed to call getSessionManagerImpl", e2);
                    throw null;
                }
            } catch (RemoteException e3) {
                k220.p("Failed to call getDiscoveryManagerImpl", e3);
                throw null;
            }
        } catch (RemoteException e4) {
            k220.p("Failed to call newCastContextImpl", e4);
            throw null;
        }
    }

    public static b3e a(Context context) {
        zod.n("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    CastOptionsProvider castOptionsProviderC = c(applicationContext);
                    p3e castOptions = castOptionsProviderC.getCastOptions(applicationContext);
                    pxo1 pxo1Var = new pxo1(applicationContext);
                    try {
                        n = new b3e(applicationContext, castOptions, castOptionsProviderC.getAdditionalSessionProviders(applicationContext), new fsn1(applicationContext, owh0.d(applicationContext), castOptions, pxo1Var), pxo1Var);
                    } catch (ModuleUnavailableException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return n;
    }

    public static hfp1 b(Context context, Executor executor) {
        zod.n("Must be called from the main thread.");
        if (n != null) {
            return o0c.z(n);
        }
        final Context applicationContext = context.getApplicationContext();
        final CastOptionsProvider castOptionsProviderC = c(applicationContext);
        final p3e castOptions = castOptionsProviderC.getCastOptions(applicationContext);
        final pxo1 pxo1Var = new pxo1(applicationContext);
        final fsn1 fsn1Var = new fsn1(applicationContext, owh0.d(applicationContext), castOptions, pxo1Var);
        return o0c.i(executor, new Callable() { // from class: p.rio1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = applicationContext;
                p3e p3eVar = castOptions;
                CastOptionsProvider castOptionsProvider = castOptionsProviderC;
                fsn1 fsn1Var2 = fsn1Var;
                pxo1 pxo1Var2 = pxo1Var;
                synchronized (b3e.m) {
                    try {
                        if (b3e.n == null) {
                            b3e.n = new b3e(context2, p3eVar, castOptionsProvider.getAdditionalSessionProviders(context2), fsn1Var2, pxo1Var2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return b3e.n;
            }
        });
    }

    public static CastOptionsProvider c(Context context) {
        try {
            o4s o4sVarA = mjm1.a(context);
            Bundle bundle = o4sVarA.a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                l.c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (CastOptionsProvider) Class.forName(string).asSubclass(CastOptionsProvider.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            k220.p("Failed to initialize CastContext.", e);
            return null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            k220.p("Failed to initialize CastContext.", e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            k220.p("Failed to initialize CastContext.", e);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            k220.p("Failed to initialize CastContext.", e);
            return null;
        } catch (NoSuchMethodException e5) {
            e = e5;
            k220.p("Failed to initialize CastContext.", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            k220.p("Failed to initialize CastContext.", e);
            return null;
        } catch (InvocationTargetException e7) {
            e = e7;
            k220.p("Failed to initialize CastContext.", e);
            return null;
        }
    }
}
