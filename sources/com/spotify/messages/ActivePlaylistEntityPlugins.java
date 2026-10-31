package com.spotify.messages;

import com.spotify.player.model.Context$Metadata;
import p.bf40;
import p.gc0;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ActivePlaylistEntityPlugins extends com.google.protobuf.h implements v2j0 {
    public static final int ALL_SONGS_CONFIGURATION_FIELD_NUMBER = 11;
    public static final int COMPONENT_CONFIGURATION_FIELD_NUMBER = 13;
    public static final int CONTEXT_MENU_HEADER_FIELD_NUMBER = 21;
    public static final int CONTEXT_MENU_ITEMS_FIELD_NUMBER = 14;
    public static final int DATA_SOURCE_FIELD_NUMBER = 6;
    private static final ActivePlaylistEntityPlugins DEFAULT_INSTANCE;
    public static final int DERIVED_FORMAT_LIST_TYPE_FIELD_NUMBER = 3;
    public static final int ENTITY_METADATA_EXTENSIONS_FIELD_NUMBER = 26;
    public static final int FILTERCHIPS_FIELD_NUMBER = 30;
    public static final int HEADER_ACTIONS_FIELD_NUMBER = 17;
    public static final int HEADER_CREATOR_FIELD_NUMBER = 28;
    public static final int HEADER_FIELD_NUMBER = 4;
    public static final int HEADER_METADATA_FIELD_NUMBER = 18;
    public static final int HEADER_PLAY_BUTTON_FIELD_NUMBER = 19;
    public static final int HEADER_PRE_TITLE_FIELD_NUMBER = 29;
    public static final int HEADER_STORY_FIELD_NUMBER = 31;
    public static final int ITEM_CONTEXT_MENU_CONFIGURATION_FIELD_NUMBER = 23;
    public static final int ITEM_LIST_CONFIGURATION_FIELD_NUMBER = 12;
    public static final int ITEM_LIST_FIELD_NUMBER = 5;
    public static final int ITEM_LIST_ROWS_FIELD_NUMBER = 8;
    public static final int ITEM_LIST_ROW_INTERACTIONS_FIELD_NUMBER = 25;
    public static final int ITEM_METADATA_EXTENSIONS_FIELD_NUMBER = 24;
    public static final int LICENSE_LAYOUT_FIELD_NUMBER = 1;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_CONFIGURATION_FIELD_NUMBER = 22;
    public static final int PLAYLIST_COMPONENTS_FIELD_NUMBER = 16;
    public static final int RAW_FORMAT_LIST_TYPE_FIELD_NUMBER = 2;
    public static final int SECTIONS_ABOVE_FIELD_NUMBER = 9;
    public static final int SECTIONS_BELOW_FIELD_NUMBER = 10;
    public static final int SECTIONS_INLINE_FIELD_NUMBER = 20;
    public static final int SORT_ITEMS_FIELD_NUMBER = 27;
    public static final int TRACK_CLOUD_CONFIGURATION_FIELD_NUMBER = 15;
    private int bitField0_;
    private String licenseLayout_ = "";
    private String rawFormatListType_ = "";
    private String derivedFormatListType_ = "";
    private String header_ = "";
    private String itemList_ = "";
    private String dataSource_ = "";
    private String pageIdentifier_ = "";
    private h290 itemListRows_ = com.google.protobuf.h.emptyProtobufList();
    private h290 sectionsAbove_ = com.google.protobuf.h.emptyProtobufList();
    private h290 sectionsBelow_ = com.google.protobuf.h.emptyProtobufList();
    private String allSongsConfiguration_ = "";
    private String itemListConfiguration_ = "";
    private String componentConfiguration_ = "";
    private h290 contextMenuItems_ = com.google.protobuf.h.emptyProtobufList();
    private String trackCloudConfiguration_ = "";
    private h290 playlistComponents_ = com.google.protobuf.h.emptyProtobufList();
    private h290 headerActions_ = com.google.protobuf.h.emptyProtobufList();
    private String headerMetadata_ = "";
    private String headerPlayButton_ = "";
    private h290 sectionsInline_ = com.google.protobuf.h.emptyProtobufList();
    private String contextMenuHeader_ = "";
    private String playbackConfiguration_ = "";
    private String itemContextMenuConfiguration_ = "";
    private h290 itemMetadataExtensions_ = com.google.protobuf.h.emptyProtobufList();
    private h290 itemListRowInteractions_ = com.google.protobuf.h.emptyProtobufList();
    private h290 entityMetadataExtensions_ = com.google.protobuf.h.emptyProtobufList();
    private h290 sortItems_ = com.google.protobuf.h.emptyProtobufList();
    private String headerCreator_ = "";
    private String headerPreTitle_ = "";
    private String filterchips_ = "";
    private String headerStory_ = "";

    static {
        ActivePlaylistEntityPlugins activePlaylistEntityPlugins = new ActivePlaylistEntityPlugins();
        DEFAULT_INSTANCE = activePlaylistEntityPlugins;
        com.google.protobuf.h.registerDefaultInstance(ActivePlaylistEntityPlugins.class, activePlaylistEntityPlugins);
    }

    private ActivePlaylistEntityPlugins() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static gc0 x() {
        return (gc0) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.derivedFormatListType_ = str;
    }

    public final void B(String str) {
        this.bitField0_ |= 8;
        this.header_ = str;
    }

    public final void C(String str) {
        this.bitField0_ |= 65536;
        this.headerCreator_ = str;
    }

    public final void D(String str) {
        this.bitField0_ |= 2048;
        this.headerMetadata_ = str;
    }

    public final void E(String str) {
        this.bitField0_ |= 4096;
        this.headerPlayButton_ = str;
    }

    public final void F(String str) {
        this.bitField0_ |= 131072;
        this.headerPreTitle_ = str;
    }

    public final void G(String str) {
        this.bitField0_ |= 524288;
        this.headerStory_ = str;
    }

    public final void H(String str) {
        this.bitField0_ |= 32768;
        this.itemContextMenuConfiguration_ = str;
    }

    public final void I() {
        this.bitField0_ |= 16;
        this.itemList_ = Context$Metadata.SHUFFLE_ALGORITHM_NONE;
    }

    public final void J(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.licenseLayout_ = str;
    }

    public final void K(String str) {
        this.bitField0_ |= 64;
        this.pageIdentifier_ = str;
    }

    public final void L(String str) {
        this.bitField0_ |= 2;
        this.rawFormatListType_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u000b\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b\u001a\t\u001a\n\u001a\u000bဈ\u0007\fဈ\b\rဈ\t\u000e\u001a\u000fဈ\n\u0010\u001a\u0011\u001a\u0012ဈ\u000b\u0013ဈ\f\u0014\u001a\u0015ဈ\r\u0016ဈ\u000e\u0017ဈ\u000f\u0018\u001a\u0019\u001a\u001a\u001a\u001b\u001a\u001cဈ\u0010\u001dဈ\u0011\u001eဈ\u0012\u001fဈ\u0013", new Object[]{"bitField0_", "licenseLayout_", "rawFormatListType_", "derivedFormatListType_", "header_", "itemList_", "dataSource_", "pageIdentifier_", "itemListRows_", "sectionsAbove_", "sectionsBelow_", "allSongsConfiguration_", "itemListConfiguration_", "componentConfiguration_", "contextMenuItems_", "trackCloudConfiguration_", "playlistComponents_", "headerActions_", "headerMetadata_", "headerPlayButton_", "sectionsInline_", "contextMenuHeader_", "playbackConfiguration_", "itemContextMenuConfiguration_", "itemMetadataExtensions_", "itemListRowInteractions_", "entityMetadataExtensions_", "sortItems_", "headerCreator_", "headerPreTitle_", "filterchips_", "headerStory_"});
        }
        if (iOrdinal == 3) {
            return new ActivePlaylistEntityPlugins();
        }
        if (iOrdinal == 4) {
            return new gc0(DEFAULT_INSTANCE);
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
        synchronized (ActivePlaylistEntityPlugins.class) {
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

    public final void n() {
        h290 h290VarMutableCopy = this.contextMenuItems_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.contextMenuItems_ = h290VarMutableCopy;
        }
        s8.addAll(z6x.a, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(Iterable iterable) {
        h290 h290VarMutableCopy = this.entityMetadataExtensions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.entityMetadataExtensions_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void p(Iterable iterable) {
        h290 h290VarMutableCopy = this.headerActions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.headerActions_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void q(Iterable iterable) {
        h290 h290VarMutableCopy = this.itemListRowInteractions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.itemListRowInteractions_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void r(Iterable iterable) {
        h290 h290VarMutableCopy = this.itemListRows_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.itemListRows_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void s(Iterable iterable) {
        h290 h290VarMutableCopy = this.itemMetadataExtensions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.itemMetadataExtensions_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void t(Iterable iterable) {
        h290 h290VarMutableCopy = this.playlistComponents_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.playlistComponents_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(Iterable iterable) {
        h290 h290VarMutableCopy = this.sectionsAbove_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.sectionsAbove_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void v(Iterable iterable) {
        h290 h290VarMutableCopy = this.sectionsBelow_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.sectionsBelow_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void w() {
        h290 h290VarMutableCopy = this.sectionsInline_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.sectionsInline_ = h290VarMutableCopy;
        }
        s8.addAll(z6x.a, h290VarMutableCopy);
    }

    public final void y(String str) {
        this.bitField0_ |= 512;
        this.componentConfiguration_ = str;
    }

    public final void z() {
        this.bitField0_ |= 8192;
        this.contextMenuHeader_ = "default";
    }
}
