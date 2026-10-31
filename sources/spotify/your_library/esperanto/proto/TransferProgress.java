package spotify.your_library.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ifg1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TransferProgress extends h implements v2j0 {
    private static final TransferProgress DEFAULT_INSTANCE;
    public static final int ITEMS_MOVED_FIELD_NUMBER = 4;
    public static final int ITEMS_TOTAL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TRANSFER_ID_FIELD_NUMBER = 1;
    private int itemsMoved_;
    private int itemsTotal_;
    private float progress_;
    private int status_;
    private String transferId_ = "";

    static {
        TransferProgress transferProgress = new TransferProgress();
        DEFAULT_INSTANCE = transferProgress;
        h.registerDefaultInstance(TransferProgress.class, transferProgress);
    }

    private TransferProgress() {
    }

    public static TransferProgress n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0001\u0004\u0004\u0005\u0004", new Object[]{"transferId_", "status_", "progress_", "itemsMoved_", "itemsTotal_"});
        }
        if (iOrdinal == 3) {
            return new TransferProgress();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (TransferProgress.class) {
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

    public final int o() {
        return this.itemsMoved_;
    }

    public final int p() {
        return this.itemsTotal_;
    }

    public final float q() {
        return this.progress_;
    }

    public final ifg1 r() {
        ifg1 ifg1Var;
        int i = this.status_;
        if (i == 0) {
            ifg1Var = ifg1.IN_PROGRESS;
        } else if (i != 1) {
            ifg1Var = i != 2 ? null : ifg1.FAILED;
        } else {
            ifg1Var = ifg1.COMPLETED;
        }
        return ifg1Var == null ? ifg1.UNRECOGNIZED : ifg1Var;
    }

    public final String s() {
        return this.transferId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
