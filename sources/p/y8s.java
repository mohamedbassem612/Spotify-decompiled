package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y8s extends hab0 implements bv30 {
    public final /* synthetic */ ldo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8s(ldo ldoVar) {
        super(5);
        this.a = ldoVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zfj0 zfj0Var = (zfj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        b0k b0kVar = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (p3d1.i(zfj0Var.a) instanceof TooltipTemplate.BaseTooltip) {
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.i0(-1650485485);
            int i = iIntValue >> 3;
            ((k4f1) this.a.d).a(zfj0Var, iu30Var, b0kVar2, (i & 112) | (i & 14) | 8);
            b0kVar2.r(false);
        } else {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(374591743);
            x340Var.r(false);
        }
        return rih1.a;
    }
}
