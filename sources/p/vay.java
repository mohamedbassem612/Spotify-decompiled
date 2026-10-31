package p;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vay extends hab0 implements iu30 {
    public static final vay N0;
    public static final vay O0;
    public static final vay P0;
    public static final vay Q0;
    public static final vay R0;
    public static final vay S0;
    public static final vay T0;
    public static final vay U0;
    public static final vay V0;
    public static final vay W0;
    public static final vay X;
    public static final vay X0;
    public static final vay Y;
    public static final vay Y0;
    public static final vay Z;
    public static final vay Z0;
    public static final vay a1;
    public static final vay b;
    public static final vay b1;
    public static final vay c;
    public static final vay c1;
    public static final vay d;
    public static final vay d1;
    public static final vay e;
    public static final vay e1;
    public static final vay f;
    public static final vay g;
    public static final vay h;
    public static final vay i;
    public static final vay t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new vay(i2, (byte) 0);
        c = new vay(i2, (byte) 1);
        d = new vay(i2, (byte) 2);
        e = new vay(i2, (byte) 3);
        f = new vay(i2, (byte) 4);
        g = new vay(i2, (byte) 5);
        h = new vay(i2, (byte) 6);
        i = new vay(i2, (byte) 7);
        t = new vay(i2, (byte) 8);
        X = new vay(i2, (byte) 9);
        Y = new vay(i2, (byte) 10);
        Z = new vay(i2, (byte) 11);
        N0 = new vay(i2, (byte) 12);
        O0 = new vay(i2, (byte) 13);
        P0 = new vay(i2, (byte) 14);
        Q0 = new vay(i2, (byte) 15);
        R0 = new vay(i2, (byte) 16);
        S0 = new vay(i2, (byte) 17);
        T0 = new vay(i2, (byte) 18);
        U0 = new vay(i2, (byte) 19);
        V0 = new vay(i2, (byte) 20);
        W0 = new vay(i2, (byte) 21);
        X0 = new vay(i2, (byte) 22);
        Y0 = new vay(i2, (byte) 23);
        Z0 = new vay(i2, (byte) 24);
        a1 = new vay(i2, (byte) 25);
        b1 = new vay(i2, (byte) 26);
        c1 = new vay(i2, (byte) 27);
        d1 = new vay(i2, (byte) 28);
        e1 = new vay(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vay(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 1:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 2:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 3:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 4:
                long j = ((yr80) obj).a;
                return new qr80(0L);
            case 5:
                yr80 yr80Var = (yr80) obj;
                long j2 = yr80Var.a;
                return yr80Var;
            case 6:
                return xay.d;
            case 7:
                ((kd31) obj).i(1);
                return rih1Var;
            case 8:
                DrawScope.d0((DrawScope) obj, u7h.b, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 62);
                return rih1Var;
            case 9:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setScaleType(b3k1.c);
                videoSurfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return videoSurfaceView;
            case 10:
                return new xhy((why) obj, false);
            case 11:
                return ((ykb) obj).b;
            case 12:
                return ((ykb) obj).b;
            case 13:
                return ((sky) obj).a;
            case 14:
                return ((sky) obj).a;
            case 15:
                return ((sky) obj).a;
            case 16:
                return ((sky) obj).a;
            case 17:
                return ((sky) obj).a;
            case 18:
                if (!(obj instanceof pjw0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pjw0) obj;
            case 20:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 22:
                if (!(obj instanceof qtt0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qtt0) obj;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf(obj instanceof jo70);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 26:
                return Boolean.valueOf(obj instanceof xkk1);
            case 27:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 28:
                return rih1Var;
            default:
                return new m2v0((byte) 0);
        }
    }
}
