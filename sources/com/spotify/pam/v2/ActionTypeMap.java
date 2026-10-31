package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s80;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ActionTypeMap extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int ACTION_TYPE_FIELD_NUMBER = 1;
    private static final ActionTypeMap DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int actionType_;
    private Action action_;
    private int bitField0_;

    static {
        ActionTypeMap actionTypeMap = new ActionTypeMap();
        DEFAULT_INSTANCE = actionTypeMap;
        h.registerDefaultInstance(ActionTypeMap.class, actionTypeMap);
    }

    private ActionTypeMap() {
    }

    public static ActionTypeMap p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "actionType_", "action_"});
        }
        if (iOrdinal == 3) {
            return new ActionTypeMap();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (ActionTypeMap.class) {
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

    public final Action n() {
        Action action = this.action_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final s80 o() {
        s80 s80Var;
        switch (this.actionType_) {
            case 0:
                s80Var = s80.CANCEL_FLOW;
                break;
            case 1:
                s80Var = s80.AVAILABLE_PLANS;
                break;
            case 2:
                s80Var = s80.INVITE_USER;
                break;
            case 3:
                s80Var = s80.EDIT_ADDRESS;
                break;
            case 4:
                s80Var = s80.PREPAID_TOPUP;
                break;
            case 5:
                s80Var = s80.RENEW_SUBSCRIPTION;
                break;
            case 6:
                s80Var = s80.CHANGE_PIN;
                break;
            case 7:
                s80Var = s80.INVITE_HELP;
                break;
            case 8:
                s80Var = s80.AUDIOBOOK_ENTRY;
                break;
            case 9:
                s80Var = s80.INVITE_OR_REMOVE_SUBACCOUNT;
                break;
            case 10:
                s80Var = s80.ADD_SUBACCOUNT;
                break;
            case 11:
                s80Var = s80.REMOVE_SUBACCOUNT;
                break;
            case 12:
                s80Var = s80.INVITE_SUBACCOUNT;
                break;
            case 13:
                s80Var = s80.ASTRO_GET_DETAILS;
                break;
            case 14:
                s80Var = s80.ASTRO_ENROLL;
                break;
            case 15:
                s80Var = s80.ASTRO_MANAGE;
                break;
            case 16:
                s80Var = s80.ASTRO_REQUEST;
                break;
            case 17:
                s80Var = s80.REMOVE_EXPIRING_ACCOUNT;
                break;
            case 18:
                s80Var = s80.MULTI_USER_PLAN_VERIFICATION;
                break;
            case 19:
                s80Var = s80.PARENTAL_CONTROLS;
                break;
            default:
                s80Var = null;
                break;
        }
        return s80Var == null ? s80.UNRECOGNIZED : s80Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
