package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rpe1;
import p.s2j0;
import p.s3z0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ReadAlongTranscript extends h implements v2j0 {
    public static final int AD_COMPRESSED_FIELD_NUMBER = 12;
    public static final int COLOUR_DATA_FIELD_NUMBER = 7;
    public static final int CREATOR_PROVIDED_FIELD_NUMBER = 13;
    private static final ReadAlongTranscript DEFAULT_INSTANCE;
    public static final int EPISODE_NAME_FIELD_NUMBER = 9;
    public static final int EPISODE_URI_FIELD_NUMBER = 2;
    public static final int ISSHAREBUTTONVISIBLE_FIELD_NUMBER = 10;
    public static final int LANGUAGE_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISHED_AT_FIELD_NUMBER = 4;
    public static final int SECTION_FIELD_NUMBER = 6;
    public static final int SHOW_NAME_FIELD_NUMBER = 8;
    public static final int TIME_SYNCED_STATUS_FIELD_NUMBER = 11;
    public static final int TRANSCRIPT_URI_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private boolean adCompressed_;
    private int bitField0_;
    private ColourData colourData_;
    private boolean creatorProvided_;
    private boolean isShareButtonVisible_;
    private int timeSyncedStatus_;
    private String version_ = "";
    private String episodeUri_ = "";
    private String transcriptUri_ = "";
    private String publishedAt_ = "";
    private String language_ = "";
    private h290 section_ = h.emptyProtobufList();
    private String showName_ = "";
    private String episodeName_ = "";

    static {
        ReadAlongTranscript readAlongTranscript = new ReadAlongTranscript();
        DEFAULT_INSTANCE = readAlongTranscript;
        h.registerDefaultInstance(ReadAlongTranscript.class, readAlongTranscript);
    }

    private ReadAlongTranscript() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ReadAlongTranscript w(byte[] bArr) {
        return (ReadAlongTranscript) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b\u0007ဉ\u0000\bȈ\tȈ\n\u0007\u000b\f\f\u0007\r\u0007", new Object[]{"bitField0_", "version_", "episodeUri_", "transcriptUri_", "publishedAt_", "language_", "section_", Section.class, "colourData_", "showName_", "episodeName_", "isShareButtonVisible_", "timeSyncedStatus_", "adCompressed_", "creatorProvided_"});
        }
        if (iOrdinal == 3) {
            return new ReadAlongTranscript();
        }
        if (iOrdinal == 4) {
            return new s3z0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ReadAlongTranscript.class) {
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

    public final String getLanguage() {
        return this.language_;
    }

    public final boolean n() {
        return this.adCompressed_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ColourData o() {
        ColourData colourData = this.colourData_;
        return colourData == null ? ColourData.o() : colourData;
    }

    public final boolean p() {
        return this.creatorProvided_;
    }

    public final String q() {
        return this.episodeName_;
    }

    public final boolean r() {
        return this.isShareButtonVisible_;
    }

    public final h290 s() {
        return this.section_;
    }

    public final String t() {
        return this.showName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final rpe1 u() {
        rpe1 rpe1Var;
        int i = this.timeSyncedStatus_;
        if (i == 0) {
            rpe1Var = rpe1.UNKNOWN;
        } else if (i == 1) {
            rpe1Var = rpe1.STATIC;
        } else if (i != 2) {
            rpe1Var = i != 3 ? null : rpe1.SENTENCE_SYNCED;
        } else {
            rpe1Var = rpe1.SYLLABLE_SYNCED;
        }
        return rpe1Var == null ? rpe1.UNRECOGNIZED : rpe1Var;
    }

    public final String v() {
        return this.transcriptUri_;
    }
}
