package spotify.your_library.proto;

import com.google.protobuf.h;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import p.bf40;
import p.h290;
import p.jf40;
import p.lsm1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class YourLibraryConfig$YourLibraryFilters2 extends h implements v2j0 {
    public static final int AVAILABLE_FILTER_FIELD_NUMBER = 1;
    private static final YourLibraryConfig$YourLibraryFilters2 DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 availableFilter_ = h.emptyProtobufList();

    public static final class AvailableFilter extends h implements v2j0 {
        public static final int CONCEPT_NAME_FIELD_NUMBER = 3;
        private static final AvailableFilter DEFAULT_INSTANCE;
        public static final int FILTER_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int URI_FIELD_NUMBER = 1;
        private Object kind_;
        private int kindCase_ = 0;
        private String uri_ = "";

        static {
            AvailableFilter availableFilter = new AvailableFilter();
            DEFAULT_INSTANCE = availableFilter;
            h.registerDefaultInstance(AvailableFilter.class, availableFilter);
        }

        private AvailableFilter() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003Ȼ\u0000", new Object[]{"kind_", "kindCase_", "uri_"});
            }
            if (iOrdinal == 3) {
                return new AvailableFilter();
            }
            if (iOrdinal == 4) {
                return new a(DEFAULT_INSTANCE);
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
            synchronized (AvailableFilter.class) {
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

        public final String getUri() {
            return this.uri_;
        }

        public final boolean hasFilter() {
            return this.kindCase_ == 2;
        }

        public final String n() {
            return this.kindCase_ == 3 ? (String) this.kind_ : "";
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final lsm1 o() {
            int i = this.kindCase_;
            lsm1 lsm1Var = lsm1.UNKNOWN;
            if (i == 2) {
                int iIntValue = ((Integer) this.kind_).intValue();
                if (iIntValue != 100) {
                    switch (iIntValue) {
                        case 0:
                            break;
                        case 1:
                            lsm1Var = lsm1.PLAYLIST;
                            break;
                        case 2:
                            lsm1Var = lsm1.SHOW;
                            break;
                        case 3:
                            lsm1Var = lsm1.BOOK;
                            break;
                        case 4:
                            lsm1Var = lsm1.ALBUM;
                            break;
                        case 5:
                            lsm1Var = lsm1.ARTIST;
                            break;
                        case 6:
                            lsm1Var = lsm1.AUTHOR;
                            break;
                        case 7:
                            lsm1Var = lsm1.EVENT;
                            break;
                        default:
                            switch (iIntValue) {
                                case 20:
                                    lsm1Var = lsm1.WRITABLE;
                                    break;
                                case 21:
                                    lsm1Var = lsm1.BY_YOU;
                                    break;
                                case 22:
                                    lsm1Var = lsm1.BY_SPOTIFY;
                                    break;
                                case 23:
                                    lsm1Var = lsm1.BY_OTHERS;
                                    break;
                                case 24:
                                    lsm1Var = lsm1.IS_MIXED;
                                    break;
                                case 25:
                                    lsm1Var = lsm1.FOLDER;
                                    break;
                                case 26:
                                    lsm1Var = lsm1.PUBLISHED;
                                    break;
                                case 27:
                                    lsm1Var = lsm1.PUBLISHABLE;
                                    break;
                                case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                                    lsm1Var = lsm1.EXCLUDE_WORKOUT;
                                    break;
                                default:
                                    switch (iIntValue) {
                                        case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                                            lsm1Var = lsm1.IN_PROGRESS;
                                            break;
                                        case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                                            lsm1Var = lsm1.UNPLAYED;
                                            break;
                                        case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                                            lsm1Var = lsm1.FINISHED;
                                            break;
                                        default:
                                            switch (iIntValue) {
                                                case 60:
                                                    lsm1Var = lsm1.UPCOMING;
                                                    break;
                                                case 61:
                                                    lsm1Var = lsm1.VENUE;
                                                    break;
                                                case 62:
                                                    lsm1Var = lsm1.PAST;
                                                    break;
                                                default:
                                                    lsm1Var = null;
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    lsm1Var = lsm1.DOWNLOADED;
                }
                if (lsm1Var == null) {
                    return lsm1.UNRECOGNIZED;
                }
            }
            return lsm1Var;
        }

        public final boolean p() {
            return this.kindCase_ == 3;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        YourLibraryConfig$YourLibraryFilters2 yourLibraryConfig$YourLibraryFilters2 = new YourLibraryConfig$YourLibraryFilters2();
        DEFAULT_INSTANCE = yourLibraryConfig$YourLibraryFilters2;
        h.registerDefaultInstance(YourLibraryConfig$YourLibraryFilters2.class, yourLibraryConfig$YourLibraryFilters2);
    }

    private YourLibraryConfig$YourLibraryFilters2() {
    }

    public static YourLibraryConfig$YourLibraryFilters2 o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"availableFilter_", AvailableFilter.class});
        }
        if (iOrdinal == 3) {
            return new YourLibraryConfig$YourLibraryFilters2();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (YourLibraryConfig$YourLibraryFilters2.class) {
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
        return this.availableFilter_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
