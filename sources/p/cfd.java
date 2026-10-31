package p;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.concertsgalleryview.v1.ContentItem;
import com.spotify.concertsgalleryview.v1.GetGalleryPageResponse;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.PublishSubject;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import spotify.collection.esperanto.proto.CollectionContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cfd implements ird1, Function, lqw, ree, j720, BiFunction, MaybeOnSubscribe, jrn0, i311, wm51 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public cfd(String str, ayp aypVar, eu4 eu4Var) {
        this.a = (byte) 17;
        this.b = eu4Var;
        zo5 zo5Var = (zo5) ((pug) ((p2o0) aypVar.a.c).b).n;
        c8o.l(zo5Var);
        this.c = new xid((Object) str, (Object) zo5Var, (byte) 15);
    }

    public static ArrayList i(GetGalleryPageResponse getGalleryPageResponse) {
        List<ContentItem> itemsList = getGalleryPageResponse.getItemsList();
        ArrayList arrayList = new ArrayList();
        for (ContentItem contentItem : itemsList) {
            int iO = contentItem.o();
            int i = iO == 0 ? -1 : hpk.a[l1d.C(iO)];
            String strQ = null;
            if (i != -1) {
                if (i == 1) {
                    strQ = contentItem.n().q();
                } else if (i != 2 && i != 3 && i != 4 && i != 5) {
                    eg.o();
                    return null;
                }
            }
            if (strQ != null) {
                arrayList.add(strQ);
            }
        }
        return arrayList;
    }

    public static final Object n(bke bkeVar, uie uieVar, ela elaVar, iu30 iu30Var, iu30 iu30Var2, zn0 zn0Var) {
        int iOrdinal = bkeVar.ordinal();
        d9n d9nVar = d9n.a;
        if (iOrdinal == 0) {
            Object objInvoke = uieVar.invoke(zn0Var);
            if (objInvoke == d9nVar) {
                return objInvoke;
            }
        } else if (iOrdinal == 1) {
            Object objInvoke2 = elaVar.invoke(zn0Var);
            if (objInvoke2 == d9nVar) {
                return objInvoke2;
            }
        } else if (iOrdinal == 2) {
            Object objInvoke3 = iu30Var.invoke(zn0Var);
            if (objInvoke3 == d9nVar) {
                return objInvoke3;
            }
        } else {
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            Object objInvoke4 = iu30Var2.invoke(zn0Var);
            if (objInvoke4 == d9nVar) {
                return objInvoke4;
            }
        }
        return rih1.a;
    }

    public static cfd p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131624428, viewGroup, false);
        ComposeView composeViewT = m5n1.t(viewInflate, 2131429832);
        if (composeViewT != null) {
            return new cfd(viewInflate, (Object) composeViewT, (byte) 23);
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131429832)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object q(cfd cfdVar, String str, onm onmVar) {
        v0f v0fVar;
        if (onmVar instanceof v0f) {
            v0fVar = (v0f) onmVar;
            int i = v0fVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v0fVar.c = i - Integer.MIN_VALUE;
            } else {
                v0fVar = new v0f(cfdVar, onmVar);
            }
        } else {
            v0fVar = new v0f(cfdVar, onmVar);
        }
        Object objW = v0fVar.a;
        int i2 = v0fVar.c;
        if (i2 == 0) {
            hm5.M(objW);
            v0fVar.c = 1;
            objW = cfdVar.w(str, v0fVar);
            d9n d9nVar = d9n.a;
            if (objW == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objW);
        }
        return Boolean.valueOf(((hoe) objW).a);
    }

    public Object a(List list, b751 b751Var) {
        Object objP;
        return (!list.isEmpty() && (objP = l4p1.p(new lt20(hu20.b(5, new huz(list, (byte) 8), new zti(this, (lnm) null, (byte) 17)), new bz0(3, (lnm) null, (byte) 5), (byte) 0), b751Var)) == d9n.a) ? objP : rih1.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 java.lang.Object, still in use, count: 2, list:
          (r4v3 java.lang.Object) from 0x004c: PHI (r4 I:??) = (r4v1 java.lang.Object), (r4v3 java.lang.Object) binds: [B:15:0x004b, B:39:0x004c] A[DONT_GENERATE, DONT_INLINE]
          (r4v3 java.lang.Object) from 0x0040: CHECK_CAST (p.zvh) (r4v3 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cfd.apply(java.lang.Object):java.lang.Object");
    }

    public void c(tv80 tv80Var) {
        iu30 iu30Var = (iu30) ((p811) this.c).a;
        if (iu30Var != null) {
            iu30Var.invoke(tv80Var);
        }
    }

    public void d(Object obj) {
        h141 h141Var = (h141) this.b;
        zxd zxdVar = (zxd) h141Var.getState();
        ArrayList arrayList = ((vxd) obj).a;
        int i = zxdVar.b;
        zxdVar.getClass();
        h141Var.e(new zxd(arrayList, i));
    }

    public int g(h311 h311Var, Object obj) {
        int iG;
        h4k h4kVar = (h4k) this.b;
        if (h4kVar == null) {
            h4kVar = null;
        }
        if (h4kVar == null || (iG = h4kVar.g(h311Var, obj)) == 0) {
            iG = 1;
        }
        if (iG != 1) {
            return iG;
        }
        znm0 znm0Var = (znm0) this.c;
        znm0Var.f = o7h.O0(new mmr0(h311Var, obj), znm0Var.f);
        return 2;
    }

    public mr20 getTitle() {
        return (evz) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r7 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(p.onm r7) {
        /*
            r6 = this;
            p.mzf r0 = p.mzf.b
            boolean r1 = r7 instanceof p.izf
            if (r1 == 0) goto L15
            r1 = r7
            p.izf r1 = (p.izf) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            p.izf r1 = new p.izf
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.a
            int r2 = r1.c
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            p.hm5.M(r7)
            goto L64
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L33:
            p.hm5.M(r7)
            goto L4f
        L37:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.c
            p.dxz0 r7 = (p.dxz0) r7
            io.reactivex.rxjava3.core.Observable r7 = r7.e()
            p.ezc r7 = p.yoi1.g(r7)
            r1.c = r4
            java.lang.Object r7 = p.b5p1.i(r7, r1)
            if (r7 != r5) goto L4f
            goto L63
        L4f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6f
            java.lang.Object r6 = r6.b
            p.zzf r6 = (p.zzf) r6
            r1.c = r3
            java.lang.Object r7 = r6.a(r1)
            if (r7 != r5) goto L64
        L63:
            return r5
        L64:
            p.sy21 r7 = (p.sy21) r7
            p.ry21 r6 = r7.a
            boolean r6 = r6.Q0
            if (r6 == 0) goto L6f
            p.mzf r6 = p.mzf.c
            return r6
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cfd.h(p.onm):java.lang.Object");
    }

    public ArrayList j(GetGalleryPageResponse getGalleryPageResponse) {
        e7r e7rVar = (e7r) this.b;
        List<ContentItem> itemsList = getGalleryPageResponse.getItemsList();
        ArrayList arrayList = new ArrayList();
        for (ContentItem contentItem : itemsList) {
            int iO = contentItem.o();
            int i = iO == 0 ? -1 : hpk.a[l1d.C(iO)];
            iye1 a900Var = null;
            if (i != -1) {
                if (i == 1) {
                    a900Var = new a900(contentItem.n().getTitle(), contentItem.n().q(), contentItem.n().getSubtitle(), contentItem.n().getImageUrl(), z4p1.H(contentItem.n().p()).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)), e7rVar.a(contentItem.n().p()), String.valueOf(contentItem.n().p().n()), contentItem.n().o());
                } else if (i != 2) {
                    if (i == 3) {
                        iye1 title = contentItem.r().getTitle();
                        if (title != null && title.length() != 0) {
                            a900Var = title;
                        }
                        a900Var = new hvi1(a900Var, contentItem.r().o(), contentItem.r().getSubtitle(), contentItem.r().getImageUrl());
                    } else if (i == 4) {
                        a900Var = new w8x(contentItem.p().getTitle(), contentItem.p().getDescription(), contentItem.p().n(), contentItem.p().o());
                    } else {
                        if (i != 5) {
                            eg.o();
                            return null;
                        }
                        a900Var = new iye1(contentItem.q().getTitle());
                    }
                }
            }
            if (a900Var != null) {
                arrayList.add(a900Var);
            }
        }
        return arrayList;
    }

    public void k(Object obj, tqw tqwVar) {
        qxd qxdVar = (sxd) obj;
        byd bydVar = (byd) this.c;
        if (!(qxdVar instanceof qxd)) {
            if (!(qxdVar instanceof pxd)) {
                eg.o();
                return;
            } else {
                pxd pxdVar = (pxd) qxdVar;
                bydVar.b.invoke(pxdVar.a, Integer.valueOf(pxdVar.b));
                return;
            }
        }
        h141 h141Var = (h141) this.b;
        zxd zxdVar = (zxd) h141Var.getState();
        qxd qxdVar2 = qxdVar;
        int i = qxdVar2.b;
        List list = zxdVar.a;
        zxdVar.getClass();
        h141Var.e(new zxd(list, i));
        bydVar.c.invoke(Integer.valueOf(qxdVar2.a), Integer.valueOf(i));
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Bundle bundleA;
        Class cls = (Class) this.b;
        hg30 hg30Var = (hg30) this.c;
        if (hg30Var != null) {
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(intent.getDataString());
            intent.getStringExtra("title");
            bundleA = hg30Var.a(intent, s4b1VarX, th61Var);
        } else {
            bundleA = null;
        }
        return new frn0(bundleA, cls);
    }

    public c380 m(String str, List list) {
        Resources resources = (Resources) this.b;
        List listM = p7h.M(new xse[]{new xse(1, resources.getString(2131953594), esx.c, "spotify:chat-pick-entity:".concat(str), true), new xse(2, resources.getString(2131953593), xox.c, "spotify:chat-pick-lyrics-stickers:".concat(str), ((add) this.c).g()), new xse(3, resources.getString(2131953592), lnx.c, "spotify:chat-pick-gifs:".concat(str), true)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((xse) obj).e) {
                arrayList.add(obj);
            }
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (list.contains(ktd.t(((xse) obj2).a))) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                n57.e("No tabs match requestedTabIds=" + list + ". Check that the IDs are valid and the tabs are enabled.");
            } else {
                arrayList = arrayList2;
            }
        }
        return mqo1.A(arrayList);
    }

    public void o(Exception exc) {
        ((sjd) this.b).W0.a((ikd) this.c, "failure", "CANVAS_IMAGE_LOAD_ERROR", "Loading canvas image failed");
    }

    public void onSuccess() {
        sjd sjdVar = (sjd) this.b;
        ii9 ii9Var = sjdVar.W0;
        ikd ikdVar = (ikd) this.c;
        ii9Var.a(ikdVar, "downloaded", (String) null, (String) null);
        ne neVar = sjdVar.X0;
        String str = ikdVar.a;
        ((LinkedHashSet) neVar.b).add(str);
        ((PublishSubject) neVar.c).onNext(new xjd(str, true));
    }

    public void r() {
        i8h1 i8h1Var = (i8h1) this.b;
        fjl0 fjl0Var = (fjl0) this.c;
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), fjl0Var.c, fjl0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 s(lm5 lm5Var) {
        w7h1 w7h1Var;
        kly0 kly0Var = (kly0) this.b;
        rxk0 rxk0Var = (rxk0) this.c;
        boolean zEquals = lm5Var.equals(pu80.d);
        b7x b7xVar = b7x.a;
        if (zEquals) {
            i8h1 i8h1Var = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC = rxk0Var.b.c();
            x6h1VarC.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("add_to_calendar_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var.equals(su80.e)) {
            i8h1 i8h1Var2 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC3 = rxk0Var.b.c();
            x6h1VarC3.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = true;
            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
            x6h1VarC4.i.add(new a7h1("artists_lineup_view", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            return i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof xu80) {
            i8h1 i8h1Var3 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC5 = rxk0Var.b.c();
            x6h1VarC5.i.add(new a7h1("bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            y6h1 y6h1VarA = x6h1VarC5.a();
            xu80 xu80Var = (xu80) lm5Var;
            Integer numValueOf = Integer.valueOf(xu80Var.e);
            x6h1 x6h1VarC6 = y6h1VarA.c();
            x6h1VarC6.i.add(new a7h1("playable_row", (String) null, numValueOf, (String) null, (String) null));
            x6h1VarC6.j = false;
            x6h1 x6h1VarC7 = x6h1VarC6.a().c();
            x6h1VarC7.i.add(new a7h1("play_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = false;
            y6h1 y6h1VarA2 = x6h1VarC7.a();
            String str = xu80Var.d;
            return i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str != null ? str : "")), y6h1VarA2, rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof yu80) {
            i8h1 i8h1Var4 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC8 = rxk0Var.b.c();
            x6h1VarC8.i.add(new a7h1("bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            y6h1 y6h1VarA3 = x6h1VarC8.a();
            yu80 yu80Var = (yu80) lm5Var;
            Integer numValueOf2 = Integer.valueOf(yu80Var.e);
            x6h1 x6h1VarC9 = y6h1VarA3.c();
            x6h1VarC9.i.add(new a7h1("playable_row", (String) null, numValueOf2, (String) null, (String) null));
            x6h1VarC9.j = false;
            x6h1 x6h1VarC10 = x6h1VarC9.a().c();
            x6h1VarC10.i.add(new a7h1("play_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC10.j = false;
            y6h1 y6h1VarA4 = x6h1VarC10.a();
            String str2 = yu80Var.d;
            return i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2 != null ? str2 : "")), y6h1VarA4, rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof zu80) {
            i8h1 i8h1Var5 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC11 = rxk0Var.b.c();
            x6h1VarC11.i.add(new a7h1("bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC11.j = false;
            y6h1 y6h1VarA5 = x6h1VarC11.a();
            zu80 zu80Var = (zu80) lm5Var;
            Integer numValueOf3 = Integer.valueOf(zu80Var.e);
            x6h1 x6h1VarC12 = y6h1VarA5.c();
            x6h1VarC12.i.add(new a7h1("playable_row", (String) null, numValueOf3, (String) null, (String) null));
            x6h1VarC12.j = false;
            y6h1 y6h1VarA6 = x6h1VarC12.a();
            String str3 = zu80Var.d;
            return i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA6, rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof av80) {
            i8h1 i8h1Var6 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC13 = rxk0Var.b.c();
            x6h1VarC13.i.add(new a7h1("bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC13.j = false;
            y6h1 y6h1VarA7 = x6h1VarC13.a();
            av80 av80Var = (av80) lm5Var;
            String str4 = av80Var.d;
            Integer numValueOf4 = Integer.valueOf(av80Var.e);
            x6h1 x6h1VarC14 = y6h1VarA7.c();
            x6h1VarC14.i.add(new a7h1("navigatable_row", (String) null, numValueOf4, str4, (String) null));
            x6h1VarC14.j = false;
            return i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x6h1VarC14.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof ru80) {
            i8h1 i8h1Var7 = (i8h1) kly0Var.get();
            ru80 ru80Var = (ru80) lm5Var;
            String str5 = ru80Var.e;
            if (str5 != null) {
                rxk0Var.getClass();
                x6h1 x6h1VarC15 = rxk0Var.b.c();
                x6h1VarC15.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = true;
                y6h1 y6h1VarA8 = x6h1VarC15.a();
                String str6 = ru80Var.d;
                x6h1 x6h1VarC16 = y6h1VarA8.c();
                x6h1VarC16.i.add(new a7h1("artist_chip", (String) null, (Integer) null, str6, (String) null));
                x6h1VarC16.j = false;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC16.a(), rxk0Var.a, System.currentTimeMillis());
            } else {
                rxk0Var.getClass();
                x6h1 x6h1VarC17 = rxk0Var.b.c();
                x6h1VarC17.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = true;
                y6h1 y6h1VarA9 = x6h1VarC17.a();
                String str7 = ru80Var.d;
                x6h1 x6h1VarC18 = y6h1VarA9.c();
                x6h1VarC18.i.add(new a7h1("artist_chip", (String) null, (Integer) null, str7, (String) null));
                x6h1VarC18.j = false;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC18.a(), rxk0Var.a, System.currentTimeMillis());
            }
            return i8h1Var7.m(w7h1Var, (xj61) null);
        }
        if (lm5Var instanceof lv80) {
            i8h1 i8h1Var8 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC19 = rxk0Var.b.c();
            x6h1VarC19.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
            x6h1VarC19.j = true;
            y6h1 y6h1VarA10 = x6h1VarC19.a();
            lv80 lv80Var = (lv80) lm5Var;
            String str8 = lv80Var.d;
            x6h1 x6h1VarC20 = y6h1VarA10.c();
            x6h1VarC20.i.add(new a7h1("share_button", "share-concert", (Integer) null, str8, (String) null));
            x6h1VarC20.j = false;
            y6h1 y6h1VarA11 = x6h1VarC20.a();
            String str9 = lv80Var.d;
            return i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", str9 != null ? str9 : ""), new mmr0("share_id", "share-concert")})), y6h1VarA11, rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof dv80) {
            i8h1 i8h1Var9 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC21 = rxk0Var.b.c();
            x6h1VarC21.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
            x6h1VarC21.j = true;
            y6h1 y6h1VarA12 = x6h1VarC21.a();
            String str10 = ((dv80) lm5Var).d;
            x6h1 x6h1VarC22 = y6h1VarA12.c();
            x6h1VarC22.i.add(new a7h1("context_menu_button", "context-menu-concert", (Integer) null, str10, (String) null));
            x6h1VarC22.j = false;
            return i8h1Var9.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var.equals(su80.d)) {
            i8h1 i8h1Var10 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC23 = rxk0Var.b.c();
            x6h1VarC23.i.add(new a7h1("navigation_area", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC23.j = false;
            x6h1 x6h1VarC24 = x6h1VarC23.a().c();
            x6h1VarC24.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC24.j = false;
            return i8h1Var10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC24.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof gv80) {
            gv80 gv80Var = (gv80) lm5Var;
            String str11 = gv80Var.d;
            if (gv80Var.e) {
                i8h1 i8h1Var11 = (i8h1) kly0Var.get();
                rxk0Var.getClass();
                x6h1 x6h1VarC25 = rxk0Var.b.c();
                x6h1VarC25.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
                x6h1VarC25.j = true;
                x6h1 x6h1VarC26 = x6h1VarC25.a().c();
                x6h1VarC26.i.add(new a7h1("save_event_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC26.j = false;
                return i8h1Var11.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str11 != null ? str11 : "")), x6h1VarC26.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
            }
            i8h1 i8h1Var12 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC27 = rxk0Var.b.c();
            x6h1VarC27.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
            x6h1VarC27.j = true;
            x6h1 x6h1VarC28 = x6h1VarC27.a().c();
            x6h1VarC28.i.add(new a7h1("save_event_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC28.j = false;
            return i8h1Var12.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str11 != null ? str11 : "")), x6h1VarC28.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof nv80) {
            i8h1 i8h1Var13 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC29 = rxk0Var.b.c();
            x6h1VarC29.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
            x6h1VarC29.j = true;
            x6h1 x6h1VarC30 = x6h1VarC29.a().c();
            x6h1VarC30.i.add(new a7h1("venue_subtitle", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC30.j = false;
            return i8h1Var13.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((nv80) lm5Var).d)), x6h1VarC30.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof fv80) {
            i8h1 i8h1Var14 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC31 = rxk0Var.b.c();
            x6h1VarC31.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
            x6h1VarC31.j = true;
            x6h1 x6h1VarC32 = x6h1VarC31.a().c();
            x6h1VarC32.i.add(new a7h1("campaign_subtitle", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC32.j = false;
            return i8h1Var14.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((fv80) lm5Var).d)), x6h1VarC32.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (lm5Var instanceof jv80) {
            i8h1 i8h1Var15 = (i8h1) kly0Var.get();
            rxk0Var.getClass();
            x6h1 x6h1VarC33 = rxk0Var.b.c();
            x6h1VarC33.i.add(new a7h1("section_footer", "goto-bottomsheet-playables", (Integer) null, (String) null, (String) null));
            x6h1VarC33.j = false;
            return i8h1Var15.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC33.a(), rxk0Var.a, System.currentTimeMillis()), (xj61) null);
        }
        if (!(lm5Var instanceof cv80)) {
            eg.o();
            return null;
        }
        i8h1 i8h1Var16 = (i8h1) kly0Var.get();
        rxk0Var.getClass();
        x6h1 x6h1VarC34 = rxk0Var.b.c();
        x6h1VarC34.i.add(new a7h1("concert_details", "concert_details", (Integer) null, (String) null, (String) null));
        x6h1VarC34.j = true;
        y6h1 y6h1VarA13 = x6h1VarC34.a();
        cv80 cv80Var = (cv80) lm5Var;
        p5k p5kVar = cv80Var.d;
        Integer numValueOf5 = Integer.valueOf(cv80Var.e);
        String str12 = p5kVar.a;
        x6h1 x6h1VarC35 = y6h1VarA13.c();
        x6h1VarC35.i.add(new a7h1("concept_chip", (String) null, numValueOf5, str12, (String) null));
        x6h1VarC35.j = false;
        y6h1 y6h1VarA14 = x6h1VarC35.a();
        String str13 = p5kVar.c;
        return i8h1Var16.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str13 != null ? str13 : "")), y6h1VarA14, rxk0Var.a, System.currentTimeMillis()), (xj61) null);
    }

    public void subscribe(MaybeEmitter maybeEmitter) {
        MaybeEmitter maybeEmitter2;
        try {
            ixg ixgVarF = ((gw70) ((fna) this.b).b).f((String) this.c);
            ixgVarF.p(100, 100, 2);
            maybeEmitter2 = maybeEmitter;
            try {
                ixgVarF.g(new qka(1, maybeEmitter2, MaybeEmitter.class, "onSuccess", "onSuccess(Ljava/lang/Object;)V", 0, (byte) 27), new syf(maybeEmitter2, (byte) 19));
            } catch (Throwable th) {
                th = th;
                maybeEmitter2.tryOnError(th);
            }
        } catch (Throwable th2) {
            th = th2;
            maybeEmitter2 = maybeEmitter;
        }
    }

    public gpk t(GetGalleryPageResponse getGalleryPageResponse) {
        String uy30Var = null;
        kdn0 kdn0VarA = ((dpk) this.c).a(getGalleryPageResponse.o() ? getGalleryPageResponse.n().p() : null, i(getGalleryPageResponse));
        if (getGalleryPageResponse.o()) {
            String title = getGalleryPageResponse.n().getTitle();
            String description = getGalleryPageResponse.n().getDescription();
            String strO = getGalleryPageResponse.n().o();
            String strO2 = (strO == null || strO.length() == 0) ? "#ff121212" : getGalleryPageResponse.n().o();
            strO2.getClass();
            uy30Var = new uy30(title, description, strO2, getGalleryPageResponse.n().q() ? getGalleryPageResponse.n().p() : null);
        }
        return new gpk(uy30Var, j(getGalleryPageResponse), kdn0VarA, getGalleryPageResponse.getNextPageToken());
    }

    public ojo0 u(PlayerState playerState) {
        xid xidVar = (xid) this.c;
        zo5 zo5Var = (zo5) xidVar.c;
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        if (Boolean.parseBoolean((String) contextTrack.metadata().get("collection.is_banned"))) {
            return new ojo0(new vjo0(2131232453, 2131959887), zo5Var.a(AppLifecycleServicePendingIntent.UNBAN_FROM_COLLECTION, xidVar.i(contextTrack.uri(), playerState.contextUri(), null)), false);
        }
        return new ojo0(new vjo0(2131232946, 2131959882), zo5Var.a(AppLifecycleServicePendingIntent.BAN_FROM_COLLECTION, xidVar.i(contextTrack.uri(), playerState.contextUri(), contextTrack.provider())), false);
    }

    public ojo0 v(PlayerState playerState, Boolean bool) {
        String strUri;
        xid xidVar = (xid) this.c;
        zo5 zo5Var = (zo5) xidVar.c;
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        contextTrack.getClass();
        eu4 eu4Var = (eu4) this.b;
        boolean zA = eu4Var.a();
        if (l4o1.U(contextTrack)) {
            strUri = l4o1.b0(contextTrack);
        } else if (zA) {
            strUri = (String) contextTrack.metadata().get("save_track.uri");
            if (strUri == null) {
                strUri = contextTrack.uri();
            }
            strUri.getClass();
        } else {
            strUri = contextTrack.uri();
        }
        boolean z = (!eu4Var.a() || bool == null) ? Boolean.parseBoolean((String) contextTrack.metadata().get("collection.in_collection")) : bool.booleanValue();
        if (z) {
            return new ojo0(new vjo0(2131233415, 2131959879), zo5Var.a(AppLifecycleServicePendingIntent.REMOVE_FROM_COLLECTION, xidVar.i(strUri, playerState.contextUri(), null)), false);
        }
        return new ojo0(new vjo0(2131233428, 2131959878), zo5Var.a(AppLifecycleServicePendingIntent.ADD_TO_COLLECTION, xidVar.i(strUri, playerState.contextUri(), null)), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(String str, onm onmVar) {
        w0f w0fVar;
        Object objA;
        if (onmVar instanceof w0f) {
            w0fVar = (w0f) onmVar;
            int i = w0fVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w0fVar.c = i - Integer.MIN_VALUE;
            } else {
                w0fVar = new w0f(this, onmVar);
            }
        } else {
            w0fVar = new w0f(this, onmVar);
        }
        Object obj = w0fVar.a;
        int i2 = w0fVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (!((qq4) ((kly0) this.c).get()).a()) {
                return new hoe(false, false);
            }
            mx3 mx3Var = (mx3) this.b;
            w0fVar.c = 1;
            objA = mx3Var.a(str, w0fVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objA = ((e331) obj).a;
        }
        if (!(objA instanceof m231)) {
            List list = (List) objA;
            objA = new hoe(list.contains(kx3.a), list.contains(kx3.e));
        }
        return objA instanceof m231 ? new hoe(false, false) : objA;
    }

    public void x(String str, String str2, tv80 tv80Var, nk51 nk51Var) {
        lik1 lik1Var = new lik1(str2);
        mfm mfmVarA = ((i4q) this.c).a(lik1Var);
        Observable observableA = ((k781) this.b).a(str, lik1Var, new l781((String) null, str, false, false, (c821) null, (ugo0) null, nk51Var, 0, false, false, (r6h1) null, false, (String) null, (p860) null, 4186109));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, observableA, yon1.c1(), new bjm(4, str, str2), tv80Var, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r10 == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object y(p.wgf r8, java.lang.String r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.ihf
            if (r0 == 0) goto L13
            r0 = r10
            p.ihf r0 = (p.ihf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.ihf r0 = new p.ihf
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L5d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.dhf r7 = r0.a
            p.hm5.M(r10)
            goto L50
        L37:
            p.hm5.M(r10)
            java.lang.Object r10 = r7.b
            p.dhf r10 = (p.dhf) r10
            java.lang.Object r7 = r7.c
            p.zwa r7 = (p.zwa) r7
            r0.a = r10
            r0.d = r3
            java.lang.Object r7 = r7.j(r8, r9, r0)
            if (r7 != r5) goto L4d
            goto L5c
        L4d:
            r6 = r10
            r10 = r7
            r7 = r6
        L50:
            com.spotify.share.chatpreviews.core.impl.proto.UploadChatPreviewRequest r10 = (com.spotify.share.chatpreviews.core.impl.proto.UploadChatPreviewRequest) r10
            r0.a = r4
            r0.d = r2
            java.lang.Object r10 = r7.a(r10, r0)
            if (r10 != r5) goto L5d
        L5c:
            return r5
        L5d:
            com.spotify.share.chatpreviews.core.impl.proto.UploadChatPreviewResponse r10 = (com.spotify.share.chatpreviews.core.impl.proto.UploadChatPreviewResponse) r10
            p.hhf r7 = new p.hhf
            java.lang.String r8 = r10.n()
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cfd.y(p.wgf, java.lang.String, p.onm):java.lang.Object");
    }

    public void b() {
    }

    public void dispose() {
    }

    public void f(Object obj) {
    }

    public /* synthetic */ cfd(u9c u9cVar, d7h d7hVar, Object obj, byte b) {
        this.a = b;
        this.b = d7hVar;
        this.c = obj;
    }

    public /* synthetic */ cfd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public cfd(mdg mdgVar, i8h1 i8h1Var) {
        this.a = (byte) 14;
        this.b = i8h1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new fjl0(yon1.L3().c, mdgVar.a, (byte) 21);
    }

    public cfd(xpg xpgVar, p811 p811Var) {
        this.a = (byte) 15;
        this.c = p811Var;
        this.b = xpgVar.l;
    }

    public Object apply(Object obj, Object obj2) {
        LinkedHashMap linkedHashMapU = u9c.u((YourLibraryContainsResponse) obj);
        d7h d7hVar = (d7h) this.b;
        YourLibraryContainsRequest yourLibraryContainsRequest = (YourLibraryContainsRequest) this.c;
        yourLibraryContainsRequest.getClass();
        return u9c.s((CollectionContainsResponse) obj2, linkedHashMapU, d7hVar, yourLibraryContainsRequest);
    }
}
