package com.spotify.kidsrequest.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v16;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ApproveArtistRequestsRequest extends h implements v2j0 {
    public static final int ARTIST_URI_FIELD_NUMBER = 2;
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final ApproveArtistRequestsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_IDS_FIELD_NUMBER = 3;
    private String childId_ = "";
    private String artistUri_ = "";
    private h290 requestIds_ = h.emptyProtobufList();

    static {
        ApproveArtistRequestsRequest approveArtistRequestsRequest = new ApproveArtistRequestsRequest();
        DEFAULT_INSTANCE = approveArtistRequestsRequest;
        h.registerDefaultInstance(ApproveArtistRequestsRequest.class, approveArtistRequestsRequest);
    }

    private ApproveArtistRequestsRequest() {
    }

    public static v16 o() {
        return (v16) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț", new Object[]{"childId_", "artistUri_", "requestIds_"});
        }
        if (iOrdinal == 3) {
            return new ApproveArtistRequestsRequest();
        }
        if (iOrdinal == 4) {
            return new v16(DEFAULT_INSTANCE);
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
        synchronized (ApproveArtistRequestsRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.requestIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.requestIds_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.artistUri_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.childId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
