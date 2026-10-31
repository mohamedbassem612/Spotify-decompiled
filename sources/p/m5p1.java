package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m5p1 extends cip1 {
    private static final m5p1 zzm;
    private int zzb;
    private b7p1 zzd;
    private long zze;
    private int zzf;
    private lip1 zzg;
    private lip1 zzh;
    private lip1 zzi;
    private lip1 zzj;
    private lip1 zzk;
    private int zzl;

    static {
        m5p1 m5p1Var = new m5p1();
        zzm = m5p1Var;
        cip1.h(m5p1.class, m5p1Var);
    }

    public m5p1() {
        rjp1 rjp1Var = rjp1.e;
        this.zzg = rjp1Var;
        this.zzh = rjp1Var;
        this.zzi = rjp1Var;
        this.zzj = rjp1Var;
        this.zzk = rjp1Var;
    }

    public static j5p1 m() {
        return (j5p1) zzm.e();
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new tjp1(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", ybx0.b1, "zzg", g5p1.class, "zzh", y4p1.class, "zzi", d6p1.class, "zzj", y5p1.class, "zzk", c5p1.class, "zzl"});
        }
        if (i2 == 3) {
            return new m5p1();
        }
        if (i2 == 4) {
            return new j5p1(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }

    public final /* synthetic */ void n(b7p1 b7p1Var) {
        this.zzd = b7p1Var;
        this.zzb |= 1;
    }

    public final /* synthetic */ void o(long j) {
        this.zzb |= 2;
        this.zze = j;
    }

    public final void p(ArrayList arrayList) {
        lip1 lip1VarZzf = this.zzg;
        if (!((ugp1) lip1VarZzf).a) {
            int size = lip1VarZzf.size();
            lip1VarZzf = lip1VarZzf.zzf(size + size);
            this.zzg = lip1VarZzf;
        }
        qgp1.d(arrayList, lip1VarZzf);
    }

    public final void q(ArrayList arrayList) {
        lip1 lip1VarZzf = this.zzh;
        if (!((ugp1) lip1VarZzf).a) {
            int size = lip1VarZzf.size();
            lip1VarZzf = lip1VarZzf.zzf(size + size);
            this.zzh = lip1VarZzf;
        }
        qgp1.d(arrayList, lip1VarZzf);
    }

    public final void r(ArrayList arrayList) {
        lip1 lip1VarZzf = this.zzi;
        if (!((ugp1) lip1VarZzf).a) {
            int size = lip1VarZzf.size();
            lip1VarZzf = lip1VarZzf.zzf(size + size);
            this.zzi = lip1VarZzf;
        }
        qgp1.d(arrayList, lip1VarZzf);
    }

    public final void s(ArrayList arrayList) {
        lip1 lip1VarZzf = this.zzj;
        if (!((ugp1) lip1VarZzf).a) {
            int size = lip1VarZzf.size();
            lip1VarZzf = lip1VarZzf.zzf(size + size);
            this.zzj = lip1VarZzf;
        }
        qgp1.d(arrayList, lip1VarZzf);
    }

    public final void t(ArrayList arrayList) {
        lip1 lip1VarZzf = this.zzk;
        if (!((ugp1) lip1VarZzf).a) {
            int size = lip1VarZzf.size();
            lip1VarZzf = lip1VarZzf.zzf(size + size);
            this.zzk = lip1VarZzf;
        }
        qgp1.d(arrayList, lip1VarZzf);
    }

    public final /* synthetic */ void u(int i) {
        this.zzb |= 8;
        this.zzl = i;
    }
}
