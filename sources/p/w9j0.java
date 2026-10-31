package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconName;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ImageStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class w9j0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[IconName.values().length];
        try {
            iArr[IconName.SHUFFLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IconName.SPOTIFYLOGO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IconName.X.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IconName.EXCLAMATIONCIRCLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[IconName.CHEVRONRIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[IconName.FOLLOWACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[IconName.DEVICETV.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[IconName.DEVICESPEAKER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[IconName.PLUS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[IconName.EXTERNALLINK.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        a = iArr;
        int[] iArr2 = new int[ImageStyle.values().length];
        try {
            iArr2[ImageStyle.CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ImageStyle.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ImageStyle.FULL_WIDTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ImageStyle.UNKNOWN_IMAGE_STYLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        b = iArr2;
        int[] iArr3 = new int[EncoreFont.values().length];
        try {
            iArr3[EncoreFont.BODY_SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[EncoreFont.BODY_MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[EncoreFont.TITLE_SMALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[EncoreFont.TITLE_MEDIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[EncoreFont.TITLE_LARGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[EncoreFont.HEADLINE_MEDIUM.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[EncoreFont.HEADLINE_LARGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[EncoreFont.BODY_MEDIUM_BOLD.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[EncoreFont.BODY_SMALL_BOLD.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[EncoreFont.MARGINAL.ordinal()] = 10;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[EncoreFont.MARGINAL_BOLD.ordinal()] = 11;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[EncoreFont.UNKNOWN_FONT.ordinal()] = 12;
        } catch (NoSuchFieldError unused26) {
        }
        c = iArr3;
    }
}
