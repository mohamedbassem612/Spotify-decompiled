package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vg51 implements caz0 {
    public final int a;
    public final String b;

    public vg51(int i) {
        String str;
        this.a = i;
        if (i == 1) {
            str = "AUTOPLAY_MUSIC_TRACKS";
        } else if (i == 2) {
            str = "AUTOPLAY_PODCAST_EPISODES";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "SHUFFLING_FROM";
        }
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg51) && this.a == ((vg51) obj).a;
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
