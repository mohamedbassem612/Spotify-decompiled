package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.deviceproxy.navigation.v1.NavigationCommand;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p5b0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p5b0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[Catch: Exception -> 0x005c, CancellationException -> 0x005f, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x005f, Exception -> 0x005c, blocks: (B:11:0x0025, B:21:0x0044, B:25:0x004b, B:27:0x0051, B:17:0x0035), top: B:33:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object b(ContextTrack contextTrack, lnm lnmVar) {
        nyh0 nyh0Var;
        String str;
        wp20 wp20Var = (wp20) this.b;
        if (lnmVar instanceof nyh0) {
            nyh0Var = (nyh0) lnmVar;
            int i = nyh0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nyh0Var.c = i - Integer.MIN_VALUE;
            } else {
                nyh0Var = new nyh0(this, lnmVar);
            }
        } else {
            nyh0Var = new nyh0(this, lnmVar);
        }
        Object objK = nyh0Var.a;
        int i2 = nyh0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                if (contextTrack != null) {
                    mr20 mr20VarN = wp20Var.N(contextTrack);
                    nyh0Var.c = 1;
                    objK = b5p1.k(mr20VarN, nyh0Var);
                    d9n d9nVar = d9n.a;
                    if (objK == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    str = "";
                }
                if (str.length() > 0) {
                    ((wfx) wp20Var.a).c(Uri.parse(str));
                }
                return rih1.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
            str = (String) objK;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                ((wfx) wp20Var.a).c(Uri.parse(str));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object c(qt80 qt80Var, lnm lnmVar) {
        h5f0 h5f0Var;
        i5f0 i5f0Var = (i5f0) this.b;
        if (lnmVar instanceof h5f0) {
            h5f0Var = (h5f0) lnmVar;
            int i = h5f0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h5f0Var.c = i - Integer.MIN_VALUE;
            } else {
                h5f0Var = new h5f0(this, lnmVar);
            }
        } else {
            h5f0Var = new h5f0(this, lnmVar);
        }
        h5f0 h5f0Var2 = h5f0Var;
        Object obj = h5f0Var2.a;
        int i2 = h5f0Var2.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (qt80Var instanceof r9w0) {
                h5f0Var2.c = 1;
                if (hap1.i(200L, h5f0Var2) != d9nVar) {
                }
            } else {
                if (!(qt80Var instanceof s9w0)) {
                    if (qt80Var instanceof q9w0) {
                        h5f0Var2.c = 4;
                        Object objB = o95.b(i5f0Var.P0, new Float(1.0f), (fe5) null, (Float) null, (iu30) null, h5f0Var2, 14);
                        if (objB != d9nVar) {
                            objB = rih1Var;
                        }
                        if (objB == d9nVar) {
                        }
                    }
                    return rih1Var;
                }
                h5f0Var2.c = 3;
                Object objB2 = o95.b(i5f0Var.P0, new Float(1.0f), (fe5) null, (Float) null, (iu30) null, h5f0Var2, 14);
                if (objB2 != d9nVar) {
                    objB2 = rih1Var;
                }
                if (objB2 != d9nVar) {
                    return rih1Var;
                }
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 4) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        h5f0Var2.c = 2;
        Object objB3 = o95.b(i5f0Var.P0, new Float(0.9f), (fe5) null, (Float) null, (iu30) null, h5f0Var2, 14);
        if (objB3 != d9nVar) {
            objB3 = rih1Var;
        }
        if (objB3 == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        awn0 awn0Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                yvg1 yvg1Var = (yvg1) obj;
                cxc0 cxc0Var = (cxc0) yvg1Var.a;
                Set set = (Set) yvg1Var.b;
                Iterable iterable = (Iterable) yvg1Var.c;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((wul1) it.next()).getData().a(cxc0Var));
                }
                ((rhg0) ((o860) ((wmy) obj2).c).e).a(dm61.y0(o7h.p1(arrayList), set), (ArrayList) null, (ArrayList) null);
                return rih1Var;
            case 1:
                ((uh0) obj2).invoke((n1i) obj);
                return rih1Var;
            case 2:
                ((k0d0) obj2).g = (t4u0) obj;
                return rih1Var;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                View view = (View) obj2;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.height = iIntValue;
                view.setLayoutParams(layoutParams);
                return rih1Var;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((b9e0) obj2).b.a.m((Object) null, bool);
                return rih1Var;
            case 5:
                oie0 oie0Var = (oie0) obj2;
                xab1 xab1Var = oie0Var.X;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                oie0Var.X = null;
                boe0 boe0Var = oie0Var.g;
                i8h1 i8h1Var = (i8h1) boe0Var.a.get();
                x6h1 x6h1VarC = boe0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                tso tsoVar = oie0Var.d;
                rne0 rne0Var = ((sie0) oie0Var.i.getValue()).a;
                ((iu30) tsoVar.d.getValue()).invoke(rne0Var != null ? new xne0(rne0Var.a, rne0Var.b) : new xne0((String) null, false));
                return rih1Var;
            case 6:
                mmr0 mmr0Var = (mmr0) obj;
                dre0 dre0Var = (dre0) obj2;
                boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) mmr0Var.b).booleanValue();
                if (!zBooleanValue) {
                    dre0Var.h = false;
                }
                lik1 lik1VarP = uap1.p(dre0Var.c, zBooleanValue, zBooleanValue2);
                if (lik1VarP != null && !dre0Var.h) {
                    dre0Var.h = true;
                    ((zn41) dre0Var.e.b).a("Notification close", gje0.S0);
                    dre0Var.d.f(uap1.h(lik1VarP));
                }
                return rih1Var;
            case 7:
                ((yse0) obj2).d = (String) obj;
                return rih1Var;
            case 8:
                return c((qt80) obj, lnmVar);
            case 9:
                ((Boolean) obj).getClass();
                Object objD = f1n0.d((f1n0) ((ur00) obj2).c, new dwn0("spotify:find", "", true, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), lnmVar);
                return objD == d9nVar ? objD : rih1Var;
            case 10:
                BehaviorSubject behaviorSubject = (BehaviorSubject) obj2;
                lik1 lik1Var = ((ssn0) obj).a;
                behaviorSubject.onNext(Optional.ofNullable(lik1Var != null ? lik1Var.a() : null));
                return rih1Var;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((ozf0) obj2).b.setNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view(bool2);
                return rih1Var;
            case 12:
                ((MainLayout) obj2).setNowPlayingViewMode((c7p0) obj);
                return rih1Var;
            case 13:
                List list = (List) obj;
                c3g0 c3g0Var = (c3g0) obj2;
                list.size();
                l7s l7sVar = c3g0Var.d;
                ArrayList arrayList2 = new ArrayList();
                boolean zC = c3g0Var.e.c();
                List<gvh0> list2 = list;
                if (!list2.isEmpty()) {
                    for (gvh0 gvh0Var : list2) {
                        if (gvh0Var == null) {
                            hhg1.n("route must not be null");
                            return null;
                        }
                        if (arrayList2.contains(gvh0Var)) {
                            hhg1.n("route descriptor already added");
                            return null;
                        }
                        arrayList2.add(gvh0Var);
                    }
                }
                jqd0 jqd0Var = new jqd0(arrayList2, zC);
                pvh0 pvh0Var = l7sVar.a;
                if (pvh0Var != null) {
                    pvh0Var.g(jqd0Var);
                }
                return rih1Var;
            case 14:
                cs31 cs31Var = (cs31) obj;
                cs31Var.a.size();
                p7s p7sVar = ((f3g0) obj2).b;
                c921.y(p7sVar.c, (o8n) null, 0, new eum(cs31Var, p7sVar, (lnm) null, (byte) 22), 3);
                return rih1Var;
            case 15:
                ((bzc) obj).getClass();
                ((wwh0) obj2).c();
                return rih1Var;
            case 16:
                return b((ContextTrack) obj, lnmVar);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Boolean bool3 = (Boolean) obj;
                Logger.b("Observed media3Enabled=" + bool3 + " from RC.", new Object[0]);
                hma1 hma1VarEdit = ((dma1) obj2).edit();
                bma1 bma1Var = k0i0.b;
                bool3.getClass();
                hma1VarEdit.a(bma1Var, bool3.booleanValue());
                hma1VarEdit.h();
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                u6i0 u6i0Var = (u6i0) obj;
                x3i0 x3i0Var = (x3i0) obj2;
                if (u6i0Var instanceof s6i0) {
                    x3i0Var.e(l231.a);
                } else {
                    x3i0Var.e(new y231(u6i0Var));
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                bha bhaVar = (fha) obj;
                if (bhaVar instanceof bha) {
                    ((ArrayList) obj2).add(bhaVar.a);
                } else if ((bhaVar instanceof aha) && !((aha) bhaVar).a.d.isEmpty()) {
                    eg.m("Transcoding failed");
                    return null;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Object objB = ((jfe) obj2).b(new oj31("numberColor", ((Number) obj).intValue()), lnmVar);
                return objB == d9nVar ? objB : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                h1r h1rVar = (k1r) obj;
                v8k0 v8k0Var = (v8k0) obj2;
                if (h1rVar instanceof i1r) {
                    v8k0Var.i();
                } else if (h1rVar instanceof j1r) {
                    v8k0Var.j();
                } else {
                    if (!(h1rVar instanceof h1r)) {
                        eg.o();
                        return null;
                    }
                    v8k0Var.h(new IllegalStateException(h1rVar.a.getMessage()));
                }
                return rih1Var;
            case 22:
                if (((Boolean) obj).booleanValue()) {
                    ((wik0) obj2).d.c = false;
                }
                return rih1Var;
            case 23:
                ((Boolean) obj).getClass();
                fjk0 fjk0Var = (fjk0) obj2;
                Object objD2 = d0r.d((d0r) fjk0Var.d, pwc0.e, new g4d0((String) fjk0Var.e), new e4d0(u2d0.a), lnmVar);
                return objD2 == d9nVar ? objD2 : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (((Boolean) obj).booleanValue()) {
                    uem0 uem0Var = (uem0) obj2;
                    uem0Var.d.a(uem0Var.b.a);
                }
                return rih1Var;
            case 25:
                ((rmm0) obj2).c.t(((Number) obj).floatValue());
                return rih1Var;
            case 26:
                bpb1 bpb1Var = (bpb1) ((fdc) obj2).f;
                i091 i091VarM0 = fdc.m0((z590) obj);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, i091VarM0);
                return rih1Var;
            case 27:
                if (((Boolean) obj).booleanValue()) {
                    Iterator it2 = ((utm0) obj2).b.f.iterator();
                    while (it2.hasNext()) {
                        w590 w590Var = ((cbu0) it2.next()).c;
                        if (w590Var != null) {
                            w590Var.n();
                        }
                    }
                }
                return rih1Var;
            case 28:
                ((Boolean) obj).getClass();
                ((sfn0) obj2).a.D();
                return rih1Var;
            default:
                NavigationCommand navigationCommand = (NavigationCommand) obj;
                Logger.g("[NAV_CMD] Navigating (command=%s, interaction=%s)", new Object[]{navigationCommand.o(), navigationCommand.p()});
                dcs dcsVar = ((bun0) obj2).c;
                dcsVar.getClass();
                String strP = navigationCommand.p();
                strP.getClass();
                if (strP.length() <= 0) {
                    strP = null;
                }
                if (strP != null) {
                    ou80.Companion.getClass();
                    awn0Var = new awn0(new ou80(strP));
                }
                Intent intentA = dcsVar.b.a(new dwn0(navigationCommand.getUri(), "", false, false, 0, 0, false, (a690) null, (Bundle) null, awn0Var));
                intentA.addFlags(268435456);
                dcsVar.a.startActivity(intentA);
                return rih1Var;
        }
    }
}
