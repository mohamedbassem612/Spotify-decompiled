package com.spotify.lockstate.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class LockSection extends h implements v2j0 {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int BUTTONS_FIELD_NUMBER = 3;
    private static final LockSection DEFAULT_INSTANCE;
    public static final int FOOTER_BUTTON_FIELD_NUMBER = 5;
    public static final int FOOTER_LABEL_FIELD_NUMBER = 4;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ActionableButton footerButton_;
    private String header_ = "";
    private String body_ = "";
    private h290 buttons_ = h.emptyProtobufList();
    private String footerLabel_ = "";

    static {
        LockSection lockSection = new LockSection();
        DEFAULT_INSTANCE = lockSection;
        h.registerDefaultInstance(LockSection.class, lockSection);
    }

    private LockSection() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004ለ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "header_", "body_", "buttons_", ActionableButton.class, "footerLabel_", "footerButton_"});
        }
        if (iOrdinal == 3) {
            return new LockSection();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (LockSection.class) {
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
        return this.body_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.buttons_;
    }

    public final ActionableButton p() {
        ActionableButton actionableButton = this.footerButton_;
        return actionableButton == null ? ActionableButton.o() : actionableButton;
    }

    public final String q() {
        return this.footerLabel_;
    }

    public final String r() {
        return this.header_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
