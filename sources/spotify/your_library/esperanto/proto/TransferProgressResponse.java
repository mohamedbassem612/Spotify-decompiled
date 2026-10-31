package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TransferProgressResponse extends h implements v2j0 {
    private static final TransferProgressResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    public static final int TRANSFER_PROGRESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private String error_ = "";
    private int statusCode_;
    private TransferProgress transferProgress_;

    static {
        TransferProgressResponse transferProgressResponse = new TransferProgressResponse();
        DEFAULT_INSTANCE = transferProgressResponse;
        h.registerDefaultInstance(TransferProgressResponse.class, transferProgressResponse);
    }

    private TransferProgressResponse() {
    }

    public static TransferProgressResponse p(byte[] bArr) {
        return (TransferProgressResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001c\u0003\u0000\u0000\u0000\u0001ဉ\u0000b\u000bcȈ", new Object[]{"bitField0_", "transferProgress_", "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new TransferProgressResponse();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (TransferProgressResponse.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
    }

    public final String n() {
        return this.error_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TransferProgress o() {
        TransferProgress transferProgress = this.transferProgress_;
        return transferProgress == null ? TransferProgress.n() : transferProgress;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
