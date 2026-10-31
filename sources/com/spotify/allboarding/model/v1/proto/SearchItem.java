package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.h;
import p.a551;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SearchItem extends h implements v2j0 {
    public static final int CONTENT_PICKER_ITEM_FIELD_NUMBER = 6;
    private static final SearchItem DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 5;
    public static final int LOGGING_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SECTION_IDENTIFIER_FIELD_NUMBER = 8;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private Item contentPickerItem_;
    private NullableString imageUrl_;
    private Logging logging_;
    private NullableString subtitle_;
    private int type_;
    private String uri_ = "";
    private String title_ = "";
    private String sectionIdentifier_ = "";

    static {
        SearchItem searchItem = new SearchItem();
        DEFAULT_INSTANCE = searchItem;
        h.registerDefaultInstance(SearchItem.class, searchItem);
    }

    private SearchItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bȈ", new Object[]{"bitField0_", "type_", "uri_", "title_", "subtitle_", "imageUrl_", "contentPickerItem_", "logging_", "sectionIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new SearchItem();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (SearchItem.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final Item n() {
        Item item = this.contentPickerItem_;
        return item == null ? Item.o() : item;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final NullableString o() {
        NullableString nullableString = this.imageUrl_;
        return nullableString == null ? NullableString.n() : nullableString;
    }

    public final String p() {
        return this.sectionIdentifier_;
    }

    public final NullableString q() {
        NullableString nullableString = this.subtitle_;
        return nullableString == null ? NullableString.n() : nullableString;
    }

    public final a551 r() {
        a551 a551Var;
        int i = this.type_;
        if (i == 0) {
            a551Var = a551.DEFAULT;
        } else if (i == 1) {
            a551Var = a551.ARTIST;
        } else if (i != 2) {
            a551Var = i != 3 ? null : a551.TRACK;
        } else {
            a551Var = a551.SHOW;
        }
        return a551Var == null ? a551.UNRECOGNIZED : a551Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
