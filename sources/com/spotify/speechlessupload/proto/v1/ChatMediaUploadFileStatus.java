package com.spotify.speechlessupload.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.waf;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ChatMediaUploadFileStatus extends h implements v2j0 {
    private static final ChatMediaUploadFileStatus DEFAULT_INSTANCE;
    public static final int FILE_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private String fileUrl_ = "";
    private int status_;

    static {
        ChatMediaUploadFileStatus chatMediaUploadFileStatus = new ChatMediaUploadFileStatus();
        DEFAULT_INSTANCE = chatMediaUploadFileStatus;
        h.registerDefaultInstance(ChatMediaUploadFileStatus.class, chatMediaUploadFileStatus);
    }

    private ChatMediaUploadFileStatus() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"fileUrl_", "status_"});
        }
        if (iOrdinal == 3) {
            return new ChatMediaUploadFileStatus();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (ChatMediaUploadFileStatus.class) {
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

    public final waf n() {
        waf wafVar;
        int i = this.status_;
        if (i == 0) {
            wafVar = waf.CHAT_MEDIA_UPLOAD_STATE_UNSPECIFIED;
        } else if (i == 1) {
            wafVar = waf.CHAT_MEDIA_UPLOAD_STATE_PROCESSING;
        } else if (i != 2) {
            wafVar = i != 3 ? null : waf.CHAT_MEDIA_UPLOAD_STATE_FAILED;
        } else {
            wafVar = waf.CHAT_MEDIA_UPLOAD_STATE_COMPLETED;
        }
        return wafVar == null ? waf.UNRECOGNIZED : wafVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
