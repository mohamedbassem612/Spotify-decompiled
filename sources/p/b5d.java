package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class b5d {
    public static final u4d a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new a3c0(2));
        a = new u4d(linkedHashSet);
    }

    public static void a(Context context, q59 q59Var, u4d u4dVar) throws CameraValidator$CameraIdListIncorrectException {
        Integer numB;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && sf.q(context) != 0) {
            LinkedHashSet linkedHashSetG = q59Var.g();
            if (linkedHashSetG.isEmpty()) {
                throw new CameraValidator$CameraIdListIncorrectException("No cameras available", 0, null);
            }
            sf.q(context);
            linkedHashSetG.size();
            j2h1.o("CameraValidator");
            return;
        }
        if (u4dVar != null) {
            try {
                numB = u4dVar.b();
                if (numB == null) {
                    j2h1.M("CameraValidator");
                    return;
                }
            } catch (IllegalStateException unused) {
                j2h1.q("CameraValidator");
                return;
            }
        } else {
            numB = null;
        }
        String str = Build.DEVICE;
        j2h1.o("CameraValidator");
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (u4dVar == null || numB.intValue() == 1)) {
                u4d.c.c(q59Var.g());
                i = 1;
            }
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
            j2h1.N("CameraValidator");
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (u4dVar == null || numB.intValue() == 0)) {
                u4d.b.c(q59Var.g());
                i++;
            }
        } catch (IllegalArgumentException e2) {
            illegalArgumentException = e2;
            j2h1.N("CameraValidator");
        }
        try {
            a.c(q59Var.g());
            j2h1.o("CameraValidator");
            i++;
        } catch (IllegalArgumentException unused2) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        q59Var.g().toString();
        j2h1.p("CameraValidator");
        throw new CameraValidator$CameraIdListIncorrectException("Expected camera missing from device.", i, illegalArgumentException);
    }
}
