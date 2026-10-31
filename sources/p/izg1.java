package p;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class izg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ izg1(Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                zjy.m((Number) function0.invoke(), (kd31) obj, 2);
                return rih1Var;
            case 1:
                function0.invoke();
                return rih1Var;
            case 2:
                long j = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
            case 3:
                if (hxi1.a[((yui1) obj).ordinal()] == 1) {
                    function0.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 4:
                int iOrdinal = ((y800) obj).ordinal();
                if (iOrdinal == 0) {
                    function0.invoke();
                } else if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 5:
                function0.invoke();
                return rih1Var;
            case 6:
                function0.invoke();
                return rih1Var;
            case 7:
                xx10 xx10Var = (xx10) obj;
                if ((xx10Var instanceof sx10) || (xx10Var instanceof vx10) || (xx10Var instanceof wx10)) {
                    function0.invoke();
                } else if (!(xx10Var instanceof tx10) && !(xx10Var instanceof ux10) && !(xx10Var instanceof rx10)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 8:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 9:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 10:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 11:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 12:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1.c);
                videoSurfaceView.setVideoSurfaceCallback(new yrg0(new tpj1(function0, (byte) 7), (byte) 4));
                return videoSurfaceView;
            case 13:
                ((Number) obj).intValue();
                return (r6h1) function0.invoke();
            case 14:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 15:
                ((kd31) obj).C(((Number) function0.invoke()).floatValue());
                return rih1Var;
            case 16:
                function0.invoke();
                return rih1Var;
            default:
                function0.invoke();
                return rih1Var;
        }
    }
}
