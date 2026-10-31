package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ko8;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AuthorMetadata extends h implements v2j0 {
    private static final AuthorMetadata DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_AUTHOR_METADATA_FIELD_NUMBER = 2;
    public static final int USER_AUTHOR_METADATA_FIELD_NUMBER = 1;
    private int authorMetadataCase_ = 0;
    private Object authorMetadata_;

    static {
        AuthorMetadata authorMetadata = new AuthorMetadata();
        DEFAULT_INSTANCE = authorMetadata;
        h.registerDefaultInstance(AuthorMetadata.class, authorMetadata);
    }

    private AuthorMetadata() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ko8 q() {
        return (ko8) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"authorMetadata_", "authorMetadataCase_", UserAuthorMetadata.class, ShowAuthorMetadata.class});
        }
        if (iOrdinal == 3) {
            return new AuthorMetadata();
        }
        if (iOrdinal == 4) {
            return new ko8(DEFAULT_INSTANCE);
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
        synchronized (AuthorMetadata.class) {
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

    public final int n() {
        int i = this.authorMetadataCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowAuthorMetadata o() {
        return this.authorMetadataCase_ == 2 ? (ShowAuthorMetadata) this.authorMetadata_ : ShowAuthorMetadata.n();
    }

    public final UserAuthorMetadata p() {
        return this.authorMetadataCase_ == 1 ? (UserAuthorMetadata) this.authorMetadata_ : UserAuthorMetadata.n();
    }

    public final void r(UserAuthorMetadata userAuthorMetadata) {
        userAuthorMetadata.getClass();
        this.authorMetadata_ = userAuthorMetadata;
        this.authorMetadataCase_ = 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
