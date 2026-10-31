package p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y11 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y11(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        List list;
        Object value;
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                w11 w11Var = (w11) obj;
                MobiusLoopViewModel mobiusLoopViewModel = ((b21) obj2).T1;
                if (mobiusLoopViewModel != null) {
                    mobiusLoopViewModel.U(w11Var);
                    return;
                }
                return;
            case 1:
                ObservableEmitter observableEmitter = (ObservableEmitter) obj2;
                r33 r33Var = ((s33) obj).d;
                if (r33Var instanceof n33) {
                    observableEmitter.onNext(new r13(((n33) r33Var).a));
                    observableEmitter.onComplete();
                    return;
                } else {
                    if (r33Var instanceof o33) {
                        observableEmitter.onNext(new s13(((o33) r33Var).a));
                        observableEmitter.onComplete();
                        return;
                    }
                    return;
                }
            case 2:
                ijo ijoVar = (ijo) obj;
                bpb1 bpb1Var = ((b93) obj2).c;
                ijoVar.getClass();
                bpb1Var.m((Object) null, ijoVar);
                return;
            case 3:
                en8 en8Var = (en8) obj;
                bpb1 bpb1Var2 = ((wm8) obj2).d;
                en8Var.getClass();
                bpb1Var2.m((Object) null, en8Var);
                return;
            case 4:
                ((cn) obj2).accept((hlh) obj);
                return;
            case 5:
                jbn jbnVar = (jbn) obj2;
                tan tanVar = ((wan) obj).a;
                jbnVar.e.a = tanVar;
                tbr0 tbr0VarC = jbnVar.b.c();
                tbr0VarC.b.b(tbr0VarC.c, new y231(tanVar), tan.class);
                tbr0VarC.a.pop();
                return;
            case 6:
                ijo ijoVar2 = (ijo) obj;
                bpb1 bpb1Var3 = ((gjo) obj2).b;
                ijoVar2.getClass();
                bpb1Var3.m((Object) null, ijoVar2);
                return;
            case 7:
                ijo ijoVar3 = (ijo) obj;
                bpb1 bpb1Var4 = ((qko) obj2).g;
                ijoVar3.getClass();
                bpb1Var4.m((Object) null, ijoVar3);
                return;
            case 8:
                ijo ijoVar4 = (ijo) obj;
                bpb1 bpb1Var5 = ((mlo) obj2).f;
                ijoVar4.getClass();
                bpb1Var5.m((Object) null, ijoVar4);
                return;
            case 9:
                ((Subject) obj2).onNext(obj);
                return;
            case 10:
                xod0 xod0Var = (xod0) obj;
                nh00 nh00Var = (nh00) obj2;
                kdn0 kdn0Var = nh00Var.h;
                kdn0Var.m(xod0Var);
                if ((xod0Var instanceof uod0) && ((uod0) xod0Var).a != null) {
                    nh00Var.i();
                } else if (xod0Var instanceof sod0) {
                    nh00Var.h(((sod0) xod0Var).a);
                }
                kdn0Var.m(xod0Var);
                return;
            case 11:
                iw30 iw30Var = (iw30) obj2;
                iw30Var.i();
                iw30Var.h.m((bob1) obj);
                return;
            case 12:
                gau gauVar = (gau) obj;
                v7m0 v7m0Var = (v7m0) ((kz50) obj2).a;
                gauVar.getClass();
                v7m0Var.a.accept(gauVar);
                return;
            case 13:
                wz81 wz81Var = (yz81) obj;
                vnc0 vnc0Var = (vnc0) obj2;
                bpb1 bpb1Var6 = vnc0Var.f;
                bpb1 bpb1Var7 = vnc0Var.d;
                if (!(wz81Var instanceof wz81)) {
                    if (wz81Var instanceof pz81) {
                        m5e0 m5e0Var = new m5e0((Throwable) ((pz81) wz81Var).a.get(0));
                        bpb1Var6.getClass();
                        bpb1Var6.m((Object) null, m5e0Var);
                        return;
                    } else {
                        if (!(wz81Var instanceof xz81)) {
                            eg.o();
                            return;
                        }
                        rnc0 rnc0Var = new rnc0();
                        bpb1Var7.getClass();
                        bpb1Var7.m((Object) null, rnc0Var);
                        return;
                    }
                }
                int i = vnc0Var.g;
                wz81 wz81Var2 = wz81Var;
                int i2 = wz81Var2.d;
                int i3 = wz81Var2.e;
                if (i < i3) {
                    vnc0Var.e.l(wz81Var2.a);
                    vnc0Var.g = i3;
                }
                if (vnc0Var.h < i2) {
                    rnc0 rnc0Var2 = new rnc0(i2, wz81Var2.f);
                    bpb1Var7.getClass();
                    bpb1Var7.m((Object) null, rnc0Var2);
                    vnc0Var.h = i2;
                }
                f5e0 f5e0Var = new f5e0(rih1.a);
                bpb1Var6.getClass();
                bpb1Var6.m((Object) null, f5e0Var);
                return;
            case 14:
                mh00 mh00Var = (mh00) obj;
                wod0 wod0Var = (wod0) obj2;
                if (!(mh00Var instanceof yg00)) {
                    l6d0 l6d0Var = wod0Var.e;
                    mh00Var.getClass();
                    l6d0Var.invoke(mh00Var);
                    return;
                } else {
                    b431 b431Var = wod0Var.f;
                    if (b431Var != null) {
                        yg00 yg00Var = (yg00) mh00Var;
                        b431Var.a(new fne0(yg00Var.a), yg00Var.b.a);
                        return;
                    }
                    return;
                }
            case 15:
                uu50 uu50Var = (uu50) obj;
                m1p0 m1p0Var = (m1p0) obj2;
                if (uu50Var instanceof su50) {
                    m1p0Var.d.setCollapsed(true);
                    return;
                }
                m1p0Var.getClass();
                if (!(uu50Var instanceof tu50)) {
                    eg.o();
                    return;
                }
                tu50 tu50Var = (tu50) uu50Var;
                f1p0 f1p0Var = new f1p0(tu50Var.a, tu50Var.b, tu50Var.c, tu50Var.d, new CompletableFromAction(new wqd0(m1p0Var, (byte) 11)));
                tka0 tka0Var = dtw.C;
                lb5 lb5Var = m1p0Var.d;
                dtw dtwVarB = mhc.b(lb5Var.getContext(), m1p0Var.d, m1p0Var.a, f1p0Var, (ipb1) null, 112);
                lb5Var.removeAllViews();
                View view = dtwVarB.w;
                lb5Var.addView(view);
                lb5Var.setCollapsed(false);
                if (m1p0Var.b) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = 0;
                    marginLayoutParams.rightMargin = 0;
                    ce0 ce0Var = m1p0Var.e;
                    mma0 mma0Var = m1p0.f[0];
                    marginLayoutParams.bottomMargin = ((Number) ((sgp0) ce0Var).a).intValue() - ((Number) m1p0Var.c.getValue()).intValue();
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 16:
                ((qzh) obj2).f(obj);
                return;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ad2 ad2Var = (ad2) obj;
                bpb1 bpb1Var8 = ((hms0) obj2).a;
                ad2Var.getClass();
                bpb1Var8.getClass();
                bpb1Var8.m((Object) null, ad2Var);
                return;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qfw0 qfw0Var = (qfw0) obj;
                ofw0 ofw0Var = (ofw0) obj2;
                bpb1 bpb1Var9 = ofw0Var.q;
                bpb1 bpb1Var10 = ofw0Var.o;
                if (qfw0Var.g.a && !qfw0Var.j) {
                    z = true;
                }
                bpb1Var10.m((Object) null, Boolean.valueOf(z));
                ofw0Var.p.m((Object) null, Boolean.valueOf(qfw0Var.b));
                i091 i091Var = qfw0Var.e;
                if (i091Var != null) {
                    bpb1Var9.m((Object) null, i091Var);
                    return;
                } else {
                    if (bpb1Var9.getValue() != null) {
                        bpb1Var9.m((Object) null, pfw0.a);
                        return;
                    }
                    return;
                }
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                whx0 whx0Var = (whx0) obj;
                bpb1 bpb1Var11 = ((nix0) obj2).h;
                whx0Var.getClass();
                bpb1Var11.m((Object) null, whx0Var);
                return;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((MobiusLoopViewModel) obj2).U((ktx0) obj);
                return;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                gw11 gw11Var = (gw11) obj;
                ox11 ox11Var = (ox11) obj2;
                ox11Var.h = true;
                Consumer consumer = ox11Var.c.U0;
                if (consumer != null) {
                    consumer.accept(gw11Var);
                    return;
                } else {
                    u890.C("mobiusOutput");
                    throw null;
                }
            case 22:
                o731 o731Var = (o731) obj;
                bpb1 bpb1Var12 = ((n731) obj2).b;
                o731Var.getClass();
                bpb1Var12.m((Object) null, o731Var);
                return;
            case 23:
                hc91 hc91Var = (jc91) obj;
                bpb1 bpb1Var13 = ((ac91) obj2).e;
                if (hc91Var instanceof hc91) {
                    list = hc91Var.b;
                } else {
                    if (!u890.j(hc91Var, ic91.a)) {
                        eg.o();
                        return;
                    }
                    list = z6x.a;
                }
                bpb1Var13.m((Object) null, list);
                return;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Map map = (Map) obj;
                w2c1 w2c1Var = (w2c1) obj2;
                bpb1 bpb1Var14 = w2c1Var.f;
                map.getClass();
                u2c1 u2c1Var = new u2c1(map);
                bpb1Var14.getClass();
                bpb1Var14.m((Object) null, u2c1Var);
                w2c1Var.c.j(map);
                return;
            default:
                acm1 acm1Var = (acm1) obj;
                bpb1 bpb1Var15 = ((ahm1) obj2).e;
                do {
                    value = bpb1Var15.getValue();
                    acm1Var.getClass();
                } while (!bpb1Var15.k(value, new wgm1(acm1Var.a, acm1Var.b, acm1Var.d, acm1Var.e)));
                return;
        }
    }
}
