package com.spotify.highlightsstats.data.proto.sharing.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.i9;
import p.jf40;
import p.jn71;
import p.kn71;
import p.nhc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShareStatsRequest extends h implements v2j0 {
    public static final int DATE_FIELD_NUMBER = 1;
    private static final ShareStatsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATS_TYPE_FIELD_NUMBER = 3;
    public static final int TIME_ZONE_FIELD_NUMBER = 2;
    private static final c290 statsType_converter_ = new nhc((byte) 24);
    private int bitField0_;
    private Timestamp date_;
    private int statsTypeMemoizedSerializedSize;
    private String timeZone_ = "";
    private b290 statsType_ = h.emptyIntList();

    static {
        ShareStatsRequest shareStatsRequest = new ShareStatsRequest();
        DEFAULT_INSTANCE = shareStatsRequest;
        h.registerDefaultInstance(ShareStatsRequest.class, shareStatsRequest);
    }

    private ShareStatsRequest() {
    }

    public static jn71 o() {
        return (jn71) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003,", new Object[]{"bitField0_", "date_", "timeZone_", "statsType_"});
        }
        if (iOrdinal == 3) {
            return new ShareStatsRequest();
        }
        if (iOrdinal == 4) {
            return new jn71(DEFAULT_INSTANCE);
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
        synchronized (ShareStatsRequest.class) {
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

    public final void n(Iterable iterable) {
        i9 i9Var = this.statsType_;
        if (!i9Var.a) {
            this.statsType_ = h.mutableCopy(i9Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kn71 kn71Var = (kn71) it.next();
            this.statsType_.c(kn71Var.getNumber());
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.timeZone_ = str;
    }

    public final void setDate(Timestamp timestamp) {
        this.date_ = timestamp;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
