package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nt91 implements vr20 {
    public final /* synthetic */ tt91 a;

    public nt91(tt91 tt91Var) {
        this.a = tt91Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, lnm lnmVar) {
        mt91 mt91Var;
        tt91 tt91Var;
        mmr0 mmr0Var;
        MessageResponseToken messageResponseToken;
        SnackBarTemplate snackBarTemplate;
        MessageResponseToken messageResponseToken2;
        Message.CreativeMessage messageData;
        if (lnmVar instanceof mt91) {
            mt91Var = (mt91) lnmVar;
            int i = mt91Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mt91Var.d = i - Integer.MIN_VALUE;
            } else {
                mt91Var = new mt91(this, lnmVar);
            }
        } else {
            mt91Var = new mt91(this, lnmVar);
        }
        Object obj = mt91Var.b;
        int i2 = mt91Var.d;
        String strButtonText = null;
        if (i2 == 0) {
            hm5.M(obj);
            if (z && (mmr0Var = (tt91Var = this.a).l) != null && (messageResponseToken = (MessageResponseToken) mmr0Var.a) != null) {
                tt91Var.c.a(messageResponseToken);
                mmr0 mmr0Var2 = tt91Var.l;
                if (((Format.SnackBar) ((mmr0Var2 == null || (messageResponseToken2 = (MessageResponseToken) mmr0Var2.a) == null || (messageData = messageResponseToken2.getMessageData()) == null) ? null : messageData.getFormat())).getAutoDismissEnabled()) {
                    mmr0 mmr0Var3 = tt91Var.l;
                    if (mmr0Var3 != null && (snackBarTemplate = (SnackBarTemplate) mmr0Var3.b) != null) {
                        strButtonText = snackBarTemplate.buttonText();
                    }
                    if (strButtonText != null && strButtonText.length() == 0) {
                        strButtonText = "Done";
                    }
                    int i3 = (strButtonText == null || strButtonText.length() <= 0) ? 3000 : 5000;
                    mt91Var.a = tt91Var;
                    mt91Var.d = 1;
                    Object objI = hap1.i(i3, mt91Var);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tt91Var = mt91Var.a;
        hm5.M(obj);
        sox0 sox0Var = tt91Var.m;
        if (sox0Var != null && sox0Var.b.a.getValue() == wox0.b) {
            sox0Var.c.a.b();
        }
        return rih1.a;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, lnm lnmVar) {
        return b(((Boolean) obj).booleanValue(), lnmVar);
    }
}
