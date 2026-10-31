package p;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.spotify.coremediarenderer.bridge.CmrVideoQualityCallback;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pid extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pid(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new pid((qid) this.b, (ven0) obj2, lnmVar, (byte) 0);
            case 1:
                pid pidVar = new pid((i4e) obj2, lnmVar, (byte) 1);
                pidVar.b = obj;
                return pidVar;
            case 2:
                return new pid((g6e) this.b, (l6e) obj2, lnmVar, (byte) 2);
            case 3:
                return new pid((ppe) this.b, (k6a1) obj2, lnmVar, (byte) 3);
            case 4:
                return new pid((qse) this.b, (String) obj2, lnmVar, (byte) 4);
            case 5:
                return new pid((tbr0) this.b, (aue) obj2, lnmVar, (byte) 5);
            case 6:
                pid pidVar2 = new pid((s0f) obj2, lnmVar, (byte) 6);
                pidVar2.b = obj;
                return pidVar2;
            case 7:
                pid pidVar3 = new pid((d18) obj2, lnmVar, (byte) 7);
                pidVar3.b = obj;
                return pidVar3;
            case 8:
                return new pid((i430) this.b, (ven0) obj2, lnmVar, (byte) 8);
            case 9:
                return new pid((hpf) this.b, (lpf) obj2, lnmVar, (byte) 9);
            case 10:
                return new pid((ttf) this.b, (quf) obj2, lnmVar, (byte) 10);
            case 11:
                return new pid((fta) this.b, (b1g) obj2, lnmVar, (byte) 11);
            case 12:
                return new pid((c1g) this.b, (fta) obj2, lnmVar, (byte) 12);
            case 13:
                return new pid((kag) this.b, (Bundle) obj2, lnmVar, (byte) 13);
            case 14:
                return new pid((ajq0) this.b, (Function0) obj2, lnmVar, (byte) 14);
            case 15:
                pid pidVar4 = new pid((mag) obj2, lnmVar, (byte) 15);
                pidVar4.b = obj;
                return pidVar4;
            case 16:
                return new pid((toj0) this.b, (tv80) obj2, lnmVar, (byte) 16);
            case 17:
                return new pid((i8h1) this.b, (wwk0) obj2, lnmVar, (byte) 17);
            case 18:
                return new pid((qng) this.b, (nng) obj2, lnmVar, (byte) 18);
            case 19:
                return new pid((lrg) this.b, (g8u) obj2, lnmVar, (byte) 19);
            case 20:
                return new pid((zwg) this.b, (cir0) obj2, lnmVar, (byte) 20);
            case 21:
                return new pid((tsg) this.b, (Function0) obj2, lnmVar, (byte) 21);
            case 22:
                return new pid((CmrVideoQualityCallback) this.b, (String) obj2, lnmVar, (byte) 22);
            case 23:
                return new pid((xyg) this.b, (ven0) obj2, lnmVar, (byte) 23);
            case 24:
                return new pid((oq70) this.b, (yqi1) obj2, lnmVar, (byte) 24);
            case 25:
                return new pid((zfh) this.b, (y7e1) obj2, lnmVar, (byte) 25);
            case 26:
                return new pid((mhh) this.b, (ven0) obj2, lnmVar, (byte) 26);
            case 27:
                return new pid((cce) this.b, (ven0) obj2, lnmVar, (byte) 27);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new pid((iu30) this.b, (ebd) obj2, lnmVar, (byte) 28);
            default:
                return new pid((ly70) this.b, (iu30) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((cf61) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((u3f) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((jld0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                return create((trj1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        b6t b6tVar;
        Object[] objArr;
        String str;
        y8l1 y8l1Var;
        boolean z = false;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                ((ven0) this.c).setValue(UUID.randomUUID().toString());
                return rih1.a;
            case 1:
                m4e m4eVar = m4e.V0;
                ilr ilrVar = ((i4e) this.c).c;
                cf61 cf61Var = (cf61) this.b;
                hm5.M(obj);
                Objects.toString(cf61Var);
                if (cf61Var instanceof ye61) {
                    ilrVar.b(m4e.d);
                } else if (cf61Var instanceof xe61) {
                    ilrVar.b(m4e.e);
                } else if (cf61Var instanceof me61) {
                    ilrVar.b(m4e.f);
                } else if (cf61Var instanceof bf61) {
                    ilrVar.b(m4e.U0);
                    ilrVar.a();
                } else if (cf61Var instanceof af61) {
                    ilrVar.b(m4eVar);
                    ilrVar.a();
                } else if (cf61Var instanceof we61) {
                    ilrVar.b(m4e.W0);
                    ilrVar.a();
                } else if (cf61Var instanceof ne61) {
                    ilrVar.b(m4eVar);
                    ilrVar.a();
                }
                return rih1.a;
            case 2:
                hm5.M(obj);
                ((lzn0) ((g6e) this.b).a.get()).f(new dwn0(((l6e) this.c).a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1.a;
            case 3:
                hm5.M(obj);
                if ((((ppe) this.b).a instanceof gre) && (b6tVar = (k6a1) this.c) != null) {
                    b6tVar.a();
                }
                return rih1.a;
            case 4:
                hm5.M(obj);
                qse qseVar = (qse) this.b;
                aab1 aab1Var = (aab1) qseVar.c.invoke();
                if (aab1Var != null) {
                    aab1Var.d(new rse((String) this.c), qseVar.d);
                }
                return rih1.a;
            case 5:
                hm5.M(obj);
                ((tbr0) this.b).a(new y231(new mve(new kve(((aue) this.c).a))));
                return rih1.a;
            case 6:
                u3f u3fVar = (u3f) this.b;
                hm5.M(obj);
                ((s0f) this.c).g.invoke(Boolean.valueOf((u3fVar.b.isEmpty() && u3fVar.a == null) ? false : true));
                return rih1.a;
            case 7:
                jld0 jld0Var = (jld0) this.b;
                hm5.M(obj);
                ((d18) this.c).a = jld0Var.b;
                return rih1.a;
            case 8:
                hm5.M(obj);
                ((ven0) this.c).setValue(Boolean.valueOf(((i430) this.b).c));
                return rih1.a;
            case 9:
                lpf lpfVar = (lpf) this.c;
                hm5.M(obj);
                ((hpf) this.b).getClass();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953298});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131953298, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                kt91 kt91Var = lpfVar.b;
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                } else {
                    kt91Var.o(er91Var);
                }
                return rih1.a;
            case 10:
                hm5.M(obj);
                qtf qtfVar = (qtf) ((ttf) this.b).f.getValue();
                yuf yufVar = ((quf) this.c).c;
                i8h1 i8h1Var = qtfVar.a;
                brl0 brl0Var = qtfVar.b;
                if (yufVar.equals(vuf.a)) {
                    objArr = 3;
                } else if (yufVar.equals(xuf.a)) {
                    objArr = 4;
                } else {
                    if (!yufVar.equals(wuf.a)) {
                        eg.o();
                        return null;
                    }
                    objArr = 2;
                }
                x6h1 x6h1VarC = brl0Var.b.c();
                if (objArr == 2) {
                    str = "error";
                } else if (objArr == 3) {
                    str = "prompt";
                } else {
                    if (objArr != 4) {
                        throw null;
                    }
                    str = "waiting";
                }
                x6h1VarC.i.add(new a7h1("check_in_state", (String) null, (Integer) null, (String) null, str));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = brl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1.a;
            case 11:
                hm5.M(obj);
                ajq0 ajq0Var = (ajq0) ((fta) this.b).c;
                b1g b1gVar = (b1g) this.c;
                ajq0Var.k(b1gVar.a, b1gVar.b, b1gVar.c);
                return rih1.a;
            case 12:
                hm5.M(obj);
                kik1 kik1Var = nik1.o0;
                c1g c1gVar = (c1g) this.b;
                ((lzn0) ((fta) this.c).e).f(new dwn0(c1gVar.b.a(cfm0.i("spotify:internal:parental-control:login-current-device:", c1gVar.a, kik1Var)), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1.a;
            case 13:
                hm5.M(obj);
                a1r0.m(((kag) this.b).f, "spotify:internal:permissions-location-request", (tv80) null, (Bundle) this.c, 8);
                return rih1.a;
            case 14:
                hm5.M(obj);
                if (((Boolean) ((lwe) ((ajq0) this.b).c).invoke()).booleanValue()) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 15:
                trj1 trj1Var = (trj1) this.b;
                hm5.M(obj);
                if (trj1Var.b && !trj1Var.c && ((mag) this.c).b(trj1Var)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                hm5.M(obj);
                e7p0.e((e7p0) ((toj0) this.b).d, (tv80) this.c);
                return rih1.a;
            case 17:
                hm5.M(obj);
                ((i8h1) this.b).f(((wwk0) this.c).e(), (Set) null);
                return rih1.a;
            case 18:
                hm5.M(obj);
                y7e1 y7e1Var = ((qng) this.b).e;
                if (y7e1Var.d().d.length() == 0) {
                    String str2 = ((nng) this.c).e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c4p1.E(str2, y7e1Var);
                }
                return rih1.a;
            case 19:
                hm5.M(obj);
                lrg lrgVar = (lrg) this.b;
                g8u g8uVar = (g8u) this.c;
                if (g8uVar.b) {
                    zrj1 zrj1Var = lrgVar.g;
                    hma1 hma1VarEdit = ((dma1) zrj1Var.b).edit();
                    hma1VarEdit.f((bma1) zrj1Var.d);
                    hma1VarEdit.g();
                }
                lrgVar.e.e();
                abu abuVar = g8uVar.a;
                xau xauVar = abuVar instanceof xau ? (xau) abuVar : null;
                if (xauVar != null && (y8l1Var = (y8l1) lrgVar.t.get(xauVar.a)) != null) {
                    y8l1Var.a();
                }
                if (lrgVar.X.d() && !lrgVar.Y && !xoi1.b(lrgVar.Z)) {
                    abu abuVar2 = lrgVar.i;
                    xau xauVar2 = abuVar2 instanceof xau ? (xau) abuVar2 : null;
                    if (xauVar2 != null && u890.j(xauVar2.f, nik1.p1.a)) {
                        lrgVar.f.c();
                    }
                }
                return rih1.a;
            case 20:
                hm5.M(obj);
                zwg zwgVar = (zwg) this.b;
                a1r0 a1r0Var = (a1r0) zwgVar.c;
                if (((dqn) zwgVar.d).a) {
                    ((cir0) this.c).c().a(l231.a);
                } else if (a1r0Var.h((Activity) zwgVar.a)) {
                    a1r0Var.l();
                } else {
                    ((lzn0) zwgVar.b).e();
                }
                return rih1.a;
            case 21:
                hm5.M(obj);
                if (!((tsg) this.b).f) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 22:
                hm5.M(obj);
                CmrVideoQualityCallback cmrVideoQualityCallback = (CmrVideoQualityCallback) this.b;
                otg otgVar = cmrVideoQualityCallback.a;
                String str3 = (String) this.c;
                String str4 = str3.length() > 0 ? str3 : null;
                synchronized (otgVar.a) {
                    if (otgVar.b == cmrVideoQualityCallback) {
                        otgVar.c.l(str4);
                    }
                    break;
                }
                return rih1.a;
            case 23:
                hm5.M(obj);
                ((ven0) this.c).setValue((xyg) this.b);
                return rih1.a;
            case 24:
                hm5.M(obj);
                Bitmap bitmapQ = x2p1.q((oq70) this.b);
                yqi1 yqi1Var = (yqi1) this.c;
                tfp0 tfp0Var = new tfp0(bitmapQ);
                ArrayList arrayList = (ArrayList) tfp0Var.e;
                if (yqi1Var != null) {
                    arrayList.clear();
                    arrayList.add(yqi1Var);
                }
                return tfp0Var.a();
            case 25:
                hm5.M(obj);
                String str5 = ((zfh) this.b).c;
                if (str5 != null && !ihc1.y0(str5)) {
                    y7e1 y7e1Var2 = (y7e1) this.c;
                    h4e1 h4e1VarH = y7e1Var2.h();
                    try {
                        h4e1VarH.k(0, h4e1VarH.c.length(), str5);
                        y7e1Var2.a(h4e1VarH);
                    } finally {
                        y7e1Var2.c();
                    }
                }
                return rih1.a;
            case 26:
                hm5.M(obj);
                return rih1.a;
            case 27:
                hm5.M(obj);
                bcl1 bcl1Var = (bcl1) ((cce) this.b).d;
                ven0 ven0Var = (ven0) this.c;
                bcl1Var.g((t480) ven0Var.getValue());
                ven0Var.setValue((Object) null);
                return rih1.a;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                hm5.M(obj);
                iu30 iu30Var = (iu30) this.b;
                bbd bbdVar = (bbd) ((ebd) this.c);
                iu30Var.invoke(new rad(bbdVar.b, bbdVar.a));
                return rih1.a;
            default:
                hm5.M(obj);
                if (!(((ly70) this.b).c instanceof hy70)) {
                    ((iu30) this.c).invoke(ey70.a);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pid(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
