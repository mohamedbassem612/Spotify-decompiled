package com.spotify.player.model;

import p.b380;
import p.bhn0;
import p.eg;
import p.gvg;
import p.j5;
import p.rjx;
import p.spq0;
import p.z1p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class AutoValue_PlayerQueue extends PlayerQueue {
    private final b380 nextTracks;
    private final b380 prevTracks;
    private final String revision;
    private final spq0 track;

    private AutoValue_PlayerQueue(String str, spq0 spq0Var, b380 b380Var, b380 b380Var2) {
        this.revision = str;
        this.track = spq0Var;
        this.nextTracks = b380Var;
        this.prevTracks = b380Var2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerQueue) {
            PlayerQueue playerQueue = (PlayerQueue) obj;
            if (this.revision.equals(playerQueue.revision()) && this.track.equals(playerQueue.track())) {
                b380 b380Var = this.nextTracks;
                b380 b380VarNextTracks = playerQueue.nextTracks();
                b380Var.getClass();
                if (z1p1.j(b380Var, b380VarNextTracks)) {
                    b380 b380Var2 = this.prevTracks;
                    b380 b380VarPrevTracks = playerQueue.prevTracks();
                    b380Var2.getClass();
                    if (z1p1.j(b380Var2, b380VarPrevTracks)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.prevTracks.hashCode() ^ ((((((this.revision.hashCode() ^ 1000003) * 1000003) ^ this.track.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.PlayerQueue
    public b380 nextTracks() {
        return this.nextTracks;
    }

    @Override // com.spotify.player.model.PlayerQueue
    public b380 prevTracks() {
        return this.prevTracks;
    }

    @Override // com.spotify.player.model.PlayerQueue
    public String revision() {
        return this.revision;
    }

    @Override // com.spotify.player.model.PlayerQueue
    public PlayerQueue.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String str = this.revision;
        String strValueOf = String.valueOf(this.track);
        return rjx.o(gvg.n("PlayerQueue{revision=", str, ", track=", strValueOf, ", nextTracks="), String.valueOf(this.nextTracks), ", prevTracks=", String.valueOf(this.prevTracks), "}");
    }

    @Override // com.spotify.player.model.PlayerQueue
    public spq0 track() {
        return this.track;
    }

    public /* synthetic */ AutoValue_PlayerQueue(String str, spq0 spq0Var, b380 b380Var, b380 b380Var2, int i) {
        this(str, spq0Var, b380Var, b380Var2);
    }

    public static final class Builder extends PlayerQueue.Builder {
        private b380 nextTracks;
        private b380 prevTracks;
        private String revision;
        private spq0 track;

        public Builder(PlayerQueue playerQueue) {
            this.track = j5.a;
            this.revision = playerQueue.revision();
            this.track = playerQueue.track();
            this.nextTracks = playerQueue.nextTracks();
            this.prevTracks = playerQueue.prevTracks();
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue build() {
            if (this.revision != null && this.nextTracks != null && this.prevTracks != null) {
                return new AutoValue_PlayerQueue(this.revision, this.track, this.nextTracks, this.prevTracks, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.revision == null) {
                sb.append(" revision");
            }
            if (this.nextTracks == null) {
                sb.append(" nextTracks");
            }
            if (this.prevTracks == null) {
                sb.append(" prevTracks");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder nextTracks(b380 b380Var) {
            if (b380Var != null) {
                this.nextTracks = b380Var;
                return this;
            }
            bhn0.i("Null nextTracks");
            return null;
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder prevTracks(b380 b380Var) {
            if (b380Var != null) {
                this.prevTracks = b380Var;
                return this;
            }
            bhn0.i("Null prevTracks");
            return null;
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder revision(String str) {
            if (str != null) {
                this.revision = str;
                return this;
            }
            bhn0.i("Null revision");
            return null;
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder track(ContextTrack contextTrack) {
            this.track = spq0.d(contextTrack);
            return this;
        }

        public Builder() {
            this.track = j5.a;
        }
    }
}
