package p;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bb8 {
    public final f2q a;

    public bb8(f2q f2qVar) {
        this.a = f2qVar;
    }

    public final jpg0 a(epb1 epb1Var, lik1 lik1Var, zob1 zob1Var, zrt0 zrt0Var, btt0 btt0Var, Function0 function0, Function0 function1, Function0 function2) {
        xa8 xa8Var;
        f2q f2qVar = this.a;
        switch (f2qVar.a) {
            case 0:
                i2q i2qVar = f2qVar.b;
                daq daqVar = i2qVar.a;
                yqg yqgVar = (yqg) daqVar.J1.get();
                teq teqVar = i2qVar.b;
                zsc zscVarJ3 = teqVar.j3();
                quc0 quc0Var = (quc0) teqVar.Mb.get();
                d771 d771Var = (d771) teqVar.Nb.get();
                lzn0 lzn0Var = (lzn0) teqVar.i.get();
                Activity activity = (Activity) teqVar.f.a;
                j2q j2qVar = i2qVar.c;
                xa8Var = new xa8(yqgVar, zscVarJ3, quc0Var, d771Var, lzn0Var, activity, (ycm) j2qVar.Z0.get(), (vgm) j2qVar.Q0.get(), ((Boolean) daqVar.S9.get()).booleanValue(), lik1Var, zob1Var, zrt0Var, btt0Var, function0, function1, function2);
                break;
            default:
                thq thqVar = f2qVar.b;
                daq daqVar2 = thqVar.b;
                yqg yqgVar2 = (yqg) daqVar2.J1.get();
                teq teqVar2 = thqVar.c;
                zsc zscVarJ4 = teqVar2.j3();
                quc0 quc0Var2 = (quc0) teqVar2.Mb.get();
                d771 d771Var2 = (d771) teqVar2.Nb.get();
                xa8Var = new xa8(yqgVar2, zscVarJ4, quc0Var2, d771Var2, (lzn0) teqVar2.i.get(), (Activity) teqVar2.f.a, (ycm) teqVar2.b.P.get(), (vgm) teqVar2.b.E.get(), ((Boolean) daqVar2.S9.get()).booleanValue(), lik1Var, zob1Var, zrt0Var, btt0Var, function0, function1, function2);
                break;
        }
        zrt0 zrt0Var2 = xa8Var.l;
        c8o.l(zrt0Var2);
        btt0 btt0Var2 = xa8Var.m;
        c8o.l(btt0Var2);
        lzn0 lzn0Var2 = xa8Var.e;
        c8o.l(lzn0Var2);
        vgm vgmVar = xa8Var.h;
        c8o.l(vgmVar);
        lik1 lik1Var2 = xa8Var.j;
        fc8 fc8Var = new fc8(lzn0Var2, vgmVar, lik1Var2);
        gc8 gc8Var = new gc8((byte) 0);
        d771 d771Var3 = xa8Var.d;
        c8o.l(d771Var3);
        Activity activity2 = xa8Var.f;
        c8o.l(activity2);
        Context applicationContext = activity2.getApplicationContext();
        quc0 quc0Var3 = xa8Var.c;
        c8o.l(quc0Var3);
        ow3 ow3Var = new ow3(applicationContext, quc0Var3, (byte) 24);
        yqg yqgVar3 = xa8Var.a;
        c8o.l(yqgVar3);
        em3 em3Var = new em3(ow3Var, yqgVar3, (byte) 27);
        ycm ycmVar = xa8Var.g;
        c8o.l(ycmVar);
        u961 u961Var = new u961();
        u961Var.a = lik1Var2;
        u961Var.b = zrt0Var2;
        u961Var.c = btt0Var2;
        u961Var.d = em3Var;
        vtw vtwVarA = l6o1.A(new jpg0((laa) xa8Var.n.invoke(), ft.c1));
        vtw vtwVarA2 = l6o1.A(new jpg0((laa) xa8Var.o.invoke(), ft.d1));
        vtw vtwVar = new vtw(new jpg0(d771Var3.a(), ft.e1), qbo1.b);
        vtw vtwVarA3 = l6o1.A(new jpg0(f6o1.A(ycm.a(ycmVar), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2), new j2(u961Var, (byte) 6)));
        vtw vtwVarA4 = l6o1.A(new jpg0((laa) xa8Var.f49p.invoke(), di0.b));
        em0 em0Var = new em0(new ei0(u961Var, (byte) 0), epb1Var, new ab(u961Var, (byte) 11), (iu30) null, (iu30) null, (iu30) null, (iu30) null, new ei0(u961Var, (byte) 1), (vu30) null, (vu30) null, 1784);
        agx0 agx0Var = new agx0(xa8Var.k);
        return new jpg0(zsc.j(xa8Var.b, em0Var, new mka((byte) 3, false), 1, xa8Var.i, vtwVarA4, (vtw) null, vtwVarA, vtwVarA2, vtwVar, vtwVarA3, fc8Var, gc8Var, (nu11) null, false, 0, false, kpc1.a, false, false, false, agx0Var, 0, -545472336), ft.b1);
    }
}
