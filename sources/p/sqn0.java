package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sqn0 implements wqn0 {
    public static final sqn0 a = new sqn0();
    public static final String b;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        b = yon1.G1("YOURLIBRARY_DOWNLOADS", "yourlibrary/downloads", 2262, "yourlibrary").c;
    }

    public final String a() {
        return b;
    }

    public final String getUri() {
        return "spotify:collection:downloads";
    }
}
