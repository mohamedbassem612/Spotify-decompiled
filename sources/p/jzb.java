package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ImageStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate$CustomBottomSheet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jzb extends hab0 implements zu30 {
    public final /* synthetic */ ozb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzb(ozb ozbVar) {
        super(4);
        this.a = ozbVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        aqw m231Var;
        i0c i0cVar = (i0c) obj;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        MessageResponseToken messageResponseToken = i0cVar.a;
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(i0cVar) : x340Var.i(i0cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
            Object objT = x340Var2.T();
            Object obj5 = fkj0.X;
            if (objT == obj5) {
                objT = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            Object objT2 = x340Var2.T();
            ozb ozbVar = this.a;
            if (objT2 == obj5) {
                objT2 = new izb(c9nVar, ozbVar);
                x340Var2.s0(objT2);
            }
            izb izbVar = (izb) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == obj5) {
                ezb ezbVar = ozbVar.c;
                BottomSheetTemplate.BasicBottomSheet basicBottomSheet = (BottomSheetTemplate) p3d1.i(messageResponseToken);
                ezbVar.getClass();
                if (basicBottomSheet instanceof BottomSheetTemplate.BasicBottomSheet) {
                    BottomSheetTemplate.BasicBottomSheet basicBottomSheet2 = basicBottomSheet;
                    m231Var = new aqw(new dzb(ezbVar, (byte) 0), new y8j0(messageResponseToken, new q8j0(basicBottomSheet2.getHeadline(), basicBottomSheet2.getBody(), basicBottomSheet2.getPrimaryButton(), basicBottomSheet2.getSecondaryButton())));
                } else if (basicBottomSheet instanceof BottomSheetTemplate$CustomBottomSheet) {
                    m231Var = ((BottomSheetTemplate$CustomBottomSheet) basicBottomSheet).getElementAndProps();
                    if (m231Var == null) {
                        m231Var = new m231(new IllegalArgumentException("No custom element provider found for template: " + basicBottomSheet));
                    }
                } else if (basicBottomSheet instanceof BottomSheetTemplate.FullBleedBottomSheet) {
                    BottomSheetTemplate.FullBleedBottomSheet fullBleedBottomSheet = (BottomSheetTemplate.FullBleedBottomSheet) basicBottomSheet;
                    m231Var = new aqw(new dzb(ezbVar, (byte) 1), new y8j0(messageResponseToken, new r8j0(fullBleedBottomSheet.getHeadline(), fullBleedBottomSheet.getBody(), new AccessoryImage(fullBleedBottomSheet.getImageUrl(), ImageStyle.UNKNOWN_IMAGE_STYLE), fullBleedBottomSheet.getPrimaryButton(), fullBleedBottomSheet.getSecondaryButton())));
                } else if (basicBottomSheet instanceof BottomSheetTemplate.RichBottomSheet) {
                    dzb dzbVar = new dzb(ezbVar, (byte) 2);
                    BottomSheetTemplate.RichBottomSheet richBottomSheet = (BottomSheetTemplate.RichBottomSheet) basicBottomSheet;
                    String headline = richBottomSheet.getHeadline();
                    String body = richBottomSheet.getBody();
                    Signifier signifier = richBottomSheet.getSignifier();
                    String imageUrl = richBottomSheet.getImageUrl();
                    m231Var = new aqw(dzbVar, new y8j0(messageResponseToken, new s8j0(signifier, imageUrl != null ? new AccessoryImage(imageUrl, ImageStyle.SQUARE) : null, headline, body, richBottomSheet.getPrimaryButton(), richBottomSheet.getSecondaryButton())));
                } else if (basicBottomSheet instanceof BottomSheetTemplate.BaseBottomSheet) {
                    BottomSheetTemplate.BaseBottomSheet baseBottomSheet = (BottomSheetTemplate.BaseBottomSheet) basicBottomSheet;
                    m231Var = new aqw(new dzb(ezbVar, (byte) 3), new y8j0(messageResponseToken, new p8j0(baseBottomSheet.getHeaderContent(), baseBottomSheet.getAccessoryContent(), baseBottomSheet.getHeadline(), baseBottomSheet.getBody(), baseBottomSheet.getPrimaryButton(), baseBottomSheet.getSecondaryButton(), baseBottomSheet.getDisclaimer())));
                } else if (basicBottomSheet instanceof BottomSheetTemplate.Undefined) {
                    m231Var = new m231(new IllegalArgumentException("Undefined template cannot be used to create an element"));
                } else {
                    eg.o();
                    m231Var = null;
                }
                objT3 = new e331(m231Var);
                x340Var2.s0(objT3);
            }
            Object obj6 = ((e331) objT3).a;
            Throwable thA = e331.a(obj6);
            if (thA == null) {
                x340Var2.i0(-842593033);
                ((aqw) obj6).a(izbVar, (qe41) null, x340Var2, 0, 2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1538175885);
                boolean zI = x340Var2.i(izbVar) | ((iIntValue & 14) == 4 || ((iIntValue & 8) != 0 && x340Var2.i(i0cVar))) | x340Var2.i(thA);
                Object objT4 = x340Var2.T();
                if (zI || objT4 == obj5) {
                    objT4 = new fzb(izbVar, i0cVar, thA, null);
                    x340Var2.s0(objT4);
                }
                int i = MessageResponseToken.$stable;
                qxd0.t(messageResponseToken, x340Var2, (vu30) objT4);
                t1c.a(nim0.a, x340Var2, 6);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
