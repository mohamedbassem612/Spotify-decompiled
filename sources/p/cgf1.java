package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cgf1 implements b031 {
    public final bpb1 a = gio1.b(Boolean.FALSE);

    public final void a(Bundle bundle) {
        this.a.m((Object) null, Boolean.valueOf(bundle.getBoolean("topTracksExpandedState")));
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("topTracksExpandedState", ((Boolean) this.a.getValue()).booleanValue());
        return bundle;
    }
}
