package p;

import android.os.Process;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xju implements tn41 {
    public static final xju a = new xju();
    public static final Set b = Collections.singleton("Zero");

    @Override // p.tn41
    public final Object b(String str, Function0 function0) {
        if (!b.contains(str)) {
            return function0.invoke();
        }
        int iMyTid = Process.myTid();
        try {
            int threadPriority = Process.getThreadPriority(iMyTid);
            if (threadPriority <= -4) {
                return function0.invoke();
            }
            try {
                Process.setThreadPriority(iMyTid, -4);
                return function0.invoke();
            } finally {
                try {
                    Process.setThreadPriority(iMyTid, threadPriority);
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            return function0.invoke();
        }
    }
}
