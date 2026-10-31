package com.spotify.gander.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gvm0;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MultiUserImage extends h implements v2j0 {
    private static final MultiUserImage DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_IMAGES_FIELD_NUMBER = 1;
    private h290 userImages_ = h.emptyProtobufList();

    static {
        MultiUserImage multiUserImage = new MultiUserImage();
        DEFAULT_INSTANCE = multiUserImage;
        h.registerDefaultInstance(MultiUserImage.class, multiUserImage);
    }

    private MultiUserImage() {
    }

    public static MultiUserImage o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static gvm0 q() {
        return (gvm0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"userImages_", UserImage.class});
        }
        if (iOrdinal == 3) {
            return new MultiUserImage();
        }
        if (iOrdinal == 4) {
            return new gvm0(DEFAULT_INSTANCE);
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
        synchronized (MultiUserImage.class) {
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

    public final void n(UserImage userImage) {
        userImage.getClass();
        h290 h290VarMutableCopy = this.userImages_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.userImages_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(userImage);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.userImages_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
