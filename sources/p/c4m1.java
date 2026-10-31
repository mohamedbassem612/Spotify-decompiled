package p;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobius.Connectable;
import com.spotify.xrprojected.ui.XrProjectedActivity;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c4m1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4m1(wvm1 wvm1Var, cir0 cir0Var) {
        super(1);
        this.a = (byte) 17;
        this.b = wvm1Var;
    }

    public final Object invoke(Object obj) {
        zuc0 zuc0Var;
        int i;
        byte b = this.a;
        gcl1 gcl1Var = ecl1.a;
        dcl1 dcl1Var = dcl1.a;
        byte b2 = 0;
        b7x b7xVar = null;
        byte b3 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                d4m1 d4m1Var = (d4m1) obj;
                List listX = d4m1Var.s;
                ws61 ws61Var = (ws61) obj2;
                if (ws61Var == ws61.b && d4m1Var.d != ws61Var) {
                    listX = w6d1.x(listX, d4m1Var.t);
                }
                return d4m1.a(d4m1Var, ws61Var, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, listX, null, null, false, null, false, false, false, false, false, false, false, null, -262153);
            case 1:
                return d4m1.a((d4m1) obj, null, null, false, 0, 0, 0, 0, 0, false, null, 0, 0, 0, false, null, null, null, null, false, (gzl1) obj2, false, false, false, false, false, false, false, null, -4194305);
            case 2:
                ((qtr) obj).b(new bgb1((vbe1) obj2, (lnm) null, (byte) 12));
                return rih1Var;
            case 3:
                return new rxc0(((k5m1) obj2).a);
            case 4:
                ((qtr) obj).b(new wm0((suh1) obj2, (lnm) null, (byte) 4));
                return rih1Var;
            case 5:
                return new rxc0(((w5m1) obj2).a);
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hcl1 hcl1Var = (hcl1) ((sh40) obj2).c;
                if (zBooleanValue) {
                    gcl1Var = dcl1Var;
                }
                hcl1Var.a(gcl1Var);
                return rih1Var;
            case 7:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                hcl1 hcl1Var2 = ((lbm1) obj2).h;
                if (zBooleanValue2) {
                    gcl1Var = dcl1Var;
                }
                hcl1Var2.a(gcl1Var);
                return rih1Var;
            case 8:
                b261.n((e261) obj, ((h7e) obj2).a);
                return rih1Var;
            case 9:
                j7e0 j7e0Var = ((hwq) obj).g;
                j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
                String str = j7e0Var2 != null ? j7e0Var2.b : null;
                String str2 = str != null ? str : "";
                String str3 = ((bvm) obj2).b;
                if (j7e0Var2 != null && (zuc0Var = j7e0Var2.a) != null) {
                    b7xVar = zuc0Var.g;
                }
                if (b7xVar == null) {
                    b7xVar = b7x.a;
                }
                return new a511(str2, str3, b7xVar);
            case 10:
                eon0 eon0Var = (eon0) obj;
                XrProjectedActivity xrProjectedActivity = (XrProjectedActivity) obj2;
                j2i j2iVar = new j2i(-1049623018, new nmm1(xrProjectedActivity, b2), true);
                rzn0 rzn0Var = eon0Var.h;
                rzn0Var.getClass();
                uvj uvjVarB = rzn0Var.b(rzn1.u(uvj.class));
                jd11 jd11Var = rc11.a;
                vvj vvjVar = new vvj(uvjVarB, jd11Var.b(kkm1.class), j2iVar);
                ArrayList arrayList = eon0Var.k;
                arrayList.add(vvjVar.a());
                arrayList.add(new vvj(rzn0Var.b(rzn1.u(uvj.class)), jd11Var.b(jkm1.class), new j2i(-1064923457, new nmm1(xrProjectedActivity, b3), true)).a());
                return rih1Var;
            case 11:
                cm0 cm0Var = (cm0) obj2;
                return hu20.e(((r4h1) cm0Var.c).b(), new afb1((lnm) null, cm0Var, (byte) 21));
            case 12:
                e261 e261Var = (e261) obj;
                String str4 = ((lom1) obj2).b;
                b261.n(e261Var, str4 != null ? str4 : "");
                return rih1Var;
            case 13:
                stm1 stm1Var = (stm1) obj2;
                bhy bhyVar = (bhy) ((mhy) obj);
                ley leyVar = stm1Var.b;
                ttm1 ttm1Var = bhyVar.b;
                boolean zP = jo31.p(ttm1Var);
                nb10 nb10Var = ttm1Var.g;
                b7xVar = nb10Var instanceof tlb ? (tlb) nb10Var : null;
                String str5 = ttm1Var.a;
                aey aeyVar = ttm1Var.e;
                fgx0 fgx0Var = (fgx0) stm1Var.d.invoke(bhyVar);
                boolean zP2 = hqn1.p(ttm1Var);
                String strD = leyVar.d(ttm1Var, zP);
                Set setB = leyVar.b(ttm1Var, zP);
                return new zdy(str5, strD, stm1Var.c.a(ttm1Var, zP), aeyVar, fgx0Var, false, null, ttm1Var, zP, false, b7xVar == null || !((i = b7xVar.b) == 3 || i == 2), zP, setB, null, ley.c(ttm1Var), zP2);
            case 14:
                bhy bhyVar2 = (bhy) ((mhy) obj);
                stm1 stm1Var2 = (stm1) obj2;
                ttm1 ttm1Var2 = bhyVar2.b;
                boolean zP3 = jo31.p(ttm1Var2);
                String str6 = ttm1Var2.a;
                boolean z = ttm1Var2.c;
                ley leyVar2 = stm1Var2.b;
                String strD2 = leyVar2.d(ttm1Var2, zP3);
                Set setB2 = leyVar2.b(ttm1Var2, zP3);
                o17 o17VarA = stm1Var2.c.a(ttm1Var2, zP3);
                n6r n6rVarC = ley.c(ttm1Var2);
                aey aeyVar2 = ttm1Var2.e;
                aey aeyVar3 = aey.N0;
                gi giVar = fi.a;
                if (aeyVar2 != aeyVar3) {
                    if (bhyVar2.c) {
                        giVar = di.a;
                    } else {
                        if (u890.j(ttm1.i.get(aeyVar2), ho6.class)) {
                            nb10 nb10Var2 = ttm1Var2.g;
                            if (nb10Var2 == null) {
                                bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.ArtistExtraInfo");
                                return null;
                            }
                            b7xVar = (ho6) nb10Var2;
                        }
                        if (b7xVar != null && !b7xVar.a) {
                            giVar = ei.a;
                        } else if (leyVar2.d.c()) {
                            giVar = ci.a;
                        }
                    }
                }
                gi giVar2 = giVar;
                return new lpy(str6, strD2, o17VarA, z, ttm1Var2.e, bhyVar2.f && !zP3, (fgx0) stm1Var2.d.invoke(bhyVar2), ttm1Var2, zP3, setB2, n6rVarC, giVar2, leyVar2.e.a(ttm1Var2), zP3, hqn1.p(ttm1Var2));
            case 15:
                return new e6t0(((wum1) obj2).b.a());
            case 16:
                return new l6t0(((wum1) obj2).b.a());
            case 17:
                wvm1 wvm1Var = (wvm1) obj2;
                v1t v1tVar = wvm1Var.c;
                v1tVar.getClass();
                return new q1t(wvm1Var.b, new s1t(don1.p((Context) obj), v1tVar.a, v1tVar.d, v1tVar.f, new r1k(new Connectable[]{v1tVar.c, v1tVar.b, new x2y(v1tVar.e, t1t.b, u1t.a, (byte) 1)}, (byte) 0), v1tVar.g), (whp) ((ovq) wvm1Var.d.a.c).V.get());
            case 18:
                ((qzm1) obj2).k.f(new dwn0((String) obj, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1Var;
            case 19:
                return yoi1.g(((BehaviorSubject) obj2).map(new qeh1((dn41) obj, (byte) 15)));
            default:
                m3n1 m3n1Var = (m3n1) obj2;
                klm klmVar = ((wn41) obj).a;
                return new b4n1(klmVar.b("SharedPreferencesAnrWatchdogConfigurationStore", new mcp0(new mdp0(0, m3n1Var.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15), (byte) 15)), klmVar.b("StallReportQueueService", wso0.Y), klmVar.b("AppBootstrapService", new pap0(new rdp0(m3n1Var, (byte) 10), new rdp0(m3n1Var, (byte) 11), new rdp0(m3n1Var, (byte) 12), new rdp0(m3n1Var, (byte) 13), new rdp0(m3n1Var, (byte) 14), new rdp0(m3n1Var, (byte) 15), new rdp0(m3n1Var, (byte) 16), new rdp0(m3n1Var, (byte) 17), new rdp0(m3n1Var, (byte) 18), new rdp0(m3n1Var, (byte) 0), new rdp0(m3n1Var, (byte) 1), new rdp0(m3n1Var, (byte) 2), new rdp0(m3n1Var, (byte) 3), new rdp0(m3n1Var, (byte) 4), new rdp0(m3n1Var, (byte) 5), new rdp0(m3n1Var, (byte) 6), new rdp0(m3n1Var, (byte) 7), new rdp0(m3n1Var, (byte) 8), new rdp0(m3n1Var, (byte) 9))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4m1(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
