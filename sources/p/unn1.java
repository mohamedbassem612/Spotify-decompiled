package p;

import com.google.android.recaptcha.internal.zzals;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class unn1 extends rin1 {
    private static final unn1 zze;
    private win1 zza = mjn1.e;
    private int zzd;

    static {
        unn1 unn1Var = new unn1();
        zze = unn1Var;
        rin1.m(unn1.class, unn1Var);
    }

    public static unn1 x(ain1 ain1Var) throws zzals {
        unn1 unn1Var = zze;
        hin1 hin1Var = hin1.b;
        int i = phn1.a;
        rin1 rin1VarT = rin1.t(unn1Var, ain1Var, hin1.b);
        rin1.s(rin1VarT);
        rin1.s(rin1VarT);
        return (unn1) rin1VarT;
    }

    public static rnn1 y() {
        return (rnn1) zze.h();
    }

    public final void A(Iterable iterable) {
        win1 win1VarZzg = this.zza;
        if (!((ohn1) win1VarZzg).a) {
            int size = win1VarZzg.size();
            win1VarZzg = win1VarZzg.zzg(size + size);
            this.zza = win1VarZzg;
        }
        kin1.b(iterable, win1VarZzg);
    }

    public final /* synthetic */ void B(int i) {
        this.zzd = i;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zza", tnn1.class, "zzd"});
        }
        if (i2 == 3) {
            return new unn1();
        }
        if (i2 == 4) {
            return new rnn1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(unn1.class);
    }

    public final void z(tnn1 tnn1Var) {
        win1 win1VarZzg = this.zza;
        if (!((ohn1) win1VarZzg).a) {
            int size = win1VarZzg.size();
            win1VarZzg = win1VarZzg.zzg(size + size);
            this.zza = win1VarZzg;
        }
        win1VarZzg.add(tnn1Var);
    }
}
