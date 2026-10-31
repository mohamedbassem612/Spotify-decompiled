package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rxm1 implements acr0 {
    @Override // p.acr0
    public final Set a() {
        return w7x.a;
    }

    @Override // p.acr0
    public final Class b() {
        return lxm1.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        return new nxm1(intent.getIntExtra("VIEW_ID_TO_ALIGN_TOP_WITH_EXTRA", -1), intent.getBooleanExtra("START_IN_EDIT_MODE", false));
    }

    @Override // p.acr0
    public final e6w0 d() {
        return new b6w0(true);
    }

    @Override // p.acr0
    public final String getDescription() {
        return "";
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        return true;
    }
}
