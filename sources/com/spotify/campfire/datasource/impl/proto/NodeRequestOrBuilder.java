package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Timestamp;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface NodeRequestOrBuilder extends v2j0 {
    BulkMessageRequest getBulkMessageRequest();

    NodeRequest.CnrCase getCnrCase();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getDigest();

    phc getDigestBytes();

    HierarchyRequest getHierarchyRequest();

    MessageRequest getMessageRequest();

    Timestamp getOccurredAt();

    boolean getReplay();

    boolean hasBulkMessageRequest();

    boolean hasDigest();

    boolean hasHierarchyRequest();

    boolean hasMessageRequest();

    boolean hasOccurredAt();

    boolean hasReplay();

    /* synthetic */ boolean isInitialized();
}
