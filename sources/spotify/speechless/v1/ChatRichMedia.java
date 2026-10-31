package spotify.speechless.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ChatRichMedia extends h implements v2j0 {
    private static final ChatRichMedia DEFAULT_INSTANCE;
    public static final int MEDIA_OBJECT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private h290 mediaObject_ = h.emptyProtobufList();

    static {
        ChatRichMedia chatRichMedia = new ChatRichMedia();
        DEFAULT_INSTANCE = chatRichMedia;
        h.registerDefaultInstance(ChatRichMedia.class, chatRichMedia);
    }

    private ChatRichMedia() {
    }

    public static ChatRichMedia o(byte[] bArr) {
        return (ChatRichMedia) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"mediaObject_", MediaObject.class});
        }
        if (iOrdinal == 3) {
            return new ChatRichMedia();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (ChatRichMedia.class) {
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

    public final h290 n() {
        return this.mediaObject_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
