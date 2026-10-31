package p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.culturalmoments.stories.v1.ShareData;
import com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yt91 implements SingleTransformer, Function, w3b1, dec, h371, ObservableOnSubscribe {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public yt91(nda1 nda1Var) {
        this.a = (byte) 7;
        this.b = nda1Var;
        this.c = new err0(0);
        this.d = v8r.q(Boolean.FALSE);
    }

    public Intent a(String str) {
        int i = SocialListeningInfoDialogActivity.j1;
        Context context = (Context) this.b;
        String string = context.getString(2131962667);
        string.getClass();
        return lvx.g(context, string, context.getString(2131962665), new q3u(str));
    }

    public Object apply(Object obj) {
        byte b = this.a;
        e5a1 e5a1Var = e5a1.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                bp90 bp90Var = (bp90) obj;
                String str = (String) obj2;
                if (!bp90Var.d && !bp90Var.e) {
                    return new f5a1(str);
                }
                if (str == null) {
                    return e5a1Var;
                }
                return new d5a1(str, (wea0) this.c, ((s4b1) this.d).c == blc0.Lb);
            case 6:
                s4b1 s4b1Var = (s4b1) this.c;
                g5a1 g5a1Var = (g5a1) obj;
                v5a1 v5a1Var = (v5a1) obj2;
                if (!(g5a1Var instanceof d5a1)) {
                    if (!(g5a1Var instanceof f5a1)) {
                        if (g5a1Var.equals(e5a1Var)) {
                            return Single.just(crn0.a);
                        }
                        eg.o();
                        return null;
                    }
                    yt91 yt91Var = v5a1Var.b;
                    String str2 = ((f5a1) g5a1Var).a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    return Single.just(new drn0(yt91Var.a(str2)));
                }
                int i = u5a1.a[((d5a1) g5a1Var).b.b.ordinal()];
                n381 n381Var = v5a1Var.a;
                pdl0 pdl0Var = (pdl0) n381Var.c;
                i8h1 i8h1Var = (i8h1) n381Var.b;
                b7x b7xVar = b7x.a;
                if (i == 1) {
                    String strZ = s4b1Var.z();
                    strZ.getClass();
                    x6h1 x6h1VarC = pdl0Var.b.c();
                    x6h1VarC.i.add(new a7h1("scanning", (String) null, (Integer) null, strZ, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("scan_code", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    String strZ2 = s4b1Var.z();
                    strZ2.getClass();
                    x6h1 x6h1VarC2 = pdl0Var.b.c();
                    x6h1VarC2.i.add(new a7h1("deeplinking", (String) null, (Integer) null, strZ2, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                return rqt0.F(v5a1Var.e, new p651(v5a1Var, (ou80) this.d, g5a1Var, s4b1Var, (lnm) null, (byte) 19)).onErrorReturn(djx0.P0);
            default:
                nmr0 nmr0Var = (nmr0) obj;
                String str3 = (String) this.c;
                str3.getClass();
                m210 m210Var = ((r9c) this.d).e;
                myy myyVar = ((tma1) obj2).d;
                Object obj3 = nmr0Var.a;
                if (obj3 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                List<r2k> list = (List) obj3;
                Object obj4 = nmr0Var.b;
                if (obj4 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                String str4 = (String) obj4;
                ArrayList arrayList = new ArrayList(list.size());
                for (r2k r2kVar : list) {
                    if (str3.equals(r2kVar.getKey())) {
                        if (r2kVar instanceof y9b1) {
                            ArrayList arrayList2 = ((y9b1) r2kVar).c;
                            ArrayList arrayList3 = new ArrayList(arrayList2.size());
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                u310 u310VarA = myyVar.a((fvt0) it.next(), str4);
                                if (u310VarA != null) {
                                    arrayList3.add(u310VarA);
                                }
                            }
                            arrayList.addAll(arrayList3);
                        } else if (r2kVar instanceof r2k) {
                            fvt0 fvt0Var = r2kVar.d;
                            u310 u310VarA2 = fvt0Var == null ? null : myyVar.a(fvt0Var, str4);
                            if (u310VarA2 != null) {
                                arrayList.add(u310VarA2);
                            }
                        }
                    }
                }
                return new z310(arrayList, (f410) null, (m510) null, (String) null);
        }
    }

    public f9v b(v8v v8vVar, int i, b8c0 b8c0Var, String str) {
        qpt0 qpt0Var;
        w3b1 w3b1Var = (bih1) this.b;
        w3b1 w3b1Var2 = (w3b1) this.c;
        if (b8c0Var == null && (((qpt0Var = (qpt0) this.d) == qpt0.b && i == 2) || ((qpt0Var == qpt0.c && i == 3) || (qpt0Var == qpt0.d && (i == 2 || i == 3))))) {
            w3b1Var = w3b1Var2;
        }
        return w3b1Var.b(v8vVar, i, b8c0Var, str);
    }

    public Single c(Single single) {
        g2z g2zVar = (g2z) this.b;
        x1a1 x1a1Var = (x1a1) this.c;
        String str = (String) this.d;
        return single.doOnSuccess(new b3a1(g2zVar, x1a1Var, str, (byte) 0)).doOnError(new b3a1(g2zVar, x1a1Var, str, (byte) 1));
    }

    public dr41 create() {
        ShareData shareData = (ShareData) this.b;
        String title = shareData.getTitle();
        String description = shareData.getDescription();
        return new dr41(new jgo(title, shareData.getEntityUri(), shareData.o(), description, (xn10) this.c, (llw0) this.d), (byte) 9);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object d(String str, onm onmVar) {
        r0a1 r0a1Var;
        String str2;
        String str3;
        Context context;
        Context context2 = (Context) this.b;
        if (onmVar instanceof r0a1) {
            r0a1Var = (r0a1) onmVar;
            int i = r0a1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0a1Var.f = i - Integer.MIN_VALUE;
            } else {
                r0a1Var = new r0a1(this, onmVar);
            }
        } else {
            r0a1Var = new r0a1(this, onmVar);
        }
        Object obj = r0a1Var.d;
        int i2 = r0a1Var.f;
        if (i2 == 0) {
            hm5.M(obj);
            String string = context2.getString(2131962675);
            vyq0 vyq0Var = (vyq0) this.c;
            r0a1Var.a = str;
            r0a1Var.b = string;
            r0a1Var.c = context2;
            r0a1Var.f = 1;
            Object objI = b5p1.i(yoi1.g(((xvo) vyq0Var.b).a(true).onErrorReturnItem(Boolean.FALSE)), r0a1Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
            str2 = str;
            str3 = string;
            obj = objI;
            context = context2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = r0a1Var.c;
            str3 = r0a1Var.b;
            str2 = r0a1Var.a;
            hm5.M(obj);
        }
        String string2 = context.getString(((Boolean) obj).booleanValue() ? 2131962674 : 2131962673);
        int i3 = SocialListeningInfoDialogActivity.j1;
        return lvx.g(context2, str3, string2, new t3u(str2));
    }

    public Object e() {
        long jK = t8p1.k();
        if (jK == tge1.a) {
            return this.d;
        }
        lge1 lge1Var = (lge1) ((AtomicReference) this.b).get();
        int iA = lge1Var.a(jK);
        if (iA >= 0) {
            return lge1Var.c[iA];
        }
        return null;
    }

    public void f(q881 q881Var, Object obj) {
        f8c1 f8c1Var = (f8c1) this.b;
        hp91 hp91Var = f8c1Var.d;
        String str = (String) this.c;
        i8h1 i8h1Var = (i8h1) hp91Var.b;
        x6h1 x6h1VarC = ((txk0) hp91Var.c).b.c();
        x6h1VarC.i.add(new a7h1("story_container", "", (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("add_to_library_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        fns fnsVar = igu.a;
        fn31.T(smo1.e(pyf0.a), (o8n) null, 0, new bfb1(f8c1Var, str, (bpb1) this.d, (lnm) null, (byte) 3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(vr20 vr20Var, onm onmVar) {
        vjb1 vjb1Var;
        vr20 vr20Var2;
        nw80 nw80Var;
        cx80 cx80VarD;
        if (onmVar instanceof vjb1) {
            vjb1Var = (vjb1) onmVar;
            int i = vjb1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vjb1Var.d = i - Integer.MIN_VALUE;
            } else {
                vjb1Var = new vjb1(this, onmVar);
            }
        } else {
            vjb1Var = new vjb1(this, onmVar);
        }
        Object objI = vjb1Var.b;
        int i2 = vjb1Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            if (x74.j(((bn3) this.c).a, "android.permission.RECORD_AUDIO") == 0) {
                mr20 mr20Var = (mr20) this.d;
                vjb1Var.a = vr20Var;
                vjb1Var.d = 2;
                objI = b5p1.i(mr20Var, vjb1Var);
                if (objI != d9nVar) {
                }
            } else {
                vjb1Var.a = null;
                vjb1Var.d = 1;
                if (vr20Var.emit(ft81.a, vjb1Var) != d9nVar) {
                    return rih1Var;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objI);
            return rih1Var;
        }
        if (i2 == 2) {
            vr20Var = vjb1Var.a;
            hm5.M(objI);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    hm5.M(objI);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vr20Var2 = vjb1Var.a;
            hm5.M(objI);
        }
        nw80Var = (nw80) objI;
        if (nw80Var == null && (cx80VarD = nw80Var.d((g38) null)) != null) {
            cx80VarD.d();
            return rih1Var;
        }
        vjb1Var.a = null;
        vjb1Var.d = 4;
        if (vr20Var2.emit(vs81.a, vjb1Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        if (!(objI instanceof zz80)) {
            p3t p3tVar = (p3t) this.b;
            vjb1Var.a = vr20Var;
            vjb1Var.d = 3;
            objI = b5p1.k(p3tVar, vjb1Var);
            if (objI != d9nVar) {
                vr20Var2 = vr20Var;
                nw80Var = (nw80) objI;
                if (nw80Var == null) {
                }
                vjb1Var.a = null;
                vjb1Var.d = 4;
                if (vr20Var2.emit(vs81.a, vjb1Var) == d9nVar) {
                }
            }
            return d9nVar;
        }
        return rih1Var;
    }

    public Single h(r9c r9cVar) {
        return ((o241) this.d).b("country_code").take(1L).singleOrError().flatMap(new r2a1(this, r9cVar, (byte) 6));
    }

    public void i(String str, String str2) {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((yok0) this.d).b.c();
        x6h1VarC.i.add(new a7h1("story_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("story_error", (String) null, (Integer) null, (String) null, str2));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA = x6h1VarC2.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = r6h1.c;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public void j(Object obj) {
        long jK = t8p1.k();
        if (jK == tge1.a) {
            this.d = obj;
            return;
        }
        synchronized (this.c) {
            lge1 lge1Var = (lge1) ((AtomicReference) this.b).get();
            int iA = lge1Var.a(jK);
            if (iA < 0) {
                ((AtomicReference) this.b).set(lge1Var.b(jK, obj));
            } else {
                lge1Var.c[iA] = obj;
            }
        }
    }

    public void k(String str, Function0 function0, Function0 function1) {
        Activity activity = (Activity) this.b;
        mw40 mw40VarT = yoi1.T(activity, activity.getString(2131962657), str != null ? activity.getString(2131962655, str) : activity.getString(2131962656));
        String string = activity.getString(2131962653);
        wzk wzkVar = new wzk(function0, (byte) 7);
        mw40VarT.a = string;
        mw40VarT.c = wzkVar;
        String string2 = activity.getString(R.string.cancel);
        wzk wzkVar2 = new wzk(function1, (byte) 8);
        mw40VarT.b = string2;
        mw40VarT.d = wzkVar2;
        mw40VarT.b().b();
    }

    public void l(int i) {
        char c;
        String str;
        Context context = (Context) this.b;
        String string = context.getString(2131962671);
        String string2 = context.getString(2131962647);
        int i2 = SocialListeningInfoDialogActivity.j1;
        Intent intentG = lvx.g(context, string, string2, o3u.a);
        intentG.setFlags(268435456);
        context.startActivity(intentG);
        int i3 = i == 0 ? -1 : q0a1.a[l1d.C(i)];
        if (i3 != 1) {
            c = i3 != 2 ? (char) 0 : (char) 1;
        } else {
            c = 2;
        }
        if (c != 0) {
            i8h1 i8h1Var = (i8h1) this.d;
            r6h1 r6h1Var = r6h1.c;
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-jam-has-ended-message";
            x6h1VarI.f = "1.0.0";
            x6h1VarI.g = "22.0.0";
            if (c == 1) {
                str = "in_app";
            } else {
                if (c != 2) {
                    throw null;
                }
                str = "push_notification";
            }
            x6h1VarI.e = str;
            y6h1 y6h1VarA = x6h1VarI.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = r6h1.c;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
        }
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        loc1 loc1Var = (loc1) this.b;
        String str = (String) this.c;
        Disposable disposableSubscribe = ((Observable) this.d).subscribe(new qc6(observableEmitter, (byte) 2), new qc6(observableEmitter, (byte) 3), new ruz0(observableEmitter, (byte) 15));
        observableEmitter.setCancellable(new fi30(str, loc1Var.b(str, observableEmitter, disposableSubscribe), loc1Var, disposableSubscribe));
    }

    public yt91(i8h1 i8h1Var) {
        this.a = (byte) 14;
        this.b = i8h1Var;
    }

    public yt91(Activity activity, b0a0 b0a0Var) {
        this.a = (byte) 3;
        this.b = activity;
        this.c = b0a0Var;
    }

    public yt91(Context context) {
        this.a = (byte) 23;
        this.b = context;
        this.d = new HashMap();
        this.c = zce0.a(context);
    }

    public yt91(Context context, b0a0 b0a0Var, vyq0 vyq0Var, i8h1 i8h1Var) {
        this.a = (byte) 2;
        this.b = context;
        this.c = vyq0Var;
        this.d = i8h1Var;
    }

    public /* synthetic */ yt91(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public yt91() {
        this.a = (byte) 1;
        this.b = new AtomicReference(who1.a);
        this.c = new Object();
    }

    public yt91(ConstraintLayout constraintLayout, RecyclerView recyclerView, ImageView imageView, View view, FrameLayout frameLayout) {
        this.a = (byte) 12;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = view;
    }

    public yt91(lzn0 lzn0Var, pwa1 pwa1Var) {
        this.a = (byte) 13;
        u9c0 u9c0VarQ = cto1.q(krw0.i);
        this.b = lzn0Var;
        this.c = pwa1Var;
        this.d = u9c0VarQ;
    }
}
