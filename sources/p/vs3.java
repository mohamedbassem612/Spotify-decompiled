package p;

import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vs3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs3(ven0 ven0Var, ven0 ven0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        ven0 ven0Var2 = this.b;
        switch (b) {
            case 0:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 0);
            case 1:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 1);
            case 2:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 2);
            case 3:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 3);
            case 4:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 4);
            case 5:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 5);
            case 6:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 6);
            case 7:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 7);
            case 8:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 8);
            case 9:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 9);
            case 10:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 10);
            case 11:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 11);
            case 12:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 12);
            default:
                return new vs3(ven0Var2, ven0Var, lnmVar, (byte) 13);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 4:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 5:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 6:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 7:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 8:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 9:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 10:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 11:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 12:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        r091 r091Var;
        r091 r091Var2;
        e3d1 e3d1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        ven0 ven0Var2 = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ven0Var.getValue();
                if (videoSurfaceView != null && (r091Var = (r091) ven0Var2.getValue()) != null) {
                    r091Var.i(videoSurfaceView);
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                ((iu30) ven0Var.getValue()).invoke(((go9) ven0Var2.getValue()).a);
                return rih1Var;
            case 2:
                hm5.M(obj);
                Boolean bool = Boolean.TRUE;
                ven0Var.setValue(bool);
                ven0Var2.setValue(bool);
                return rih1Var;
            case 3:
                hm5.M(obj);
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) ven0Var.getValue();
                if (videoSurfaceView2 != null && (r091Var2 = (r091) ven0Var2.getValue()) != null) {
                    r091Var2.i(videoSurfaceView2);
                }
                return rih1Var;
            case 4:
                hm5.M(obj);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.FALSE);
                    ogh oghVar = (ogh) ven0Var2.getValue();
                    if (oghVar != null) {
                        oghVar.a();
                    }
                }
                return rih1Var;
            case 5:
                hm5.M(obj);
                VideoSurfaceView videoSurfaceView3 = (VideoSurfaceView) ven0Var.getValue();
                if (videoSurfaceView3 != null) {
                    videoSurfaceView3.setBufferingThrobberEnabled(false);
                }
                VideoSurfaceView videoSurfaceView4 = (VideoSurfaceView) ven0Var.getValue();
                if (videoSurfaceView4 != null) {
                    videoSurfaceView4.setScaleType(b3k1.d);
                }
                r091 r091Var3 = (r091) ven0Var2.getValue();
                if (r091Var3 != null) {
                    r091Var3.i((VideoSurfaceView) ven0Var.getValue());
                }
                return rih1Var;
            case 6:
                hm5.M(obj);
                vm70 vm70Var = (vm70) ven0Var.getValue();
                if (vm70Var != null) {
                    vm70Var.setBufferingThrobberEnabled(false);
                }
                r091 r091Var4 = (r091) ven0Var2.getValue();
                if (r091Var4 != null) {
                    r091Var4.i((vm70) ven0Var.getValue());
                }
                return rih1Var;
            case 7:
                hm5.M(obj);
                p091 p091Var = (p091) ven0Var.getValue();
                if (p091Var != null) {
                    ((vu30) ven0Var2.getValue()).invoke(new Integer(p091Var.a), new Integer(p091Var.b));
                }
                return rih1Var;
            case 8:
                hm5.M(obj);
                float f = zfz0.c;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var2.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 9:
                hm5.M(obj);
                Boolean bool2 = (Boolean) ven0Var.getValue();
                bool2.booleanValue();
                ven0Var2.setValue(bool2);
                return rih1Var;
            case 10:
                hm5.M(obj);
                pxg1 pxg1Var = acf1.a;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var2.setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 11:
                hm5.M(obj);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    ((Function0) ven0Var2.getValue()).invoke();
                }
                return rih1Var;
            case 12:
                hm5.M(obj);
                ven0Var2.setValue(Boolean.valueOf(((czl1) ven0Var.getValue()).a));
                return rih1Var;
            default:
                hm5.M(obj);
                cjj1 cjj1Var = (cjj1) ven0Var.getValue();
                if ((cjj1Var instanceof yij1) || u890.j(cjj1Var, zij1.a) || (cjj1Var instanceof bjj1)) {
                    e3d1Var = e3d1.a;
                } else if (u890.j(cjj1Var, xij1.a) || u890.j(cjj1Var, ajj1.a)) {
                    e3d1Var = e3d1.b;
                } else {
                    if (!(cjj1Var instanceof wij1)) {
                        eg.o();
                        return null;
                    }
                    e3d1Var = (e3d1) ven0Var2.getValue();
                }
                if (e3d1Var == ((e3d1) ven0Var2.getValue())) {
                    return rih1Var;
                }
                ven0Var2.setValue(e3d1Var);
                return rih1Var;
        }
    }
}
