package com.spotify.share.restrictions.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShareRestrictionsProto$ShareRestrictions extends h implements v2j0 {
    private static final ShareRestrictionsProto$ShareRestrictions DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_FORMAT_RESTRICTION_INFO_FIELD_NUMBER = 1;
    private h290 shareFormatRestrictionInfo_ = h.emptyProtobufList();

    static {
        ShareRestrictionsProto$ShareRestrictions shareRestrictionsProto$ShareRestrictions = new ShareRestrictionsProto$ShareRestrictions();
        DEFAULT_INSTANCE = shareRestrictionsProto$ShareRestrictions;
        h.registerDefaultInstance(ShareRestrictionsProto$ShareRestrictions.class, shareRestrictionsProto$ShareRestrictions);
    }

    private ShareRestrictionsProto$ShareRestrictions() {
    }

    public static ShareRestrictionsProto$ShareRestrictions o(byte[] bArr) {
        return (ShareRestrictionsProto$ShareRestrictions) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"shareFormatRestrictionInfo_", ShareRestrictionsProto$ShareFormatRestriction.class});
        }
        if (iOrdinal == 3) {
            return new ShareRestrictionsProto$ShareRestrictions();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (ShareRestrictionsProto$ShareRestrictions.class) {
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

    public final h290 n() {
        return this.shareFormatRestrictionInfo_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
