package p;

import android.app.Application;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uz5 implements bi0 {
    public final Application a;

    public uz5(Application application) {
        this.a = application;
    }

    public final void a(Intent intent) {
        intent.setFlags(805306368);
        this.a.startActivity(intent, null);
    }
}
