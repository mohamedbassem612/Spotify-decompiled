package p;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cn implements Connection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public cn(Consumer consumer, zae zaeVar) {
        this.a = (byte) 11;
        this.b = consumer;
        this.c = zaeVar;
        consumer.accept(new y450(Collections.singleton(zaeVar.b)));
    }

    private final void a(Object obj) {
        yh50 yh50Var = (yh50) obj;
        uh50 uh50Var = (uh50) this.b;
        ScrollView scrollView = uh50Var.c;
        dhr0 dhr0Var = yh50Var.a;
        int iOrdinal = dhr0Var.ordinal();
        if (iOrdinal != 0 && iOrdinal != 3 && iOrdinal != 5) {
            scrollView.setVisibility(8);
            return;
        }
        Consumer consumer = (Consumer) this.c;
        ur00 ur00Var = uh50Var.b;
        TextView textView = (TextView) ur00Var.f;
        SpotifyIconView spotifyIconView = (SpotifyIconView) ur00Var.d;
        FacePileView facePileView = (FacePileView) ur00Var.c;
        textView.setText(yh50Var.h);
        ((TextView) ur00Var.e).setText(yh50Var.i);
        Button button = (Button) ur00Var.b;
        String string = yh50Var.k;
        if (string == null) {
            string = scrollView.getContext().getString(2131956948);
        }
        button.setText(string);
        button.setEnabled(true);
        button.setOnClickListener(new f1b(consumer, (byte) 7));
        if (th50.a[dhr0Var.ordinal()] == 1) {
            facePileView.setVisibility(8);
            spotifyIconView.setVisibility(0);
            return;
        }
        String str = yh50Var.c;
        String str2 = yh50Var.d;
        if (str2 == null) {
            str2 = "";
        }
        td10 td10Var = new td10(str, str2, yh50Var.e, (sd10) null);
        gw70 gw70Var = uh50Var.a;
        List listM = p7h.M(new td10[]{td10Var, uh50Var.d});
        if (!listM.isEmpty()) {
            listM.subList(1, listM.size());
        }
        tto1.s(gw70Var, null, facePileView.a, listM, facePileView.c, null);
        facePileView.setVisibility(0);
        spotifyIconView.setVisibility(8);
    }

    private final void b(Object obj) {
        yh50 yh50Var = (yh50) obj;
        int i = wh50.a[yh50Var.a.ordinal()];
        xh50 xh50Var = (xh50) this.b;
        ScrollView scrollView = xh50Var.e;
        if (i != 1) {
            scrollView.setVisibility(8);
            return;
        }
        Consumer consumer = (Consumer) this.c;
        byp bypVar = xh50Var.d;
        ScrollView scrollView2 = (ScrollView) bypVar.b;
        Button button = (Button) bypVar.c;
        scrollView2.setVisibility(0);
        ((TextView) bypVar.i).setText(yh50Var.h);
        ((TextView) bypVar.h).setText(yh50Var.i);
        ((TextView) bypVar.e).setText(yh50Var.l);
        boolean z = yh50Var.n;
        ProgressBar progressBar = (ProgressBar) bypVar.f;
        if (z) {
            progressBar.setVisibility(0);
            button.setText("");
            button.setEnabled(false);
            button.setOnClickListener(null);
        } else {
            progressBar.setVisibility(8);
            String string = yh50Var.k;
            if (string == null) {
                string = scrollView.getContext().getString(2131956948);
            }
            button.setText(string);
            button.setEnabled(true);
            button.setOnClickListener(new f1b(consumer, (byte) 8));
        }
        List list = yh50Var.f;
        if (list == null) {
            hhg1.n("Required value was null.");
            return;
        }
        TextView textView = (TextView) bypVar.d;
        View view = (View) bypVar.a;
        RecyclerView recyclerView = (RecyclerView) bypVar.g;
        textView.setText(yh50Var.j);
        if (recyclerView.getAdapter() == null) {
            Resources resources = xh50Var.c;
            j1e j1eVar = new j1e();
            j1eVar.b = resources.getDimensionPixelSize(2131166102);
            recyclerView.j(j1eVar);
            scrollView2.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAdapter(new rh50(xh50Var.a, xh50Var.b));
        }
        recyclerView.getAdapter().C(list);
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        int iC1 = layoutManager.c1();
        int iG1 = layoutManager.g1();
        if (iC1 == 0 && iG1 == list.size() - 1) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    private final void c(Object obj) {
        yh50 yh50Var = (yh50) obj;
        int i = hi50.a[yh50Var.a.ordinal()];
        ii50 ii50Var = (ii50) this.b;
        ScrollView scrollView = ii50Var.c;
        if (i != 1) {
            scrollView.setVisibility(8);
            return;
        }
        Consumer consumer = (Consumer) this.c;
        wmy wmyVar = ii50Var.b;
        TextView textView = (TextView) wmyVar.f;
        Button button = (Button) wmyVar.a;
        textView.setText(yh50Var.h);
        ((TextView) wmyVar.e).setText(yh50Var.i);
        ((TextView) wmyVar.c).setText(yh50Var.l);
        List list = yh50Var.f;
        String str = yh50Var.e;
        if (list == null) {
            hhg1.n("Required value was null.");
            return;
        }
        if (str == null) {
            hhg1.n("Required value was null.");
            return;
        }
        r2b r2bVar = (r2b) o7h.q0(list);
        td10 td10Var = new td10(r2bVar.d, r2bVar.c, r2bVar.b, (sd10) null);
        String str2 = yh50Var.c;
        String str3 = yh50Var.d;
        if (str3 == null) {
            str3 = "";
        }
        td10 td10Var2 = new td10(str2, str3, str, (sd10) null);
        FacePileView facePileView = (FacePileView) wmyVar.b;
        gw70 gw70Var = ii50Var.a;
        ArrayList arrayListO = p7h.O(new td10[]{td10Var, td10Var2});
        if (!arrayListO.isEmpty()) {
            arrayListO.subList(1, arrayListO.size());
        }
        tto1.s(gw70Var, null, facePileView.a, arrayListO, facePileView.c, null);
        boolean z = yh50Var.n;
        ProgressBar progressBar = (ProgressBar) wmyVar.d;
        if (z) {
            progressBar.setVisibility(0);
            button.setText("");
            button.setEnabled(false);
            button.setOnClickListener(null);
            return;
        }
        progressBar.setVisibility(8);
        String string = yh50Var.k;
        if (string == null) {
            string = scrollView.getContext().getString(2131956948);
        }
        button.setText(string);
        button.setEnabled(true);
        button.setOnClickListener(new f1b(consumer, (byte) 9));
    }

    public final void accept(Object obj) throws Throwable {
        CharSequence string;
        List listZ;
        c380 c380Var;
        c380 c380Var2;
        int i;
        int i2;
        String str;
        wnh wnhVarZ = null;
        int i3 = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                List<c5i1> list = ((on) obj).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (c5i1 c5i1Var : list) {
                    arrayList.add(new q8i1(c5i1Var.a, c5i1Var.b, c5i1Var.c));
                }
                ((en) this.c).C(o7h.O0(p8i1.b, arrayList));
                return;
            case 1:
                on onVar = (on) obj;
                if (!onVar.a.isEmpty()) {
                    u961 u961Var = (u961) ((qn) this.c).b;
                    ((EncoreTextView) u961Var.d).setVisibility(0);
                    ((EncoreTextView) u961Var.b).setVisibility(0);
                }
                ((cn) this.b).accept(onVar);
                return;
            case 2:
                q41 q41Var = (q41) obj;
                v51 v51Var = (v51) this.b;
                v51Var.S0.e(q41Var.a);
                v51Var.T0.e(q41Var.b);
                return;
            case 3:
                th2 th2Var = (th2) obj;
                mh2 mh2Var = (mh2) this.c;
                BehaviorSubject behaviorSubject = mh2Var.f;
                uj2 uj2Var = th2Var.d;
                if ((uj2Var instanceof vj2) || (uj2Var instanceof wj2)) {
                    behaviorSubject.onNext(jg2.a);
                    return;
                }
                if (!(uj2Var instanceof uj2)) {
                    if (uj2Var instanceof xj2) {
                        behaviorSubject.onNext(hg2.a);
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                zb90 zb90Var = uj2Var.a;
                boolean z = zb90Var instanceof xb90;
                if (z && th2Var.f) {
                    mh2Var.g.onNext(nh2.a);
                    return;
                }
                if (!z || th2Var.e) {
                    behaviorSubject.onNext(new kg2(zb90Var));
                    return;
                }
                djx0 djx0Var = mh2Var.b;
                int i4 = th2Var.a;
                int i5 = th2Var.b;
                int i6 = th2Var.c;
                djx0Var.getClass();
                behaviorSubject.onNext(new pg2(Period.between(LocalDate.of(i6, i5 + 1, i4), LocalDate.now()).getYears()));
                return;
            case 4:
                e1b e1bVar = (e1b) obj;
                g1b g1bVar = (g1b) this.b;
                Button button = (Button) g1bVar.e;
                TextView textView = (TextView) g1bVar.t;
                TextView textView2 = (TextView) g1bVar.i;
                TextView textView3 = (TextView) g1bVar.h;
                Consumer consumer = (Consumer) this.c;
                button.setOnClickListener(new f1b(consumer, (byte) 0));
                FacePileView facePileView = (FacePileView) g1bVar.f;
                facePileView.setOnClickListener(new f1b(consumer, (byte) 1));
                v4i1 v4i1Var = e1bVar.a;
                td10 td10Var = new td10(v4i1Var != null ? v4i1Var.c : null, v4i1Var != null ? v4i1Var.a : "", v4i1Var != null ? v4i1Var.b : null, (sd10) null);
                gw70 gw70Var = (gw70) g1bVar.b;
                List listM = p7h.M(new td10[]{td10Var, (td10) g1bVar.g});
                if (!listM.isEmpty()) {
                    listM.subList(1, listM.size());
                }
                tto1.s(gw70Var, null, facePileView.a, listM, facePileView.c, null);
                pqo pqoVar = e1bVar.b;
                if (u890.j(pqoVar, ir00.d)) {
                    textView3.setVisibility(0);
                    textView3.setText(textView3.getResources().getString(2131957340));
                    textView2.setVisibility(0);
                    textView2.setText(textView2.getResources().getString(2131957341));
                    textView.setVisibility(8);
                    return;
                }
                if (u890.j(pqoVar, ir00.f)) {
                    textView3.setVisibility(0);
                    textView3.setText(textView3.getResources().getString(2131956779));
                    textView2.setVisibility(0);
                    textView2.setText(textView2.getResources().getString(2131956780));
                    textView.setVisibility(8);
                    return;
                }
                if (!u890.j(pqoVar, ir00.e)) {
                    eg.o();
                    return;
                }
                textView3.setVisibility(0);
                ff4 ff4Var = (ff4) g1bVar.c;
                textView3.setText(ff4Var.a() ? textView3.getResources().getString(2131956789) : textView3.getResources().getString(2131956784));
                textView2.setVisibility(0);
                textView2.setText(textView2.getResources().getString(2131952737));
                textView.setVisibility(0);
                if (ff4Var.a()) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    string = Html.fromHtml(textView.getResources().getString(2131952736), 0);
                } else {
                    string = textView.getResources().getString(2131952741);
                }
                textView.setText(string);
                return;
            case 5:
                x5b x5bVar = ((s5b) obj).a;
                if (x5bVar instanceof x5b) {
                    cr6 cr6Var = (cr6) this.b;
                    x5b x5bVar2 = x5bVar;
                    Consumer consumer2 = (Consumer) this.c;
                    View view = (View) cr6Var.c;
                    String str2 = x5bVar2.j;
                    if (str2 == null || str2.length() == 0) {
                        view.setVisibility(0);
                        String str3 = x5bVar2.f;
                        String str4 = x5bVar2.g;
                        if (str4 == null) {
                            str4 = "";
                        }
                        td10 td10Var2 = new td10(str3, str4, (String) null, (sd10) null);
                        String str5 = x5bVar2.h;
                        String str6 = x5bVar2.i;
                        if (str6 == null) {
                            str6 = "";
                        }
                        td10 td10Var3 = new td10(str5, str6, (String) null, (sd10) null);
                        FacePileView facePileView2 = (FacePileView) cr6Var.g;
                        gw70 gw70Var2 = (gw70) cr6Var.b;
                        ArrayList arrayListO = p7h.O(new td10[]{td10Var2, td10Var3});
                        if (!arrayListO.isEmpty()) {
                            arrayListO.subList(1, arrayListO.size());
                        }
                        tto1.s(gw70Var2, null, facePileView2.a, arrayListO, facePileView2.c, null);
                        ProgressBar progressBar = (ProgressBar) cr6Var.f;
                        boolean z2 = x5bVar2.d;
                        Button button2 = (Button) cr6Var.d;
                        if (z2) {
                            button2.setText("");
                            button2.setEnabled(false);
                            progressBar.setVisibility(0);
                        } else {
                            button2.setText(view.getContext().getString(2131956948));
                            button2.setEnabled(true);
                            button2.setOnClickListener(new f1b(consumer2, (byte) 3));
                            progressBar.setVisibility(4);
                        }
                        ((Button) cr6Var.e).setOnClickListener(new f1b(consumer2, (byte) 2));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((dt71) this.c).a(obj);
                return;
            case 7:
                jc91 jc91Var = (jc91) obj;
                if (jc91Var instanceof hc91) {
                    ((Consumer) this.b).accept(new kae(Collections.singleton(((zae) this.c).b)));
                    return;
                } else {
                    if (jc91Var.equals(ic91.a)) {
                        return;
                    }
                    eg.o();
                    return;
                }
            case 8:
                i2h i2hVar = (i2h) obj;
                s2r0 s2r0Var = i2hVar.a;
                if (!(s2r0Var instanceof q2r0)) {
                    hhg1.n("Failed requirement.");
                    return;
                }
                imb1 imb1Var = i2hVar.c;
                if (!(imb1Var instanceof imb1)) {
                    hhg1.n("Failed requirement.");
                    return;
                }
                g0h g0hVar = (g0h) this.c;
                goc0 goc0Var = ((q2r0) s2r0Var).b;
                imb1 imb1Var2 = imb1Var;
                ArrayList arrayList2 = new ArrayList();
                List list2 = goc0Var.a;
                ArrayList arrayList3 = goc0Var.b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list2) {
                    fy6 fy6Var = (fy6) obj2;
                    if (imb1Var2.b || fy6Var.f) {
                        arrayList4.add(obj2);
                    }
                }
                int i7 = 0;
                for (Object obj3 : arrayList4) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        p7h.T();
                        throw null;
                    }
                    fy6 fy6Var2 = (fy6) obj3;
                    mka mkaVar = g0hVar.h;
                    o2h o2hVar = imb1Var2.c;
                    mkaVar.getClass();
                    t2h identifier = o2hVar.getIdentifier();
                    r2h r2hVar = identifier instanceof r2h ? new r2h(fy6Var2.b) : identifier instanceof s2h ? new s2h(fy6Var2.a) : q2h.a;
                    arrayList2.add(new e1h(fy6Var2, i7, ((o2hVar instanceof o2h) && o2hVar.a.equals(r2hVar)) ? 2 : ((o2hVar instanceof p2h) && ((p2h) o2hVar).a.equals(r2hVar)) ? 1 : 3));
                    i7 = i8;
                }
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(d1h.b);
                    for (Object obj4 : arrayList3) {
                        int i9 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        arrayList2.add(new b1h((nb6) obj4, i3));
                        i3 = i9;
                    }
                }
                g0hVar.C(arrayList2);
                return;
            case 9:
                qkh qkhVar = (ukh) obj;
                kjh kjhVar = (kjh) this.c;
                boolean z3 = qkhVar instanceof qkh;
                kjhVar.P0 = z3;
                if (z3) {
                    kjhVar.S0 = qkhVar.b;
                    listZ = (List) kjhVar.i.invoke(qkhVar);
                } else {
                    if (!(qkhVar instanceof tkh)) {
                        eg.o();
                        return;
                    }
                    tkh tkhVar = (tkh) qkhVar;
                    kjhVar.S0 = tkhVar.h;
                    RecyclerView recyclerView = kjhVar.Q0;
                    if (recyclerView != null) {
                        aiq0.a(recyclerView, new xwn1(kjhVar, qkhVar, (byte) 11));
                    }
                    kjhVar.h.getClass();
                    listZ = j7p1.z(tkhVar);
                }
                ((emc0) kjhVar).d.b(listZ, new nx30(qkhVar, kjhVar, (byte) 12));
                return;
            case 10:
                ((g8l) this.c).a.onNext(obj);
                return;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                hc91 hc91Var = (jc91) obj;
                if (hc91Var instanceof hc91) {
                    ((Consumer) this.b).accept(new y450(dm61.y0(Collections.singleton(((zae) this.c).b), o7h.p1(hc91Var.b))));
                    return;
                } else {
                    if (hc91Var.equals(ic91.a)) {
                        return;
                    }
                    eg.o();
                    return;
                }
            case grn1.d /* 12 */:
                tr3 tr3Var = (tr3) obj;
                ((Connection) this.b).accept(tr3Var);
                wzr wzrVar = (wzr) this.c;
                bpb1 bpb1Var = wzrVar.i;
                h230 h230Var = (h230) wzrVar.f.invoke(tr3Var);
                h230 h230Var2 = (h230) bpb1Var.getValue();
                if (h230Var2 != null && (c380Var = h230Var2.e.d.g) != null) {
                    mml mmlVar = h230Var2.a;
                    if (!c380Var.equals(h230Var.e.d.g) || !u890.j(mmlVar, h230Var.a)) {
                        bpb1 bpb1Var2 = wzrVar.X;
                        ls41 ls41Var = ls41.a;
                        bpb1Var2.getClass();
                        bpb1Var2.m((Object) null, ls41Var);
                    }
                }
                bpb1Var.getClass();
                bpb1Var.m((Object) null, h230Var);
                return;
            case 13:
                sxc0 sxc0Var = (sxc0) obj;
                hzs hzsVar = (hzs) this.c;
                un90 un90Var = sxc0Var.c;
                hzsVar.e = ryo1.x(un90Var);
                int iR = ryo1.r(un90Var);
                hzsVar.f = iR;
                hzsVar.d = iR == 0 ? tr80.d : yoi1.Q(0, iR);
                hzsVar.g = sxc0Var.e;
                return;
            case 14:
                tr3 tr3Var2 = (tr3) obj;
                ((Connection) this.b).accept(tr3Var2);
                k1t k1tVar = (k1t) this.c;
                bpb1 bpb1Var3 = k1tVar.X;
                qvm1 qvm1Var = (qvm1) k1tVar.g.invoke(tr3Var2);
                qvm1 qvm1Var2 = (qvm1) bpb1Var3.getValue();
                if (qvm1Var2 != null && (c380Var2 = qvm1Var2.e.e.g) != null) {
                    mml mmlVar2 = qvm1Var2.a;
                    if (!c380Var2.equals(qvm1Var.e.e.g) || !u890.j(mmlVar2, qvm1Var.a)) {
                        bpb1 bpb1Var4 = k1tVar.P0;
                        ls41 ls41Var2 = ls41.a;
                        bpb1Var4.getClass();
                        bpb1Var4.m((Object) null, ls41Var2);
                    }
                }
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, qvm1Var);
                return;
            case 15:
                tr3 tr3Var3 = (tr3) obj;
                ((Connection) this.b).accept(tr3Var3);
                s1t s1tVar = (s1t) this.c;
                bpb1 bpb1Var5 = s1tVar.g;
                jwm1 jwm1Var = (jwm1) s1tVar.e.invoke(tr3Var3);
                bpb1Var5.getClass();
                bpb1Var5.m((Object) null, jwm1Var);
                return;
            case 16:
                qau qauVar = (qau) obj;
                l811 l811Var = (l811) this.b;
                ku1 ku1Var = (ku1) this.c;
                synchronized (this) {
                    if (!l811Var.a) {
                        bpb1 bpb1Var6 = (bpb1) ((k42) ku1Var.b).o;
                        bpb1Var6.getClass();
                        bpb1Var6.m((Object) null, qauVar);
                    }
                    break;
                }
                return;
            case 17:
                ((Connection) this.b).accept((rbu) obj);
                return;
            case 18:
                ((Connection) this.b).accept((vcu) obj);
                return;
            case 19:
                hc91 hc91Var2 = (jc91) obj;
                jvn jvnVar = (jvn) this.c;
                if (hc91Var2 instanceof hc91) {
                    ((Consumer) this.b).accept(new ewu(dm61.y0(Collections.singleton(jvnVar.b), o7h.p1(hc91Var2.b)), jvnVar.c));
                    return;
                } else {
                    if (hc91Var2.equals(ic91.a)) {
                        return;
                    }
                    eg.o();
                    return;
                }
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                qhm0 qhm0Var = (qhm0) obj;
                bfz bfzVar = (bfz) this.c;
                yzu yzuVar = (yzu) bfzVar.b;
                idd1 idd1Var = (idd1) bfzVar.c;
                String string2 = ((Context) idd1Var.getValue()).getString(2131955622);
                boolean z4 = qhm0Var.a;
                List list3 = qhm0Var.b;
                wh90 wh90Var = new wh90(string2, z4);
                nh90 nh90Var = new nh90(((Context) idd1Var.getValue()).getString(2131955621));
                List<r6w0> list4 = qhm0Var.c;
                ArrayList arrayList5 = new ArrayList(q7h.U(list4, 10));
                for (r6w0 r6w0Var : list4) {
                    arrayList5.add(new sh90(r6w0Var, list3.equals(r6w0Var.b)));
                }
                mez mezVar = (mez) yzuVar.a;
                ArrayList arrayListN0 = o7h.N0(arrayList5, p7h.M(new ni90[]{wh90Var, nh90Var}));
                if (!mezVar.e.equals(arrayListN0)) {
                    mezVar.e = arrayListN0;
                    mezVar.h();
                }
                if (u890.j((List) bfzVar.e, list3)) {
                    return;
                }
                qzh qzhVar = (qzh) ((idd1) yzuVar.d).getValue();
                List list5 = list3;
                ArrayList arrayList6 = new ArrayList(q7h.U(list5, 10));
                int i10 = 0;
                for (Object obj5 : list5) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        p7h.T();
                        throw null;
                    }
                    n620 n620Var = (n620) obj5;
                    Context context = (Context) idd1Var.getValue();
                    switch (n620Var.a) {
                        case 1:
                            i = 2131955597;
                            break;
                        case 2:
                            i = 2131955596;
                            break;
                        case 3:
                            i = 2131955595;
                            break;
                        case 4:
                            i = 2131955592;
                            break;
                        case 5:
                            i = 2131955593;
                            break;
                        case 6:
                            i = 2131955594;
                            break;
                        default:
                            throw null;
                    }
                    arrayList6.add(new cfz(i10, yoi1.p((int) ((yoi1.o(n620Var.b, -12.0f, 12.0f) * 10.0f) + 120.0f), 0, 240), context.getString(i)));
                    i10 = i11;
                }
                qzhVar.f(new efz(arrayList6));
                bfzVar.e = list3;
                return;
            case 21:
                o800 o800Var = (o800) obj;
                ((uny) ((x700) this.b).b).E(new r800(o800Var.a, o800Var.b, o800Var.c, (xu2) this.c));
                return;
            case 22:
                w2z w2zVar = (w2z) ((qn) this.b).b;
                int iC = l1d.C(((va50) obj).a);
                if (iC == 0) {
                    TextView textView4 = (TextView) w2zVar.b;
                    ((ThreeDotsLoaderView) w2zVar.c).setVisibility(8);
                    textView4.sendAccessibilityEvent(8);
                    kf kfVar = new kf((Consumer) this.c, (byte) 4);
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(textView4.getContext(), 2130772055);
                    animationLoadAnimation.setAnimationListener(new wa50(kfVar, (byte) 0));
                    textView4.startAnimation(animationLoadAnimation);
                    return;
                }
                if (iC == 1) {
                    ((ThreeDotsLoaderView) w2zVar.c).setVisibility(0);
                    ((TextView) w2zVar.b).setVisibility(8);
                    return;
                } else if (iC == 2) {
                    ((ThreeDotsLoaderView) w2zVar.c).setVisibility(0);
                    ((TextView) w2zVar.b).setVisibility(8);
                    return;
                } else {
                    if (iC == 3) {
                        return;
                    }
                    eg.o();
                    return;
                }
            case 23:
                a(obj);
                return;
            case 24:
                b(obj);
                return;
            case 25:
                c(obj);
                return;
            case 26:
                ((Connection) this.b).accept(((iu30) ((x2y) this.c).c).invoke(obj));
                return;
            case 27:
                ((iu30) this.b).invoke(obj);
                return;
            case 28:
                ((r4u) ((wva0) this.b).f).e((qva0) obj);
                return;
            default:
                wkh wkhVar = (hlh) obj;
                b7x b7xVar = b7x.a;
                cce cceVar = (cce) ((ku1) this.b).b;
                if (wkhVar.equals(vkh.a)) {
                    wnhVarZ = wnh.a;
                } else if (wkhVar instanceof wkh) {
                    wkh wkhVar2 = wkhVar;
                    String strM = "";
                    ekh ekhVar = wkhVar2.a;
                    int i12 = wkhVar2.b;
                    boolean z5 = wkhVar2.c;
                    if (ekhVar instanceof ekh) {
                        Comment comment = ekhVar.b;
                        int iP = comment.p();
                        int i13 = iP == 0 ? -1 : itc0.a[l1d.C(iP)];
                        if (i13 == -1) {
                            n57.e("Author metadata not set for entity " + ekhVar);
                        } else if (i13 == 1) {
                            strM = l1d.m("spotify:user:", comment.E().getUsername());
                        } else if (i13 != 2) {
                            if (i13 != 3) {
                                eg.o();
                                return;
                            }
                            n57.e("Author metadata not set for entity " + ekhVar);
                        } else {
                            strM = comment.B().q();
                        }
                        strM.getClass();
                        wnhVarZ = ku1.a(wkhVar2, cceVar.w(i12, comment.r(), strM, z5));
                    } else if (ekhVar instanceof hkh) {
                        Reply reply = ((hkh) ekhVar).b;
                        int iN = reply.n();
                        int i14 = iN == 0 ? -1 : itc0.b[l1d.C(iN)];
                        if (i14 == -1) {
                            n57.e("Author metadata not set for entity " + ekhVar);
                        } else if (i14 == 1) {
                            strM = l1d.m("spotify:user:", reply.x().getUsername());
                        } else if (i14 != 2) {
                            if (i14 != 3) {
                                eg.o();
                                return;
                            }
                            n57.e("Author metadata not set for entity " + ekhVar);
                        } else {
                            strM = reply.v().q();
                        }
                        strM.getClass();
                        wnhVarZ = ku1.a(wkhVar2, cceVar.w(i12, reply.o(), strM, z5));
                    } else {
                        n57.e("Unsupported entity type: ".concat(ekhVar.getClass().getSimpleName()));
                    }
                } else if (wkhVar instanceof xkh) {
                    xkh xkhVar = (xkh) wkhVar;
                    String str7 = xkhVar.b;
                    int i15 = xkhVar.a;
                    i8h1 i8h1Var = (i8h1) cceVar.b;
                    gxk0 gxk0Var = (gxk0) cceVar.d;
                    Integer numValueOf = Integer.valueOf(i15);
                    x6h1 x6h1VarC = gxk0Var.a.c();
                    x6h1VarC.i.add(new a7h1("comment_row", ktk0.h(2), numValueOf, str7, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("thread_footer", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("hide_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    wnhVarZ = new aoh(str7);
                } else if (wkhVar instanceof ykh) {
                    ykh ykhVar = (ykh) wkhVar;
                    ekh ekhVar2 = ykhVar.c;
                    int i16 = ykhVar.a;
                    boolean z6 = ykhVar.b;
                    if (ekhVar2 instanceof ekh) {
                        tv80 tv80VarX = cceVar.x(ekhVar2.b.r(), i16, z6);
                        Comment comment2 = ekhVar2.b;
                        wnhVarZ = new boh(comment2.r(), comment2.p() == 2 ? new ip8(comment2.B()) : new jp8(comment2.E()), tv80VarX, false);
                    } else if (ekhVar2 instanceof hkh) {
                        tv80 tv80VarX2 = cceVar.x(((hkh) ekhVar2).b.o(), i16, z6);
                        Reply reply2 = ((hkh) ekhVar2).b;
                        wnhVarZ = new boh(reply2.o(), reply2.n() == 2 ? new ip8(reply2.v()) : new jp8(reply2.x()), tv80VarX2, true);
                    } else {
                        n57.e("Unsupported entity type: ".concat(ekhVar2.getClass().getSimpleName()));
                    }
                } else if (wkhVar instanceof zkh) {
                    zkh zkhVar = (zkh) wkhVar;
                    String str8 = zkhVar.b;
                    int i17 = zkhVar.a;
                    i8h1 i8h1Var2 = (i8h1) cceVar.b;
                    gxk0 gxk0Var2 = (gxk0) cceVar.d;
                    Integer numValueOf2 = Integer.valueOf(i17);
                    x6h1 x6h1VarC4 = gxk0Var2.a.c();
                    x6h1VarC4.i.add(new a7h1("comment_row", ktk0.h(2), numValueOf2, str8, (String) null));
                    x6h1VarC4.j = false;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("thread_footer", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("load_more_replies_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    wnhVarZ = new ioh(str8);
                } else if (wkhVar instanceof alh) {
                    alh alhVar = (alh) wkhVar;
                    boolean z7 = alhVar.b;
                    int i18 = alhVar.a;
                    boolean z8 = alhVar.c;
                    String str9 = alhVar.d;
                    gxk0 gxk0Var3 = (gxk0) cceVar.d;
                    i8h1 i8h1Var3 = (i8h1) cceVar.b;
                    if (z7) {
                        i2 = z8 ? 1 : 2;
                        Integer numValueOf3 = Integer.valueOf(i18);
                        x6h1 x6h1VarC7 = gxk0Var3.a.c();
                        x6h1VarC7.i.add(new a7h1("comment_row", ktk0.h(i2), numValueOf3, str9, (String) null));
                        x6h1VarC7.j = false;
                        x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                        x6h1VarC8.i.add(new a7h1("thread_footer", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                        x6h1VarC9.i.add(new a7h1("reply_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        str = str9;
                    } else {
                        i2 = z8 ? 1 : 2;
                        Integer numValueOf4 = Integer.valueOf(i18);
                        x6h1 x6h1VarC10 = gxk0Var3.a.c();
                        str = str9;
                        x6h1VarC10.i.add(new a7h1("comment_row", ktk0.h(i2), numValueOf4, str9, (String) null));
                        x6h1VarC10.j = false;
                        x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                        x6h1VarC11.i.add(new a7h1("reply_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                    wnhVarZ = new roh(str);
                } else if (wkhVar instanceof blh) {
                    blh blhVar = (blh) wkhVar;
                    ikh ikhVar = blhVar.a;
                    if (ikhVar instanceof ikh) {
                        boolean z9 = blhVar.c;
                        int i19 = blhVar.b;
                        String str10 = ikhVar.b;
                        i8h1 i8h1Var4 = (i8h1) cceVar.b;
                        gxk0 gxk0Var4 = (gxk0) cceVar.d;
                        i2 = z9 ? 1 : 2;
                        Integer numValueOf5 = Integer.valueOf(i19);
                        x6h1 x6h1VarC12 = gxk0Var4.a.c();
                        x6h1VarC12.i.add(new a7h1("comment_row", ktk0.h(i2), numValueOf5, str10, (String) null));
                        x6h1VarC12.j = false;
                        x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                        x6h1VarC13.i.add(new a7h1("reply_preview", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        wnhVarZ = new voh(ikhVar.b);
                    }
                } else if (wkhVar.equals(dlh.a)) {
                    i8h1 i8h1Var5 = (i8h1) cceVar.b;
                    x6h1 x6h1VarC14 = ((gxk0) cceVar.d).a.c();
                    x6h1VarC14.i.add(new a7h1("sensitive_comments_disclaimer", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = true;
                    y6h1 y6h1VarA = x6h1VarC14.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var5.f(k7h1Var.a(), (Set) null);
                } else if (wkhVar instanceof clh) {
                    cceVar.y();
                    wnhVarZ = zoh.a;
                } else if (wkhVar instanceof elh) {
                    cceVar.y();
                    c380 c380Var3 = ((elh) wkhVar).a.b;
                    ArrayList arrayList7 = new ArrayList(q7h.U(c380Var3, 10));
                    Iterator it = c380Var3.iterator();
                    while (it.hasNext()) {
                        arrayList7.add(((Reply) it.next()).o());
                    }
                    wnhVarZ = new aph(o7h.p1(arrayList7));
                } else if (wkhVar instanceof flh) {
                    flh flhVar = (flh) wkhVar;
                    ekh ekhVar3 = flhVar.c;
                    if (ekhVar3 instanceof ekh) {
                        ekh ekhVar4 = ekhVar3;
                        wnhVarZ = cceVar.z(flhVar.a, ekhVar4.c, flhVar.d, ekhVar4.b.r(), flhVar.b);
                    } else if (ekhVar3 instanceof hkh) {
                        hkh hkhVar = (hkh) ekhVar3;
                        wnhVarZ = cceVar.z(flhVar.a, hkhVar.c, flhVar.d, hkhVar.b.o(), flhVar.b);
                    } else {
                        n57.e("Unsupported entity type: ".concat(ekhVar3.getClass().getSimpleName()));
                    }
                    wnhVarZ = new hph(flhVar.e, wnhVarZ);
                } else {
                    if (!(wkhVar instanceof glh)) {
                        eg.o();
                        return;
                    }
                    glh glhVar = (glh) wkhVar;
                    ekh ekhVar5 = glhVar.c;
                    if (ekhVar5 instanceof ekh) {
                        ekh ekhVar6 = ekhVar5;
                        cceVar.A(glhVar.a, ekhVar6.c, glhVar.d, ekhVar6.b.r(), glhVar.b);
                    } else if (ekhVar5 instanceof hkh) {
                        hkh hkhVar2 = (hkh) ekhVar5;
                        cceVar.A(glhVar.a, hkhVar2.c, glhVar.d, hkhVar2.b.o(), glhVar.b);
                    } else {
                        n57.e("Unsupported entity type: ".concat(ekhVar5.getClass().getSimpleName()));
                    }
                }
                if (wnhVarZ != null) {
                    ((Consumer) this.c).accept(wnhVarZ);
                    return;
                }
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Disposable) this.b).dispose();
                return;
            case 1:
                ((cn) this.b).dispose();
                return;
            case 2:
                ((CompositeDisposable) this.c).dispose();
                return;
            case 3:
                ((Disposable) this.b).dispose();
                return;
            case 4:
                return;
            case 5:
                cr6 cr6Var = (cr6) this.b;
                ((Button) cr6Var.d).setOnClickListener(null);
                ((Button) cr6Var.e).setOnClickListener(null);
                return;
            case 6:
                ((xab1) this.b).d((CancellationException) null);
                return;
            case 7:
                return;
            case 8:
                ((Disposable) this.b).dispose();
                return;
            case 9:
                ((Disposable) this.b).dispose();
                return;
            case 10:
                ((Disposable) this.b).dispose();
                return;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return;
            case grn1.d /* 12 */:
                ((Connection) this.b).dispose();
                return;
            case 13:
                ((Disposable) this.b).dispose();
                return;
            case 14:
                ((Connection) this.b).dispose();
                return;
            case 15:
                ((Connection) this.b).dispose();
                return;
            case 16:
                ku1 ku1Var = (ku1) this.c;
                l811 l811Var = (l811) this.b;
                synchronized (this) {
                    ((k42) ku1Var.b).b();
                    l811Var.a = true;
                }
                return;
            case 17:
                ((Connection) this.b).dispose();
                xbu xbuVar = (xbu) this.c;
                ((qd9) xbuVar.a.b).a.accept(new ld9(Collections.singleton(jne.a)));
                ((bpb1) xbuVar.b.c).m((Object) null, w7x.a);
                return;
            case 18:
                ((Connection) this.b).dispose();
                ((ak9) ((cdu) this.c).a.b).b(Collections.singleton(jne.a));
                return;
            case 19:
                return;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((vku) this.b).c();
                return;
            case 21:
            case 22:
                return;
            case 23:
                ((Button) ((uh50) this.b).b.b).setOnClickListener(null);
                return;
            case 24:
                ((Button) ((xh50) this.b).d.c).setOnClickListener(null);
                return;
            case 25:
                ((Button) ((ii50) this.b).b.a).setOnClickListener(null);
                return;
            case 26:
                ((Connection) this.b).dispose();
                return;
            case 27:
                ((Function0) this.c).invoke();
                return;
            case 28:
                ((EditText) ((p410) ((wva0) this.b).d).c).removeTextChangedListener((lgh) this.c);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ cn(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    public /* synthetic */ cn(Connectable connectable, Disposable disposable, byte b) {
        this.a = b;
        this.c = connectable;
        this.b = disposable;
    }
}
