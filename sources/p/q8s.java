package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q8s implements paj0 {
    public final /* synthetic */ paj0 a;
    public final /* synthetic */ r8s b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ ven0 d;

    public q8s(r8s r8sVar, iu30 iu30Var, ven0 ven0Var) {
        this.b = r8sVar;
        this.c = iu30Var;
        this.d = ven0Var;
        this.a = (paj0) r8sVar.e;
    }

    @Override // p.paj0
    public final void a(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed) {
        this.a.a(messageResponseToken, discardReason$PresentationFailed);
    }

    @Override // p.paj0
    public final void c(MessageResponseToken messageResponseToken) {
        this.a.c(messageResponseToken);
    }

    @Override // p.paj0
    public final void d(Set set) {
        this.c.invoke(new gfj0(set));
    }

    @Override // p.paj0
    public final void e() {
        ((paj0) this.b.e).e();
        this.d.setValue(Boolean.TRUE);
    }

    @Override // p.paj0
    public final void f(MessageResponseToken messageResponseToken, Button button) {
        this.a.f(messageResponseToken, button);
    }

    @Override // p.paj0
    public final void g(MessageResponseToken messageResponseToken) {
        this.a.g(messageResponseToken);
    }

    @Override // p.paj0
    public final void h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        this.a.h(bundle, dismissType, messageResponseToken, button);
    }

    @Override // p.paj0
    public final void i(int i) {
        this.a.i(i);
    }

    @Override // p.paj0
    public final void j(MessageResponseToken messageResponseToken) {
        this.a.j(messageResponseToken);
    }

    @Override // p.paj0
    public final void k() {
        ((paj0) this.b.e).k();
        this.c.invoke(dfj0.a);
    }

    @Override // p.paj0
    public final void l(MessageResponseToken messageResponseToken) {
        this.a.l(messageResponseToken);
    }
}
