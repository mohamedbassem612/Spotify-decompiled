package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.clc0;
import p.d290;
import p.eoc;
import p.h290;
import p.i9;
import p.jf40;
import p.lqc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uqu0;
import p.v2j0;
import p.vqu0;
import p.yvu0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaylistQuery extends h implements v2j0 {
    public static final int ATTRIBUTE_FILTER_FIELD_NUMBER = 14;
    public static final int BOOL_PREDICATES_FIELD_NUMBER = 1;
    private static final PlaylistQuery DEFAULT_INSTANCE;
    public static final int DESCRIPTOR_FILTER_FIELD_NUMBER = 12;
    public static final int DONT_LOAD_ITEM_METADATA_FIELD_NUMBER = 17;
    public static final int GROUP_FIELD_NUMBER = 6;
    public static final int INCLUDE_ALL_PLACEHOLDERS_FIELD_NUMBER = 15;
    public static final int INCLUDE_PREMIUM_CONTENT_FIELD_NUMBER = 9;
    public static final int ITEM_ID_FILTER_FIELD_NUMBER = 13;
    public static final int LANGUAGE_FILTER_FIELD_NUMBER = 18;
    public static final int LENSES_FIELD_NUMBER = 16;
    public static final int LOAD_RECOMMENDATIONS_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDED_SORT_INTERNAL_ID_FIELD_NUMBER = 19;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SHOW_UNAVAILABLE_FIELD_NUMBER = 8;
    public static final int SORT_BY_FIELD_NUMBER = 3;
    public static final int SOURCE_RESTRICTION_FIELD_NUMBER = 7;
    public static final int SUPPORTED_PLACEHOLDER_TYPES_FIELD_NUMBER = 11;
    public static final int TAG_ID_FILTER_FIELD_NUMBER = 20;
    public static final int TEXT_FILTER_FIELD_NUMBER = 2;
    public static final int UPDATE_THROTTLING_MS_FIELD_NUMBER = 5;
    private static final c290 boolPredicates_converter_ = new eoc((byte) 19);
    private static final c290 supportedPlaceholderTypes_converter_ = new lqc((byte) 19);
    private int bitField0_;
    private int boolPredicatesMemoizedSerializedSize;
    private boolean dontLoadItemMetadata_;
    private boolean group_;
    private boolean includeAllPlaceholders_;
    private boolean includePremiumContent_;
    private boolean loadRecommendations_;
    private PlaylistRange range_;
    private boolean showUnavailable_;
    private int sortBy_;
    private int sourceRestriction_;
    private int supportedPlaceholderTypesMemoizedSerializedSize;
    private int updateThrottlingMs_;
    private int tagIdFilterMemoizedSerializedSize = -1;
    private b290 boolPredicates_ = h.emptyIntList();
    private String textFilter_ = "";
    private b290 supportedPlaceholderTypes_ = h.emptyIntList();
    private h290 descriptorFilter_ = h.emptyProtobufList();
    private String itemIdFilter_ = "";
    private h290 attributeFilter_ = h.emptyProtobufList();
    private h290 lenses_ = h.emptyProtobufList();
    private h290 languageFilter_ = h.emptyProtobufList();
    private String providedSortInternalId_ = "";
    private b290 tagIdFilter_ = h.emptyIntList();

    public static final class AttributeFilter extends h implements v2j0 {
        public static final int CONTAINS_ONE_OF_FIELD_NUMBER = 1;
        private static final AttributeFilter DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private h290 containsOneOf_ = h.emptyProtobufList();

        static {
            AttributeFilter attributeFilter = new AttributeFilter();
            DEFAULT_INSTANCE = attributeFilter;
            h.registerDefaultInstance(AttributeFilter.class, attributeFilter);
        }

        private AttributeFilter() {
        }

        public static c o() {
            return (c) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"containsOneOf_"});
            }
            if (iOrdinal == 3) {
                return new AttributeFilter();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
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
            synchronized (AttributeFilter.class) {
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
            h290 h290VarMutableCopy = this.containsOneOf_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
                this.containsOneOf_ = h290VarMutableCopy;
            }
            s8.addAll(iterable, h290VarMutableCopy);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PlaylistQuery playlistQuery = new PlaylistQuery();
        DEFAULT_INSTANCE = playlistQuery;
        h.registerDefaultInstance(PlaylistQuery.class, playlistQuery);
    }

    private PlaylistQuery() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlaylistQuery u() {
        return DEFAULT_INSTANCE;
    }

    public static d y() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(boolean z) {
        this.includePremiumContent_ = z;
    }

    public final void B(String str) {
        this.itemIdFilter_ = str;
    }

    public final void C(boolean z) {
        this.loadRecommendations_ = z;
    }

    public final void D(String str) {
        str.getClass();
        this.providedSortInternalId_ = str;
    }

    public final void E(PlaylistRange playlistRange) {
        playlistRange.getClass();
        this.range_ = playlistRange;
        this.bitField0_ |= 1;
    }

    public final void F(boolean z) {
        this.showUnavailable_ = z;
    }

    public final void G(vqu0 vqu0Var) {
        this.sortBy_ = vqu0Var.getNumber();
    }

    public final void H(yvu0 yvu0Var) {
        this.sourceRestriction_ = yvu0Var.getNumber();
    }

    public final void I(String str) {
        this.textFilter_ = str;
    }

    public final void J(int i) {
        this.updateThrottlingMs_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0007\u0000\u0001,\u0002Ȉ\u0003\f\u0004ဉ\u0000\u0005\u0004\u0006\u0007\u0007\f\b\u0007\t\u0007\n\u0007\u000b,\fȚ\rȈ\u000e\u001b\u000f\u0007\u0010Ț\u0011\u0007\u0012Ț\u0013Ȉ\u0014'", new Object[]{"bitField0_", "boolPredicates_", "textFilter_", "sortBy_", "range_", "updateThrottlingMs_", "group_", "sourceRestriction_", "showUnavailable_", "includePremiumContent_", "loadRecommendations_", "supportedPlaceholderTypes_", "descriptorFilter_", "itemIdFilter_", "attributeFilter_", AttributeFilter.class, "includeAllPlaceholders_", "lenses_", "dontLoadItemMetadata_", "languageFilter_", "providedSortInternalId_", "tagIdFilter_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistQuery();
        }
        if (iOrdinal == 4) {
            return new d(DEFAULT_INSTANCE);
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
        synchronized (PlaylistQuery.class) {
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

    public final void n(ArrayList arrayList) {
        i9 i9Var = this.boolPredicates_;
        if (!i9Var.a) {
            this.boolPredicates_ = h.mutableCopy(i9Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uqu0 uqu0Var = (uqu0) it.next();
            this.boolPredicates_.c(uqu0Var.getNumber());
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.descriptorFilter_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.descriptorFilter_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final void p(Iterable iterable) {
        h290 h290VarMutableCopy = this.lenses_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.lenses_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void q(Iterable iterable) {
        i9 i9Var = this.supportedPlaceholderTypes_;
        if (!i9Var.a) {
            this.supportedPlaceholderTypes_ = h.mutableCopy(i9Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            clc0 clc0Var = (clc0) it.next();
            this.supportedPlaceholderTypes_.c(clc0Var.getNumber());
        }
    }

    public final void r(ArrayList arrayList) {
        b290 b290VarMutableCopy = this.tagIdFilter_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.tagIdFilter_ = b290VarMutableCopy;
        }
        s8.addAll(arrayList, b290VarMutableCopy);
    }

    public final void s(AttributeFilter attributeFilter) {
        attributeFilter.getClass();
        h290 h290VarMutableCopy = this.attributeFilter_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.attributeFilter_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(attributeFilter);
    }

    public final d290 t() {
        return new d290(this.boolPredicates_, boolPredicates_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 v() {
        return this.descriptorFilter_;
    }

    public final vqu0 w() {
        vqu0 vqu0Var;
        switch (this.sortBy_) {
            case 0:
                vqu0Var = vqu0.NO_SORT;
                break;
            case 1:
                vqu0Var = vqu0.ALBUM_ARTIST_NAME_ASC;
                break;
            case 2:
                vqu0Var = vqu0.ALBUM_ARTIST_NAME_DESC;
                break;
            case 3:
                vqu0Var = vqu0.TRACK_NUMBER_ASC;
                break;
            case 4:
                vqu0Var = vqu0.TRACK_NUMBER_DESC;
                break;
            case 5:
                vqu0Var = vqu0.DISC_NUMBER_ASC;
                break;
            case 6:
                vqu0Var = vqu0.DISC_NUMBER_DESC;
                break;
            case 7:
                vqu0Var = vqu0.ALBUM_NAME_ASC;
                break;
            case 8:
                vqu0Var = vqu0.ALBUM_NAME_DESC;
                break;
            case 9:
                vqu0Var = vqu0.ARTIST_NAME_ASC;
                break;
            case 10:
                vqu0Var = vqu0.ARTIST_NAME_DESC;
                break;
            case 11:
                vqu0Var = vqu0.NAME_ASC;
                break;
            case 12:
                vqu0Var = vqu0.NAME_DESC;
                break;
            case 13:
                vqu0Var = vqu0.ADD_TIME_ASC;
                break;
            case 14:
                vqu0Var = vqu0.ADD_TIME_DESC;
                break;
            case 15:
                vqu0Var = vqu0.ADDED_BY_ASC;
                break;
            case 16:
                vqu0Var = vqu0.ADDED_BY_DESC;
                break;
            case 17:
                vqu0Var = vqu0.DURATION_ASC;
                break;
            case 18:
                vqu0Var = vqu0.DURATION_DESC;
                break;
            case 19:
                vqu0Var = vqu0.SHOW_NAME_ASC;
                break;
            case 20:
                vqu0Var = vqu0.SHOW_NAME_DESC;
                break;
            case 21:
                vqu0Var = vqu0.PUBLISH_DATE_ASC;
                break;
            case 22:
                vqu0Var = vqu0.PUBLISH_DATE_DESC;
                break;
            case 23:
                vqu0Var = vqu0.PROVIDED_ASC;
                break;
            case 24:
                vqu0Var = vqu0.PROVIDED_DESC;
                break;
            default:
                vqu0Var = null;
                break;
        }
        return vqu0Var == null ? vqu0.UNRECOGNIZED : vqu0Var;
    }

    public final String x() {
        return this.textFilter_;
    }

    public final void z() {
        this.includeAllPlaceholders_ = true;
    }
}
