package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import p.ae00;
import p.b261;
import p.bcl1;
import p.be00;
import p.bvn0;
import p.bw91;
import p.ce00;
import p.ceg1;
import p.chs;
import p.cjy;
import p.cot;
import p.d441;
import p.dj10;
import p.djy;
import p.dug1;
import p.e261;
import p.eg;
import p.ejy;
import p.ek60;
import p.elb0;
import p.ewy0;
import p.ezc;
import p.f6o1;
import p.fft0;
import p.fid;
import p.fjy;
import p.g2p1;
import p.hab0;
import p.hcx0;
import p.hd40;
import p.i3o;
import p.ijy;
import p.iu30;
import p.jjy;
import p.jmb1;
import p.jnn;
import p.k6g1;
import p.k6u;
import p.kd40;
import p.kh60;
import p.kmt0;
import p.knn;
import p.kr81;
import p.l0x0;
import p.l4r;
import p.l6o1;
import p.lag0;
import p.ljy;
import p.lnm;
import p.lt11;
import p.lv21;
import p.lzn0;
import p.m161;
import p.m961;
import p.mo51;
import p.my91;
import p.niy;
import p.nt11;
import p.nw5;
import p.o7h;
import p.o95;
import p.oi;
import p.p1f0;
import p.q4u;
import p.q4z0;
import p.qc7;
import p.qtr;
import p.rih1;
import p.rrn1;
import p.ru21;
import p.rw2;
import p.s801;
import p.smc0;
import p.sw2;
import p.t3k1;
import p.t6j0;
import p.th30;
import p.trg;
import p.tv80;
import p.u210;
import p.u4p1;
import p.u84;
import p.u890;
import p.uov0;
import p.uu00;
import p.v1;
import p.v84;
import p.ven0;
import p.vgm;
import p.vh4;
import p.vh90;
import p.vnx0;
import p.voo1;
import p.wat;
import p.we;
import p.xa81;
import p.xfx;
import p.xho;
import p.xj1;
import p.xk00;
import p.xt11;
import p.xun0;
import p.xzf1;
import p.xzo1;
import p.y341;
import p.y981;
import p.yag1;
import p.yby;
import p.ycm;
import p.yjp1;
import p.ym;
import p.ymg;
import p.yoi1;
import p.zd00;
import p.zu00;
import p.zxg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m961 m961Var, Context context, ewy0 ewy0Var) {
        super(1);
        this.a = (byte) 12;
        this.b = context;
        this.c = ewy0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        int i = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                float fFloatValue = ((Number) ((o95) obj3).e()).floatValue();
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setColor(-1);
                ek60 ek60VarListIterator = ((bw91) obj2).listIterator();
                while (true) {
                    ek60 ek60Var = ek60VarListIterator;
                    if (!ek60Var.hasNext()) {
                        return rih1Var;
                    }
                    a aVar = (a) ek60Var.next();
                    float fC = fFloatValue - aVar.c();
                    if (fC >= 0.0f) {
                        float fO = yoi1.o(fC / 2000.0f, 0.0f, 1.0f);
                        float fD = aVar.d() * fIntBitsToFloat;
                        float fB = (((aVar.b() * 2.0f) + fIntBitsToFloat2) * fO) + (-aVar.b());
                        paint.setTextSize(aVar.b());
                        fid fidVarP = drawScope.a1().p();
                        Canvas canvas = v84.a;
                        ((u84) fidVarP).a.drawText(aVar.a(), fD, fB, paint);
                    }
                }
                break;
            case 1:
                lzn0 lzn0VarA = xj1.a((xj1) obj3);
                p1f0 p1f0VarW = rrn1.w(((String) obj2) + ":ratings");
                p1f0VarW.B((tv80) obj);
                lzn0VarA.f(p1f0VarW.h());
                return rih1Var;
            case 2:
                e261 e261Var = (e261) obj;
                String str = (String) obj2;
                StringBuilder sb = new StringBuilder();
                rw2 rw2Var = (sw2) obj3;
                sb.append(rw2Var.a());
                if (!rw2Var.b().isEmpty()) {
                    sb.append(", ");
                    sb.append(o7h.y0(rw2Var.b(), " • ", (String) null, (String) null, new v1(str, (byte) 25), 30));
                }
                b261.n(e261Var, sb.toString());
                return rih1Var;
            case 3:
                e261 e261Var2 = (e261) obj;
                b261.u(e261Var2, (String) obj3);
                e261Var2.b(m161.v, new we(null, new jnn((knn) obj2, (byte) 0)));
                return rih1Var;
            case 4:
                return ((iu30) obj3).invoke(((l4r) obj2).e.invoke(((List) obj).get(0)));
            case 5:
                chs chsVar = (chs) obj3;
                return (uov0) chs.e(chsVar, chs.b(chsVar).e((String) obj2), new i3o((String) obj, (byte) 12));
            case 6:
                ((q4u) obj3).a(((iu30) obj2).invoke(obj));
                return rih1Var;
            case 7:
                return ((iu30) obj2).invoke(((iu30) obj3).invoke(obj));
            case 8:
                niy niyVarW = xzo1.w(((yby) obj).a());
                if (niyVarW != null) {
                    ((iu30) obj3).invoke(new djy(niyVarW, (cjy) ((Function0) obj2).invoke()));
                }
                return rih1Var;
            case 9:
                d441 d441VarG1 = ((y341) obj).g1((String) obj3);
                try {
                    Iterator it = ((AbstractList) obj2).iterator();
                    while (it.hasNext()) {
                        d441VarG1.r(i, ((Number) it.next()).longValue());
                        i++;
                    }
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 10:
                kh60.b((kh60) obj3).E((y341) obj, (ArrayList) obj2);
                return rih1Var;
            case 11:
                ((t6j0) obj3).b.E((y341) obj, (smc0) obj2);
                return rih1Var;
            case 12:
                Intent intentA = m961.a((Context) obj3, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentA.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                return dj10.a(intentA, AppLifecycleServicePendingIntent.DISMISS, (ewy0) obj2);
            case 13:
                bvn0.p((xun0) obj, ((bvn0) obj3).c, (th30) obj2);
                return rih1Var;
            case 14:
                ((qtr) obj).b(new kmt0((lzn0) obj3, (vgm) obj2, (lnm) null));
                return rih1Var;
            case 15:
                return ((mo51) obj3).a(voo1.t((xfx) obj2, (xzf1) obj));
            case 16:
                ((qtr) obj).b(new vnx0((lzn0) obj3, (l0x0) obj2, (lnm) null));
                return rih1Var;
            case 17:
                String str2 = (String) obj;
                ezc ezcVarG = yoi1.g(((zu00) ((uu00) obj3)).b(new oi("recents", new q4z0(str2, (byte) 13))).filter(hcx0.e).take(1L).timeout(2L, TimeUnit.SECONDS).map(new yjp1(str2, (byte) 18)));
                return ((vh4) obj2).a() ? u4p1.b0(ezcVarG, new nw5((byte) 27)) : ezcVarG;
            case 18:
                nt11 nt11Var = (nt11) obj3;
                return nt11Var.g.e0() ? l6o1.A(f6o1.A(t3k1.H(new xho(((xk00) obj2).a), fft0.T0), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2)) : l6o1.A(f6o1.A(t3k1.H(ycm.a((ycm) nt11Var.b.get()), lt11.a), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2));
            case 19:
                ljy ljyVar = (ljy) obj;
                iu30 iu30Var = ((xt11) obj2).b;
                if (!u890.j(((jmb1) obj3).i, k6u.a)) {
                    if (ljyVar instanceof ijy) {
                        iu30Var.invoke(be00.a);
                    } else if (ljyVar instanceof jjy) {
                        iu30Var.invoke(ce00.a);
                    } else if (ljyVar instanceof ejy) {
                        iu30Var.invoke(zd00.a);
                    } else if (ljyVar instanceof fjy) {
                        iu30Var.invoke(ae00.a);
                    }
                }
                return rih1Var;
            case 20:
                g2p1.B(((wat) obj3).M0((int) (((elb0) obj).b() >> 32)), (ven0) obj2);
                return rih1Var;
            case 21:
                if (xa81.a[((y981) obj).ordinal()] == 1) {
                    ((ym) obj3).invoke(new qc7((vh90) obj2));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                return new kd40((hd40) obj3, (View) obj, kr81.b((kr81) obj2));
            case 23:
                ru21 ru21Var = (ru21) obj;
                my91 my91Var = (my91) obj2;
                List list = (List) obj3;
                if (ru21Var.a().isEmpty()) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (!u890.j(((cot) it2.next()).b, "CONNECT")) {
                                my91Var.d.a(list);
                            }
                        }
                    }
                } else {
                    List listA = ru21Var.a();
                    u210 u210Var = my91Var.d;
                    Iterator it3 = listA.iterator();
                    while (it3.hasNext()) {
                        u210Var.b((lv21) it3.next());
                    }
                }
                return rih1Var;
            case 24:
                qtr qtrVar = (qtr) obj;
                yag1 yag1Var = (yag1) obj3;
                qtrVar.c(new lag0(yag1Var, (lnm) null, (byte) 15));
                qtrVar.d = new k6g1(yag1Var, (lnm) null, (byte) 2);
                qtrVar.c = true;
                qtrVar.b(new trg((s801) obj2, (lnm) null, (byte) 1));
                return rih1Var;
            case 25:
                return new ymg(((dug1) obj3).c.b(new ceg1((iu30) obj2, (byte) 1)), (byte) 2);
            default:
                return new zxg1((bcl1) obj3, (ven0) obj2, (byte) 10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
