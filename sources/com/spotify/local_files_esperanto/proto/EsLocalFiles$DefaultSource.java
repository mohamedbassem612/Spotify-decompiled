package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xnz;
import p.ynz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsLocalFiles$DefaultSource extends h implements v2j0 {
    private static final EsLocalFiles$DefaultSource DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean enabled_;
    private int id_;

    static {
        EsLocalFiles$DefaultSource esLocalFiles$DefaultSource = new EsLocalFiles$DefaultSource();
        DEFAULT_INSTANCE = esLocalFiles$DefaultSource;
        h.registerDefaultInstance(EsLocalFiles$DefaultSource.class, esLocalFiles$DefaultSource);
    }

    private EsLocalFiles$DefaultSource() {
    }

    public static xnz o() {
        return (xnz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"id_", "enabled_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$DefaultSource();
        }
        if (iOrdinal == 4) {
            return new xnz(DEFAULT_INSTANCE);
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
        synchronized (EsLocalFiles$DefaultSource.class) {
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

    public final boolean getEnabled() {
        return this.enabled_;
    }

    public final ynz n() {
        ynz ynzVar;
        switch (this.id_) {
            case 0:
                ynzVar = ynz.UNKNOWN;
                break;
            case 1:
                ynzVar = ynz.ITUNES;
                break;
            case 2:
                ynzVar = ynz.DOWNLOADS;
                break;
            case 3:
                ynzVar = ynz.MY_MUSIC;
                break;
            case 4:
                ynzVar = ynz.WINDOWS_MUSIC_LIBRARY;
                break;
            case 5:
                ynzVar = ynz.ANDROID_MEDIA_STORE;
                break;
            case 6:
                ynzVar = ynz.IOS_DOCUMENTS;
                break;
            case 7:
                ynzVar = ynz.YOUR_LOCAL_FILES_APP_SUPPORT_FOLDER;
                break;
            default:
                ynzVar = null;
                break;
        }
        return ynzVar == null ? ynz.UNRECOGNIZED : ynzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(boolean z) {
        this.enabled_ = z;
    }

    public final void q() {
        this.id_ = ynz.ANDROID_MEDIA_STORE.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
