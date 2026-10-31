package com.spotify.voting.proto.v2;

import com.google.protobuf.h;
import com.spotify.voting.proto.v1.PostVotePageElement;
import p.bf40;
import p.h290;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class VotingSharePage extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int CLOSE_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 4;
    public static final int CLOSE_BUTTON_ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    private static final VotingSharePage DEFAULT_INSTANCE;
    public static final int ELEMENTS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 elements_ = h.emptyProtobufList();
    private String backgroundColor_ = "";
    private String closeButtonAccessibilityText_ = "";
    private String closeButtonAccessibilityAction_ = "";

    static {
        VotingSharePage votingSharePage = new VotingSharePage();
        DEFAULT_INSTANCE = votingSharePage;
        h.registerDefaultInstance(VotingSharePage.class, votingSharePage);
    }

    private VotingSharePage() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static VotingSharePage r(byte[] bArr) {
        return (VotingSharePage) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"elements_", PostVotePageElement.class, "backgroundColor_", "closeButtonAccessibilityText_", "closeButtonAccessibilityAction_"});
        }
        if (iOrdinal == 3) {
            return new VotingSharePage();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (VotingSharePage.class) {
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
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.closeButtonAccessibilityAction_;
    }

    public final String p() {
        return this.closeButtonAccessibilityText_;
    }

    public final h290 q() {
        return this.elements_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
