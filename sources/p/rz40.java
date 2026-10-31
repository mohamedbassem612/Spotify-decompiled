package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/rz40;", "Lp/s5w0;", "<init>", "()V", "src_main_java_com_spotify_partneraccountlinking_googleassistant-googleassistant"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class rz40 extends s5w0 {
    public dh30 H1;
    public k0s I1;
    public ujb1 J1;
    public final rku K1 = new rku();

    public final void G0() {
        ((zf30) this).h1 = true;
        ujb1 ujb1Var = this.J1;
        if (ujb1Var == null) {
            u890.C("startLinkingFlowEventSource");
            throw null;
        }
        this.K1.b(ujb1Var.a.subscribe((Consumer) new od30(this, (byte) 7)));
    }

    public final void H0() {
        this.K1.a();
        ((zf30) this).h1 = true;
    }

    @Override // p.s5w0
    public final void Y0() {
        super.Y0();
        dh30 dh30Var = this.H1;
        if (dh30Var != null) {
            dh30Var.J(this, this.G1);
        } else {
            u890.C("googleAssistantLinkingFlow");
            throw null;
        }
    }

    @Override // p.s5w0
    public final void u0(int i, int i2, Intent intent) {
        super.u0(i, i2, intent);
        if (i != this.G1) {
            return;
        }
        k0s k0sVar = this.I1;
        if (i2 == -1) {
            if (k0sVar != null) {
                k0sVar.c.onNext(tlc0.b);
                return;
            } else {
                u890.C("googleAssistantLinker");
                throw null;
            }
        }
        if (k0sVar != null) {
            k0sVar.c.onNext(tlc0.a);
        } else {
            u890.C("googleAssistantLinker");
            throw null;
        }
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super.v0(context);
    }
}
