package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumDestinationPageResponse;
import com.spotify.profile.profile.proto.PlaylistlistResponse;
import com.spotify.profile.profilelist.datasource.PartialProfileListDataException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n0v0 implements ya, jrn0, k2i1, Function, pl3, r6b0, Init, qiw {
    public final /* synthetic */ byte a;
    public final Object b;

    public n0v0(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = b380.m();
                break;
            case 28:
                this.b = new ydf0(20);
                break;
            default:
                this.b = new q5f0((Object) null);
                break;
        }
    }

    public boolean accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return !((ya) obj2).accept((ksk) obj);
            default:
                return ((i5y0) obj2).b.g();
        }
    }

    public Object apply(Object obj) {
        Object objInvoke;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                return ((zhq0) obj2).l((PremiumDestinationPageResponse) obj);
            case 6:
                Throwable th = (Throwable) obj;
                PartialProfileListDataException partialProfileListDataException = th instanceof PartialProfileListDataException ? (PartialProfileListDataException) th : null;
                return new tax0(partialProfileListDataException != null ? partialProfileListDataException.a : ((p8x0) obj2).c);
            case 7:
                tzr0 tzr0Var = (tzr0) obj2;
                h290<PlaylistlistResponse.Playlist> h290VarO = ((PlaylistlistResponse.PlaylistList) obj).o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (PlaylistlistResponse.Playlist playlist : h290VarO) {
                    playlist.getClass();
                    String uri = playlist.getUri();
                    uri.getClass();
                    arrayList.add(new obx0(tzr0.u(uri), uri, playlist.getName(), ((Activity) tzr0Var.b).getResources().getQuantityString(2131820865, playlist.n(), Integer.valueOf(playlist.n())), playlist.getImageUrl(), new q730(playlist.n(), 11), playlist.o(), 3904));
                }
                return new j8x0(3, arrayList, (String) null, false, 124);
            case 8:
                return Boolean.valueOf(u890.j(((ContextTrack) obj).uri(), ((ContextTrack) obj2).uri()));
            case 13:
                ArrayList arrayList2 = ((e5z0) obj2).d;
                int iS = zno1.s(q7h.U(arrayList2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : arrayList2) {
                    linkedHashMap.put(obj3, null);
                }
                return new x8z0(linkedHashMap);
            case 16:
                vqv0 vqv0Var = ((qpz0) obj2).b;
                j4b1 j4b1Var = j4b1.L2;
                gj5 gj5Var = (gj5) vqv0Var.b;
                qd70 qd70Var = ((rd70) ee70.a(j4b1Var, gj5Var.getString(2131955714), gj5Var.getString(2131955713), HubsImmutableComponentBundle.b.a.J("radio-hub-placeholder", "radio-hub-error-empty-view").o())).a;
                boolean zJ = u890.j("radio-hub-error-empty-view", qd70Var.i.j("radio-hub-placeholder"));
                jyo1 jyo1Var = qd70Var;
                if (!zJ) {
                    pd70 pd70Var = new pd70(qd70Var);
                    pd70Var.i = pd70Var.i.I("radio-hub-placeholder", "radio-hub-error-empty-view");
                    jyo1Var = pd70Var;
                }
                return new epz0(jyo1Var.f());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                oy21 oy21Var = (py21) obj;
                o211 o211Var = new o211((cr6) obj2, (byte) 0);
                if (oy21Var instanceof ly21) {
                    objInvoke = CompletableEmpty.a;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = o211Var.invoke(oy21Var.a);
                }
                return (CompletableSource) objInvoke;
            case 22:
                return Boolean.valueOf(((gmt) obj2).p((ContextTrack) obj));
            default:
                k401 k401Var = (k401) obj;
                return rqt0.F(o6x.a, new d821((ak1) obj2, k401Var, (lnm) null, (byte) 4)).toObservable().onErrorReturn(new mlw0(k401Var, (byte) 21));
        }
    }

    public void b(Uri uri) {
        try {
            ((fg0) this.b).b(uri.toString());
        } catch (IllegalStateException e) {
            Logger.e(e, "Exception when launching checkout", new Object[0]);
        }
    }

    public int c(int i, int i2) {
        return c13.e(1.0f, ((Number) ((tob1) this.b).getValue()).floatValue(), (i2 - i) / 2.0f);
    }

    public void d(ArrayList arrayList, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2098566705);
        int i2 = i | (x340Var.i(arrayList) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384 | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var).g;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarO = td6.o(u85Var, 32, qim0Var3);
            boolean zI = x340Var.i(arrayList) | x340Var.i(this) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ozu0(arrayList, this, iu30Var, (byte) 20);
                x340Var.s0(objT);
            }
            ujo1.d(qim0VarO, (xtb0) null, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 510);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(this, arrayList, iu30Var, qim0Var2, i, (byte) 4);
        }
    }

    public First e0(Object obj) {
        vw11 vw11Var = (vw11) this.b;
        return First.c((sx11) obj, Collections.singleton(new zv11(vw11Var.e.b, vw11Var.R0)));
    }

    public void g(k0y0 k0y0Var, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(245551536);
        int i2 = (b0kVar2.i(k0y0Var) ? 4 : 2) | i | (b0kVar2.i(this) ? 32 : 16);
        byte b = 0;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = gio1.b(Collections.singletonList(new h8k1(k0y0Var, k0y0Var)));
                b0kVar2.s0(objT);
            }
            m0y0 m0y0Var = (m0y0) this.b;
            dnc0 dnc0Var = new dnc0(cwl1.C(m0y0Var.b), (Function0) null, (Function0) null, (cc9) null, (guh0) null, 126);
            two1.v(dnc0Var, (wen0) objT, false, new l0y0(m0y0Var, b));
            cnc0 cnc0VarA = dnc0Var.a();
            iac0 iac0Var = (iac0) b0kVar2.k(jfe0.a);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = (snc0) cnc0VarA.a.invoke();
                b0kVar2.s0(objT2);
            }
            snc0 snc0Var = (snc0) objT2;
            boolean zI = b0kVar2.i(snc0Var);
            Object objT3 = b0kVar2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new s1d0(snc0Var, (byte) 1);
                b0kVar2.s0(objT3);
            }
            qxd0.i(snc0Var, (iu30) objT3, b0kVar2);
            b0kVar2.i0(-1354814709);
            boolean zG = b0kVar2.g(snc0Var);
            Object objT4 = b0kVar2.T();
            if (zG || objT4 == m4cVar) {
                zob1 zob1VarB = snc0Var.b();
                LinkedHashMap linkedHashMap = cnc0VarA.d;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), (maa) ((vu30) entry.getValue()).invoke(snc0Var.getMetadata(), iac0Var));
                }
                hz81 hz81Var = new hz81(zob1VarB, linkedHashMap2, cnc0VarA.b);
                b0kVar2.s0(hz81Var);
                objT4 = hz81Var;
            }
            hz81 hz81Var2 = (hz81) objT4;
            hz81Var2.a(b0kVar2, 0);
            b0kVar2.r(false);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            xap1.d(hz81Var2, b0kVar2, 8);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(this, k0y0Var, i, (byte) 5);
        }
    }

    public r6b0 h(heg hegVar, ajn0 ajn0Var) {
        return null;
    }

    public void i(uw01 uw01Var) {
        ((v280) this.b).c(uw01Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object j(p.ip1 r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.yd31
            if (r0 == 0) goto L13
            r0 = r8
            p.yd31 r0 = (p.yd31) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.yd31 r0 = new p.yd31
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            int r7 = r0.c
            java.lang.String r1 = r0.b
            java.util.Iterator r4 = r0.a
            p.hm5.M(r8)
            p.e331 r8 = (p.e331) r8
            java.lang.Object r8 = r8.a
            goto L68
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L37:
            p.hm5.M(r8)
            java.util.Set r7 = r7.a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r3
        L44:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L78
            java.lang.Object r8 = r4.next()
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r8 = r6.b
            p.jjk0 r8 = (p.jjk0) r8
            r0.a = r4
            r0.b = r1
            r0.c = r7
            r0.f = r2
            p.qjk0 r8 = (p.qjk0) r8
            java.lang.Object r8 = r8.e(r1, r0, r3)
            p.d9n r5 = p.d9n.a
            if (r8 != r5) goto L68
            return r5
        L68:
            java.lang.Throwable r8 = p.e331.a(r8)
            if (r8 == 0) goto L44
            java.lang.String r5 = "Failed to revert mix for %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.spotify.base.java.logging.Logger.e(r8, r5, r1)
            goto L44
        L78:
            p.is1 r6 = p.is1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n0v0.j(p.ip1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(dcq0 dcq0Var, onm onmVar) {
        k621 k621Var;
        if (onmVar instanceof k621) {
            k621Var = (k621) onmVar;
            int i = k621Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k621Var.d = i - Integer.MIN_VALUE;
            } else {
                k621Var = new k621(this, onmVar);
            }
        } else {
            k621Var = new k621(this, onmVar);
        }
        Object obj = k621Var.b;
        int i2 = k621Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableC = ((byp0) this.b).c(dcq0Var.a, dcq0Var.b);
                k621Var.a = dcq0Var;
                k621Var.d = 1;
                Object objI = fc11.i(completableC, k621Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dcq0Var = k621Var.a;
                hm5.M(obj);
            }
            return new vdq0(dcq0Var.b.a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(l1d.m("Remove download failed for: ", dcq0Var.a), new Object[]{e2});
            return new beq0(dcq0Var.a);
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        byte b = this.a;
        crn0 crn0Var = crn0.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ru9 ru9Var = (ru9) obj;
                tym0 tym0Var = (tym0) ru9Var.b;
                if (!((Boolean) ((o241) ru9Var.d).a.map(cj20.c1).blockingFirst()).booleanValue()) {
                    return crn0Var;
                }
                Set set = s4b1.f;
                String strK = zjy.k(intent);
                if (strK == null) {
                    hhg1.n("Required value was null.");
                } else if (((Pattern) tym0Var.b).matcher(strK).matches()) {
                    String strZ0 = ihc1.Z0(strK, ":episode");
                    tos tosVar = (tos) ru9Var.c;
                    fn31.T(cto1.q(tosVar.d), (o8n) null, 0, new p1r(tosVar, strZ0, (lnm) null, (byte) 7), 3);
                    if (((Pattern) tym0Var.b).matcher(strK).matches()) {
                        return new frn0(mno1.h(new mmr0[]{new mmr0("uri", strZ0), new mmr0("episodeUri", "spotify:episode:".concat(ihc1.U0(strK, "episode:", strK))), new mmr0("enable_downloads_filter", Boolean.valueOf(u890.j(intent.getStringExtra("filter"), "downloaded"))), new mmr0("username", th61Var.a)}), k481.class);
                    }
                    hhg1.n("Invalid uri passed: ".concat(strK));
                } else {
                    hhg1.n("Invalid uri passed: ".concat(strK));
                }
                return null;
            default:
                xrk xrkVar = (xrk) ((wf2) obj).b;
                Bundle extras = intent.getExtras();
                rr21 rr21Var = extras != null ? (rr21) jhc1.t(extras, "reserved_onboarding", rr21.class) : null;
                return (xrkVar.a() && xrkVar.b && rr21Var != null) ? new hrn0(or21.class, rr21Var, new c6w0(3, false, (hd5) null, 14)) : crn0Var;
        }
    }

    public s6b0 m(ajn0 ajn0Var) {
        if ("b".equals(ajn0Var.b())) {
            return new za01(this, (byte) 2);
        }
        return null;
    }

    public vgq0 o() {
        return new vgq0(this);
    }

    public void p(s01 s01Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        byte b = s01Var.a;
        if (b == 1) {
            recyclerView.Q0.n0(recyclerView, s01Var.b, s01Var.d);
            return;
        }
        if (b == 2) {
            recyclerView.Q0.q0(recyclerView, s01Var.b, s01Var.d);
        } else if (b == 4) {
            recyclerView.Q0.s0(recyclerView, s01Var.b, s01Var.d, s01Var.c);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.Q0.p0(recyclerView, s01Var.b, s01Var.d);
        }
    }

    public w611 q(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int childCount = ((RecyclerView) recyclerView.f.a.b).getChildCount();
        w611 w611Var = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            w611 w611VarU = RecyclerView.U(((RecyclerView) recyclerView.f.a.b).getChildAt(i2));
            if (w611VarU != null && !w611VarU.v() && w611VarU.c == i) {
                if (!recyclerView.f.c.contains(w611VarU.a)) {
                    w611Var = w611VarU;
                    break;
                }
                w611Var = w611VarU;
            }
        }
        if (w611Var == null) {
            return null;
        }
        if (!recyclerView.f.c.contains(w611Var.a)) {
            return w611Var;
        }
        boolean z = RecyclerView.b2;
        return null;
    }

    public void r(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int childCount = ((RecyclerView) recyclerView.f.a.b).getChildCount();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = ((RecyclerView) recyclerView.f.a.b).getChildAt(i6);
            w611 w611VarU = RecyclerView.U(childAt);
            if (w611VarU != null && !w611VarU.C() && (i4 = w611VarU.c) >= i && i4 < i5) {
                w611VarU.j(2);
                if (obj == null) {
                    w611VarU.j(1024);
                } else if ((1024 & w611VarU.t) == 0) {
                    if (w611VarU.X == null) {
                        ArrayList arrayList = new ArrayList();
                        w611VarU.X = arrayList;
                        w611VarU.Y = Collections.unmodifiableList(arrayList);
                    }
                    w611VarU.X.add(obj);
                }
                childAt.getLayoutParams().c = true;
            }
        }
        n611 n611Var = recyclerView.c;
        ArrayList arrayList2 = n611Var.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            w611 w611Var = (w611) arrayList2.get(size);
            if (w611Var != null && (i3 = w611Var.c) >= i && i3 < i5) {
                w611Var.j(2);
                n611Var.h(size);
            }
        }
        recyclerView.L1 = true;
    }

    public void s(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int childCount = ((RecyclerView) recyclerView.f.a.b).getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            w611 w611VarU = RecyclerView.U(((RecyclerView) recyclerView.f.a.b).getChildAt(i3));
            if (w611VarU != null && !w611VarU.C() && w611VarU.c >= i) {
                if (RecyclerView.c2) {
                    w611VarU.toString();
                }
                w611VarU.z(i2, false);
                recyclerView.H1.f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            w611 w611Var = (w611) arrayList.get(i4);
            if (w611Var != null && w611Var.c >= i) {
                if (RecyclerView.c2) {
                    w611Var.toString();
                }
                w611Var.z(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.K1 = true;
    }

    public void t(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int childCount = ((RecyclerView) recyclerView.f.a.b).getChildCount();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            w611 w611VarU = RecyclerView.U(((RecyclerView) recyclerView.f.a.b).getChildAt(i11));
            if (w611VarU != null && (i9 = w611VarU.c) >= i4 && i9 <= i3) {
                if (RecyclerView.c2) {
                    w611VarU.toString();
                }
                if (w611VarU.c == i) {
                    w611VarU.z(i2 - i, false);
                } else {
                    w611VarU.z(i5, false);
                }
                recyclerView.H1.f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            w611 w611Var = (w611) arrayList.get(i12);
            if (w611Var != null && (i8 = w611Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    w611Var.z(i2 - i, false);
                } else {
                    w611Var.z(i10, false);
                }
                if (RecyclerView.c2) {
                    w611Var.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.K1 = true;
    }

    public oi u(yqu0 yqu0Var, ha4 ha4Var) {
        long j;
        boolean z;
        long jI;
        q5f0 q5f0Var = (q5f0) this.b;
        ArrayList arrayList = (ArrayList) yqu0Var.c;
        q5f0 q5f0Var2 = new q5f0(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            jav0 jav0Var = (jav0) arrayList.get(i);
            long j2 = jav0Var.a;
            iav0 iav0Var = (iav0) q5f0Var.b(j2);
            if (iav0Var == null) {
                j = jav0Var.b;
                jI = jav0Var.d;
                z = false;
            } else {
                long j3 = iav0Var.a;
                j = j3;
                z = iav0Var.c;
                jI = ha4Var.I(iav0Var.b);
            }
            long j4 = jav0Var.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            q5f0Var2.g(j4, new hav0(j4, jav0Var.b, jav0Var.d, jav0Var.e, jav0Var.f, j, jI, z, jav0Var.g, jav0Var.i, jav0Var.j, jav0Var.k, jav0Var.l, jav0Var.m));
            boolean z2 = jav0Var.e;
            if (z2) {
                q5f0Var.g(j2, new iav0(jav0Var.b, jav0Var.c, z2));
            } else {
                q5f0Var.h(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new oi(q5f0Var2, yqu0Var);
    }

    public void v(Object obj) {
        pqw0 pqw0Var = (sqw0) obj;
        bz11 bz11Var = ((sj21) this.b).a;
        RadioGroup radioGroup = (RadioGroup) bz11Var.h;
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            qqw0 qqw0Var = qqw0.a;
            if (pqw0Var.equals(qqw0Var)) {
                return;
            }
            if (pqw0Var.equals(oqw0.a)) {
                ((MaterialRadioButton) bz11Var.k).setChecked(true);
                return;
            }
            if (pqw0Var instanceof pqw0) {
                String str = pqw0Var.a;
                ((MaterialRadioButton) bz11Var.f).setChecked(true);
                ((EditText) bz11Var.d).setText(str);
            } else if (pqw0Var.equals(qqw0Var)) {
                radioGroup.clearCheck();
            } else if (pqw0Var.equals(rqw0.a)) {
                ((MaterialRadioButton) bz11Var.j).setChecked(true);
            } else {
                eg.o();
            }
        }
    }

    public void a() {
    }

    public n0v0(mh0 mh0Var, fyf fyfVar, zxf zxfVar) {
        this.a = (byte) 3;
        this.b = mh0Var.i(new jqv0(zxfVar, true), new v3v0(1, PremiumCheckoutActivity.o1, iqv0.class, "isMyResult", "isMyResult(Landroid/content/Intent;)Z", 0, (byte) 7), new v8g(fyfVar, (byte) 1));
    }

    public n0v0(d0r d0rVar) {
        this.a = (byte) 14;
        this.b = new rhg0(d0rVar, (ukj0) null);
    }

    public /* synthetic */ n0v0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void e(ajn0 ajn0Var, Object obj) {
    }

    public void n(ajn0 ajn0Var, jeg jegVar) {
    }

    public void f(ajn0 ajn0Var, heg hegVar, ajn0 ajn0Var2) {
    }
}
