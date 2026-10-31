package com.spotify.player.model.command;

import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.bb00;
import p.eg;
import p.i5w0;
import p.j5;
import p.l1d;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_SeekToCommand extends SeekToCommand {
    private final spq0 creatorTimestampPositionMs;
    private final spq0 loggingParams;
    private final spq0 options;
    private final spq0 relative;
    private final long value;

    private AutoValue_SeekToCommand(long j, spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4) {
        this.value = j;
        this.relative = spq0Var;
        this.options = spq0Var2;
        this.loggingParams = spq0Var3;
        this.creatorTimestampPositionMs = spq0Var4;
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public spq0 creatorTimestampPositionMs() {
        return this.creatorTimestampPositionMs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeekToCommand) {
            SeekToCommand seekToCommand = (SeekToCommand) obj;
            if (this.value == seekToCommand.value() && this.relative.equals(seekToCommand.relative()) && this.options.equals(seekToCommand.options()) && this.loggingParams.equals(seekToCommand.loggingParams()) && this.creatorTimestampPositionMs.equals(seekToCommand.creatorTimestampPositionMs())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.value;
        return this.creatorTimestampPositionMs.hashCode() ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.relative.hashCode()) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.loggingParams.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public spq0 loggingParams() {
        return this.loggingParams;
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public spq0 options() {
        return this.options;
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public spq0 relative() {
        return this.relative;
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public SeekToCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        long j = this.value;
        String strValueOf = String.valueOf(this.relative);
        String strValueOf2 = String.valueOf(this.options);
        String strValueOf3 = String.valueOf(this.loggingParams);
        String strValueOf4 = String.valueOf(this.creatorTimestampPositionMs);
        StringBuilder sb = new StringBuilder("SeekToCommand{value=");
        sb.append(j);
        sb.append(", relative=");
        sb.append(strValueOf);
        bb00.j(sb, ", options=", strValueOf2, ", loggingParams=", strValueOf3);
        return l1d.q(sb, ", creatorTimestampPositionMs=", strValueOf4, "}");
    }

    @Override // com.spotify.player.model.command.SeekToCommand
    public long value() {
        return this.value;
    }

    public /* synthetic */ AutoValue_SeekToCommand(long j, spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3, spq0 spq0Var4, int i) {
        this(j, spq0Var, spq0Var2, spq0Var3, spq0Var4);
    }

    public static final class Builder extends SeekToCommand.Builder {
        private spq0 creatorTimestampPositionMs;
        private spq0 loggingParams;
        private spq0 options;
        private spq0 relative;
        private byte set$0;
        private long value;

        public Builder(SeekToCommand seekToCommand) {
            j5 j5Var = j5.a;
            this.relative = j5Var;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.creatorTimestampPositionMs = j5Var;
            this.value = seekToCommand.value();
            this.relative = seekToCommand.relative();
            this.options = seekToCommand.options();
            this.loggingParams = seekToCommand.loggingParams();
            this.creatorTimestampPositionMs = seekToCommand.creatorTimestampPositionMs();
            this.set$0 = (byte) 1;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand build() {
            if (this.set$0 == 1) {
                return new AutoValue_SeekToCommand(this.value, this.relative, this.options, this.loggingParams, this.creatorTimestampPositionMs, 0);
            }
            eg.m("Missing required properties: value");
            return null;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder creatorTimestampPositionMs(long j) {
            this.creatorTimestampPositionMs = new i5w0(Long.valueOf(j));
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder loggingParams(LoggingParams loggingParams) {
            this.loggingParams = spq0.d(loggingParams);
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder options(CommandOptions commandOptions) {
            this.options = spq0.d(commandOptions);
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder relative(SeekToCommand.Relative relative) {
            this.relative = spq0.d(relative);
            return this;
        }

        @Override // com.spotify.player.model.command.SeekToCommand.Builder
        public SeekToCommand.Builder value(long j) {
            this.value = j;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        public Builder() {
            j5 j5Var = j5.a;
            this.relative = j5Var;
            this.options = j5Var;
            this.loggingParams = j5Var;
            this.creatorTimestampPositionMs = j5Var;
        }
    }
}
