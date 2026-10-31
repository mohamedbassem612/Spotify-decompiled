package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t740 {
    public final dg30 a;
    public final ljg b;
    public final iae c;
    public final abm d;
    public final vku e = new vku();

    public t740(dg30 dg30Var, ljg ljgVar, iae iaeVar, abm abmVar) {
        this.a = dg30Var;
        this.b = ljgVar;
        this.c = iaeVar;
        this.d = abmVar;
        dg30Var.runOnUiThread(new a6n(this, (byte) 26));
    }

    public static /* synthetic */ void b(t740 t740Var, String str, String str2, tv80 tv80Var, String str3, int i) {
        if ((i & 4) != 0) {
            tv80Var = null;
        }
        tv80 tv80Var2 = tv80Var;
        if ((i & 8) != 0) {
            str3 = "spotify:gated-song:click";
        }
        t740Var.a(str, str2, str3, null, tv80Var2);
    }

    public final void a(String str, String str2, String str3, String str4, tv80 tv80Var) {
        if (str3.equals("spotify:windowed-song:click") && str4 != null && nhc1.Y(str4, "spotify:track:", false) && this.d.c()) {
            this.a.runOnUiThread(new uu1(this, str4, tv80Var, (byte) 15));
        } else {
            Disposable disposableSubscribe = this.b.a(str3, (152 & 2) != 0 ? TriggerType.CLIENT_EVENT : null, (152 & 8) != 0 ? z6x.a : null, (152 & 16) != 0 ? null : tv80Var, (152 & 4) != 0 ? "" : null, (152 & 32) != 0 ? vks.a : null, (152 & 64) != 0 ? new DynamicTagsMetadata(null, null, null, null, 15, null) : new DynamicTagsMetadata(str, null, null, str2, 6, null), (152 & 128) != 0 ? ConflictResolutionStrategy.DISCARD_SELF : null, (152 & 256) != 0 ? new d3j0(new z2j0(false), x2j0.a) : null).subscribe();
            disposableSubscribe.getClass();
            this.e.a(disposableSubscribe);
        }
    }
}
