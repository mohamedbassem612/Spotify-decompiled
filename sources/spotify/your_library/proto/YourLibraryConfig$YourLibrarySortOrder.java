package spotify.your_library.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qsm1;
import p.qzr0;
import p.r2j0;
import p.rsm1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryConfig$YourLibrarySortOrder extends h implements v2j0 {
    private static final YourLibraryConfig$YourLibrarySortOrder DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REVERSE_FIELD_NUMBER = 2;
    public static final int SORT_ORDER_FIELD_NUMBER = 1;
    private boolean reverse_;
    private int sortOrder_;

    static {
        YourLibraryConfig$YourLibrarySortOrder yourLibraryConfig$YourLibrarySortOrder = new YourLibraryConfig$YourLibrarySortOrder();
        DEFAULT_INSTANCE = yourLibraryConfig$YourLibrarySortOrder;
        h.registerDefaultInstance(YourLibraryConfig$YourLibrarySortOrder.class, yourLibraryConfig$YourLibrarySortOrder);
    }

    private YourLibraryConfig$YourLibrarySortOrder() {
    }

    public static qsm1 n() {
        return (qsm1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"sortOrder_", "reverse_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryConfig$YourLibrarySortOrder();
        }
        if (iOrdinal == 4) {
            return new qsm1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryConfig$YourLibrarySortOrder.class) {
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

    public final void o(rsm1 rsm1Var) {
        this.sortOrder_ = rsm1Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
