package p;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class n4k implements Function0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ n4k(byte b) {
        this.a = b;
    }

    public final Object invoke() {
        Class<?> returnType;
        switch (this.a) {
            case 0:
                t4k.b("LocalLayoutDirection");
                throw null;
            case 1:
                t4k.b("LocalProvidableLocaleList");
                throw null;
            case 2:
            case 3:
                return null;
            case 4:
                t4k.b("LocalTextToolbar");
                throw null;
            case 5:
                return Boolean.TRUE;
            case 6:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 7:
                try {
                    String[] strArr = sk30.b;
                    Method methodL = m4c.l();
                    if (methodL == null || (returnType = methodL.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 8:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 9:
                kiv kivVar = da80.a;
                return jtr.b;
            case 10:
                return null;
            case 11:
                return new p3v(48.0f);
            case 12:
                return new hmb0(3);
            case 13:
                return gi7.a;
            case 14:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 15:
                kiv kivVar2 = kge0.a;
                return y580.d1;
            case 16:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 17:
                return Boolean.FALSE;
            case 18:
                yj20.b();
                return jnm0.a;
            case 19:
                return new fxq0();
            case 20:
                return null;
            case 21:
                return new vh31();
            case 22:
            case 23:
                return null;
            case 24:
                return ila0.F(z561.k0(z561.Q(lf51.f())));
            case 25:
                return ila0.F(z561.k0(z561.Q(lf51.o())));
            case 26:
                return new mx61(nw61.a, nw61.b, nw61.c, nw61.d, nw61.f);
            case 27:
                return s2h1.a;
            case 28:
                return gus.a();
            default:
                lee1 lee1VarD = r2h1.d();
                lee1 lee1VarE = r2h1.e();
                lee1 lee1VarF = r2h1.f();
                lee1 lee1VarG = r2h1.g();
                lee1 lee1VarH = r2h1.h();
                lee1 lee1VarI = r2h1.i();
                lee1 lee1VarM = r2h1.m();
                lee1 lee1VarN = r2h1.n();
                lee1 lee1VarO = r2h1.o();
                lee1 lee1VarA = r2h1.a();
                lee1 lee1VarB = r2h1.b();
                lee1 lee1VarC = r2h1.c();
                lee1 lee1VarJ = r2h1.j();
                lee1 lee1VarK = r2h1.k();
                lee1 lee1VarL = r2h1.l();
                return new k2h1(lee1VarD, lee1VarE, lee1VarF, lee1VarG, lee1VarH, lee1VarI, lee1VarM, lee1VarN, lee1VarO, lee1VarA, lee1VarB, lee1VarC, lee1VarJ, lee1VarK, lee1VarL, lee1VarD, lee1VarE, lee1VarF, lee1VarG, lee1VarH, lee1VarI, lee1VarM, lee1VarN, lee1VarO, lee1VarA, lee1VarB, lee1VarC, lee1VarJ, lee1VarK, lee1VarL);
        }
    }
}
