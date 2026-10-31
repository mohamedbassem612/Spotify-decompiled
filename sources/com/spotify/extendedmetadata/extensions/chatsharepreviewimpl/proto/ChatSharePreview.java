package com.spotify.extendedmetadata.extensions.chatsharepreviewimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ChatSharePreview extends h implements v2j0 {
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final ChatSharePreview DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_FORMAT_FIELD_NUMBER = 3;
    public static final int STICKER_FIELD_NUMBER = 2;
    private Background background_;
    private int bitField0_;
    private ShareFormat shareFormat_;
    private Image sticker_;

    static {
        ChatSharePreview chatSharePreview = new ChatSharePreview();
        DEFAULT_INSTANCE = chatSharePreview;
        h.registerDefaultInstance(ChatSharePreview.class, chatSharePreview);
    }

    private ChatSharePreview() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ChatSharePreview q(byte[] bArr) {
        return (ChatSharePreview) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "background_", "sticker_", "shareFormat_"});
        }
        if (iOrdinal == 3) {
            return new ChatSharePreview();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (ChatSharePreview.class) {
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

    public final boolean hasSticker() {
        return (this.bitField0_ & 2) != 0;
    }

    public final Background n() {
        Background background = this.background_;
        return background == null ? Background.p() : background;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShareFormat o() {
        ShareFormat shareFormat = this.shareFormat_;
        return shareFormat == null ? ShareFormat.n() : shareFormat;
    }

    public final Image p() {
        Image image = this.sticker_;
        return image == null ? Image.n() : image;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
