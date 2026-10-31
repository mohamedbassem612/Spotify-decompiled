package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus$Dismissed;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jhr implements Consumer {
    public final /* synthetic */ mhr a;

    public jhr(mhr mhrVar) {
        this.a = mhrVar;
    }

    public final void accept(Object obj) {
        MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj;
        mhr mhrVar = this.a;
        ljg ljgVar = mhrVar.g;
        qhr qhrVar = mhrVar.h;
        vku vkuVar = mhrVar.l;
        mmr0 mmr0Var = mhrVar.n;
        hhr hhrVar = mhrVar.i;
        if ((mmr0Var != null ? (String) mmr0Var.a : null) != null) {
            String triggerPattern = messagePresentationStatus.getTriggerPattern();
            mmr0 mmr0Var2 = mhrVar.n;
            if (u890.j(triggerPattern, mmr0Var2 != null ? (String) mmr0Var2.a : null) && (messagePresentationStatus instanceof MessagePresentationStatus$Dismissed)) {
                DismissReason dismissReason = ((MessagePresentationStatus$Dismissed) messagePresentationStatus).getDismissReason();
                if (dismissReason instanceof DismissReason.BackgroundViewTapped) {
                    mmr0 mmr0Var3 = mhrVar.n;
                    mmr0Var3.getClass();
                    hhrVar.b(1, (String) mmr0Var3.a);
                    mmr0 mmr0Var4 = mhrVar.n;
                    mmr0Var4.getClass();
                    vkuVar.a(qhrVar.a.map(new acn1(qhrVar, (String) mmr0Var4.a)).ignoreElement().subscribe());
                    mmr0 mmr0Var5 = mhrVar.n;
                    if (mmr0Var5 != null) {
                        ljgVar.b((String) mmr0Var5.b, DismissReason.ProgrammaticDismissal.INSTANCE);
                    }
                    mhrVar.n = null;
                    return;
                }
                if (dismissReason instanceof DismissReason.MessageSwiped) {
                    mmr0 mmr0Var6 = mhrVar.n;
                    mmr0Var6.getClass();
                    hhrVar.b(2, (String) mmr0Var6.a);
                    mmr0 mmr0Var7 = mhrVar.n;
                    mmr0Var7.getClass();
                    vkuVar.a(qhrVar.a.map(new acn1(qhrVar, (String) mmr0Var7.a)).ignoreElement().subscribe());
                    mmr0 mmr0Var8 = mhrVar.n;
                    if (mmr0Var8 != null) {
                        ljgVar.b((String) mmr0Var8.b, DismissReason.ProgrammaticDismissal.INSTANCE);
                    }
                    mhrVar.n = null;
                    return;
                }
                if (!(dismissReason instanceof DismissReason.BackButtonTapped)) {
                    if (dismissReason instanceof DismissReason.MessageButtonTapped) {
                        fn31.T(mhrVar.b, mhrVar.k, 0, new ihr(mhrVar, null, (byte) 1), 2);
                        return;
                    } else {
                        mhrVar.n = null;
                        return;
                    }
                }
                mmr0 mmr0Var9 = mhrVar.n;
                mmr0Var9.getClass();
                vkuVar.a(qhrVar.a.map(new acn1(qhrVar, (String) mmr0Var9.a)).ignoreElement().subscribe());
                mmr0 mmr0Var10 = mhrVar.n;
                if (mmr0Var10 != null) {
                    ljgVar.b((String) mmr0Var10.b, DismissReason.ProgrammaticDismissal.INSTANCE);
                }
                mhrVar.n = null;
            }
        }
    }
}
