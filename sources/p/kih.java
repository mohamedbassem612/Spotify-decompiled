package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kih extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kih(int i, Function0 function0, yf yfVar, hux huxVar, max maxVar, int i2, int i3) {
        super(2);
        this.b = i;
        this.e = function0;
        this.f = yfVar;
        this.g = huxVar;
        this.h = maxVar;
        this.c = i2;
        this.d = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.d;
                int i2 = this.b;
                ((oih) obj5).e((String) obj6, i2, (qim0) obj4, (iu30) obj3, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.d;
                int i3 = this.b;
                d3p1.d(i3, (Function0) obj5, (yf) obj6, (hux) obj4, (max) obj3, (b0k) obj, iP2, b3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.d;
                int i4 = this.b;
                y9j0.h((HeaderContent) obj5, (MessageTemplate) obj6, (qim0) obj4, i4, (djc0) obj3, (b0k) obj, iP3, b4);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                int i5 = this.b;
                byte b5 = this.d;
                zro1.l((String) obj6, (hux) obj5, i5, b5, (iu30) obj3, (qim0) obj4, (b0k) obj, iP4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                byte b6 = this.d;
                cvd1.j((String) obj6, (c380) obj5, (xsq) obj4, (d0r) obj3, this.b, (b0k) obj, iP5, b6);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kih(HeaderContent headerContent, MessageTemplate messageTemplate, qim0 qim0Var, int i, djc0 djc0Var, int i2, int i3) {
        super(2);
        this.e = headerContent;
        this.f = messageTemplate;
        this.g = qim0Var;
        this.b = i;
        this.h = djc0Var;
        this.c = i2;
        this.d = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kih(String str, hux huxVar, int i, int i2, iu30 iu30Var, qim0 qim0Var, int i3) {
        super(2);
        this.f = str;
        this.e = huxVar;
        this.b = i;
        this.d = i2;
        this.h = iu30Var;
        this.g = qim0Var;
        this.c = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kih(String str, c380 c380Var, xsq xsqVar, d0r d0rVar, int i, int i2, int i3) {
        super(2);
        this.f = str;
        this.e = c380Var;
        this.g = xsqVar;
        this.h = d0rVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kih(oih oihVar, String str, int i, qim0 qim0Var, iu30 iu30Var, int i2, int i3) {
        super(2);
        this.e = oihVar;
        this.f = str;
        this.b = i;
        this.g = qim0Var;
        this.h = iu30Var;
        this.c = i2;
        this.d = i3;
    }
}
