package com.spotify.extendedmetadata.extensions.listmetadataimpl;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.bid;
import p.c290;
import p.h290;
import p.jf40;
import p.nfb;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Capabilities extends h implements v2j0 {
    public static final int ATTRIBUTE_KIND_CAPABILITIES_FIELD_NUMBER = 9;
    public static final int CAN_ADMINISTRATE_PERMISSIONS_FIELD_NUMBER = 2;
    public static final int CAN_BROWSE_HISTORY_FIELD_NUMBER = 21;
    public static final int CAN_CANCEL_MEMBERSHIP_FIELD_NUMBER = 6;
    public static final int CAN_EDIT_ITEMS_FIELD_NUMBER = 5;
    public static final int CAN_EDIT_METADATA_FIELD_NUMBER = 4;
    public static final int CAN_REVERT_HISTORY_FIELD_NUMBER = 22;
    public static final int CAN_VIEW_FIELD_NUMBER = 1;
    public static final int CAN_VIEW_PROMPT_FIELD_NUMBER = 23;
    private static final Capabilities DEFAULT_INSTANCE;
    public static final int GRANTABLE_LEVELS_FIELD_NUMBER = 7;
    public static final int GRANTABLE_LEVEL_FIELD_NUMBER = 3;
    public static final int LIST_ATTRIBUTE_CAPABILITIES_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER;
    private static final c290 grantableLevel_converter_ = new nfb((byte) 1, false);
    private int bitField0_;
    private boolean canAdministratePermissions_;
    private boolean canBrowseHistory_;
    private boolean canCancelMembership_;
    private boolean canEditItems_;
    private boolean canEditMetadata_;
    private boolean canRevertHistory_;
    private boolean canViewPrompt_;
    private boolean canView_;
    private int grantableLevelMemoizedSerializedSize;
    private GrantableLevelsProto grantableLevels_;
    private ListAttributeCapabilities listAttributeCapabilities_;
    private b290 grantableLevel_ = h.emptyIntList();
    private h290 attributeKindCapabilities_ = h.emptyProtobufList();

    static {
        Capabilities capabilities = new Capabilities();
        DEFAULT_INSTANCE = capabilities;
        h.registerDefaultInstance(Capabilities.class, capabilities);
    }

    private Capabilities() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Capabilities u() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\u0017\f\u0000\u0002\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003,\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဉ\u0005\bဉ\u0006\t\u001b\u0015ဇ\u0007\u0016ဇ\b\u0017ဇ\t", new Object[]{"bitField0_", "canView_", "canAdministratePermissions_", "grantableLevel_", "canEditMetadata_", "canEditItems_", "canCancelMembership_", "grantableLevels_", "listAttributeCapabilities_", "attributeKindCapabilities_", AttributeKindCapabilities.class, "canBrowseHistory_", "canRevertHistory_", "canViewPrompt_"});
        }
        if (iOrdinal == 3) {
            return new Capabilities();
        }
        if (iOrdinal == 4) {
            return new bid((byte) 4);
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
        synchronized (Capabilities.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.canAdministratePermissions_;
    }

    public final boolean p() {
        return this.canBrowseHistory_;
    }

    public final boolean q() {
        return this.canCancelMembership_;
    }

    public final boolean r() {
        return this.canEditItems_;
    }

    public final boolean s() {
        return this.canRevertHistory_;
    }

    public final boolean t() {
        return this.canViewPrompt_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final GrantableLevelsProto v() {
        GrantableLevelsProto grantableLevelsProto = this.grantableLevels_;
        return grantableLevelsProto == null ? GrantableLevelsProto.p() : grantableLevelsProto;
    }

    public final ListAttributeCapabilities w() {
        ListAttributeCapabilities listAttributeCapabilities = this.listAttributeCapabilities_;
        return listAttributeCapabilities == null ? ListAttributeCapabilities.o() : listAttributeCapabilities;
    }
}
