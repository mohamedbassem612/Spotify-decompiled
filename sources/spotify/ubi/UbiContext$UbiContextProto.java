package spotify.ubi;

import com.google.protobuf.h;
import p.bf40;
import p.d6h1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class UbiContext$UbiContextProto extends h implements v2j0 {
    public static final int BRANCHING_SOURCE_PAGE_INSTANCE_ID_FIELD_NUMBER = 6;
    private static final UbiContext$UbiContextProto DEFAULT_INSTANCE;
    public static final int INTERACTION_ID_FIELD_NUMBER = 4;
    public static final int NAVIGATION_REASON_ID_FIELD_NUMBER = 7;
    public static final int NAVIGATION_REASON_TYPE_FIELD_NUMBER = 8;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 3;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int VALID_UNTIL_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private int pagePresentationId_;
    private long validUntil_;
    private int version_;
    private String pageInstanceId_ = "";
    private String interactionId_ = "";
    private String branchingSourcePageInstanceId_ = "";
    private String navigationReasonId_ = "";
    private String navigationReasonType_ = "";

    static {
        UbiContext$UbiContextProto ubiContext$UbiContextProto = new UbiContext$UbiContextProto();
        DEFAULT_INSTANCE = ubiContext$UbiContextProto;
        h.registerDefaultInstance(UbiContext$UbiContextProto.class, ubiContext$UbiContextProto);
    }

    private UbiContext$UbiContextProto() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static d6h1 u() {
        return (d6h1) DEFAULT_INSTANCE.createBuilder();
    }

    public static UbiContext$UbiContextProto v(byte[] bArr) {
        return (UbiContext$UbiContextProto) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final void A(String str) {
        str.getClass();
        this.pageInstanceId_ = str;
    }

    public final void B(int i) {
        this.bitField0_ |= 1;
        this.pagePresentationId_ = i;
    }

    public final void C(long j) {
        this.validUntil_ = j;
    }

    public final void D() {
        this.version_ = 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\u0003\u0003Ȉ\u0004Ȉ\u0005င\u0000\u0006ለ\u0001\u0007ለ\u0002\bȈ", new Object[]{"bitField0_", "version_", "validUntil_", "pageInstanceId_", "interactionId_", "pagePresentationId_", "branchingSourcePageInstanceId_", "navigationReasonId_", "navigationReasonType_"});
        }
        if (iOrdinal == 3) {
            return new UbiContext$UbiContextProto();
        }
        if (iOrdinal == 4) {
            return new d6h1(DEFAULT_INSTANCE);
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
        synchronized (UbiContext$UbiContextProto.class) {
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
        return this.branchingSourcePageInstanceId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.interactionId_;
    }

    public final String p() {
        return this.navigationReasonId_;
    }

    public final String q() {
        return this.navigationReasonType_;
    }

    public final String r() {
        return this.pageInstanceId_;
    }

    public final long s() {
        return this.validUntil_;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void w(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.branchingSourcePageInstanceId_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.interactionId_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.navigationReasonId_ = str;
    }

    public final void z(String str) {
        this.navigationReasonType_ = str;
    }
}
