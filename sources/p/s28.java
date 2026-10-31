package p;

import android.media.audiofx.AcousticEchoCanceler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s28 implements qsw0 {
    public static final s28 b = new s28(0);
    public static final s28 c = new s28(1);
    public static final s28 d = new s28(2);
    public static final s28 e = new s28(3);
    public static final s28 f = new s28(4);
    public static final s28 g = new s28(5);
    public static final s28 h = new s28(6);
    public static final s28 i = new s28(7);
    public static final s28 j = new s28(8);
    public final /* synthetic */ byte a;

    public /* synthetic */ s28(byte b2) {
        this.a = b2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(AcousticEchoCanceler.isAvailable());
            case 1:
                return new y7r0(2131956773, 2131956772);
            case 2:
                l391 l391Var = z391.Y;
                return xpn1.G(new e491[]{l391Var, l391Var, l391Var, l391Var, l391Var, l391Var, l391Var});
            case 3:
                return new z7r0();
            case 4:
                return new y7r0(2131956773, 2131956772);
            case 5:
                l391 l391Var2 = z391.Y;
                return xpn1.G(new e491[]{l391Var2, l391Var2, l391Var2, l391Var2, l391Var2, l391Var2, l391Var2});
            case 6:
                qzb0 qzb0Var = rzb0.a;
                return xpn1.G(new e491[]{qzb0Var, qzb0Var, qzb0Var, qzb0Var, qzb0Var, qzb0Var, qzb0Var, qzb0Var});
            case 7:
                l391 l391Var3 = z391.Y;
                return xpn1.G(new e491[]{l391Var3, l391Var3, l391Var3, l391Var3, l391Var3, l391Var3, l391Var3});
            default:
                return new y7r0(2131962428, 2131962427);
        }
    }
}
