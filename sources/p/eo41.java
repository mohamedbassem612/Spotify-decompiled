package p;

import android.os.Trace;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class eo41 implements AutoCloseable {
    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 124).concat("...");
        }
        Trace.beginSection(str);
    }
}
