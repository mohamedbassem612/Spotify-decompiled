package p;

import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tnn1 extends rin1 {
    private static final tnn1 zze;
    private int zza = 0;
    private Object zzd;

    static {
        tnn1 tnn1Var = new tnn1();
        zze = tnn1Var;
        rin1.m(tnn1.class, tnn1Var);
    }

    public static snn1 x() {
        return (snn1) zze.h();
    }

    public final /* synthetic */ void A(String str) {
        Objects.requireNonNull(str);
        this.zza = 11;
        this.zzd = str;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzd", "zza"});
        }
        if (i2 == 3) {
            return new tnn1();
        }
        if (i2 == 4) {
            return new snn1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(tnn1.class);
    }

    public final /* synthetic */ void y() {
        this.zza = 1;
        this.zzd = Boolean.TRUE;
    }

    public final /* synthetic */ void z() {
        long j = Build.TIME;
        this.zza = 7;
        this.zzd = Long.valueOf(j);
    }
}
