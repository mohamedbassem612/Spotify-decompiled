package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kc8 implements b031 {
    public final bpb1 a = gio1.b(Boolean.FALSE);

    public final void a(Bundle bundle) {
        this.a.m((Object) null, Boolean.valueOf(bundle.getBoolean("audiobookSeriesExpandedState")));
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("audiobookSeriesExpandedState", ((Boolean) this.a.getValue()).booleanValue());
        return bundle;
    }
}
