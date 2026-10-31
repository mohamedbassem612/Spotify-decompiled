package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShowShowRequest$ProtoShowResponse extends h implements v2j0 {
    public static final int AUXILIARY_SECTIONS_FIELD_NUMBER = 8;
    private static final ShowShowRequest$ProtoShowResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int LENGTH_FIELD_NUMBER = 5;
    public static final int LOADING_CONTENTS_FIELD_NUMBER = 6;
    public static final int ONLINE_DATA_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 4;
    public static final int UNRANGED_LENGTH_FIELD_NUMBER = 7;
    private ShowShowRequest$AuxiliarySections auxiliarySections_;
    private int bitField0_;
    private ShowShowRequest$ProtoShowRequestHeader header_;
    private h290 item_ = h.emptyProtobufList();
    private int length_;
    private boolean loadingContents_;
    private ShowShowRequest$ProtoOnlineData onlineData_;
    private int unfilteredLength_;
    private int unrangedLength_;

    static {
        ShowShowRequest$ProtoShowResponse showShowRequest$ProtoShowResponse = new ShowShowRequest$ProtoShowResponse();
        DEFAULT_INSTANCE = showShowRequest$ProtoShowResponse;
        h.registerDefaultInstance(ShowShowRequest$ProtoShowResponse.class, showShowRequest$ProtoShowResponse);
    }

    private ShowShowRequest$ProtoShowResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ShowShowRequest$ProtoShowResponse x(byte[] bArr) {
        return (ShowShowRequest$ProtoShowResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဋ\u0002\u0005ဋ\u0003\u0006ဇ\u0004\u0007ဋ\u0005\bဉ\u0006", new Object[]{"bitField0_", "item_", ShowShowRequest.ProtoShowRequestItem.class, "header_", "onlineData_", "unfilteredLength_", "length_", "loadingContents_", "unrangedLength_", "auxiliarySections_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$ProtoShowResponse();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (ShowShowRequest$ProtoShowResponse.class) {
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

    public final ShowShowRequest$AuxiliarySections n() {
        ShowShowRequest$AuxiliarySections showShowRequest$AuxiliarySections = this.auxiliarySections_;
        return showShowRequest$AuxiliarySections == null ? ShowShowRequest$AuxiliarySections.o() : showShowRequest$AuxiliarySections;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowShowRequest$ProtoShowRequestHeader o() {
        ShowShowRequest$ProtoShowRequestHeader showShowRequest$ProtoShowRequestHeader = this.header_;
        return showShowRequest$ProtoShowRequestHeader == null ? ShowShowRequest$ProtoShowRequestHeader.n() : showShowRequest$ProtoShowRequestHeader;
    }

    public final h290 p() {
        return this.item_;
    }

    public final boolean q() {
        return this.loadingContents_;
    }

    public final ShowShowRequest$ProtoOnlineData r() {
        ShowShowRequest$ProtoOnlineData showShowRequest$ProtoOnlineData = this.onlineData_;
        return showShowRequest$ProtoOnlineData == null ? ShowShowRequest$ProtoOnlineData.n() : showShowRequest$ProtoOnlineData;
    }

    public final int s() {
        return this.unfilteredLength_;
    }

    public final int t() {
        return this.unrangedLength_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 2) != 0;
    }
}
