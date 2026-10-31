package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j8s extends hab0 implements bv30 {
    public final /* synthetic */ ldo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8s(ldo ldoVar) {
        super(5);
        this.a = ldoVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ksw kswVar = (ksw) obj;
        lbj0 lbj0Var = (lbj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        af80 af80Var = (af80) this.a.d;
        MessageTemplate messageTemplateI = p3d1.i(lbj0Var.a);
        if (messageTemplateI instanceof InlineCardTemplate.CompactInlineCard) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1349910415);
            af80Var.a(kswVar, lbj0Var, iu30Var, x340Var2, (iIntValue & 896) | (iIntValue & 14) | 64 | (iIntValue & 112));
            x340Var2.r(false);
        } else if (messageTemplateI instanceof InlineCardTemplate.StandardInlineCard) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1350054286);
            af80Var.e(kswVar, lbj0Var, iu30Var, x340Var3, (iIntValue & 896) | (iIntValue & 14) | 64 | (iIntValue & 112));
            x340Var3.r(false);
        } else if (messageTemplateI instanceof InlineCardTemplate.MicroCompactInlineCard) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(1350203210);
            af80Var.c(kswVar, lbj0Var, iu30Var, x340Var4, (iIntValue & 896) | (iIntValue & 14) | 64 | (iIntValue & 112));
            x340Var4.r(false);
        } else if (messageTemplateI instanceof InlineCardTemplate.BaseInlineCard) {
            x340 x340Var5 = x340Var;
            x340Var5.i0(1350364286);
            gbj0 gbj0Var = lbj0Var.b;
            if (gbj0Var.j != null) {
                x340Var5.i0(1350414165);
                af80Var.e(kswVar, lbj0Var, iu30Var, x340Var5, (iIntValue & 896) | (iIntValue & 14) | 64 | (iIntValue & 112));
                x340Var5.r(false);
            } else if (gbj0Var.e != null) {
                x340Var5.i0(1350601746);
                af80Var.a(kswVar, lbj0Var, iu30Var, x340Var5, (iIntValue & 896) | (iIntValue & 14) | 64 | (iIntValue & 112));
                x340Var5.r(false);
            } else {
                x340Var5.i0(1350773951);
                af80Var.c(kswVar, lbj0Var, iu30Var, x340Var5, (iIntValue & 896) | (iIntValue & 14) | 64 | (iIntValue & 112));
                x340Var5.r(false);
            }
            x340Var5.r(false);
        } else {
            x340 x340Var6 = x340Var;
            x340Var6.i0(1350977032);
            x340Var6.r(false);
        }
        return rih1.a;
    }
}
