package p;

import com.google.android.gms.internal.wearable.zzdv;
import com.google.android.gms.internal.wearable.zzfh;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class len1 extends vyn1 {
    private static final len1 zzf;
    private static volatile o5o1 zzg;
    private byte zze = 2;
    private c0o1 zzb = b6o1.e;

    static {
        len1 len1Var = new len1();
        zzf = len1Var;
        vyn1.j(len1.class, len1Var);
    }

    public static len1 o(byte[] bArr, iwn1 iwn1Var) throws zzdv {
        vyn1 vyn1Var = zzf;
        int length = bArr.length;
        if (length != 0) {
            vyn1 vyn1VarE = vyn1Var.e();
            try {
                r6o1 r6o1VarB = w5o1.c.b(vyn1VarE.getClass());
                qhn1 qhn1Var = new qhn1();
                iwn1Var.getClass();
                r6o1VarB.f(vyn1VarE, bArr, 0, length, qhn1Var);
                r6o1VarB.b(vyn1VarE);
                vyn1Var = vyn1VarE;
            } catch (zzdv e) {
                throw e;
            } catch (zzfh e2) {
                throw new zzdv(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzdv) {
                    throw ((zzdv) e3.getCause());
                }
                throw new zzdv(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (vyn1Var == null || vyn1.m(vyn1Var, true)) {
            return (len1) vyn1Var;
        }
        throw new zzdv(new zzfh().getMessage());
    }

    public static tbp1 p() {
        return (dyn1) zzf.b(5, null);
    }

    @Override // p.vyn1
    public final Object b(int i, vyn1 vyn1Var) {
        o5o1 hyn1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i2 == 2) {
            return new g6o1(zzf, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzb", kdn1.class});
        }
        if (i2 == 3) {
            return new len1();
        }
        if (i2 == 4) {
            return new tbp1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            this.zze = vyn1Var == null ? (byte) 0 : (byte) 1;
            return null;
        }
        o5o1 o5o1Var = zzg;
        if (o5o1Var != null) {
            return o5o1Var;
        }
        synchronized (len1.class) {
            try {
                hyn1Var = zzg;
                if (hyn1Var == null) {
                    hyn1Var = new hyn1(zzf);
                    zzg = hyn1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hyn1Var;
    }

    public final c0o1 n() {
        return this.zzb;
    }

    public final void q(ArrayList arrayList) {
        c0o1 c0o1VarZzg = this.zzb;
        if (!((wrn1) c0o1VarZzg).a) {
            int size = c0o1VarZzg.size();
            c0o1VarZzg = c0o1VarZzg.zzg(size + size);
            this.zzb = c0o1VarZzg;
        }
        nrn1.b(arrayList, c0o1VarZzg);
    }
}
