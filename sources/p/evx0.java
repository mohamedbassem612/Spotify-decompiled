package p;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class evx0 implements oi30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fvx0 b;

    public /* synthetic */ evx0(fvx0 fvx0Var, byte b) {
        this.a = b;
        this.b = fvx0Var;
    }

    public final void q(Bundle bundle, String str) {
        Serializable serializable;
        Object serializable2;
        Serializable serializable3;
        byte b = this.a;
        fvx0 fvx0Var = this.b;
        switch (b) {
            case 0:
                y11 y11Var = fvx0Var.e;
                if (Build.VERSION.SDK_INT < 33) {
                    Serializable serializable4 = bundle.getSerializable("more_option_selected_key");
                    if (serializable4 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.aiplaylist.moreoptionsmenuimpl.MoreOptions");
                    } else {
                        serializable = (klm0) serializable4;
                    }
                } else {
                    serializable = bundle.getSerializable("more_option_selected_key", klm0.class);
                    if (serializable == null) {
                        hhg1.n("Required value was null.");
                    }
                }
                jlm0 jlm0Var = (klm0) serializable;
                if (jlm0Var instanceof jlm0) {
                    y11Var.accept(new rsx0(jlm0Var.a));
                } else if (!(jlm0Var instanceof ilm0)) {
                    eg.o();
                } else {
                    y11Var.accept(orx0.a);
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT < 33) {
                    Object serializable5 = bundle.getSerializable("create_playlist_failure_fragment_result_key");
                    if (serializable5 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.aiplaylist.promptcreation.presentation.tracklist.CreatePlaylistFailureAlertFragment.Result");
                    } else {
                        serializable2 = (epn) serializable5;
                    }
                } else {
                    serializable2 = bundle.getSerializable("create_playlist_failure_fragment_result_key", epn.class);
                    if (serializable2 == null) {
                        hhg1.n("Required value was null.");
                    }
                }
                if (zux0.a[((epn) serializable2).ordinal()] != 1) {
                    eg.o();
                } else {
                    fvx0Var.e.accept(new srx0(null));
                }
                break;
            default:
                y11 y11Var2 = fvx0Var.e;
                if (Build.VERSION.SDK_INT < 33) {
                    Serializable serializable6 = bundle.getSerializable("edit_option_selected_key");
                    if (serializable6 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.aiplaylist.editoptionsmenuimpl.EditOptions");
                    } else {
                        serializable3 = (jpv) serializable6;
                    }
                } else {
                    serializable3 = bundle.getSerializable("edit_option_selected_key", jpv.class);
                    if (serializable3 == null) {
                        hhg1.n("Required value was null.");
                    }
                }
                hpv hpvVar = (jpv) serializable3;
                if (hpvVar instanceof hpv) {
                    y11Var2.accept(new qsx0(hpvVar.a));
                } else if (!(hpvVar instanceof ipv)) {
                    eg.o();
                } else {
                    y11Var2.accept(new srx0(((ipv) hpvVar).a));
                }
                break;
        }
    }
}
