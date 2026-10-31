package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cy7 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy7(ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        kq9 kq9Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue((tx7) obj);
                return rih1Var;
            case 1:
                kq9 kq9Var2 = (kq9) obj;
                go9 go9Var = (go9) ven0Var.getValue();
                kq9 kq9Var3 = go9Var.a;
                ven0Var.setValue((kq9Var3.a() == go9Var.b || kq9Var2.a() == kq9Var3.a()) ? new go9(kq9Var2, kq9Var2.a()) : new go9(go9Var.a, kq9Var2.a()));
                return rih1Var;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                go9 go9Var2 = (go9) ven0Var.getValue();
                if (zBooleanValue) {
                    kq9Var = go9Var2.b ? kq9.c : kq9.b;
                } else {
                    go9Var2.getClass();
                    kq9Var = kq9.a;
                }
                boolean z = go9Var2.b;
                go9Var2.getClass();
                ven0Var.setValue(new go9(kq9Var, z));
                return rih1Var;
            case 3:
                ven0Var.setValue(Long.valueOf(((Number) obj).longValue()));
                return rih1Var;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ven0Var.setValue(bool);
                return rih1Var;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ven0Var.setValue(bool2);
                return rih1Var;
            case 6:
                kaa0.j(((elb0) obj).O(0L), ven0Var);
                return rih1Var;
            case 7:
                ((View) obj).requestLayout();
                return rih1Var;
            case 8:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).d()));
                return rih1Var;
            case 9:
                elb0 elb0Var = (elb0) obj;
                long jP = elb0Var.p(0L);
                int i = (int) (jP >> 32);
                int i2 = (int) (jP & 4294967295L);
                ven0Var.setValue(new ur80(jch0.U(Float.intBitsToFloat(i)), jch0.U(Float.intBitsToFloat(i2)), jch0.U(Float.intBitsToFloat(i) + ((int) (elb0Var.b() >> 32))), jch0.U(Float.intBitsToFloat(i2) + ((int) (4294967295L & elb0Var.b())))));
                return rih1Var;
            case 10:
                long j = ((Offset) obj).a;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 11:
                ven0Var.setValue(Boolean.valueOf(((wz20) obj).b()));
                return rih1Var;
            case 12:
                return new ij6(ven0Var, (byte) 1);
            case 13:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ven0Var.setValue(bool3);
                return rih1Var;
            case 14:
                ven0Var.setValue((VideoSurfaceView) obj);
                return rih1Var;
            case 15:
                ven0Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (((elb0) obj).O(0L) & 4294967295L))));
                return rih1Var;
            case 16:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1.b);
                ven0Var.setValue(videoSurfaceView);
                return videoSurfaceView;
            case 17:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                if (!u890.j((VideoSurfaceView) ven0Var.getValue(), videoSurfaceView2)) {
                    ven0Var.setValue(videoSurfaceView2);
                }
                return rih1Var;
            case 18:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                ven0Var.setValue(bool4);
                return rih1Var;
            case 19:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                ven0Var.setValue(bool5);
                return rih1Var;
            case 20:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                ven0Var.setValue(bool6);
                return rih1Var;
            case 21:
                ((iu30) ven0Var.getValue()).invoke(new fpe((String) obj));
                return rih1Var;
            case 22:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                ven0Var.setValue(bool7);
                return rih1Var;
            case 23:
                ven0Var.setValue(mqo1.A(o7h.N0((List) obj, (c380) ven0Var.getValue())));
                return rih1Var;
            case 24:
                String str = (String) obj;
                c380 c380Var = (c380) ven0Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c380Var) {
                    if (!u890.j(((oe90) obj2).a, str)) {
                        arrayList.add(obj2);
                    }
                }
                ven0Var.setValue(mqo1.A(arrayList));
                return rih1Var;
            case 25:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                return rih1Var;
            case 26:
                kaa0.j(((elb0) obj).O(0L), ven0Var);
                return rih1Var;
            case 27:
                elb0 elb0Var2 = (elb0) obj;
                ven0Var.setValue(nho1.v(elb0Var2).M(elb0Var2, true));
                return rih1Var;
            case 28:
                elb0 elb0Var3 = (elb0) obj;
                ven0Var.setValue(nho1.v(elb0Var3).M(elb0Var3, true));
                return rih1Var;
            default:
                yr80 yr80Var = (yr80) obj;
                long j2 = yr80Var.a;
                ven0Var.setValue(yr80Var);
                return rih1Var;
        }
    }
}
