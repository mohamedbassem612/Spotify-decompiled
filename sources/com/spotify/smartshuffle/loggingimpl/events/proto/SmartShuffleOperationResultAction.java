package com.spotify.smartshuffle.loggingimpl.events.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.nn91;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SmartShuffleOperationResultAction extends h implements v2j0 {
    private static final SmartShuffleOperationResultAction DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 4;
    public static final int FAILURE_REASONS_FIELD_NUMBER = 5;
    public static final int FIRST_REC_POSITION_FIELD_NUMBER = 7;
    public static final int METADATA_KEY_FIELD_NUMBER = 8;
    public static final int OPERATION_REASON_FIELD_NUMBER = 9;
    public static final int OPERATION_SUCCEEDED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_STATE_FIELD_NUMBER = 6;
    public static final int SMART_SHUFFLE_STATE_FIELD_NUMBER = 1;
    public static final int TECH_STACK_FIELD_NUMBER = 3;
    public static final int USER_INTERACTION_ID_FIELD_NUMBER = 10;
    private int bitField0_;
    private int firstRecPosition_;
    private boolean operationSucceeded_;
    private boolean smartShuffleState_;
    private String techStack_ = "";
    private String entityUri_ = "";
    private h290 failureReasons_ = h.emptyProtobufList();
    private String playState_ = "";
    private String metadataKey_ = "";
    private String operationReason_ = "";
    private String userInteractionId_ = "";

    static {
        SmartShuffleOperationResultAction smartShuffleOperationResultAction = new SmartShuffleOperationResultAction();
        DEFAULT_INSTANCE = smartShuffleOperationResultAction;
        h.registerDefaultInstance(SmartShuffleOperationResultAction.class, smartShuffleOperationResultAction);
    }

    private SmartShuffleOperationResultAction() {
    }

    public static nn91 o() {
        return (nn91) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0004\u0007င\u0005\bဈ\u0006\tဈ\u0007\nဈ\b", new Object[]{"bitField0_", "smartShuffleState_", "operationSucceeded_", "techStack_", "entityUri_", "failureReasons_", "playState_", "firstRecPosition_", "metadataKey_", "operationReason_", "userInteractionId_"});
        }
        if (iOrdinal == 3) {
            return new SmartShuffleOperationResultAction();
        }
        if (iOrdinal == 4) {
            return new nn91(DEFAULT_INSTANCE);
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
        synchronized (SmartShuffleOperationResultAction.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.failureReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.failureReasons_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 8;
        this.entityUri_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 128;
        this.operationReason_ = str;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 2;
        this.operationSucceeded_ = z;
    }

    public final void s(String str) {
        this.bitField0_ |= 16;
        this.playState_ = str;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 1;
        this.smartShuffleState_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u() {
        this.bitField0_ |= 4;
        this.techStack_ = "PLAYER_API";
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.userInteractionId_ = str;
    }
}
