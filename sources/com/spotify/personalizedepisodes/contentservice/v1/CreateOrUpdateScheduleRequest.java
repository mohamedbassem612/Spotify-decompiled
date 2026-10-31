package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kon;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CreateOrUpdateScheduleRequest extends h implements v2j0 {
    private static final CreateOrUpdateScheduleRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int IS_ENABLED_FIELD_NUMBER = 6;
    public static final int LOCATION_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 4;
    public static final int SCHEDULE_FIELD_NUMBER = 3;
    public static final int SCHEDULE_ID_FIELD_NUMBER = 2;
    public static final int TOOL_SELECTION_FIELD_NUMBER = 7;
    public static final int VOICE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean isEnabled_;
    private Schedule schedule_;
    private ToolSelection toolSelection_;
    private String entityUri_ = "";
    private String scheduleId_ = "";
    private String prompt_ = "";
    private String voiceId_ = "";
    private String location_ = "";

    static {
        CreateOrUpdateScheduleRequest createOrUpdateScheduleRequest = new CreateOrUpdateScheduleRequest();
        DEFAULT_INSTANCE = createOrUpdateScheduleRequest;
        h.registerDefaultInstance(CreateOrUpdateScheduleRequest.class, createOrUpdateScheduleRequest);
    }

    private CreateOrUpdateScheduleRequest() {
    }

    public static kon n() {
        return (kon) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ለ\u0001\u0005ለ\u0002\u0006ဇ\u0003\u0007ဉ\u0004\bለ\u0005", new Object[]{"bitField0_", "entityUri_", "scheduleId_", "schedule_", "prompt_", "voiceId_", "isEnabled_", "toolSelection_", "location_"});
        }
        if (iOrdinal == 3) {
            return new CreateOrUpdateScheduleRequest();
        }
        if (iOrdinal == 4) {
            return new kon(DEFAULT_INSTANCE);
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
        synchronized (CreateOrUpdateScheduleRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.entityUri_ = str;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 8;
        this.isEnabled_ = z;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.location_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.prompt_ = str;
    }

    public final void s(Schedule schedule) {
        this.schedule_ = schedule;
        this.bitField0_ |= 1;
    }

    public final void t(String str) {
        str.getClass();
        this.scheduleId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(ToolSelection toolSelection) {
        toolSelection.getClass();
        this.toolSelection_ = toolSelection;
        this.bitField0_ |= 16;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.voiceId_ = str;
    }
}
