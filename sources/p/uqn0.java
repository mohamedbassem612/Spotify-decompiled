package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uqn0 implements wqn0 {
    public static final uqn0 a = new uqn0();
    public static final String b;

    static {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        b = yon1.G1("YOURLIBRARY_PLAYLISTS", "yourlibrary/playlists", 2269, "yourlibrary").c;
    }

    public final String a() {
        return b;
    }

    public final String getUri() {
        return "spotify:collection:playlists";
    }
}
