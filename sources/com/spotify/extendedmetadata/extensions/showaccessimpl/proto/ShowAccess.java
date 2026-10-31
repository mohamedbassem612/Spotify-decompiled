package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.jf40;
import p.mn71;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uic;
import p.ulc;
import p.us71;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ShowAccess extends h implements v2j0 {
    public static final int BASIC_FIELD_NUMBER = 3;
    public static final int CHECKOUTONWEBOVERLAY_FIELD_NUMBER = 11;
    public static final int CONSUMPTIONCAPPED_FIELD_NUMBER = 13;
    private static final ShowAccess DEFAULT_INSTANCE;
    public static final int DELEGATETOUPSELL_FIELD_NUMBER = 21;
    public static final int DISCLAIMER_FIELD_NUMBER = 16;
    public static final int ENGAGEMENT_FIELD_NUMBER = 6;
    public static final int FREECHECKOUT_FIELD_NUMBER = 12;
    public static final int IS_USER_MEMBER_OF_AT_LEAST_ONE_GROUP_FIELD_NUMBER = 8;
    public static final int LEGACY_FIELD_NUMBER = 2;
    public static final int MEMBERBADGE_FIELD_NUMBER = 18;
    public static final int MULTIPASS_FIELD_NUMBER = 9;
    public static final int NONE_FIELD_NUMBER = 1;
    public static final int OPAQUE_EXPLANATION_FIELD_NUMBER = 17;
    private static volatile qzr0 PARSER = null;
    public static final int PROMOTIONAL_BANNER_FIELD_NUMBER = 19;
    public static final int PROMPT_FIELD_NUMBER = 5;
    public static final int RENDER_PADLOCK_FIELD_NUMBER = 20;
    public static final int SIGNIFIER_FIELD_NUMBER = 15;
    public static final int UNLOCKED_BY_FIELD_NUMBER = 10;
    public static final int UNLOCKING_METHODS_FIELD_NUMBER = 14;
    public static final int UPSELLLINK_FIELD_NUMBER = 4;
    private static final c290 unlockedBy_converter_ = new uic((byte) 24);
    private static final c290 unlockingMethods_converter_ = new ulc((byte) 24);
    private int bitField0_;
    private Disclaimer disclaimer_;
    private Object explanation_;
    private boolean isUserMemberOfAtLeastOneGroup_;
    private PromotionalBanner promotionalBanner_;
    private AccountLinkPrompt prompt_;
    private boolean renderPadlock_;
    private Signifier signifier_;
    private int unlockedByMemoizedSerializedSize;
    private int unlockingMethodsMemoizedSerializedSize;
    private int explanationCase_ = 0;
    private b290 unlockedBy_ = h.emptyIntList();
    private b290 unlockingMethods_ = h.emptyIntList();

    static {
        ShowAccess showAccess = new ShowAccess();
        DEFAULT_INSTANCE = showAccess;
        h.registerDefaultInstance(ShowAccess.class, showAccess);
    }

    private ShowAccess() {
    }

    public static ShowAccess L(byte[] bArr) {
        return (ShowAccess) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final AccountLinkPrompt A() {
        AccountLinkPrompt accountLinkPrompt = this.prompt_;
        return accountLinkPrompt == null ? AccountLinkPrompt.q() : accountLinkPrompt;
    }

    public final boolean B() {
        return this.renderPadlock_;
    }

    public final Signifier C() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.o() : signifier;
    }

    public final d290 D() {
        return new d290(this.unlockedBy_, unlockedBy_converter_);
    }

    public final d290 E() {
        return new d290(this.unlockingMethods_, unlockingMethods_converter_);
    }

    public final UpsellLinkExplanation F() {
        return this.explanationCase_ == 4 ? (UpsellLinkExplanation) this.explanation_ : UpsellLinkExplanation.q();
    }

    public final boolean G() {
        return this.explanationCase_ == 11;
    }

    public final boolean H() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean I() {
        return this.explanationCase_ == 6;
    }

    public final boolean J() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 1) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0001\u0001\u0015\u0014\u0000\u0002\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005ဉ\u0000\u0006<\u0000\b\u0007\t<\u0000\n,\u000b<\u0000\f<\u0000\r<\u0000\u000e,\u000fဉ\u0001\u0010ဉ\u0002\u0011=\u0000\u0012<\u0000\u0013ဉ\u0003\u0014\u0007\u0015<\u0000", new Object[]{"explanation_", "explanationCase_", "bitField0_", NoExplanation.class, LegacyExplanation.class, BasicExplanation.class, UpsellLinkExplanation.class, "prompt_", EngagementExplanation.class, "isUserMemberOfAtLeastOneGroup_", MultiPassExplanation.class, "unlockedBy_", CheckoutOnWebOverlayExplanation.class, FreeCheckoutExplanation.class, ConsumptionCappedExplanation.class, "unlockingMethods_", "signifier_", "disclaimer_", MemberBadgeExplanation.class, "promotionalBanner_", "renderPadlock_", DelegateToUpsellExplanation.class});
        }
        if (iOrdinal == 3) {
            return new ShowAccess();
        }
        if (iOrdinal == 4) {
            return new mn71((byte) 14);
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
        synchronized (ShowAccess.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BasicExplanation o() {
        return this.explanationCase_ == 3 ? (BasicExplanation) this.explanation_ : BasicExplanation.q();
    }

    public final CheckoutOnWebOverlayExplanation p() {
        return this.explanationCase_ == 11 ? (CheckoutOnWebOverlayExplanation) this.explanation_ : CheckoutOnWebOverlayExplanation.p();
    }

    public final ConsumptionCappedExplanation q() {
        return this.explanationCase_ == 13 ? (ConsumptionCappedExplanation) this.explanation_ : ConsumptionCappedExplanation.r();
    }

    public final DelegateToUpsellExplanation r() {
        return this.explanationCase_ == 21 ? (DelegateToUpsellExplanation) this.explanation_ : DelegateToUpsellExplanation.n();
    }

    public final Disclaimer s() {
        Disclaimer disclaimer = this.disclaimer_;
        return disclaimer == null ? Disclaimer.p() : disclaimer;
    }

    public final EngagementExplanation t() {
        return this.explanationCase_ == 6 ? (EngagementExplanation) this.explanation_ : EngagementExplanation.s();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int u() {
        return us71.a(this.explanationCase_);
    }

    public final FreeCheckoutExplanation v() {
        return this.explanationCase_ == 12 ? (FreeCheckoutExplanation) this.explanation_ : FreeCheckoutExplanation.o();
    }

    public final boolean w() {
        return this.isUserMemberOfAtLeastOneGroup_;
    }

    public final MemberBadgeExplanation x() {
        return this.explanationCase_ == 18 ? (MemberBadgeExplanation) this.explanation_ : MemberBadgeExplanation.r();
    }

    public final phc y() {
        return this.explanationCase_ == 17 ? (phc) this.explanation_ : phc.b;
    }

    public final PromotionalBanner z() {
        PromotionalBanner promotionalBanner = this.promotionalBanner_;
        return promotionalBanner == null ? PromotionalBanner.r() : promotionalBanner;
    }
}
