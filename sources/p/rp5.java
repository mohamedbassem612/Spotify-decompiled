package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rp5 {
    public final Context a;

    public String a() {
        return upn1.z(upn1.r(this.a.getApplicationContext()));
    }

    public boolean b() {
        return this.a.getPackageManager().hasSystemFeature("com.google.desktop.gms");
    }
}
