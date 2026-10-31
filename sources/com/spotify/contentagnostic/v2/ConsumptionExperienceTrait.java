package com.spotify.contentagnostic.v2;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.h290;
import p.j4l;
import p.jf40;
import p.jma;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yla;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ConsumptionExperienceTrait extends h implements v2j0 {
    public static final int CONTENT_RATINGS_FIELD_NUMBER = 2;
    private static final ConsumptionExperienceTrait DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 1;
    public static final int FORMATS_FIELD_NUMBER = 4;
    public static final int GENRES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private static final c290 contentRatings_converter_ = new yla((byte) 3);
    private static final c290 formats_converter_ = new jma((byte) 3);
    private int bitField0_;
    private int contentRatingsMemoizedSerializedSize;
    private Duration duration_;
    private int formatsMemoizedSerializedSize;
    private b290 contentRatings_ = h.emptyIntList();
    private h290 genres_ = h.emptyProtobufList();
    private b290 formats_ = h.emptyIntList();

    static {
        ConsumptionExperienceTrait consumptionExperienceTrait = new ConsumptionExperienceTrait();
        DEFAULT_INSTANCE = consumptionExperienceTrait;
        h.registerDefaultInstance(ConsumptionExperienceTrait.class, consumptionExperienceTrait);
    }

    private ConsumptionExperienceTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ConsumptionExperienceTrait r(byte[] bArr) {
        return (ConsumptionExperienceTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဉ\u0000\u0002,\u0003\u001b\u0004,", new Object[]{"bitField0_", "duration_", "contentRatings_", "genres_", Genre.class, "formats_"});
        }
        if (iOrdinal == 3) {
            return new ConsumptionExperienceTrait();
        }
        if (iOrdinal == 4) {
            return new j4l((byte) 9);
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
        synchronized (ConsumptionExperienceTrait.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.n() : duration;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final List o() {
        return new d290(this.contentRatings_, contentRatings_converter_);
    }

    public final d290 p() {
        return new d290(this.formats_, formats_converter_);
    }

    public final h290 q() {
        return this.genres_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
