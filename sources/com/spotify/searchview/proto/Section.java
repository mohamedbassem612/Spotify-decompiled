package com.spotify.searchview.proto;

import java.util.List;
import p.bf40;
import p.bj51;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wc21;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Section extends com.google.protobuf.h implements v2j0 {
    public static final int ATTRIBUTION_URI_FIELD_NUMBER = 3;
    public static final int CHAT_ENTRY_POINT_FIELD_NUMBER = 6;
    private static final Section DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RENDER_HINT_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ChatEntryPoint chatEntryPoint_;
    private int renderHint_;
    private int type_;
    private h290 items_ = com.google.protobuf.h.emptyProtobufList();
    private String attributionUri_ = "";
    private String description_ = "";

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        com.google.protobuf.h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
    }

    public static Section p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003Ȉ\u0004Ȉ\u0005\f\u0006ဉ\u0000", new Object[]{"bitField0_", "type_", "items_", SectionItem.class, "attributionUri_", "description_", "renderHint_", "chatEntryPoint_"});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 9);
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

    public final String getDescription() {
        return this.description_;
    }

    public final List getItemsList() {
        return this.items_;
    }

    public final String n() {
        return this.attributionUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ChatEntryPoint o() {
        ChatEntryPoint chatEntryPoint = this.chatEntryPoint_;
        return chatEntryPoint == null ? ChatEntryPoint.p() : chatEntryPoint;
    }

    public final wc21 q() {
        wc21 wc21Var;
        int i = this.renderHint_;
        if (i == 0) {
            wc21Var = wc21.UNKNOWN_RENDERING;
        } else if (i != 1) {
            wc21Var = i != 2 ? null : wc21.LIST;
        } else {
            wc21Var = wc21.CAROUSEL;
        }
        return wc21Var == null ? wc21.UNRECOGNIZED : wc21Var;
    }

    public final bj51 r() {
        bj51 bj51Var;
        switch (this.type_) {
            case 0:
                bj51Var = bj51.SECTION_TYPE_UNKNOWN;
                break;
            case 1:
                bj51Var = bj51.SECTION_TYPE_VIDEO_CAROUSEL;
                break;
            case 2:
                bj51Var = bj51.SECTION_TYPE_GENERIC;
                break;
            case 3:
                bj51Var = bj51.SECTION_TYPE_DISCOVERY_FEED;
                break;
            case 4:
                bj51Var = bj51.SECTION_TYPE_CROSSWORD;
                break;
            case 5:
                bj51Var = bj51.SECTION_TYPE_INSTANT_MIX;
                break;
            case 6:
                bj51Var = bj51.SECTION_TYPE_DIVIDER;
                break;
            case 7:
                bj51Var = bj51.SECTION_TYPE_AGENT;
                break;
            case 8:
                bj51Var = bj51.SECTION_TYPE_RELATED_SEARCHES;
                break;
            case 9:
                bj51Var = bj51.SECTION_TYPE_CROSS_CONTENT_RELATED;
                break;
            case 10:
                bj51Var = bj51.SECTION_TYPE_START_A_CHAT;
                break;
            case 11:
                bj51Var = bj51.SECTION_TYPE_TRACK_VERSIONS;
                break;
            case 12:
                bj51Var = bj51.SECTION_TYPE_SEARCH_OVERVIEW_PLACEHOLDER;
                break;
            default:
                bj51Var = null;
                break;
        }
        return bj51Var == null ? bj51.UNRECOGNIZED : bj51Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
