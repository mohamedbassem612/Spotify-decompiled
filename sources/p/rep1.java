package p;

import com.google.android.recaptcha.internal.zzxb;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rep1 {
    public static final rep1 b;
    public final AtomicReference a = new AtomicReference(new pgp1(new cik1((byte) 21)));

    static {
        try {
            rep1 rep1Var = new rep1();
            rep1Var.a(new ycp1(jdp1.class, yxm1.c));
            rep1Var.c(new wep1(ldp1.class));
            b = rep1Var;
        } catch (Exception e) {
            throw new zzxb(e);
        }
    }

    public final synchronized void a(ycp1 ycp1Var) {
        AtomicReference atomicReference = this.a;
        cik1 cik1Var = new cik1((pgp1) atomicReference.get());
        HashMap map = (HashMap) cik1Var.b;
        boolean zContainsKey = map.containsKey(ycp1Var.a);
        Class cls = ycp1Var.a;
        if (zContainsKey) {
            ycp1 ycp1Var2 = (ycp1) map.get(cls);
            if (!ycp1Var2.equals(ycp1Var) || ycp1Var != ycp1Var2) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(cls.toString()));
            }
        } else {
            map.put(cls, ycp1Var);
        }
        atomicReference.set(new pgp1(cik1Var));
    }

    public final synchronized void b(scp1 scp1Var) {
        AtomicReference atomicReference = this.a;
        cik1 cik1Var = new cik1((pgp1) atomicReference.get());
        HashMap map = (HashMap) cik1Var.c;
        String str = scp1Var.a;
        if (map.containsKey(str)) {
            scp1 scp1Var2 = (scp1) map.get(str);
            if (!scp1Var2.equals(scp1Var) || scp1Var != scp1Var2) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, scp1Var);
        }
        atomicReference.set(new pgp1(cik1Var));
    }

    public final synchronized void c(wep1 wep1Var) {
        AtomicReference atomicReference = this.a;
        cik1 cik1Var = new cik1((pgp1) atomicReference.get());
        HashMap map = (HashMap) cik1Var.d;
        boolean zContainsKey = map.containsKey(wep1Var.a);
        Class cls = wep1Var.a;
        if (zContainsKey) {
            wep1 wep1Var2 = (wep1) map.get(cls);
            if (!wep1Var2.equals(wep1Var) || wep1Var != wep1Var2) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(cls.toString()));
            }
        } else {
            map.put(cls, wep1Var);
        }
        atomicReference.set(new pgp1(cik1Var));
    }

    public final synchronized void d(uep1 uep1Var) {
        AtomicReference atomicReference = this.a;
        cik1 cik1Var = new cik1((pgp1) atomicReference.get());
        HashMap map = (HashMap) cik1Var.e;
        String str = uep1Var.a;
        if (map.containsKey(str)) {
            uep1 uep1Var2 = (uep1) map.get(str);
            if (!uep1Var2.equals(uep1Var) || uep1Var != uep1Var2) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, uep1Var);
        }
        atomicReference.set(new pgp1(cik1Var));
    }

    public final pno1 e(kap1 kap1Var, a2x0 a2x0Var) {
        return ((pgp1) this.a.get()).a(kap1Var, a2x0Var);
    }
}
