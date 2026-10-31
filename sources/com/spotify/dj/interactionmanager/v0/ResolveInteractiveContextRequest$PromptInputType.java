package com.spotify.dj.interactionmanager.v0;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum ResolveInteractiveContextRequest$PromptInputType implements v190 {
    PROMPT_INPUT_TYPE_UNSPECIFIED(0),
    PROMPT_INPUT_TYPE_VOICE(1),
    PROMPT_INPUT_TYPE_TEXT(2),
    PROMPT_INPUT_TYPE_SUGGESTED(3),
    UNRECOGNIZED(-1);

    public static final int PROMPT_INPUT_TYPE_SUGGESTED_VALUE = 3;
    public static final int PROMPT_INPUT_TYPE_TEXT_VALUE = 2;
    public static final int PROMPT_INPUT_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int PROMPT_INPUT_TYPE_VOICE_VALUE = 1;
    private static final y190 internalValueMap = new AnonymousClass1();
    private final int value;

    public static final class PromptInputTypeVerifier implements z190 {
        static final z190 INSTANCE = new PromptInputTypeVerifier();

        private PromptInputTypeVerifier() {
        }

        public final boolean isInRange(int i) {
            return ResolveInteractiveContextRequest$PromptInputType.forNumber(i) != null;
        }
    }

    ResolveInteractiveContextRequest$PromptInputType(int i) {
        this.value = i;
    }

    public static ResolveInteractiveContextRequest$PromptInputType forNumber(int i) {
        if (i == 0) {
            return PROMPT_INPUT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PROMPT_INPUT_TYPE_VOICE;
        }
        if (i == 2) {
            return PROMPT_INPUT_TYPE_TEXT;
        }
        if (i != 3) {
            return null;
        }
        return PROMPT_INPUT_TYPE_SUGGESTED;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return PromptInputTypeVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequest$PromptInputType$1, reason: invalid class name */
    public class AnonymousClass1 implements y190 {
        public final ResolveInteractiveContextRequest$PromptInputType findValueByNumber(int i) {
            return ResolveInteractiveContextRequest$PromptInputType.forNumber(i);
        }

        /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
        public final v190 m67findValueByNumber(int i) {
            return ResolveInteractiveContextRequest$PromptInputType.forNumber(i);
        }
    }

    @Deprecated
    public static ResolveInteractiveContextRequest$PromptInputType valueOf(int i) {
        return forNumber(i);
    }
}
