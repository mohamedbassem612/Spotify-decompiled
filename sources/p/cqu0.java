package p;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.time.Instant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cqu0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cqu0(Object obj, Object obj2, lnm lnmVar, byte b) {
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
                cqu0 cqu0Var = new cqu0((dqu0) obj2, lnmVar, (byte) 0);
                cqu0Var.b = obj;
                return cqu0Var;
            case 1:
                return new cqu0((qzu0) this.b, (y131) obj2, lnmVar, (byte) 1);
            case 2:
                return new cqu0((pzn0) this.b, (tqw) obj2, lnmVar, (byte) 2);
            case 3:
                return new cqu0((bhs) this.b, (tg8) obj2, lnmVar, (byte) 3);
            case 4:
                return new cqu0((rzh) this.b, (aru0) obj2, lnmVar, (byte) 4);
            case 5:
                return new cqu0((wuv0) this.b, (avv0) obj2, lnmVar, (byte) 5);
            case 6:
                return new cqu0((xvv0) this.b, (tv80) obj2, lnmVar, (byte) 6);
            case 7:
                return new cqu0((gfw0) this.b, (String) obj2, lnmVar, (byte) 7);
            case 8:
                return new cqu0((gfw0) this.b, (i091) obj2, lnmVar, (byte) 8);
            case 9:
                cqu0 cqu0Var2 = new cqu0((gfw0) obj2, lnmVar, (byte) 9);
                cqu0Var2.b = obj;
                return cqu0Var2;
            case 10:
                return new cqu0((ofw0) this.b, (sbw0) obj2, lnmVar, (byte) 10);
            case 11:
                return new cqu0((g1i) this.b, (yfw0) obj2, lnmVar, (byte) 11);
            case 12:
                return new cqu0((yh2) this.b, (cgw0) obj2, lnmVar, (byte) 12);
            case 13:
                return new cqu0((wr00) this.b, (dgw0) obj2, lnmVar, (byte) 13);
            case 14:
                return new cqu0((phi0) this.b, (dew) obj2, lnmVar, (byte) 14);
            case 15:
                return new cqu0((xjw0) this.b, (zjw0) obj2, lnmVar, (byte) 15);
            case 16:
                return new cqu0((fjk0) this.b, (Integer) obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                cqu0 cqu0Var3 = new cqu0((r241) obj2, lnmVar, (byte) 17);
                cqu0Var3.b = obj;
                return cqu0Var3;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                cqu0 cqu0Var4 = new cqu0((n0x0) obj2, lnmVar, (byte) 18);
                cqu0Var4.b = obj;
                return cqu0Var4;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                cqu0 cqu0Var5 = new cqu0((vgx0) obj2, lnmVar, (byte) 19);
                cqu0Var5.b = obj;
                return cqu0Var5;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new cqu0((dlx0) this.b, (k8c0) obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new cqu0((dlx0) this.b, (hac0) obj2, lnmVar, (byte) 21);
            case 22:
                return new cqu0((r2y0) this.b, (op41) obj2, lnmVar, (byte) 22);
            case 23:
                cqu0 cqu0Var6 = new cqu0((o3y0) obj2, lnmVar, (byte) 23);
                cqu0Var6.b = obj;
                return cqu0Var6;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new cqu0((n5y0) this.b, (o5y0) obj2, lnmVar, (byte) 24);
            case 25:
                return new cqu0((u6y0) this.b, (String) obj2, lnmVar, (byte) 25);
            case 26:
                return new cqu0((u6y0) this.b, (g6y0) obj2, lnmVar, (byte) 26);
            case 27:
                return new cqu0((cir0) this.b, (Function0) obj2, lnmVar, (byte) 27);
            case 28:
                return new cqu0((l0x0) this.b, (Bundle) obj2, lnmVar, (byte) 28);
            default:
                return new cqu0((xmu0) this.b, (ln21) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((zpu0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                throw null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((whx0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        int iNextIndex;
        gvv0 dvv0Var;
        VideoSurfaceView videoSurfaceView;
        r8i0 r8i0VarE;
        byte b = this.a;
        boolean zEquals = false;
        byte b2 = 1;
        VideoSurfaceView videoSurfaceView2 = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                zpu0 zpu0Var = (zpu0) this.b;
                hm5.M(obj);
                dqu0 dqu0Var = (dqu0) obj2;
                if (!dqu0Var.d()) {
                    dqu0Var.i();
                }
                dqu0Var.h.l(zpu0Var);
                return rih1Var;
            case 1:
                hm5.M(obj);
                qzu0 qzu0Var = (qzu0) this.b;
                l5d0 l5d0Var = qzu0Var.d;
                y131 y131Var = (y131) obj2;
                c6h1 c6h1Var = (c6h1) l5d0Var.c(h5d0.e, new wpu0((Object) qzu0Var, (Object) y131Var, (byte) 19));
                l5d0Var.c(h5d0.X0, new mzu0(qzu0Var, y131Var, c6h1Var, b2));
                return c6h1Var;
            case 2:
                hm5.M(obj);
                pzn0 pzn0Var = (pzn0) this.b;
                tqw tqwVar = (tqw) obj2;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                pzn0Var.b.f(new dwn0(pzn0Var.a, "", false, false, 0, 0, true, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                return rih1Var;
            case 3:
                hm5.M(obj);
                bhs bhsVar = (bhs) this.b;
                String str = ((tg8) obj2).a.a;
                Context context = bhsVar.a;
                String strR = upn1.r(context);
                dma1 dma1VarB = bhsVar.c.b(context, str);
                bma1 bma1Var = bhs.d;
                if (!strR.equals(dma1VarB.e(bma1Var, (String) null))) {
                    bhsVar.b.a("preferred-locale", strR);
                    hma1 hma1VarEdit = dma1VarB.edit();
                    hma1VarEdit.d(bma1Var, strR);
                    hma1VarEdit.g();
                }
                return rih1Var;
            case 4:
                hm5.M(obj);
                ((gw70) ((aru0) obj2).c).f(((rzh) this.b).c.a).n();
                return rih1Var;
            case 5:
                hm5.M(obj);
                List list = ((wuv0) this.b).a;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (((ayq0) listIterator.previous()) instanceof osv0) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                int i = 0;
                for (Object obj3 : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    ow50 ow50Var = (ayq0) obj3;
                    int i3 = i + 2;
                    if (ow50Var instanceof ow50) {
                        dvv0Var = new gvv0(ow50Var, i3);
                    } else if (ow50Var instanceof etv0) {
                        dvv0Var = new hvv0((etv0) ow50Var, i3);
                    } else if (ow50Var instanceof hqv0) {
                        dvv0Var = new evv0((hqv0) ow50Var, i3);
                    } else if (ow50Var instanceof jwv0) {
                        dvv0Var = new jvv0((jwv0) ow50Var, i3);
                    } else if (ow50Var instanceof ktv0) {
                        ktv0 ktv0Var = (ktv0) ow50Var;
                        dvv0Var = ktv0Var.b == 3 ? new fvv0(ktv0Var, i3) : new ivv0(ktv0Var, i3);
                    } else if (ow50Var instanceof osv0) {
                        dvv0Var = new cvv0((osv0) ow50Var, i3, i == iNextIndex);
                    } else {
                        dvv0Var = ow50Var instanceof aq50 ? new dvv0((aq50) ow50Var, i3) : new bvv0(i3);
                    }
                    arrayList.add(dvv0Var);
                    i = i2;
                }
                return arrayList;
            case 6:
                hm5.M(obj);
                xvv0 xvv0Var = (xvv0) this.b;
                xvv0Var.a.a(xvv0.d, (tv80) obj2, (Bundle) null);
                xvv0Var.b.a(ixb.c);
                return rih1Var;
            case 7:
                hm5.M(obj);
                gfw0 gfw0Var = (gfw0) this.b;
                WeakReference weakReference = gfw0Var.t;
                if (weakReference != null && (videoSurfaceView = (VideoSurfaceView) weakReference.get()) != null) {
                    WeakReference weakReference2 = gfw0Var.H;
                    if (videoSurfaceView != (weakReference2 != null ? (VideoSurfaceView) weakReference2.get() : null) || !gfw0Var.C) {
                        gfw0Var.C = true;
                        gfw0Var.k.m((String) obj2, videoSurfaceView);
                        gfw0Var.H = new WeakReference(videoSurfaceView);
                    }
                }
                return rih1Var;
            case 8:
                hm5.M(obj);
                ((gfw0) this.b).r.l((i091) obj2);
                return rih1Var;
            case 9:
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                ((gfw0) obj2).z = (hwt) mmr0Var.a;
                return rih1Var;
            case 10:
                hm5.M(obj);
                ((ofw0) this.b).k(new rdw0((sbw0) obj2));
                return rih1Var;
            case 11:
                hm5.M(obj);
                g1i g1iVar = (g1i) this.b;
                yfw0 yfw0Var = (yfw0) obj2;
                String str2 = yfw0Var.c;
                String str3 = yfw0Var.d;
                mfm.b(((i4q) g1iVar.b).a((lik1) g1iVar.d), yoi1.i(new m441(new ml1(g1iVar, str2, str3, yfw0Var.h, yfw0Var.e, yfw0Var.f, yfw0Var.g, null)), o6x.a).doOnError(new a21(str2, str3, (byte) 26)).onErrorComplete(), (p6r0) g1iVar.e, (bjm) null, yfw0Var.i, 20);
                return rih1Var;
            case 12:
                hm5.M(obj);
                cgw0 cgw0Var = (cgw0) obj2;
                ((yh2) this.b).b(cgw0Var.c, cgw0Var.d);
                return rih1Var;
            case 13:
                hm5.M(obj);
                ((wr00) this.b).a(((dgw0) obj2).c);
                return rih1Var;
            case 14:
                hm5.M(obj);
                phi0 phi0Var = (phi0) this.b;
                ttm0 ttm0Var = (ttm0) phi0Var.b;
                zau0 zau0VarC = (zau0) phi0Var.e;
                if (zau0VarC == null) {
                    zau0VarC = ttm0Var.c(false);
                    phi0Var.e = zau0VarC;
                }
                if (!((Boolean) zau0VarC.b.getValue()).booleanValue()) {
                    ttm0Var.a(zau0VarC);
                }
                r091 r091VarA = zau0VarC.a();
                phi0Var.f = r091VarA;
                if (r091VarA == null) {
                    return null;
                }
                dew dewVar = (dew) obj2;
                r091VarA.b(new lsm0(dewVar.a, new ksm0(new gec1("ee67cc3baa0e4492ab897c35e30b2c7a"), dewVar.b, (String) null, "ListeningActivityPreview", (String) null, (String) null, 500), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044));
                r091VarA.k();
                r091.f(r091VarA, dewVar.c, (Long) null, mjy0.a, 6);
                return r091VarA;
            case 15:
                zjw0 zjw0Var = (zjw0) obj2;
                hm5.M(obj);
                xjw0 xjw0Var = (xjw0) this.b;
                String str4 = xjw0Var.a;
                if (str4 == null || !xjw0Var.b) {
                    zjw0Var.a.c();
                } else {
                    sfn0 sfn0Var = zjw0Var.a;
                    String str5 = xjw0Var.e;
                    long j = xjw0Var.c;
                    sfn0Var.b(str5, str4, new m6n0(j, ((long) xjw0Var.d) + j), xjw0Var.g, null);
                }
                return rih1Var;
            case 16:
                hm5.M(obj);
                kt91 kt91Var = (kt91) ((fjk0) this.b).d;
                Integer num = (Integer) obj2;
                n57.k(num.intValue() != 0, "Invalid resource ID provided: %s", new Object[]{num});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                mmr0 mmr0Var2 = (mmr0) this.b;
                hm5.M(obj);
                if (mmr0Var2.b == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                n0x0 n0x0Var = (n0x0) obj2;
                l4p1.u(c9nVar, new fu20((h6a) n0x0Var.a.b, new pew0(n0x0Var, videoSurfaceView2, (byte) 7), (byte) 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                whx0 whx0Var = (whx0) this.b;
                hm5.M(obj);
                iix0 iix0Var = (iix0) whx0Var.a.get(((vgx0) obj2).a);
                return iix0Var == null ? new hix0(false, 0L) : iix0Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                ((dlx0) this.b).d.g((k8c0) obj2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                dlx0 dlx0Var = (dlx0) this.b;
                tac0 tac0Var = dlx0Var.d;
                tac0Var.d((hac0) obj2);
                tac0Var.f("getObserverCount");
                if (tac0Var.c.H() == 0) {
                    try {
                        tj70 tj70Var = dlx0Var.h;
                        if (tj70Var != null) {
                            tj70Var.B0(dlx0Var.i);
                        }
                        g2z g2zVar = dlx0Var.g;
                        if (g2zVar != null) {
                            g2zVar.z();
                        }
                        tac0Var.i(w8c0.b);
                        break;
                    } catch (RemoteException unused) {
                    }
                }
                return rih1Var;
            case 22:
                hm5.M(obj);
                ((r2y0) this.b).d(((op41) obj2) == op41.b);
                return rih1Var;
            case 23:
                tv80 tv80Var = (tv80) this.b;
                hm5.M(obj);
                o3y0 o3y0Var = (o3y0) obj2;
                i5y0 i5y0Var = o3y0Var.a;
                boolean zC = i5y0Var.c();
                lzn0 lzn0Var = o3y0Var.b;
                if (zC) {
                    lzn0Var.e();
                    x1i1.a(o3y0Var.c, new z740(1, ((lm10) i5y0Var.d).a, "generate"), 6);
                } else {
                    lzn0Var.e();
                    lzn0Var.a(o3y0.e, tv80Var, (Bundle) null);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                n5y0 n5y0Var = (n5y0) this.b;
                if (n5y0Var.h.a()) {
                    x1i1.a(n5y0Var.f, new z740(1, ((lm10) n5y0Var.g).a, "generate"), 6);
                } else {
                    a1r0 a1r0Var = n5y0Var.b;
                    Bundle bundle = new Bundle();
                    bundle.putLong("reset_timestamp", Instant.parse(((o5y0) obj2).b).toEpochMilli());
                    a1r0.m(a1r0Var, "spotify:internal:magpie:cap", (tv80) null, bundle, 8);
                }
                return rih1Var;
            case 25:
                hm5.M(obj);
                u6y0 u6y0Var = (u6y0) this.b;
                String str6 = (String) obj2;
                h6y0 h6y0Var = (h6y0) u6y0Var.Z.get(str6);
                if (h6y0Var == null) {
                    u6y0.l(u6y0Var, str6, 2, (UUID) null, 4);
                } else {
                    v6y0 v6y0Var = h6y0Var.b;
                    if (v6y0Var.b != 2) {
                        u6y0Var.q(str6, h6y0.a(h6y0Var, v6y0.a(v6y0Var, false, false, 13), false, (UUID) null, (xab1) null, (o6y0) null, 125));
                    }
                }
                return rih1Var;
            case 26:
                hm5.M(obj);
                u6y0 u6y0Var2 = (u6y0) this.b;
                g6y0 g6y0Var = (g6y0) obj2;
                h6y0 h6y0Var2 = (h6y0) u6y0Var2.Z.get(g6y0Var.a);
                if (h6y0Var2 != null && u890.j(h6y0Var2.a, g6y0Var.b) && h6y0Var2.b.b == 1) {
                    u6y0Var2.j(g6y0Var.a);
                }
                return rih1Var;
            case 27:
                hm5.M(obj);
                ((cir0) this.b).j(new pd8((Function0) obj2, (byte) 15));
                return rih1Var;
            case 28:
                hm5.M(obj);
                a1r0.i((a1r0) ((l0x0) this.b).b, "spotify:internal:puffin-setup-autodetect", (String) null, (Bundle) obj2, 2);
                return rih1Var;
            default:
                hm5.M(obj);
                ry21 ry21VarE = ((cxc) ((xmu0) this.b).b).a((ln21) obj2).e();
                try {
                    if (ry21VarE.Q0 && (r8i0VarE = ry21VarE.g.e()) != null) {
                        zEquals = r8i0VarE.c.equals("gif");
                    }
                    Boolean boolValueOf = Boolean.valueOf(zEquals);
                    ry21VarE.close();
                    return boolValueOf;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(ry21VarE, th);
                        throw th2;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cqu0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
