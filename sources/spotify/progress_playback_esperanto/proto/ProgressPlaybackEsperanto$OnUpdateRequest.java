package spotify.progress_playback_esperanto.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yhx0;
import p.zhx0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ProgressPlaybackEsperanto$OnUpdateRequest extends h implements v2j0 {
    private static final ProgressPlaybackEsperanto$OnUpdateRequest DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int ITEM_URI_FIELD_NUMBER = 1;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 5;
    public static final int PLAYED_UNTIL_COMPLETION_FIELD_NUMBER = 4;
    public static final int POSITION_FIELD_NUMBER = 2;
    public static final int REASON_FIELD_NUMBER = 8;
    public static final int USE_CASE_IDENTIFIER_FIELD_NUMBER = 7;
    private int bitField0_;
    private Duration duration_;
    private boolean playedUntilCompletion_;
    private Duration position_;
    private int reason_;
    private String itemUri_ = "";
    private String playbackId_ = "";
    private String pageIdentifier_ = "";
    private String useCaseIdentifier_ = "";

    static {
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = new ProgressPlaybackEsperanto$OnUpdateRequest();
        DEFAULT_INSTANCE = progressPlaybackEsperanto$OnUpdateRequest;
        h.registerDefaultInstance(ProgressPlaybackEsperanto$OnUpdateRequest.class, progressPlaybackEsperanto$OnUpdateRequest);
    }

    private ProgressPlaybackEsperanto$OnUpdateRequest() {
    }

    public static yhx0 n() {
        return (yhx0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005ለ\u0002\u0006Ȉ\u0007Ȉ\b\f", new Object[]{"bitField0_", "itemUri_", "position_", "duration_", "playedUntilCompletion_", "playbackId_", "pageIdentifier_", "useCaseIdentifier_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new ProgressPlaybackEsperanto$OnUpdateRequest();
        }
        if (iOrdinal == 4) {
            return new yhx0(DEFAULT_INSTANCE);
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
        synchronized (ProgressPlaybackEsperanto$OnUpdateRequest.class) {
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

    public final void o(Duration duration) {
        duration.getClass();
        this.duration_ = duration;
        this.bitField0_ |= 2;
    }

    public final void p(String str) {
        str.getClass();
        this.itemUri_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.pageIdentifier_ = str;
    }

    public final void r(boolean z) {
        this.playedUntilCompletion_ = z;
    }

    public final void s(Duration duration) {
        duration.getClass();
        this.position_ = duration;
        this.bitField0_ |= 1;
    }

    public final void t(zhx0 zhx0Var) {
        this.reason_ = zhx0Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.useCaseIdentifier_ = str;
    }
}
