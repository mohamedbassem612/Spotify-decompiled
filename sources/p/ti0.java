package p;

import android.app.Application;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ti0 {
    public final bpb1 a;
    public final bpb1 b;

    public ti0(Application application) {
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.a = bpb1VarB;
        this.b = bpb1VarB;
        application.registerActivityLifecycleCallbacks(new si0(this, (byte) 0));
    }
}
