package p;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.MobiusLoop;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mlw0 implements Function, b8x0, qiw, ya, xi7, qp91, t151, fyv0 {
    public final /* synthetic */ byte a;
    public Object b;

    public mlw0(t701 t701Var) {
        this.a = (byte) 14;
        j3r j3rVar = rzq.y;
        this.b = l2p1.f(t701Var);
    }

    public static ArrayList e(smc0 smc0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : smc0Var) {
            if (obj instanceof wxx0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wxx0) it.next()).a);
        }
        return arrayList2;
    }

    public cbr0 a() {
        return (cbr0) ((apq) this.b).a1.get();
    }

    public boolean accept(Object obj) {
        return ((i5y0) this.b).f();
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 1:
                SingleSubject singleSubject = new SingleSubject();
                ((lls0) this.b).z(new kyw0(singleSubject, (byte) 0), new kyw0(singleSubject, (byte) 1));
                return singleSubject;
            case 3:
                j8x0 j8x0Var = (j8x0) obj;
                tzr0 tzr0Var = (tzr0) this.b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List list = j8x0Var.b;
                ArrayList<obx0> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof obx0) {
                        arrayList.add(obj2);
                    }
                }
                for (obx0 obx0Var : arrayList) {
                    ebx0 ebx0Var = obx0Var.a;
                    String str = obx0Var.b;
                    q730 q730Var = obx0Var.f;
                    if (ebx0Var == jbx0.a || ebx0Var == dbx0.a || ebx0Var == lbx0.a || ebx0Var == ebx0.a) {
                        linkedHashSet.add(str);
                        linkedHashMap.put(str, q730Var);
                    }
                }
                return ((zsc) tzr0Var.c).C(sqg0.U(linkedHashMap), o7h.p1(linkedHashSet)).map(new yqu0(tzr0Var, j8x0Var, (byte) 22));
            case 11:
                List list2 = ((b5z0) this.b).d;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                for (Object obj3 : list2) {
                    linkedHashMap2.put(obj3, new hlk0((Double) null, (String) null, (String) null));
                }
                return new r7z0(linkedHashMap2);
            case 12:
                t5z0 t5z0Var = (t5z0) obj;
                ContextTrack contextTrackE = dcu0.e(t5z0Var.d, t5z0Var.g);
                tuz tuzVar = ((t6z0) this.b).c;
                return dcu0.b(tuzVar).flatMap(new ccu0(tuzVar, contextTrackE, t5z0Var.f, t5z0Var.i, t5z0Var.h, t5z0Var.j)).map(new uqv0(t5z0Var, (byte) 11)).onErrorReturn(c4x0.d).toObservable();
            case 15:
                ly21 ly21Var = (py21) obj;
                hbz0 hbz0Var = new hbz0((vr01) this.b, (byte) 5);
                if (ly21Var instanceof ly21) {
                    hbz0Var.invoke(ly21Var.a);
                    return Boolean.FALSE;
                }
                if (ly21Var instanceof oy21) {
                    return Boolean.TRUE;
                }
                eg.o();
                return null;
            case 19:
                kdy0 kdy0Var = (kdy0) this.b;
                zoy0 zoy0Var = ((uv00) obj).a(zoy0.class, (String) kdy0Var.c).b;
                long jB = (zoy0Var != null ? zoy0Var.c : -1L) - (((yqg) kdy0Var.d).b() / 1000);
                if (jB > 0) {
                    return Observable.timer(jB, TimeUnit.SECONDS, (Scheduler) kdy0Var.b).map(f2x0.g).startWithItem(Boolean.FALSE);
                }
                return Observable.just(Boolean.TRUE);
            case 21:
                return new a501(((k401) this.b).a, (Throwable) obj);
            case 22:
                c1f1 c1f1Var = (c1f1) ((yx11) this.b).b;
                Uri uri = Uri.parse(((ixd0) obj).a);
                g341 g341Var = c1f1Var.a;
                uri.getClass();
                return g341Var.b(uri).observeOn(c1f1Var.c).doOnSuccess(new z2a1(c1f1Var, (byte) 15)).ignoreElement().w();
            case 23:
                PlayerState playerState = (PlayerState) obj;
                m021 m021Var = (m021) this.b;
                if (!playerState.isPlaying() || playerState.isPaused()) {
                    return Flowable.I(playerState);
                }
                return Flowable.h(Flowable.I(playerState), new FlowableOnBackpressureLatest(Flowable.G(0L, 15L, TimeUnit.SECONDS, (Scheduler) m021Var.c)), f4x0.f);
            case 24:
                return (ObservableSource) ((bo31) this.b).q.invoke();
            case 25:
                if (((Boolean) obj).booleanValue() && ((u741) this.b).e.a.getAndSet(false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                ua41 ua41Var = (ua41) obj;
                return ((co70) this.b).d(ua41Var.c, ua41Var.d).d(Observable.just(new jb41(true))).onErrorReturn(y6x0.h);
        }
    }

    public void b(un91 un91Var) {
        th30 th30VarE0 = ((dg30) this.b).e0();
        if (th30VarE0.U()) {
            return;
        }
        un91Var.g1(th30VarE0, "PlayModePicker.Dialog");
    }

    public boolean c() {
        SearchFragment searchFragment = (SearchFragment) this.b;
        ffe1 ffe1VarZ0 = searchFragment.Z0();
        i8h1 i8h1Var = (i8h1) ffe1VarZ0.b;
        x6h1 x6h1VarC = ((bqk0) ffe1VarZ0.c).b.c();
        x6h1VarC.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        return pap1.w(searchFragment).t();
    }

    public void d(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    public r091 f(zau0 zau0Var) {
        r091 r091Var = (r091) this.b;
        if (r091Var == null || ((Boolean) r091Var.d.e.getValue()).booleanValue() || ((Boolean) r091Var.e.b.getValue()).booleanValue()) {
            if (zau0Var != null && zau0Var.b() == 0) {
                Logger.k("No available players in player group: " + zau0Var, new Object[0]);
                r091 r091Var2 = (r091) this.b;
                if (r091Var2 != null) {
                    r091Var2.g();
                }
            }
            this.b = zau0Var != null ? zau0Var.a() : null;
        }
        return (r091) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public void g(w611 w611Var, f3a f3aVar, f3a f3aVar2) {
        boolean zM;
        RecyclerView recyclerView = (RecyclerView) this.b;
        w611Var.B(false);
        zw81 zw81Var = recyclerView.p1;
        if (f3aVar != null) {
            zw81Var.getClass();
            int i = f3aVar.a;
            int i2 = f3aVar2.a;
            if (i == i2 && f3aVar.b == f3aVar2.b) {
                zw81Var.k(w611Var);
                zM = true;
            } else {
                zM = zw81Var.m(w611Var, i, f3aVar.b, i2, f3aVar2.b);
            }
        } else {
            zw81Var.k(w611Var);
            zM = true;
        }
        if (zM) {
            recyclerView.h0();
        }
    }

    public h0r0 h() {
        apq apqVar = (apq) this.b;
        hvj hvjVar = (hvj) apqVar.a.a.get();
        c8o.l(hvjVar);
        return new q651(hvjVar, apqVar.w, (zoq) apqVar.c1.get(), (cop) apqVar.d1.get(), (cbr0) apqVar.a1.get());
    }

    public void i(w611 w611Var, f3a f3aVar, f3a f3aVar2) {
        boolean zM;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.c.n(w611Var);
        recyclerView.i(w611Var);
        w611Var.B(false);
        zw81 zw81Var = recyclerView.p1;
        zw81Var.getClass();
        int i = f3aVar.a;
        int i2 = f3aVar.b;
        View view = w611Var.a;
        int left = f3aVar2 == null ? view.getLeft() : f3aVar2.a;
        int top = f3aVar2 == null ? view.getTop() : f3aVar2.b;
        if (w611Var.v() || (i == left && i2 == top)) {
            zw81Var.n(w611Var);
            zM = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM = zw81Var.m(w611Var, i, i2, left, top);
        }
        if (zM) {
            recyclerView.h0();
        }
    }

    public String j(xwx0 xwx0Var, String str, ArrayList arrayList) {
        Object next;
        StringBuilder sb = new StringBuilder();
        Map map = xwx0Var.t;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (u890.j(str2, "value")) {
                sb.append("data-value=\"" + lrn1.s(str) + "\" ");
            } else {
                sb.append(cy30.p("data-", str2, "=\"", lrn1.s(str3), "\" "));
            }
        }
        if (!map.containsKey("value")) {
            sb.append("data-value=\"" + lrn1.s(str) + "\" ");
        }
        String string = ihc1.e1(sb.toString()).toString();
        String str4 = xwx0Var.p;
        if (str4 != null) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((xwx0) next).a.equals(str4));
            xwx0 xwx0Var2 = (xwx0) next;
            if (xwx0Var2 != null && rrn1.E(xwx0Var2).size() > 1) {
                String str5 = (String) map.get("format-multiple");
                if (str5 == null) {
                    str5 = xwx0Var.e;
                }
                String str6 = (String) map.get("max-label-multiple");
                if (str6 == null) {
                    str6 = xwx0Var.j;
                }
                xwx0Var = xwx0.a(xwx0Var, str5, str6, 1048047);
            }
        }
        String str7 = xwx0Var.e;
        String str8 = xwx0Var.d;
        if (str7 != null) {
            LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0("value", str)});
            if (str8.length() > 0) {
                linkedHashMapM.put("unit", str8);
            }
            str = mju.b(str7, linkedHashMapM);
        }
        return cy30.p("<b ", string, ">", lrn1.s(str), "</b>");
    }

    public void k() {
        r091 r091Var = (r091) this.b;
        if (r091Var != null) {
            r091Var.g();
        }
        this.b = null;
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((Observable) ((ct8) this.b).b.invoke()).firstOrError().map(new uqv0(intent, (byte) 8)).onErrorReturn(m9x0.c);
    }

    public void m(String str, VideoSurfaceView videoSurfaceView) {
        r091 r091Var;
        bpb1 bpb1Var;
        i091 i091Var;
        lsm0 lsm0Var;
        ksm0 ksm0Var;
        r091 r091Var2 = (r091) this.b;
        if (!str.equals((r091Var2 == null || (bpb1Var = r091Var2.g) == null || (i091Var = (i091) bpb1Var.getValue()) == null || (lsm0Var = i091Var.a) == null || (ksm0Var = lsm0Var.b) == null) ? null : ksm0Var.e) || (r091Var = (r091) this.b) == null) {
            return;
        }
        r091Var.i(videoSurfaceView);
    }

    public void v(Object obj) {
        switch (this.a) {
            case 5:
                ((kvc1) this.b).C((List) obj);
                return;
            default:
                Set set = (Set) obj;
                h521 h521Var = (h521) this.b;
                set.getClass();
                MobiusLoop mobiusLoop = h521Var.b;
                if (mobiusLoop != null) {
                    mobiusLoop.a(new z421(set));
                    return;
                } else {
                    u890.C("loop");
                    throw null;
                }
        }
    }

    public /* synthetic */ mlw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ mlw0(uqv0 uqv0Var) {
        this.a = (byte) 8;
        this.b = (nnm) uqv0Var.b;
    }

    public mlw0(axx0 axx0Var, mju mjuVar) {
        this.a = (byte) 6;
        this.b = axx0Var;
    }

    public mlw0(ConstraintLayout constraintLayout, EncoreButton encoreButton) {
        this.a = (byte) 16;
        this.b = encoreButton;
    }
}
