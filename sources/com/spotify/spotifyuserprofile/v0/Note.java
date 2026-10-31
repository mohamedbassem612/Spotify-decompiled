package com.spotify.spotifyuserprofile.v0;

import com.google.protobuf.h;
import p.bf40;
import p.fin0;
import p.gd;
import p.jf40;
import p.ksw0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Note extends h implements v2j0 {
    public static final int ACCEPTANCE_STATUS_FIELD_NUMBER = 6;
    public static final int CONTENT_FIELD_NUMBER = 2;
    public static final int CREATED_AT_FIELD_NUMBER = 3;
    private static final Note DEFAULT_INSTANCE;
    public static final int NOTE_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PROCESSING_STATUS_FIELD_NUMBER = 5;
    public static final int UPDATED_AT_FIELD_NUMBER = 4;
    private int acceptanceStatus_;
    private long createdAt_;
    private int processingStatus_;
    private long updatedAt_;
    private String noteId_ = "";
    private String content_ = "";

    static {
        Note note = new Note();
        DEFAULT_INSTANCE = note;
        h.registerDefaultInstance(Note.class, note);
    }

    private Note() {
    }

    public static Note p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\f\u0006\f", new Object[]{"noteId_", "content_", "createdAt_", "updatedAt_", "processingStatus_", "acceptanceStatus_"});
        }
        if (iOrdinal == 3) {
            return new Note();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (Note.class) {
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

    public final gd n() {
        gd gdVar;
        int i = this.acceptanceStatus_;
        if (i == 0) {
            gdVar = gd.NOTE_STATUS_UNSPECIFIED;
        } else if (i != 1) {
            gdVar = i != 2 ? null : gd.PARTIALLY_ACCEPTED;
        } else {
            gdVar = gd.ACCEPTED;
        }
        return gdVar == null ? gd.UNRECOGNIZED : gdVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.content_;
    }

    public final String q() {
        return this.noteId_;
    }

    public final ksw0 r() {
        ksw0 ksw0Var;
        int i = this.processingStatus_;
        if (i == 0) {
            ksw0Var = ksw0.PROCESSING_STATUS_UNSPECIFIED;
        } else if (i != 1) {
            ksw0Var = i != 2 ? null : ksw0.PROCESSING;
        } else {
            ksw0Var = ksw0.INCORPORATED;
        }
        return ksw0Var == null ? ksw0.UNRECOGNIZED : ksw0Var;
    }

    public final long s() {
        return this.updatedAt_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
