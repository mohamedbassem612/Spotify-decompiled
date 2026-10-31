package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Collections;
import java.util.List;
import p.b380;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class SetQueueCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            List list = Collections.EMPTY_LIST;
            return SetQueueCommand.builder("", list, list);
        }

        public abstract SetQueueCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder nextTracks(List<ContextTrack> list);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder prevTracks(List<ContextTrack> list);

        public abstract Builder queueRevision(String str);
    }

    public static Builder builder(PlayerQueue playerQueue) {
        return new AutoValue_SetQueueCommand.Builder().queueRevision(playerQueue.revision()).nextTracks(playerQueue.nextTracks()).prevTracks(playerQueue.prevTracks());
    }

    public static SetQueueCommand create(String str, List<ContextTrack> list, List<ContextTrack> list2) {
        return builder(str, list, list2).build();
    }

    public abstract spq0 loggingParams();

    public abstract b380 nextTracks();

    public abstract spq0 options();

    public abstract b380 prevTracks();

    public abstract String queueRevision();

    public abstract Builder toBuilder();

    public static SetQueueCommand create(PlayerQueue playerQueue) {
        return builder(playerQueue).build();
    }

    public static Builder builder(String str, List<ContextTrack> list, List<ContextTrack> list2) {
        return new AutoValue_SetQueueCommand.Builder().queueRevision(str).nextTracks(list).prevTracks(list2);
    }
}
