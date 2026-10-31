package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pd3 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kly0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd3(mu01 mu01Var, kly0 kly0Var) {
        super(0);
        this.a = (byte) 12;
        this.b = kly0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 0:
                return (u0w0) kly0Var.get();
            case 1:
                return (p1r0) kly0Var.get();
            case 2:
                return (y2n1) ((RetrofitMaker) kly0Var.get()).createWebgateService(y2n1.class, "android-yourupdates-actionserviceimpl");
            case 3:
                return (kb00) kly0Var.get();
            case 4:
                return (cv41) kly0Var.get();
            case 5:
                return (zfb0) kly0Var.get();
            case 6:
                return Boolean.valueOf(((ib4) kly0Var.get()).a());
            case 7:
                return (c460) kly0Var.get();
            case 8:
                return (kl80) kly0Var.get();
            case 9:
                return (cld0) kly0Var.get();
            case 10:
                return (c460) kly0Var.get();
            case 11:
                return (c460) kly0Var.get();
            case 12:
                urx urxVar = urx.c;
                String str = nik1.x0.a;
                uzl0 uzl0Var = (uzl0) kly0Var.get();
                uzl0Var.getClass();
                return new huz(new kh81(urxVar, 2131962460, str, null, new jh81(new qzl0(uzl0Var), atz0.X0), null, 82), (byte) 10);
            case 13:
                k911 k911Var = (k911) kly0Var.get();
                return new l911(1, k911Var.a, k911Var.b);
            case 14:
                return (hd61) kly0Var.get();
            case 15:
                knx knxVar = knx.c;
                String str2 = nik1.W0.a;
                uzl0 uzl0Var2 = (uzl0) kly0Var.get();
                uzl0Var2.getClass();
                return new huz(new kh81(knxVar, 2131962461, str2, null, new jh81(new rzl0(uzl0Var2), qr51.a1), null, 82), (byte) 10);
            default:
                return o7h.l1((Iterable) kly0Var.get());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd3(kly0 kly0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kly0Var;
    }
}
