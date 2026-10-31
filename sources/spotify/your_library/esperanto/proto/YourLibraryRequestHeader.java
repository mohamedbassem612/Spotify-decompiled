package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.e290;
import p.hvm1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryRequestHeader extends h implements v2j0 {
    public static final int ALL_PLAYLISTS_FIELD_NUMBER = 17;
    public static final int CURATED_ITEMS_FIELD_NUMBER = 29;
    private static final YourLibraryRequestHeader DEFAULT_INSTANCE;
    public static final int FILL_FOLDERS_FIELD_NUMBER = 34;
    public static final int FILTERS_FIELD_NUMBER = 14;
    public static final int FOLDER_ID_FIELD_NUMBER = 16;
    public static final int IGNORE_PINNING_FIELD_NUMBER = 26;
    public static final int INCLUDE_AUTHORS_FIELD_NUMBER = 33;
    public static final int INCLUDE_CONCERT_CAMPAIGNS_FIELD_NUMBER = 36;
    public static final int INCLUDE_EVENTS_FIELD_NUMBER = 30;
    public static final int INCLUDE_PRERELEASES_FIELD_NUMBER = 31;
    public static final int INCLUDE_VENUES_FIELD_NUMBER = 35;
    public static final int LENGTH_FIELD_NUMBER = 12;
    public static final int LOWER_BOUND_FIELD_NUMBER = 10;
    public static final int NUM_LINK_TYPES_IN_PLAYLISTS_FIELD_NUMBER = 25;
    private static volatile qzr0 PARSER = null;
    public static final int REMAINING_ENTITIES_FIELD_NUMBER = 9;
    public static final int SEPARATE_PINNED_ITEMS_FIELD_NUMBER = 22;
    public static final int SKIP_FIELD_NUMBER = 11;
    public static final int SORT_ORDER_FIELD_NUMBER = 15;
    public static final int TAG_FILTER_FIELD_NUMBER = 24;
    public static final int TEXT_FILTER_FIELD_NUMBER = 13;
    public static final int TOTAL_COUNT_FIELD_NUMBER = 18;
    public static final int UPPER_BOUND_FIELD_NUMBER = 37;
    private boolean allPlaylists_;
    private int bitField0_;
    private CuratedItems curatedItems_;
    private YourLibraryConfig$YourLibraryFilters filters_;
    private boolean ignorePinning_;
    private boolean includeAuthors_;
    private boolean includeConcertCampaigns_;
    private boolean includeEvents_;
    private boolean includePrereleases_;
    private boolean includeVenues_;
    private int length_;
    private Object maybeFolderId_;
    private Object maybeTagFilter_;
    private boolean numLinkTypesInPlaylists_;
    private boolean remainingEntities_;
    private boolean separatePinnedItems_;
    private int skip_;
    private YourLibraryConfig$YourLibrarySortOrder sortOrder_;
    private boolean totalCount_;
    private int maybeFolderIdCase_ = 0;
    private int maybeTagFilterCase_ = 0;
    private int fillFoldersMemoizedSerializedSize = -1;
    private String lowerBound_ = "";
    private String upperBound_ = "";
    private String textFilter_ = "";
    private e290 fillFolders_ = h.emptyLongList();

    static {
        YourLibraryRequestHeader yourLibraryRequestHeader = new YourLibraryRequestHeader();
        DEFAULT_INSTANCE = yourLibraryRequestHeader;
        h.registerDefaultInstance(YourLibraryRequestHeader.class, yourLibraryRequestHeader);
    }

    private YourLibraryRequestHeader() {
    }

    public static YourLibraryRequestHeader o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static hvm1 q() {
        return (hvm1) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(boolean z) {
        this.includeVenues_ = z;
    }

    public final void B(int i) {
        this.length_ = i;
    }

    public final void C() {
        this.numLinkTypesInPlaylists_ = true;
    }

    public final void D() {
        this.remainingEntities_ = true;
    }

    public final void E(boolean z) {
        this.separatePinnedItems_ = z;
    }

    public final void F(int i) {
        this.skip_ = i;
    }

    public final void G(YourLibraryConfig$YourLibrarySortOrder yourLibraryConfig$YourLibrarySortOrder) {
        yourLibraryConfig$YourLibrarySortOrder.getClass();
        this.sortOrder_ = yourLibraryConfig$YourLibrarySortOrder;
        this.bitField0_ |= 2;
    }

    public final void H(YourLibraryTagFilter yourLibraryTagFilter) {
        yourLibraryTagFilter.getClass();
        this.maybeTagFilter_ = yourLibraryTagFilter;
        this.maybeTagFilterCase_ = 24;
    }

    public final void I(String str) {
        str.getClass();
        this.textFilter_ = str;
    }

    public final void J() {
        this.totalCount_ = true;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0002\u0001\t%\u0016\u0000\u0001\u0000\t\u0007\nȈ\u000b\u0004\f\u0004\rȈ\u000eဉ\u0000\u000fဉ\u0001\u00105\u0000\u0011\u0007\u0012\u0007\u0016\u0007\u0018<\u0001\u0019\u0007\u001a\u0007\u001dဉ\u0002\u001e\u0007\u001f\u0007!\u0007\"%#\u0007$\u0007%Ȉ", new Object[]{"maybeFolderId_", "maybeFolderIdCase_", "maybeTagFilter_", "maybeTagFilterCase_", "bitField0_", "remainingEntities_", "lowerBound_", "skip_", "length_", "textFilter_", "filters_", "sortOrder_", "allPlaylists_", "totalCount_", "separatePinnedItems_", YourLibraryTagFilter.class, "numLinkTypesInPlaylists_", "ignorePinning_", "curatedItems_", "includeEvents_", "includePrereleases_", "includeAuthors_", "fillFolders_", "includeVenues_", "includeConcertCampaigns_", "upperBound_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryRequestHeader();
        }
        if (iOrdinal == 4) {
            return new hvm1(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryRequestHeader.class) {
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

    public final CuratedItems n() {
        CuratedItems curatedItems = this.curatedItems_;
        return curatedItems == null ? CuratedItems.p() : curatedItems;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.textFilter_;
    }

    public final void r(boolean z) {
        this.allPlaylists_ = z;
    }

    public final void s(CuratedItems curatedItems) {
        curatedItems.getClass();
        this.curatedItems_ = curatedItems;
        this.bitField0_ |= 4;
    }

    public final void t(YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters) {
        yourLibraryConfig$YourLibraryFilters.getClass();
        this.filters_ = yourLibraryConfig$YourLibraryFilters;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(long j) {
        this.maybeFolderIdCase_ = 16;
        this.maybeFolderId_ = Long.valueOf(j);
    }

    public final void v() {
        this.ignorePinning_ = true;
    }

    public final void w() {
        this.includeAuthors_ = true;
    }

    public final void x(boolean z) {
        this.includeConcertCampaigns_ = z;
    }

    public final void y(boolean z) {
        this.includeEvents_ = z;
    }

    public final void z(boolean z) {
        this.includePrereleases_ = z;
    }
}
