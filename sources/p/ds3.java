package p;

import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ds3 {
    public final /* synthetic */ AllboardingActivity a;

    public ds3(AllboardingActivity allboardingActivity) {
        this.a = allboardingActivity;
    }

    public final void a(vnn0 vnn0Var) {
        gir0 gir0Var = this.a.e1;
        ts3 ts3Var = null;
        if (gir0Var == null) {
            u890.C("pageViewEventDispatcher");
            throw null;
        }
        int i = vnn0Var.h;
        if (i == 2131428220) {
            ts3Var = ts3.CONTENT_PICKER;
        } else if (i == 2131430789) {
            ts3Var = ts3.SEARCH;
        } else if (i == 2131430172) {
            ts3Var = ts3.NOTIFICATION_PERMISSION;
        } else if (i == 2131431146) {
            ts3Var = ts3.SUMMARY;
        } else if (i == 2131427916) {
            ts3Var = ts3.CAROUSEL;
        }
        if (ts3Var != null) {
            p6r0 p6r0Var = ts3Var.a;
            Objects.toString(p6r0Var);
            gir0Var.a.accept(new eir0(p6r0Var, ts3Var.b.a(), 4));
        }
    }
}
