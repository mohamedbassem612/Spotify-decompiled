package p;

import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lr90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Parcelable h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lr90(c380 c380Var, qim0 qim0Var, hcx hcxVar, hux huxVar, int i, gbx gbxVar, String str, int i2, int i3) {
        super(2);
        this.a = (byte) 0;
        this.f = c380Var;
        this.b = qim0Var;
        this.g = hcxVar;
        this.h = huxVar;
        this.c = i;
        this.i = gbxVar;
        this.t = str;
        this.d = i2;
        this.e = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.t;
        Object obj4 = this.i;
        MessageTemplate messageTemplate = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.e;
                qim0 qim0Var = this.b;
                byte b3 = this.c;
                x2g0.i((c380) obj6, qim0Var, (hcx) obj5, (hux) messageTemplate, b3, (gbx) obj4, (String) obj3, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b4 = this.e;
                qim0 qim0Var2 = this.b;
                ((gr91) obj6).b((Button) obj5, messageTemplate, (iu30) obj4, qim0Var2, (zzq0) obj3, this.c, (b0k) obj, iP2, b4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b5 = this.e;
                qim0 qim0Var3 = this.b;
                ((k4f1) obj6).b((Button) obj5, messageTemplate, (iu30) obj4, qim0Var3, (zzq0) obj3, this.c, (b0k) obj, iP3, b5);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lr90(Object obj, Button button, MessageTemplate messageTemplate, iu30 iu30Var, qim0 qim0Var, zzq0 zzq0Var, int i, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.g = button;
        this.h = messageTemplate;
        this.i = iu30Var;
        this.b = qim0Var;
        this.t = zzq0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }
}
