package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g9j0 extends hab0 implements vu30 {
    public final /* synthetic */ AccessoryContent a;
    public final /* synthetic */ MessageTemplate b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ ecx g;
    public final /* synthetic */ float h;
    public final /* synthetic */ int i;
    public final /* synthetic */ short t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g9j0(AccessoryContent accessoryContent, MessageTemplate messageTemplate, qim0 qim0Var, qim0 qim0Var2, float f, float f2, ecx ecxVar, float f3, int i, int i2) {
        super(2);
        this.a = accessoryContent;
        this.b = messageTemplate;
        this.c = qim0Var;
        this.d = qim0Var2;
        this.e = f;
        this.f = f2;
        this.g = ecxVar;
        this.h = f3;
        this.i = i;
        this.t = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        y9j0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, czo1.p(this.i | 1), this.t);
        return rih1.a;
    }
}
