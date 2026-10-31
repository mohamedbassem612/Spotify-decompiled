package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ets0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PersonalizePresetResponse extends h implements v2j0 {
    private static final PersonalizePresetResponse DEFAULT_INSTANCE;
    public static final int GENERATION_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 1;
    public static final int SHOWS_TO_PUBLISH_TO_FIELD_NUMBER = 3;
    private int bitField0_;
    private Preset preset_;
    private String generationId_ = "";
    private h290 showsToPublishTo_ = h.emptyProtobufList();

    static {
        PersonalizePresetResponse personalizePresetResponse = new PersonalizePresetResponse();
        DEFAULT_INSTANCE = personalizePresetResponse;
        h.registerDefaultInstance(PersonalizePresetResponse.class, personalizePresetResponse);
    }

    private PersonalizePresetResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b", new Object[]{"bitField0_", "preset_", "generationId_", "showsToPublishTo_", ShowItem.class});
        }
        if (iOrdinal == 3) {
            return new PersonalizePresetResponse();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (PersonalizePresetResponse.class) {
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

    public final String n() {
        return this.generationId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Preset o() {
        Preset preset = this.preset_;
        return preset == null ? Preset.q() : preset;
    }

    public final h290 p() {
        return this.showsToPublishTo_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
