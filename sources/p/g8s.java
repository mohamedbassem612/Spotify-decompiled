package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate$CustomBanner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g8s extends hab0 implements bv30 {
    public final /* synthetic */ ldo a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ h8a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8s(ldo ldoVar, qim0 qim0Var, h8a h8aVar) {
        super(5);
        this.a = ldoVar;
        this.b = qim0Var;
        this.c = h8aVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        o8j0 o8j0Var = (o8j0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        x5a x5aVar = (x5a) this.a.d;
        MessageTemplate messageTemplateI = p3d1.i(o8j0Var.a);
        if (messageTemplateI instanceof BannerTemplate.JitBanner) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1580496507);
            x340Var2.r(false);
        } else {
            boolean z = messageTemplateI instanceof BannerTemplate.BaseBanner;
            h8a h8aVar = this.c;
            if (z) {
                x340 x340Var3 = x340Var;
                x340Var3.i0(-743717374);
                int i = iIntValue >> 3;
                qim0 qim0Var = this.b;
                x5aVar.d(o8j0Var, iu30Var, qim0Var, h8aVar, x340Var3, (i & 112) | (i & 14) | 8 | 4096);
                x340Var3.r(false);
            } else if (messageTemplateI instanceof BannerTemplate.BasicBanner) {
                x340 x340Var4 = x340Var;
                x340Var4.i0(-743714493);
                int i2 = iIntValue >> 3;
                qim0 qim0Var2 = this.b;
                x5aVar.f(o8j0Var, iu30Var, qim0Var2, h8aVar, x340Var4, (i2 & 112) | (i2 & 14) | 8 | 4096);
                x340Var4.r(false);
            } else if (messageTemplateI instanceof BannerTemplate.RichBanner) {
                x340 x340Var5 = x340Var;
                x340Var5.i0(-743711614);
                int i3 = iIntValue >> 3;
                qim0 qim0Var3 = this.b;
                x5aVar.h(o8j0Var, iu30Var, qim0Var3, h8aVar, x340Var5, (i3 & 112) | (i3 & 14) | 8 | 4096);
                x340Var5.r(false);
            } else if (messageTemplateI instanceof BannerTemplate.SignifierBanner) {
                x340 x340Var6 = x340Var;
                x340Var6.i0(-743708601);
                int i4 = iIntValue >> 3;
                qim0 qim0Var4 = this.b;
                x5aVar.i(o8j0Var, iu30Var, qim0Var4, h8aVar, x340Var6, (i4 & 112) | (i4 & 14) | 8 | 4096);
                x340Var6.r(false);
            } else if (messageTemplateI instanceof BannerTemplate$CustomBanner) {
                x340 x340Var7 = x340Var;
                x340Var7.i0(-1580036219);
                x340Var7.r(false);
            } else {
                x340 x340Var8 = x340Var;
                x340Var8.i0(-1579988603);
                x340Var8.r(false);
            }
        }
        return rih1.a;
    }
}
