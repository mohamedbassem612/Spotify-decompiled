package com.spotify.connect.artisanalcastgroupcontrolesperanto.proto;

import com.google.protobuf.h;
import p.a53;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ArtisanalCastGroupControlDevice extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 4;
    public static final int CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 1;
    private static final ArtisanalCastGroupControlDevice DEFAULT_INSTANCE;
    public static final int IS_GROUPABLE_FIELD_NUMBER = 8;
    public static final int IS_GROUP_MEMBER_FIELD_NUMBER = 7;
    public static final int IS_REMOVABLE_FIELD_NUMBER = 9;
    public static final int MUTED_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RAW_ENDPOINT_ID_FIELD_NUMBER = 2;
    public static final int VOLUME_LEVEL_FIELD_NUMBER = 5;
    private long capabilities_;
    private boolean isGroupMember_;
    private boolean isGroupable_;
    private boolean isRemovable_;
    private boolean muted_;
    private double volumeLevel_;
    private String connectStateIdentifier_ = "";
    private String rawEndpointId_ = "";
    private String name_ = "";

    static {
        ArtisanalCastGroupControlDevice artisanalCastGroupControlDevice = new ArtisanalCastGroupControlDevice();
        DEFAULT_INSTANCE = artisanalCastGroupControlDevice;
        h.registerDefaultInstance(ArtisanalCastGroupControlDevice.class, artisanalCastGroupControlDevice);
    }

    private ArtisanalCastGroupControlDevice() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0003\u0005\u0000\u0006\u0007\u0007\u0007\b\u0007\t\u0007", new Object[]{"connectStateIdentifier_", "rawEndpointId_", "name_", "capabilities_", "volumeLevel_", "muted_", "isGroupMember_", "isGroupable_", "isRemovable_"});
        }
        if (iOrdinal == 3) {
            return new ArtisanalCastGroupControlDevice();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (ArtisanalCastGroupControlDevice.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final long n() {
        return this.capabilities_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.connectStateIdentifier_;
    }

    public final boolean p() {
        return this.isGroupMember_;
    }

    public final boolean q() {
        return this.isGroupable_;
    }

    public final boolean r() {
        return this.isRemovable_;
    }

    public final boolean s() {
        return this.muted_;
    }

    public final String t() {
        return this.rawEndpointId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final double u() {
        return this.volumeLevel_;
    }
}
