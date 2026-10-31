package com.spotify.initialization.app;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.spotify.mobius.MobiusPlugins;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import p.bsw0;
import p.c2u;
import p.c921;
import p.csd1;
import p.e6p1;
import p.eg;
import p.gex0;
import p.ghp0;
import p.hhp0;
import p.hwb;
import p.ilo1;
import p.j1e1;
import p.j3v;
import p.l6b1;
import p.laz;
import p.lnm;
import p.mjv;
import p.mqo1;
import p.n3s;
import p.n57;
import p.nc80;
import p.o8n;
import p.p2p;
import p.q26;
import p.q8n;
import p.smo1;
import p.tif1;
import p.u890;
import p.w0h1;
import p.wma1;
import p.x8p1;
import p.xh7;
import p.yiq0;
import p.ym41;
import p.ynb0;
import p.z77;
import p.z8n;
import p.zrw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/initialization/app/EarlyInitializationProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "src_main_java_com_spotify_initialization_app-runtime"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class EarlyInitializationProvider extends ContentProvider {
    public p2p a;
    public final tif1 b = gex0.f();
    public ynb0 c;
    public q8n d;
    public p2p e;
    public p2p f;

    public final void a() {
        p2p p2pVar = this.e;
        if (p2pVar == null) {
            u890.C("runtimeInit");
            throw null;
        }
        l6b1 l6b1Var = (l6b1) p2pVar.get();
        wma1 wma1VarS = x8p1.s("initLogger.initializeLogger");
        try {
            l6b1Var.a.i();
            wma1VarS.a(null);
            wma1 wma1VarS2 = x8p1.s("initAssertions.initializeAssertions");
            try {
                n57.w(new laz(l6b1Var.c.a, (byte) 29));
                wma1VarS2.a(null);
                wma1 wma1VarS3 = x8p1.s("initCrashListeners.initializeCrashListeners");
                try {
                    l6b1Var.b.H();
                    wma1VarS3.a(null);
                    wma1 wma1VarS4 = x8p1.s("InitRxJava.init");
                    try {
                        nc80.a();
                        wma1VarS4.a(null);
                        q26 q26VarE = q26.e();
                        p2p p2pVar2 = this.f;
                        if (p2pVar2 != null) {
                            q26VarE.a = (csd1) p2pVar2.get();
                        } else {
                            u890.C("dispatcherTaskExecutor");
                            throw null;
                        }
                    } catch (Throwable th) {
                        wma1VarS4.a(null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    wma1VarS3.a(null);
                    throw th2;
                }
            } catch (Throwable th3) {
                wma1VarS2.a(null);
                throw th3;
            }
        } catch (Throwable th4) {
            wma1VarS.a(null);
            throw th4;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        tif1 tif1Var = this.b;
        Context context = getContext();
        if (context == null) {
            eg.m("Context cannot be null");
            return false;
        }
        try {
            tif1Var.e(2, "early_init_provider_oncreate", "cst");
            zrw0 zrw0Var = bsw0.a;
            bsw0.a(context, c2u.a());
            xh7 xh7Var = xh7.d;
            xh7 xh7VarP = mqo1.p();
            xh7VarP.getClass();
            x8p1.t(23, "AsyncFirebaseInitializer", new z77(xh7VarP, context, (byte) 2));
            e6p1.l();
            hhp0 hhp0Var = hhp0.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.spotify.oops", 0);
            hhp0.b = sharedPreferences;
            yiq0.a(sharedPreferences != null ? sharedPreferences.getInt("AdsFetchOopsSamplingRateBps", 10) : 10);
            yiq0.b(hhp0.b);
            new Handler(Looper.getMainLooper()).post(ghp0.b);
            try {
                tif1Var.e(2, "early_init_provider_oncreate_inject", "cst");
                j1e1.t(this);
                tif1Var.f("early_init_provider_oncreate_inject", "cst");
                try {
                    tif1Var.e(2, "early_init_provider_oncreate_init_runtime", "cst");
                    a();
                    tif1Var.f("early_init_provider_oncreate_init_runtime", "cst");
                    AtomicInteger atomicInteger = ym41.c;
                    q8n q8nVar = this.d;
                    if (q8nVar == null) {
                        u890.C("defaultDispatcher");
                        throw null;
                    }
                    hwb.z(w0h1.m(q8nVar));
                    MobiusPlugins.b = new mjv(this, (byte) 1);
                    MobiusPlugins.a = new j3v(this, (byte) 2);
                    q8n q8nVar2 = this.d;
                    if (q8nVar2 == null) {
                        u890.C("defaultDispatcher");
                        throw null;
                    }
                    c921.y(smo1.e(ilo1.B(q8nVar2, new z8n("ScopeBootstrap"))), (o8n) null, 0, new n3s(this, (lnm) null, (byte) 9), 3);
                    tif1Var.f("early_init_provider_oncreate", "cst");
                    return true;
                } catch (Throwable th) {
                    tif1Var.f("early_init_provider_oncreate_init_runtime", "cst");
                    throw th;
                }
            } catch (Throwable th2) {
                tif1Var.f("early_init_provider_oncreate_inject", "cst");
                throw th2;
            }
        } catch (Throwable th3) {
            tif1Var.f("early_init_provider_oncreate", "cst");
            throw th3;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
