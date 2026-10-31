package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n9j0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AccessoryImage b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ ksl d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ecx f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n9j0(AccessoryImage accessoryImage, qim0 qim0Var, ksl kslVar, float f, ecx ecxVar, float f2, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = accessoryImage;
        this.c = qim0Var;
        this.d = kslVar;
        this.e = f;
        this.f = ecxVar;
        this.g = f2;
        this.h = i;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.i;
                y9j0.m(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.i;
                y9j0.m(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
