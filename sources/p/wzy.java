package p;

import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wzy {
    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    public static EntryPoint a(String str) {
        for (EntryPoint entryPoint : EntryPoint.values()) {
            if (u890.j(entryPoint.getUriSegment(), str)) {
                if (entryPoint == null) {
                    return EntryPoint.DEFAULT;
                }
                return entryPoint;
            }
        }
        entryPoint = null;
        if (entryPoint == null) {
            return EntryPoint.DEFAULT;
        }
        return entryPoint;
    }
}
