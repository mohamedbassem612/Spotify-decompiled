package com.spotify.martini.martinidata.model;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/spotify/martini/martinidata/model/Mode;", "", "MARTINI", "TASTE_PROFILE", "TOP_STORIES", "PROMPTABLE_SECTION", "PROMPT_PLAYLIST", "SONG_DNA_CREDITS", "SONG_DNA_SAMPLES", "SONG_DNA_OTHER", "src_main_java_com_spotify_martini_martinidata-martinidata"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class Mode {
    public static final Mode MARTINI;
    public static final Mode PROMPTABLE_SECTION;
    public static final Mode PROMPT_PLAYLIST;
    public static final Mode SONG_DNA_CREDITS;
    public static final Mode SONG_DNA_OTHER;
    public static final Mode SONG_DNA_SAMPLES;
    public static final Mode TASTE_PROFILE;
    public static final Mode TOP_STORIES;
    public static final /* synthetic */ Mode[] a;

    static {
        Mode mode = new Mode("MARTINI", 0);
        MARTINI = mode;
        Mode mode2 = new Mode("TASTE_PROFILE", 1);
        TASTE_PROFILE = mode2;
        Mode mode3 = new Mode("TOP_STORIES", 2);
        TOP_STORIES = mode3;
        Mode mode4 = new Mode("PROMPTABLE_SECTION", 3);
        PROMPTABLE_SECTION = mode4;
        Mode mode5 = new Mode("PROMPT_PLAYLIST", 4);
        PROMPT_PLAYLIST = mode5;
        Mode mode6 = new Mode("SONG_DNA_CREDITS", 5);
        SONG_DNA_CREDITS = mode6;
        Mode mode7 = new Mode("SONG_DNA_SAMPLES", 6);
        SONG_DNA_SAMPLES = mode7;
        Mode mode8 = new Mode("SONG_DNA_OTHER", 7);
        SONG_DNA_OTHER = mode8;
        a = new Mode[]{mode, mode2, mode3, mode4, mode5, mode6, mode7, mode8};
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) a.clone();
    }
}
