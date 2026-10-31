package p;

import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k49 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m49 b;

    public /* synthetic */ k49(m49 m49Var, byte b) {
        this.a = b;
        this.b = m49Var;
    }

    public final void accept(Object obj) {
        Parcelable dnv0Var;
        byte b = this.a;
        m49 m49Var = this.b;
        switch (b) {
            case 0:
                g49 g49Var = (g49) obj;
                em0 em0Var = m49Var.a;
                boolean z = g49Var.c;
                boolean z2 = g49Var.d;
                String str = g49Var.e;
                boolean z3 = g49Var.f;
                fae1 fae1Var = g49Var.g;
                boolean z4 = g49Var.h;
                boolean z5 = g49Var.i;
                Bundle bundle = new Bundle();
                bundle.putBoolean("manual_select_open_user_initiated_autodetect", z);
                bundle.putBoolean("manual_select_is_ambiguous_device", z2);
                bundle.putString("manual_select_ambiguous_device_title", str);
                bundle.putBoolean("manual_select_is_airpods_ambiguous_type", z3);
                bundle.putBoolean("manual_select_resume_music", z5);
                if (fae1Var != null) {
                    if (fae1Var instanceof anv0) {
                        dnv0Var = new cnv0(((anv0) fae1Var).d);
                    } else if (!(fae1Var instanceof bnv0)) {
                        eg.o();
                    } else {
                        bnv0 bnv0Var = (bnv0) fae1Var;
                        dnv0Var = new dnv0(bnv0Var.d, bnv0Var.e, bnv0Var.f, bnv0Var.g);
                    }
                    bundle.putParcelable("manual_select_predicted_device", dnv0Var);
                }
                bundle.putBoolean("manual_select_predicted_device_was_matched", z4);
                a1r0.i((a1r0) em0Var.b, "spotify:internal:puffin-setup-manual-select", (String) null, bundle, 2);
                break;
            case 1:
                em0 em0Var2 = m49Var.a;
                a1r0.i((a1r0) em0Var2.b, "spotify:internal:puffin-onboarding", (String) null, pzm.g("puffin_setup_flow_should_resume_music_when_exiting_flow", ((h49) obj).c), 2);
                break;
            default:
                em0 em0Var3 = m49Var.a;
                a1r0.i((a1r0) em0Var3.b, "spotify:internal:puffin-intro", (String) null, pzm.g("puffin_setup_flow_should_resume_music_when_exiting_flow", ((f49) obj).c), 2);
                break;
        }
    }
}
