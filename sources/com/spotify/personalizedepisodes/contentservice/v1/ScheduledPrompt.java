package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ScheduledPrompt extends h implements v2j0 {
    private static final ScheduledPrompt DEFAULT_INSTANCE;
    public static final int HAS_DISCONNECTED_CONNECTORS_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_ENABLED_FIELD_NUMBER = 6;
    public static final int LAST_RUN_FIELD_NUMBER = 4;
    public static final int LOCATION_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 3;
    public static final int SCHEDULE_FIELD_NUMBER = 2;
    public static final int TOOL_SELECTION_FIELD_NUMBER = 9;
    public static final int VOICE_FIELD_NUMBER = 7;
    public static final int VOICE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean hasDisconnectedConnectors_;
    private boolean isEnabled_;
    private PromptDetails prompt_;
    private Schedule schedule_;
    private ToolSelection toolSelection_;
    private Voice voice_;
    private String id_ = "";
    private String lastRun_ = "";
    private String voiceId_ = "";
    private String location_ = "";

    static {
        ScheduledPrompt scheduledPrompt = new ScheduledPrompt();
        DEFAULT_INSTANCE = scheduledPrompt;
        h.registerDefaultInstance(ScheduledPrompt.class, scheduledPrompt);
    }

    private ScheduledPrompt() {
    }

    public static ScheduledPrompt n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0002\b\u0007\tဉ\u0003\nለ\u0004", new Object[]{"bitField0_", "id_", "schedule_", "prompt_", "lastRun_", "voiceId_", "isEnabled_", "voice_", "hasDisconnectedConnectors_", "toolSelection_", "location_"});
        }
        if (iOrdinal == 3) {
            return new ScheduledPrompt();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (ScheduledPrompt.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.hasDisconnectedConnectors_;
    }

    public final boolean p() {
        return this.isEnabled_;
    }

    public final String q() {
        return this.lastRun_;
    }

    public final String r() {
        return this.location_;
    }

    public final PromptDetails s() {
        PromptDetails promptDetails = this.prompt_;
        return promptDetails == null ? PromptDetails.o() : promptDetails;
    }

    public final Schedule t() {
        Schedule schedule = this.schedule_;
        return schedule == null ? Schedule.p() : schedule;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final ToolSelection u() {
        ToolSelection toolSelection = this.toolSelection_;
        return toolSelection == null ? ToolSelection.o() : toolSelection;
    }

    public final Voice v() {
        Voice voice = this.voice_;
        return voice == null ? Voice.n() : voice;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }
}
