package com.spotify.musicquizservice.v1;

import p.bf40;
import p.gw80;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class SoundEffectInteraction extends com.google.protobuf.h implements v2j0 {
    private static final SoundEffectInteraction DEFAULT_INSTANCE;
    public static final int INTERACTION_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SOUND_EFFECT_FIELD_NUMBER = 2;
    private int bitField0_;
    private int interactionType_;
    private SoundEffect soundEffect_;

    static {
        SoundEffectInteraction soundEffectInteraction = new SoundEffectInteraction();
        DEFAULT_INSTANCE = soundEffectInteraction;
        com.google.protobuf.h.registerDefaultInstance(SoundEffectInteraction.class, soundEffectInteraction);
    }

    private SoundEffectInteraction() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "interactionType_", "soundEffect_"});
        }
        if (iOrdinal == 3) {
            return new SoundEffectInteraction();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (SoundEffectInteraction.class) {
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

    public final gw80 n() {
        gw80 gw80Var;
        switch (this.interactionType_) {
            case 0:
                gw80Var = gw80.INTERACTION_TYPE_UNSPECIFIED;
                break;
            case 1:
                gw80Var = gw80.ANSWER_BUTTON_ENTRY;
                break;
            case 2:
                gw80Var = gw80.TIMER_ENTRY;
                break;
            case 3:
                gw80Var = gw80.BUTTON_TAP;
                break;
            case 4:
                gw80Var = gw80.CORRECT_ANSWER;
                break;
            case 5:
                gw80Var = gw80.INCORRECT_ANSWER;
                break;
            case 6:
                gw80Var = gw80.NEXT_BUTTON;
                break;
            case 7:
                gw80Var = gw80.QUIZ_COMPLETE;
                break;
            default:
                gw80Var = null;
                break;
        }
        return gw80Var == null ? gw80.UNRECOGNIZED : gw80Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SoundEffect o() {
        SoundEffect soundEffect = this.soundEffect_;
        return soundEffect == null ? SoundEffect.n() : soundEffect;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
