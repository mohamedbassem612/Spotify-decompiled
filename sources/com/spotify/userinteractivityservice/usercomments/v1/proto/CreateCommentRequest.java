package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.sjn;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CreateCommentRequest extends h implements v2j0 {
    public static final int COMMENT_STR_FIELD_NUMBER = 2;
    private static final CreateCommentRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMPS_FIELD_NUMBER = 3;
    private String entityUri_ = "";
    private String commentStr_ = "";
    private h290 timestamps_ = h.emptyProtobufList();

    static {
        CreateCommentRequest createCommentRequest = new CreateCommentRequest();
        DEFAULT_INSTANCE = createCommentRequest;
        h.registerDefaultInstance(CreateCommentRequest.class, createCommentRequest);
    }

    private CreateCommentRequest() {
    }

    public static sjn p() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"entityUri_", "commentStr_", "timestamps_", Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new CreateCommentRequest();
        }
        if (iOrdinal == 4) {
            return new sjn();
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
        synchronized (CreateCommentRequest.class) {
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

    public final void o(Iterable iterable) {
        h290 h290VarMutableCopy = this.timestamps_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.timestamps_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void q(String str) {
        str.getClass();
        this.commentStr_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.entityUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
