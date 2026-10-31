package p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract /* synthetic */ class w8m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Mode.values().length];
        try {
            iArr[Mode.MARTINI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Mode.TASTE_PROFILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Mode.TOP_STORIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Mode.PROMPTABLE_SECTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Mode.PROMPT_PLAYLIST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Mode.SONG_DNA_CREDITS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Mode.SONG_DNA_SAMPLES.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Mode.SONG_DNA_OTHER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
