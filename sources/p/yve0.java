package p;

import android.widget.ImageView;
import com.spotify.login.loginflowimpl.LoginActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yve0 implements oh30 {
    public final /* synthetic */ LoginActivity a;
    public final /* synthetic */ ImageView b;

    public yve0(LoginActivity loginActivity, ImageView imageView) {
        this.a = loginActivity;
        this.b = imageView;
    }

    public final void onBackStackChanged() {
        int i = LoginActivity.p1;
        this.b.setVisibility(((dg30) this.a).U0.t().G("flow_fragment") instanceof z0d1 ? 0 : 8);
    }
}
