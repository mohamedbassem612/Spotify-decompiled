package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r6w implements s6w {
    public static final r6w a = new r6w();

    @Override // p.s6w
    public final String a() {
        return "editor_track_of_the_week";
    }

    @Override // p.s6w
    public final String b(String str) {
        return f4i1.f("spotify:playlist-format:track-of-the-week:", str, "");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r6w);
    }

    public final int hashCode() {
        return -652147674;
    }

    public final String toString() {
        return "TrackOfTheWeek";
    }
}
