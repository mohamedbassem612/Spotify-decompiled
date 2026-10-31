package com.spotify.playlist.ai.creation.v2;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum Sender implements v190 {
    SENDER_UNSPECIFIED(0),
    SENDER_USER(1),
    SENDER_AI(2),
    SENDER_SPOTIFY(3),
    UNRECOGNIZED(-1);

    public static final int SENDER_AI_VALUE = 2;
    public static final int SENDER_SPOTIFY_VALUE = 3;
    public static final int SENDER_UNSPECIFIED_VALUE = 0;
    public static final int SENDER_USER_VALUE = 1;
    private static final y190 internalValueMap = new AnonymousClass1();
    private final int value;

    public static final class SenderVerifier implements z190 {
        static final z190 INSTANCE = new SenderVerifier();

        private SenderVerifier() {
        }

        public final boolean isInRange(int i) {
            return Sender.forNumber(i) != null;
        }
    }

    Sender(int i) {
        this.value = i;
    }

    public static Sender forNumber(int i) {
        if (i == 0) {
            return SENDER_UNSPECIFIED;
        }
        if (i == 1) {
            return SENDER_USER;
        }
        if (i == 2) {
            return SENDER_AI;
        }
        if (i != 3) {
            return null;
        }
        return SENDER_SPOTIFY;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return SenderVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Sender$1, reason: invalid class name */
    public class AnonymousClass1 implements y190 {
        public final Sender findValueByNumber(int i) {
            return Sender.forNumber(i);
        }

        /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
        public final v190 m559findValueByNumber(int i) {
            return Sender.forNumber(i);
        }
    }

    @Deprecated
    public static Sender valueOf(int i) {
        return forNumber(i);
    }
}
