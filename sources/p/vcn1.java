package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vcn1 extends vyn1 {
    private static final vcn1 zzh;
    private static volatile o5o1 zzi;
    private int zzb;
    private pbn1 zzf;
    private byte zzg = 2;
    private int zze = 1;

    static {
        vcn1 vcn1Var = new vcn1();
        zzh = vcn1Var;
        vyn1.j(vcn1.class, vcn1Var);
    }

    public static gfp1 o() {
        return (dyn1) zzh.b(5, null);
    }

    public static vcn1 p() {
        return zzh;
    }

    @Override // p.vyn1
    public final Object b(int i, vyn1 vyn1Var) {
        o5o1 hyn1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new g6o1(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new Object[]{"zzb", "zze", rgp1.a, "zzf"});
        }
        if (i2 == 3) {
            return new vcn1();
        }
        if (i2 == 4) {
            return new gfp1(zzh);
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
        synchronized (vcn1.class) {
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

    public final pbn1 n() {
        pbn1 pbn1Var = this.zzf;
        return pbn1Var == null ? pbn1.I() : pbn1Var;
    }

    public final /* synthetic */ void q(pbn1 pbn1Var) {
        this.zzf = pbn1Var;
        this.zzb |= 2;
    }

    public final int r() {
        int iA = wpo1.A(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void s(int i) {
        this.zze = i;
        this.zzb |= 1;
    }
}
