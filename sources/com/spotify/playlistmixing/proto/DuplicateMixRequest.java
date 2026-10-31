package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.gfv;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class DuplicateMixRequest extends h implements v2j0 {
    private static final DuplicateMixRequest DEFAULT_INSTANCE;
    public static final int ONLY_MIX_IF_ALREADY_MIXED_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    public static final int TRANSITION_OVERRIDES_FIELD_NUMBER = 2;
    private boolean onlyMixIfAlreadyMixed_;
    private String playlistUri_ = "";
    private h290 transitionOverrides_ = h.emptyProtobufList();

    static {
        DuplicateMixRequest duplicateMixRequest = new DuplicateMixRequest();
        DEFAULT_INSTANCE = duplicateMixRequest;
        h.registerDefaultInstance(DuplicateMixRequest.class, duplicateMixRequest);
    }

    private DuplicateMixRequest() {
    }

    public static gfv o() {
        return (gfv) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0007", new Object[]{"playlistUri_", "transitionOverrides_", TransitionOverride.class, "onlyMixIfAlreadyMixed_"});
        }
        if (iOrdinal == 3) {
            return new DuplicateMixRequest();
        }
        if (iOrdinal == 4) {
            return new gfv(DEFAULT_INSTANCE);
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
        synchronized (DuplicateMixRequest.class) {
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

    public final void n(TransitionOverride transitionOverride) {
        transitionOverride.getClass();
        h290 h290VarMutableCopy = this.transitionOverrides_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.transitionOverrides_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(transitionOverride);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p() {
        this.onlyMixIfAlreadyMixed_ = false;
    }

    public final void q(String str) {
        str.getClass();
        this.playlistUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
