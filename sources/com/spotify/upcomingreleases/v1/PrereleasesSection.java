package com.spotify.upcomingreleases.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lyv0;
import p.n4w0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PrereleasesSection extends h implements v2j0 {
    private static final PrereleasesSection DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PRERELEASES_FIELD_NUMBER = 2;
    public static final int USER_METADATA_FIELD_NUMBER = 3;
    private int bitField0_;
    private int id_;
    private h290 prereleases_ = h.emptyProtobufList();
    private UserMetadata userMetadata_;

    static {
        PrereleasesSection prereleasesSection = new PrereleasesSection();
        DEFAULT_INSTANCE = prereleasesSection;
        h.registerDefaultInstance(PrereleasesSection.class, prereleasesSection);
    }

    private PrereleasesSection() {
    }

    public static PrereleasesSection n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "id_", "prereleases_", Prerelease.class, "userMetadata_"});
        }
        if (iOrdinal == 3) {
            return new PrereleasesSection();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (PrereleasesSection.class) {
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

    public final n4w0 o() {
        n4w0 n4w0Var;
        int i = this.id_;
        if (i == 0) {
            n4w0Var = n4w0.b;
        } else if (i != 1) {
            n4w0Var = i != 2 ? null : n4w0.d;
        } else {
            n4w0Var = n4w0.c;
        }
        return n4w0Var == null ? n4w0.e : n4w0Var;
    }

    public final h290 p() {
        return this.prereleases_;
    }

    public final UserMetadata q() {
        UserMetadata userMetadata = this.userMetadata_;
        return userMetadata == null ? UserMetadata.n() : userMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
