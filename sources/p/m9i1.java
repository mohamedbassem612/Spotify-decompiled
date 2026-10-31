package p;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import com.spotify.wrapped.v1.proto.StoryCard;
import com.spotify.yourupdates.domain.models.FetchMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m9i1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9i1(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, vy30 vy30Var) {
        super(1);
        this.a = (byte) 4;
        this.d = ven0Var;
        this.c = ven0Var2;
        this.e = ven0Var3;
        this.b = vy30Var;
    }

    public final Object invoke(Object obj) {
        float fFloatValue;
        w7h1 w7h1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((rtb0) obj).e(by10.b.b(), (iu30) null, new tae1((byte) 3), new j2i(802480018, new oi1((w9i1) obj4, (ven0) obj3, (Context) obj2, (iu30) obj5, (byte) 15), true));
                return rih1Var;
            case 1:
                rtb0 rtb0Var = (rtb0) obj;
                ArrayList arrayList = (ArrayList) obj4;
                rtb0Var.e(arrayList.size(), new byc1(arrayList, (byte) 1), new byc1(arrayList, (byte) 2), new j2i(2039820996, new d311((byte) 11, (vu30) obj3, (iu30) obj5, arrayList), true));
                rtb0.c(rtb0Var, ab30.a, new j2i(654882422, new qje1((j2i) obj2, (byte) 2), true), 2);
                return rih1Var;
            case 2:
                ((qtr) obj).b(new gw2((ywv0) obj4, (xaj1) obj3, (tgt0) obj2, (bjx0) obj5, null));
                return rih1Var;
            case 3:
                iuf1 iuf1Var = new iuf1((ven0) obj3, (ven0) obj2, (ven0) obj5);
                iac0 iac0Var = (iac0) obj4;
                iac0Var.getLifecycle().a(iuf1Var);
                return new zxg1(iac0Var, iuf1Var, (byte) 6);
            case 4:
                long j = ((Offset) obj).a;
                ven0 ven0Var = (ven0) obj3;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    uoa uoaVar = (uoa) ((ven0) obj4).getValue();
                    if (uoaVar != null) {
                        yqj1 yqj1Var = (yqj1) ((ven0) obj2).getValue();
                        if (yqj1Var instanceof xqj1) {
                            uoaVar.f();
                        } else if (yqj1Var instanceof vqj1) {
                            uoaVar.h(new o2u0(((vy30) obj5).a, 14, (Map) null), new oot0(0L, 0L, true, false, (hu7) null, (tne1) null, false, 243));
                        } else {
                            if (!(yqj1Var instanceof wqj1)) {
                                eg.o();
                                return null;
                            }
                            uoaVar.l();
                        }
                    }
                } else {
                    ven0Var.setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 5:
                rtb0 rtb0Var2 = (rtb0) obj;
                ahk1 ahk1Var = (ahk1) obj4;
                rtb0.c(rtb0Var2, (Object) null, new j2i(80626808, new adx(ahk1Var, (iu30) obj5, (byte) 6), true), 3);
                c380 c380Var = ahk1Var.b;
                rtb0Var2.e(c380Var.size(), (iu30) null, new vse1(c380Var, (byte) 17), new j2i(802480018, new a87(c380Var, (j2i) obj3, ahk1Var, (lxk1) obj2, (iu30) obj5, (byte) 11), true));
                rtb0.c(rtb0Var2, (Object) null, xrj.a, 3);
                return rih1Var;
            case 6:
                dnc0 dnc0Var = (dnc0) obj;
                String str = (String) obj4;
                List<pvc0> list = ((rvl1) obj3).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (pvc0 pvc0Var : list) {
                    arrayList2.add(new h8k1(new uv11(pvc0Var.c, str, (Integer) null, pvc0Var.a, mqo1.B(pvc0Var.f), (tv11) null, 0, 228), pvc0Var.a));
                }
                two1.v(dnc0Var, new huz(arrayList2, (byte) 10), false, new hij1((hwl1) obj2, (d0r) obj5, (byte) 29));
                return rih1Var;
            case 7:
                p5t0 p5t0Var = (p5t0) obj;
                q5t0 q5t0Var = (q5t0) obj4;
                if (q5t0Var != null) {
                    p5t0Var.k(q5t0Var, 0, 0, 0.0f);
                }
                p5t0Var.k((q5t0) obj3, 0, 0, 1.0f);
                p5t0Var.k((q5t0) obj2, 0, 0, 2.0f);
                p5t0Var.k((q5t0) obj5, 0, 0, 3.0f);
                return rih1Var;
            case 8:
                StoryCard storyCard = (StoryCard) obj;
                ((ven0) obj3).setValue(Boolean.TRUE);
                l8m1 l8m1Var = (l8m1) obj4;
                xgm1 xgm1Var = l8m1Var.c;
                xgm1Var.a(new tgm1(storyCard));
                if (((Boolean) ((ven0) obj5).getValue()).booleanValue()) {
                    xgm1Var.a(igm1.a);
                    xgm1Var.a(fgm1.a);
                }
                frl1 frl1Var = l8m1Var.d;
                String id = storyCard.getId();
                qpj1 qpj1Var = (qpj1) frl1Var.b;
                hp80 hp80Var = ((o0i) obj2).e;
                bcl1 bcl1Var = (bcl1) qpj1Var.c;
                bcl1Var.getClass();
                p3m0 p3m0VarH = bcl1Var.h(hp80Var.b());
                x6h1 x6h1VarC = p3m0VarH.a.c();
                x6h1VarC.i.add(new a7h1("watch_feed_component", id, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = p3m0VarH.b.b.c;
                frl1Var.c = new zxl1(qpj1Var, bcl1Var.b.p(k7h1Var.a(), Collections.singleton(c3h1.b)), (byte) 3);
                return rih1Var;
            case 9:
                wtf1 wtf1Var = (wtf1) obj;
                if (wtf1Var != wtf1.a && !((l811) obj4).a) {
                    ((l811) obj3).a = true;
                }
                ((ycm1) obj2).c((cdm1) obj5, wtf1Var);
                return rih1Var;
            case 10:
                long jLongValue = ((Number) obj).longValue();
                ven0 ven0Var2 = (ven0) obj5;
                o811 o811Var = (o811) obj4;
                float f = (jLongValue - o811Var.a) / 1.0E9f;
                o811Var.a = jLongValue;
                drr0 drr0Var = (drr0) obj2;
                if (((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                    yux yuxVar = pdm1.a;
                    fFloatValue = drr0Var.s();
                    float fFloatValue2 = ((Number) ((tob1) ven0Var2.getValue()).getValue()).floatValue();
                    float f2 = fFloatValue2 - fFloatValue;
                    if (f > 0.25f) {
                        fFloatValue = fFloatValue2;
                    } else if (Math.abs(f2) >= 2.5E-4f) {
                        fFloatValue = l1d.e(1.0f, (float) Math.exp((-f) / 0.08f), f2, fFloatValue);
                    }
                } else {
                    fFloatValue = ((Number) ((tob1) ven0Var2.getValue()).getValue()).floatValue();
                }
                drr0Var.t(fFloatValue);
                return rih1Var;
            case 11:
                long j2 = ((Offset) obj).a;
                udm1 udm1Var = (udm1) obj4;
                if (udm1Var.e && !udm1Var.k) {
                    udm1Var.j = ((Number) udm1Var.b.getValue()).floatValue();
                    udm1Var.i = 0.0f;
                    udm1Var.f = null;
                    udm1Var.k = true;
                }
                bpb1 bpb1Var = cem1.i;
                xhm1 xhm1Var = (xhm1) ((ven0) obj3).getValue();
                if (xhm1Var != null) {
                    idm1 idm1Var = ((cem1) obj2).f;
                    hdm1 hdm1Var = (hdm1) ((ven0) obj5).getValue();
                    i8h1 i8h1Var = idm1Var.c;
                    c4m0 c4m0VarA = idm1Var.a(xhm1Var);
                    r6h1 r6h1Var = c4m0VarA.b;
                    x6h1 x6h1VarC2 = c4m0VarA.c.c();
                    x6h1VarC2.i.add(new a7h1("panorama_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    int iOrdinal = hdm1Var.ordinal();
                    b7x b7xVar = b7x.a;
                    if (iOrdinal == 0) {
                        x6h1 x6h1VarC3 = y6h1VarA2.c();
                        x6h1VarC3.i.add(new a7h1("thumbnail", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = true;
                        w7h1Var = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC4 = y6h1VarA2.c();
                        x6h1VarC4.i.add(new a7h1("thumbnail", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = true;
                        w7h1Var = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC5 = y6h1VarA2.c();
                        x6h1VarC5.i.add(new a7h1("video", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = true;
                        w7h1Var = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC5.a(), r6h1Var, System.currentTimeMillis());
                    }
                    i8h1Var.m(w7h1Var, (xj61) null);
                }
                return rih1Var;
            default:
                rtb0 rtb0Var3 = (rtb0) obj;
                List list2 = (List) obj3;
                iu30 iu30Var = (iu30) obj5;
                rtb0Var3.e(list2.size(), new vse1(list2, (byte) 23), new vse1(list2, (byte) 24), new j2i(2039820996, new d311((byte) 14, (yrg0) obj4, iu30Var, list2), true));
                dce0 dce0Var = ((g2n1) obj2).c;
                if (dce0Var.a() == FetchMode.NEXT) {
                    if (dce0Var instanceof kbe0) {
                        rtb0.c(rtb0Var3, "loading_error_next_notifications_page", new j2i(166443381, new ict0(iu30Var, (byte) 21), true), 2);
                    } else if (dce0Var instanceof rbe0) {
                        rtb0.c(rtb0Var3, "loading_next_notifications_page", itj.a, 2);
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9i1(Object obj, Object obj2, iu30 iu30Var, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = iu30Var;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9i1(Object obj, ven0 ven0Var, Object obj2, ven0 ven0Var2, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.e = obj2;
        this.d = ven0Var;
        this.b = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9i1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9i1(ahk1 ahk1Var, iu30 iu30Var, j2i j2iVar, lxk1 lxk1Var) {
        super(1);
        this.a = (byte) 5;
        this.c = ahk1Var;
        this.b = iu30Var;
        this.d = j2iVar;
        this.e = lxk1Var;
    }
}
