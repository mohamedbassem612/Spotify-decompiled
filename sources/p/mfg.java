package p;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mfg {
    public final ReferenceQueue a = new ReferenceQueue();
    public final Set b = Collections.synchronizedSet(new HashSet());
}
