package com.spotify.extendedmetadata.extensions.merchimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class MerchItem extends h implements v2j0 {
    private static final MerchItem DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_URI_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 6;
    public static final int URL_FIELD_NUMBER = 4;
    private String id_ = "";
    private String name_ = "";
    private String description_ = "";
    private String url_ = "";
    private String imageUri_ = "";
    private String price_ = "";

    static {
        MerchItem merchItem = new MerchItem();
        DEFAULT_INSTANCE = merchItem;
        h.registerDefaultInstance(MerchItem.class, merchItem);
    }

    private MerchItem() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"id_", "name_", "description_", "url_", "imageUri_", "price_"});
        }
        if (iOrdinal == 3) {
            return new MerchItem();
        }
        if (iOrdinal == 4) {
            return new eog0((byte) 24);
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
        synchronized (MerchItem.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final String getId() {
        return this.id_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getUrl() {
        return this.url_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.imageUri_;
    }

    public final String p() {
        return this.price_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
