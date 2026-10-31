package p;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cyn1 implements wax {
    public static final ehn1 c = new ehn1((byte) 3);
    public final HashMap a;
    public final HashMap b;

    public cyn1(byte b) {
        switch (b) {
            case 1:
                this.a = new HashMap();
                this.b = new HashMap();
                break;
            default:
                this.a = new HashMap();
                this.b = new HashMap();
                break;
        }
    }

    public void a(sfp1 sfp1Var) throws GeneralSecurityException {
        wfp1 wfp1Var = new wfp1(sfp1Var.a, sfp1Var.b);
        HashMap map = this.a;
        if (!map.containsKey(wfp1Var)) {
            map.put(wfp1Var, sfp1Var);
            return;
        }
        sfp1 sfp1Var2 = (sfp1) map.get(wfp1Var);
        if (!sfp1Var2.equals(sfp1Var) || sfp1Var != sfp1Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(wfp1Var.toString()));
        }
    }

    public /* bridge */ /* synthetic */ wax c(Class cls, ifp0 ifp0Var) {
        this.a.put(cls, ifp0Var);
        this.b.remove(cls);
        return this;
    }

    public /* synthetic */ cyn1(xfp1 xfp1Var) {
        this.a = new HashMap(xfp1Var.a);
        this.b = new HashMap(xfp1Var.b);
    }
}
