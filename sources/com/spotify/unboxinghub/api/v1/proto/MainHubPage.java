package com.spotify.unboxinghub.api.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class MainHubPage extends h implements v2j0 {
    private static final MainHubPage DEFAULT_INSTANCE;
    public static final int PAGE_HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 2;
    private int bitField0_;
    private BenefitsHeader pageHeader_;
    private h290 sections_ = h.emptyProtobufList();

    static {
        MainHubPage mainHubPage = new MainHubPage();
        DEFAULT_INSTANCE = mainHubPage;
        h.registerDefaultInstance(MainHubPage.class, mainHubPage);
    }

    private MainHubPage() {
    }

    public static MainHubPage n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "pageHeader_", "sections_", Section.class});
        }
        if (iOrdinal == 3) {
            return new MainHubPage();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (MainHubPage.class) {
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

    public final BenefitsHeader o() {
        BenefitsHeader benefitsHeader = this.pageHeader_;
        return benefitsHeader == null ? BenefitsHeader.n() : benefitsHeader;
    }

    public final h290 p() {
        return this.sections_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
