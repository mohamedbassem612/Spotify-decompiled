package com.spotify.concertview.concertfeedview.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.hf51;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Section extends h implements v2j0 {
    private static final Section DEFAULT_INSTANCE;
    public static final int EMPTY_VIEW_FIELD_NUMBER = 5;
    public static final int ITEMS_FIELD_NUMBER = 4;
    public static final int KIND_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int UBI_IDENTIFIER_FIELD_NUMBER = 6;
    private int bitField0_;
    private EmptyView emptyView_;
    private int kind_;
    private SectionMetadata metadata_;
    private SectionTitle title_;
    private h290 items_ = h.emptyProtobufList();
    private String ubiIdentifier_ = "";

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0003\f\u0004\u001b\u0005ဉ\u0001\u0006ለ\u0002\u0007ဉ\u0003", new Object[]{"bitField0_", "title_", "kind_", "items_", Item.class, "emptyView_", "ubiIdentifier_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (Section.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final hf51 n() {
        hf51 hf51Var;
        switch (this.kind_) {
            case 0:
                hf51Var = hf51.FEED_SECTION_KIND_UNSPECIFIED;
                break;
            case 1:
                hf51Var = hf51.FEED_SECTION_KIND_GRID;
                break;
            case 2:
                hf51Var = hf51.FEED_SECTION_KIND_CAROUSEL;
                break;
            case 3:
                hf51Var = hf51.FEED_SECTION_KIND_LIST;
                break;
            case 4:
                hf51Var = hf51.FEED_SECTION_KIND_LIST_HERO;
                break;
            case 5:
                hf51Var = hf51.FEED_SECTION_KIND_LIST_WIDE;
                break;
            case 6:
                hf51Var = hf51.FEED_SECTION_KIND_LIST_DATE_LOCATION;
                break;
            default:
                hf51Var = null;
                break;
        }
        return hf51Var == null ? hf51.UNRECOGNIZED : hf51Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SectionMetadata o() {
        SectionMetadata sectionMetadata = this.metadata_;
        return sectionMetadata == null ? SectionMetadata.n() : sectionMetadata;
    }

    public final SectionTitle p() {
        SectionTitle sectionTitle = this.title_;
        return sectionTitle == null ? SectionTitle.p() : sectionTitle;
    }

    public final String q() {
        return this.ubiIdentifier_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
