package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.is00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ExplicitFeedbackSubmission extends h implements v2j0 {
    private static final ExplicitFeedbackSubmission DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PRESENTED_TRANSITIONS_FIELD_NUMBER = 4;
    public static final int SELECTED_IDENTIFIER_FIELD_NUMBER = 3;
    public static final int TRACK_A_URI_FIELD_NUMBER = 1;
    public static final int TRACK_B_URI_FIELD_NUMBER = 2;
    private String trackAUri_ = "";
    private String trackBUri_ = "";
    private String selectedIdentifier_ = "";
    private h290 presentedTransitions_ = h.emptyProtobufList();

    static {
        ExplicitFeedbackSubmission explicitFeedbackSubmission = new ExplicitFeedbackSubmission();
        DEFAULT_INSTANCE = explicitFeedbackSubmission;
        h.registerDefaultInstance(ExplicitFeedbackSubmission.class, explicitFeedbackSubmission);
    }

    private ExplicitFeedbackSubmission() {
    }

    public static is00 o() {
        return (is00) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b", new Object[]{"trackAUri_", "trackBUri_", "selectedIdentifier_", "presentedTransitions_", PresentedTransition.class});
        }
        if (iOrdinal == 3) {
            return new ExplicitFeedbackSubmission();
        }
        if (iOrdinal == 4) {
            return new is00(DEFAULT_INSTANCE);
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
        synchronized (ExplicitFeedbackSubmission.class) {
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
        h290 h290VarMutableCopy = this.presentedTransitions_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.presentedTransitions_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.selectedIdentifier_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.trackAUri_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.trackBUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
