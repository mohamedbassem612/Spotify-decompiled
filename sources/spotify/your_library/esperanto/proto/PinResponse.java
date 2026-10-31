package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.d2t0;
import p.ets0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PinResponse extends h implements v2j0 {
    private static final PinResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int HAS_MAXIMUM_PINNED_ITEMS_FIELD_NUMBER = 2;
    public static final int MAXIMUM_PINNED_ITEMS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    public static final int STATUS_FIELD_NUMBER = 1;
    private String error_ = "";
    private boolean hasMaximumPinnedItems_;
    private int maximumPinnedItems_;
    private int statusCode_;
    private int status_;

    static {
        PinResponse pinResponse = new PinResponse();
        DEFAULT_INSTANCE = pinResponse;
        h.registerDefaultInstance(PinResponse.class, pinResponse);
    }

    private PinResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PinResponse q(byte[] bArr) {
        return (PinResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001c\u0005\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0004b\u000bcȈ", new Object[]{"status_", "hasMaximumPinnedItems_", "maximumPinnedItems_", "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new PinResponse();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (PinResponse.class) {
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

    public final boolean n() {
        return this.hasMaximumPinnedItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.maximumPinnedItems_;
    }

    public final d2t0 p() {
        d2t0 d2t0Var;
        int i = this.status_;
        if (i == 0) {
            d2t0Var = d2t0.b;
        } else if (i != 1) {
            d2t0Var = i != 2 ? null : d2t0.d;
        } else {
            d2t0Var = d2t0.c;
        }
        return d2t0Var == null ? d2t0.e : d2t0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
