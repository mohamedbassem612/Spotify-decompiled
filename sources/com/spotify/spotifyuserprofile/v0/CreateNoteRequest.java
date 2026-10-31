package com.spotify.spotifyuserprofile.v0;

import com.google.protobuf.h;
import p.bf40;
import p.bon;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class CreateNoteRequest extends h implements v2j0 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final CreateNoteRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SECTION_ID_FIELD_NUMBER = 1;
    private String sectionId_ = "";
    private String content_ = "";

    static {
        CreateNoteRequest createNoteRequest = new CreateNoteRequest();
        DEFAULT_INSTANCE = createNoteRequest;
        h.registerDefaultInstance(CreateNoteRequest.class, createNoteRequest);
    }

    private CreateNoteRequest() {
    }

    public static bon n() {
        return (bon) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"sectionId_", "content_"});
        }
        if (iOrdinal == 3) {
            return new CreateNoteRequest();
        }
        if (iOrdinal == 4) {
            return new bon(DEFAULT_INSTANCE);
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
        synchronized (CreateNoteRequest.class) {
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
        this.content_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.sectionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
