package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h8s extends hab0 implements bv30 {
    public final /* synthetic */ umf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8s(umf0 umf0Var) {
        super(5);
        this.a = umf0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        y8j0 y8j0Var = (y8j0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        hkr hkrVar = (hkr) this.a.e;
        MessageTemplate messageTemplateI = p3d1.i(y8j0Var.a);
        if (messageTemplateI instanceof BottomSheetTemplate.BasicBottomSheet) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(2003175776);
            int i = iIntValue >> 3;
            hkrVar.b(y8j0Var, iu30Var, x340Var2, (i & 112) | MessageResponseToken.$stable | (i & 14));
            x340Var2.r(false);
        } else if (messageTemplateI instanceof BottomSheetTemplate.RichBottomSheet) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(2003178527);
            int i2 = iIntValue >> 3;
            hkrVar.e(y8j0Var, iu30Var, x340Var3, (i2 & 112) | MessageResponseToken.$stable | (i2 & 14));
            x340Var3.r(false);
        } else if (messageTemplateI instanceof BottomSheetTemplate.FullBleedBottomSheet) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(2003181412);
            int i3 = iIntValue >> 3;
            hkrVar.d(y8j0Var, iu30Var, x340Var4, (i3 & 112) | MessageResponseToken.$stable | (i3 & 14));
            x340Var4.r(false);
        } else if (messageTemplateI instanceof BottomSheetTemplate.BaseBottomSheet) {
            x340 x340Var5 = x340Var;
            x340Var5.i0(2003184287);
            int i4 = iIntValue >> 3;
            hkrVar.a(y8j0Var, iu30Var, x340Var5, (i4 & 112) | MessageResponseToken.$stable | (i4 & 14));
            x340Var5.r(false);
        } else {
            x340 x340Var6 = x340Var;
            x340Var6.i0(1969204979);
            x340Var6.r(false);
        }
        return rih1.a;
    }
}
