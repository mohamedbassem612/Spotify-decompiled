package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cln1 extends rin1 {
    private static final cln1 zzg;
    private int zza;
    private win1 zzd;
    private win1 zze;
    private tkn1 zzf;

    static {
        cln1 cln1Var = new cln1();
        zzg = cln1Var;
        rin1.m(cln1.class, cln1Var);
    }

    public cln1() {
        mjn1 mjn1Var = mjn1.e;
        this.zzd = mjn1Var;
        this.zze = mjn1Var;
    }

    public static bln1 z() {
        return (bln1) zzg.h();
    }

    public final void A(aln1 aln1Var) {
        Objects.requireNonNull(aln1Var);
        win1 win1VarZzg = this.zzd;
        if (!((ohn1) win1VarZzg).a) {
            int size = win1VarZzg.size();
            win1VarZzg = win1VarZzg.zzg(size + size);
            this.zzd = win1VarZzg;
        }
        win1VarZzg.add(aln1Var);
    }

    public final void B(hln1 hln1Var) {
        Objects.requireNonNull(hln1Var);
        win1 win1VarZzg = this.zze;
        if (!((ohn1) win1VarZzg).a) {
            int size = win1VarZzg.size();
            win1VarZzg = win1VarZzg.zzg(size + size);
            this.zze = win1VarZzg;
        }
        win1VarZzg.add(hln1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzg, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zza", "zzd", aln1.class, "zze", hln1.class, "zzf"});
        }
        if (i2 == 3) {
            return new cln1();
        }
        if (i2 == 4) {
            return new bln1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(cln1.class);
    }

    public final int x() {
        return this.zzd.size();
    }

    public final int y() {
        return this.zze.size();
    }
}
