package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wpn0 implements wqn0 {
    public final String a;
    public final String b;

    public wpn0(String str) {
        this.a = str;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = yon1.G1("PLAYLIST_FOLDER", "playlist/folder", 1462, "playlist").c;
    }

    @Override // p.wqn0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wpn0) && u890.j(this.a, ((wpn0) obj).a);
    }

    @Override // p.wqn0
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
