package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ff80 implements f6j0 {
    public final View a;
    public final ViewGroup b;

    public ff80(Context context, rd80 rd80Var, df80 df80Var, MessageResponseToken messageResponseToken) {
        aqw m231Var;
        InlineCardTemplate.CompactInlineCard compactInlineCard = (InlineCardTemplate) p3d1.i(messageResponseToken);
        byte b = 1;
        View view = null;
        if (compactInlineCard instanceof InlineCardTemplate.CompactInlineCard) {
            InlineCardTemplate.CompactInlineCard compactInlineCard2 = compactInlineCard;
            m231Var = new aqw(new qd80(rd80Var, (byte) 0), new lbj0(messageResponseToken, new gbj0(compactInlineCard2.getSignifier(), null, compactInlineCard2.getHeadline(), compactInlineCard2.getBackgroundColor(), compactInlineCard2.getBody(), compactInlineCard2.getAccessoryContent(), null, null, compactInlineCard2.getCardButton(), null, 706), "messaging_inlinecard_compact"));
        } else if (compactInlineCard instanceof InlineCardTemplate.StandardInlineCard) {
            InlineCardTemplate.StandardInlineCard standardInlineCard = (InlineCardTemplate.StandardInlineCard) compactInlineCard;
            m231Var = new aqw(new qd80(rd80Var, b), new lbj0(messageResponseToken, new gbj0(standardInlineCard.getSignifier(), null, standardInlineCard.getHeadline(), standardInlineCard.getBackgroundColor(), standardInlineCard.getBody(), standardInlineCard.getAccessoryContent(), standardInlineCard.getPrimaryButton(), null, null, standardInlineCard.getCloseButton(), 386), "messaging_inlinecard_standard"));
        } else if (compactInlineCard instanceof InlineCardTemplate.MicroCompactInlineCard) {
            InlineCardTemplate.MicroCompactInlineCard microCompactInlineCard = (InlineCardTemplate.MicroCompactInlineCard) compactInlineCard;
            m231Var = new aqw(new qd80(rd80Var, (byte) 2), new lbj0(messageResponseToken, new gbj0(microCompactInlineCard.getSignifier(), null, microCompactInlineCard.getHeadline(), microCompactInlineCard.getBackgroundColor(), null, microCompactInlineCard.getAccessoryContent(), null, null, microCompactInlineCard.getCardButton(), null, 722), "messaging_inlinecard_micro_compact"));
        } else if (compactInlineCard instanceof InlineCardTemplate.BaseInlineCard) {
            InlineCardTemplate.BaseInlineCard baseInlineCard = (InlineCardTemplate.BaseInlineCard) compactInlineCard;
            m231Var = new aqw(new qd80(rd80Var, (byte) 3), new lbj0(messageResponseToken, new gbj0(null, baseInlineCard.getHeaderContent(), baseInlineCard.getHeadline(), baseInlineCard.getBackgroundColor(), baseInlineCard.getBody(), baseInlineCard.getAccessoryContent(), baseInlineCard.getPrimaryButton(), baseInlineCard.getSecondaryButton(), baseInlineCard.getCardButton(), baseInlineCard.getDismissButton(), 1), "messaging_inlinecard_base"));
        } else if (compactInlineCard instanceof InlineCardTemplate.Undefined) {
            m231Var = new m231(new IllegalArgumentException("Undefined template cannot be used to create an element"));
        } else {
            eg.o();
            m231Var = null;
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            df80Var.a(messageResponseToken, new DiscardReason$PresentationFailed(l1d.m("Unable to create Element for InlineCardTemplate: ", thA.getMessage())));
            m231Var = null;
        }
        aqw aqwVar = m231Var;
        if (aqwVar != null) {
            Object obj = aqwVar.b;
            tka0 tka0Var = dtw.C;
            view = mhc.b(context, new FrameLayout(context), new qtw((maa) aqwVar.a.invoke(df80Var), new ViewGroup.LayoutParams(-1, -2), ((lbj0) obj).c), obj, (ipb1) null, 112).w;
        }
        this.a = view;
        this.b = (ViewGroup) new idd1(new x680(this, context, (byte) 1)).getValue();
    }
}
