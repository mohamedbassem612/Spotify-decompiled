package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum th7 implements v190 {
    ASTRO_ON_TYPE_UNSUPPORTED(0),
    ASTRO_ON_TYPE_AUDIOBOOKS_EXTRA_HOURS(1),
    ASTRO_ON_TYPE_AUDIOBOOKS_FAMILY_ACCESS(2),
    ASTRO_ON_TYPE_ASTRO(3),
    UNRECOGNIZED(-1);

    public final int a;

    th7(int i) {
        this.a = i;
    }

    public static th7 a(int i) {
        if (i == 0) {
            return ASTRO_ON_TYPE_UNSUPPORTED;
        }
        if (i == 1) {
            return ASTRO_ON_TYPE_AUDIOBOOKS_EXTRA_HOURS;
        }
        if (i == 2) {
            return ASTRO_ON_TYPE_AUDIOBOOKS_FAMILY_ACCESS;
        }
        if (i != 3) {
            return null;
        }
        return ASTRO_ON_TYPE_ASTRO;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
