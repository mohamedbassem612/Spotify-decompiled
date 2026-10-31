package p;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w2d {
    public final jc9 b;
    public final String c;
    public final HashMap a = new HashMap();
    public ua91 d = null;

    public w2d(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = new v2d(cameraCharacteristics, (byte) 10);
        } else {
            this.b = new jc9(cameraCharacteristics, (byte) 10);
        }
        this.c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.b.b).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.b.b).get(key);
                if (obj2 != null) {
                    this.a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ua91 b() {
        ua91 ua91Var = this.d;
        if (ua91Var == null) {
            ua91Var = null;
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    hhg1.n("StreamConfigurationMap is null!");
                    return null;
                }
                ua91 ua91Var2 = new ua91(streamConfigurationMap, new zhq0(this.c));
                this.d = ua91Var2;
                return ua91Var2;
            } catch (AssertionError | NullPointerException e) {
                hhg1.n(e.getMessage());
            }
        }
        return ua91Var;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) this.b.b).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
