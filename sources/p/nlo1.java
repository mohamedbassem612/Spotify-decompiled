package p;

import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.gms.internal.play_billing.zzia;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nlo1 extends iao1 {
    private static final nlo1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private umo1 zzh;
    private int zzi;

    static {
        nlo1 nlo1Var = new nlo1();
        zzb = nlo1Var;
        iao1.f(nlo1.class, nlo1Var);
    }

    public static /* synthetic */ void q(nlo1 nlo1Var, ypo1 ypo1Var) {
        nlo1Var.zzf = ypo1Var;
        nlo1Var.zze = 7;
    }

    public static /* synthetic */ void r(nlo1 nlo1Var, bso1 bso1Var) {
        nlo1Var.zzf = bso1Var;
        nlo1Var.zze = 6;
    }

    public static /* synthetic */ void s(nlo1 nlo1Var, int i) {
        nlo1Var.zzg = i - 1;
        nlo1Var.zzd |= 1;
    }

    public static hlo1 t() {
        return (hlo1) zzb.k();
    }

    public static nlo1 u(byte[] bArr) throws zzgc {
        iao1 iao1Var = zzb;
        int length = bArr.length;
        h8o1 h8o1Var = h8o1.b;
        int i = z3o1.a;
        h8o1 h8o1Var2 = h8o1.b;
        if (length != 0) {
            iao1 iao1VarN = iao1Var.n();
            try {
                sgo1 sgo1VarA = igo1.c.a(iao1VarN.getClass());
                qhn1 qhn1Var = new qhn1();
                h8o1Var2.getClass();
                sgo1VarA.e(iao1VarN, bArr, 0, length, qhn1Var);
                sgo1VarA.zzf(iao1VarN);
                iao1Var = iao1VarN;
            } catch (zzgc e) {
                throw e;
            } catch (zzia e2) {
                x4n1.i(e2.getMessage());
                return null;
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzgc) {
                    throw ((zzgc) e3.getCause());
                }
                throw new zzgc(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                x4n1.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        if (iao1Var == null || iao1.i(iao1Var, true)) {
            return (nlo1) iao1Var;
        }
        x4n1.i(new zzia().getMessage());
        return null;
    }

    public static void w(nlo1 nlo1Var, jno1 jno1Var) {
        nlo1Var.zzi = jno1Var.a;
        nlo1Var.zzd |= 4;
    }

    public static /* synthetic */ void x(nlo1 nlo1Var, umo1 umo1Var) {
        nlo1Var.zzh = umo1Var;
        nlo1Var.zzd |= 2;
    }

    public static /* synthetic */ void y(nlo1 nlo1Var, apo1 apo1Var) {
        nlo1Var.zzf = apo1Var;
        nlo1Var.zze = 4;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", c3o1.c, "zzh", apo1.class, "zzi", c3o1.e, bso1.class, ypo1.class});
        }
        if (i2 == 3) {
            return new nlo1();
        }
        if (i2 == 4) {
            return new hlo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final ypo1 v() {
        return this.zze == 7 ? (ypo1) this.zzf : ypo1.q();
    }
}
