package p;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v441 implements ot40 {
    public static final v441 a = new v441();
    public static final LinkedHashMap b = new LinkedHashMap();

    public final File a(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), f4i1.f("datastore/", str, ".preferences_pb"));
    }

    public final Object b(Context context, String str) {
        r4r r4rVar;
        LinkedHashMap linkedHashMap = b;
        synchronized (linkedHashMap) {
            try {
                Object objB = linkedHashMap.get(str);
                if (objB == null) {
                    objB = ws10.b(new ze3(rz31.e, (byte) 3), new snb0(context, str, (byte) 2), 6);
                    linkedHashMap.put(str, objB);
                }
                r4rVar = (r4r) objB;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r4rVar;
    }
}
