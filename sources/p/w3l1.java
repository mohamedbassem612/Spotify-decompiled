package p;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.os.Bundle;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.scrollsita.v1.Section;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w3l1 extends hab0 implements Function0 {
    public static final w3l1 N0;
    public static final w3l1 O0;
    public static final w3l1 P0;
    public static final w3l1 Q0;
    public static final w3l1 R0;
    public static final w3l1 S0;
    public static final w3l1 T0;
    public static final w3l1 U0;
    public static final w3l1 V0;
    public static final w3l1 W0;
    public static final w3l1 X;
    public static final w3l1 X0;
    public static final w3l1 Y;
    public static final w3l1 Y0;
    public static final w3l1 Z;
    public static final w3l1 Z0;
    public static final w3l1 a1;
    public static final w3l1 b;
    public static final w3l1 b1;
    public static final w3l1 c;
    public static final w3l1 c1;
    public static final w3l1 d;
    public static final w3l1 d1;
    public static final w3l1 e;
    public static final w3l1 e1;
    public static final w3l1 f;
    public static final w3l1 g;
    public static final w3l1 h;
    public static final w3l1 i;
    public static final w3l1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new w3l1(i2, (byte) 0);
        c = new w3l1(i2, (byte) 1);
        d = new w3l1(i2, (byte) 2);
        e = new w3l1(i2, (byte) 3);
        f = new w3l1(i2, (byte) 4);
        g = new w3l1(i2, (byte) 5);
        h = new w3l1(i2, (byte) 6);
        i = new w3l1(i2, (byte) 7);
        t = new w3l1(i2, (byte) 8);
        X = new w3l1(i2, (byte) 9);
        Y = new w3l1(i2, (byte) 10);
        Z = new w3l1(i2, (byte) 11);
        N0 = new w3l1(i2, (byte) 12);
        O0 = new w3l1(i2, (byte) 13);
        P0 = new w3l1(i2, (byte) 14);
        Q0 = new w3l1(i2, (byte) 15);
        R0 = new w3l1(i2, (byte) 16);
        S0 = new w3l1(i2, (byte) 17);
        T0 = new w3l1(i2, (byte) 18);
        U0 = new w3l1(i2, (byte) 19);
        V0 = new w3l1(i2, (byte) 20);
        W0 = new w3l1(i2, (byte) 21);
        X0 = new w3l1(i2, (byte) 22);
        Y0 = new w3l1(i2, (byte) 23);
        Z0 = new w3l1(i2, (byte) 24);
        a1 = new w3l1(i2, (byte) 25);
        b1 = new w3l1(i2, (byte) 26);
        c1 = new w3l1(i2, (byte) 27);
        d1 = new w3l1(i2, (byte) 28);
        e1 = new w3l1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3l1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new pfp0("didRequestSkipToPrevious", x3l1.INSTANCE, new Annotation[0]);
            case 1:
                return new pfp0("didRequestPresentEditProfile", y3l1.INSTANCE, new Annotation[0]);
            case 2:
                return new r36(chc1.a, (byte) 0);
            case 3:
                return new r36(q360.a, (byte) 0);
            case 4:
                return new r36(cb6.a, (byte) 0);
            case 5:
                return null;
            case 6:
                return new qbo0();
            case 7:
            case 8:
            case 9:
            case 10:
                return rih1Var;
            case 11:
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
                valueAnimatorOfFloat.setDuration(100L);
                return valueAnimatorOfFloat;
            case 12:
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setColor(-1);
                return paint;
            case 13:
                return rih1Var;
            case 14:
                return new a1z("com.spotify.checkout.web.WebViewFragment.State", fjl1.values());
            case 15:
                return fjl1.b;
            case 16:
                return new Bundle();
            case 17:
                return rih1Var;
            case 18:
                return "";
            case 19:
                return Boolean.TRUE;
            case 20:
            case 21:
                return "";
            case 22:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -1, 0);
            case 23:
                return new xv81((byte) 8);
            case 24:
                return new a1z("com.spotify.fitness.workout.WorkoutProfileType", gzl1.values());
            case 25:
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP = PlaylistDecorationPolicy.p();
                sku0VarP.N();
                sku0VarP.d0();
                sku0VarP.R();
                sku0VarP.G();
                hru0VarS.w(sku0VarP.build());
                iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
                iou0VarV.D(true);
                iou0VarV.v();
                hru0VarS.u(iou0VarV.build());
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
                playlistRequestDecorationPolicyBuild.getClass();
                return new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, qrc0.a, hqz0.a, (prc0) null, 0, (List) null, 462);
            case 26:
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return rih1Var;
            case 28:
                return Boolean.TRUE;
            default:
                return rih1Var;
        }
    }
}
