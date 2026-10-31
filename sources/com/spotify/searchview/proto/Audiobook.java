package com.spotify.searchview.proto;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u68;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Audiobook extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESS_FIELD_NUMBER = 6;
    public static final int AUTHOR_NAMES_FIELD_NUMBER = 1;
    private static final Audiobook DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int EXPLICIT_FIELD_NUMBER = 3;
    public static final int NARRATOR_NAMES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 9;
    public static final int RELEASE_TIME_FIELD_NUMBER = 8;
    public static final int STATE_FIELD_NUMBER = 7;
    public static final int TAGS_FIELD_NUMBER = 10;
    private Access access_;
    private int bitField0_;
    private Duration duration_;
    private boolean explicit_;
    private DoubleValue rating_;
    private Timestamp releaseTime_;
    private int state_;
    private h290 authorNames_ = com.google.protobuf.h.emptyProtobufList();
    private h290 narratorNames_ = com.google.protobuf.h.emptyProtobufList();
    private String description_ = "";
    private h290 tags_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Access extends com.google.protobuf.h implements v2j0 {
        public static final int BOOK_IS_UNLOCKED_BY_USER_FIELD_NUMBER = 2;
        private static final Access DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SIGNIFIER_TEXT_FIELD_NUMBER = 1;
        private boolean bookIsUnlockedByUser_;
        private String signifierText_ = "";

        static {
            Access access = new Access();
            DEFAULT_INSTANCE = access;
            com.google.protobuf.h.registerDefaultInstance(Access.class, access);
        }

        private Access() {
        }

        public static Access o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"signifierText_", "bookIsUnlockedByUser_"});
            }
            if (iOrdinal == 3) {
                return new Access();
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
            synchronized (Access.class) {
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

        public final boolean n() {
            return this.bookIsUnlockedByUser_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.signifierText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Audiobook audiobook = new Audiobook();
        DEFAULT_INSTANCE = audiobook;
        com.google.protobuf.h.registerDefaultInstance(Audiobook.class, audiobook);
    }

    private Audiobook() {
    }

    public static Audiobook p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0003\u0000\u0001Ț\u0002Ț\u0003\u0007\u0004ဉ\u0000\u0005Ȉ\u0006ဉ\u0001\u0007\f\bဉ\u0002\tဉ\u0003\n\u001b", new Object[]{"bitField0_", "authorNames_", "narratorNames_", "explicit_", "duration_", "description_", "access_", "state_", "releaseTime_", "rating_", "tags_", Tag.class});
        }
        if (iOrdinal == 3) {
            return new Audiobook();
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
        synchronized (Audiobook.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.n() : duration;
    }

    public final Access n() {
        Access access = this.access_;
        return access == null ? Access.o() : access;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.authorNames_;
    }

    public final boolean q() {
        return this.explicit_;
    }

    public final DoubleValue r() {
        DoubleValue doubleValue = this.rating_;
        return doubleValue == null ? DoubleValue.n() : doubleValue;
    }

    public final Timestamp s() {
        Timestamp timestamp = this.releaseTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final u68 t() {
        u68 u68Var;
        int i = this.state_;
        if (i == 0) {
            u68Var = u68.UNKNOWN;
        } else if (i != 1) {
            u68Var = i != 2 ? null : u68.LIVE;
        } else {
            u68Var = u68.PRERELEASE;
        }
        return u68Var == null ? u68.UNRECOGNIZED : u68Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
