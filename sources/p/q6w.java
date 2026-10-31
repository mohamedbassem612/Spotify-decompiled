package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q6w implements s6w {
    public static final q6w a = new q6w();

    @Override // p.s6w
    public final String a() {
        return "editor_curated_playlists";
    }

    @Override // p.s6w
    public final String b(String str) {
        return f4i1.f("spotify:playlist-format:curated-playlists:", str, "");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q6w);
    }

    public final int hashCode() {
        return 673065202;
    }

    public final String toString() {
        return "CuratedPlaylists";
    }
}
