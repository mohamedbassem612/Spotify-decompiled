package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ctm1;
import p.dnm1;
import p.dtm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo extends h implements v2j0 {
    public static final int ACCESS_FIELD_NUMBER = 2;
    public static final int AUTHOR_NAME_FIELD_NUMBER = 1;
    private static final YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo DEFAULT_INSTANCE;
    public static final int MILLISECONDS_LEFT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERCENT_DONE_FIELD_NUMBER = 4;
    public static final int STATE_FIELD_NUMBER = 5;
    private int access_;
    private String authorName_ = "";
    private long millisecondsLeft_;
    private int percentDone_;
    private int state_;

    static {
        YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo = new YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo();
        DEFAULT_INSTANCE = yourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo;
        h.registerDefaultInstance(YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo.class, yourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo);
    }

    private YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo() {
    }

    public static YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0004\u0004\u0005\f", new Object[]{"authorName_", "access_", "millisecondsLeft_", "percentDone_", "state_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (YourLibraryDecoratedEntityOuterClass$YourLibraryBookExtraInfo.class) {
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

    public final ctm1 n() {
        ctm1 ctm1Var;
        int i = this.access_;
        if (i == 0) {
            ctm1Var = ctm1.OPEN;
        } else if (i != 1) {
            ctm1Var = i != 2 ? null : ctm1.CAPPED;
        } else {
            ctm1Var = ctm1.LOCKED;
        }
        return ctm1Var == null ? ctm1.UNRECOGNIZED : ctm1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.authorName_;
    }

    public final long q() {
        return this.millisecondsLeft_;
    }

    public final int r() {
        return this.percentDone_;
    }

    public final dtm1 s() {
        dtm1 dtm1Var;
        int i = this.state_;
        if (i == 0) {
            dtm1Var = dtm1.NOT_STARTED;
        } else if (i != 1) {
            dtm1Var = i != 2 ? null : dtm1.FINISHED;
        } else {
            dtm1Var = dtm1.IN_PROGRESS;
        }
        return dtm1Var == null ? dtm1.UNRECOGNIZED : dtm1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
