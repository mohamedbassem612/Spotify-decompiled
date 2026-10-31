package com.spotify.spotifyuserprofile.v0;

import com.google.protobuf.h;
import java.io.InputStream;
import p.bf40;
import p.eku;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EditNoteResponse extends h implements v2j0 {
    private static final EditNoteResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NOTE_FIELD_NUMBER = 4;
    public static final int NOTE_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int USER_FACING_MESSAGE_FIELD_NUMBER = 3;
    private int bitField0_;
    private Note note_;
    private Object result_;
    private int resultCase_ = 0;
    private String userFacingMessage_ = "";

    static {
        EditNoteResponse editNoteResponse = new EditNoteResponse();
        DEFAULT_INSTANCE = editNoteResponse;
        h.registerDefaultInstance(EditNoteResponse.class, editNoteResponse);
    }

    private EditNoteResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EditNoteResponse r(InputStream inputStream) {
        return (EditNoteResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000\u0003Ȉ\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", ErrorResponse.class, "userFacingMessage_", "note_"});
        }
        if (iOrdinal == 3) {
            return new EditNoteResponse();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (EditNoteResponse.class) {
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

    public final ErrorResponse n() {
        return this.resultCase_ == 2 ? (ErrorResponse) this.result_ : ErrorResponse.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Note o() {
        Note note = this.note_;
        return note == null ? Note.p() : note;
    }

    public final String p() {
        return this.userFacingMessage_;
    }

    public final boolean q() {
        return this.resultCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
