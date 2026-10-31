package p;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gfn1 {
    public static final ncp1 a;

    static {
        mxa1 mxa1Var = new mxa1();
        mxa1Var.w(qap1.class, qap1.class, new xbn1());
        mxa1Var.w(tap1.class, tap1.class, new hcn1());
        mxa1Var.v(rbn1.class, qap1.class, jim1.a);
        mxa1Var.v(sbn1.class, tap1.class, kim1.b);
        mxa1Var.y(rbn1.class, vem1.a);
        mxa1Var.y(sbn1.class, pen1.a);
        mxa1Var.A(bkp1.class, qen1.a);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", xam1.a);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", ccm1.a);
        mxa1Var.u(bkp1.class, tbn1.f);
        mxa1Var.F("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", adm1.a);
        mxa1Var.v(ccn1.class, qap1.class, f2n1.a);
        mxa1Var.v(kcn1.class, tap1.class, p4n1.a);
        mxa1Var.y(ccn1.class, lzm1.a);
        mxa1Var.y(kcn1.class, enm1.a);
        mxa1Var.A(bcn1.class, opm1.a);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ism1.a);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", kum1.b);
        mxa1Var.u(bcn1.class, tbn1.g);
        mxa1Var.F("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", yxm1.a);
        mxa1Var.v(pcn1.class, qap1.class, vbn1.c);
        mxa1Var.v(qcn1.class, tap1.class, wbn1.a);
        mxa1Var.y(pcn1.class, cbn1.a);
        mxa1Var.y(qcn1.class, d8n1.b);
        mxa1Var.A(ncn1.class, p9n1.a);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.MlDsaPrivateKey", t9n1.a);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.MlDsaPublicKey", uan1.a);
        mxa1Var.u(ncn1.class, tbn1.h);
        mxa1Var.F("type.googleapis.com/google.crypto.tink.MlDsaPrivateKey", bbn1.b);
        mxa1Var.v(odn1.class, qap1.class, aen1.c);
        mxa1Var.v(pdn1.class, tap1.class, cen1.b);
        mxa1Var.y(odn1.class, zdn1.b);
        mxa1Var.y(pdn1.class, icn1.b);
        mxa1Var.A(idn1.class, bdn1.b);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ddn1.b);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", qdn1.b);
        mxa1Var.u(idn1.class, tbn1.j);
        mxa1Var.F("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", rdn1.b);
        mxa1Var.v(xdn1.class, qap1.class, oen1.c);
        mxa1Var.v(ydn1.class, tap1.class, pen1.b);
        mxa1Var.y(xdn1.class, nen1.b);
        mxa1Var.y(ydn1.class, den1.b);
        mxa1Var.A(wdn1.class, een1.b);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", fen1.b);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", gen1.b);
        mxa1Var.u(wdn1.class, tbn1.i);
        mxa1Var.F("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", hen1.b);
        mxa1Var.v(lfn1.class, qap1.class, kim1.c);
        mxa1Var.v(mfn1.class, tap1.class, enm1.b);
        mxa1Var.y(lfn1.class, jim1.b);
        mxa1Var.y(mfn1.class, qen1.b);
        mxa1Var.A(kfn1.class, xam1.b);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", ccm1.b);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.SlhDsaPublicKey", adm1.b);
        mxa1Var.u(kfn1.class, tbn1.k);
        mxa1Var.F("type.googleapis.com/google.crypto.tink.SlhDsaPrivateKey", vem1.b);
        mxa1Var.v(sjp1.class, qap1.class, nen1.a);
        mxa1Var.v(vjp1.class, tap1.class, oen1.b);
        mxa1Var.y(sjp1.class, hen1.a);
        mxa1Var.y(vjp1.class, cen1.a);
        mxa1Var.A(pjp1.class, den1.a);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", een1.a);
        mxa1Var.E("type.googleapis.com/google.crypto.tink.CompositeMlDsaPublicKey", fen1.a);
        mxa1Var.F("type.googleapis.com/google.crypto.tink.CompositeMlDsaPrivateKey", gen1.a);
        mxa1Var.u(pjp1.class, tbn1.e);
        HashMap map = (HashMap) mxa1Var.e;
        HashMap map2 = (HashMap) mxa1Var.f;
        HashMap map3 = (HashMap) mxa1Var.g;
        HashMap map4 = (HashMap) mxa1Var.h;
        Collections.unmodifiableMap(new HashMap(map));
        Collections.unmodifiableMap(new HashMap(map2));
        Collections.unmodifiableMap(new HashMap(map3));
        Collections.unmodifiableMap(new HashMap(map4));
        a = new ncp1((HashMap) mxa1Var.b, (HashMap) mxa1Var.d, (HashMap) mxa1Var.c);
    }
}
