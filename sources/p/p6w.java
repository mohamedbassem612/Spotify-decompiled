package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p6w implements s6w {
    public static final p6w a = new p6w();

    @Override // p.s6w
    public final String a() {
        return "editor_albums";
    }

    @Override // p.s6w
    public final String b(String str) {
        return f4i1.f("spotify:playlist-format:recommended-albums:", str, "");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p6w);
    }

    public final int hashCode() {
        return -386742809;
    }

    public final String toString() {
        return "Albums";
    }
}
