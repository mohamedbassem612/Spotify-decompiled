package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tkn1 extends rin1 {
    private static final tkn1 zzk;
    private ain1 zza;
    private String zzd;
    private ain1 zze;
    private String zzf;
    private String zzg;
    private ain1 zzh;
    private String zzi;
    private ain1 zzj;

    static {
        tkn1 tkn1Var = new tkn1();
        zzk = tkn1Var;
        rin1.m(tkn1.class, tkn1Var);
    }

    public tkn1() {
        vhn1 vhn1Var = ain1.b;
        this.zza = vhn1Var;
        this.zzd = "";
        this.zze = vhn1Var;
        this.zzf = "";
        this.zzg = "";
        this.zzh = vhn1Var;
        this.zzi = "";
        this.zzj = vhn1Var;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzk, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ\b\n", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new tkn1();
        }
        if (i2 == 4) {
            return new jkn1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(tkn1.class);
    }
}
