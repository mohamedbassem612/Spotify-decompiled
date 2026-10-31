package p;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.car.app.navigation.model.Maneuver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.volley.VolleyError;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.creativeworkplatform.encore.elements.ArtworkShadow;
import com.spotify.mobius.MobiusLoop;
import com.spotify.nowplaying.scroll.container.ScrollCardsContainer;
import com.spotify.player.model.ContextTrack;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.InlineExecutionProhibitedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uu1 implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public uu1(ConstraintLayout constraintLayout, zk10 zk10Var, ConstraintLayout constraintLayout2, ParagraphView paragraphView, ParagraphView paragraphView2) {
        this.a = (byte) 14;
        this.b = constraintLayout2;
        this.c = paragraphView;
        this.d = paragraphView2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, java.lang.Object, p.iac0, p.zq41] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        kdn0 kdn0Var;
        byte[] bArrCopyOf;
        OverScroller overScroller;
        Transition sharedElementEnterTransition;
        ega0 ega0Var;
        ega0 ega0Var2;
        String strG;
        boolean z = true;
        bwn0 arrayList = null;
        switch (this.a) {
            case 0:
                vu1 vu1Var = (vu1) this.b;
                boolean zJ = vu1Var.b.j(vu1Var.a);
                vu1 vu1Var2 = (vu1) this.b;
                if (zJ) {
                    vu1Var2.b.i((dwn0) this.c, (Bundle) this.d);
                    return;
                }
                if (vu1Var2.d.isPresent()) {
                    akr akrVar = (akr) ((vu1) this.b).e.orElse(null);
                    if (((akrVar == null || (kdn0Var = akrVar.w) == null) ? null : (View) kdn0Var.e()) == null && !ihc1.y0(((vu1) this.b).f)) {
                        bwn0 bwn0Var = ((vu1) this.b).a;
                        arrayList = bwn0Var instanceof dg30 ? (dg30) bwn0Var : null;
                        if (arrayList == null) {
                            n57.e("Cannot show AddToPlaylistFragment: activity is not a FragmentActivity");
                            return;
                        }
                        th30 th30VarE0 = arrayList.e0();
                        if (th30VarE0.G("AddToPlaylistFragment") != null) {
                            return;
                        }
                        zf30 zf30VarA = ((ni30) ((vu1) this.b).d.get()).a();
                        zf30VarA.T0((Bundle) this.d);
                        nu9 nu9Var = new nu9(th30VarE0);
                        nu9Var.k(R.id.content, zf30VarA, "AddToPlaylistFragment", 1);
                        nu9Var.g(true, true);
                        return;
                    }
                }
                a1r0.e(((vu1) this.b).c, (dwn0) this.c, (Bundle) this.d, 4);
                return;
            case 1:
                b42 b42Var = (b42) this.c;
                ContextTrack contextTrack = (ContextTrack) this.d;
                ViewGroup viewGroup = b42Var.X0;
                View viewN = b8k1.n(viewGroup, 2131427919);
                View viewN2 = b8k1.n(viewGroup, 2131427918);
                ImageView imageView = b42Var.Y0;
                mgo1.l(viewN, viewN2, imageView, b42Var.W0.getValue() instanceof ck7);
                mgo1.w(imageView, l4o1.t(contextTrack), b42Var.U0);
                return;
            case 2:
                ArtworkShadow artworkShadow = (ArtworkShadow) this.c;
                View view = (View) this.d;
                int i = ArtworkShadow.g;
                artworkShadow.b = Math.min(view.getLeft() - artworkShadow.getLeft(), artworkShadow.getRight() - view.getRight()) / 3.0f;
                artworkShadow.c = Math.min(view.getTop() - artworkShadow.getTop(), artworkShadow.getBottom() - view.getBottom()) / 3.0f;
                artworkShadow.a.setShadowLayer(artworkShadow.getShadowBlurRadius(), 0.0f, 0.0f, artworkShadow.getContext().getColor(2131100152));
                artworkShadow.invalidate();
                return;
            case 3:
                dqu dquVar = ((ena) this.d).a;
                rwu rwuVar = (rwu) this.b;
                String str = (String) this.c;
                qwu qwuVar = rwuVar.a;
                soh0 soh0Var = qwuVar.a;
                Uri uri = soh0Var.a;
                String strP = asj0.p(soh0Var.b);
                poh0 poh0Var = soh0Var.c;
                if (poh0Var != null) {
                    byte[] bArr = poh0Var.h;
                    bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                } else {
                    bArrCopyOf = null;
                }
                String str2 = soh0Var.f;
                if (qwuVar.c == 2) {
                    qwuVar.b();
                    arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int length = qwuVar.n.length;
                    int i2 = 0;
                    while (i2 < length) {
                        arrayList2.clear();
                        int length2 = qwuVar.n[i2].length;
                        boolean z2 = z;
                        for (int i3 = 0; i3 < length2; i3++) {
                            arrayList2.addAll(qwuVar.n[i2][i3]);
                        }
                        arrayList.addAll(qwuVar.k.t[i2].f(arrayList2));
                        i2++;
                        z = z2;
                    }
                }
                if (arrayList == null) {
                    w280 w280Var = b380.b;
                    arrayList = bg11.e;
                }
                j0v j0vVar = new j0v(str, uri, strP, arrayList, bArrCopyOf, str2, null, null, null);
                xxu xxuVar = (xxu) dquVar.b;
                xxuVar.f++;
                xxuVar.c.obtainMessage(7, 0, 0, j0vVar).sendToTarget();
                xxu xxuVar2 = (xxu) dquVar.b;
                if (xxuVar2.g) {
                    xxuVar2.g = false;
                    xxuVar2.f++;
                    xxuVar2.c.obtainMessage(2, 0, 0).sendToTarget();
                    boolean zC = xxuVar2.c();
                    Iterator it = xxuVar2.e.iterator();
                    while (it.hasNext()) {
                        ((zma) it.next()).getClass();
                    }
                    if (zC) {
                        xxuVar2.a();
                    }
                }
                rwuVar.a();
                return;
            case 4:
                try {
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File((String) this.b)));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            JSONObject jSONObject = new JSONObject(sb.toString().trim());
                            if (TextUtils.isEmpty(jSONObject.toString())) {
                                throw new FileNotFoundException();
                            }
                            crm0.y(jSONObject, (n3c) this.c, (Context) this.d);
                            return;
                        }
                        sb.append(line);
                    }
                } catch (FileNotFoundException e) {
                    i1k0.m(e.getMessage());
                    return;
                } catch (IOException e2) {
                    i1k0.m(e2.getMessage());
                    return;
                } catch (JSONException e3) {
                    i1k0.m(e3.getMessage());
                    return;
                }
                break;
            case 5:
                if (((gag) this.b).n) {
                    return;
                }
                ((WebView) this.c).evaluateJavascript("window.onPlayerStateChanged && window.onPlayerStateChanged(" + ((String) this.d) + ");", null);
                return;
            case 6:
                p811 p811Var = (p811) this.b;
                try {
                    int i4 = qsg.g;
                    arrayList = i2p1.k((HandlerThread) this.c);
                    break;
                } catch (Exception e4) {
                    Logger.e(e4, "Failed to create PlaceholderSurface", new Object[0]);
                }
                p811Var.a = arrayList;
                ((CountDownLatch) this.d).countDown();
                return;
            case 7:
                tv80 serializable = ((Bundle) this.d).getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                spn.b((spn) ((uon) this.b).b, new cqn((String) null, (String) null, new zpn(false, (List) null, (List) null, (List) null, nik1.M1.a, (String) this.c, (ypn) null, false, 1855), 3), serializable instanceof tv80 ? serializable : null);
                return;
            case 8:
                ((k0t) this.b).d((sqj1) this.c, (t45) this.d);
                return;
            case 9:
                ((puu) this.b).a();
                ((DialogInterface) this.c).dismiss();
                ((suu) this.d).e.a(ex7.b);
                return;
            case 10:
                AtomicReference atomicReference = (AtomicReference) this.b;
                bow bowVar = (bow) this.c;
                y0u y0uVar = (y0u) this.d;
                bowVar.getClass();
                q550 q550Var = p550.a;
                try {
                    q550Var = (q550) y0uVar.invoke();
                } catch (Exception e5) {
                    Logger.e(e5, "Failed to read GPU information", new Object[0]);
                } catch (UnsatisfiedLinkError e6) {
                    Logger.e(e6, "Failed to read GPU information", new Object[0]);
                }
                atomicReference.set(q550Var);
                return;
            case 11:
                String str3 = (String) this.d;
                tv80 tv80Var = (tv80) this.b;
                ynb0 ynb0Var = (ynb0) ((yzu) this.c).b;
                if (tv80Var != null) {
                    ((lzn0) ynb0Var.get()).a(str3, tv80Var, (Bundle) null);
                    return;
                } else {
                    ((lzn0) ynb0Var.get()).h(str3);
                    return;
                }
            case 12:
                ((View) this.b).getViewTreeObserver().removeOnDrawListener((gl00) this.c);
                ((t3x) this.d).invoke();
                return;
            case 13:
                ty21 ty21Var = (ty21) this.c;
                mn21 mn21Var = (mn21) this.b;
                if (mn21Var.isCanceled()) {
                    mn21Var.finish("canceled-at-delivery");
                    return;
                }
                VolleyError volleyError = ty21Var.c;
                if (volleyError == null) {
                    mn21Var.deliverResponse(ty21Var.a);
                } else {
                    mn21Var.deliverError(volleyError);
                }
                if (ty21Var.d) {
                    mn21Var.addMarker("intermediate-response");
                } else {
                    mn21Var.finish("done");
                }
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
                ParagraphView paragraphView = (ParagraphView) this.c;
                ParagraphView paragraphView2 = (ParagraphView) this.d;
                paragraphView.measure(View.MeasureSpec.makeMeasureSpec(paragraphView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                float f = constraintLayout.getResources().getDisplayMetrics().density;
                int measuredHeight = (paragraphView.getMeasuredHeight() - paragraphView.getHeight()) + ((int) (2.0f * f));
                if (measuredHeight <= 0) {
                    return;
                }
                qhl qhlVar = (qhl) paragraphView2.getLayoutParams();
                int i5 = ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin;
                int i6 = i5 - ((int) (10.0f * f));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i7 > measuredHeight) {
                    i7 = measuredHeight;
                }
                if (i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin = i5 - i7;
                    paragraphView2.setLayoutParams(qhlVar);
                    measuredHeight -= i7;
                }
                if (measuredHeight > 0) {
                    qhl qhlVar2 = (qhl) paragraphView.getLayoutParams();
                    int i8 = (int) (4.0f * f);
                    int i9 = ((ViewGroup.MarginLayoutParams) qhlVar2).bottomMargin;
                    int i10 = i9 - measuredHeight;
                    if (i10 >= i8) {
                        i8 = i10;
                    }
                    if (i8 != i9) {
                        ((ViewGroup.MarginLayoutParams) qhlVar2).bottomMargin = i8;
                        paragraphView.setLayoutParams(qhlVar2);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                iae iaeVar = ((t740) this.b).c;
                String str4 = (String) this.c;
                cvf1 cvf1Var = cvf1.a;
                tv80 tv80Var2 = (tv80) this.d;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str4);
                if (s4b1VarX.c != blc0.ti || s4b1VarX.j() == null) {
                    hhg1.n("Track preview upsell requires a valid track URI");
                    return;
                } else if (cvf1Var.equals(cvf1Var)) {
                    iaeVar.a.f(new dwn0(l1d.m("spotify:internal:reinvent-free:track-preview-upsell:content-windowing:", s4b1VarX.j()), "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var2 != null ? new bwn0(tv80Var2) : null));
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 16:
                View view2 = (View) this.d;
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) ((GridRecyclerView) this.b).getRootView(), (View) this.c, 33);
                if (viewFindNextFocus == null || !viewFindNextFocus.requestFocus()) {
                    view2.setFocusableInTouchMode(true);
                    view2.requestFocus();
                    view2.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 17:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                AppBarLayout.BaseBehavior baseBehavior = (cw50) this.d;
                AppBarLayout appBarLayout = (View) this.c;
                if (appBarLayout == null || (overScroller = ((cw50) baseBehavior).d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    baseBehavior.y(coordinatorLayout, appBarLayout, ((cw50) baseBehavior).d.getCurrY());
                    WeakHashMap weakHashMap = b8k1.a;
                    appBarLayout.postOnAnimation(this);
                    return;
                } else {
                    AppBarLayout appBarLayout2 = appBarLayout;
                    baseBehavior.D(coordinatorLayout, appBarLayout2);
                    if (appBarLayout2.O0) {
                        appBarLayout2.f(appBarLayout2.g(AppBarLayout.BaseBehavior.A(coordinatorLayout)));
                        return;
                    }
                    return;
                }
            case 18:
                if (Thread.currentThread() == ((Thread) this.c)) {
                    this.d = new InlineExecutionProhibitedException();
                    return;
                } else {
                    ((Runnable) this.b).run();
                    return;
                }
            case 19:
                ((p811) this.b).a = (SharedPreferences) ((wza0) this.c).n.getValue();
                ((CountDownLatch) this.d).countDown();
                return;
            case 20:
                p7s p7sVar = ((kyh0) this.b).l;
                if (p7sVar != null) {
                    p7sVar.f((eyh0) null);
                }
                ((kyh0) this.b).l = null;
                Handler handler = (Handler) this.c;
                if (handler != null) {
                    handler.post(new aih0((eyh0) this.d, handler, false, (byte) 2));
                    return;
                }
                return;
            case 21:
                Set set2 = (Set) this.d;
                kyo0 kyo0Var = (kyo0) this.c;
                lmb1 lmb1Var = (gob1) this.b;
                if (lmb1Var instanceof lmb1) {
                    lmb1 lmb1Var2 = lmb1Var;
                    String str5 = lmb1Var2.b().a;
                    String str6 = lmb1Var2.b().b;
                    ScrollCardsContainer scrollCardsContainer = kyo0Var.q;
                    if (scrollCardsContainer == null) {
                        u890.C("_containerViewBinder");
                        throw null;
                    }
                    xhk1.c(scrollCardsContainer, new h3h1(new mvn0(kyo0Var, str6, str5, (byte) 6)));
                    mko mkoVar = kyo0Var.w;
                    if (mkoVar != null) {
                        List data = lmb1Var2.getData();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = data.iterator();
                        while (it2.hasNext()) {
                            r7h.W(((eyo0) it2.next()).a(), arrayList3);
                        }
                        mkoVar.a(o7h.p1(arrayList3));
                    }
                }
                if (lmb1Var instanceof slb1) {
                    return;
                }
                if (!(lmb1Var instanceof wlb1)) {
                    if (!(lmb1Var instanceof tmb1)) {
                        if (lmb1Var instanceof qmb1) {
                            kyo0Var.b();
                            return;
                        } else {
                            eg.o();
                            return;
                        }
                    }
                    tmb1 tmb1Var = (tmb1) lmb1Var;
                    bpb1 bpb1Var = kyo0Var.A;
                    if (bpb1Var != null) {
                        ArrayList<eyo0> arrayListC = kyo0.c(tmb1Var, set2);
                        ArrayList arrayList4 = new ArrayList(q7h.U(arrayListC, 10));
                        for (eyo0 eyo0Var : arrayListC) {
                            arrayList4.add(new h8k1(eyo0Var, eyo0Var));
                        }
                        bpb1Var.m((Object) null, arrayList4);
                        return;
                    }
                    return;
                }
                ArrayList<eyo0> arrayListC2 = kyo0.c((wlb1) lmb1Var, set2);
                ScrollCardsContainer scrollCardsContainer2 = kyo0Var.q;
                if (scrollCardsContainer2 == 0) {
                    u890.C("_containerViewBinder");
                    throw null;
                }
                ?? zq41Var = new zq41(scrollCardsContainer2.getContext());
                scrollCardsContainer2.a = zq41Var;
                scrollCardsContainer2.addView(zq41Var);
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayListC2, 10));
                for (eyo0 eyo0Var2 : arrayListC2) {
                    arrayList5.add(new h8k1(eyo0Var2, eyo0Var2));
                }
                bpb1 bpb1VarB = gio1.b(arrayList5);
                kyo0Var.A = bpb1VarB;
                jwo0 jwo0Var = (jwo0) ((iu30) kyo0Var.b.get()).invoke((Object) zq41Var);
                kyo0Var.z = jwo0Var;
                dnc0 dnc0Var = (dnc0) ((iu30) kyo0Var.c.get()).invoke(jwo0Var);
                MobiusLoop mobiusLoop = kyo0Var.p;
                if (mobiusLoop == null) {
                    u890.C("loop");
                    throw null;
                }
                two1.v(dnc0Var, bpb1VarB, false, new ntf0(set2, (Object) zq41Var, kyo0Var, mobiusLoop, (byte) 17));
                cnc0 cnc0VarA = dnc0Var.a();
                kyo0Var.y = (snc0) cnc0VarA.a.invoke();
                khc khcVar = kyo0Var.o;
                LinkedHashMap linkedHashMap = cnc0VarA.c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    vu30 vu30Var = (vu30) entry.getValue();
                    snc0 snc0Var = kyo0Var.y;
                    snc0Var.getClass();
                    linkedHashMap2.put(key, (laa) vu30Var.invoke(snc0Var.getMetadata(), (Object) zq41Var));
                }
                p1d0 p1d0VarF = khc.f(khcVar, linkedHashMap2, (Map) null, cmo0.X, 14);
                l811 l811Var = new l811();
                snc0 snc0Var2 = kyo0Var.y;
                snc0Var2.getClass();
                w6d1.h(t5p1.j(snc0Var2.b(), 3)).f((iac0) zq41Var, new zjr(p1d0VarF, l811Var, kyo0Var, (zq41) zq41Var));
                return;
            case 22:
                dg30 dg30Var = (dg30) this.c;
                Window window = dg30Var.getWindow();
                if (window != null && (sharedElementEnterTransition = window.getSharedElementEnterTransition()) != null) {
                    sharedElementEnterTransition.addListener(new zi30((u6j0) this.d, dg30Var, (byte) 1));
                }
                dg30Var.startPostponedEnterTransition();
                return;
            case 23:
                tzr0 tzr0Var = (tzr0) this.b;
                ((lzn0) tzr0Var.c).e();
                tzr0.k(tzr0Var, ((k9t0) this.c).a, (tv80) this.d, (Bundle) null, 12);
                return;
            case 24:
                lzn0 lzn0Var = (lzn0) ((tzr0) this.b).c;
                String str7 = ((v9t0) this.c).a;
                tv80 tv80Var3 = (tv80) this.d;
                lzn0Var.f(new dwn0(str7, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var3 != null ? new bwn0(tv80Var3) : null));
                return;
            case 25:
                tzr0 tzr0Var2 = (tzr0) this.b;
                ((lzn0) tzr0Var2.c).e();
                tzr0.k(tzr0Var2, ((z9t0) this.c).a, (tv80) this.d, (Bundle) null, 12);
                return;
            case 26:
                c0u0 c0u0Var = (c0u0) this.b;
                y2g1 y2g1Var = (y2g1) this.c;
                ((yqg) ((lgy) this.d).d).b();
                c0u0Var.E(y2g1Var);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                rrv0 rrv0Var = (rrv0) ((wva0) this.c).i;
                mvv0 mvv0Var = (mvv0) this.d;
                synchronized (rrv0Var) {
                    try {
                        rrv0Var.b("data_to_useful_frame");
                        rrv0Var.b("useful_content_ready");
                        if (kbb.E(mvv0Var)) {
                            rrv0Var.b("interactive_ready");
                            rrv0Var.g = "success";
                        } else {
                            rrv0Var.g = "non_actionable_response";
                        }
                        if (!rrv0Var.h || !rrv0Var.i) {
                            rrv0Var.j.removeCallbacks(rrv0Var.k);
                            rrv0Var.j.postDelayed(rrv0Var.k, 30000L);
                        }
                        rrv0Var.d();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((feh) this.b).e(new uxy0((l0x0) this.c, (ou80) this.d, (byte) 2), s9x0.d);
                return;
            default:
                uga0 uga0Var = (uga0) this.d;
                pk21 pk21Var = (pk21) this.c;
                String str8 = (String) this.b;
                switch (str8.hashCode()) {
                    case -655379712:
                        if (str8.equals("contentHeight") && (ega0Var = (ega0) uga0Var.get("height")) != null) {
                            nhc1.a0(fga0.m(ega0Var).b());
                            return;
                        }
                        return;
                    case 3015911:
                        if (str8.equals("back")) {
                            pk21Var.a.invoke();
                            return;
                        }
                        return;
                    case 951117504:
                        if (str8.equals("confirm")) {
                            pk21Var.c.invoke();
                            return;
                        }
                        return;
                    case 2102494577:
                        if (!str8.equals("navigate") || (ega0Var2 = (ega0) uga0Var.get("to")) == null || (strG = fga0.g(fga0.m(ega0Var2))) == null) {
                            return;
                        }
                        pk21Var.b.invoke(strG);
                        return;
                    default:
                        return;
                }
        }
    }

    public /* synthetic */ uu1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ uu1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public uu1(Runnable runnable, Thread thread) {
        this.a = (byte) 18;
        this.b = runnable;
        this.c = thread;
    }
}
