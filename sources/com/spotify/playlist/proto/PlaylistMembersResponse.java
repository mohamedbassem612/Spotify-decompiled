package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cjj0;
import p.dzt0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vls0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaylistMembersResponse extends h implements v2j0 {
    public static final int BASE_PERMISSION_LEVEL_FIELD_NUMBER = 4;
    public static final int CAPABILITIES_FIELD_NUMBER = 3;
    private static final PlaylistMembersResponse DEFAULT_INSTANCE;
    public static final int MEMBERS_FIELD_NUMBER = 5;
    public static final int NUM_TOTAL_MEMBERS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int basePermissionLevel_;
    private int bitField0_;
    private Capabilities capabilities_;
    private int numTotalMembers_;
    private String title_ = "";
    private h290 members_ = h.emptyProtobufList();

    static {
        PlaylistMembersResponse playlistMembersResponse = new PlaylistMembersResponse();
        DEFAULT_INSTANCE = playlistMembersResponse;
        h.registerDefaultInstance(PlaylistMembersResponse.class, playlistMembersResponse);
    }

    private PlaylistMembersResponse() {
    }

    public static PlaylistMembersResponse o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005\u001b", new Object[]{"bitField0_", "title_", "numTotalMembers_", "capabilities_", "basePermissionLevel_", cjj0.l, "members_", Member.class});
        }
        if (iOrdinal == 3) {
            return new PlaylistMembersResponse();
        }
        if (iOrdinal == 4) {
            return new dzt0(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (PlaylistMembersResponse.class) {
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

    public final Capabilities getCapabilities() {
        Capabilities capabilities = this.capabilities_;
        return capabilities == null ? Capabilities.z() : capabilities;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getTitle() {
        return this.title_;
    }

    public final vls0 n() {
        vls0 vls0VarA = vls0.a(this.basePermissionLevel_);
        return vls0VarA == null ? vls0.b : vls0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.members_;
    }

    public final int q() {
        return this.numTotalMembers_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
