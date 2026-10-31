package p;

import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ypa0 {
    public final Class a;

    public ypa0(Class cls) {
        this.a = cls;
    }

    public Object a(u8 u8Var) {
        vl60 vl60Var = (vl60) u8Var;
        bu50 bu50VarN = vl60Var.p().n();
        SecretKeySpec secretKeySpec = new SecretKeySpec(vl60Var.o().i(), "HMAC");
        int iO = vl60Var.p().o();
        int iOrdinal = bu50VarN.ordinal();
        if (iOrdinal == 1) {
            return new xmw0(new wmw0("HMACSHA1", secretKeySpec), iO);
        }
        if (iOrdinal == 3) {
            return new xmw0(new wmw0("HMACSHA256", secretKeySpec), iO);
        }
        if (iOrdinal == 4) {
            return new xmw0(new wmw0("HMACSHA512", secretKeySpec), iO);
        }
        k220.r("unknown hash");
        return null;
    }
}
