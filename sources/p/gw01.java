package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gw01 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw01(kob1 kob1Var, y1t0 y1t0Var) {
        super(3);
        this.a = (byte) 0;
        this.b = kob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kob1 kob1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                c380<ft01> c380Var = kob1Var.d;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    boolean zIsEmpty = c380Var.isEmpty();
                    nim0 nim0Var = nim0.a;
                    isl islVar = isl.a;
                    if (zIsEmpty) {
                        x340Var2.i0(1493338679);
                        eso1.e(Uri.EMPTY, islVar, i1p1.q(nim0Var, (cr31) ((k9) a47.c).b), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4088);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1493609061);
                        for (ft01 ft01Var : c380Var) {
                            Uri uri = kob1Var.q ? Uri.EMPTY : Uri.parse(ft01Var.a);
                            uri.getClass();
                            eso1.e(uri, islVar, i1p1.q(nim0Var, (cr31) ((k9) (sua.s(ft01Var.b) ? y37.c : a47.c)).b), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4088);
                        }
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    kyo1.e(0, kob1Var.b, x340Var4, kob1Var.g, kob1Var.i);
                } else {
                    x340Var4.b0();
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    kyo1.k(kob1Var.g, kob1Var.b, kob1Var.c, kob1Var.n, kob1Var.o, kob1Var.e, kob1Var.i, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw01(kob1 kob1Var, byte b) {
        super(3);
        this.a = b;
        this.b = kob1Var;
    }
}
