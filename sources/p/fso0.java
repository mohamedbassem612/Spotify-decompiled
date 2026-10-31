package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/fso0;", "Lp/zf30;", "<init>", "()V", "p/zko1", "src_main_java_com_spotify_notifications_permissionsimpl-permissionsimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class fso0 extends zf30 {
    public kqi0 F1;
    public fxy0 G1;
    public twy0 H1;
    public final znb0 I1 = dm5.S(3, new ivn0(this, (byte) 12));
    public final pf30 J1 = a0(new cj8(this, 5), new e1r0((byte) 3, false));

    public final void G0() {
        String string;
        ((zf30) this).h1 = true;
        if (Build.VERSION.SDK_INT >= 33) {
            if (Y0().c) {
                return;
            }
            Y0().b = ag0.C0(N0(), "android.permission.POST_NOTIFICATIONS");
            Y0().c = true;
            this.J1.a(new String[]{"android.permission.POST_NOTIFICATIONS"});
            return;
        }
        gso0 gso0VarY0 = Y0();
        gso0VarY0.b = false;
        gso0VarY0.c = false;
        Bundle bundle = ((zf30) this).f;
        if (bundle != null && (string = bundle.getString("request_id")) != null) {
            twy0 twy0Var = this.H1;
            if (twy0Var == null) {
                u890.C("pushPermissionActiveRequestDelegate");
                throw null;
            }
            twy0Var.a(string);
        }
        nu9 nu9Var = new nu9(j0());
        nu9Var.m(this);
        nu9Var.g(true, true);
    }

    public final gso0 Y0() {
        return (gso0) this.I1.getValue();
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super.v0(context);
    }

    public final void y0() {
        String string;
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 == null || !dg30VarF0.isChangingConfigurations()) {
            gso0 gso0VarY0 = Y0();
            gso0VarY0.b = false;
            gso0VarY0.c = false;
            Bundle bundle = ((zf30) this).f;
            if (bundle != null && (string = bundle.getString("request_id")) != null) {
                twy0 twy0Var = this.H1;
                if (twy0Var == null) {
                    u890.C("pushPermissionActiveRequestDelegate");
                    throw null;
                }
                twy0Var.a(string);
            }
        }
        ((zf30) this).h1 = true;
    }
}
