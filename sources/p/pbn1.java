package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pbn1 extends vyn1 {
    private static final pbn1 zzt;
    private static volatile o5o1 zzu;
    private int zzb;
    private double zzg;
    private float zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private c0o1 zzm;
    private c0o1 zzn;
    private c0o1 zzo;
    private yzn1 zzp;
    private szn1 zzq;
    private long zzr;
    private byte zzs = 2;
    private gun1 zze = gun1.b;
    private String zzf = "";

    static {
        pbn1 pbn1Var = new pbn1();
        zzt = pbn1Var;
        vyn1.j(pbn1.class, pbn1Var);
    }

    public pbn1() {
        b6o1 b6o1Var = b6o1.e;
        this.zzm = b6o1Var;
        this.zzn = b6o1Var;
        this.zzo = b6o1Var;
        this.zzp = r2o1.e;
        this.zzq = kxn1.e;
    }

    public static bjp1 H() {
        return (bjp1) ((dyn1) zzt.b(5, null));
    }

    public static pbn1 I() {
        return zzt;
    }

    public final c0o1 A() {
        return this.zzm;
    }

    public final c0o1 B() {
        return this.zzn;
    }

    public final int C() {
        return this.zzn.size();
    }

    public final c0o1 D() {
        return this.zzo;
    }

    public final yzn1 E() {
        return this.zzp;
    }

    public final szn1 F() {
        return this.zzq;
    }

    public final long G() {
        return this.zzr;
    }

    public final /* synthetic */ void J(gun1 gun1Var) {
        gun1Var.getClass();
        this.zzb |= 1;
        this.zze = gun1Var;
    }

    public final /* synthetic */ void K(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void L(double d) {
        this.zzb |= 4;
        this.zzg = d;
    }

    public final /* synthetic */ void M(float f) {
        this.zzb |= 8;
        this.zzh = f;
    }

    public final /* synthetic */ void N(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final /* synthetic */ void O(int i) {
        this.zzb |= 32;
        this.zzj = i;
    }

    public final /* synthetic */ void P(int i) {
        this.zzb |= 64;
        this.zzk = i;
    }

    public final /* synthetic */ void Q(boolean z) {
        this.zzb |= 128;
        this.zzl = z;
    }

    public final void R(Iterable iterable) {
        c0o1 c0o1VarZzg = this.zzm;
        if (!((wrn1) c0o1VarZzg).a) {
            int size = c0o1VarZzg.size();
            c0o1VarZzg = c0o1VarZzg.zzg(size + size);
            this.zzm = c0o1VarZzg;
        }
        nrn1.b(iterable, c0o1VarZzg);
    }

    @Override // p.vyn1
    public final Object b(int i, vyn1 vyn1Var) {
        o5o1 hyn1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzs);
        }
        if (i2 == 2) {
            return new g6o1(zzt, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", kdn1.class, "zzn", vcn1.class, "zzo", "zzp", "zzr", "zzq"});
        }
        if (i2 == 3) {
            return new pbn1();
        }
        if (i2 == 4) {
            return new bjp1(zzt);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            this.zzs = vyn1Var == null ? (byte) 0 : (byte) 1;
            return null;
        }
        o5o1 o5o1Var = zzu;
        if (o5o1Var != null) {
            return o5o1Var;
        }
        synchronized (pbn1.class) {
            try {
                hyn1Var = zzu;
                if (hyn1Var == null) {
                    hyn1Var = new hyn1(zzt);
                    zzu = hyn1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hyn1Var;
    }

    public final void n(vcn1 vcn1Var) {
        c0o1 c0o1VarZzg = this.zzn;
        if (!((wrn1) c0o1VarZzg).a) {
            int size = c0o1VarZzg.size();
            c0o1VarZzg = c0o1VarZzg.zzg(size + size);
            this.zzn = c0o1VarZzg;
        }
        c0o1VarZzg.add(vcn1Var);
    }

    public final void o(Iterable iterable) {
        c0o1 c0o1VarZzg = this.zzo;
        if (!((wrn1) c0o1VarZzg).a) {
            int size = c0o1VarZzg.size();
            c0o1VarZzg = c0o1VarZzg.zzg(size + size);
            this.zzo = c0o1VarZzg;
        }
        nrn1.b(iterable, c0o1VarZzg);
    }

    public final void p(ArrayList arrayList) {
        s5o1 s5o1VarZzg = this.zzp;
        if (!((wrn1) s5o1VarZzg).a) {
            int size = s5o1VarZzg.size();
            s5o1VarZzg = ((r2o1) s5o1VarZzg).zzg(size + size);
            this.zzp = s5o1VarZzg;
        }
        nrn1.b(arrayList, s5o1VarZzg);
    }

    public final void q(ArrayList arrayList) {
        wrn1 wrn1VarZzg = this.zzq;
        if (!wrn1VarZzg.a) {
            int size = wrn1VarZzg.size();
            wrn1VarZzg = ((kxn1) wrn1VarZzg).zzg(size + size);
            this.zzq = wrn1VarZzg;
        }
        nrn1.b(arrayList, wrn1VarZzg);
    }

    public final /* synthetic */ void r(long j) {
        this.zzb |= 256;
        this.zzr = j;
    }

    public final gun1 s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final double u() {
        return this.zzg;
    }

    public final float v() {
        return this.zzh;
    }

    public final long w() {
        return this.zzi;
    }

    public final int x() {
        return this.zzj;
    }

    public final int y() {
        return this.zzk;
    }

    public final boolean z() {
        return this.zzl;
    }
}
