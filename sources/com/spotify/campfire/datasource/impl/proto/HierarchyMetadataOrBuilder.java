package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Timestamp;
import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface HierarchyMetadataOrBuilder extends v2j0 {
    HierarchyAgent getAgents(int i);

    int getAgentsCount();

    List<HierarchyAgent> getAgentsList();

    Timestamp getCreatedAt();

    boolean getCurrentUserChannelMuted();

    HierarchyUserParticipationStatus getCurrentUserParticipationStatus();

    int getCurrentUserParticipationStatusValue();

    CurrentUserHierarchyState getCurrentUserState();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    HierarchyStatus getHierarchyStatus();

    int getHierarchyStatusValue();

    HierarchyType getHierarchyType();

    int getHierarchyTypeValue();

    String getInitiatorUsername();

    phc getInitiatorUsernameBytes();

    HierarchySource getSource();

    int getSourceValue();

    boolean hasCreatedAt();

    boolean hasCurrentUserState();

    /* synthetic */ boolean isInitialized();
}
