package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ef80 implements r4j0 {
    public final Context a;
    public final w7q0 b;
    public final y4q0 c;
    public final v1q0 d;
    public final rd80 e;
    public mmr0 f;
    public Function0 g;
    public final idd1 h = new idd1(new cf80(this, 2));

    public ef80(Context context, w7q0 w7q0Var, y4q0 y4q0Var, v1q0 v1q0Var, rd80 rd80Var) {
        this.a = context;
        this.b = w7q0Var;
        this.c = y4q0Var;
        this.d = v1q0Var;
        this.e = rd80Var;
    }

    @Override // p.r4j0
    public final void a(MessageResponseToken messageResponseToken, iu30 iu30Var) {
        this.f = new mmr0(messageResponseToken, iu30Var.invoke(messageResponseToken));
    }

    @Override // p.r4j0
    public final void b(Function0 function0) {
        this.g = function0;
    }

    public final void c() {
        ((ff80) d()).b.setVisibility(8);
    }

    public final f6j0 d() {
        return (f6j0) this.h.getValue();
    }

    @Override // p.r4j0
    public final void dismiss() {
        c();
    }
}
