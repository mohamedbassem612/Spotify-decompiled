package com.spotify.playlistmixing.extensions.mixtransition.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lig1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class TransitionData extends h implements v2j0 {
    public static final int CREATOR_USER_ID_FIELD_NUMBER = 5;
    private static final TransitionData DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 4;
    public static final int LATEST_TRANSITION_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 3;
    public static final int TRACK_A_URI_FIELD_NUMBER = 7;
    public static final int TRACK_B_URI_FIELD_NUMBER = 8;
    public static final int TRANSITION_FIELD_NUMBER = 6;
    public static final int TRANSITION_URI_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 9;
    private int type_;
    private String transitionUri_ = "";
    private String latestTransitionUri_ = "";
    private String playlistUri_ = "";
    private phc itemId_ = phc.b;
    private String creatorUserId_ = "";
    private String transition_ = "";
    private String trackAUri_ = "";
    private String trackBUri_ = "";

    static {
        TransitionData transitionData = new TransitionData();
        DEFAULT_INSTANCE = transitionData;
        h.registerDefaultInstance(TransitionData.class, transitionData);
    }

    private TransitionData() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static TransitionData s(byte[] bArr) {
        return (TransitionData) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\n\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t\f", new Object[]{"transitionUri_", "latestTransitionUri_", "playlistUri_", "itemId_", "creatorUserId_", "transition_", "trackAUri_", "trackBUri_", "type_"});
        }
        if (iOrdinal == 3) {
            return new TransitionData();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (TransitionData.class) {
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

    public final phc getItemId() {
        return this.itemId_;
    }

    public final String getPlaylistUri() {
        return this.playlistUri_;
    }

    public final String n() {
        return this.creatorUserId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.latestTransitionUri_;
    }

    public final String p() {
        return this.transition_;
    }

    public final String q() {
        return this.transitionUri_;
    }

    public final lig1 r() {
        lig1 lig1Var;
        int i = this.type_;
        if (i == 0) {
            lig1Var = lig1.TRANSITION_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            lig1Var = i != 2 ? null : lig1.TRANSITION_TYPE_CUSTOM;
        } else {
            lig1Var = lig1.TRANSITION_TYPE_AUTO;
        }
        return lig1Var == null ? lig1.UNRECOGNIZED : lig1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
