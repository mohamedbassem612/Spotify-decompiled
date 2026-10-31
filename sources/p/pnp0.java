package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.spotify.home.evopage.structureapi.DismissedEntity;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.Restrictions;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pnp0 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnp0(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.d = obj;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        byte b2 = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                pnp0 pnp0Var = new pnp0((op20) this.d, (lnm) obj5, (byte) 0);
                pnp0Var.b = (nnp0) obj;
                pnp0Var.c = (lnp0) obj3;
                pnp0Var.invokeSuspend(rih1Var);
                break;
            case 1:
                pnp0 pnp0Var2 = new pnp0((res) this.d, (lnm) obj5, (byte) 1);
                pnp0Var2.b = (rop0) obj3;
                pnp0Var2.c = (tqw) obj4;
                pnp0Var2.invokeSuspend(rih1Var);
                break;
            case 2:
                pnp0 pnp0Var3 = new pnp0((n0o) this.d, (lnm) obj5, (byte) 2);
                pnp0Var3.b = (a9q0) obj3;
                pnp0Var3.c = (tqw) obj4;
                pnp0Var3.invokeSuspend(rih1Var);
                break;
            case 3:
                pnp0 pnp0Var4 = new pnp0((ug3) this.d, (lnm) obj5, (byte) 3);
                pnp0Var4.b = (dmr0) obj2;
                pnp0Var4.c = (tqw) obj4;
                pnp0Var4.invokeSuspend(rih1Var);
                break;
            case 4:
                pnp0 pnp0Var5 = new pnp0((r8s) this.d, (lnm) obj5, (byte) 4);
                pnp0Var5.b = (e0s0) obj2;
                pnp0Var5.c = (c0s0) obj3;
                pnp0Var5.invokeSuspend(rih1Var);
                break;
            case 5:
                pnp0 pnp0Var6 = new pnp0((ng20) this.d, (lnm) obj5, b2);
                pnp0Var6.b = (f7s0) obj3;
                pnp0Var6.c = (tqw) obj4;
                pnp0Var6.invokeSuspend(rih1Var);
                break;
            case 6:
                pnp0 pnp0Var7 = new pnp0((yup0) this.d, (lnm) obj5, (byte) 6);
                pnp0Var7.b = (pms0) obj2;
                pnp0Var7.c = (kms0) obj3;
                pnp0Var7.invokeSuspend(rih1Var);
                break;
            case 7:
                pnp0 pnp0Var8 = new pnp0((uus0) this.d, (lnm) obj5, (byte) 7);
                pnp0Var8.b = (rus0) obj2;
                pnp0Var8.c = (qus0) obj3;
                pnp0Var8.invokeSuspend(rih1Var);
                break;
            case 8:
                pnp0 pnp0Var9 = new pnp0((yup0) this.d, (lnm) obj5, (byte) 8);
                pnp0Var9.b = (j3t0) obj2;
                pnp0Var9.c = (h3t0) obj3;
                pnp0Var9.invokeSuspend(rih1Var);
                break;
            case 9:
                pnp0 pnp0Var10 = new pnp0((rqu0) this.d, (lnm) obj5, (byte) 9);
                pnp0Var10.b = (mqu0) obj3;
                pnp0Var10.c = (tqw) obj4;
                pnp0Var10.invokeSuspend(rih1Var);
                break;
            case 10:
                pnp0 pnp0Var11 = new pnp0((kls0) this.d, (lnm) obj5, (byte) 10);
                pnp0Var11.b = (yev0) obj3;
                pnp0Var11.c = (tqw) obj4;
                pnp0Var11.invokeSuspend(rih1Var);
                break;
            case 11:
                pnp0 pnp0Var12 = new pnp0((s8w0) this.d, (lnm) obj5, (byte) 11);
                pnp0Var12.b = (o8w0) obj;
                pnp0Var12.c = (r8w0) obj2;
                pnp0Var12.invokeSuspend(rih1Var);
                break;
            case 12:
                pnp0 pnp0Var13 = new pnp0((jjz0) this.d, (lnm) obj5, (byte) 12);
                pnp0Var13.b = (djz0) obj3;
                pnp0Var13.c = (tqw) obj4;
                pnp0Var13.invokeSuspend(rih1Var);
                break;
            case 13:
                pnp0 pnp0Var14 = new pnp0(b2, (lnm) obj5);
                pnp0Var14.b = (ekz0) obj;
                pnp0Var14.c = (fkz0) obj2;
                pnp0Var14.d = (ckz0) obj3;
                pnp0Var14.invokeSuspend(rih1Var);
                break;
            case 14:
                pnp0 pnp0Var15 = new pnp0((pa01) this.d, (lnm) obj5, (byte) 14);
                pnp0Var15.b = (ma01) obj2;
                pnp0Var15.c = (la01) obj3;
                pnp0Var15.invokeSuspend(rih1Var);
                break;
            case 15:
                pnp0 pnp0Var16 = new pnp0((yxb0) this.d, (lnm) obj5, (byte) 15);
                pnp0Var16.b = (ta01) obj2;
                pnp0Var16.c = (sa01) obj3;
                pnp0Var16.invokeSuspend(rih1Var);
                break;
            case 16:
                pnp0 pnp0Var17 = new pnp0((qlb) this.d, (lnm) obj5, (byte) 16);
                pnp0Var17.b = (wx01) obj3;
                pnp0Var17.c = (tqw) obj4;
                pnp0Var17.invokeSuspend(rih1Var);
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                pnp0 pnp0Var18 = new pnp0((ky01) this.d, (lnm) obj5, (byte) 17);
                pnp0Var18.b = (fy01) obj;
                pnp0Var18.c = (ey01) obj3;
                pnp0Var18.invokeSuspend(rih1Var);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                pnp0 pnp0Var19 = new pnp0((s911) this.d, (lnm) obj5, (byte) 18);
                pnp0Var19.b = (p911) obj3;
                pnp0Var19.c = (tqw) obj4;
                pnp0Var19.invokeSuspend(rih1Var);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                pnp0 pnp0Var20 = new pnp0((pt) this.d, (lnm) obj5, (byte) 19);
                pnp0Var20.b = (ca11) obj3;
                pnp0Var20.c = (tqw) obj4;
                pnp0Var20.invokeSuspend(rih1Var);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                pnp0 pnp0Var21 = new pnp0((gd11) this.d, (lnm) obj5, (byte) 20);
                pnp0Var21.b = (cd11) obj;
                pnp0Var21.c = (bd11) obj3;
                pnp0Var21.invokeSuspend(rih1Var);
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                pnp0 pnp0Var22 = new pnp0((lzn0) this.d, (lnm) obj5, (byte) 21);
                pnp0Var22.b = (mk11) obj3;
                pnp0Var22.c = (tqw) obj4;
                pnp0Var22.invokeSuspend(rih1Var);
                break;
            case 22:
                pnp0 pnp0Var23 = new pnp0((vu41) this.d, (lnm) obj5, (byte) 22);
                pnp0Var23.b = (ru41) obj2;
                pnp0Var23.c = (nu41) obj3;
                pnp0Var23.invokeSuspend(rih1Var);
                break;
            case 23:
                pnp0 pnp0Var24 = new pnp0((jd6) this.d, (lnm) obj5, (byte) 23);
                pnp0Var24.b = (ak51) obj3;
                pnp0Var24.c = (tqw) obj4;
                pnp0Var24.invokeSuspend(rih1Var);
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                pnp0 pnp0Var25 = new pnp0((res) this.d, (lnm) obj5, (byte) 24);
                pnp0Var25.b = (hc61) obj2;
                pnp0Var25.c = (tqw) obj4;
                pnp0Var25.invokeSuspend(rih1Var);
                break;
            case 25:
                pnp0 pnp0Var26 = new pnp0((ngs0) this.d, (lnm) obj5, (byte) 25);
                pnp0Var26.b = (a991) obj;
                pnp0Var26.c = (z891) obj3;
                pnp0Var26.invokeSuspend(rih1Var);
                break;
            case 26:
                pnp0 pnp0Var27 = new pnp0((n991) this.d, (lnm) obj5, (byte) 26);
                pnp0Var27.b = (l991) obj;
                pnp0Var27.c = (k991) obj3;
                pnp0Var27.invokeSuspend(rih1Var);
                break;
            case 27:
                pnp0 pnp0Var28 = new pnp0((t991) this.d, (lnm) obj5, (byte) 27);
                pnp0Var28.b = (r991) obj;
                pnp0Var28.c = (q991) obj3;
                pnp0Var28.invokeSuspend(rih1Var);
                break;
            case 28:
                pnp0 pnp0Var29 = new pnp0((s8a1) this.d, (lnm) obj5, (byte) 28);
                pnp0Var29.b = (l8a1) obj3;
                pnp0Var29.c = (tqw) obj4;
                pnp0Var29.invokeSuspend(rih1Var);
                break;
            default:
                pnp0 pnp0Var30 = new pnp0((r8s) this.d, (lnm) obj5, (byte) 29);
                pnp0Var30.b = (c0b1) obj2;
                pnp0Var30.c = (a0b1) obj3;
                pnp0Var30.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        ou80 ou80Var;
        ou80 ou80Var2;
        Restrictions restrictions;
        t380 t380VarDisallowSleepTimerEndOfTrackReasons;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        tv80 string = null;
        switch (b) {
            case 0:
                nnp0 nnp0Var = (nnp0) this.b;
                lnp0 lnp0Var = (lnp0) this.c;
                hm5.M(obj);
                if (lnp0Var != null) {
                    ((op20) this.d).b.m(Integer.valueOf(nnp0Var.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                rop0 rop0Var = (rop0) this.b;
                tqw tqwVar = (tqw) this.c;
                hm5.M(obj);
                if (!u890.j(rop0Var, rop0.a)) {
                    eg.o();
                    return null;
                }
                res resVar = (res) this.d;
                lzn0 lzn0Var = (lzn0) resVar.e;
                String str = (String) ((idd1) resVar.g).getValue();
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                lzn0Var.f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                return rih1Var;
            case 2:
                n0o n0oVar = (n0o) this.d;
                sd41 sd41Var = (sd41) n0oVar.f;
                lzn0 lzn0Var2 = (lzn0) n0oVar.e;
                w8q0 w8q0Var = (a9q0) this.b;
                tqw tqwVar2 = (tqw) this.c;
                hm5.M(obj);
                tv80 tv80Var = tqwVar2 != null ? (tv80) tqwVar2.a(rc11.a.b(tv80.class)) : null;
                if (w8q0Var instanceof q8q0) {
                    sd41.b(sd41Var, ((q8q0) w8q0Var).a, (tv80) null, 6).subscribe();
                    return rih1Var;
                }
                if (w8q0Var instanceof x8q0) {
                    sd41.a(sd41Var, ((x8q0) w8q0Var).a, (tv80) null, 6).subscribe();
                    return rih1Var;
                }
                if (w8q0Var instanceof r8q0) {
                    if (tv80Var == null) {
                        return rih1Var;
                    }
                    lzn0Var2.a(((r8q0) w8q0Var).a, tv80Var, (Bundle) null);
                    return rih1Var;
                }
                if (w8q0Var instanceof w8q0) {
                    if (tv80Var == null) {
                        return rih1Var;
                    }
                    lzn0Var2.a(w8q0Var.b(), tv80Var, (Bundle) null);
                    return rih1Var;
                }
                if (!(w8q0Var instanceof z8q0)) {
                    eg.o();
                    return null;
                }
                z8q0 z8q0Var = (z8q0) w8q0Var;
                List listC = z8q0Var.c();
                String strA = z8q0Var.a();
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("multi_event_card_uris", new ArrayList<>(listC));
                if (strA != null) {
                    bundle.putString("multi_event_card_artist_uri", strA);
                } else {
                    bundle.remove("multi_event_card_artist_uri");
                }
                if (tv80Var != null) {
                    lzn0Var2.a(i1k0.r(), tv80Var, bundle);
                    return rih1Var;
                }
                lzn0Var2.g(bundle, i1k0.r());
                return rih1Var;
            case 3:
                dmr0 dmr0Var = (dmr0) this.b;
                tqw tqwVar3 = (tqw) this.c;
                hm5.M(obj);
                boolean z2 = dmr0Var.g;
                String str2 = dmr0Var.e;
                ug3 ug3Var = (ug3) this.d;
                Optional optional = (Optional) ug3Var.d;
                if (!z2) {
                    a1r0 a1r0Var = (a1r0) ug3Var.b;
                    if (tqwVar3 != null && (ou80Var = n3o1.y(tqwVar3).a) != null) {
                        string = ou80Var.a;
                    }
                    a1r0.j(a1r0Var, str2, string, (Bundle) null, false, 12);
                } else if (optional.isPresent()) {
                    ((ori0) optional.get()).a(str2);
                }
                return rih1Var;
            case 4:
                r8s r8sVar = (r8s) this.d;
                bpb1 bpb1Var = (bpb1) r8sVar.X;
                e0s0 e0s0Var = (e0s0) this.b;
                c0s0 c0s0Var = (c0s0) this.c;
                hm5.M(obj);
                int iOrdinal = c0s0Var.ordinal();
                if (iOrdinal == 0) {
                    z710.d((z710) r8sVar.d, e0s0Var.f, false, 4);
                    return rih1Var;
                }
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return rih1Var;
                }
                if (iOrdinal == 3) {
                    Boolean bool = Boolean.TRUE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                    return rih1Var;
                }
                if (iOrdinal == 4) {
                    Boolean bool2 = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool2);
                    return rih1Var;
                }
                if (iOrdinal == 5) {
                    String str3 = e0s0Var.a;
                    r630 r630Var = (r630) r8sVar.h;
                    Set set = s4b1.f;
                    String strZ = uic.C(str3, (String) null).z();
                    if (strZ != null) {
                        if (r630Var.c(strZ) == null) {
                            r630Var.a(new i430(strZ, 30, false));
                        }
                        r630Var.j(strZ, true);
                        ((lzn0) r8sVar.i).c();
                        return rih1Var;
                    }
                    hhg1.f("SpotifyLink.userLink produced no URI for userId=".concat(str3));
                } else {
                    eg.o();
                }
                return null;
            case 5:
                f7s0 f7s0Var = (f7s0) this.b;
                tqw tqwVar4 = (tqw) this.c;
                hm5.M(obj);
                ((lzn0) ((ng20) this.d).b).a(l1d.l(f7s0Var.a, "spotify:listeningstats:"), cvl1.d(tqwVar4), (Bundle) null);
                return rih1Var;
            case 6:
                vu60 vu60Var = (vu60) ((yup0) this.d).d;
                tv80 tv80Var2 = (pms0) this.b;
                kms0 kms0Var = (kms0) this.c;
                hm5.M(obj);
                int iOrdinal2 = kms0Var.ordinal();
                if (iOrdinal2 == 0) {
                    string = tv80Var2 instanceof nms0 ? (nms0) tv80Var2 : null;
                    if (string == null) {
                        return rih1Var;
                    }
                    vu60Var.b.accept(new bu60(string.a, 5));
                    return rih1Var;
                }
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                string = tv80Var2 instanceof oms0 ? (oms0) tv80Var2 : null;
                if (string == null) {
                    return rih1Var;
                }
                vu60Var.b.accept(new eu60(string.a));
                return rih1Var;
            case 7:
                bpb1 bpb1Var2 = ((uus0) this.d).f;
                rus0 rus0Var = (rus0) this.b;
                qus0 qus0Var = (qus0) this.c;
                hm5.M(obj);
                if (qus0Var instanceof pus0) {
                    if (rus0Var.j) {
                        return rih1Var;
                    }
                    Boolean bool3 = Boolean.TRUE;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, bool3);
                    return rih1Var;
                }
                if (!(qus0Var instanceof ous0)) {
                    eg.o();
                    return null;
                }
                Boolean bool4 = Boolean.FALSE;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, bool4);
                return rih1Var;
            case 8:
                yup0 yup0Var = (yup0) this.d;
                j3t0 j3t0Var = (j3t0) this.b;
                h3t0 h3t0Var = (h3t0) this.c;
                hm5.M(obj);
                int iOrdinal3 = h3t0Var.ordinal();
                if (iOrdinal3 == 0) {
                    gvs0 gvs0Var = (gvs0) yup0Var.c;
                    boolean z3 = !j3t0Var.a;
                    hma1 hma1VarEdit = gvs0Var.b.edit();
                    hma1VarEdit.a(hvs0.a, z3);
                    hma1VarEdit.h();
                    return rih1Var;
                }
                if (iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                ivs0 ivs0Var = (ivs0) ((ynb0) yup0Var.d).get();
                Context context = ivs0Var.a;
                ivs0Var.b.getClass();
                if (Build.VERSION.SDK_INT < 31) {
                    return rih1Var;
                }
                Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                intent.addFlags(335544320);
                context.startActivity(intent);
                return rih1Var;
            case 9:
                mqu0 mqu0Var = (mqu0) this.b;
                tqw tqwVar5 = (tqw) this.c;
                hm5.M(obj);
                if (mqu0Var == null) {
                    eg.o();
                    return null;
                }
                if (tqwVar5 != null && (ou80Var2 = n3o1.y(tqwVar5).a) != null) {
                    string = ou80Var2.a;
                }
                vlu vluVar = ((rqu0) this.d).c;
                vu30 vu30Var = vluVar.b;
                if (vu30Var == null) {
                    return rih1Var;
                }
                vu30Var.invoke(vluVar.c, string);
                return rih1Var;
            case 10:
                yev0 yev0Var = (yev0) this.b;
                tqw tqwVar6 = (tqw) this.c;
                hm5.M(obj);
                if (yev0Var == null) {
                    eg.o();
                    return null;
                }
                if (tqwVar6 == null) {
                    return rih1Var;
                }
                ((lzn0) ((kls0) this.d).b).a(yev0Var.a, n3o1.y(tqwVar6), (Bundle) null);
                return rih1Var;
            case 11:
                j5h1 j5h1Var = ((s8w0) this.d).a;
                o8w0 o8w0Var = (o8w0) this.b;
                r8w0 r8w0Var = (r8w0) this.c;
                hm5.M(obj);
                if (u890.j(r8w0Var, p8w0.a)) {
                    j5h1Var.a(new g5h1(o8w0Var.a, o8w0Var.b));
                    return rih1Var;
                }
                if (r8w0Var instanceof q8w0) {
                    j5h1Var.b();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 12:
                jjz0 jjz0Var = (jjz0) this.d;
                lzn0 lzn0Var3 = jjz0Var.b;
                djz0 djz0Var = (djz0) this.b;
                tqw tqwVar7 = (tqw) this.c;
                hm5.M(obj);
                if (u890.j(djz0Var, bjz0.a)) {
                    lzn0Var3.e();
                    return rih1Var;
                }
                if (u890.j(djz0Var, cjz0.a)) {
                    lzn0Var3.f(new dwn0((String) jjz0Var.c.getValue(), "", false, false, 0, 0, true, (a690) null, (Bundle) null, tqwVar7 != null ? new bwn0(n3o1.y(tqwVar7)) : null));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 13:
                ekz0 ekz0Var = (ekz0) this.b;
                fkz0 fkz0Var = (fkz0) this.c;
                ckz0 ckz0Var = (ckz0) this.d;
                hm5.M(obj);
                if (u890.j(ckz0Var, ckz0.a)) {
                    ekz0Var.c.invoke(fkz0Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 14:
                pa01 pa01Var = (pa01) this.d;
                ma01 ma01Var = (ma01) this.b;
                la01 la01Var = (la01) this.c;
                hm5.M(obj);
                boolean z4 = ma01Var.j;
                String str4 = ma01Var.a;
                if (!z4) {
                    return rih1Var;
                }
                if (u890.j(la01Var, ia01.a) || u890.j(la01Var, ja01.a)) {
                    pa01Var.e.a(str4, false);
                    return rih1Var;
                }
                if (u890.j(la01Var, ka01.a)) {
                    pa01Var.f.a(str4);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 15:
                ta01 ta01Var = (ta01) this.b;
                sa01 sa01Var = (sa01) this.c;
                hm5.M(obj);
                if (!u890.j(sa01Var, sa01.a)) {
                    eg.o();
                    return null;
                }
                boolean z5 = ta01Var.c;
                String str5 = ta01Var.a;
                if (!z5) {
                    return rih1Var;
                }
                boolean z6 = ta01Var.b;
                yxb0 yxb0Var = (yxb0) this.d;
                if (z6) {
                    ((sfz) yxb0Var.d).a(str5, true);
                    return rih1Var;
                }
                ((ja8) yxb0Var.c).a(str5);
                return rih1Var;
            case 16:
                wx01 wx01Var = (wx01) this.b;
                tqw tqwVar8 = (tqw) this.c;
                hm5.M(obj);
                if (wx01Var == null) {
                    eg.o();
                    return null;
                }
                String str6 = wx01Var.a;
                tv80 tv80VarY2 = tqwVar8 != null ? n3o1.y(tqwVar8) : null;
                ((lzn0) ((qlb) this.d).e).f(new dwn0(str6, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY2 != null ? new bwn0(tv80VarY2) : null));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                bz00 bz00Var = ((ky01) this.d).b;
                fy01 fy01Var = (fy01) this.b;
                ey01 ey01Var = (ey01) this.c;
                hm5.M(obj);
                if (ey01Var instanceof cy01) {
                    bz00Var.a.invoke(new rzz(fy01Var.a, fy01Var.d));
                    return rih1Var;
                }
                if (ey01Var instanceof by01) {
                    bz00Var.a.invoke(new nvz(fy01Var.a, fy01Var.d.b));
                    return rih1Var;
                }
                if (ey01Var instanceof dy01) {
                    bz00Var.a.invoke(new szz(fy01Var.a, fy01Var.d));
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                s911 s911Var = (s911) this.d;
                p911 p911Var = (p911) this.b;
                tqw tqwVar9 = (tqw) this.c;
                hm5.M(obj);
                if (!u890.j(p911Var, p911.a)) {
                    eg.o();
                    return null;
                }
                l911 l911Var = (l911) s911Var.b.getValue();
                hma1 hma1VarEdit2 = l911Var.a.edit();
                hma1VarEdit2.a(l911Var.e, true);
                hma1VarEdit2.g();
                s911Var.a.a("spotify:site:wwwreferrals", cvl1.d(tqwVar9), (Bundle) null);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                pt ptVar = (pt) this.d;
                ba11 ba11Var = (ca11) this.b;
                tqw tqwVar10 = (tqw) this.c;
                hm5.M(obj);
                if (u890.j(ba11Var, aa11.a)) {
                    if (tqwVar10 == null) {
                        return rih1Var;
                    }
                    tv80 tv80VarY3 = n3o1.y(tqwVar10);
                    lzn0 lzn0Var4 = (lzn0) ptVar.d;
                    String str7 = (String) ptVar.e;
                    Set set2 = s4b1.f;
                    String strZ2 = uic.x("spotify:ai-playlist:reedit:".concat(uic.x(str7).h())).z();
                    if (strZ2 != null) {
                        lzn0Var4.a(strZ2, tv80VarY3, (Bundle) null);
                        return rih1Var;
                    }
                    eg.m("Required value was null.");
                } else {
                    if (ba11Var instanceof ba11) {
                        ((kt91) ptVar.f).k(new er91((fs91) null, ba11Var.a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        return rih1Var;
                    }
                    eg.o();
                }
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                cd11 cd11Var = (cd11) this.b;
                bd11 bd11Var = (bd11) this.c;
                hm5.M(obj);
                if (bd11Var == null) {
                    eg.o();
                    return null;
                }
                gd11 gd11Var = (gd11) this.d;
                List list = bd11Var.a;
                String str8 = bd11Var.b;
                u210 u210Var = gd11Var.d;
                String str9 = cd11Var.c;
                string = str8 != null ? ihc1.e1(str8).toString() : null;
                if (string == null) {
                    string = "";
                }
                u210Var.c(str9, list, string);
                gd11Var.f.k(cd11Var.a, DismissedEntity.Type.INLINE_CARD);
                gd11Var.b.k(new er91((fs91) null, gd11Var.c.getString(2131961004), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                mk11 mk11Var = (mk11) this.b;
                tqw tqwVar11 = (tqw) this.c;
                hm5.M(obj);
                if (mk11Var == null) {
                    eg.o();
                    return null;
                }
                if (tqwVar11 == null) {
                    return rih1Var;
                }
                ((lzn0) this.d).a(mk11Var.a, n3o1.y(tqwVar11), (Bundle) null);
                return rih1Var;
            case 22:
                vu41 vu41Var = (vu41) this.d;
                ubw0 ubw0Var = vu41Var.c;
                bpb1 bpb1Var3 = vu41Var.e;
                iu30 iu30Var = vu41Var.d;
                ru41 ru41Var = (ru41) this.b;
                nu41 nu41Var = (nu41) this.c;
                hm5.M(obj);
                if (nu41Var instanceof mu41) {
                    iu30Var.invoke(Boolean.TRUE);
                    return rih1Var;
                }
                if (!(nu41Var instanceof lu41)) {
                    if (!(nu41Var instanceof ku41)) {
                        eg.o();
                        return null;
                    }
                    bpb1Var3.l((Object) null);
                    iu30Var.invoke(Boolean.FALSE);
                    ubw0Var.f((long) (((double) ((ku41) nu41Var).a) * ru41Var.a.b));
                    return rih1Var;
                }
                if (ru41Var.a.b <= 0) {
                    return rih1Var;
                }
                long jB = vu41Var.a.b();
                if (jB - vu41Var.f < 80) {
                    return rih1Var;
                }
                vu41Var.f = jB;
                bpb1Var3.l(ubw0Var.a(((Number) vu41Var.g.getValue()).intValue(), (long) (((double) ((lu41) nu41Var).a) * ru41Var.a.b), ((Number) vu41Var.h.getValue()).intValue()));
                return rih1Var;
            case 23:
                ak51 ak51Var = (ak51) this.b;
                tqw tqwVar12 = (tqw) this.c;
                hm5.M(obj);
                if (ak51Var instanceof ak51) {
                    ((lzn0) ((jd6) this.d).f).a(ak51Var.a, cvl1.d(tqwVar12), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hc61 hc61Var = (hc61) this.b;
                tqw tqwVar13 = (tqw) this.c;
                hm5.M(obj);
                res resVar2 = (res) this.d;
                fn31.T((u9c0) resVar2.d, (o8n) null, 0, new n641(resVar2, hc61Var, cvl1.d(tqwVar13).a, (lnm) null, (byte) 19), 3);
                return rih1Var;
            case 25:
                a991 a991Var = (a991) this.b;
                z891 z891Var = (z891) this.c;
                hm5.M(obj);
                if (z891Var == null) {
                    eg.o();
                    return null;
                }
                ((h991) ((ngs0) this.d).d).a();
                iu30 iu30Var2 = a991Var.c;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954449});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                iu30Var2.invoke(new er91((fs91) null, "", 2131954449, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 26:
                l991 l991Var = (l991) this.b;
                k991 k991Var = (k991) this.c;
                hm5.M(obj);
                if (k991Var == null) {
                    eg.o();
                    return null;
                }
                h991 h991Var = ((n991) this.d).a;
                long jH = jfv.h(l991Var.a.a);
                if (h991Var.c.E()) {
                    h991Var.a.c(new kke1(jH));
                }
                iu30 iu30Var3 = l991Var.c;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954447});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                iu30Var3.invoke(new er91((fs91) null, "", 2131954447, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 27:
                r991 r991Var = (r991) this.b;
                q991 q991Var = (q991) this.c;
                hm5.M(obj);
                if (q991Var == null) {
                    eg.o();
                    return null;
                }
                h991 h991Var2 = ((t991) this.d).a;
                String str10 = r991Var.b;
                xe01 xe01Var = (xe01) h991Var2.c.e;
                if (xe01Var != null && (restrictions = (Restrictions) xe01Var.a.getValue()) != null && (t380VarDisallowSleepTimerEndOfTrackReasons = restrictions.disallowSleepTimerEndOfTrackReasons()) != null && !t380VarDisallowSleepTimerEndOfTrackReasons.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    h991Var2.b.c(new nwt0(str10));
                }
                iu30 iu30Var4 = r991Var.c;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954447});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                iu30Var4.invoke(new er91((fs91) null, "", 2131954447, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 28:
                l8a1 l8a1Var = (l8a1) this.b;
                tqw tqwVar14 = (tqw) this.c;
                hm5.M(obj);
                if (l8a1Var != null) {
                    i1o1.w(((s8a1) this.d).b, l8a1Var.a, tqwVar14 != null ? n3o1.y(tqwVar14) : null, new Long(0L));
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                r8s r8sVar2 = (r8s) this.d;
                ao0 ao0Var = (ao0) r8sVar2.g;
                c0b1 c0b1Var = (c0b1) this.b;
                xza1 xza1Var = (a0b1) this.c;
                hm5.M(obj);
                if (u890.j(xza1Var, yza1.a)) {
                    ((lzn0) r8sVar2.e).e();
                    return rih1Var;
                }
                if (u890.j(xza1Var, vza1.a)) {
                    ki0 ki0Var = c0b1Var.e;
                    if (ki0Var == null) {
                        return rih1Var;
                    }
                    pxc.a((pxc) r8sVar2.f, ki0Var, new Long(0L), "sponsor_callout", (String) null, 24);
                    return rih1Var;
                }
                if (u890.j(xza1Var, zza1.a)) {
                    return rih1Var;
                }
                if (xza1Var instanceof xza1) {
                    ki0 ki0Var2 = c0b1Var.e;
                    if (ki0Var2 == null) {
                        return rih1Var;
                    }
                    ao0.a(ao0Var, co0.t, ki0Var2.a(), (Long) null, (String) null, xza1Var.a, 60);
                    return rih1Var;
                }
                if (!(xza1Var instanceof wza1)) {
                    eg.o();
                    return null;
                }
                ki0 ki0Var3 = c0b1Var.e;
                if (ki0Var3 == null) {
                    return rih1Var;
                }
                ao0.a(ao0Var, co0.e, ki0Var3.a(), (Long) null, (String) null, ((wza1) xza1Var).a, 60);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pnp0(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 13;
    }
}
