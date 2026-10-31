package com.spotify.featuregate.v1;

import p.c290;
import p.xl10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b implements c290 {
    public final Object convert(int i) {
        xl10 xl10Var;
        switch (i) {
            case 0:
                xl10Var = xl10.UNKNOWN;
                break;
            case 1:
                xl10Var = xl10.ENTITLEMENT_MISSING;
                break;
            case 2:
                xl10Var = xl10.FEATURE_UNAVAILABLE;
                break;
            case 3:
                xl10Var = xl10.AGE_RESTRICTED;
                break;
            case 4:
                xl10Var = xl10.AGE_ASSURANCE_REQUIRED;
                break;
            case 5:
                xl10Var = xl10.CHILD_ACCOUNT;
                break;
            case 6:
                xl10Var = xl10.DEVICE_NOT_SUPPORTED;
                break;
            case 7:
                xl10Var = xl10.BLOCKED_BY_USER_SETTING;
                break;
            case 8:
                xl10Var = xl10.BLOCKED_BY_ACCOUNT_MANAGER;
                break;
            case 9:
                xl10Var = xl10.DSA_MODE_ENABLED;
                break;
            case 10:
                xl10Var = xl10.UNRELEASED_MARKET;
                break;
            default:
                xl10Var = null;
                break;
        }
        return xl10Var == null ? xl10.UNRECOGNIZED : xl10Var;
    }
}
