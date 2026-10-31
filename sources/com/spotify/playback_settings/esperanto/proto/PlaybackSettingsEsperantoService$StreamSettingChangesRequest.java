package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.c4u0;
import p.c9c;
import p.er80;
import p.i9;
import p.jf40;
import p.m4u0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaybackSettingsEsperantoService$StreamSettingChangesRequest extends h implements v2j0 {
    private static final PlaybackSettingsEsperantoService$StreamSettingChangesRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REQUESTED_SETTING_FIELDS_FIELD_NUMBER = 1;
    private static final c290 requestedSettingFields_converter_ = new c9c((byte) 19);
    private int requestedSettingFieldsMemoizedSerializedSize;
    private b290 requestedSettingFields_ = h.emptyIntList();

    static {
        PlaybackSettingsEsperantoService$StreamSettingChangesRequest playbackSettingsEsperantoService$StreamSettingChangesRequest = new PlaybackSettingsEsperantoService$StreamSettingChangesRequest();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$StreamSettingChangesRequest;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$StreamSettingChangesRequest.class, playbackSettingsEsperantoService$StreamSettingChangesRequest);
    }

    private PlaybackSettingsEsperantoService$StreamSettingChangesRequest() {
    }

    public static m4u0 p() {
        return (m4u0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"requestedSettingFields_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$StreamSettingChangesRequest();
        }
        if (iOrdinal == 4) {
            return new m4u0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$StreamSettingChangesRequest.class) {
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
        i9 i9Var = this.requestedSettingFields_;
        if (!i9Var.a) {
            this.requestedSettingFields_ = h.mutableCopy(i9Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c4u0 c4u0Var = (c4u0) it.next();
            this.requestedSettingFields_.c(c4u0Var.getNumber());
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(c4u0 c4u0Var) {
        b290 b290VarMutableCopy = this.requestedSettingFields_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.requestedSettingFields_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(c4u0Var.getNumber());
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
