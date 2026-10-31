package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus$Dismissed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PacingTimeUnit;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q741 {
    public final ljg a;
    public final ynb0 b;
    public final ynb0 c;
    public final gj5 d;
    public final lzn0 e;
    public final myq0 f;
    public final kt91 g;
    public final Context h;
    public final q8n i;

    public q741(ljg ljgVar, ynb0 ynb0Var, ynb0 ynb0Var2, gj5 gj5Var, lzn0 lzn0Var, myq0 myq0Var, kt91 kt91Var, Context context, q8n q8nVar) {
        this.a = ljgVar;
        this.b = ynb0Var;
        this.c = ynb0Var2;
        this.d = gj5Var;
        this.e = lzn0Var;
        this.f = myq0Var;
        this.g = kt91Var;
        this.h = context;
        this.i = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(f841 f841Var, onm onmVar) {
        p741 p741Var;
        slc0 slc0Var;
        String str;
        f841 f841Var2;
        f841 f841Var3;
        slc0 slc0Var2;
        MessagePresentationStatus messagePresentationStatus;
        Object objY;
        if (onmVar instanceof p741) {
            p741Var = (p741) onmVar;
            int i = p741Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p741Var.e = i - Integer.MIN_VALUE;
            } else {
                p741Var = new p741(this, onmVar);
            }
        } else {
            p741Var = new p741(this, onmVar);
        }
        p741 p741Var2 = p741Var;
        Object objJ = p741Var2.c;
        int i2 = p741Var2.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            slc0Var = new slc0(UUID.randomUUID().toString());
            int iOrdinal = f841Var.ordinal();
            if (iOrdinal == 0) {
                str = "samsung-account-linking-dialog";
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                str = "samsung-account-linking-nudge";
            }
            String str2 = str;
            String string = UUID.randomUUID().toString();
            Context context = this.h;
            Single singleC = ljg.c(this.a, "spotify:samsung-account-linking:v1", (TriggerType) null, (String) null, Collections.singletonList(new ClientMessage(str2, string, new Format.BottomSheet(new BottomSheetTemplate.RichBottomSheet((Signifier) null, (String) null, context.getString(2131961403), context.getString(2131961399), new Button("link_account", new ButtonStyle(context.getString(2131961398), (String) null, (String) null, (Icon) null, ButtonType.PRIMARY, (EncoreFont) null, (ButtonIconAlignment) null, 96, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) null, (Map) null, 4, (DefaultConstructorMarker) null)), new Button("not_now", new ButtonStyle(context.getString(2131961402), (String) null, (String) null, (Icon) null, ButtonType.TERTIARY, (EncoreFont) null, (ButtonIconAlignment) null, 96, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) null, (Map) null, 4, (DefaultConstructorMarker) null)))), Collections.singleton(new CappingRule.Impression(3)), new Pacing(8, PacingTimeUnit.DAYS))), (tv80) null, (uy31) null, (DynamicTagsMetadata) null, ConflictResolutionStrategy.DISCARD_SELF, (d3j0) null, 374);
            f841Var2 = f841Var;
            p741Var2.a = f841Var2;
            p741Var2.b = slc0Var;
            p741Var2.e = 1;
            objJ = fc11.j(singleC, p741Var2);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            slc0Var = p741Var2.b;
            f841Var2 = p741Var2.a;
            hm5.M(objJ);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objJ);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            slc0 slc0Var3 = p741Var2.b;
            f841 f841Var4 = p741Var2.a;
            hm5.M(objJ);
            f841Var3 = f841Var4;
            slc0Var2 = slc0Var3;
        }
        messagePresentationStatus = (MessagePresentationStatus) objJ;
        if (messagePresentationStatus != null && (messagePresentationStatus instanceof MessagePresentationStatus$Dismissed)) {
            p741Var2.a = null;
            p741Var2.b = null;
            p741Var2.e = 3;
            objY = fn31.Y(this.i, new n741((MessagePresentationStatus$Dismissed) messagePresentationStatus, this, slc0Var2, f841Var3, null), p741Var2);
            if (objY != d9nVar) {
                objY = rih1Var;
            }
            if (objY == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
        f841Var3 = f841Var2;
        slc0Var2 = slc0Var;
        MessageResponse.Success success = (MessageResponse) objJ;
        if (success instanceof MessageResponse.Success) {
            fu20 fu20Var = new fu20(yoi1.g(this.a.e().b(success.getMessageRequestId())), new sew0(new l811(), this, slc0Var2, f841Var3, (lnm) null, (byte) 18), (byte) 1);
            ck01 ck01Var = new ck01(2, (lnm) null, (byte) 9);
            p741Var2.a = f841Var3;
            p741Var2.b = slc0Var2;
            p741Var2.e = 2;
            objJ = b5p1.l(fu20Var, ck01Var, p741Var2);
            if (objJ != d9nVar) {
                messagePresentationStatus = (MessagePresentationStatus) objJ;
                if (messagePresentationStatus != null) {
                    p741Var2.a = null;
                    p741Var2.b = null;
                    p741Var2.e = 3;
                    objY = fn31.Y(this.i, new n741((MessagePresentationStatus$Dismissed) messagePresentationStatus, this, slc0Var2, f841Var3, null), p741Var2);
                    if (objY != d9nVar) {
                        objY = rih1Var;
                    }
                    if (objY == d9nVar) {
                    }
                }
            }
            return d9nVar;
        }
        return rih1Var;
    }
}
