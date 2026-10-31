package p;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oep1 {
    public static final oep1 b = new oep1();
    public final AtomicReference a = new AtomicReference(new xfp1(new cyn1((byte) 1)));

    public final synchronized void a(sfp1 sfp1Var) {
        AtomicReference atomicReference = this.a;
        cyn1 cyn1Var = new cyn1((xfp1) atomicReference.get());
        cyn1Var.a(sfp1Var);
        atomicReference.set(new xfp1(cyn1Var));
    }

    public final synchronized void b(yfp1 yfp1Var) {
        AtomicReference atomicReference = this.a;
        cyn1 cyn1Var = new cyn1((xfp1) atomicReference.get());
        HashMap map = cyn1Var.b;
        Class clsZza = yfp1Var.zza();
        if (map.containsKey(clsZza)) {
            yfp1 yfp1Var2 = (yfp1) map.get(clsZza);
            if (!yfp1Var2.equals(yfp1Var) || !yfp1Var.equals(yfp1Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
            }
        } else {
            map.put(clsZza, yfp1Var);
        }
        atomicReference.set(new xfp1(cyn1Var));
    }
}
