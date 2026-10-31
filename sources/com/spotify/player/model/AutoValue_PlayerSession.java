package com.spotify.player.model;

import p.bhn0;
import p.eg;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_PlayerSession extends PlayerSession {
    private final String session;

    private AutoValue_PlayerSession(String str) {
        this.session = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerSession) {
            return this.session.equals(((PlayerSession) obj).session());
        }
        return false;
    }

    public int hashCode() {
        return this.session.hashCode() ^ 1000003;
    }

    @Override // com.spotify.player.model.PlayerSession
    public String session() {
        return this.session;
    }

    @Override // com.spotify.player.model.PlayerSession
    public PlayerSession.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return f4i1.f("PlayerSession{session=", this.session, "}");
    }

    public /* synthetic */ AutoValue_PlayerSession(String str, int i) {
        this(str);
    }

    public static final class Builder extends PlayerSession.Builder {
        private String session;

        public Builder(PlayerSession playerSession) {
            this.session = playerSession.session();
        }

        @Override // com.spotify.player.model.PlayerSession.Builder
        public PlayerSession build() {
            String str = this.session;
            if (str != null) {
                return new AutoValue_PlayerSession(str, 0);
            }
            eg.m("Missing required properties: session");
            return null;
        }

        @Override // com.spotify.player.model.PlayerSession.Builder
        public PlayerSession.Builder session(String str) {
            if (str != null) {
                this.session = str;
                return this;
            }
            bhn0.i("Null session");
            return null;
        }

        public Builder() {
        }
    }
}
