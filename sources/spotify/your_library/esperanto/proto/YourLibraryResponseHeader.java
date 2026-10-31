package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryResponseHeader extends h implements v2j0 {
    public static final int AVAILABLE_FILTERS_2_FIELD_NUMBER = 22;
    public static final int AVAILABLE_FILTERS_FIELD_NUMBER = 16;
    private static final YourLibraryResponseHeader DEFAULT_INSTANCE;
    public static final int FOLDER_NAME_FIELD_NUMBER = 15;
    public static final int IS_LOADING_FIELD_NUMBER = 12;
    public static final int MAXIMUM_PINNED_ITEMS_FIELD_NUMBER = 19;
    public static final int PARENT_FOLDER_URI_FIELD_NUMBER = 20;
    private static volatile qzr0 PARSER = null;
    public static final int PIN_COUNT_FIELD_NUMBER = 18;
    public static final int REMAINING_ENTITIES_FIELD_NUMBER = 9;
    public static final int TAG_INFO_FIELD_NUMBER = 21;
    public static final int TOTAL_COUNT_FIELD_NUMBER = 17;
    private YourLibraryConfig$YourLibraryFilters2 availableFilters2_;
    private YourLibraryConfig$YourLibraryFilters availableFilters_;
    private int bitField0_;
    private boolean isLoading_;
    private int maximumPinnedItems_;
    private int pinCount_;
    private int remainingEntities_;
    private YourLibraryTagInfo tagInfo_;
    private int totalCount_;
    private String folderName_ = "";
    private String parentFolderUri_ = "";

    static {
        YourLibraryResponseHeader yourLibraryResponseHeader = new YourLibraryResponseHeader();
        DEFAULT_INSTANCE = yourLibraryResponseHeader;
        h.registerDefaultInstance(YourLibraryResponseHeader.class, yourLibraryResponseHeader);
    }

    private YourLibraryResponseHeader() {
    }

    public static YourLibraryResponseHeader p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\t\u0016\n\u0000\u0000\u0000\t\u0004\f\u0007\u000fȈ\u0010ဉ\u0000\u0011\u0004\u0012\u0004\u0013\u0004\u0014Ȉ\u0015ဉ\u0002\u0016ဉ\u0001", new Object[]{"bitField0_", "remainingEntities_", "isLoading_", "folderName_", "availableFilters_", "totalCount_", "pinCount_", "maximumPinnedItems_", "parentFolderUri_", "tagInfo_", "availableFilters2_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryResponseHeader();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (YourLibraryResponseHeader.class) {
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

    public final YourLibraryConfig$YourLibraryFilters n() {
        YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters = this.availableFilters_;
        return yourLibraryConfig$YourLibraryFilters == null ? YourLibraryConfig$YourLibraryFilters.p() : yourLibraryConfig$YourLibraryFilters;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final YourLibraryConfig$YourLibraryFilters2 o() {
        YourLibraryConfig$YourLibraryFilters2 yourLibraryConfig$YourLibraryFilters2 = this.availableFilters2_;
        return yourLibraryConfig$YourLibraryFilters2 == null ? YourLibraryConfig$YourLibraryFilters2.o() : yourLibraryConfig$YourLibraryFilters2;
    }

    public final String q() {
        return this.folderName_;
    }

    public final boolean r() {
        return this.isLoading_;
    }

    public final int s() {
        return this.maximumPinnedItems_;
    }

    public final int t() {
        return this.remainingEntities_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final YourLibraryTagInfo u() {
        YourLibraryTagInfo yourLibraryTagInfo = this.tagInfo_;
        return yourLibraryTagInfo == null ? YourLibraryTagInfo.n() : yourLibraryTagInfo;
    }

    public final int v() {
        return this.totalCount_;
    }
}
