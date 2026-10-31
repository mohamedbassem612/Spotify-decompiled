package p;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tpf1 extends l570 {
    public final pd80 b;
    public final zpg0 c;
    public final Context d;
    public final iac0 e;
    public final Scheduler f;
    public final rku g;

    public tpf1(ConstraintLayout constraintLayout, pd80 pd80Var, zpg0 zpg0Var, Context context, iac0 iac0Var, Scheduler scheduler) {
        super(constraintLayout);
        this.b = pd80Var;
        this.c = zpg0Var;
        this.d = context;
        this.e = iac0Var;
        this.f = scheduler;
        this.g = new rku();
    }

    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        try {
            MessageResponseToken messageResponseToken = (MessageResponseToken) this.c.b(y570Var.g());
            if (p3d1.i(messageResponseToken) instanceof InlineCardTemplate.Undefined) {
                return;
            }
            this.g.b(pd80.a(this.b, this.d, this.e, messageResponseToken, (DynamicTagsMetadata) null, 24).observeOn(this.f).subscribe(new z2a1(this, (byte) 20)));
        } catch (Exception e) {
            Logger.d(l1d.m("Failed to build Inline Card from hubsComponent: ", e.getMessage()), new Object[0]);
        }
    }

    public final void b(int... iArr) {
    }
}
