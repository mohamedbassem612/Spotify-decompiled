package p;

import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class md60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public md60(String str, long j, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = (byte) 0;
        this.d = str;
        this.b = j;
        this.e = qim0Var;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                byte b3 = this.c;
                ioo1.n((String) obj4, this.b, (qim0) obj3, (b0k) obj, iP, b3);
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Button button = (Button) obj4;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    long jP = v9p1.P(this.b, button.getStyle().getTextColor());
                    uwr uwrVar = cbx.a;
                    y9j0.q(button.getStyle().getText(), jP, cbx.d(x340Var2).h, (djc0) obj3, 2, (qim0) null, this.c, (iu30) null, (String) null, x340Var2, 0, 416);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                tgp1.e(b2 | 1, this.b, (b0k) obj, (vu30) obj3, (x291) obj4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(b2 | 1);
                oon1.g((hux) obj4, this.b, (Function0) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ md60(Parcelable parcelable, long j, Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.d = parcelable;
        this.b = j;
        this.e = obj;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public md60(int i, long j, vu30 vu30Var, x291 x291Var) {
        super(2);
        this.a = (byte) 2;
        this.b = j;
        this.d = x291Var;
        this.e = vu30Var;
        this.c = i;
    }
}
