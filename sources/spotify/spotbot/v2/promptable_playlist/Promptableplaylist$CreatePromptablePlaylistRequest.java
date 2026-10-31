package spotify.spotbot.v2.promptable_playlist;

import com.google.protobuf.h;
import p.bf40;
import p.f1y0;
import p.j1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Promptableplaylist$CreatePromptablePlaylistRequest extends h implements v2j0 {
    public static final int BLOCK_GENERATION_IF_LOCATION_SENSITIVE_PROMPT_FIELD_NUMBER = 10;
    public static final int CLONED_FROM_PLAYLIST_URI_FIELD_NUMBER = 6;
    private static final Promptableplaylist$CreatePromptablePlaylistRequest DEFAULT_INSTANCE;
    public static final int GENERATION_MODE_FIELD_NUMBER = 13;
    public static final int IS_PRIVATE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int QUERY_TEXT_FIELD_NUMBER = 3;
    public static final int REFRESH_METADATA_FIELD_NUMBER = 4;
    public static final int USERNAME_FIELD_NUMBER = 2;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean blockGenerationIfLocationSensitivePrompt_;
    private int generationMode_;
    private Object identifier_;
    private boolean isPrivate_;
    private Promptableplaylist$RefreshMetadata refreshMetadata_;
    private int identifierCase_ = 0;
    private String queryText_ = "";
    private String clonedFromPlaylistUri_ = "";

    static {
        Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest = new Promptableplaylist$CreatePromptablePlaylistRequest();
        DEFAULT_INSTANCE = promptableplaylist$CreatePromptablePlaylistRequest;
        h.registerDefaultInstance(Promptableplaylist$CreatePromptablePlaylistRequest.class, promptableplaylist$CreatePromptablePlaylistRequest);
    }

    private Promptableplaylist$CreatePromptablePlaylistRequest() {
    }

    public static f1y0 n() {
        return (f1y0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\r\b\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ\u0004ဉ\u0000\u0005\u0007\u0006Ȉ\n\u0007\r\f", new Object[]{"identifier_", "identifierCase_", "bitField0_", "queryText_", "refreshMetadata_", "isPrivate_", "clonedFromPlaylistUri_", "blockGenerationIfLocationSensitivePrompt_", "generationMode_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$CreatePromptablePlaylistRequest();
        }
        if (iOrdinal == 4) {
            return new f1y0(DEFAULT_INSTANCE);
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
        synchronized (Promptableplaylist$CreatePromptablePlaylistRequest.class) {
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

    public final void o(boolean z) {
        this.blockGenerationIfLocationSensitivePrompt_ = z;
    }

    public final void p(String str) {
        str.getClass();
        this.clonedFromPlaylistUri_ = str;
    }

    public final void q(j1y0 j1y0Var) {
        this.generationMode_ = j1y0Var.getNumber();
    }

    public final void r(boolean z) {
        this.isPrivate_ = z;
    }

    public final void s(String str) {
        str.getClass();
        this.queryText_ = str;
    }

    public final void t(Promptableplaylist$RefreshMetadata promptableplaylist$RefreshMetadata) {
        promptableplaylist$RefreshMetadata.getClass();
        this.refreshMetadata_ = promptableplaylist$RefreshMetadata;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.identifierCase_ = 2;
        this.identifier_ = str;
    }
}
