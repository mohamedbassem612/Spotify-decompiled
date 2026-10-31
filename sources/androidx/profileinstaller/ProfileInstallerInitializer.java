package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p.cd80;
import p.cs50;
import p.mka;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ProfileInstallerInitializer implements cd80 {
    @Override // p.cd80
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new cs50(this, context.getApplicationContext()));
        return new mka((byte) 21);
    }

    @Override // p.cd80
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
