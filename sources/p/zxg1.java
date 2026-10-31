package p;

import android.view.View;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zxg1 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zxg1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void dispose() {
        n7h1 n7h1VarG;
        t480 t480Var;
        switch (this.a) {
            case 0:
                ayg1 ayg1Var = (ayg1) this.b;
                jfe jfeVar = ayg1Var.b;
                jfe jfeVar2 = (jfe) this.c;
                if (jfeVar == jfeVar2) {
                    ayg1Var.b = null;
                }
                jfeVar2.H((Throwable) null);
                return;
            case 1:
                uoa uoaVar = (uoa) this.b;
                uoaVar.f();
                uoaVar.k((VideoSurfaceView) this.c);
                return;
            case 2:
                ((iac0) this.b).getLifecycle().d((ek2) this.c);
                return;
            case 3:
                ncj1 ncj1Var = ((ocj1) this.b).e;
                d1x.b(ncj1Var.a, 4, (taj1) this.c, (Map) null, (String) null, 12);
                if (ncj1Var.b) {
                    ncj1Var.c.b(ncj1Var.d);
                    return;
                } else {
                    fn31.T(ncj1Var.e, null, 0, new jcj1(ncj1Var.f, null, (byte) 0), 3);
                    return;
                }
            case 4:
                ((uoa) this.b).f();
                bzs bzsVar = (bzs) this.c;
                uoa uoaVar2 = bzsVar.a;
                bzsVar.a = null;
                return;
            case 5:
                ((iac0) this.b).getLifecycle().d((ek2) this.c);
                return;
            case 6:
                ((iac0) this.b).getLifecycle().d((iuf1) this.c);
                return;
            case 7:
                ((iac0) this.b).getLifecycle().d((r6k1) this.c);
                return;
            case 8:
                ven0 ven0Var = (ven0) this.c;
                if (((t480) ven0Var.getValue()) != null) {
                    zeu zeuVar = (zeu) this.b;
                    t480 t480Var2 = (t480) ven0Var.getValue();
                    if (t480Var2 == null || (n7h1VarG = cwl1.G((q7r0) zeuVar.a)) == null) {
                        return;
                    }
                    n7h1VarG.e(t480Var2);
                    return;
                }
                return;
            case 9:
                ((iac0) this.b).getLifecycle().d((d8l1) this.c);
                return;
            case 10:
                ven0 ven0Var2 = (ven0) this.c;
                if (((t480) ven0Var2.getValue()) != null) {
                    ((bcl1) this.b).g((t480) ven0Var2.getValue());
                    ven0Var2.setValue((Object) null);
                    return;
                }
                return;
            case 11:
                osl1 osl1Var = (osl1) this.b;
                View view = (View) this.c;
                int i = osl1Var.v - 1;
                osl1Var.v = i;
                if (i == 0) {
                    WeakHashMap weakHashMap = b8k1.a;
                    r7k1.c(view, (k1q0) null);
                    mrl1.e(view, null);
                    view.removeOnAttachStateChangeListener(osl1Var.w);
                    return;
                }
                return;
            case 12:
                mbm1 mbm1Var = (mbm1) this.b;
                Object obj = this.c;
                synchronized (mbm1Var) {
                    mbm1Var.c.remove(obj);
                }
                return;
            case 13:
                ((ejj1) this.b).b((VideoSurfaceView) this.c);
                return;
            case 14:
                ((iac0) this.b).getLifecycle().d((v671) this.c);
                return;
            case 15:
                ((iu30) this.b).invoke(((c8m1) this.c).c);
                return;
            case 16:
                d08 d08Var = (d08) this.b;
                if (d08Var == null || (t480Var = (t480) this.c) == null) {
                    return;
                }
                d08Var.b.o(t480Var, d08.d);
                return;
            default:
                t480 t480Var3 = (t480) this.b;
                if (t480Var3 != null) {
                    ((iu30) this.c).invoke(t480Var3);
                    return;
                }
                return;
        }
    }
}
