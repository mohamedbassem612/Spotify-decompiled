package p;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/oso0;", "Lp/zf30;", "<init>", "()V", "p/v9c", "src_main_java_com_spotify_notifications_permissionsimpl-permissionsimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class oso0 extends zf30 {
    public i8h1 F1;
    public lcs G1;
    public uwy0 H1;
    public zso0 J1;
    public kqi0 L1;
    public twy0 M1;
    public boolean N1;
    public hxy0 I1 = hxy0.UNKNOWN;
    public iu30 K1 = cmo0.i;

    public final void Y0(exy0 exy0Var) {
        if (this.N1) {
            return;
        }
        this.N1 = true;
        iu30 iu30Var = this.K1;
        kqi0 kqi0Var = this.L1;
        iu30Var.invoke(new gxy0(kqi0Var != null ? kqi0Var.m() : null, exy0Var));
    }

    public final void Z0() {
        String string;
        twy0 twy0Var;
        Bundle bundle = ((zf30) this).f;
        if (bundle != null && (string = bundle.getString("request_id")) != null && (twy0Var = this.M1) != null) {
            twy0Var.a(string);
        }
        nu9 nu9Var = new nu9(j0());
        nu9Var.m(this);
        nu9Var.g(true, true);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null || this.H1 != null) {
            return;
        }
        nu9 nu9Var = new nu9(j0());
        nu9Var.m(this);
        nu9Var.g(true, true);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(new j2i(792421173, new nso0(this, (byte) 0), true));
        return composeView;
    }

    public final void y0() {
        String string;
        twy0 twy0Var;
        Bundle bundle = ((zf30) this).f;
        if (bundle != null && (string = bundle.getString("request_id")) != null && (twy0Var = this.M1) != null) {
            twy0Var.a(string);
        }
        Y0(xwy0.a);
        ((zf30) this).h1 = true;
    }
}
