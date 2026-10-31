package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.etm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo extends h implements v2j0 {
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private long endTime_;
    private long startTime_;
    private int status_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002", new Object[]{"status_", "startTime_", "endTime_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryConcertCampaignExtraInfo.class) {
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

    public final long o() {
        return this.endTime_;
    }

    public final long p() {
        return this.startTime_;
    }

    public final etm1 q() {
        etm1 etm1Var;
        switch (this.status_) {
            case 0:
                etm1Var = etm1.UNSPECIFIED;
                break;
            case 1:
                etm1Var = etm1.RESERVED;
                break;
            case 2:
                etm1Var = etm1.FCFS;
                break;
            case 3:
                etm1Var = etm1.WAITLISTED;
                break;
            case 4:
                etm1Var = etm1.PURCHASED;
                break;
            case 5:
                etm1Var = etm1.INELIGIBLE;
                break;
            case 6:
                etm1Var = etm1.SOLD_OUT;
                break;
            case 7:
                etm1Var = etm1.CANCELLED;
                break;
            case 8:
                etm1Var = etm1.SALE_ENDED;
                break;
            default:
                etm1Var = null;
                break;
        }
        return etm1Var == null ? etm1.UNRECOGNIZED : etm1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
