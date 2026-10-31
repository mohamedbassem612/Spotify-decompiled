package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Promptableplaylist$EditPromptablePlaylistResponse extends h implements v2j0 {
    private static final Promptableplaylist$EditPromptablePlaylistResponse DEFAULT_INSTANCE;
    public static final int LOCATION_SENSITIVE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_UPDATE_TRIGGERED_FIELD_NUMBER = 2;
    public static final int PROMPT_VERSION_FIELD_NUMBER = 1;
    private boolean locationSensitive_;
    private boolean playlistUpdateTriggered_;
    private int promptVersion_;

    static {
        Promptableplaylist$EditPromptablePlaylistResponse promptableplaylist$EditPromptablePlaylistResponse = new Promptableplaylist$EditPromptablePlaylistResponse();
        DEFAULT_INSTANCE = promptableplaylist$EditPromptablePlaylistResponse;
        h.registerDefaultInstance(Promptableplaylist$EditPromptablePlaylistResponse.class, promptableplaylist$EditPromptablePlaylistResponse);
    }

    private Promptableplaylist$EditPromptablePlaylistResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0004\u0007", new Object[]{"promptVersion_", "playlistUpdateTriggered_", "locationSensitive_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$EditPromptablePlaylistResponse();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Promptableplaylist$EditPromptablePlaylistResponse.class) {
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

    public final boolean n() {
        return this.locationSensitive_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.promptVersion_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
