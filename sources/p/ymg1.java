package p;

import android.graphics.BlurMaskFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Flowable;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ymg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymg1(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        zuc0 zuc0Var;
        urg1 urg1Var;
        Integer num;
        zrg1 zrg1Var;
        String str;
        zci1 zci1Var;
        mic0 mic0VarT;
        mic0 mic0VarT2;
        Paint paint;
        byte b = this.a;
        Map map = b7x.a;
        byte b2 = 0;
        byte b3 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                jtl0 jtl0Var = (jtl0) obj;
                String str2 = (String) ((gmj) obj2).invoke();
                return new w7h1("", "", new z7h1("hit", 1, map), new x7h1("select_language", 1, sqg0.J(new mmr0[]{new mmr0("language_selected", str2 != null ? str2 : ""), new mmr0("browser_language", upn1.p())})), jtl0Var.a, jtl0Var.b.c.b.a, System.currentTimeMillis());
            case 1:
                return (mr20) ((rzf1) obj2).invoke(((kb61) obj).U());
            case 2:
                return new tj4((rb3) obj2, (byte) 28);
            case 3:
                return new qvc0(((d82) obj2).b, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 4:
                j7e0 j7e0Var = ((hwq) obj).g;
                j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
                String str3 = j7e0Var2 != null ? j7e0Var2.b : null;
                String str4 = str3 != null ? str3 : "";
                String str5 = ((bvm) obj2).b;
                Map map2 = (j7e0Var2 == null || (zuc0Var = j7e0Var2.a) == null) ? null : zuc0Var.g;
                if (map2 != null) {
                    map = map2;
                }
                return new a511(str4, str5, map);
            case 5:
                ((qtr) obj).b(new nqg1((oqg1) obj2, null, b2));
                return rih1Var;
            case 6:
                ((lzn0) ((hce1) obj2).d).h("spotify:internal:on-demand-trial:plan-overview");
                return rih1Var;
            case 7:
                dug1 dug1Var = (dug1) obj2;
                aug1 aug1Var = dug1Var.d;
                fug1 fug1Var = dug1Var.a;
                hsg1 hsg1Var = fug1Var.a;
                int i = fug1Var.b;
                boolean zC = aug1Var.c.c();
                if (zC) {
                    urg1Var = new urg1(2131959422, 2131959424);
                    num = null;
                } else {
                    num = null;
                    urg1Var = new urg1((Integer) null, 2131959423);
                }
                yrg1 yrg1Var = new yrg1(2131959429, new vrg1(2131820787, i), num);
                srg1 srg1Var = zC ? new srg1(2131959403, 4) : new srg1(2131959402, 12);
                if (hsg1Var.equals(asg1.d)) {
                    trg1 trg1Var = zC ? new trg1(2131959412, new vrg1(2131820780, i), 2131959421) : new trg1(2131959412, new wrg1(2131959405), 2131959420);
                    if (!zC) {
                        yrg1Var = new yrg1(2131959427, new wrg1(2131959428), 2131959426);
                    }
                    zrg1Var = new zrg1(trg1Var, urg1Var, yrg1Var, srg1Var);
                } else if (hsg1Var.equals(gsg1.d)) {
                    trg1 trg1Var2 = zC ? new trg1(2131959419, new vrg1(2131820786, i), 2131959421) : new trg1(2131959419, new wrg1(2131959411), 2131959420);
                    if (!zC) {
                        yrg1Var = new yrg1(2131959427, new wrg1(2131959435), 2131959426);
                    }
                    zrg1Var = new zrg1(trg1Var2, urg1Var, yrg1Var, srg1Var);
                } else if (hsg1Var.equals(bsg1.d)) {
                    trg1 trg1Var3 = zC ? new trg1(2131959414, new vrg1(2131820781, i), 2131959421) : new trg1(2131959413, new wrg1(2131959406), 2131959420);
                    if (!zC) {
                        yrg1Var = new yrg1(2131959427, new wrg1(2131959430), 2131959426);
                    }
                    zrg1Var = new zrg1(trg1Var3, urg1Var, yrg1Var, srg1Var);
                } else if (hsg1Var.equals(fsg1.d)) {
                    trg1 trg1Var4 = zC ? new trg1(2131959418, new vrg1(2131820785, i), 2131959421) : new trg1(2131959418, new wrg1(2131959410), 2131959420);
                    if (!zC) {
                        yrg1Var = new yrg1(2131959427, new wrg1(2131959434), 2131959426);
                    }
                    zrg1Var = new zrg1(trg1Var4, urg1Var, yrg1Var, srg1Var);
                } else if (hsg1Var.equals(esg1.d)) {
                    trg1 trg1Var5 = zC ? new trg1(2131959417, new vrg1(2131820784, i), 2131959421) : new trg1(2131959417, new wrg1(2131959409), 2131959420);
                    if (!zC) {
                        yrg1Var = new yrg1(2131959427, new wrg1(2131959433), 2131959426);
                    }
                    zrg1Var = new zrg1(trg1Var5, urg1Var, yrg1Var, srg1Var);
                } else if (hsg1Var.equals(dsg1.d)) {
                    trg1 trg1Var6 = zC ? new trg1(2131959416, new vrg1(2131820783, i), 2131959421) : new trg1(2131959416, new wrg1(2131959408), 2131959420);
                    if (!zC) {
                        yrg1Var = new yrg1(2131959427, new wrg1(2131959432), 2131959426);
                    }
                    zrg1Var = new zrg1(trg1Var6, urg1Var, yrg1Var, srg1Var);
                } else {
                    if (!hsg1Var.equals(csg1.d)) {
                        eg.o();
                        return null;
                    }
                    trg1 trg1Var7 = zC ? new trg1(2131959415, new vrg1(2131820782, i), 2131959421) : new trg1(2131959415, new wrg1(2131959407), 2131959420);
                    if (!zC) {
                        yrg1Var = new yrg1(2131959427, new wrg1(2131959431), 2131959426);
                    }
                    zrg1Var = new zrg1(trg1Var7, urg1Var, yrg1Var, srg1Var);
                }
                return new fhm0(jsg1.a, zrg1Var);
            case 8:
                ozg1 ozg1Var = (ozg1) obj2;
                return ozg1Var.a.a(ozg1Var.c ? f511.a : g511.a);
            case 9:
                ((Number) obj).intValue();
                return ((t9h1) ((s880) obj2).c).b();
            case 10:
                return new kcf1((wxl) obj2, (byte) 4);
            case 11:
                return new rxc0(((x1b) obj2).b);
            case 12:
                return new hcz0(-134217729, false, ((eh4) ((psy) obj2).t).k(), false);
            case 13:
                rmh1 rmh1Var = (rmh1) obj2;
                return new xkb1(new a1b1(d3p1.H(rmh1Var.a, rmh1Var.e, rmh1Var.b.a), rmh1Var, (byte) 21), (byte) 9);
            case 14:
                return new vm61(2131953014, 2131953013, 2131953016, new xx0((rm5) obj2, (lnm) null, (byte) 27), new um61(new sl11(6, (byte) 7), new n601(qmh1.Z0, (byte) 28), fft0.Z0));
            case 15:
                ((qtr) obj).b(new psm((pt) obj2, (lnm) null, (byte) 6));
                return rih1Var;
            case 16:
                z710.d((z710) ((dlg1) obj2).b, (String) obj, false, 6);
                return rih1Var;
            case 17:
                ((Number) obj).intValue();
                return ((sqk0) obj2).b();
            case 18:
                mvh1 mvh1Var = (mvh1) obj;
                avh1 avh1Var = (avh1) obj2;
                evh1 evh1Var = avh1Var.c;
                ResultReceiver resultReceiver = evh1Var.c;
                ixb ixbVar = ixb.c;
                if (resultReceiver != null) {
                    resultReceiver.send(-1, i7w0.e(iko1.y(mvh1Var, evh1Var.b)));
                    avh1Var.d.a(ixbVar);
                } else {
                    ptf1 ptf1Var = avh1Var.e;
                    ((nvh1) ptf1Var.b).a.l(mvh1Var);
                    ((los) ptf1Var.c).a(ixbVar);
                }
                return rih1Var;
            case 19:
                yxb0 yxb0Var = (yxb0) obj2;
                zwh1 zwh1Var = (zwh1) yxb0Var.c;
                FlowEventSources.Companion companion = FlowEventSources.a;
                q8n q8nVar = zwh1Var.b;
                mr20[] mr20VarArr = {new huz(twh1.a, (byte) 10), rqt0.u(new jha1(zwh1Var.a.d, (byte) 26))};
                companion.getClass();
                cas casVar = (a7m0) obj;
                casVar.b = new b(q8nVar, mr20VarArr);
                casVar.d = new xwh1(yxb0Var, b2);
                casVar.e = new xwh1(yxb0Var, b3);
                return rih1Var;
            case 20:
                return new rxc0(((bn1) obj2).b);
            case 21:
                u8i1 u8i1Var = (u8i1) obj2;
                if (u8i1Var.g && (str = u8i1Var.d.a) != null) {
                    new File(str).delete();
                }
                n9i1 n9i1Var = u8i1Var.f;
                i8h1 i8h1Var = n9i1Var.a;
                x6h1 x6h1VarC = n9i1Var.b.b.c();
                x6h1VarC.i.add(new a7h1("drag_handle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("drag", 1, map), new x7h1("ui_hide", 1, map), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 22:
                Bundle bundle = (Bundle) obj;
                bdi1 bdi1Var = (bdi1) obj2;
                zci1 zci1Var2 = bundle != null ? (zci1) jhc1.t(bundle, "user_info_model_key", zci1.class) : null;
                if (zci1Var2 == null) {
                    fdi1 fdi1Var = bdi1Var.b;
                    String str6 = fdi1Var.a;
                    String str7 = str6 == null ? "" : str6;
                    String str8 = fdi1Var.b;
                    if (str8 == null) {
                        str8 = "";
                    }
                    String str9 = fdi1Var.c;
                    if (str9 == null) {
                        str9 = "";
                    }
                    String str10 = fdi1Var.d;
                    zci1Var = new zci1(str7, new m6r((30 & 1) != 0 ? "" : str8, "", (Integer) null, (Integer) null, (Integer) null, (30 & 32) != 0 ? "" : str9, (30 & 64) != 0 ? "" : str10 != null ? str10 : ""), fdi1Var.e, fdi1Var.f, 1, fdi1Var.g, false, "", "", false);
                } else {
                    zci1Var = zci1Var2;
                }
                return zci1.a(zci1Var, (String) null, (m6r) null, 0, bdi1Var.e, (String) null, (String) null, false, 959);
            case 23:
                fni1 fni1Var = (fni1) obj2;
                int i2 = fni1Var.c.a;
                boolean zB = ((t65) fni1Var.f.a.get()).b();
                yg41 yg41Var = yg41.a;
                z6x z6xVar = z6x.a;
                w7x w7xVar = w7x.a;
                return new bni1(i2, z6xVar, (Boolean) null, (String) null, (b5i1) null, (m4o0) null, 0, w7xVar, w7xVar, b7x.a, yg41Var, zB, (String) null);
            case 24:
                axi1 axi1Var = (axi1) obj2;
                euq euqVar = axi1Var.b;
                t8r0 t8r0Var = new t8r0((tsq) ((goq) axi1Var.g.a.c).h, axi1Var.i);
                goq goqVar = (goq) euqVar.a.c;
                xfx xfxVar = (xfx) ((cxi1) goqVar.g).d.get();
                c8o.l(xfxVar);
                fuq fuqVar = (fuq) ((jly0) goqVar.b).get();
                cxi1 cxi1Var = (cxi1) goqVar.g;
                jqr jqrVar = (jqr) cxi1Var.j.get();
                c8o.l(jqrVar);
                gw70 gw70Var = (gw70) cxi1Var.b.get();
                c8o.l(gw70Var);
                afs afsVar = (afs) cxi1Var.m.get();
                c8o.l(afsVar);
                t8u0 t8u0Var = (t8u0) cxi1Var.n.get();
                c8o.l(t8u0Var);
                q7r0 q7r0Var = (q7r0) goqVar.f;
                cyp cypVarA = t8u0Var.a(q7r0Var.d.c.getLifecycle());
                b7r0 b7r0Var = (b7r0) cxi1Var.p.get();
                c8o.l(b7r0Var);
                t8u0 t8u0Var2 = (t8u0) cxi1Var.n.get();
                c8o.l(t8u0Var2);
                ruz ruzVarA = t8u0Var2.a(q7r0Var.d.c.getLifecycle()).a();
                Flowable flowable = (Flowable) cxi1Var.o.get();
                c8o.l(flowable);
                return new fsv0(xfxVar, fuqVar, jqrVar, gw70Var, afsVar, new u9u0(cypVarA, b7r0Var, ruzVarA, flowable), q7r0Var, t8r0Var, (byte) 1);
            case 25:
                h8a h8aVar = (h8a) obj;
                i8h1 i8h1Var2 = ((azi1) obj2).b;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-multi-user-plan-verification-plan-owner-message";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC2 = x6h1VarI.a().c();
                x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                lik1 lik1Var = nik1.e0;
                String str11 = lik1Var.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, map), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11 != null ? str11 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis()), (xj61) null);
                h8aVar.a.a();
                ((lzn0) h8aVar.b.get()).h(lik1Var.a);
                return rih1Var;
            case 26:
                ((qtr) obj).b(new bgb1((e4j1) obj2, (lnm) null, (byte) 8));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                eqc eqcVar = (eqc) obj;
                Float fValueOf = Float.valueOf(1.0f);
                Float fValueOf2 = Float.valueOf(0.8f);
                Float fValueOf3 = Float.valueOf(0.2f);
                Float fValueOf4 = Float.valueOf(0.0f);
                o6j1 o6j1Var = (o6j1) obj2;
                k6j1 k6j1Var = o6j1Var.k;
                if (k6j1Var != null) {
                    mmr0 mmr0VarM = k1p1.m(k6j1Var);
                    u7h u7hVar = (u7h) mmr0VarM.a;
                    long j = u7hVar.a;
                    u7h u7hVar2 = (u7h) mmr0VarM.b;
                    long j2 = u7hVar2.a;
                    mic0VarT = v9c.t(new mmr0[]{new mmr0(fValueOf4, u7hVar), new mmr0(fValueOf3, u7hVar), new mmr0(fValueOf2, u7hVar2), new mmr0(fValueOf, u7hVar2)}, 0.0f, Float.POSITIVE_INFINITY, 8);
                } else {
                    mic0VarT = null;
                }
                k6j1 k6j1Var2 = o6j1Var.j;
                if (k6j1Var2 != null) {
                    mmr0 mmr0VarM2 = k1p1.m(k6j1Var2);
                    u7h u7hVar3 = (u7h) mmr0VarM2.a;
                    long j3 = u7hVar3.a;
                    u7h u7hVar4 = (u7h) mmr0VarM2.b;
                    long j4 = u7hVar4.a;
                    mic0VarT2 = v9c.t(new mmr0[]{new mmr0(fValueOf4, u7hVar3), new mmr0(fValueOf3, u7hVar3), new mmr0(fValueOf2, u7hVar4), new mmr0(fValueOf, u7hVar4)}, 0.0f, Float.POSITIVE_INFINITY, 8);
                } else {
                    mic0VarT2 = null;
                }
                float fH = eqcVar.h() * 8.0f;
                float fH2 = eqcVar.h() * 3.0f;
                if (k6j1Var != null) {
                    mmr0 mmr0VarM3 = k1p1.m(k6j1Var);
                    long j5 = ((u7h) mmr0VarM3.a).a;
                    long j6 = ((u7h) mmr0VarM3.b).a;
                    int iG = z4p1.G(u7h.b(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14));
                    int iG2 = z4p1.G(u7h.b(j6, 0.2f, 0.0f, 0.0f, 0.0f, 14));
                    Paint paint2 = new Paint();
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)), new int[]{iG, iG, iG2, iG2}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.MIRROR));
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(eqcVar.h() * 20.0f);
                    paint2.setStrokeJoin(Paint.Join.ROUND);
                    paint2.setMaskFilter(new BlurMaskFilter(eqcVar.h() * 20.0f, BlurMaskFilter.Blur.NORMAL));
                    paint = paint2;
                } else {
                    paint = null;
                }
                return eqcVar.a(new c6j1(mic0VarT2, paint, mic0VarT, fH, fH2));
            case 28:
                qlb qlbVar = (qlb) obj2;
                return new x010(((nwt) qlbVar.e).a(), d3p1.F(qlbVar.b, (o3r) qlbVar.f, (n6j1) obj), new bu51(3, (lnm) null, (byte) 20), (byte) 1);
            default:
                ((x8j1) obj2).X.a(new mmr0[]{new mmr0("position", Long.valueOf(((Number) obj).longValue()))});
                return rih1Var;
        }
    }
}
