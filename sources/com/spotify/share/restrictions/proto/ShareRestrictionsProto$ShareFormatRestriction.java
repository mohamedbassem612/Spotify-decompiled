package com.spotify.share.restrictions.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.ek61;
import p.h290;
import p.jf40;
import p.lhc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShareRestrictionsProto$ShareFormatRestriction extends h implements v2j0 {
    public static final int BLOCKED_DESTINATIONS_FIELD_NUMBER = 4;
    public static final int BLOCKED_FEATURES_FIELD_NUMBER = 2;
    private static final ShareRestrictionsProto$ShareFormatRestriction DEFAULT_INSTANCE;
    public static final int IS_BLOCKED_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_FORMAT_ID_FIELD_NUMBER = 1;
    private static final c290 blockedFeatures_converter_ = new lhc((byte) 24);
    private int blockedFeaturesMemoizedSerializedSize;
    private boolean isBlocked_;
    private String shareFormatId_ = "";
    private b290 blockedFeatures_ = h.emptyIntList();
    private h290 blockedDestinations_ = h.emptyProtobufList();

    static {
        ShareRestrictionsProto$ShareFormatRestriction shareRestrictionsProto$ShareFormatRestriction = new ShareRestrictionsProto$ShareFormatRestriction();
        DEFAULT_INSTANCE = shareRestrictionsProto$ShareFormatRestriction;
        h.registerDefaultInstance(ShareRestrictionsProto$ShareFormatRestriction.class, shareRestrictionsProto$ShareFormatRestriction);
    }

    private ShareRestrictionsProto$ShareFormatRestriction() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002,\u0003\u0007\u0004\u001b", new Object[]{"shareFormatId_", "blockedFeatures_", "isBlocked_", "blockedDestinations_", ShareRestrictionsProto$ShareDestination.class});
        }
        if (iOrdinal == 3) {
            return new ShareRestrictionsProto$ShareFormatRestriction();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (ShareRestrictionsProto$ShareFormatRestriction.class) {
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
        return this.blockedDestinations_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final d290 o() {
        return new d290(this.blockedFeatures_, blockedFeatures_converter_);
    }

    public final boolean p() {
        return this.isBlocked_;
    }

    public final String q() {
        return this.shareFormatId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
