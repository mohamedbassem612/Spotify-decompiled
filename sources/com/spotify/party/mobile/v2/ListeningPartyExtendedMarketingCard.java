package com.spotify.party.mobile.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ListeningPartyExtendedMarketingCard extends h implements v2j0 {
    private static final ListeningPartyExtendedMarketingCard DEFAULT_INSTANCE;
    public static final int GO_TO_INTERACTIVE_PARTY_FIELD_NUMBER = 6;
    public static final int OBSERVE_PARTY_FIELD_NUMBER = 5;
    public static final int OCCUPANCY_FIELD_NUMBER = 4;
    public static final int ORGANIZER_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PARTY_FIELD_NUMBER = 1;
    public static final int REGISTER_FOR_PARTY_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private GoToInteractiveParty goToInteractiveParty_;
    private ObserveParty observeParty_;
    private ListeningPartyOccupancy occupancy_;
    private ListeningPartyOrganizer organizer_;
    private ListeningParty party_;
    private RegisterForParty registerForParty_;
    private ListeningPartyStatus status_;

    static {
        ListeningPartyExtendedMarketingCard listeningPartyExtendedMarketingCard = new ListeningPartyExtendedMarketingCard();
        DEFAULT_INSTANCE = listeningPartyExtendedMarketingCard;
        h.registerDefaultInstance(ListeningPartyExtendedMarketingCard.class, listeningPartyExtendedMarketingCard);
    }

    private ListeningPartyExtendedMarketingCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "party_", "status_", "organizer_", "occupancy_", "observeParty_", "goToInteractiveParty_", "registerForParty_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyExtendedMarketingCard();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (ListeningPartyExtendedMarketingCard.class) {
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

    public final ListeningPartyOrganizer n() {
        ListeningPartyOrganizer listeningPartyOrganizer = this.organizer_;
        return listeningPartyOrganizer == null ? ListeningPartyOrganizer.n() : listeningPartyOrganizer;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ListeningParty o() {
        ListeningParty listeningParty = this.party_;
        return listeningParty == null ? ListeningParty.n() : listeningParty;
    }

    public final RegisterForParty p() {
        RegisterForParty registerForParty = this.registerForParty_;
        return registerForParty == null ? RegisterForParty.n() : registerForParty;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
