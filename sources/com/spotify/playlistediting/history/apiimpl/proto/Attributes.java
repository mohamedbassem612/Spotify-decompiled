package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.spotify.playlistediting.history.apiimpl.proto.savesource.SaveSource;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Attributes extends h implements v2j0 {
    public static final int ADDED_AT_FIELD_NUMBER = 18;
    public static final int ADDED_BY_USERNAME_FIELD_NUMBER = 6;
    public static final int CREATED_AT_FIELD_NUMBER = 8;
    private static final Attributes DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int OWNER_USERNAME_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PICTURE_FILE_ID_FIELD_NUMBER = 20;
    public static final int PICTURE_SIZES_FIELD_NUMBER = 21;
    public static final int SAVE_SOURCE_FIELD_NUMBER = 28;
    public static final int UPDATED_AT_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private Timestamp addedAt_;
    private int bitField0_;
    private Timestamp createdAt_;
    private SaveSource saveSource_;
    private Timestamp updatedAt_;
    private String uri_ = "";
    private String name_ = "";
    private String description_ = "";
    private String addedByUsername_ = "";
    private String ownerUsername_ = "";
    private phc pictureFileId_ = phc.b;
    private h290 pictureSizes_ = h.emptyProtobufList();

    static {
        Attributes attributes = new Attributes();
        DEFAULT_INSTANCE = attributes;
        h.registerDefaultInstance(Attributes.class, attributes);
    }

    private Attributes() {
    }

    public static Attributes n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u001c\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ဉ\u0003\u0006ለ\u0004\u0007ለ\u0005\bဉ\u0006\u0012ဉ\u0007\u0014ည\b\u0015\u001c\u001cဉ\t", new Object[]{"bitField0_", "uri_", "name_", "description_", "updatedAt_", "addedByUsername_", "ownerUsername_", "createdAt_", "addedAt_", "pictureFileId_", "pictureSizes_", "saveSource_"});
        }
        if (iOrdinal == 3) {
            return new Attributes();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (Attributes.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final boolean hasDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.pictureSizes_;
    }

    public final boolean p() {
        return (this.bitField0_ & 256) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
