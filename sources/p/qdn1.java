package p;

import android.util.Base64;
import com.google.android.recaptcha.internal.zzals;
import com.google.android.recaptcha.internal.zzhm;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class qdn1 implements ufp1, agp1, zgn1 {
    public static final /* synthetic */ qdn1 a = new qdn1();
    public static final /* synthetic */ qdn1 b = new qdn1();

    public static void c(cnn1 cnn1Var, String str) throws zzhm, GeneralSecurityException {
        String str2;
        String str3;
        byte[] bArrDecode = Base64.decode(str, 0);
        try {
            hin1 hin1Var = hin1.b;
            int i = phn1.a;
            bip1 bip1VarA = bip1.A(bArrDecode, hin1.b);
            for (aip1 aip1Var : bip1VarA.y()) {
                if (aip1Var.x().D() == 2 || aip1Var.x().D() == 3 || aip1Var.x().D() == 4) {
                    int iD = aip1Var.x().D();
                    if (iD == 2) {
                        str3 = "UNKNOWN_KEYMATERIAL";
                    } else if (iD == 3) {
                        str3 = "SYMMETRIC";
                    } else if (iD == 4) {
                        str3 = "ASYMMETRIC_PRIVATE";
                    } else if (iD != 5) {
                        str3 = iD != 6 ? "UNRECOGNIZED" : "REMOTE";
                    } else {
                        str3 = "ASYMMETRIC_PUBLIC";
                    }
                    throw new GeneralSecurityException("keyset contains key material of type " + str3 + " for type url " + aip1Var.x().x());
                }
            }
            if (bip1VarA.z() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            List<q9p1> listU = zxl1.u(bip1VarA);
            if ((vap1.class.equals(map1.class) ? vap1.class.cast(vqo1.a) : (!vap1.class.equals(vap1.class) || ((AtomicBoolean) ibp1.a.b).get()) ? null : vap1.class.cast(new vap1((byte) 0))) == null) {
                HashSet hashSet = new HashSet();
                boolean z = false;
                for (q9p1 q9p1Var : listU) {
                    int i2 = q9p1Var.c;
                    if (hashSet.contains(Integer.valueOf(i2))) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 121);
                        sb.append("KeyID ");
                        sb.append(i2);
                        sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                        throw new GeneralSecurityException(sb.toString());
                    }
                    hashSet.add(Integer.valueOf(i2));
                    z |= q9p1Var.d;
                }
                if (!z) {
                    throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
            }
            zxl1 zxl1Var = new zxl1(listU, new HashMap(), (byte) 26);
            ncp1 ncp1Var = gfn1.a;
            for (int i3 = 0; i3 < listU.size(); i3++) {
                k9p1 k9p1Var = ((q9p1) listU.get(i3)).b;
                k9p1 k9p1Var2 = k9p1.c;
                if (k9p1Var == k9p1Var2) {
                    for (int i4 = 0; i4 < listU.size(); i4++) {
                        if (((q9p1) listU.get(i4)).e || !zxl1.w(((q9p1) listU.get(i4)).f)) {
                            pno1 pno1Var = ((q9p1) listU.get(i4)).a;
                            if (pno1Var instanceof jdp1) {
                                a2x0 a2x0Var = a2x0.c1;
                                kap1 kap1Var = ((jdp1) pno1Var).d;
                                jdp1.w(kap1Var, a2x0Var);
                                str2 = (String) kap1Var.a;
                            } else {
                                str2 = "(unknown)";
                            }
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + String.valueOf(i4).length() + 44 + 32);
                            sb2.append("Key parsing of key with index ");
                            sb2.append(i4);
                            sb2.append(" and type_url ");
                            sb2.append(str2);
                            sb2.append(" failed, unable to get primitive");
                            throw new GeneralSecurityException(sb2.toString());
                        }
                    }
                    int i5 = gbp1.a;
                    boolean z2 = false;
                    for (int i6 = 0; i6 < listU.size(); i6++) {
                        q9p1 q9p1VarS = zxl1Var.s(i6);
                        if (q9p1VarS.b == k9p1Var2 && q9p1VarS.d) {
                            if (z2) {
                                k220.r("keyset contains multiple primary keys");
                                return;
                            }
                            z2 = true;
                        }
                    }
                    kgp1 kgp1Var = (kgp1) ncp1Var.b.get(tap1.class);
                    if (kgp1Var == null) {
                        throw new GeneralSecurityException("No wrapper registered for primitive class: ".concat(tap1.class.getName()));
                    }
                    try {
                        ((tap1) kgp1Var.b.c(zxl1Var, new zxl1(ncp1Var, kgp1Var, (byte) 29))).a(cnn1Var.y().z(), cnn1Var.x().z());
                        return;
                    } catch (GeneralSecurityException unused) {
                        throw new zzhm(tgo1.c, ij81.O1, null, null);
                    }
                }
            }
            k220.r("keyset must contain at least one ENABLED key");
        } catch (zzals unused2) {
            k220.r("invalid keyset");
        }
    }

    public /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // p.ufp1
    public /* synthetic */ Object b(pno1 pno1Var) {
        return ign1.a((odn1) pno1Var);
    }
}
