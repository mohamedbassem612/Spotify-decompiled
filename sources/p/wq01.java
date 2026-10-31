package p;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wq01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq01(Object obj, Object obj2, boolean z, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    public final Object invoke(Object obj) {
        String strY0;
        String strY1;
        String strB;
        byte b = this.a;
        int i = 2;
        r091 r091Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj;
                ((c460) obj3).a(((aob1) obj2).a(), frameLayout);
                Resources resources = frameLayout.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131166148) + (z ? 0 : resources.getDimensionPixelSize(2131165289));
                frameLayout.setPaddingRelative(dimensionPixelSize, frameLayout.getPaddingTop(), dimensionPixelSize, frameLayout.getPaddingBottom());
                return rih1Var;
            case 1:
                c380 c380Var = (c380) obj3;
                ((rtb0) obj).e(c380Var.size(), new iio0(c380Var, (byte) 24), new iio0(c380Var, (byte) 25), new j2i(2039820996, new fa9(c380Var, (maa) obj2, z, (byte) 2), true));
                return rih1Var;
            case 2:
                ((qtr) obj).b(new is11((yt11) obj3, z, (nu11) obj2, (lnm) null));
                return rih1Var;
            case 3:
                elb0 elb0Var = (elb0) obj;
                long jO = elb0Var.O(0L);
                kaa0.j(z ? nho1.A(elb0Var) : jO, (ven0) obj3);
                ((iu30) obj2).invoke(hm5.e(dm5.c0(jO), elb0Var.b()));
                return rih1Var;
            case 4:
                e261 e261Var = (e261) obj;
                lbd1 lbd1Var = (lbd1) obj3;
                if (!u890.j(lbd1Var, kbd1.a)) {
                    if (!u890.j(lbd1Var, jbd1.a)) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
                b261.x(e261Var, i);
                b261.E(e261Var, kbb.n(z));
                if (((lax) obj2) instanceof gax) {
                    b261.a(e261Var);
                }
                return rih1Var;
            case 5:
                e261 e261Var2 = (e261) obj;
                if (z) {
                    strY0 = (String) obj3;
                } else {
                    q8f1 q8f1Var = (q8f1) obj2;
                    strY0 = q8f1Var.f;
                    if (strY0.length() <= 0) {
                        String str = q8f1Var.b;
                        String str2 = q8f1Var.a;
                        d761 d761Var = q8f1Var.h;
                        if (d761Var != null) {
                            r091 r091VarB = kh.b(d761Var);
                            if (r091VarB.length() > 0) {
                                r091Var = r091VarB;
                            }
                        }
                        strY0 = o7h.y0(f46.i0(new String[]{str, str2, r091Var}), ", ", (String) null, (String) null, (iu30) null, 62);
                    }
                }
                b261.n(e261Var2, strY0);
                return rih1Var;
            case 6:
                e261 e261Var3 = (e261) obj;
                laf1 laf1Var = (laf1) obj3;
                b261.n(e261Var3, laf1Var.c);
                Function0 function0 = (Function0) obj2;
                if (function0 != null) {
                    b261.x(e261Var3, 0);
                    if (z) {
                        b261.y(e261Var3, true);
                    }
                    b261.g(e261Var3, laf1Var.d, new uuc1(function0, (byte) 16));
                }
                return rih1Var;
            case 7:
                e261 e261Var4 = (e261) obj;
                if (z) {
                    strY1 = (String) obj3;
                } else {
                    zff1 zff1Var = (zff1) obj2;
                    strY1 = zff1Var.g;
                    if (strY1.length() <= 0) {
                        String str3 = zff1Var.b;
                        String str4 = zff1Var.a;
                        String str5 = zff1Var.t;
                        if (str5.length() <= 0) {
                            str5 = null;
                        }
                        d761 d761Var2 = zff1Var.c;
                        if (d761Var2 != null) {
                            strB = kh.b(d761Var2);
                            if (strB.length() <= 0) {
                                strB = null;
                            }
                        } else {
                            strB = null;
                        }
                        d761 d761Var3 = zff1Var.i;
                        if (d761Var3 != null) {
                            r091 r091VarB2 = kh.b(d761Var3);
                            if (r091VarB2.length() > 0) {
                                r091Var = r091VarB2;
                            }
                        }
                        strY1 = o7h.y0(f46.i0(new String[]{str3, str4, str5, strB, r091Var}), ", ", (String) null, (String) null, (iu30) null, 62);
                    }
                }
                b261.n(e261Var4, strY1);
                return rih1Var;
            case 8:
                wfx wfxVar = ((zfx) obj3).b;
                iws iwsVar = new iws(wfxVar.b, wfxVar.a, z, (ai4) obj2);
                ((ConstraintLayout) iwsVar.f.b).setTag(2131429147, iwsVar);
                return iwsVar;
            case 9:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                v3t0 v3t0Var = (v3t0) obj3;
                if (z) {
                    h4t0 h4t0Var = (h4t0) v3t0Var.b.getValue();
                    clj1 clj1Var = ((s3t0) obj2).d;
                    h4t0Var.getClass();
                    videoSurfaceView.setBufferingThrobberEnabled(false);
                    videoSurfaceView.setScaleType(b3k1.c);
                    lsm0 lsm0Var = new lsm0(n3p1.q(clj1Var), new ksm0(fec1.c, (String) null, (String) null, "watch-feed-pivoting-card", "", (String) null, 486), true, false, new jsm0(Long.valueOf(clj1Var.c), Long.valueOf(clj1Var.d)), 0L, (ism0) null, h4t0Var.b, false, 0, 1896);
                    r091 r091VarA = h4t0Var.a.a(h4t0Var.c);
                    if (r091VarA != null) {
                        r091VarA.i(videoSurfaceView);
                        if (!u890.j(ebp1.n(r091VarA), lsm0Var)) {
                            r091VarA.b(lsm0Var);
                        }
                        r091.f(r091VarA, (tv80) null, (Long) null, mky0.a, 7);
                        r091Var = r091VarA;
                    }
                    h4t0Var.c = r091Var;
                } else {
                    r091 r091Var2 = ((h4t0) v3t0Var.b.getValue()).c;
                    if (r091Var2 != null) {
                        r091Var2.d();
                    }
                }
                return rih1Var;
            default:
                udm1 udm1Var = (udm1) obj3;
                if (z) {
                    Context context = (Context) obj2;
                    if (!udm1Var.e) {
                        udm1Var.e = true;
                        udm1Var.f = null;
                        udm1Var.g = Long.MIN_VALUE;
                        udm1Var.h = null;
                        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
                        if (defaultSensor != null || (defaultSensor = sensorManager.getDefaultSensor(11)) != null) {
                            sensorManager.registerListener((SensorEventListener) udm1Var.m, defaultSensor, 1, new Handler(Looper.getMainLooper()));
                            udm1Var.d = sensorManager;
                        }
                    }
                }
                return new kcf1(udm1Var, (byte) 15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq01(Object obj, boolean z, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq01(boolean z, Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
