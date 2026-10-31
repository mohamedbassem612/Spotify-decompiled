package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ContributionClass implements v190 {
    CONTRIBUTION_CLASS_UNSPECIFIED(0),
    CONTRIBUTION_CLASS_TRACKED_SHARE(1),
    CONTRIBUTION_CLASS_FREE_TEXT(2),
    CONTRIBUTION_CLASS_OP_TRACKED_SHARE(3),
    CONTRIBUTION_CLASS_CHAT_INVITE(4),
    CONTRIBUTION_CLASS_PRE_OP_SHARE(5),
    CONTRIBUTION_CLASS_CHAT_EVENT(6),
    CONTRIBUTION_CLASS_RICH_MEDIA(7),
    CONTRIBUTION_CLASS_TASTE_MATCH_CARD(10),
    UNRECOGNIZED(-1);

    public static final int CONTRIBUTION_CLASS_CHAT_EVENT_VALUE = 6;
    public static final int CONTRIBUTION_CLASS_CHAT_INVITE_VALUE = 4;
    public static final int CONTRIBUTION_CLASS_FREE_TEXT_VALUE = 2;
    public static final int CONTRIBUTION_CLASS_OP_TRACKED_SHARE_VALUE = 3;
    public static final int CONTRIBUTION_CLASS_PRE_OP_SHARE_VALUE = 5;
    public static final int CONTRIBUTION_CLASS_RICH_MEDIA_VALUE = 7;
    public static final int CONTRIBUTION_CLASS_TASTE_MATCH_CARD_VALUE = 10;
    public static final int CONTRIBUTION_CLASS_TRACKED_SHARE_VALUE = 1;
    public static final int CONTRIBUTION_CLASS_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.ContributionClass.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public ContributionClass m127findValueByNumber(int i) {
            return ContributionClass.forNumber(i);
        }
    };
    private final int value;

    public static final class ContributionClassVerifier implements z190 {
        static final z190 INSTANCE = new ContributionClassVerifier();

        private ContributionClassVerifier() {
        }

        public boolean isInRange(int i) {
            return ContributionClass.forNumber(i) != null;
        }
    }

    ContributionClass(int i) {
        this.value = i;
    }

    public static ContributionClass forNumber(int i) {
        if (i == 10) {
            return CONTRIBUTION_CLASS_TASTE_MATCH_CARD;
        }
        switch (i) {
            case 0:
                return CONTRIBUTION_CLASS_UNSPECIFIED;
            case 1:
                return CONTRIBUTION_CLASS_TRACKED_SHARE;
            case 2:
                return CONTRIBUTION_CLASS_FREE_TEXT;
            case 3:
                return CONTRIBUTION_CLASS_OP_TRACKED_SHARE;
            case 4:
                return CONTRIBUTION_CLASS_CHAT_INVITE;
            case 5:
                return CONTRIBUTION_CLASS_PRE_OP_SHARE;
            case 6:
                return CONTRIBUTION_CLASS_CHAT_EVENT;
            case 7:
                return CONTRIBUTION_CLASS_RICH_MEDIA;
            default:
                return null;
        }
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return ContributionClassVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static ContributionClass valueOf(int i) {
        return forNumber(i);
    }
}
