package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nzk;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.twt0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ConfirmGenerationRequest extends h implements v2j0 {
    public static final int CREATE_SHOW_FIELD_NUMBER = 8;
    private static final ConfirmGenerationRequest DEFAULT_INSTANCE;
    public static final int GENERATION_ID_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_CONTROL_FIELD_NUMBER = 7;
    public static final int SCHEDULE_FIELD_NUMBER = 2;
    public static final int SCHEDULE_ID_FIELD_NUMBER = 4;
    public static final int SHOW_ITEM_FIELD_NUMBER = 3;
    public static final int TOOL_SELECTION_FIELD_NUMBER = 6;
    public static final int VOICE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean createShow_;
    private int playbackControl_;
    private Schedule schedule_;
    private ShowItem showItem_;
    private ToolSelection toolSelection_;
    private String generationId_ = "";
    private String scheduleId_ = "";
    private String voiceId_ = "";
    private String location_ = "";

    static {
        ConfirmGenerationRequest confirmGenerationRequest = new ConfirmGenerationRequest();
        DEFAULT_INSTANCE = confirmGenerationRequest;
        h.registerDefaultInstance(ConfirmGenerationRequest.class, confirmGenerationRequest);
    }

    private ConfirmGenerationRequest() {
    }

    public static nzk n() {
        return (nzk) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006ဉ\u0004\u0007ဌ\u0005\bဇ\u0006\tለ\u0007", new Object[]{"bitField0_", "generationId_", "schedule_", "showItem_", "scheduleId_", "voiceId_", "toolSelection_", "playbackControl_", "createShow_", "location_"});
        }
        if (iOrdinal == 3) {
            return new ConfirmGenerationRequest();
        }
        if (iOrdinal == 4) {
            return new nzk(DEFAULT_INSTANCE);
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
        synchronized (ConfirmGenerationRequest.class) {
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

    public final void o() {
        this.bitField0_ |= 64;
        this.createShow_ = true;
    }

    public final void p(String str) {
        str.getClass();
        this.generationId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.location_ = str;
    }

    public final void r(twt0 twt0Var) {
        this.playbackControl_ = twt0Var.getNumber();
        this.bitField0_ |= 32;
    }

    public final void s(Schedule schedule) {
        this.schedule_ = schedule;
        this.bitField0_ |= 1;
    }

    public final void t(ShowItem showItem) {
        this.showItem_ = showItem;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(ToolSelection toolSelection) {
        this.toolSelection_ = toolSelection;
        this.bitField0_ |= 16;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.voiceId_ = str;
    }
}
