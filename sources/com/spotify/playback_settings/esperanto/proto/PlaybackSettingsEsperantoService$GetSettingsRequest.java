package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.h;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.c4u0;
import p.er80;
import p.g4u0;
import p.h290;
import p.i9;
import p.jf40;
import p.l7c;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PlaybackSettingsEsperantoService$GetSettingsRequest extends h implements v2j0 {
    public static final int CONTENT_IDS_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$GetSettingsRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_USER_SETTINGS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REQUESTED_SETTING_FIELDS_FIELD_NUMBER = 1;
    private static final c290 requestedSettingFields_converter_ = new l7c((byte) 19);
    private int bitField0_;
    private boolean includeUserSettings_;
    private int requestedSettingFieldsMemoizedSerializedSize;
    private b290 requestedSettingFields_ = h.emptyIntList();
    private h290 contentIds_ = h.emptyProtobufList();

    static {
        PlaybackSettingsEsperantoService$GetSettingsRequest playbackSettingsEsperantoService$GetSettingsRequest = new PlaybackSettingsEsperantoService$GetSettingsRequest();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$GetSettingsRequest;
        h.registerDefaultInstance(PlaybackSettingsEsperantoService$GetSettingsRequest.class, playbackSettingsEsperantoService$GetSettingsRequest);
    }

    private PlaybackSettingsEsperantoService$GetSettingsRequest() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static g4u0 q() {
        return (g4u0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001,\u0002Ț\u0003ဇ\u0000", new Object[]{"bitField0_", "requestedSettingFields_", "contentIds_", "includeUserSettings_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$GetSettingsRequest();
        }
        if (iOrdinal == 4) {
            return new g4u0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$GetSettingsRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        h290 h290VarMutableCopy = this.contentIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.contentIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void p(c4u0 c4u0Var) {
        b290 b290VarMutableCopy = this.requestedSettingFields_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.requestedSettingFields_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(c4u0Var.getNumber());
    }

    public final void r(boolean z) {
        this.bitField0_ |= 1;
        this.includeUserSettings_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
