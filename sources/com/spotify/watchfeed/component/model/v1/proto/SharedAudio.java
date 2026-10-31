package com.spotify.watchfeed.component.model.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SharedAudio extends h implements v2j0 {
    public static final int AUDIO_FILE_FIELD_NUMBER = 3;
    public static final int DECISION_ID_FIELD_NUMBER = 4;
    private static final SharedAudio DEFAULT_INSTANCE;
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHOULD_AUTO_START_FIELD_NUMBER = 5;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private AudioFile audioFile_;
    private int bitField0_;
    private boolean shouldAutoStart_;
    private String groupId_ = "";
    private String trackUri_ = "";
    private String decisionId_ = "";

    static {
        SharedAudio sharedAudio = new SharedAudio();
        DEFAULT_INSTANCE = sharedAudio;
        h.registerDefaultInstance(SharedAudio.class, sharedAudio);
    }

    private SharedAudio() {
    }

    public static SharedAudio o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005\u0007", new Object[]{"bitField0_", "groupId_", "trackUri_", "audioFile_", "decisionId_", "shouldAutoStart_"});
        }
        if (iOrdinal == 3) {
            return new SharedAudio();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (SharedAudio.class) {
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

    public final AudioFile n() {
        AudioFile audioFile = this.audioFile_;
        return audioFile == null ? AudioFile.o() : audioFile;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.groupId_;
    }

    public final boolean q() {
        return this.shouldAutoStart_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
