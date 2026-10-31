package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vkn1 extends rin1 {
    private static final vkn1 zzj;
    private int zze;
    private int zzh;
    private int zzi;
    private String zza = "";
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";

    static {
        vkn1 vkn1Var = new vkn1();
        zzj = vkn1Var;
        rin1.m(vkn1.class, vkn1Var);
    }

    public static ukn1 x() {
        return (ukn1) zzj.h();
    }

    public final /* synthetic */ void A(String str) {
        Objects.requireNonNull(str);
        this.zzg = str;
    }

    public final /* synthetic */ void B(int i) {
        this.zzi = i;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzj, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zza", "zze", "zzg", "zzh", "zzd", "zzf", "zzi"});
        }
        if (i2 == 3) {
            return new vkn1();
        }
        if (i2 == 4) {
            return new ukn1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(vkn1.class);
    }

    public final /* synthetic */ void y(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final /* synthetic */ void z(int i) {
        this.zze = i;
    }
}
