package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xs3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs3(iyj iyjVar, ven0 ven0Var, ven0 ven0Var2) {
        super(1);
        this.a = (byte) 5;
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    public final Object invoke(Object obj) {
        iy31 ky31Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        ven0 ven0Var2 = this.b;
        switch (b) {
            case 0:
                return new ws3(ven0Var2, ven0Var, (byte) 0);
            case 1:
                ixb ixbVar = (ixb) obj;
                if (!((Boolean) ven0Var2.getValue()).booleanValue() && ixbVar != ixb.c) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 2:
                return new ws3(ven0Var2, ven0Var, (byte) 1);
            case 3:
                lpk1 lpk1Var = (lpk1) obj;
                ven0Var2.setValue(Boolean.TRUE);
                ((iu30) ven0Var.getValue()).invoke(new mpe(lpk1Var.a, lpk1Var.b));
                return rih1Var;
            case 4:
                y9e1 y9e1Var = (y9e1) obj;
                ven0Var2.setValue(new yr80(y9e1Var.c));
                ven0Var.setValue(Float.valueOf(y9e1Var.f(0)));
                return rih1Var;
            case 5:
                sw31 sw31Var = (sw31) obj;
                boolean z = sw31Var.b;
                List list = sw31Var.a;
                if (z) {
                    ky31Var = iy31.a;
                } else {
                    ky31Var = list.isEmpty() ? jy31.a : new ky31(list.size());
                }
                ven0Var2.setValue(ky31Var);
                ven0Var.setValue(sw31Var);
                return rih1Var;
            case 6:
                xxq xxqVar = (xxq) ven0Var2.getValue();
                i8h1 i8h1VarA = xxqVar.a();
                x6h1 x6h1VarC = xxqVar.b.b.c();
                x6h1VarC.i.add(new a7h1("understanding_my_data_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/article/understanding-my-data/?plain")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) ven0Var.getValue()).invoke(new txq((String) obj));
                return rih1Var;
            case 7:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setScaleType(b3k1.c);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setOnFirstFrameRendered(new iwr(ven0Var2, (byte) 28));
                videoSurfaceView.addOnAttachStateChangeListener(new t760(ven0Var, (byte) 0));
                return videoSurfaceView;
            case 8:
                elb0 elb0Var = (elb0) obj;
                kaa0.j(elb0Var.E(0L), ven0Var2);
                ven0Var.setValue(new yr80(elb0Var.b()));
                return rih1Var;
            case 9:
                lpk1 lpk1Var2 = (lpk1) obj;
                String str = lpk1Var2.a;
                ven0Var2.setValue(Boolean.valueOf(!ihc1.y0(str)));
                ((iu30) ven0Var.getValue()).invoke(new rra0(str, lpk1Var2.b));
                return rih1Var;
            case 10:
                ven0Var2.setValue((String) obj);
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 11:
                oq70 oq70Var = ((li7) obj).b.a;
                ven0Var2.setValue(Integer.valueOf(oq70Var.getWidth()));
                ven0Var.setValue(Integer.valueOf(oq70Var.getHeight()));
                return rih1Var;
            case 12:
                oq70 oq70Var2 = ((li7) obj).b.a;
                ven0Var2.setValue(Integer.valueOf(oq70Var2.getWidth()));
                ven0Var.setValue(Integer.valueOf(oq70Var2.getHeight()));
                return rih1Var;
            case 13:
                ven0Var2.setValue(Boolean.TRUE);
                ven0Var.setValue((tv80) obj);
                return rih1Var;
            case 14:
                ((iu30) ven0Var2.getValue()).invoke((lpk1) obj);
                ((iu30) ven0Var.getValue()).invoke(erm0.a);
                return rih1Var;
            case 15:
                VideoSurfaceView videoSurfaceView2 = new VideoSurfaceView((Context) obj);
                videoSurfaceView2.setScaleType(b3k1.b);
                videoSurfaceView2.setSupportsSurfaceView(false);
                videoSurfaceView2.setVideoSurfaceCallback(new yrg0(new q2j0(ven0Var2, (byte) 10), (byte) 4));
                AtomicLong atomicLong = bcn0.a;
                ven0Var.setValue(videoSurfaceView2);
                return videoSurfaceView2;
            case 16:
                String str2 = (String) obj;
                ven0Var2.setValue(ihc1.y0(str2) ? null : str2);
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 17:
                elb0 elb0Var2 = (elb0) obj;
                kaa0.j(elb0Var2.O(0L), ven0Var2);
                ven0Var.setValue(new yr80(elb0Var2.b()));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                c8e1 c8e1Var = (c8e1) obj;
                ven0Var2.setValue(c8e1Var);
                ven0Var.setValue(c8e1Var.a.b);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                String str3 = (String) obj;
                iu30 iu30Var = (iu30) ven0Var2.getValue();
                if (iu30Var != null) {
                    iu30Var.invoke(str3);
                } else {
                    ((f65) ven0Var.getValue()).a(str3);
                }
                return rih1Var;
            case 20:
                e261 e261Var = (e261) obj;
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    b261.v(e261Var, new i2g1(ven0Var, (byte) 22));
                }
                return rih1Var;
            default:
                if (!((Boolean) obj).booleanValue() && !((Boolean) ven0Var2.getValue()).booleanValue()) {
                    wpb1.n(ven0Var, true);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs3(ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
    }
}
