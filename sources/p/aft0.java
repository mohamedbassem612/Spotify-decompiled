package p;

import android.os.Bundle;
import android.os.Handler;
import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aft0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aft0(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        ou80 ou80Var;
        byte b = this.a;
        byte b2 = 26;
        ArrayList arrayList = z6x.a;
        zxc0 zxc0Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                ((iu30) obj3).invoke((met0) obj2);
                return rih1Var;
            case 1:
                ((qtr) obj).b(new sbk0((q8u0) obj3, (xu30) obj2, (lnm) null));
                return rih1Var;
            case 2:
                ((rit0) obj3).getClass();
                ((PlayButtonView) obj).B(rit0.h((lit0) obj2));
                return rih1Var;
            case 3:
                git0 git0Var = (git0) obj;
                yzc0 yzc0Var = (yzc0) obj3;
                mr20 mr20VarA = yzc0Var.a();
                rit0 rit0Var = (rit0) obj2;
                ai90 ai90Var = git0Var.c;
                String strC = ai90Var.c();
                l78 l78Var = rit0Var.i;
                return h5p1.r(mr20VarA, new uop0(yoi1.g(l78Var.a(strC).flatMapObservable(new fl1(l78Var, b2))), (byte) 11), new x010(yzc0Var.j(), new dy20(rit0Var.t, (byte) 18), new t4o0(rit0Var, git0Var, (lnm) null), (byte) 1), ai90Var instanceof ih90 ? d3p1.H(rit0Var.d, rit0Var.Z, git0Var) : new huz(new oit0(null), (byte) 10), new ddm(git0Var, (lnm) null, (byte) 1));
            case 4:
                ((in8) obj3).a.a((String) obj2, (tv80) obj, (Bundle) null);
                return rih1Var;
            case 5:
                return ((u9c) obj3).f((rnt0) obj, (rmt0) obj2);
            case 6:
                return ((u9c) obj3).f((rnt0) obj, (aii0) obj2);
            case 7:
                oy1 oy1Var = (oy1) obj3;
                fn31.T(cto1.q(oy1Var.d), oy1Var.e, 0, new dvq0(oy1Var, (String) obj2, (tv80) obj, (lnm) null, (byte) 16), 2);
                return rih1Var;
            case 8:
                oy1 oy1Var2 = (oy1) obj3;
                fn31.T(cto1.q(oy1Var2.d), oy1Var2.e, 0, new dvq0(oy1Var2, (List) obj2, (tv80) obj, (lnm) null, (byte) 17), 2);
                return rih1Var;
            case 9:
                return hu20.c((zob1) obj3, new rwm0((ngs0) obj2, (sqt0) obj, (lnm) null, (byte) 18));
            case 10:
                kex kexVar = (kex) obj;
                xwt0 xwt0Var = (xwt0) obj3;
                vwt0 vwt0Var = (vwt0) obj2;
                kexVar.a("share", new j2i(-1836588563, new wwt0(xwt0Var, vwt0Var, (byte) 0), true));
                if (xwt0Var.e) {
                    kexVar.a("translate", new j2i(-404734542, new wwt0(xwt0Var, vwt0Var, (byte) 1), true));
                }
                return rih1Var;
            case 11:
                jxt0 jxt0Var = (jxt0) obj3;
                return o4p1.r(rqt0.u(new m9r0(hu20.e(rqt0.u(new dy20(jxt0Var.b, (byte) 19)), new c6e0((lnm) null, jxt0Var, (o3r) obj2, (byte) 10)), jxt0Var, (byte) 10)), jxt0Var.d);
            case 12:
                ((gza) ((vyq0) obj3).b).a.a(nik1.u6.a, (tv80) obj, mno1.h(new mmr0[]{new mmr0("skip_forward_show_uri", (String) obj2)}));
                return rih1Var;
            case 13:
                p3u0 p3u0Var = (p3u0) obj3;
                p3u0Var.h.P(p3u0Var.i, ((Number) obj).longValue(), (hpc1) obj2);
                return rih1Var;
            case 14:
                p3u0 p3u0Var2 = (p3u0) obj3;
                p3u0Var2.h.x(p3u0Var2.i, (BetamaxException) obj2, ((Number) obj).longValue());
                return rih1Var;
            case 15:
                p3u0 p3u0Var3 = (p3u0) obj3;
                p3u0Var3.h.J(p3u0Var3.i, (BetamaxPlaybackException) obj2, ((Number) obj).longValue());
                return rih1Var;
            case 16:
                ((Number) obj).longValue();
                p3u0 p3u0Var4 = (p3u0) obj3;
                lgy lgyVar = p3u0Var4.h;
                y2g1 y2g1Var = (y2g1) obj2;
                Iterator it = lgyVar.h(p3u0Var4.i).iterator();
                while (it.hasNext()) {
                    ((Handler) lgyVar.c).post(new uu1((c0u0) it.next(), y2g1Var, lgyVar, (byte) 26));
                }
                return rih1Var;
            case 17:
                p3u0 p3u0Var5 = (p3u0) obj3;
                p3u0Var5.h.Q(p3u0Var5.i, (VideoSurfaceView) obj2, ((Number) obj).longValue());
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((qbu0) obj3).c.removeCallbacks((jyh0) obj2);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                int iIntValue = ((Number) obj).intValue();
                tqw tqwVar = ((tq80) obj3).b;
                if (tqwVar != null && (ou80Var = n3o1.y(tqwVar).a) != null) {
                    zxc0Var = new zxc0(ou80Var);
                }
                pju0 pju0Var = (pju0) ((tju0) obj2);
                return new jju0(pju0Var.a, pju0Var.b, pju0Var.c, iIntValue, zxc0Var);
            case 20:
                ((tbn) ((xmu0) obj3).c).a.a(t5p1.q((String) obj2), (tv80) obj, (Bundle) null);
                return rih1Var;
            case 21:
                ((iu30) obj3).invoke(((x4i1) obj2).a);
                return rih1Var;
            case 22:
                ((ci90) obj3).c((vpu0) obj2, (tv80) obj);
                return rih1Var;
            case 23:
                di4 di4Var = ((zb8) obj2).b;
                boolean zX = di4Var.X();
                ai4 ai4VarG0 = di4Var.g0();
                wfx wfxVar = ((zfx) obj3).b;
                return new afr(wfxVar.b, wfxVar.a, zX, ai4VarG0, (byte) 2);
            case 24:
                ((Boolean) obj).getClass();
                ((iu30) obj3).invoke((vru0) obj2);
                return rih1Var;
            case 25:
                long j = ((Offset) obj).a;
                ((iu30) obj3).invoke(new wuu0(((ovu0) obj2).f));
                return rih1Var;
            case 26:
                ((rsm) ((yy1) obj3).c).a.a(rsm.b((String) obj2), (tv80) obj, (Bundle) null);
                return rih1Var;
            case 27:
                if (dzu0.a[((kf3) obj).ordinal()] == 1) {
                    ((ym) obj3).invoke(new qc7((oh90) obj2));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 28:
                vu30 vu30Var = (vu30) obj;
                List list = ((qzu0) obj3).a0;
                if (list != null) {
                    List<j0v0> list2 = list;
                    lbt lbtVar = (lbt) obj2;
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    for (j0v0 j0v0Var : list2) {
                        arrayList.add((fv50) vu30Var.invoke(j0v0Var, new wpu0(j0v0Var, lbtVar, (byte) 5)));
                    }
                }
                return arrayList;
            default:
                vu30 vu30Var2 = (vu30) obj;
                List list3 = ((qzu0) obj3).b0;
                if (list3 != null) {
                    List<j0v0> list4 = list3;
                    jbt jbtVar = (jbt) obj2;
                    arrayList = new ArrayList(q7h.U(list4, 10));
                    for (j0v0 j0v0Var2 : list4) {
                        arrayList.add((r2g) vu30Var2.invoke(j0v0Var2, new wpu0(j0v0Var2, jbtVar, (byte) 6)));
                    }
                }
                return arrayList;
        }
    }
}
