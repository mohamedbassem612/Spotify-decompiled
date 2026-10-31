package com.spotify.kidsview.v1.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum DeleteActionState implements v190 {
    DELETE_ACTION_STATE_UNSPECIFIED(0),
    DELETE_ACTION_STATE_ENABLED(1),
    DELETE_ACTION_STATE_DISABLED_GENERIC(2),
    DELETE_ACTION_STATE_DISABLED_REMOVE_MEMBER_FIRST(3),
    UNRECOGNIZED(-1);

    public static final int DELETE_ACTION_STATE_DISABLED_GENERIC_VALUE = 2;
    public static final int DELETE_ACTION_STATE_DISABLED_REMOVE_MEMBER_FIRST_VALUE = 3;
    public static final int DELETE_ACTION_STATE_ENABLED_VALUE = 1;
    public static final int DELETE_ACTION_STATE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.kidsview.v1.proto.DeleteActionState.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public DeleteActionState m377findValueByNumber(int i) {
            return DeleteActionState.forNumber(i);
        }
    };
    private final int value;

    public static final class DeleteActionStateVerifier implements z190 {
        static final z190 INSTANCE = new DeleteActionStateVerifier();

        private DeleteActionStateVerifier() {
        }

        public boolean isInRange(int i) {
            return DeleteActionState.forNumber(i) != null;
        }
    }

    DeleteActionState(int i) {
        this.value = i;
    }

    public static DeleteActionState forNumber(int i) {
        if (i == 0) {
            return DELETE_ACTION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return DELETE_ACTION_STATE_ENABLED;
        }
        if (i == 2) {
            return DELETE_ACTION_STATE_DISABLED_GENERIC;
        }
        if (i != 3) {
            return null;
        }
        return DELETE_ACTION_STATE_DISABLED_REMOVE_MEMBER_FIRST;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return DeleteActionStateVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static DeleteActionState valueOf(int i) {
        return forNumber(i);
    }
}
