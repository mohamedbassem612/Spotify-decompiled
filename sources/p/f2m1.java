package p;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.creatorbutton.CreatorButtonView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f2m1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2m1(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public final Object invoke(Object obj) {
        char c;
        String str;
        nsb0 nsb0Var;
        l7h1 l7h1VarA;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        nsb0 nsb0Var2 = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                ((hdn0) obj2).t(iIntValue);
                ((b2m1) obj3).a.accept(new p3m1(iIntValue));
                return rih1Var;
            case 1:
                gzl1 gzl1Var = (gzl1) obj;
                int iIndexOf = gzl1.f.indexOf(gzl1Var);
                zxl1 zxl1Var = (zxl1) obj2;
                i8h1 i8h1Var = (i8h1) zxl1Var.b;
                zok0 zok0Var = (zok0) zxl1Var.c;
                int iOrdinal = gzl1Var.ordinal();
                if (iOrdinal == 0) {
                    c = 3;
                } else if (iOrdinal == 1) {
                    c = 4;
                } else if (iOrdinal == 2) {
                    c = 2;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    c = 1;
                }
                Integer numValueOf = Integer.valueOf(iIndexOf);
                zok0Var.getClass();
                x6h1 x6h1VarC = zok0Var.b.c();
                if (c == 1) {
                    str = "intervals";
                } else if (c == 2) {
                    str = "pyramid";
                } else if (c == 3) {
                    str = "steady";
                } else {
                    if (c != 4) {
                        throw null;
                    }
                    str = "tapered";
                }
                x6h1VarC.i.add(new a7h1("intensity_chip", str, numValueOf, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((b2m1) obj3).a.accept(new v3m1(gzl1Var));
                return rih1Var;
            case 2:
                List listL1 = o7h.l1(gzl1.f);
                ((rtb0) obj).e(listL1.size(), (iu30) null, new vse1(listL1, (byte) 20), new j2i(802480018, new d311((byte) 13, (gzl1) obj2, (iu30) obj3, listL1), true));
                return rih1Var;
            case 3:
                ((qtr) obj).b(new lcm((lo60) obj2, (q8n) obj3, (lnm) null, (byte) 17));
                return rih1Var;
            case 4:
                return new zxg1((mbm1) obj2, obj3, (byte) 12);
            case 5:
                hw2 hw2Var = (hw2) obj2;
                return hu20.e(d3p1.F(hw2Var.b, (o3r) obj3, (a7m1) obj), new afb1((lnm) null, hw2Var, (byte) 19));
            case 6:
                ejj1 ejj1Var = (ejj1) obj2;
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj3;
                ejj1Var.a(videoSurfaceView);
                return new zxg1(ejj1Var, videoSurfaceView, (byte) 13);
            case 7:
                if (((Boolean) ((ven0) obj3).getValue()).booleanValue() && (nsb0Var = (nsb0) obj2) != null) {
                    nsb0Var.a();
                    nsb0Var2 = nsb0Var;
                }
                return new psb0(nsb0Var2, (byte) 1);
            case 8:
                ((Boolean) obj).getClass();
                ((iu30) obj2).invoke(((jb20) obj3).a);
                return rih1Var;
            case 9:
                sjz sjzVar = (sjz) obj;
                xhm1 xhm1Var = (xhm1) obj2;
                if (xhm1Var == null) {
                    return null;
                }
                ((l8m1) obj3).n.a(xhm1Var, sjzVar);
                return rih1Var;
            case 10:
                return new zxg1((iu30) obj2, (c8m1) obj3, (byte) 15);
            case 11:
                CreatorButtonView creatorButtonView = (CreatorButtonView) obj;
                creatorButtonView.n(new otj1((iu30) obj3, (byte) 9));
                creatorButtonView.y(((bbm1) obj2).a);
                return rih1Var;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                s8l1 s8l1Var = (u8l1) ((ven0) obj3).getValue();
                if (s8l1Var instanceof s8l1) {
                    dfn0 dfn0Var = ((lbm1) obj2).a.h;
                    r160 r160Var = s8l1Var.a;
                    r160 r160Var2 = new r160(r160Var.a, r160Var.b, r160Var.c, r160Var.d, zBooleanValue);
                    bpb1 bpb1Var = dfn0Var.c;
                    s8l1 s8l1Var2 = new s8l1(r160Var2);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, s8l1Var2);
                }
                return rih1Var;
            case 13:
                idm1 idm1Var = ((cem1) obj2).f;
                uba ubaVar = idm1Var.b;
                c4m0 c4m0VarA = idm1Var.a((xhm1) obj);
                r6h1 r6h1Var = c4m0VarA.b;
                x6h1 x6h1VarC2 = c4m0VarA.c.c();
                x6h1VarC2.i.add(new a7h1("panorama_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                int iOrdinal2 = ((hdm1) obj3).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC3 = y6h1VarA.c();
                    x6h1VarC3.i.add(new a7h1("thumbnail", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA2;
                    ((xjn) k7h1Var).b = r6h1Var;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    l7h1VarA = k7h1Var.a();
                } else if (iOrdinal2 == 1) {
                    x6h1 x6h1VarC4 = y6h1VarA.c();
                    x6h1VarC4.i.add(new a7h1("video", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC4.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA3;
                    ((xjn) k7h1Var2).b = r6h1Var;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    l7h1VarA = (l7h1) k7h1Var2.a();
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1VarA.c();
                    x6h1VarC5.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC5.a();
                    k7h1 k7h1Var3 = new k7h1();
                    ((xjn) k7h1Var3).a = y6h1VarA4;
                    ((xjn) k7h1Var3).b = r6h1Var;
                    ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                    l7h1VarA = (l7h1) k7h1Var3.a();
                }
                return ubaVar.p(l7h1VarA, idm1.d);
            case 14:
                wtf1 wtf1Var = (wtf1) obj;
                hem1 hem1Var = (hem1) obj2;
                w6e0 w6e0Var = (w6e0) obj3;
                iu30 iu30Var = hem1Var.b;
                if (hem1Var.c != 4 && hem1Var.a == w6e0Var) {
                    int iOrdinal3 = wtf1Var.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 != 1) {
                            eg.o();
                            return null;
                        }
                        int i = hem1Var.c;
                        if (i == 1 || i == 2) {
                            hem1Var.c = 3;
                            hem1Var.e();
                            iu30Var.invoke(wtf1Var);
                        }
                    } else if (hem1Var.c == 1) {
                        hem1Var.c = 2;
                        iu30Var.invoke(wtf1Var);
                        hem1Var.e();
                    }
                }
                return rih1Var;
            case 15:
                return ((tjz) obj2).b((xhm1) obj, (sjz) obj3);
            case 16:
                c1i c1iVar = (c1i) obj;
                grm1 grm1Var = (grm1) obj3;
                c1iVar.a = grm1Var.a;
                c1iVar.a(grm1Var.b, grm1Var.c, grm1Var.d, grm1Var.e);
                jrm1 jrm1Var = new jrm1((krm1) obj2, (byte) 1);
                a1i a1iVar = irm1.a;
                c1iVar.a(rc11.a.b(String.class), irm1.a, new f38(jrm1Var, (byte) 17), new p1i(ovh.O0));
                return rih1Var;
            case 17:
                urm1 urm1Var = (urm1) obj2;
                mxa1 mxa1Var = urm1Var.d;
                qzh qzhVar = (qzh) ((idd1) ((p1f0) obj3).g).getValue();
                int iA = urm1Var.a(qzhVar != null ? qzhVar.getView() : null);
                i8h1 i8h1Var2 = (i8h1) mxa1Var.b;
                z4m0 z4m0Var = (z4m0) mxa1Var.d;
                z4m0Var.getClass();
                x6h1 x6h1VarC6 = z4m0Var.a.c();
                x6h1VarC6.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA5 = x6h1VarC6.a();
                Integer numValueOf2 = Integer.valueOf(iA);
                x6h1 x6h1VarC7 = y6h1VarA5.c();
                x6h1VarC7.i.add(new a7h1("item", (String) null, numValueOf2, (String) null, (String) null));
                x6h1VarC7.j = true;
                y6h1 y6h1VarA6 = x6h1VarC7.a();
                String str2 = (String) ((idd1) mxa1Var.h).getValue();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str2 == null) {
                    str2 = "";
                }
                tv80 tv80VarM = i8h1Var2.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA6, r6h1.c, System.currentTimeMillis()), (xj61) null);
                Consumer consumer = urm1Var.f;
                if (consumer != null) {
                    consumer.accept(new vqm1(tv80VarM));
                }
                return rih1Var;
            case 18:
                jvm1 jvm1Var = (jvm1) obj2;
                n1t n1tVar = jvm1Var.d;
                n1tVar.getClass();
                k1t k1tVar = new k1t(don1.p((Context) obj), n1tVar.a, (cir0) obj3, n1tVar.d, n1tVar.f, n1tVar.g, new r1k(new Connectable[]{n1tVar.c, n1tVar.b, new x2y(n1tVar.e, l1t.b, m1t.a, (byte) 1)}, (byte) 0), n1tVar.h, n1tVar.i, n1tVar.j, n1tVar.k, n1tVar.l);
                kvq kvqVar = jvm1Var.e;
                k8m0 k8m0Var = jvm1Var.c;
                lvq lvqVar = (lvq) kvqVar.a.c;
                return new vzr((ab20) lvqVar.b0.get(), (whp) lvqVar.U0.get(), k8m0Var, k1tVar);
            case 19:
                elb0 elb0Var = (elb0) obj;
                vzm1 vzm1Var = (vzm1) obj2;
                if (!vzm1Var.f && elb0Var.a()) {
                    Rect rect = new Rect();
                    ((View) obj3).getWindowVisibleDisplayFrame(rect);
                    n511 n511VarW = l0p1.w(rect);
                    n511 n511VarN = nho1.n(elb0Var, true);
                    n511 n511VarJ = n511VarN.j(n511VarW);
                    float f = (n511VarN.d - n511VarN.b) * (n511VarN.c - n511VarN.a);
                    float f2 = 0.0f;
                    if (f > 0.0f) {
                        float f3 = n511VarJ.c - n511VarJ.a;
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        float f4 = n511VarJ.d - n511VarJ.b;
                        f2 = (f3 * (f4 >= 0.0f ? f4 : 0.0f)) / f;
                    }
                    if (f2 >= 0.5f) {
                        vzm1Var.f = true;
                        if (((Boolean) vzm1Var.e.getValue()).booleanValue()) {
                            vzm1Var.d.c();
                        }
                        u911 u911Var = vzm1Var.b;
                        if (u911Var != null) {
                            i8h1 i8h1Var3 = u911Var.a;
                            i8h1Var3.f(((wtl0) u911Var.e.getValue()).e(), (Set) null);
                            if (u911Var.d.b()) {
                                i8h1Var3.f(((ytl0) u911Var.h.getValue()).e(), (Set) null);
                            }
                        }
                    }
                }
                return rih1Var;
            case 20:
                b261.n((e261) obj, ((kjo0) obj2).c + ". • " + ((re30) obj3).b + ".");
                return rih1Var;
            default:
                ((p5t0) obj).f((q5t0) obj2, 0, 0, ((i3n1) obj3).O0);
                return rih1Var;
        }
    }
}
