package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o9j0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MessageTemplate b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9j0(MessageTemplate messageTemplate, byte b) {
        super(2);
        this.a = b;
        this.b = messageTemplate;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        byte b = this.a;
        MessageTemplate messageTemplate = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-101926307);
                if ((messageTemplate instanceof BannerTemplate) || (messageTemplate instanceof InlineCardTemplate) || (messageTemplate instanceof ModalTemplate) || (messageTemplate instanceof FullscreenTemplate) || (messageTemplate instanceof BottomSheetTemplate)) {
                    x340Var.i0(-689998212);
                    uwr uwrVar = cbx.a;
                    j = cbx.a(x340Var).a.c;
                    x340Var.r(false);
                } else if ((messageTemplate instanceof TooltipTemplate) || (messageTemplate instanceof SnackBarTemplate)) {
                    x340Var.i0(-689994845);
                    x340Var.r(false);
                    j = u7h.j;
                } else {
                    x340Var.i0(-689993212);
                    uwr uwrVar2 = cbx.a;
                    j = cbx.a(x340Var).c.c;
                    x340Var.r(false);
                }
                return p3d1.l(x340Var, false, j);
            case 1:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                x340Var2.i0(-934881124);
                if ((messageTemplate instanceof BannerTemplate) || (messageTemplate instanceof InlineCardTemplate) || (messageTemplate instanceof ModalTemplate) || (messageTemplate instanceof FullscreenTemplate) || (messageTemplate instanceof BottomSheetTemplate)) {
                    x340Var2.i0(-921900579);
                    uwr uwrVar3 = cbx.a;
                    j2 = cbx.a(x340Var2).b.a;
                    x340Var2.r(false);
                } else if ((messageTemplate instanceof TooltipTemplate) || (messageTemplate instanceof SnackBarTemplate)) {
                    x340Var2.i0(-921898075);
                    uwr uwrVar4 = cbx.a;
                    j2 = cbx.a(x340Var2).b.c;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-921895683);
                    uwr uwrVar5 = cbx.a;
                    j2 = cbx.a(x340Var2).b.a;
                    x340Var2.r(false);
                }
                return p3d1.l(x340Var2, false, j2);
            default:
                ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj;
                x340Var3.i0(-1458183241);
                if ((messageTemplate instanceof BannerTemplate) || (messageTemplate instanceof InlineCardTemplate) || (messageTemplate instanceof BottomSheetTemplate)) {
                    x340Var3.i0(-1853246463);
                    uwr uwrVar6 = cbx.a;
                    j3 = cbx.a(x340Var3).b.a;
                    x340Var3.r(false);
                } else if ((messageTemplate instanceof TooltipTemplate) || (messageTemplate instanceof SnackBarTemplate)) {
                    x340Var3.i0(-1853243959);
                    uwr uwrVar7 = cbx.a;
                    j3 = cbx.a(x340Var3).b.c;
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1853241567);
                    uwr uwrVar8 = cbx.a;
                    j3 = cbx.a(x340Var3).b.a;
                    x340Var3.r(false);
                }
                return p3d1.l(x340Var3, false, j3);
        }
    }
}
