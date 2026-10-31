package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xnn1 extends rin1 {
    private static final xnn1 zzq;
    private int zza;
    private int zzg;
    private boolean zzk;
    private boolean zzl;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";

    static {
        xnn1 xnn1Var = new xnn1();
        zzq = xnn1Var;
        rin1.m(xnn1.class, xnn1Var);
    }

    public static wnn1 x() {
        return (wnn1) zzq.h();
    }

    public final /* synthetic */ void A(String str) {
        this.zzf = "18.9.3";
    }

    public final /* synthetic */ void B(String str) {
        Objects.requireNonNull(str);
        this.zzh = str;
    }

    public final /* synthetic */ void C(String str) {
        Objects.requireNonNull(str);
        this.zzi = str;
    }

    public final /* synthetic */ void D(String str) {
        this.zzj = str;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzk = z;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzl = z;
    }

    public final /* synthetic */ void G(String str) {
        this.zzm = str;
    }

    public final /* synthetic */ void H(String str) {
        this.zza |= 1;
        this.zzn = str;
    }

    public final /* synthetic */ void I(int i) {
        this.zzg = i - 2;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzq, "\u0000\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000bȈ\fለ\u0000\rለ\u0001\u000eለ\u0002", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new xnn1();
        }
        if (i2 == 4) {
            return new wnn1(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(xnn1.class);
    }

    public final /* synthetic */ void y(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }

    public final /* synthetic */ void z(String str) {
        Objects.requireNonNull(str);
        this.zze = str;
    }
}
