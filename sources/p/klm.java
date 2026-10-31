package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class klm implements hlm {
    public final gp80 a;
    public final Map b;
    public final tif1 c;
    public final LinkedHashMap d;
    public final ReentrantReadWriteLock e;
    public List f;
    public volatile j2h1 g;
    public String h;

    public klm(gp80 gp80Var, Map map, boolean z) {
        tif1 tif1Var = z ? e95.a : xco0.a;
        this.a = gp80Var;
        this.b = map;
        this.c = tif1Var;
        this.d = new LinkedHashMap();
        this.e = new ReentrantReadWriteLock();
        this.f = z6x.a;
        this.g = xmb1.d;
    }

    public static void d(ReentrantReadWriteLock reentrantReadWriteLock, Function0 function0) {
        try {
            reentrantReadWriteLock.readLock().lock();
            function0.invoke();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public final go80 a(String str, Function0 function0) {
        return new go80(new ilm(this, str, function0, (byte) 0));
    }

    public final io80 b(String str, Function0 function0) {
        return new io80(new ilm(this, str, function0, (byte) 1));
    }

    public final dwo c(String str, Function0 function0) {
        String str2;
        if ((this.g instanceof hnb1) || (this.g instanceof gnb1)) {
            String str3 = this.h;
            if (str3 != null) {
                bhn0.f(cy30.p("[Quasar][", str3, "] Service ", str, " created after shutdown invoked"));
                return null;
            }
            u890.C("scopeName");
            throw null;
        }
        l811 l811Var = new l811();
        d(this.e, new jlm((Object) l811Var, (Object) this, (Object) str, (byte) 0));
        if (l811Var.a) {
            String str4 = this.h;
            if (str4 != null) {
                bhn0.f(cy30.p("[Quasar][", str4, "] Service ", str, " already started"));
                return null;
            }
            u890.C("scopeName");
            throw null;
        }
        long jC = this.a.c();
        tif1 tif1Var = this.c;
        String str5 = this.h;
        if (str5 == null) {
            u890.C("scopeName");
            throw null;
        }
        String strF = f4i1.f(str5, "_", str);
        try {
            tif1Var.e(2, strF, "qss");
            Object objInvoke = function0.invoke();
            tif1Var.f(strF, "qss");
            dwo dwoVar = (dwo) objInvoke;
            long jC2 = this.a.c() - jC;
            j2h1 j2h1Var = this.g;
            if (j2h1Var instanceof zlb1) {
                str2 = str;
                ((zlb1) j2h1Var).e.add(new sfh0(jC, jC2, str2, 1));
            } else {
                str2 = str;
            }
            ReentrantReadWriteLock reentrantReadWriteLock = this.e;
            jlm jlmVar = new jlm(this, str2, dwoVar);
            try {
                reentrantReadWriteLock.writeLock().lock();
                jlmVar.invoke();
                reentrantReadWriteLock.writeLock().unlock();
                d(this.e, new j3m(this, str2));
                return dwoVar;
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            tif1Var.f(strF, "qss");
            throw th2;
        }
    }
}
