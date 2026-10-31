package p;

import com.google.android.recaptcha.internal.zzals;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class inn1 extends rin1 {
    private static final inn1 zzf;
    private int zza;
    private String zzd = "";
    private win1 zze = mjn1.e;

    static {
        inn1 inn1Var = new inn1();
        zzf = inn1Var;
        rin1.m(inn1.class, inn1Var);
    }

    public static hnn1 A() {
        return (hnn1) zzf.h();
    }

    public static inn1 y(vhn1 vhn1Var) throws zzals {
        inn1 inn1Var = zzf;
        hin1 hin1Var = hin1.b;
        int i = phn1.a;
        rin1 rin1VarT = rin1.t(inn1Var, vhn1Var, hin1.b);
        rin1.s(rin1VarT);
        rin1.s(rin1VarT);
        return (inn1) rin1VarT;
    }

    public static inn1 z(byte[] bArr) {
        return (inn1) rin1.p(zzf, bArr);
    }

    public final /* synthetic */ void B(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzd = str;
    }

    public final void C(gnn1 gnn1Var) {
        win1 win1VarZzg = this.zze;
        if (!((ohn1) win1VarZzg).a) {
            int size = win1VarZzg.size();
            win1VarZzg = win1VarZzg.zzg(size + size);
            this.zze = win1VarZzg;
        }
        win1VarZzg.add(gnn1Var);
    }

    public final void D(ArrayList arrayList) {
        win1 win1VarZzg = this.zze;
        if (!((ohn1) win1VarZzg).a) {
            int size = win1VarZzg.size();
            win1VarZzg = win1VarZzg.zzg(size + size);
            this.zze = win1VarZzg;
        }
        kin1.b(arrayList, win1VarZzg);
    }

    public final void E() {
        this.zze = mjn1.e;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zza", "zze", gnn1.class, "zzd"});
        }
        if (i2 == 3) {
            return new inn1();
        }
        if (i2 == 4) {
            return new hnn1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(inn1.class);
    }

    public final win1 x() {
        return this.zze;
    }
}
