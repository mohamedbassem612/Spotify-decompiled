package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.ald;
import p.b290;
import p.bf40;
import p.c290;
import p.cjj0;
import p.h290;
import p.jf40;
import p.lfb;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Capabilities extends h implements v2j0 {
    public static final int ADMINISTRATE_PERMISSION_KIND_CAPABILITIES_FIELD_NUMBER = 12;
    public static final int ATTRIBUTE_KIND_CAPABILITIES_FIELD_NUMBER = 9;
    public static final int CAN_ABUSE_REPORT_FIELD_NUMBER = 14;
    public static final int CAN_ADD_PROMPT_FIELD_NUMBER = 20;
    public static final int CAN_ADMINISTRATE_PERMISSIONS_FIELD_NUMBER = 2;
    public static final int CAN_BROWSE_HISTORY_FIELD_NUMBER = 21;
    public static final int CAN_CANCEL_MEMBERSHIP_FIELD_NUMBER = 6;
    public static final int CAN_DELETE_FIELD_NUMBER = 13;
    public static final int CAN_EDIT_ITEMS_FIELD_NUMBER = 5;
    public static final int CAN_EDIT_METADATA_FIELD_NUMBER = 4;
    public static final int CAN_EDIT_PROMPT_FIELD_NUMBER = 19;
    public static final int CAN_MIX_PLAYLIST_FIELD_NUMBER = 10;
    public static final int CAN_MODIFY_SPEED_PLAYLIST_FIELD_NUMBER = 17;
    public static final int CAN_PUBLISH_TO_PROFILE_FIELD_NUMBER = 15;
    public static final int CAN_REVERT_HISTORY_FIELD_NUMBER = 22;
    public static final int CAN_SEND_MESSAGES_FIELD_NUMBER = 11;
    public static final int CAN_VIEW_FIELD_NUMBER = 1;
    public static final int CAN_VIEW_PROMPT_FIELD_NUMBER = 23;
    private static final Capabilities DEFAULT_INSTANCE;
    public static final int GRANTABLE_LEVELS_FIELD_NUMBER = 7;
    public static final int GRANTABLE_LEVEL_FIELD_NUMBER = 3;
    public static final int LIST_ATTRIBUTE_CAPABILITIES_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER;
    private static final c290 grantableLevel_converter_ = new lfb((byte) 1);
    private AdministratePermissionKindCapabilities administratePermissionKindCapabilities_;
    private int bitField0_;
    private boolean canAbuseReport_;
    private boolean canAddPrompt_;
    private boolean canAdministratePermissions_;
    private boolean canBrowseHistory_;
    private boolean canCancelMembership_;
    private boolean canDelete_;
    private boolean canEditItems_;
    private boolean canEditMetadata_;
    private boolean canEditPrompt_;
    private boolean canMixPlaylist_;
    private boolean canModifySpeedPlaylist_;
    private boolean canPublishToProfile_;
    private boolean canRevertHistory_;
    private boolean canSendMessages_;
    private boolean canViewPrompt_;
    private boolean canView_;
    private GrantableLevels grantableLevels_;
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

    public static ald C(Capabilities capabilities) {
        return DEFAULT_INSTANCE.createBuilder(capabilities);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Capabilities z() {
        return DEFAULT_INSTANCE;
    }

    public final GrantableLevels A() {
        GrantableLevels grantableLevels = this.grantableLevels_;
        return grantableLevels == null ? GrantableLevels.o() : grantableLevels;
    }

    public final ListAttributeCapabilities B() {
        ListAttributeCapabilities listAttributeCapabilities = this.listAttributeCapabilities_;
        return listAttributeCapabilities == null ? ListAttributeCapabilities.n() : listAttributeCapabilities;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0017\u0015\u0000\u0002\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ࠞ\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဉ\u0005\bဉ\u0006\t\u001b\nဇ\u0007\u000bဇ\b\fဉ\t\rဇ\n\u000eဇ\u000b\u000fဇ\f\u0011ဇ\r\u0013ဇ\u000e\u0014ဇ\u000f\u0015ဇ\u0010\u0016ဇ\u0011\u0017ဇ\u0012", new Object[]{"bitField0_", "canView_", "canAdministratePermissions_", "grantableLevel_", cjj0.l, "canEditMetadata_", "canEditItems_", "canCancelMembership_", "grantableLevels_", "listAttributeCapabilities_", "attributeKindCapabilities_", AttributeKindCapabilities.class, "canMixPlaylist_", "canSendMessages_", "administratePermissionKindCapabilities_", "canDelete_", "canAbuseReport_", "canPublishToProfile_", "canModifySpeedPlaylist_", "canEditPrompt_", "canAddPrompt_", "canBrowseHistory_", "canRevertHistory_", "canViewPrompt_"});
        }
        if (iOrdinal == 3) {
            return new Capabilities();
        }
        if (iOrdinal == 4) {
            return new ald();
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.canAddPrompt_;
    }

    public final boolean p() {
        return this.canAdministratePermissions_;
    }

    public final boolean q() {
        return this.canBrowseHistory_;
    }

    public final boolean r() {
        return this.canCancelMembership_;
    }

    public final boolean s() {
        return this.canDelete_;
    }

    public final boolean t() {
        return this.canEditItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.canEditPrompt_;
    }

    public final boolean v() {
        return this.canMixPlaylist_;
    }

    public final boolean w() {
        return this.canModifySpeedPlaylist_;
    }

    public final boolean x() {
        return this.canRevertHistory_;
    }

    public final boolean y() {
        return this.canViewPrompt_;
    }
}
