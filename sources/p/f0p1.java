package p;

import android.util.Base64;
import com.google.android.recaptcha.internal.zzhm;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class f0p1 {
    public final g1p1 a;
    public final utw0 b;
    public final String c;
    public final lin1 d;
    public final xgn0 e = ygn0.a();
    public final byte f;
    public final byte g;
    public final byte h;
    public final byte i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f0p1(g1p1 g1p1Var, utw0 utw0Var, String str, int i, int i2, int i3, int i4, lin1 lin1Var) {
        this.a = g1p1Var;
        this.b = utw0Var;
        this.c = str;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.d = lin1Var;
    }

    public static /* synthetic */ nwo1 d(f0p1 f0p1Var, rin1 rin1Var) {
        return new nwo1(f0p1Var.g, new qag1(f0p1Var, rin1Var, (lnm) null), null);
    }

    public static /* synthetic */ nwo1 e(uyo1 uyo1Var, sln1 sln1Var) {
        return new nwo1(uyo1Var.i, new azn1(uyo1Var, sln1Var, (lnm) null, (byte) 5), null);
    }

    public static /* synthetic */ qwo1 f(f0p1 f0p1Var) {
        return new qwo1(new blr(f0p1Var, (lnm) null, (byte) 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object h(f0p1 f0p1Var, String str, onm onmVar) throws zzhm {
        a0p1 a0p1Var;
        byte[] bArrDoFinal;
        f0p1Var.getClass();
        if (onmVar instanceof a0p1) {
            a0p1Var = (a0p1) onmVar;
            int i = a0p1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0p1Var.c = i - Integer.MIN_VALUE;
            } else {
                a0p1Var = new a0p1(f0p1Var, onmVar);
            }
        } else {
            a0p1Var = new a0p1(f0p1Var, onmVar);
        }
        Object objA = a0p1Var.a;
        int i2 = a0p1Var.c;
        tgo1 tgo1Var = tgo1.c;
        rin1 rin1VarA = null;
        rin1 rin1Var = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                g1p1 g1p1Var = f0p1Var.a;
                String str2 = f0p1Var.c;
                StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(str).length());
                sb.append(str2);
                sb.append(str);
                String string = sb.toString();
                a0p1Var.c = 1;
                objA = g1p1Var.a(string, a0p1Var);
                if (objA == rin1Var) {
                    return rin1Var;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        hm5.M(objA);
                        return objA;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            String str3 = (String) objA;
            if (str3 == null) {
                throw new zzhm(tgo1Var, ij81.T1, null, null);
            }
            a0p1Var.c = 2;
            utw0 utw0Var = f0p1Var.b;
            byte[] bArrDecode = Base64.decode(str3, 8);
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, utw0Var.E(), new GCMParameterSpec(128, bArrDecode, 0, 12));
                bArrDoFinal = cipher.doFinal(bArrDecode, 12, bArrDecode.length - 12);
            } catch (Exception unused) {
                bArrDoFinal = null;
            }
            if (bArrDoFinal != null) {
                try {
                    rin1VarA = f0p1Var.d.a(bArrDoFinal);
                } catch (Exception e) {
                    throw new zzhm(tgo1Var, ij81.V1, e.getMessage(), null);
                }
            }
            return rin1VarA == rin1Var ? rin1Var : rin1VarA;
        } catch (Exception e2) {
            throw new zzhm(tgo1Var, ij81.U1, e2.getMessage(), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nhn1 nhn1Var, String str, onm onmVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        e0p1 e0p1Var;
        g1p1 g1p1Var;
        String str2;
        if (onmVar instanceof e0p1) {
            e0p1Var = (e0p1) onmVar;
            int i = e0p1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0p1Var.d = i - Integer.MIN_VALUE;
            } else {
                e0p1Var = new e0p1(this, onmVar);
            }
        } else {
            e0p1Var = new e0p1(this, onmVar);
        }
        Object obj = e0p1Var.b;
        int i2 = e0p1Var.d;
        String str3 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            String strValueOf = String.valueOf(str);
            g1p1 g1p1Var2 = this.a;
            e0p1Var.a = g1p1Var2;
            String strConcat = this.c.concat(strValueOf);
            e0p1Var.e = strConcat;
            e0p1Var.d = 1;
            byte[] bArrD = nhn1Var.d();
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.b.E());
            byte[] iv = cipher.getIV();
            byte[] bArrDoFinal = cipher.doFinal(bArrD);
            iv.getClass();
            bArrDoFinal.getClass();
            String strEncodeToString = Base64.encodeToString(f46.x0(iv, bArrDoFinal), 8);
            if (strEncodeToString != str3) {
                g1p1Var = g1p1Var2;
                obj = strEncodeToString;
                str2 = strConcat;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = e0p1Var.e;
        g1p1Var = e0p1Var.a;
        hm5.M(obj);
        e0p1Var.a = null;
        e0p1Var.e = null;
        e0p1Var.d = 2;
        Object objE = g1p1Var.e(str2, (String) obj, e0p1Var);
        return objE == str3 ? str3 : objE;
    }

    public final String b() {
        return this.c;
    }

    public final xgn0 c() {
        return this.e;
    }
}
