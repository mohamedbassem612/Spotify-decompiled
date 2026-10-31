package p;

import com.google.android.gms.internal.meet_coactivities.zzfa;
import com.google.android.gms.internal.meet_coactivities.zzij;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class k02 {
    public static final Object a = new Object();
    public static Optional b = Optional.empty();
    public static Optional c = Optional.empty();

    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, p.j02] */
    public static j02 a(Optional optional, Optional optional2) {
        ?? r8;
        synchronized (a) {
            try {
                if (!b.isPresent()) {
                    b = Optional.of(new zzfa(135083966748L, optional, optional2, zzij.zzb()));
                    c = Optional.of(135083966748L);
                } else if (!((Long) c.get()).equals(135083966748L)) {
                    throw new IllegalArgumentException("Unexpected change in cloud project number.");
                }
                r8 = b.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        return r8;
    }
}
