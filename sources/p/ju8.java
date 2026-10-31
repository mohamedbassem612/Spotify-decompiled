package p;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ju8 {
    public boolean a;
    public boolean b;

    public ju8(g4r g4rVar, byte b) {
        boolean z = true;
        switch (b) {
            case 3:
                g4rVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (xgz0 xgz0Var : g4rVar.a) {
                    if (CaptureIntentPreviewQuirk.class.isAssignableFrom(xgz0Var.getClass())) {
                        arrayList.add(xgz0Var);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                        this.a = z;
                        this.b = g4rVar.l(ImageCaptureFailedForVideoSnapshotQuirk.class);
                        break;
                    }
                }
                z = false;
                this.a = z;
                this.b = g4rVar.l(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
            default:
                this.a = g4rVar.l(ImageCaptureFailWithAutoFlashQuirk.class);
                this.b = vvt.a.m(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
        }
    }

    public ju8(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
