package com.spotify.allboarding.model.v2.proto;

import com.google.protobuf.h;
import com.spotify.allboarding.model.v1.proto.NullableString;
import com.spotify.allboarding.model.v1.proto.Tag;
import p.bf40;
import p.h290;
import p.j4l;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ContentPicker extends h implements v2j0 {
    private static final ContentPicker DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 5;
    public static final int MIN_SELECTIONS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_BUTTON_LABEL_FIELD_NUMBER = 6;
    public static final int SEARCH_FIELD_NUMBER = 4;
    public static final int SECONDARY_BUTTON_LABEL_FIELD_NUMBER = 7;
    public static final int SECTIONS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int minSelections_;
    private NullableString primaryButtonLabel_;
    private SearchConfiguration search_;
    private NullableString secondaryButtonLabel_;
    private NullableString title_;
    private h290 sections_ = h.emptyProtobufList();
    private h290 filters_ = h.emptyProtobufList();

    static {
        ContentPicker contentPicker = new ContentPicker();
        DEFAULT_INSTANCE = contentPicker;
        h.registerDefaultInstance(ContentPicker.class, contentPicker);
    }

    private ContentPicker() {
    }

    public static ContentPicker n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u001b\u0004ဉ\u0001\u0005\u001b\u0006ဉ\u0002\u0007ဉ\u0003", new Object[]{"bitField0_", "title_", "minSelections_", "sections_", Section.class, "search_", "filters_", Tag.class, "primaryButtonLabel_", "secondaryButtonLabel_"});
        }
        if (iOrdinal == 3) {
            return new ContentPicker();
        }
        if (iOrdinal == 4) {
            return new j4l(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (ContentPicker.class) {
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

    public final h290 o() {
        return this.filters_;
    }

    public final int p() {
        return this.minSelections_;
    }

    public final NullableString q() {
        NullableString nullableString = this.primaryButtonLabel_;
        return nullableString == null ? NullableString.n() : nullableString;
    }

    public final SearchConfiguration r() {
        SearchConfiguration searchConfiguration = this.search_;
        return searchConfiguration == null ? SearchConfiguration.n() : searchConfiguration;
    }

    public final NullableString s() {
        NullableString nullableString = this.secondaryButtonLabel_;
        return nullableString == null ? NullableString.n() : nullableString;
    }

    public final h290 t() {
        return this.sections_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final NullableString u() {
        NullableString nullableString = this.title_;
        return nullableString == null ? NullableString.n() : nullableString;
    }
}
