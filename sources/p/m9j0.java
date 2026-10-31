package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m9j0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ cv30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m9j0(hux huxVar, MessageTemplate messageTemplate, ksl kslVar, qim0 qim0Var, long j, float f, Function0 function0, int i, int i2) {
        super(2);
        this.g = huxVar;
        this.h = messageTemplate;
        this.i = kslVar;
        this.b = qim0Var;
        this.d = j;
        this.c = f;
        this.t = function0;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        j2i j2iVar = this.t;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) j2iVar;
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                y9j0.l((hux) obj5, (MessageTemplate) obj4, (ksl) obj3, this.b, this.d, this.c, function0, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                qim0 qim0Var = this.b;
                float f = this.c;
                long j = this.d;
                ggo1.s((tob1) obj5, (j2i) obj4, qim0Var, f, j, (iu30) obj3, j2iVar, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m9j0(tob1 tob1Var, j2i j2iVar, qim0 qim0Var, float f, long j, iu30 iu30Var, j2i j2iVar2, int i, int i2) {
        super(2);
        this.g = tob1Var;
        this.h = j2iVar;
        this.b = qim0Var;
        this.c = f;
        this.d = j;
        this.i = iu30Var;
        this.t = j2iVar2;
        this.e = i;
        this.f = i2;
    }
}
