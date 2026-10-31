package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kdn1 extends vyn1 {
    private static final kdn1 zzh;
    private static volatile o5o1 zzi;
    private int zzb;
    private vcn1 zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        kdn1 kdn1Var = new kdn1();
        zzh = kdn1Var;
        vyn1.j(kdn1.class, kdn1Var);
    }

    public static xdp1 p() {
        return (dyn1) zzh.b(5, null);
    }

    @Override // p.vyn1
    public final Object b(int i, vyn1 vyn1Var) {
        o5o1 hyn1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new g6o1(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new kdn1();
        }
        if (i2 == 4) {
            return new xdp1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            this.zzg = vyn1Var == null ? (byte) 0 : (byte) 1;
            return null;
        }
        o5o1 o5o1Var = zzi;
        if (o5o1Var != null) {
            return o5o1Var;
        }
        synchronized (kdn1.class) {
            try {
                hyn1Var = zzi;
                if (hyn1Var == null) {
                    hyn1Var = new hyn1(zzh);
                    zzi = hyn1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hyn1Var;
    }

    public final String n() {
        return this.zze;
    }

    public final vcn1 o() {
        vcn1 vcn1Var = this.zzf;
        return vcn1Var == null ? vcn1.p() : vcn1Var;
    }

    public final /* synthetic */ void q(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void r(vcn1 vcn1Var) {
        vcn1Var.getClass();
        this.zzf = vcn1Var;
        this.zzb |= 2;
    }
}
