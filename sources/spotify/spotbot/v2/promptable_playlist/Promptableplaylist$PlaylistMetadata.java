package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Promptableplaylist$PlaylistMetadata extends h implements v2j0 {
    private static final Promptableplaylist$PlaylistMetadata DEFAULT_INSTANCE;
    public static final int LOCATION_SENSITIVE_FIELD_NUMBER = 14;
    public static final int OWNER_USERNAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_TITLE_FIELD_NUMBER = 3;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int PROMPT_SUMMARY_FIELD_NUMBER = 4;
    public static final int REFRESH_METADATA_FIELD_NUMBER = 6;
    public static final int STOP_PERSONALIZING_PLAYLIST_FIELD_NUMBER = 7;
    public static final int TRACKLIST_SUMMARY_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean locationSensitive_;
    private Promptableplaylist.RefreshMetadata refreshMetadata_;
    private boolean stopPersonalizingPlaylist_;
    private String prompt_ = "";
    private String ownerUsername_ = "";
    private String playlistTitle_ = "";
    private String promptSummary_ = "";
    private String tracklistSummary_ = "";

    static {
        Promptableplaylist$PlaylistMetadata promptableplaylist$PlaylistMetadata = new Promptableplaylist$PlaylistMetadata();
        DEFAULT_INSTANCE = promptableplaylist$PlaylistMetadata;
        h.registerDefaultInstance(Promptableplaylist$PlaylistMetadata.class, promptableplaylist$PlaylistMetadata);
    }

    private Promptableplaylist$PlaylistMetadata() {
    }

    public static Promptableplaylist$PlaylistMetadata n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\u000e\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007\u0007\u000e\u0007", new Object[]{"bitField0_", "prompt_", "ownerUsername_", "playlistTitle_", "promptSummary_", "tracklistSummary_", "refreshMetadata_", "stopPersonalizingPlaylist_", "locationSensitive_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$PlaylistMetadata();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 1);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (Promptableplaylist$PlaylistMetadata.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.locationSensitive_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
