package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.iou0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistItemDecorationPolicy extends h implements v2j0 {
    public static final int ADDED_BY_FIELD_NUMBER = 11;
    public static final int ADD_TIME_FIELD_NUMBER = 10;
    public static final int COLLECTION_STATE_FIELD_NUMBER = 4;
    public static final int CURATION_STATE_FIELD_NUMBER = 6;
    private static final PlaylistItemDecorationPolicy DEFAULT_INSTANCE;
    public static final int EXTENSION_POLICY_FIELD_NUMBER = 2;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 8;
    public static final int METADATA_FIELD_NUMBER = 5;
    public static final int OBFUSCATION_STATE_FIELD_NUMBER = 7;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 9;
    public static final int SAVE_SOURCE_FIELD_NUMBER = 13;
    public static final int SIGNALS_FIELD_NUMBER = 12;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEO_OFFLINE_STATE_FIELD_NUMBER = 14;
    private boolean addTime_;
    private UserDecorationPolicy addedBy_;
    private int bitField0_;
    private boolean collectionState_;
    private ItemCurationStatePolicy curationState_;
    private h290 extensionPolicy_ = h.emptyProtobufList();
    private boolean formatListAttributes_;
    private ItemMetadataPolicy metadata_;
    private boolean obfuscationState_;
    private ItemOfflineStateDecorationPolicy offlineState_;
    private boolean rowId_;
    private boolean saveSource_;
    private boolean signals_;
    private boolean uri_;
    private boolean videoOfflineState_;

    static {
        PlaylistItemDecorationPolicy playlistItemDecorationPolicy = new PlaylistItemDecorationPolicy();
        DEFAULT_INSTANCE = playlistItemDecorationPolicy;
        h.registerDefaultInstance(PlaylistItemDecorationPolicy.class, playlistItemDecorationPolicy);
    }

    private PlaylistItemDecorationPolicy() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlaylistItemDecorationPolicy q() {
        return DEFAULT_INSTANCE;
    }

    public static iou0 v() {
        return (iou0) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A() {
        this.formatListAttributes_ = true;
    }

    public final void B(ItemMetadataPolicy itemMetadataPolicy) {
        itemMetadataPolicy.getClass();
        this.metadata_ = itemMetadataPolicy;
        this.bitField0_ |= 2;
    }

    public final void C() {
        this.obfuscationState_ = true;
    }

    public final void D(ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy) {
        itemOfflineStateDecorationPolicy.getClass();
        this.offlineState_ = itemOfflineStateDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final void E() {
        this.rowId_ = true;
    }

    public final void F() {
        this.saveSource_ = true;
    }

    public final void G() {
        this.signals_ = true;
    }

    public final void H(boolean z) {
        this.uri_ = z;
    }

    public final void I() {
        this.videoOfflineState_ = true;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001\u0007\u0002\u001b\u0003ဉ\u0000\u0004\u0007\u0005ဉ\u0001\u0006ဉ\u0002\u0007\u0007\b\u0007\t\u0007\n\u0007\u000bဉ\u0003\f\u0007\r\u0007\u000e\u0007", new Object[]{"bitField0_", "uri_", "extensionPolicy_", ItemExtensionPolicy.class, "offlineState_", "collectionState_", "metadata_", "curationState_", "obfuscationState_", "formatListAttributes_", "rowId_", "addTime_", "addedBy_", "signals_", "saveSource_", "videoOfflineState_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistItemDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new iou0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistItemDecorationPolicy.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.extensionPolicy_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.extensionPolicy_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.collectionState_;
    }

    public final ItemCurationStatePolicy p() {
        ItemCurationStatePolicy itemCurationStatePolicy = this.curationState_;
        return itemCurationStatePolicy == null ? ItemCurationStatePolicy.o() : itemCurationStatePolicy;
    }

    public final List r() {
        return this.extensionPolicy_;
    }

    public final ItemMetadataPolicy s() {
        ItemMetadataPolicy itemMetadataPolicy = this.metadata_;
        return itemMetadataPolicy == null ? ItemMetadataPolicy.n() : itemMetadataPolicy;
    }

    public final ItemOfflineStateDecorationPolicy t() {
        ItemOfflineStateDecorationPolicy itemOfflineStateDecorationPolicy = this.offlineState_;
        return itemOfflineStateDecorationPolicy == null ? ItemOfflineStateDecorationPolicy.n() : itemOfflineStateDecorationPolicy;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.uri_;
    }

    public final void w() {
        this.addTime_ = true;
    }

    public final void x(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.getClass();
        this.addedBy_ = userDecorationPolicy;
        this.bitField0_ |= 8;
    }

    public final void y(boolean z) {
        this.collectionState_ = z;
    }

    public final void z(ItemCurationStatePolicy itemCurationStatePolicy) {
        itemCurationStatePolicy.getClass();
        this.curationState_ = itemCurationStatePolicy;
        this.bitField0_ |= 4;
    }
}
