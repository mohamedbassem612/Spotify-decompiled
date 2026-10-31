package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tm90;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class LicensingIdentifiersTrait extends h implements v2j0 {
    public static final int ALBUM_URI_FIELD_NUMBER = 2;
    public static final int ARTIST_URI_FIELD_NUMBER = 3;
    private static final LicensingIdentifiersTrait DEFAULT_INSTANCE;
    public static final int ITEM_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String itemUri_ = "";
    private String albumUri_ = "";
    private h290 artistUri_ = h.emptyProtobufList();

    static {
        LicensingIdentifiersTrait licensingIdentifiersTrait = new LicensingIdentifiersTrait();
        DEFAULT_INSTANCE = licensingIdentifiersTrait;
        h.registerDefaultInstance(LicensingIdentifiersTrait.class, licensingIdentifiersTrait);
    }

    private LicensingIdentifiersTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static LicensingIdentifiersTrait r(byte[] bArr) {
        return (LicensingIdentifiersTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț", new Object[]{"itemUri_", "albumUri_", "artistUri_"});
        }
        if (iOrdinal == 3) {
            return new LicensingIdentifiersTrait();
        }
        if (iOrdinal == 4) {
            return new tm90((byte) 28);
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
        synchronized (LicensingIdentifiersTrait.class) {
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

    public final String o() {
        return this.albumUri_;
    }

    public final h290 p() {
        return this.artistUri_;
    }

    public final String q() {
        return this.itemUri_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
