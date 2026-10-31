package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.InteractionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PacingTimeUnit;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.EventType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract /* synthetic */ class xhm0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[PacingTimeUnit.values().length];
        try {
            iArr[PacingTimeUnit.HOURS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PacingTimeUnit.DAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PacingTimeUnit.WEEKS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[InteractionType.values().length];
        try {
            iArr2[InteractionType.CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[InteractionType.DISMISS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[EventType.values().length];
        try {
            iArr3[EventType.EVENT_TYPE_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[EventType.DISMISS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[EventType.VIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[EventType.CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
    }
}
