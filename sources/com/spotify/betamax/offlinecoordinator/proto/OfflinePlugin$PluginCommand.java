package com.spotify.betamax.offlinecoordinator.proto;

import com.google.protobuf.h;
import p.bf40;
import p.djp0;
import p.jf40;
import p.jup0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class OfflinePlugin$PluginCommand extends h implements v2j0 {
    private static final OfflinePlugin$PluginCommand DEFAULT_INSTANCE;
    public static final int DOWNLOAD_FIELD_NUMBER = 3;
    public static final int IDENTIFY_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVE_FIELD_NUMBER = 4;
    public static final int STOP_DOWNLOAD_FIELD_NUMBER = 5;
    private Object command_;
    private int commandCase_ = 0;
    private String id_ = "";

    static {
        OfflinePlugin$PluginCommand offlinePlugin$PluginCommand = new OfflinePlugin$PluginCommand();
        DEFAULT_INSTANCE = offlinePlugin$PluginCommand;
        h.registerDefaultInstance(OfflinePlugin$PluginCommand.class, offlinePlugin$PluginCommand);
    }

    private OfflinePlugin$PluginCommand() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"command_", "commandCase_", "id_", OfflinePlugin.IdentifyCommand.class, OfflinePlugin.DownloadCommand.class, OfflinePlugin.RemoveCommand.class, OfflinePlugin.StopDownloadCommand.class});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$PluginCommand();
        }
        if (iOrdinal == 4) {
            return new djp0((byte) 10);
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
        synchronized (OfflinePlugin$PluginCommand.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return jup0.a(this.commandCase_);
    }

    public final OfflinePlugin.DownloadCommand p() {
        return this.commandCase_ == 3 ? (OfflinePlugin.DownloadCommand) this.command_ : OfflinePlugin.DownloadCommand.n();
    }

    public final OfflinePlugin.IdentifyCommand q() {
        return this.commandCase_ == 2 ? (OfflinePlugin.IdentifyCommand) this.command_ : OfflinePlugin.IdentifyCommand.n();
    }

    public final OfflinePlugin.RemoveCommand r() {
        return this.commandCase_ == 4 ? (OfflinePlugin.RemoveCommand) this.command_ : OfflinePlugin.RemoveCommand.n();
    }

    public final OfflinePlugin.StopDownloadCommand s() {
        return this.commandCase_ == 5 ? (OfflinePlugin.StopDownloadCommand) this.command_ : OfflinePlugin.StopDownloadCommand.n();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
