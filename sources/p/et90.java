package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.rxjava3.subjects.PublishSubject;
import j$.time.ZoneId;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class et90 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public et90(Resources resources, ile1 ile1Var, rcy rcyVar, ffe1 ffe1Var, los losVar, lzn0 lzn0Var, a0i1 a0i1Var) {
        this.a = (byte) 29;
        this.c = ile1Var;
        this.d = lzn0Var;
        this.e = new nhb1(resources.getString(2131963187), resources.getString(2131963185), resources.getString(2131963186), (String) null, true, new gzh1((String) null), 64);
        ibf1 ibf1Var = new ibf1(this, (byte) 15);
        hce1 hce1Var = new hce1((yzh1) ffe1Var.b, (nke1) ffe1Var.c, at50.c, resources, (byte) 1);
        String strA = ile1Var.a();
        FlowableOnErrorReturn flowableOnErrorReturnN = rcyVar.a.b(new oi("time_cap_pivot_upsell_page", false, new kov(strA, (byte) 11))).map(new clv(strA, (byte) 7)).filter(wcp1.Z0).map(new lfb(rcyVar, (byte) 9)).distinctUntilChanged().toFlowable(BackpressureStrategy.d).N("");
        vbm[] vbmVarArr = q601.a;
        this.f = bzn1.p(this, ibf1Var, new dh30(hce1Var, new kge(flowableOnErrorReturnN), (byte) 24), a0i1Var, losVar, new bu51((Object) this, (lnm) null, (byte) 15));
        this.g = n3o1.q(this).a(new nsb1(this, (byte) 29), vrf1.t);
        this.b = new f70((byte) 14);
    }

    public static final String g(et90 et90Var, rho0 rho0Var, String str) {
        String strX0 = ihc1.X0(str, ":");
        String str2 = rho0Var.b;
        String str3 = rho0Var.c;
        String str4 = rho0Var.d;
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-detail:".concat(strX0)).appendQueryParameter("context_uri", str2).appendQueryParameter("item_uri", str3);
        if (str4 != null) {
            builderAppendQueryParameter.appendQueryParameter("list_item_id", str4);
        }
        return builderAppendQueryParameter.build().toString();
    }

    public static final /* synthetic */ Activity h(et90 et90Var) {
        return (Activity) et90Var.e;
    }

    public static final /* synthetic */ kma i(et90 et90Var) {
        return (kma) et90Var.e;
    }

    public static final /* synthetic */ woa j(et90 et90Var) {
        return (woa) et90Var.d;
    }

    public static final /* synthetic */ lzn0 k(et90 et90Var) {
        return (lzn0) et90Var.c;
    }

    public static final /* synthetic */ a1r0 l(et90 et90Var) {
        return (a1r0) et90Var.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String o(dyj0 dyj0Var, x340 x340Var) throws NoWhenBranchMatchedException {
        v3u v3uVar = dyj0Var.a;
        if (v3uVar.equals(l3u.a)) {
            return x0d.k(x340Var, 1492382003, 2131958632, x340Var, false);
        }
        if (v3uVar instanceof s3u) {
            return x0d.k(x340Var, 1492386272, 2131958662, x340Var, false);
        }
        if ((v3uVar instanceof m3u) || v3uVar.equals(k3u.a)) {
            return x0d.k(x340Var, 1492391632, 2131958655, x340Var, false);
        }
        if (v3uVar.equals(p3u.a)) {
            return x0d.k(x340Var, 1492395611, 2131958651, x340Var, false);
        }
        if (!v3uVar.equals(r3u.a)) {
            throw p3d1.k(x340Var, 1492380466, false);
        }
        x340Var.i0(-980256903);
        x340Var.r(false);
        return "";
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.g;
        switch (b) {
            case 0:
                return (ia00) obj;
            case 1:
                return (hy00) obj;
            case 2:
                return (ia00) obj;
            case 3:
                return (ia00) obj;
            case 4:
                return (ia00) obj;
            case 5:
                return (hy00) obj;
            case 6:
                return (eih1) obj;
            case 7:
                return (ia00) obj;
            case 8:
                return (ia00) obj;
            case 9:
                return (eih1) obj;
            case 10:
                return (hy00) obj;
            case 11:
                return (ia00) obj;
            case 12:
                return (ia00) obj;
            case 13:
                return (ia00) obj;
            case 14:
                return (eih1) obj;
            case 15:
                return (ia00) obj;
            case 16:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (hy00) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (eih1) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (ia00) obj;
            case 22:
                return n3o1.q(this).a(new g001(this, (byte) 15), rw01.h);
            case 23:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (eih1) obj;
            case 25:
                return (hy00) obj;
            case 26:
                return (hy00) obj;
            case 27:
                return (azg) obj;
            case 28:
                return (hy00) obj;
            default:
                return (ia00) obj;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (psw) obj;
            case 1:
                return (psw) obj;
            case 2:
                return (psw) obj;
            case 3:
                return (psw) obj;
            case 4:
                return (f70) obj;
            case 5:
                return (psw) obj;
            case 6:
                return (psw) obj;
            case 7:
                return (psw) obj;
            case 8:
                return (psw) obj;
            case 9:
                return (psw) obj;
            case 10:
                return (psw) obj;
            case 11:
                return (psw) obj;
            case 12:
                return (psw) obj;
            case 13:
                return (psw) obj;
            case 14:
                return (psw) obj;
            case 15:
                return (psw) obj;
            case 16:
                return (psw) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (psw) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (f70) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (psw) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (psw) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (psw) obj;
            case 22:
                j2i j2iVar = new j2i(2069012590, new dr01(this, (byte) 8), true);
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            case 23:
                return (psw) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (psw) obj;
            case 25:
                return (psw) obj;
            case 26:
                return (psw) obj;
            case 27:
                return (psw) obj;
            case 28:
                return (psw) obj;
            default:
                return (f70) obj;
        }
    }

    public void e(bfc0 bfc0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qex qexVarB;
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(23344336);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(bfc0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131957331);
            zec0 zec0Var = bfc0Var.a;
            boolean z = bfc0Var.b;
            if (zec0Var != null) {
                x340Var.i0(959083939);
                qexVarB = w2g.a(z, x340Var, 0);
                x340Var.r(false);
            } else if (z) {
                x340Var.i0(959088053);
                qexVarB = w2g.b(x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-332988883);
                x340Var.r(false);
                qexVarB = null;
            }
            if (!z && zec0Var != null && (str = zec0Var.a) != null) {
                strO0 = str;
            }
            enx enxVar = enx.c;
            t2g t2gVar = new t2g(z || zec0Var != null, false, qexVarB, 2);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new x680(iu30Var, bfc0Var, (byte) 28);
                x340Var.s0(objT);
            }
            kyo1.c(strO0, enxVar, (Function0) objT, (qim0) null, false, (String) null, t2gVar, (vu30) null, x340Var, enx.d << 3, 184);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(this, bfc0Var, iu30Var, i, (byte) 24);
        }
    }

    public void f(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qex qexVarB;
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(307349303);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarH = rwq.h((zob1) this.c, x340Var, 0);
            ven0 ven0VarH2 = rwq.h((zob1) this.e, x340Var, 0);
            String strO0 = cwl1.o0(x340Var, 2131961640);
            if (((String) ven0VarH.getValue()) != null) {
                x340Var.i0(-990046537);
                qexVarB = w2g.a(((Boolean) ven0VarH2.getValue()).booleanValue(), x340Var, 0);
                x340Var.r(false);
            } else if (((Boolean) ven0VarH2.getValue()).booleanValue()) {
                x340Var.i0(-990043620);
                qexVarB = w2g.b(x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-626528602);
                x340Var.r(false);
                qexVarB = null;
            }
            vkx vkxVar = vkx.c;
            if (!((Boolean) ven0VarH2.getValue()).booleanValue() && (str = (String) ven0VarH.getValue()) != null) {
                strO0 = str;
            }
            String str2 = strO0;
            t2g t2gVar = new t2g(((Boolean) ven0VarH2.getValue()).booleanValue() || ((String) ven0VarH.getValue()) != null, false, qexVarB, 2);
            boolean zI = x340Var.i(ven0VarH2) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new rc21(iu30Var, ven0VarH2, (byte) 4);
                x340Var.s0(objT);
            }
            kyo1.c(str2, vkxVar, (Function0) objT, (qim0) null, false, (String) null, t2gVar, (vu30) null, x340Var, vkx.d << 3, 184);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, iu30Var, i, (byte) 18);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return (k8d1) obj;
            case 1:
                return (js20) obj;
            case 2:
                return (poy0) obj;
            case 3:
                return (k8d1) obj;
            case 4:
                return (js20) obj;
            case 5:
                return (rey0) obj;
            case 6:
                return (rey0) obj;
            case 7:
                return (rey0) obj;
            case 8:
                return (js20) obj;
            case 9:
                return (rey0) obj;
            case 10:
                return (rey0) obj;
            case 11:
                return (rey0) obj;
            case 12:
                return (js20) obj;
            case 13:
                return (poy0) obj;
            case 14:
                return (ljm0) obj;
            case 15:
                return (poy0) obj;
            case 16:
                return (poy0) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (e7m0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (js20) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (js20) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (e7m0) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (poy0) obj;
            case 22:
                return sbl.z(new g211(), new wam0((byte) 11), new eaz0(this, (byte) 1), atz0.e1, new ak01(this, (byte) 8));
            case 23:
                return (js20) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (rey0) obj;
            case 25:
                return (rey0) obj;
            case 26:
                return (js20) obj;
            case 27:
                return (js20) obj;
            case 28:
                return (js20) obj;
            default:
                return (js20) obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (p.b5p1.j(r5, r6, r0) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (p.s110.h(r0.getContext()).D(r5, r0) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0070 -> B:24:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(p.mz31 r6, p.onm r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.oz31
            if (r0 == 0) goto L13
            r0 = r7
            p.oz31 r0 = (p.oz31) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.oz31 r0 = new p.oz31
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.c
            int r7 = r0.e
            r1 = 0
            r2 = 1
            r3 = 2
            p.d9n r4 = p.d9n.a
            if (r7 == 0) goto L39
            if (r7 == r2) goto L35
            if (r7 != r3) goto L2f
            int r6 = r0.b
            int r7 = r0.a
            p.hm5.M(r5)
            goto L73
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r1
        L35:
            p.hm5.M(r5)
            goto L57
        L39:
            p.hm5.M(r5)
            p.g521 r5 = new p.g521
            r7 = 15
            r5.<init>(r6, r7)
            p.m441 r5 = p.rwq.q(r5)
            p.ck01 r6 = new p.ck01
            r7 = 8
            r6.<init>(r3, r1, r7)
            r0.e = r2
            java.lang.Object r5 = p.b5p1.j(r5, r6, r0)
            if (r5 != r4) goto L57
            goto L72
        L57:
            r5 = 0
            r6 = r5
            r7 = r3
        L5a:
            if (r6 >= r7) goto L75
            p.vm31 r5 = p.vm31.e1
            r0.a = r7
            r0.b = r6
            r0.e = r3
            p.o8n r1 = r0.getContext()
            p.rjm0 r1 = p.s110.h(r1)
            java.lang.Object r5 = r1.D(r5, r0)
            if (r5 != r4) goto L73
        L72:
            return r4
        L73:
            int r6 = r6 + r2
            goto L5a
        L75:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.et90.m(p.mz31, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public Object n(bd61 bd61Var, String str, ou80 ou80Var, onm onmVar) throws Throwable {
        cd61 cd61Var;
        Object obj;
        bpb1 bpb1Var = (bpb1) this.e;
        if (onmVar instanceof cd61) {
            cd61Var = (cd61) onmVar;
            int i = cd61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cd61Var.c = i - Integer.MIN_VALUE;
            } else {
                cd61Var = new cd61(this, onmVar);
            }
        } else {
            cd61Var = new cd61(this, onmVar);
        }
        cd61 cd61Var2 = cd61Var;
        Object obj2 = cd61Var2.a;
        int i2 = cd61Var2.c;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                hm5.M(obj2);
                obj = null;
                Boolean bool = Boolean.FALSE;
                bpb1Var.getClass();
                bpb1Var.m(obj, bool);
                return rih1.a;
            } catch (Throwable th) {
                th = th;
                obj = null;
                Boolean bool2 = Boolean.FALSE;
                bpb1Var.getClass();
                bpb1Var.m(obj, bool2);
                throw th;
            }
        }
        hm5.M(obj2);
        Boolean bool3 = Boolean.TRUE;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool3);
        try {
            mzr0 mzr0Var = (mzr0) this.c;
            String str2 = bd61Var.b;
            r6h1 r6h1Var = (r6h1) this.d;
            int i3 = u890.j(str, "session-control-reset") ? 2131961645 : 2131961646;
            int i4 = u890.j(str, "session-control-reset") ? 2131961647 : 2131961648;
            p651 p651Var = new p651(this, bd61Var, str, (lnm) null, (byte) 4);
            obj = null;
            try {
                Integer num = new Integer(i4);
                cd61Var2.c = 1;
                Object objD = mzr0Var.d(str2, str, i3, ou80Var, p651Var, r6h1Var, num, cd61Var2);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
                Boolean bool4 = Boolean.FALSE;
                bpb1Var.getClass();
                bpb1Var.m(obj, bool4);
                return rih1.a;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
        Boolean bool5 = Boolean.FALSE;
        bpb1Var.getClass();
        bpb1Var.m(obj, bool5);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(onm onmVar) {
        css0 css0Var;
        if (onmVar instanceof css0) {
            css0Var = (css0) onmVar;
            int i = css0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                css0Var.c = i - Integer.MIN_VALUE;
            } else {
                css0Var = new css0(this, onmVar);
            }
        } else {
            css0Var = new css0(this, onmVar);
        }
        Object objP = css0Var.a;
        int i2 = css0Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            kly0 kly0Var = (kly0) this.d;
            css0Var.c = 1;
            objP = rc2.P(tel.a, new awe(kly0Var, (lnm) null, (byte) 18), css0Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        List list = (List) objP;
        return list != null ? new zrs0(list) : yrs0.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        if (r0.a(r2, r10) == r13) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(java.lang.String r24, p.jz31 r25, p.wkt r26, android.net.Uri r27, p.onm r28) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.et90.q(java.lang.String, p.jz31, p.wkt, android.net.Uri, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(x581 x581Var, onm onmVar) {
        n581 n581Var;
        if (onmVar instanceof n581) {
            n581Var = (n581) onmVar;
            int i = n581Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n581Var.c = i - Integer.MIN_VALUE;
            } else {
                n581Var = new n581(this, onmVar);
            }
        } else {
            n581Var = new n581(this, onmVar);
        }
        Object obj = n581Var.a;
        int i2 = n581Var.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                u581 u581Var = x581Var instanceof u581 ? (u581) x581Var : null;
                if (u581Var != null) {
                    String str = u581Var.a;
                    eg40 eg40Var = (eg40) this.d;
                    n581Var.c = 1;
                    Object objF = eg40Var.f(str, n581Var);
                    d9n d9nVar = d9n.a;
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            ((p681) this.c).b.a(rih1Var);
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(iu30 iu30Var, onm onmVar) {
        tec0 tec0Var;
        if (onmVar instanceof tec0) {
            tec0Var = (tec0) onmVar;
            int i = tec0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tec0Var.c = i - Integer.MIN_VALUE;
            } else {
                tec0Var = new tec0(this, onmVar);
            }
        } else {
            tec0Var = new tec0(this, onmVar);
        }
        Object obj = tec0Var.a;
        int i2 = tec0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                tec0Var.c = 1;
                Object objInvoke = iu30Var.invoke(tec0Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Liked Songs genre filter action failed.", new Object[0]);
        }
        return rih1.a;
    }

    public et90(Activity activity, lzn0 lzn0Var, a1r0 a1r0Var) {
        this.a = (byte) 11;
        this.c = lzn0Var;
        this.d = a1r0Var;
        this.e = activity;
        this.f = new rey0(new ec3(this, (byte) 7));
        this.g = n3o1.q(this).a(n3o0.O0, n3o0.P0);
        j2i j2iVar = z3j.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(Function0 function0, zrp zrpVar, asp aspVar) {
        this.a = (byte) 6;
        this.c = function0;
        this.d = zrpVar;
        this.e = aspVar;
        this.f = k1o1.p();
        this.g = new eih1();
        j2i j2iVar = new j2i(2008549919, new y3i0(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(y1t0 y1t0Var, ycm ycmVar, idd1 idd1Var, uxy0 uxy0Var, s6z0 s6z0Var) {
        this.a = (byte) 21;
        this.c = y1t0Var;
        this.d = ycmVar;
        this.e = idd1Var;
        this.f = d4o1.f(new fw01(uxy0Var, (byte) 0), new ldz0(uxy0Var, (byte) 15), new fk01(uxy0Var, (byte) 2), new fw01(uxy0Var, (byte) 1), 8);
        this.g = n3o1.q(this).a(new g001(s6z0Var, (byte) 12), new aaq0(s6z0Var, (byte) 10));
        j2i j2iVar = new j2i(666499510, new dr01(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(Resources resources, ezc ezcVar, ezc ezcVar2) {
        this.a = (byte) 12;
        this.c = resources;
        this.d = ezcVar;
        this.e = ezcVar2;
        this.f = x3p1.n(new cnp0(this, (byte) 5), k8b0.Y0, new nso0(this, (byte) 7), (o8n) null, mmp0.W0, 8);
        j2i j2iVar = new j2i(-2070880118, new aso0(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(h40.a1, rmp0.g);
    }

    public et90(ior iorVar, lzn0 lzn0Var, vbl0 vbl0Var) {
        this.a = (byte) 10;
        this.c = iorVar;
        this.d = lzn0Var;
        this.e = vbl0Var;
        this.f = new rey0(new qsn0(this, (byte) 0));
        this.g = n3o1.r(this).c(new pah0(this, (byte) 26), fmk0.b1);
        j2i j2iVar = i3j.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(ubw0 ubw0Var, ubw0 ubw0Var2, ubw0 ubw0Var3) {
        this.a = (byte) 8;
        this.c = ubw0Var;
        this.d = ubw0Var2;
        this.e = ubw0Var3;
        this.f = x3p1.n(new zfn0(this, (byte) 0), sbn0.i, b5n0.R0, (o8n) null, new zfn0(this, (byte) 1), 8);
        j2i j2iVar = c3j.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(fmk0.W0, fmk0.X0);
    }

    public et90(Context context, yo31 yo31Var, los losVar, lzn0 lzn0Var) {
        this.a = (byte) 18;
        this.c = context;
        this.d = losVar;
        this.e = lzn0Var;
        lnm lnmVar = null;
        this.f = bzn1.w(this, new fbz0(this, (byte) 4), yo31Var, new lok0((Object) this, lnmVar, (byte) 23), new xx0((Object) this, lnmVar, (byte) 19));
        this.g = n3o1.r(this).c(g2z0.Q0, new aaq0(this, (byte) 8));
        this.b = new f70((byte) 14);
    }

    public et90(u9c0 u9c0Var, xec0 xec0Var, String str, xe01 xe01Var) {
        this.a = (byte) 1;
        this.c = u9c0Var;
        this.d = xec0Var;
        this.e = str;
        this.f = z0o1.k(xe01Var, new s2c0((Object) this, (byte) 3), new pdb0(this, (byte) 14), 4);
        j2i j2iVar = kvi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.r(this).c(new bt70(this, (byte) 22), lta0.b1);
    }

    public et90(p681 p681Var, eg40 eg40Var, lzn0 lzn0Var) {
        this.a = (byte) 27;
        this.c = p681Var;
        this.d = eg40Var;
        this.e = lzn0Var;
        this.f = z0o1.k(p681Var.c, ea71.a1, new q961(this, (byte) 29), 4);
        this.g = new azg(n3o1.r(this).c(vy61.b1, vy61.c1), (byte) 5);
        j2i j2iVar = ohj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(g3q0 g3q0Var, Context context, th30 th30Var) {
        this.a = (byte) 13;
        this.c = g3q0Var;
        this.d = context;
        this.e = th30Var;
        this.f = f2p1.p(new cnp0(this, (byte) 18), cwp0.T0, w0q0.e, (iu30) null, 24);
        this.g = n3o1.q(this).a(rmp0.P0, rmp0.Q0);
        j2i j2iVar = new j2i(368917185, new aso0(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(f1n0 f1n0Var, r241 r241Var, hgd0 hgd0Var) {
        this.a = (byte) 3;
        this.c = f1n0Var;
        this.d = r241Var;
        this.e = hgd0Var;
        this.f = k1o1.u(new td1((Object) this, (lnm) null, (byte) 7));
        j2i j2iVar = new j2i(2124556287, new qcd0(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(i2d0.P0, i2d0.Q0);
    }

    public et90(gw70 gw70Var, woa woaVar, kma kmaVar) {
        this.a = (byte) 9;
        this.c = gw70Var;
        this.d = woaVar;
        this.e = kmaVar;
        this.f = k1o1.p();
        this.g = new eih1();
        j2i j2iVar = new j2i(-1437882443, new hmk0(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(gw70 gw70Var, lzn0 lzn0Var, ZoneId zoneId, epb1 epb1Var) {
        this.a = (byte) 15;
        this.c = gw70Var;
        this.d = lzn0Var;
        this.e = zoneId;
        xuv0 xuv0Var = xuv0.Q0;
        t1t0 t1t0Var = new t1t0(this, (byte) 28);
        mwv0 mwv0Var = new mwv0(this, (byte) 1);
        bhh1 bhh1Var = igu.b;
        qtr qtrVar = new qtr();
        mwv0Var.invoke(qtrVar);
        this.f = new poy0(new w8z(epb1Var, (byte) 3), xuv0Var, t1t0Var, qtrVar, false, bhh1Var);
        this.g = new ia00("PrereleaseCompactCardElement", nzv0.b, nzv0.c);
        j2i j2iVar = new j2i(-1647508817, new qsu0(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(htz0 htz0Var, rm0 rm0Var, zob1 zob1Var) {
        this.a = (byte) 19;
        this.c = htz0Var;
        this.d = rm0Var;
        this.e = zob1Var;
        this.f = z0o1.j(new fbz0(this, (byte) 11), j8y0.e1, (iu30) null, 12);
        this.g = new eih1();
        j2i j2iVar = new j2i(-333150770, new zyy0(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(gw70 gw70Var, Connectable connectable, ysu0 ysu0Var, pdu0 pdu0Var, Scheduler scheduler, l6m0 l6m0Var) {
        this.a = (byte) 22;
        this.c = gw70Var;
        this.d = connectable;
        this.e = ysu0Var;
        this.f = pdu0Var;
        this.g = scheduler;
        this.b = l6m0Var;
    }

    public et90(List list, ytp0 ytp0Var, h301 h301Var, PublishSubject publishSubject) {
        this.a = (byte) 20;
        this.c = publishSubject;
        this.d = ytp0Var.k(list);
        this.e = new fjb((byte) 2);
        a401 a401Var = new a401((z301) null, 7);
        t7p0 t7p0Var = t7p0.r;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(b301.class, h301Var.a);
        subtypeEffectHandlerBuilderC.g(c301.class, h301Var.b);
        subtypeEffectHandlerBuilderC.c(e301.class, new lyw0(h301Var, (byte) 12));
        subtypeEffectHandlerBuilderC.g(f301.class, h301Var.d);
        this.f = sbl.z(a401Var, t7p0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), atz0.e, new fbz0(this, (byte) 18));
        this.g = n3o1.q(this).a(kxz0.h, kxz0.i);
        j2i j2iVar = new j2i(50221004, new zyy0(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(xu4 xu4Var, FlowableMap flowableMap, cbv cbvVar) {
        this.a = (byte) 16;
        this.c = xu4Var;
        this.d = flowableMap;
        this.e = cbvVar;
        this.f = d4o1.f(new hox0(this, (byte) 1), xox0.f, gbw0.V0, (iu30) null, 24);
        j2i j2iVar = gaj.c;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(cnx0.i, cnx0.t);
    }

    public et90(v4o0 v4o0Var, fjb fjbVar, z5a0 z5a0Var, Activity activity) {
        this.a = (byte) 0;
        this.c = v4o0Var;
        this.d = z5a0Var;
        this.e = activity;
        this.f = k1o1.u(new yyg(this, (lnm) null, (byte) 1));
        this.g = n3o1.q(this).a(rb80.X0, rb80.Y0);
        j2i j2iVar = new j2i(-1315292724, new wv60(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(j4f1 j4f1Var, zrg zrgVar, woa woaVar, kma kmaVar) {
        this.a = (byte) 5;
        this.c = zrgVar;
        this.d = woaVar;
        this.e = kmaVar;
        this.f = new rey0(new k2d0(this, (byte) 26));
        this.g = new hy00(j4f1Var, gce0.f, wud0.b1);
        j2i j2iVar = new j2i(-353622847, new m04(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(xe01 xe01Var, lc61 lc61Var, bpb1 bpb1Var) {
        this.a = (byte) 25;
        this.c = xe01Var;
        this.d = lc61Var;
        this.e = bpb1Var;
        this.f = new rey0(new u451(this, (byte) 14));
        j2i j2iVar = new j2i(1575393062, new hg31(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.r(this).c(vp51.U0, vp51.V0);
    }

    public et90(wh71 wh71Var, oud oudVar, dc31 dc31Var) {
        this.a = (byte) 24;
        this.c = wh71Var;
        this.d = oudVar;
        this.e = dc31Var;
        this.f = k1o1.p();
        this.g = new eih1();
        j2i j2iVar = new j2i(-1943708121, new hg31(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(koc0 koc0Var, mzr0 mzr0Var) {
        this.a = (byte) 26;
        this.c = mzr0Var;
        this.d = r6h1.c;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.e = bpb1VarB;
        this.f = x3p1.m(rqt0.u(new x010(new zo51(((roc0) koc0Var).d(), this, (byte) 7), bpb1VarB, new ap51(3, (lnm) null, (byte) 1), (byte) 1)), ec61.i, qr51.U0, (o8n) null, new q961(this, (byte) 4), 8);
        j2i j2iVar = jgj.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.r(this).c(new z821(this, (byte) 27), vp51.X0);
    }

    public et90(d0r d0rVar, String str, d2f1 d2f1Var, uk71 uk71Var) {
        this.a = (byte) 28;
        this.c = d2f1Var;
        this.d = uk71Var;
        this.e = new cly0(d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, hea1.N0, new j4r(hea1.Y), hea1.O0), hea1.Z), str), (byte) 11);
        this.f = x3p1.n(new kha1(this, (byte) 0), hea1.X, h9a1.U0, (o8n) null, new kha1(this, (byte) 1), 8);
        j2i j2iVar = new j2i(1480831076, new u491(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.r(this).c(r8a1.R0, r8a1.S0);
    }

    public et90(xe01 xe01Var, dfc0 dfc0Var, bpb1 bpb1Var) {
        this.a = (byte) 2;
        this.c = xe01Var;
        this.d = dfc0Var;
        this.e = bpb1Var;
        this.f = d4o1.f(new cfc0(this, (byte) 0), xdc0.g, f7c0.i, new cfc0(this, (byte) 1), 8);
        this.g = n3o1.q(this).a(lta0.c1, lta0.d1);
        j2i j2iVar = new j2i(1407916638, new pba0(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(p40 p40Var, thq thqVar) {
        this.a = (byte) 14;
        this.c = p40Var;
        this.d = thqVar;
        this.e = new hz5((byte) 11);
        this.f = h7w.D(new ewq0((Object) this, (byte) 5), null, null, new j2i(-655560669, new sw1(this, (byte) 28), true), 6);
        this.g = new eih1();
        j2i j2iVar = new j2i(-164200181, new t9r0(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(String str, f2y0 f2y0Var, u1y0 u1y0Var, asn asnVar) {
        this.a = (byte) 17;
        this.c = str;
        this.d = f2y0Var;
        this.e = asnVar;
        this.g = n3o1.q(this).a(cnx0.P0, cnx0.Q0);
        this.f = sbl.B(new c2y0(false, null), t7p0.m, u1y0Var, gbw0.a1, new hox0(this, (byte) 6));
        j2i j2iVar = new j2i(-190819356, new qsu0(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public et90(jo8 jo8Var, lzn0 lzn0Var, bzl0 bzl0Var) {
        this.a = (byte) 4;
        this.c = jo8Var;
        this.d = lzn0Var;
        this.e = bzl0Var;
        this.f = x3p1.n(new hmd0(this, (byte) 0), ecd0.Z0, x5d0.Y, (o8n) null, new hmd0(this, (byte) 1), 8);
        this.g = n3o1.q(this).a(new bt70(this, (byte) 29), i2d0.a1);
        this.b = new f70((byte) 9);
    }

    public et90(r7j0 r7j0Var, cbk0 cbk0Var, nxo nxoVar) {
        this.a = (byte) 7;
        this.c = r7j0Var;
        this.d = cbk0Var;
        this.e = nxoVar;
        this.f = new rey0(new mbj0(this, (byte) 9));
        j2i j2iVar = new j2i(-1651609577, new y3i0(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(eej0.a1, new pah0(this, (byte) 14));
    }

    public et90(gw70 gw70Var, lzn0 lzn0Var, zob1 zob1Var, maa maaVar) {
        this.a = (byte) 23;
        this.c = gw70Var;
        this.d = lzn0Var;
        this.e = maaVar;
        this.f = z0o1.j(new z5d(zob1Var, (byte) 5), h211.Y, new ak01(this, (byte) 17), 4);
        this.g = n3o1.q(this).a(rw01.c1, rw01.d1);
        j2i j2iVar = new j2i(279032542, new dr01(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }
}
