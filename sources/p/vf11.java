package p;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class vf11 {
    public static final Logger a = Logger.getLogger(vf11.class.getName());
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e;

    static {
        new ConcurrentHashMap();
        e = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Class cls, boolean z) {
        ConcurrentHashMap concurrentHashMap = b;
        if (concurrentHashMap.containsKey(str)) {
            uf11 uf11Var = (uf11) concurrentHashMap.get(str);
            if (uf11Var.a.getClass().equals(cls)) {
                if (z && !((Boolean) d.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
                return;
            }
            a.warning("Attempted overwrite of a registered key manager for key type " + str);
            throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + uf11Var.a.getClass().getName() + ", cannot be re-registered with " + cls.getName());
        }
    }

    public static synchronized uf11 b(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = b;
        if (!concurrentHashMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (uf11) concurrentHashMap.get(str);
    }

    public static Object c(String str, byte[] bArr) {
        ghc ghcVar = ohc.b;
        return d(str, ohc.d(0, bArr, bArr.length), s82.class);
    }

    public static Object d(String str, ohc ohcVar, Class cls) throws GeneralSecurityException {
        o5 o5Var = b(str).a;
        if (o5Var.N().contains(cls)) {
            try {
                return new v6a0(o5Var, cls).q(ohcVar);
            } catch (IllegalArgumentException e2) {
                throw new GeneralSecurityException("Primitive type not supported", e2);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(o5Var.getClass());
        sb.append(", supported primitives: ");
        Set<Class> setN = o5Var.N();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setN) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static synchronized bpa0 e(tpa0 tpa0Var) {
        v6a0 v6a0Var;
        o5 o5Var = b(tpa0Var.o()).a;
        v6a0Var = new v6a0(o5Var, o5Var.p());
        if (!((Boolean) d.get(tpa0Var.o())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + tpa0Var.o());
        }
        return v6a0Var.t(tpa0Var.p());
    }

    public static synchronized void f(o5 o5Var, boolean z) {
        try {
            String strS = o5Var.s();
            a(strS, o5Var.getClass(), z);
            ConcurrentHashMap concurrentHashMap = b;
            if (!concurrentHashMap.containsKey(strS)) {
                concurrentHashMap.put(strS, new uf11(o5Var));
                c.put(strS, new xgc((byte) 22));
            }
            d.put(strS, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void g(unw0 unw0Var) {
        try {
            Class clsC = unw0Var.c();
            ConcurrentHashMap concurrentHashMap = e;
            if (concurrentHashMap.containsKey(clsC)) {
                unw0 unw0Var2 = (unw0) concurrentHashMap.get(clsC);
                if (!unw0Var.getClass().equals(unw0Var2.getClass())) {
                    a.warning("Attempted overwrite of a registered SetWrapper for type " + clsC);
                    throw new GeneralSecurityException("SetWrapper for primitive (" + clsC.getName() + ") is already registered to be " + unw0Var2.getClass().getName() + ", cannot be re-registered with " + unw0Var.getClass().getName());
                }
            }
            concurrentHashMap.put(clsC, unw0Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
