package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d92 extends o5 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d92(byte b) {
        super(v92.class, new ypa0[]{new b92(s82.class, (byte) 4)});
        this.e = b;
        switch (b) {
            case 5:
                super(ea2.class, new ypa0[]{new b92(tot.class, (byte) 6)});
                break;
            default:
                break;
        }
    }

    public static final upa0 Q() {
        w92 w92VarN = x92.n();
        w92VarN.d();
        ((we40) w92VarN).b.p();
        x92 x92VarA = w92VarN.a();
        new d92((byte) 3);
        return upa0.d("type.googleapis.com/google.crypto.tink.AesGcmKey", x92VarA.c());
    }

    public static final upa0 R() {
        fa2 fa2VarN = ga2.n();
        fa2VarN.d();
        ((we40) fa2VarN).b.p();
        ga2 ga2VarA = fa2VarN.a();
        new d92((byte) 5);
        return upa0.d("type.googleapis.com/google.crypto.tink.AesSivKey", ga2VarA.c());
    }

    public static void S() {
        vf11.f(new d92(y82.class, new ypa0[]{new b92(iuf0.class, (byte) 0)}, (byte) 0), true);
    }

    public static void T() {
        vf11.f(new d92(g92.class, new ypa0[]{new b92(s82.class, (byte) 1)}, (byte) 1), true);
    }

    public static void U() {
        vf11.f(new d92(q92.class, new ypa0[]{new b92(s82.class, (byte) 3)}, (byte) 2), true);
    }

    public static void V() {
        vf11.f(new d92((byte) 3), true);
    }

    public static void W() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            vf11.f(new d92(aa2.class, new ypa0[]{new b92(s82.class, (byte) 5)}, (byte) 4), true);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
    }

    public static void X() {
        vf11.f(new d92((byte) 5), true);
    }

    public static void Y() {
        vf11.f(new d92(qbe.class, new ypa0[]{new b92(s82.class, (byte) 7)}, (byte) 6), true);
    }

    public static void Z() {
        vf11.f(new d92(f4b0.class, new ypa0[]{new b92(s82.class, (byte) 8)}, (byte) 7), true);
    }

    public static void a0() {
        vf11.f(new d92(k4b0.class, new ypa0[]{new b92(s82.class, (byte) 9)}, (byte) 8), true);
    }

    public static void b0() {
        vf11.f(new d92(akm1.class, new ypa0[]{new b92(s82.class, (byte) 10)}, (byte) 9), true);
    }

    public static void c0(e92 e92Var) {
        if (e92Var.n() < 10) {
            k220.r("tag size too short");
        } else {
            if (e92Var.n() <= 16) {
                return;
            }
            k220.r("tag size too long");
        }
    }

    public final u8 A(ohc ohcVar) {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return y82.r(ohcVar, tz00.a());
            case 1:
                return g92.r(ohcVar, tz00.a());
            case 2:
                return q92.r(ohcVar, tz00.a());
            case 3:
                return v92.p(ohcVar, tz00.a());
            case 4:
                return aa2.q(ohcVar, tz00.a());
            case 5:
                return ea2.p(ohcVar, tz00.a());
            case 6:
                return qbe.q(ohcVar, tz00.a());
            case 7:
                return f4b0.q(ohcVar, tz00.a());
            case 8:
                return k4b0.q(ohcVar, tz00.a());
            default:
                return akm1.q(ohcVar, tz00.a());
        }
    }

    public final void P(u8 u8Var) throws InvalidKeyException {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                y82 y82Var = (y82) u8Var;
                gsi1.c(y82Var.p());
                if (y82Var.n().size() == 32) {
                    c0(y82Var.o());
                    return;
                } else {
                    k220.r("AesCmacKey size wrong, must be 32 bytes");
                    return;
                }
            case 1:
                g92 g92Var = (g92) u8Var;
                gsi1.c(g92Var.p());
                ypa0[] ypa0VarArr = {new b92(o980.class, (byte) 2)};
                HashMap map = new HashMap();
                ypa0 ypa0Var = ypa0VarArr[0];
                boolean zContainsKey = map.containsKey(ypa0Var.a);
                Class cls = ypa0Var.a;
                if (zContainsKey) {
                    hhg1.n(cy30.k(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map.put(cls, ypa0Var);
                Class cls2 = ypa0VarArr[0].a;
                Collections.unmodifiableMap(map);
                l92 l92VarN = g92Var.n();
                gsi1.c(l92VarN.p());
                gsi1.a(l92VarN.n().size());
                n92 n92VarO = l92VarN.o();
                if (n92VarO.n() < 12 || n92VarO.n() > 16) {
                    k220.r("invalid IV size");
                    return;
                }
                ypa0[] ypa0VarArr2 = {new xl60(iuf0.class)};
                HashMap map2 = new HashMap();
                ypa0 ypa0Var2 = ypa0VarArr2[0];
                boolean zContainsKey2 = map2.containsKey(ypa0Var2.a);
                Class cls3 = ypa0Var2.a;
                if (zContainsKey2) {
                    hhg1.n(cy30.k(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                map2.put(cls3, ypa0Var2);
                Class cls4 = ypa0VarArr2[0].a;
                Collections.unmodifiableMap(map2);
                vl60 vl60VarO = g92Var.o();
                gsi1.c(vl60VarO.q());
                if (vl60VarO.o().size() >= 16) {
                    zl60.Q(vl60VarO.p());
                    return;
                } else {
                    k220.r("key too short");
                    return;
                }
            case 2:
                q92 q92Var = (q92) u8Var;
                gsi1.c(q92Var.p());
                gsi1.a(q92Var.n().size());
                if (q92Var.o().n() == 12 || q92Var.o().n() == 16) {
                    return;
                }
                k220.r("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                v92 v92Var = (v92) u8Var;
                gsi1.c(v92Var.n());
                gsi1.a(v92Var.m().size());
                return;
            case 4:
                aa2 aa2Var = (aa2) u8Var;
                gsi1.c(aa2Var.o());
                gsi1.a(aa2Var.n().size());
                return;
            case 5:
                ea2 ea2Var = (ea2) u8Var;
                gsi1.c(ea2Var.n());
                if (ea2Var.m().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + ea2Var.m().size() + ". Valid keys must have 64 bytes.");
            case 6:
                qbe qbeVar = (qbe) u8Var;
                gsi1.c(qbeVar.o());
                if (qbeVar.n().size() == 32) {
                    return;
                }
                k220.r("invalid ChaCha20Poly1305Key: incorrect key length");
                return;
            case 7:
                gsi1.c(((f4b0) u8Var).o());
                return;
            case 8:
                gsi1.c(((k4b0) u8Var).o());
                return;
            default:
                akm1 akm1Var = (akm1) u8Var;
                gsi1.c(akm1Var.o());
                if (akm1Var.n().size() == 32) {
                    return;
                }
                k220.r("invalid XChaCha20Poly1305Key: incorrect key length");
                return;
        }
    }

    public final String s() {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 7:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 8:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    public final k9 w() {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new c92(a92.class);
            case 1:
                return new c92(this);
            case 2:
                return new c92(this, (byte) 0);
            case 3:
                return new c92(this, (char) 0);
            case 4:
                return new c92(this, 0);
            case 5:
                return new c92(this, (short) 0);
            case 6:
                return new c92(this, (byte) 0, false);
            case 7:
                return new c92(this, (byte) 0, (byte) 0);
            case 8:
                return new c92(this, (byte) 0, (char) 0);
            default:
                return new c92(this, (byte) 0, 0);
        }
    }

    public final apa0 x() {
        byte b = this.e;
        apa0 apa0Var = apa0.f;
        apa0 apa0Var2 = apa0.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return apa0Var2;
            case 7:
            case 8:
                return apa0Var;
            default:
                return apa0Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d92(Class cls, ypa0[] ypa0VarArr, byte b) {
        super(cls, ypa0VarArr);
        this.e = b;
    }
}
