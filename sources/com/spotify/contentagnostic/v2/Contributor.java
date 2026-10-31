package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Contributor extends h implements v2j0 {
    public static final int AI_ATTRIBUTION_FIELD_NUMBER = 7;
    private static final Contributor DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REFERENCE_FIELD_NUMBER = 4;
    public static final int ROLE_FIELD_NUMBER = 2;
    public static final int ROLE_GROUP_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 5;
    private AiAttribution aiAttribution_;
    private int bitField0_;
    private Reference reference_;
    private RoleGroup roleGroup_;
    private String name_ = "";
    private String role_ = "";
    private String uri_ = "";
    private String url_ = "";

    static {
        Contributor contributor = new Contributor();
        DEFAULT_INSTANCE = contributor;
        h.registerDefaultInstance(Contributor.class, contributor);
    }

    private Contributor() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0001\u0004ဉ\u0002\u0005ለ\u0003\u0006ဉ\u0000\u0007ဉ\u0004", new Object[]{"bitField0_", "name_", "role_", "uri_", "reference_", "url_", "roleGroup_", "aiAttribution_"});
        }
        if (iOrdinal == 3) {
            return new Contributor();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (Contributor.class) {
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

    public final String getRole() {
        return this.role_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String getUrl() {
        return this.url_;
    }

    public final boolean hasUri() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasUrl() {
        return (this.bitField0_ & 8) != 0;
    }

    public final RoleGroup n() {
        RoleGroup roleGroup = this.roleGroup_;
        return roleGroup == null ? RoleGroup.n() : roleGroup;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
