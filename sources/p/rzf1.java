package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.player.model.ContextTrack;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rzf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzf1(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 10;
        byte b3 = 9;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                iby ibyVar = (iby) obj3;
                szf1 szf1Var = (szf1) obj2;
                int iOrdinal = ((dxf1) obj).ordinal();
                if (iOrdinal == 0) {
                    ((rw31) szf1Var.W0.get()).a(ibyVar);
                } else if (iOrdinal == 2) {
                    ((s1z) szf1Var.V0.get()).c(ibyVar);
                }
                return rih1Var;
            case 1:
                lzn0 lzn0Var = ((i6c) obj2).a;
                String strConcat = ((String) obj3).concat(":dna");
                w6b1 w6b1VarA = f7b1.a(blc0.Kh);
                w6b1VarA.getClass();
                lzn0Var.a(w6b1VarA.c.get(0) + "?target=" + Uri.encode(strConcat), (tv80) obj, (Bundle) null);
                return rih1Var;
            case 2:
                return new m441(new qag1((kb61) obj, (String) obj2, (uu00) obj3, (lnm) null));
            case 3:
                vv31 vv31Var = (vv31) obj;
                tcd1 tcd1Var = (tcd1) obj3;
                ((mbg1) obj2).getClass();
                return new bye1(vv31Var.b, vv31Var.d, vv31Var.c, !(tcd1Var == tcd1.c));
            case 4:
                m801 m801Var = (m801) obj2;
                cas casVar = (a7m0) obj;
                casVar.a = new wcf1(m801Var, (sma1) obj3);
                casVar.d = q9f1.R0;
                casVar.e = q9f1.S0;
                casVar.b = m801Var;
                return rih1Var;
            case 5:
                ((y2s) obj).b(BehaviorProcessor.e0((ArrayList) obj2), new ibf1((teg1) obj3, (byte) 27));
                return rih1Var;
            case 6:
                l811 l811Var = (l811) obj2;
                if (l811Var.a) {
                    l811Var.a = false;
                } else {
                    bpb1 bpb1Var = ((hng1) obj3).a;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, jng1.a);
                }
                return rih1Var;
            case 7:
                return new m441(new hgo0((String) obj2, (rng1) obj3, (r4u0) obj, (lnm) null, (byte) 28));
            case 8:
                ayg1 ayg1Var = (ayg1) obj2;
                jfe jfeVar = (jfe) obj3;
                jfe jfeVar2 = ayg1Var.b;
                if (jfeVar2 != null) {
                    jfeVar2.H((Throwable) null);
                }
                ayg1Var.b = jfeVar;
                Float f = ayg1Var.a;
                if (f != null) {
                    jfeVar.l(new rj31("yNormalised", yoi1.o(f.floatValue(), 0.0f, 1.0f)));
                }
                return new zxg1(ayg1Var, jfeVar, (byte) 0);
            case 9:
                rtb0 rtb0Var = (rtb0) obj;
                v3h1 v3h1Var = (v3h1) obj2;
                utl utlVar = (utl) obj3;
                List list = utlVar.a;
                int iG = v3h1Var.g();
                Iterator it = utlVar.d.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    w0o1.w(rtb0Var, utlVar, v3h1Var, iG, i, iIntValue);
                    Object obj4 = list.get(iIntValue);
                    Object obj5 = utlVar.b.get(iIntValue);
                    xu30 xu30Var = (xu30) utlVar.c.get(iIntValue);
                    j2i j2iVar = new j2i(1027495245, new z3h1(v3h1Var, iIntValue, obj4, iG), true);
                    if (xu30Var != null) {
                        xu30Var.invoke(new ewl(rtb0Var, (epb0) null, 2), obj4, j2iVar);
                    } else {
                        rtb0Var.d(obj4, obj5, new j2i(125352009, new qje1(j2iVar, (byte) 1), true));
                    }
                    i = iIntValue + 1;
                }
                w0o1.w(rtb0Var, utlVar, v3h1Var, iG, i, list.size());
                return rih1Var;
            case 10:
                e261 e261Var = (e261) obj;
                if (((tbh1) obj2).e) {
                    b261.a(e261Var);
                    b261.A(e261Var, (String) obj3);
                }
                return rih1Var;
            case 11:
                egh1 egh1Var = (egh1) obj2;
                fn31.T(cto1.q(egh1Var.a), (o8n) null, 0, new nsf1((Object) egh1Var, (String) obj3, obj, (lnm) null, (byte) 9), 3);
                return rih1Var;
            case 12:
                dlg1 dlg1Var = (dlg1) obj3;
                if (((AtomicBoolean) obj2).compareAndSet(false, true)) {
                    qgo1.l((q8n) dlg1Var.c).execute(new seg1(dlg1Var, (byte) 1));
                }
                return rih1Var;
            case 13:
                dlg1 dlg1Var2 = (dlg1) obj2;
                fn31.T(cto1.q((dg30) dlg1Var2.b), (q8n) dlg1Var2.c, 0, new k6g1(dlg1Var2, (String) obj3, (lnm) null, (byte) 13), 2);
                return rih1Var;
            case 14:
                dlg1 dlg1Var3 = (dlg1) obj2;
                fn31.T(cto1.q((dg30) dlg1Var3.a), (o8n) null, 0, new vxg1(dlg1Var3, (String) obj3, (lnm) null, (byte) 4), 3);
                return rih1Var;
            case 15:
                iu30 iu30Var = (iu30) obj2;
                List<mmr0> list2 = (List) obj;
                fmh1 fmh1Var = (fmh1) obj3;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (mmr0 mmr0Var : list2) {
                    arrayList.add(new mmr0(new jh5(fmh1Var.b, mmr0Var.a), (k3r) mmr0Var.b));
                }
                iu30Var.invoke(arrayList);
                return rih1Var;
            case 16:
                if (((fzf1) obj) == fzf1.a) {
                    ((iu30) obj2).invoke(new m8z0(0, (ContextTrack) obj3));
                }
                return rih1Var;
            case 17:
                xmh1 xmh1Var = (xmh1) obj2;
                List list3 = xmh1Var.a;
                ((rtb0) obj).e(list3.size(), new vse1(list3, (byte) 8), new vse1(list3, b3), new j2i(2039820996, new d311(b2, xmh1Var, (wmh1) obj3, list3), true));
                return rih1Var;
            case 18:
                return new hp0(((los) ((suh1) obj2).f).c(new ceg1((iu30) obj3, (byte) 5)), (byte) 18);
            case 19:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hma1 hma1VarEdit = ((e680) obj2).a.edit();
                hma1VarEdit.a(e680.c, zBooleanValue);
                hma1VarEdit.g();
                n9i1 n9i1Var = (n9i1) obj3;
                i8h1 i8h1Var = n9i1Var.a;
                x6h1 x6h1VarC = n9i1Var.b.b.c();
                x6h1VarC.i.add(new a7h1("shake_detector_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 20:
                c380 c380Var = (c380) obj2;
                rtb0.b((rtb0) obj, c380Var.size(), new xr1(c380Var, (byte) 9), new j2i(566131473, new juy0(c380Var, (dlg1) obj3, (byte) 15), true), 4);
                return rih1Var;
            case 21:
                uoa uoaVar = (uoa) obj2;
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj3;
                uoaVar.d(videoSurfaceView);
                return new zxg1(uoaVar, videoSurfaceView, (byte) 1);
            case 22:
                cas casVar2 = (a7m0) obj;
                casVar2.a = zhi1.N0;
                fv0 fv0Var = (fv0) ((pt) obj3).i;
                daq daqVar = ((icq) obj2).a.b;
                casVar2.b = new sbj1(fv0Var, (mr20) daqVar.u5.get(), (q8n) daqVar.r2.get());
                return rih1Var;
            case 23:
                int iIntValue2 = ((Number) obj).intValue();
                ((iu30) obj2).invoke(new yjk1(iIntValue2));
                ((gdj1) ((pt) obj3).e).b(iIntValue2);
                return rih1Var;
            case 24:
                pt ptVar = (pt) obj3;
                uoa uoaVarA = woa.a((woa) obj2, ((lbj1) ptVar.g).a, (o2u0) obj, (w2k1) null, (kma) null, Collections.singletonList((fv0) ptVar.i), false, (bas) null, (sn10) null, 1004);
                uoaVarA.q(true);
                return uoaVarA;
            case 25:
                ek2 ek2Var = new ek2((ocj1) obj3, (byte) 22);
                iac0 iac0Var = (iac0) obj2;
                iac0Var.getLifecycle().a(ek2Var);
                return new zxg1(iac0Var, ek2Var, (byte) 2);
            case 26:
                ocj1 ocj1Var = (ocj1) obj2;
                taj1 taj1Var = (taj1) obj3;
                d1x.b(ocj1Var.e.a, 3, taj1Var, (Map) null, (String) null, 12);
                return new zxg1(ocj1Var, taj1Var, (byte) 3);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new qr80((((long) jch0.U(((Number) ((o95) obj2).e()).floatValue())) << 32) | (((long) jch0.U(((Number) ((o95) obj3).e()).floatValue())) & 4294967295L));
            case 28:
                ((qtr) obj).b(new bgb1((nwj) obj2, (bpb1) obj3, (lnm) null));
                return rih1Var;
            default:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                if (((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                    xtm0 xtm0Var = (xtm0) obj2;
                    xtm0Var.f = videoSurfaceView2;
                    videoSurfaceView2.setBufferingThrobberEnabled(false);
                    r091 r091Var = xtm0Var.e;
                    if (r091Var != null) {
                        r091Var.i(videoSurfaceView2);
                    }
                }
                return rih1Var;
        }
    }
}
