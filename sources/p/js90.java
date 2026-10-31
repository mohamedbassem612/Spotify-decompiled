package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class js90 {
    public final ser a;

    public js90(ser serVar) {
        this.a = serVar;
    }

    public final void a(String str, fs90 fs90Var) {
        ks90 ks90Var;
        String str2 = nik1.x5.a;
        if (fs90Var instanceof ds90) {
            ks90Var = new ks90(1, ((ds90) fs90Var).a, null, null, false, false, 60);
        } else if (!(fs90Var instanceof es90)) {
            eg.o();
            return;
        } else {
            es90 es90Var = (es90) fs90Var;
            ks90Var = new ks90(2, 0, es90Var.a, es90Var.b, es90Var.c, es90Var.d, 2);
        }
        Bundle bundle = new Bundle();
        bundle.putString("jam_invite_learn_more_page_viewer_context_type_key", ab80.v(ks90Var.a));
        bundle.putString("jam_invite_learn_more_page_pending_requests_join_type_key", ab80.u(ks90Var.b));
        bundle.putString("jam_invite_learn_more_page_host_user_id_key", ks90Var.c);
        bundle.putString("jam_invite_learn_more_page_host_display_name_key", ks90Var.d);
        bundle.putBoolean("jam_invite_learn_more_page_host_approval_required_key", ks90Var.e);
        bundle.putBoolean("jam_invite_learn_more_page_can_block_host_key", ks90Var.f);
        this.a.a(str, str2, bundle);
    }
}
