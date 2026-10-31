package com.spotify.player.esperanto.proto;

import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.gmz;
import p.hmz;
import p.jf40;
import p.jlz;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsContextPlayerError$ContextPlayerError extends com.google.protobuf.h implements v2j0 {
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    private static final EsContextPlayerError$ContextPlayerError DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int code_;
    private qng0 data_ = qng0.b;
    private String message_ = "";

    static {
        EsContextPlayerError$ContextPlayerError esContextPlayerError$ContextPlayerError = new EsContextPlayerError$ContextPlayerError();
        DEFAULT_INSTANCE = esContextPlayerError$ContextPlayerError;
        com.google.protobuf.h.registerDefaultInstance(EsContextPlayerError$ContextPlayerError.class, esContextPlayerError$ContextPlayerError);
    }

    private EsContextPlayerError$ContextPlayerError() {
    }

    public static EsContextPlayerError$ContextPlayerError o(byte[] bArr) {
        return (EsContextPlayerError$ContextPlayerError) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\f\u0002Ȉ\u00032", new Object[]{"code_", "message_", "data_", gmz.a});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerError$ContextPlayerError();
        }
        if (iOrdinal == 4) {
            return new jlz(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (EsContextPlayerError$ContextPlayerError.class) {
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

    public final Map getDataMap() {
        return Collections.unmodifiableMap(this.data_);
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getMessage() {
        return this.message_;
    }

    public final hmz n() {
        hmz hmzVar;
        switch (this.code_) {
            case 0:
                hmzVar = hmz.SUCCESS;
                break;
            case 1:
                hmzVar = hmz.PLAYBACK_STUCK;
                break;
            case 2:
                hmzVar = hmz.PLAYBACK_ERROR;
                break;
            case 3:
                hmzVar = hmz.LICENSE_CHANGE;
                break;
            case 4:
                hmzVar = hmz.PLAY_RESTRICTED;
                break;
            case 5:
                hmzVar = hmz.STOP_RESTRICTED;
                break;
            case 6:
                hmzVar = hmz.UPDATE_RESTRICTED;
                break;
            case 7:
                hmzVar = hmz.PAUSE_RESTRICTED;
                break;
            case 8:
                hmzVar = hmz.RESUME_RESTRICTED;
                break;
            case 9:
                hmzVar = hmz.SKIP_TO_PREV_RESTRICTED;
                break;
            case 10:
                hmzVar = hmz.SKIP_TO_NEXT_RESTRICTED;
                break;
            case 11:
                hmzVar = hmz.SKIP_TO_NON_EXISTENT_TRACK;
                break;
            case 12:
                hmzVar = hmz.SEEK_TO_RESTRICTED;
                break;
            case 13:
                hmzVar = hmz.TOGGLE_REPEAT_CONTEXT_RESTRICTED;
                break;
            case 14:
                hmzVar = hmz.TOGGLE_REPEAT_TRACK_RESTRICTED;
                break;
            case 15:
                hmzVar = hmz.SET_OPTIONS_RESTRICTED;
                break;
            case 16:
                hmzVar = hmz.TOGGLE_SHUFFLE_RESTRICTED;
                break;
            case 17:
                hmzVar = hmz.SET_QUEUE_RESTRICTED;
                break;
            case 18:
                hmzVar = hmz.INTERRUPT_PLAYBACK_RESTRICTED;
                break;
            case 19:
                hmzVar = hmz.ONE_TRACK_UNPLAYABLE;
                break;
            case 20:
                hmzVar = hmz.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED;
                break;
            case 21:
                hmzVar = hmz.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED;
                break;
            case 22:
                hmzVar = hmz.SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED;
                break;
            case 23:
                hmzVar = hmz.QUEUE_REVISION_MISMATCH;
                break;
            case 24:
                hmzVar = hmz.VIDEO_PLAYBACK_ERROR;
                break;
            case 25:
                hmzVar = hmz.VIDEO_GEOGRAPHICALLY_RESTRICTED;
                break;
            case 26:
                hmzVar = hmz.VIDEO_UNSUPPORTED_PLATFORM_VERSION;
                break;
            case 27:
                hmzVar = hmz.VIDEO_UNSUPPORTED_CLIENT_VERSION;
                break;
            case 28:
                hmzVar = hmz.VIDEO_UNSUPPORTED_KEY_SYSTEM;
                break;
            case 29:
                hmzVar = hmz.VIDEO_MANIFEST_DELETED;
                break;
            case 30:
                hmzVar = hmz.VIDEO_COUNTRY_RESTRICTED;
                break;
            case SHOW_COSMOS_SHOW_REQUEST_VALUE:
                hmzVar = hmz.VIDEO_UNAVAILABLE;
                break;
            case 32:
                hmzVar = hmz.VIDEO_CATALOGUE_RESTRICTED;
                break;
            case 33:
                hmzVar = hmz.INVALID;
                break;
            case 34:
                hmzVar = hmz.TIMEOUT;
                break;
            case 35:
                hmzVar = hmz.PLAYBACK_REPORTING_ERROR;
                break;
            case 36:
                hmzVar = hmz.UNKNOWN;
                break;
            case SAVED_ALBUMS_VALUE:
                hmzVar = hmz.ADD_TO_QUEUE_RESTRICTED;
                break;
            case DSA_STATE_CHANGE_VALUE:
                hmzVar = hmz.PICK_AND_SHUFFLE_CAPPED;
                break;
            case SHOW_RESUME_EPISODE_PROVIDER_VALUE:
                hmzVar = hmz.PICK_AND_SHUFFLE_CONNECT_RESTRICTED;
                break;
            case AUTOPLAY_LENS_OBSERVER_VALUE:
                hmzVar = hmz.CONTEXT_LOADING_FAILED;
                break;
            case LIST_PLAYER_DECORATOR_VALUE:
                hmzVar = hmz.AUDIOBOOK_NOT_PLAYABLE;
                break;
            case LIST_PLAYER_PLAY_REQUEST_ADAPTER_VALUE:
                hmzVar = hmz.SIGNAL_NOT_AVAILABLE;
                break;
            case PREDEFINED_LISTS_VALUE:
                hmzVar = hmz.SET_SLEEP_TIMER_RESTRICTED;
                break;
            case JAM_LENS_MANAGER_VALUE:
                hmzVar = hmz.PLAYBACK_START_SLOW;
                break;
            case LIST_PLAYER_QUEUED_ITEMS_FILTER_VALUE:
                hmzVar = hmz.PLAYBACK_START_TIMEOUT;
                break;
            case LIST_PLAYER_REC_POOL_FILTER_VALUE:
                hmzVar = hmz.PLAYBACK_STUCK_TIMEOUT;
                break;
            case VOLATILE_CONTEXT_VALUE:
                hmzVar = hmz.PLAYBACK_CLIENT_VERSION_IS_SUNSETTED;
                break;
            case MULTIGET_ADDITIONAL_RESPONSE_VALUE:
                hmzVar = hmz.PLAYBACK_AUDIO_FORMAT_NEGOTIATION_FAIL;
                break;
            default:
                hmzVar = null;
                break;
        }
        return hmzVar == null ? hmz.UNRECOGNIZED : hmzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
