package com.spotify.connect.artisanalcastgroupcontrolesperanto.proto;

import com.google.protobuf.h;
import p.a53;
import p.bf40;
import p.h290;
import p.jf40;
import p.ka6;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ArtisanalCastGroupControlSnapshot extends h implements v2j0 {
    public static final int ACTIVE_GROUP_CONNECT_STATE_IDENTIFIER_FIELD_NUMBER = 6;
    public static final int AVAILABLE_FIELD_NUMBER = 1;
    public static final int CONNECTION_STATE_FIELD_NUMBER = 2;
    private static final ArtisanalCastGroupControlSnapshot DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 4;
    public static final int GENERATION_FIELD_NUMBER = 3;
    public static final int MUTATION_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER;
    private boolean available_;
    private int bitField0_;
    private int connectionState_;
    private long generation_;
    private ArtisanalCastGroupControlMutation mutation_;
    private h290 devices_ = h.emptyProtobufList();
    private String activeGroupConnectStateIdentifier_ = "";

    static {
        ArtisanalCastGroupControlSnapshot artisanalCastGroupControlSnapshot = new ArtisanalCastGroupControlSnapshot();
        DEFAULT_INSTANCE = artisanalCastGroupControlSnapshot;
        h.registerDefaultInstance(ArtisanalCastGroupControlSnapshot.class, artisanalCastGroupControlSnapshot);
    }

    private ArtisanalCastGroupControlSnapshot() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ArtisanalCastGroupControlSnapshot r(byte[] bArr) {
        return (ArtisanalCastGroupControlSnapshot) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0007\u0002\f\u0003\u0003\u0004\u001b\u0005ဉ\u0000\u0006Ȉ", new Object[]{"bitField0_", "available_", "connectionState_", "generation_", "devices_", ArtisanalCastGroupControlDevice.class, "mutation_", "activeGroupConnectStateIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new ArtisanalCastGroupControlSnapshot();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (ArtisanalCastGroupControlSnapshot.class) {
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

    public final boolean getAvailable() {
        return this.available_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String n() {
        return this.activeGroupConnectStateIdentifier_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ka6 o() {
        ka6 ka6Var;
        int i = this.connectionState_;
        if (i == 0) {
            ka6Var = ka6.ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_IDLE;
        } else if (i == 1) {
            ka6Var = ka6.ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_CONNECTED;
        } else if (i == 2) {
            ka6Var = ka6.ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_MIGRATING;
        } else if (i != 3) {
            ka6Var = i != 4 ? null : ka6.ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_ADOPTING;
        } else {
            ka6Var = ka6.ARTISANAL_CAST_GROUP_CONTROL_CONNECTION_STATE_RECOVERING;
        }
        return ka6Var == null ? ka6.UNRECOGNIZED : ka6Var;
    }

    public final h290 p() {
        return this.devices_;
    }

    public final ArtisanalCastGroupControlMutation q() {
        ArtisanalCastGroupControlMutation artisanalCastGroupControlMutation = this.mutation_;
        return artisanalCastGroupControlMutation == null ? ArtisanalCastGroupControlMutation.n() : artisanalCastGroupControlMutation;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
