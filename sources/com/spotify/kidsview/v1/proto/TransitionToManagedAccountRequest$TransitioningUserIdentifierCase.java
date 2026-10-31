package com.spotify.kidsview.v1.proto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum TransitionToManagedAccountRequest$TransitioningUserIdentifierCase {
    PARENTAL_CONSENT_SESSION_ID(1),
    MEMBER_ID(2),
    TRANSITIONINGUSERIDENTIFIER_NOT_SET(0);

    private final int value;

    TransitionToManagedAccountRequest$TransitioningUserIdentifierCase(int i) {
        this.value = i;
    }

    public static TransitionToManagedAccountRequest$TransitioningUserIdentifierCase forNumber(int i) {
        if (i == 0) {
            return TRANSITIONINGUSERIDENTIFIER_NOT_SET;
        }
        if (i == 1) {
            return PARENTAL_CONSENT_SESSION_ID;
        }
        if (i != 2) {
            return null;
        }
        return MEMBER_ID;
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static TransitionToManagedAccountRequest$TransitioningUserIdentifierCase valueOf(int i) {
        return forNumber(i);
    }
}
