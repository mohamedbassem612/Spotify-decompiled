package p;

import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aqw0 implements mu61 {
    public final kly0 a;
    public final p6r0 b;
    public final lik1 c;
    public final ksk0 d;
    public final Set e;

    public aqw0(thq thqVar) {
        this.a = thqVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = yon1.r4();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.c = oap1.i("spotify:internal:edit:profile:privacy-settings");
        this.d = fae1.t();
        this.e = dm61.z0(blc0.PROFILE_EDIT_PRIVACY_SETTINGS, blc0.PROFILE_EDIT_PRIVACY_SETTINGS_LEGACY, blc0.PROFILE_EDIT_PRIVACY_SETTINGS_INTERNAL);
    }

    public final Set a() {
        return this.e;
    }

    public final v8h1 b() {
        return this.d;
    }

    public final kly0 c() {
        return this.a;
    }

    public final p6r0 e() {
        return this.b;
    }

    public final lik1 getViewUri() {
        return this.c;
    }
}
