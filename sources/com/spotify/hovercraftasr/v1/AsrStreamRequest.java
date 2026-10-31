package com.spotify.hovercraftasr.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.j57;
import p.jf40;
import p.k57;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class AsrStreamRequest extends h implements v2j0 {
    public static final int AUDIO_FIELD_NUMBER = 4;
    public static final int AUDIO_FORMAT_FIELD_NUMBER = 1;
    private static final AsrStreamRequest DEFAULT_INSTANCE;
    public static final int END_OF_SPEECH_FIELD_NUMBER = 5;
    public static final int END_SPEECH_DETECTION_FIELD_NUMBER = 3;
    public static final int INTERACTION_MANAGER_PARAMS_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PARTIAL_TRANSCRIPTION_FIELD_NUMBER = 2;
    public static final int REASON_FIELD_NUMBER = 6;
    private int audioFormat_;
    private phc audio_ = phc.b;
    private int bitField0_;
    private boolean endOfSpeech_;
    private EndSpeechDetectionOptions endSpeechDetection_;
    private InteractionManagerParams interactionManagerParams_;
    private PartialTranscriptOptions partialTranscription_;
    private int reason_;

    public static final class EndSpeechDetectionOptions extends h implements v2j0 {
        private static final EndSpeechDetectionOptions DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int SILENCE_DETECT_SECS_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean enable_;
        private float silenceDetectSecs_;

        static {
            EndSpeechDetectionOptions endSpeechDetectionOptions = new EndSpeechDetectionOptions();
            DEFAULT_INSTANCE = endSpeechDetectionOptions;
            h.registerDefaultInstance(EndSpeechDetectionOptions.class, endSpeechDetectionOptions);
        }

        private EndSpeechDetectionOptions() {
        }

        public static b n() {
            return (b) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ခ\u0000", new Object[]{"bitField0_", "enable_", "silenceDetectSecs_"});
            }
            if (iOrdinal == 3) {
                return new EndSpeechDetectionOptions();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (EndSpeechDetectionOptions.class) {
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
            this.enable_ = true;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class InteractionManagerParams extends h implements v2j0 {
        public static final int CURRENT_SEGMENT_ID_FIELD_NUMBER = 3;
        public static final int CURRENT_TRACK_URI_FIELD_NUMBER = 5;
        private static final InteractionManagerParams DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int RETRIES_LEFT_FIELD_NUMBER = 4;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private String sessionId_ = "";
        private String deviceId_ = "";
        private String currentSegmentId_ = "";
        private String retriesLeft_ = "";
        private String currentTrackUri_ = "";

        static {
            InteractionManagerParams interactionManagerParams = new InteractionManagerParams();
            DEFAULT_INSTANCE = interactionManagerParams;
            h.registerDefaultInstance(InteractionManagerParams.class, interactionManagerParams);
        }

        private InteractionManagerParams() {
        }

        public static c n() {
            return (c) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"sessionId_", "deviceId_", "currentSegmentId_", "retriesLeft_", "currentTrackUri_"});
            }
            if (iOrdinal == 3) {
                return new InteractionManagerParams();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
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
            synchronized (InteractionManagerParams.class) {
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
            this.deviceId_ = str;
        }

        public final void p(String str) {
            this.sessionId_ = str;
        }

        public final void setCurrentSegmentId(String str) {
            str.getClass();
            this.currentSegmentId_ = str;
        }

        public final void setCurrentTrackUri(String str) {
            str.getClass();
            this.currentTrackUri_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PartialTranscriptOptions extends h implements v2j0 {
        private static final PartialTranscriptOptions DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int SILENCE_DETECT_SECS_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean enable_;
        private float silenceDetectSecs_;

        static {
            PartialTranscriptOptions partialTranscriptOptions = new PartialTranscriptOptions();
            DEFAULT_INSTANCE = partialTranscriptOptions;
            h.registerDefaultInstance(PartialTranscriptOptions.class, partialTranscriptOptions);
        }

        private PartialTranscriptOptions() {
        }

        public static d n() {
            return (d) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ခ\u0000", new Object[]{"bitField0_", "enable_", "silenceDetectSecs_"});
            }
            if (iOrdinal == 3) {
                return new PartialTranscriptOptions();
            }
            if (iOrdinal == 4) {
                return new d(DEFAULT_INSTANCE);
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
            synchronized (PartialTranscriptOptions.class) {
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
            this.enable_ = true;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AsrStreamRequest asrStreamRequest = new AsrStreamRequest();
        DEFAULT_INSTANCE = asrStreamRequest;
        h.registerDefaultInstance(AsrStreamRequest.class, asrStreamRequest);
    }

    private AsrStreamRequest() {
    }

    public static a n() {
        return (a) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004\n\u0005\u0007\u0006\f\u0007ဉ\u0002", new Object[]{"bitField0_", "audioFormat_", "partialTranscription_", "endSpeechDetection_", "audio_", "endOfSpeech_", "reason_", "interactionManagerParams_"});
        }
        if (iOrdinal == 3) {
            return new AsrStreamRequest();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (AsrStreamRequest.class) {
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

    public final void o(hhc hhcVar) {
        this.audio_ = hhcVar;
    }

    public final void p() {
        this.audioFormat_ = j57.WAV.getNumber();
    }

    public final void q() {
        this.endOfSpeech_ = true;
    }

    public final void r(EndSpeechDetectionOptions endSpeechDetectionOptions) {
        endSpeechDetectionOptions.getClass();
        this.endSpeechDetection_ = endSpeechDetectionOptions;
        this.bitField0_ |= 2;
    }

    public final void s(InteractionManagerParams interactionManagerParams) {
        interactionManagerParams.getClass();
        this.interactionManagerParams_ = interactionManagerParams;
        this.bitField0_ |= 4;
    }

    public final void t(PartialTranscriptOptions partialTranscriptOptions) {
        partialTranscriptOptions.getClass();
        this.partialTranscription_ = partialTranscriptOptions;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(k57 k57Var) {
        this.reason_ = k57Var.getNumber();
    }
}
