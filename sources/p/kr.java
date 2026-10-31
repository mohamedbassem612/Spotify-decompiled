package p;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kr extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        byte b2 = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                kr krVar = new kr((int) b2, (lnm) obj5, (byte) 0);
                krVar.b = (hr) obj;
                krVar.c = (gr) obj3;
                krVar.invokeSuspend(rih1Var);
                break;
            case 1:
                kr krVar2 = new kr((int) b2, (lnm) obj5, (byte) 1);
                krVar2.b = (px2) obj;
                krVar2.c = (lx2) obj3;
                krVar2.invokeSuspend(rih1Var);
                break;
            case 2:
                kr krVar3 = new kr(this.c, (lnm) obj5, (byte) 2);
                krVar3.b = (tqw) obj4;
                krVar3.invokeSuspend(rih1Var);
                break;
            case 3:
                kr krVar4 = new kr(this.c, (lnm) obj5, (byte) 3);
                krVar4.b = (o16) obj3;
                krVar4.invokeSuspend(rih1Var);
                break;
            case 4:
                kr krVar5 = new kr(this.c, (lnm) obj5, (byte) 4);
                krVar5.b = (am9) obj3;
                krVar5.invokeSuspend(rih1Var);
                break;
            case 5:
                kr krVar6 = new kr((br0) this.c, (lnm) obj5, b2);
                krVar6.b = (xm9) obj3;
                krVar6.invokeSuspend(rih1Var);
                break;
            case 6:
                kr krVar7 = new kr(this.c, (lnm) obj5, (byte) 6);
                krVar7.b = (sq9) obj3;
                krVar7.invokeSuspend(rih1Var);
                break;
            case 7:
                kr krVar8 = new kr(this.c, (lnm) obj5, (byte) 7);
                krVar8.b = (zr9) obj3;
                krVar8.invokeSuspend(rih1Var);
                break;
            case 8:
                kr krVar9 = new kr(this.c, (lnm) obj5, (byte) 8);
                krVar9.b = (qs9) obj3;
                krVar9.invokeSuspend(rih1Var);
                break;
            case 9:
                kr krVar10 = new kr(this.c, (lnm) obj5, (byte) 9);
                krVar10.b = (ogb) obj3;
                krVar10.invokeSuspend(rih1Var);
                break;
            case 10:
                kr krVar11 = new kr(this.c, (lnm) obj5, (byte) 10);
                krVar11.b = (zml) obj3;
                krVar11.invokeSuspend(rih1Var);
                break;
            case 11:
                kr krVar12 = new kr(this.c, (lnm) obj5, (byte) 11);
                krVar12.b = (cxm1) obj3;
                krVar12.invokeSuspend(rih1Var);
                break;
            case 12:
                kr krVar13 = new kr(this.c, (lnm) obj5, (byte) 12);
                krVar13.b = (zpt) obj3;
                krVar13.invokeSuspend(rih1Var);
                break;
            case 13:
                kr krVar14 = new kr(this.c, (lnm) obj5, (byte) 13);
                krVar14.b = (o7u) obj3;
                krVar14.invokeSuspend(rih1Var);
                break;
            case 14:
                kr krVar15 = new kr(this.c, (lnm) obj5, (byte) 14);
                krVar15.b = (z7x) obj3;
                krVar15.invokeSuspend(rih1Var);
                break;
            case 15:
                kr krVar16 = new kr(this.c, (lnm) obj5, (byte) 15);
                krVar16.b = (ce20) obj3;
                krVar16.invokeSuspend(rih1Var);
                break;
            case 16:
                kr krVar17 = new kr((int) b2, (lnm) obj5, (byte) 16);
                krVar17.b = (mg40) obj;
                krVar17.c = (lg40) obj3;
                krVar17.invokeSuspend(rih1Var);
                break;
            case 17:
                kr krVar18 = new kr((int) b2, (lnm) obj5, (byte) 17);
                krVar18.b = (wj50) obj;
                krVar18.c = (uj50) obj3;
                krVar18.invokeSuspend(rih1Var);
                break;
            case 18:
                kr krVar19 = new kr(this.c, (lnm) obj5, (byte) 18);
                krVar19.b = (km70) obj3;
                krVar19.invokeSuspend(rih1Var);
                break;
            case 19:
                kr krVar20 = new kr((int) b2, (lnm) obj5, (byte) 19);
                krVar20.b = (ky70) obj;
                krVar20.c = (ey70) obj3;
                krVar20.invokeSuspend(rih1Var);
                break;
            case 20:
                kr krVar21 = new kr(this.c, (lnm) obj5, (byte) 20);
                krVar21.b = (xb80) obj3;
                krVar21.invokeSuspend(rih1Var);
                break;
            case 21:
                kr krVar22 = new kr((int) b2, (lnm) obj5, (byte) 21);
                krVar22.b = (hl80) obj;
                krVar22.c = (fl80) obj3;
                krVar22.invokeSuspend(rih1Var);
                break;
            case 22:
                kr krVar23 = new kr(this.c, (lnm) obj5, (byte) 22);
                krVar23.b = (h990) obj3;
                krVar23.invokeSuspend(rih1Var);
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                kr krVar24 = new kr(this.c, (lnm) obj5, (byte) 23);
                krVar24.b = (bfb0) obj2;
                krVar24.invokeSuspend(rih1Var);
                break;
            case 24:
                kr krVar25 = new kr(this.c, (lnm) obj5, (byte) 24);
                krVar25.b = (pec0) obj3;
                krVar25.invokeSuspend(rih1Var);
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                kr krVar26 = new kr(this.c, (lnm) obj5, (byte) 25);
                krVar26.b = (yec0) obj3;
                krVar26.invokeSuspend(rih1Var);
                break;
            case 26:
                kr krVar27 = new kr(this.c, (lnm) obj5, (byte) 26);
                krVar27.b = (tqw) obj4;
                krVar27.invokeSuspend(rih1Var);
                break;
            case 27:
                kr krVar28 = new kr((int) b2, (lnm) obj5, (byte) 27);
                krVar28.b = (she0) obj;
                krVar28.c = (rhe0) obj3;
                krVar28.invokeSuspend(rih1Var);
                break;
            case 28:
                kr krVar29 = new kr(this.c, (lnm) obj5, (byte) 28);
                krVar29.b = (vfg0) obj3;
                krVar29.invokeSuspend(rih1Var);
                break;
            default:
                kr krVar30 = new kr(this.c, (lnm) obj5, (byte) 29);
                krVar30.b = (hoi0) obj3;
                krVar30.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hr hrVar = (hr) this.b;
                gr grVar = (gr) this.c;
                hm5.M(obj);
                if (grVar != null) {
                    hrVar.c.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                px2 px2Var = (px2) this.b;
                lx2 lx2Var = (lx2) this.c;
                hm5.M(obj);
                if (lx2Var == null) {
                    eg.o();
                    return null;
                }
                px2Var.b.m((Object) null, lx2Var.a);
                return rih1Var;
            case 2:
                tqw tqwVar = (tqw) this.b;
                hm5.M(obj);
                if (tqwVar != null) {
                    ug3 ug3Var = (ug3) this.c;
                    ((lzn0) ug3Var.c).a((String) ((idd1) ug3Var.e).getValue(), n3o1.y(tqwVar), (Bundle) null);
                }
                return rih1Var;
            case 3:
                u16 u16Var = (u16) this.c;
                o16 o16Var = (o16) this.b;
                hm5.M(obj);
                if (u890.j(o16Var, l16.a)) {
                    u16Var.b.invoke();
                    return rih1Var;
                }
                if (u890.j(o16Var, m16.a) || u890.j(o16Var, n16.a)) {
                    u16Var.c.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 4:
                ys9 ys9Var = ((gm9) this.c).c;
                zl9 zl9Var = (am9) this.b;
                hm5.M(obj);
                if (zl9Var instanceof zl9) {
                    ys9Var.b(zl9Var.a);
                    return rih1Var;
                }
                if (zl9Var instanceof yl9) {
                    return rih1Var;
                }
                if (u890.j(zl9Var, wl9.a)) {
                    ys9Var.b(0.0f);
                    return rih1Var;
                }
                if (u890.j(zl9Var, xl9.a)) {
                    ys9Var.b(1.0f);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                xm9 xm9Var = (xm9) this.b;
                hm5.M(obj);
                if (xm9Var != null) {
                    ((ys9) ((br0) this.c).c).c(xm9Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 6:
                sq9 sq9Var = (sq9) this.b;
                hm5.M(obj);
                rm9 rm9Var = (rm9) ((tm) this.c).c;
                long j = sq9Var.a;
                fdc fdcVar = rm9Var.a.d;
                if (fdcVar != null && !fdcVar.b) {
                    ((w590) fdcVar.d).s(j);
                }
                return rih1Var;
            case 7:
                ds9 ds9Var = (ds9) this.c;
                yr9 yr9Var = (zr9) this.b;
                hm5.M(obj);
                if (yr9Var instanceof yr9) {
                    ds9Var.i.invoke(Boolean.valueOf(yr9Var.a));
                    return rih1Var;
                }
                if (u890.j(yr9Var, xr9.a)) {
                    ds9Var.a.m(2);
                    return rih1Var;
                }
                if (yr9Var instanceof wr9) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                ys9 ys9Var2 = ((gm9) this.c).c;
                ps9 ps9Var = (qs9) this.b;
                hm5.M(obj);
                if (ps9Var instanceof ps9) {
                    ys9Var2.a(ps9Var.a);
                    return rih1Var;
                }
                if (ps9Var instanceof os9) {
                    return rih1Var;
                }
                if (u890.j(ps9Var, ms9.a)) {
                    ys9Var2.a(0.0f);
                    return rih1Var;
                }
                if (u890.j(ps9Var, ns9.a)) {
                    ys9Var2.a(1.0f);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                ogb ogbVar = (ogb) this.b;
                hm5.M(obj);
                if (!u890.j(ogbVar, ogb.a)) {
                    eg.o();
                    return null;
                }
                t2l t2lVar = ((ojr) ((ynb0) ((rwj) this.c).d).get()).a.c;
                Activity activity = t2lVar.a;
                PackageManager packageManager = t2lVar.b;
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.BLUETOOTH_SETTINGS");
                    if (packageManager.resolveActivity(intent, 0) != null) {
                        activity.startActivity(intent);
                    } else {
                        n57.s("Failed to open bluetooth settings");
                        Intent intent2 = new Intent();
                        intent2.setAction("android.settings.SETTINGS");
                        if (packageManager.resolveActivity(intent2, 0) != null) {
                            activity.startActivity(intent2);
                        } else {
                            n57.s("Failed to open settings");
                        }
                    }
                    return rih1Var;
                } catch (SecurityException e) {
                    n57.t("Failed to open bluetooth settings", e);
                    return rih1Var;
                }
            case 10:
                zml zmlVar = (zml) this.b;
                hm5.M(obj);
                if (!u890.j(zmlVar, zml.a)) {
                    eg.o();
                    return null;
                }
                wpr wprVar = (wpr) ((spr) this.c).g.getValue();
                faa0 faa0Var = wprVar.c;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                gh91 gh91Var = wprVar.d;
                if (gh91Var == null) {
                    return rih1Var;
                }
                gh91Var.h.invoke(kub1.t);
                return rih1Var;
            case 11:
                x1t x1tVar = (x1t) this.c;
                bpb1 bpb1Var = x1tVar.f;
                cxm1 cxm1Var = (cxm1) this.b;
                hm5.M(obj);
                if (cxm1Var == null) {
                    eg.o();
                    return null;
                }
                if (((Boolean) bpb1Var.getValue()).booleanValue() && x1tVar.c.b) {
                    x1tVar.d.a(new y231(pxm1.a));
                    return rih1Var;
                }
                Boolean boolValueOf = Boolean.valueOf(!((Boolean) bpb1Var.getValue()).booleanValue());
                bpb1Var.getClass();
                bpb1Var.m((Object) null, boolValueOf);
                return rih1Var;
            case 12:
                zpt zptVar = (zpt) this.b;
                hm5.M(obj);
                if (u890.j(zptVar, zpt.a)) {
                    ((cmr) ((ynb0) ((ldo) this.c).c).get()).a.l();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 13:
                o7u o7uVar = (o7u) this.b;
                hm5.M(obj);
                if (o7uVar == null) {
                    eg.o();
                    return null;
                }
                bpb1 bpb1Var2 = (bpb1) ((tm) this.c).e;
                bpb1Var2.m((Object) null, Boolean.valueOf(!((Boolean) bpb1Var2.getValue()).booleanValue()));
                return rih1Var;
            case 14:
                z7x z7xVar = (z7x) this.b;
                hm5.M(obj);
                if (z7xVar != null) {
                    ((bpb1) ((u6x) this.c).b).m((Object) null, Boolean.FALSE);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 15:
                ve20 ve20Var = (ve20) ((br0) this.c).c;
                ae20 ae20Var = (ce20) this.b;
                hm5.M(obj);
                if (ae20Var instanceof zd20) {
                    ve20Var.b((String) null);
                    return rih1Var;
                }
                if (ae20Var instanceof ae20) {
                    ve20Var.b(ae20Var.a.a);
                    return rih1Var;
                }
                if (u890.j(ae20Var, be20.a)) {
                    ve20Var.b((String) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                mg40 mg40Var = (mg40) this.b;
                lg40 lg40Var = (lg40) this.c;
                hm5.M(obj);
                if (!u890.j(lg40Var, lg40.a)) {
                    eg.o();
                    return null;
                }
                if (mg40Var.b) {
                    return rih1Var;
                }
                mg40Var.c.invoke();
                return rih1Var;
            case 17:
                wj50 wj50Var = (wj50) this.b;
                uj50 uj50Var = (uj50) this.c;
                hm5.M(obj);
                if (uj50Var != null) {
                    wj50Var.b.invoke(uj50Var.a, uj50Var.b);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 18:
                tm tmVar = (tm) this.c;
                km70 km70Var = (km70) this.b;
                hm5.M(obj);
                if (!u890.j(km70Var, km70.a)) {
                    eg.o();
                    return null;
                }
                z740 z740Var = ((ea6) ((da6) tmVar.d).b.a.getValue()).l;
                if (z740Var != null) {
                    x1i1.a((x1i1) tmVar.e, z740Var, 6);
                    return rih1Var;
                }
                a1r0.j((a1r0) tmVar.c, tmVar.h(), (String) null, (Bundle) null, false, 14);
                return rih1Var;
            case 19:
                ky70 ky70Var = (ky70) this.b;
                ey70 ey70Var = (ey70) this.c;
                hm5.M(obj);
                if (ey70Var != null) {
                    ky70Var.f.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 20:
                xb80 xb80Var = (xb80) this.b;
                hm5.M(obj);
                ((e111) this.c).invoke(xb80Var);
                return rih1Var;
            case 21:
                hl80 hl80Var = (hl80) this.b;
                fl80 fl80Var = (fl80) this.c;
                hm5.M(obj);
                if (u890.j(fl80Var, dl80.a)) {
                    hl80Var.b.invoke(hl80Var.a.getEntityUri());
                    return rih1Var;
                }
                if (u890.j(fl80Var, el80.a)) {
                    hl80Var.c.invoke(hl80Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                h990 h990Var = (h990) this.b;
                hm5.M(obj);
                if (h990Var != null) {
                    ((r990) this.c).a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                bfb0 bfb0Var = (bfb0) this.b;
                hm5.M(obj);
                ffb0 ffb0Var = (ffb0) ((ng20) this.c).b;
                boolean z = !bfb0Var.a;
                hma1 hma1VarEdit = ffb0Var.a.edit();
                hma1VarEdit.a(gfb0.b(), z);
                hma1VarEdit.h();
                ffb0Var.c.l((Object) null);
                return rih1Var;
            case 24:
                et90 et90Var = (et90) this.c;
                u9c0 u9c0Var = (u9c0) et90Var.c;
                pec0 pec0Var = (pec0) this.b;
                hm5.M(obj);
                int iOrdinal = pec0Var.ordinal();
                if (iOrdinal == 0) {
                    fn31.T(u9c0Var, (o8n) null, 0, new sec0(et90Var, (lnm) null, (byte) 0), 3);
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    fn31.T(u9c0Var, (o8n) null, 0, new sec0(et90Var, (lnm) null, (byte) 1), 3);
                    return rih1Var;
                }
                eg.o();
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                yec0 yec0Var = (yec0) this.b;
                hm5.M(obj);
                int iOrdinal2 = yec0Var.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    ((dfc0) ((et90) this.c).d).invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 26:
                tqw tqwVar2 = (tqw) this.b;
                hm5.M(obj);
                ((lzn0) ((yxb0) this.c).c).a("spotify:collection:your-episodes:settings", cvl1.d(tqwVar2), (Bundle) null);
                return rih1Var;
            case 27:
                she0 she0Var = (she0) this.b;
                rhe0 rhe0Var = (rhe0) this.c;
                hm5.M(obj);
                if (u890.j(rhe0Var, rhe0.a)) {
                    she0Var.b.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 28:
                vfg0 vfg0Var = (vfg0) this.b;
                hm5.M(obj);
                if (vfg0Var != null) {
                    ((czr0) ((qj0) this.c).e).c.a(rih1Var);
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                iu30 iu30Var = ((koi0) this.c).c;
                hoi0 hoi0Var = (hoi0) this.b;
                hm5.M(obj);
                if (hoi0Var instanceof goi0) {
                    iu30Var.invoke(new toi0(((goi0) hoi0Var).a));
                    return rih1Var;
                }
                if (hoi0Var instanceof foi0) {
                    iu30Var.invoke(poi0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
