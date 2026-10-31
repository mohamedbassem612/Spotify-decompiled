package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.highlightsstats.Person;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tm90;
import p.v2j0;
import p.wce;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LeaderboardItem extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int CHANGE_PREVIOUS_PERIOD_FIELD_NUMBER = 6;
    private static final LeaderboardItem DEFAULT_INSTANCE;
    public static final int LISTENING_MINUTES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERSON_FIELD_NUMBER = 1;
    private int bitField0_;
    private int changePreviousPeriod_;
    private Person person_;
    private String listeningMinutes_ = "";
    private String accessibilityDescription_ = "";

    static {
        LeaderboardItem leaderboardItem = new LeaderboardItem();
        DEFAULT_INSTANCE = leaderboardItem;
        h.registerDefaultInstance(LeaderboardItem.class, leaderboardItem);
    }

    private LeaderboardItem() {
    }

    public static LeaderboardItem p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003Ȉ\u0005Ȉ\u0006ဌ\u0001", new Object[]{"bitField0_", "person_", "listeningMinutes_", "accessibilityDescription_", "changePreviousPeriod_"});
        }
        if (iOrdinal == 3) {
            return new LeaderboardItem();
        }
        if (iOrdinal == 4) {
            return new tm90(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (LeaderboardItem.class) {
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

    public final String n() {
        return this.accessibilityDescription_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final wce o() {
        wce wceVarA = wce.a(this.changePreviousPeriod_);
        return wceVarA == null ? wce.UNRECOGNIZED : wceVarA;
    }

    public final String q() {
        return this.listeningMinutes_;
    }

    public final Person r() {
        Person person = this.person_;
        return person == null ? Person.n() : person;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
