package com.spotify.metadata.classic.proto;

import com.google.protobuf.h;
import p.a01;
import p.bf40;
import p.eij0;
import p.h290;
import p.iij0;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$ArtistWithRole extends h implements v2j0 {
    public static final int ARTIST_GID_FIELD_NUMBER = 1;
    public static final int ARTIST_NAME_FIELD_NUMBER = 2;
    private static final Metadata$ArtistWithRole DEFAULT_INSTANCE;
    public static final int LOCALIZED_NAME_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int ROLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int role_;
    private phc artistGid_ = phc.b;
    private String artistName_ = "";
    private h290 localizedName_ = h.emptyProtobufList();

    static {
        Metadata$ArtistWithRole metadata$ArtistWithRole = new Metadata$ArtistWithRole();
        DEFAULT_INSTANCE = metadata$ArtistWithRole;
        h.registerDefaultInstance(Metadata$ArtistWithRole.class, metadata$ArtistWithRole);
    }

    private Metadata$ArtistWithRole() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004\u001b", new Object[]{"bitField0_", "artistGid_", "artistName_", "role_", a01.o, "localizedName_", Metadata$LocalizedString.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$ArtistWithRole();
        }
        if (iOrdinal == 4) {
            return new eij0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (Metadata$ArtistWithRole.class) {
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

    public final phc n() {
        return this.artistGid_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.artistName_;
    }

    public final iij0 p() {
        iij0 iij0VarA = iij0.a(this.role_);
        return iij0VarA == null ? iij0.ARTIST_ROLE_UNKNOWN : iij0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
