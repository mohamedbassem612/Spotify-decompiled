package com.spotify.aipartner.aipartnerapi.proto;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.protobuf.h;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import p.bf40;
import p.cbm;
import p.grn1;
import p.jf40;
import p.mct0;
import p.o8i0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Context extends h implements v2j0 {
    private static final Context DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int LOCAL_TIME_OF_DAY_FIELD_NUMBER = 3;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 1;
    private int bitField0_;
    private Device device_;
    private String localTimeOfDay_ = "";
    private int mediaType_;
    private int platform_;

    static {
        Context context = new Context();
        DEFAULT_INSTANCE = context;
        h.registerDefaultInstance(Context.class, context);
    }

    private Context() {
    }

    public static Context n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static cbm r() {
        return (cbm) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003Ȉ\u0007ဌ\u0001", new Object[]{"bitField0_", "platform_", "device_", "localTimeOfDay_", "mediaType_"});
        }
        if (iOrdinal == 3) {
            return new Context();
        }
        if (iOrdinal == 4) {
            return new cbm(DEFAULT_INSTANCE);
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
        synchronized (Context.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Device o() {
        Device device = this.device_;
        return device == null ? Device.n() : device;
    }

    public final o8i0 p() {
        o8i0 o8i0Var;
        int i = this.mediaType_;
        if (i != 0) {
            o8i0Var = i != 1 ? null : o8i0.IMAGE;
        } else {
            o8i0Var = o8i0.NONE;
        }
        return o8i0Var == null ? o8i0.UNRECOGNIZED : o8i0Var;
    }

    public final mct0 q() {
        mct0 mct0Var;
        switch (this.platform_) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                mct0Var = mct0.UNKNOWN_PLATFORM;
                break;
            case 1:
                mct0Var = mct0.META_RB;
                break;
            case 2:
                mct0Var = mct0.GEMINI_WEB;
                break;
            case 3:
                mct0Var = mct0.GEMINI_ANDROID;
                break;
            case 4:
                mct0Var = mct0.GEMINI_IOS;
                break;
            case 5:
                mct0Var = mct0.GEMINI_DESKTOP;
                break;
            case 6:
                mct0Var = mct0.GEMINI_SPEAKER;
                break;
            case 7:
                mct0Var = mct0.GEMINI_SMART_DISPLAY;
                break;
            case 8:
                mct0Var = mct0.GEMINI_AUTOMOBILE;
                break;
            case 9:
                mct0Var = mct0.GEMINI_ANDROID_AUTO_PROJECTED;
                break;
            case 10:
                mct0Var = mct0.GEMINI_ANDROID_AUTO_EMBEDDED;
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                mct0Var = mct0.GEMINI_ANDROID_AUTOMOTIVE_OS;
                break;
            case grn1.d /* 12 */:
                mct0Var = mct0.GEMINI_WEAR_OS;
                break;
            case 13:
                mct0Var = mct0.GEMINI_VR_ANDROID;
                break;
            case 14:
                mct0Var = mct0.GEMINI_VR_WEB;
                break;
            case 15:
                mct0Var = mct0.GEMINI_GLASSES_ANDROID;
                break;
            case 16:
                mct0Var = mct0.GEMINI_GLASSES_IOS;
                break;
            case 17:
                mct0Var = mct0.GEMINI_MAPS_NAVIGATION_ANDROID;
                break;
            case 18:
                mct0Var = mct0.GEMINI_MAPS_NAVIGATION_IOS;
                break;
            case 19:
                mct0Var = mct0.GEMINI_TV;
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                mct0Var = mct0.GA_TV;
                break;
            case 21:
                mct0Var = mct0.SAMSUNG_AI_BRIEF;
                break;
            case 22:
                mct0Var = mct0.ALEXA_PLUS;
                break;
            case 23:
                mct0Var = mct0.GA_SPEAKER;
                break;
            case 24:
                mct0Var = mct0.GA_SMART_DISPLAY;
                break;
            case 25:
                mct0Var = mct0.GA_ANDROID;
                break;
            case 26:
                mct0Var = mct0.GPT_WEB;
                break;
            case 27:
                mct0Var = mct0.GPT_DESKTOP;
                break;
            case 28:
                mct0Var = mct0.GPT_IOS;
                break;
            case 29:
                mct0Var = mct0.GPT_ANDROID;
                break;
            case 30:
                mct0Var = mct0.PERPLEXITY_IOS;
                break;
            case 31:
                mct0Var = mct0.PERPLEXITY_ANDROID;
                break;
            case 32:
                mct0Var = mct0.SAMSUNG_BIXBY_TV;
                break;
            case 33:
                mct0Var = mct0.META_RB_TESTERS;
                break;
            case 34:
                mct0Var = mct0.SESAME_VOICE_TEST;
                break;
            case 35:
                mct0Var = mct0.XIAOMI_AUTOMOTIVE;
                break;
            case 36:
                mct0Var = mct0.CLAUDE_WEB;
                break;
            case 37:
                mct0Var = mct0.CLAUDE_IOS;
                break;
            case 38:
                mct0Var = mct0.CLAUDE_ANDROID;
                break;
            case 39:
                mct0Var = mct0.CLAUDE_DESKTOP;
                break;
            case 40:
                mct0Var = mct0.SAMSUNG_AI_VISION_TV;
                break;
            case 41:
                mct0Var = mct0.NAVER;
                break;
            case 42:
                mct0Var = mct0.GEMINI_ANDROID_GO;
                break;
            case 43:
                mct0Var = mct0.CERENCE_AUTOMOTIVE;
                break;
            case 44:
                mct0Var = mct0.PARTNER_AGENT_DESIGN_PROTOTYPE;
                break;
            case 45:
                mct0Var = mct0.GEMINI_WEAR_OS_UNTETHERED;
                break;
            case 46:
                mct0Var = mct0.GEMINI_GOOGLE_SEARCH;
                break;
            case 47:
                mct0Var = mct0.AUTOMOTIVE_NATIVE;
                break;
            case 48:
                mct0Var = mct0.RIVIAN_AUTOMOTIVE;
                break;
            case 49:
                mct0Var = mct0.MCP_APP_WEB;
                break;
            case 50:
                mct0Var = mct0.MCP_APP_DESKTOP;
                break;
            case 51:
                mct0Var = mct0.MCP_APP_IOS;
                break;
            case 52:
                mct0Var = mct0.MCP_APP_ANDROID;
                break;
            case 53:
                mct0Var = mct0.TESLA_AUTOMOTIVE;
                break;
            case 54:
                mct0Var = mct0.WEBOS_TV;
                break;
            case 55:
                mct0Var = mct0.ANDROID_TV;
                break;
            case 56:
                mct0Var = mct0.SIRI_AI;
                break;
            case 57:
                mct0Var = mct0.GEMINI_EVAL;
                break;
            case 58:
                mct0Var = mct0.SNAP_SPECS;
                break;
            case 59:
                mct0Var = mct0.SAMSUNG_BIXBY_MOBILE;
                break;
            case 60:
                mct0Var = mct0.SAMSUNG_S_FINDER;
                break;
            default:
                mct0Var = null;
                break;
        }
        return mct0Var == null ? mct0.UNRECOGNIZED : mct0Var;
    }

    public final void s(Device device) {
        device.getClass();
        this.device_ = device;
        this.bitField0_ |= 1;
    }

    public final void t(String str) {
        this.localTimeOfDay_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(o8i0 o8i0Var) {
        this.mediaType_ = o8i0Var.getNumber();
        this.bitField0_ |= 2;
    }

    public final void v(mct0 mct0Var) {
        this.platform_ = mct0Var.getNumber();
    }
}
