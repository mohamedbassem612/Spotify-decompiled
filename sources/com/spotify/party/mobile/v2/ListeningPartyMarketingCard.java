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
public final class ListeningPartyMarketingCard extends h implements v2j0 {
    private static final ListeningPartyMarketingCard DEFAULT_INSTANCE;
    public static final int OBSERVE_PARTY_FIELD_NUMBER = 4;
    public static final int ORGANIZER_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PARTY_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ObserveParty observeParty_;
    private ListeningPartyOrganizer organizer_;
    private ListeningParty party_;
    private ListeningPartyStatus status_;

    static {
        ListeningPartyMarketingCard listeningPartyMarketingCard = new ListeningPartyMarketingCard();
        DEFAULT_INSTANCE = listeningPartyMarketingCard;
        h.registerDefaultInstance(ListeningPartyMarketingCard.class, listeningPartyMarketingCard);
    }

    private ListeningPartyMarketingCard() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ListeningPartyMarketingCard r(byte[] bArr) {
        return (ListeningPartyMarketingCard) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "party_", "status_", "organizer_", "observeParty_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyMarketingCard();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (ListeningPartyMarketingCard.class) {
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

    public final ObserveParty n() {
        ObserveParty observeParty = this.observeParty_;
        return observeParty == null ? ObserveParty.n() : observeParty;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ListeningPartyOrganizer o() {
        ListeningPartyOrganizer listeningPartyOrganizer = this.organizer_;
        return listeningPartyOrganizer == null ? ListeningPartyOrganizer.n() : listeningPartyOrganizer;
    }

    public final ListeningParty p() {
        ListeningParty listeningParty = this.party_;
        return listeningParty == null ? ListeningParty.n() : listeningParty;
    }

    public final ListeningPartyStatus q() {
        ListeningPartyStatus listeningPartyStatus = this.status_;
        return listeningPartyStatus == null ? ListeningPartyStatus.n() : listeningPartyStatus;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
