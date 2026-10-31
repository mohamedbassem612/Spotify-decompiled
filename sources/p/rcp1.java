package p;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rcp1 {
    public static final Logger c = Logger.getLogger(rcp1.class.getName());
    public static final rcp1 d = new rcp1();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final fdp1 a(Class cls, String str) throws GeneralSecurityException {
        fdp1 fdp1Var;
        synchronized (this) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (!concurrentHashMap.containsKey(str)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
                sb.append("No key manager found for key type ");
                sb.append(str);
                sb.append(", see https://developers.google.com/tink/faq/registration_errors");
                throw new GeneralSecurityException(sb.toString());
            }
            fdp1Var = (fdp1) concurrentHashMap.get(str);
        }
        if (fdp1Var.b.equals(cls)) {
            return fdp1Var;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(fdp1Var.getClass());
        String string = fdp1Var.b.toString();
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + name.length() + 53 + 23 + string.length());
        bb00.j(sb2, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(l1d.n(", which only supports: ", string, sb2));
    }

    public final synchronized void b(fdp1 fdp1Var, int i, boolean z) {
        if (!boo1.D(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        c(fdp1Var, z);
    }

    public final synchronized void c(fdp1 fdp1Var, boolean z) {
        try {
            String str = fdp1Var.a;
            if (z) {
                ConcurrentHashMap concurrentHashMap = this.b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.a;
            fdp1 fdp1Var2 = (fdp1) concurrentHashMap2.get(str);
            if (fdp1Var2 != null && !fdp1Var2.getClass().equals(fdp1Var.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + fdp1Var2.getClass().getName() + ", cannot be re-registered with " + fdp1Var.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, fdp1Var);
            this.b.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }
}
