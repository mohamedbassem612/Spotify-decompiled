package p;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.allboarding.model.v1.proto.OnboardingRequest;
import com.spotify.allboarding.model.v1.proto.SelectedItem;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.kidsaccount.api.v2.proto.NotEmpty;
import com.spotify.playlist.ai.creation.v2.SubmitMessageResponse;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oj80 implements Function, SingleOnSubscribe {
    public static final Object d = new Object();
    public static kvl1 e;
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public oj80(Context context, uz5 uz5Var, hrj0 hrj0Var, q8n q8nVar) {
        this.a = (byte) 20;
        mo2 mo2Var = new mo2(context, (byte) 0);
        no2 no2Var = new no2(hrj0Var, q8nVar, uz5Var, context, null, (byte) 0);
        this.b = mo2Var;
        this.c = no2Var;
    }

    public static hfp1 a(Context context, Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        if (u961.w().z(context)) {
            kvl1 kvl1VarF = f(context);
            synchronized (ioo1.a) {
                try {
                    ioo1.x(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        ioo1.b.a();
                    }
                    kvl1VarF.b(intent).b(new iyh1(intent, (byte) 10));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            f(context).b(intent);
        }
        return o0c.z(-1);
    }

    public static kvl1 f(Context context) {
        kvl1 kvl1Var;
        synchronized (d) {
            try {
                kvl1Var = e;
                if (kvl1Var == null) {
                    kvl1Var = new kvl1(context);
                    e = kvl1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kvl1Var;
    }

    public static oj80 h(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131624023, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131430614);
        if (recyclerViewT != null) {
            return new oj80(linearLayout, recyclerViewT, (byte) 15);
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131430614)));
        return null;
    }

    public static oj80 i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131624026, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) m5n1.t(viewInflate, 2131427530);
        if (frameLayout != null) {
            return new oj80((ScrollView) viewInflate, frameLayout, (byte) 17);
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131427530)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0289  */
    /* JADX WARN: Code duplicated, block: B:76:0x028e  */
    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = null;
        String str = null;
        boolean z = false;
        Object obj3 = this.b;
        switch (b) {
            case 4:
                if (vj.a[((p4o0) obj).ordinal()] == 1) {
                    return MaybeEmpty.a;
                }
                Set set = ((wj) obj3).a;
                hi hiVar = (hi) this.c;
                for (Object obj4 : set) {
                    if (((ej) obj4).c.a(hiVar)) {
                        obj2 = obj4;
                        ej ejVar = (ej) obj2;
                        return ejVar != null ? Maybe.e(ejVar) : MaybeEmpty.a;
                    }
                }
                ej ejVar2 = (ej) obj2;
                if (ejVar2 != null) {
                }
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    return rqt0.F(o6x.a, new qm((e2b0) this.c, (lnm) null, (byte) 1));
                }
                iza0 iza0Var = ((bza0) obj3).a;
                bgo0 bgo0VarO = NotEmpty.o();
                bgo0VarO.n();
                return iza0Var.e(bgo0VarO.build()).map(b610.h);
            case 6:
                q941 q941Var = (q941) obj;
                boolean z2 = q941Var instanceof m941;
                if (!z2) {
                    q941Var.toString();
                }
                mlb1 mlb1Var = (mlb1) obj3;
                String str2 = mlb1Var.b;
                if (str2 == null) {
                    m941 m941Var = z2 ? (m941) q941Var : null;
                    if (m941Var != null) {
                        str = m941Var.a.b;
                    }
                } else {
                    str = str2;
                }
                boolean z3 = ((oob1) mlb1Var).a;
                pq pqVar = (pq) this.c;
                if (z3) {
                    ((vbd1) pqVar.d.get()).a.onNext(new ewo0(str));
                } else {
                    ((wbd1) pqVar.c.get()).a(ymb1.b);
                }
                return CompletableEmpty.a;
            case 11:
                return new CompletableFromAction(new wf0((bs0) obj3, (bpt0) this.c, (String) obj, (byte) 2));
            case 13:
                Intent intent = (Intent) obj;
                j71 j71Var = (j71) obj3;
                return j71Var.e.b(new nlb1(((y61) this.c).d)).map(new f71(intent, (byte) 0)).concatMap(new gid(j71Var, intent, (byte) 13)).map(new g71(intent));
            case 14:
                Map map = (Map) obj;
                boolean zG = ((el1) obj3).f.g();
                String str3 = (String) this.c;
                if (zG) {
                    f7h f7hVar = (f7h) map.get(str3);
                    if (f7hVar != null) {
                        z = f7hVar.a;
                    }
                } else {
                    f7h f7hVar2 = (f7h) map.get(str3);
                    if (f7hVar2 != null) {
                        z = f7hVar2.c;
                    }
                }
                return Boolean.valueOf(z);
            case 19:
                return ((yl2) obj3).a((String) this.c, false).map(wcp1.e).onErrorReturn(vgp1.d);
            case 22:
                SubmitMessageResponse submitMessageResponse = (SubmitMessageResponse) obj;
                return ((j23) obj3).f(new e23(submitMessageResponse.getMessageId(), submitMessageResponse.getStatus(), null, submitMessageResponse.getSubmitTimestampMs(), submitMessageResponse.getSubmitTimestampMs(), (svi0) this.c, submitMessageResponse.getRetryAfterMs()), Observable.empty());
            case 23:
                return new j53((String) this.c, (List) obj, ((d93) obj3).a);
            case 24:
                String str4 = (String) this.c;
                zd3 zd3Var = ((tv00) obj).b;
                ((rd3) obj3).getClass();
                if (zd3Var == null) {
                    return Observable.just(new e331(new m231(new Exception(l1d.m("Failed to parse extension payload for uri: ", str4)))));
                }
                return zd3Var.a.length() == 0 ? Observable.just(new e331(new m231(new Exception(l1d.m("There is no Prerelease for this uri: ", str4))))) : Observable.just(new e331(zd3Var));
            default:
                om3 om3Var = (om3) obj3;
                oj80 oj80Var = om3Var.a;
                hm3 hm3Var = (hm3) this.c;
                String str5 = hm3Var.a;
                List list = hm3Var.b;
                EntryPoint entryPoint = hm3Var.c;
                Optional optional = (Optional) oj80Var.c;
                if (optional.isPresent()) {
                    optional.get().getClass();
                    bhn0.d();
                    return null;
                }
                qm3 qm3Var = (qm3) ((km3) oj80Var.b).b;
                String strConcat = "allboarding".concat(str5);
                cgq0 cgq0VarO = OnboardingRequest.o();
                List<String> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (String str6 : list2) {
                    zv51 zv51VarN = SelectedItem.n();
                    zv51VarN.n(str6);
                    arrayList.add(zv51VarN.build());
                }
                cgq0VarO.n(arrayList);
                return ioo1.O(qm3Var.c(strConcat, cgq0VarO.build()).map(new cp5((Object) entryPoint, (byte) 11))).map(new km3(om3Var, hm3Var, (byte) 0)).doOnSubscribe(new lm3(om3Var, (byte) 0));
        }
    }

    public jhm b(String str, g3d0 g3d0Var, qxc0 qxc0Var) {
        return new jhm("aligned_curation_add_to_playlist", irx.c, (fhm) null, Integer.valueOf(uj3.a[((me30) this.c).a(qxc0Var.e).ordinal()] == 1 ? 2131952187 : 2131960077), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(we3.b1, we3.c1), new t6(this, str, g3d0Var, (byte) 21)), 244);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(onm onmVar) {
        x4j1 x4j1Var;
        if (onmVar instanceof x4j1) {
            x4j1Var = (x4j1) onmVar;
            int i = x4j1Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                x4j1Var.c = i - os00.INVALID_ID;
            } else {
                x4j1Var = new x4j1(this, onmVar);
            }
        } else {
            x4j1Var = new x4j1(this, onmVar);
        }
        Object objA = x4j1Var.a;
        int i2 = x4j1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                ne neVar = new ne((byte) 10);
                neVar.l((cxc) this.b);
                neVar.g("https://app-version-sunsetting-cdn.spotifycdn.com/");
                neVar.c((i8b0) this.c);
                w4j1 w4j1Var = (w4j1) neVar.j().b(w4j1.class);
                x4j1Var.c = 1;
                objA = w4j1Var.a(x4j1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            return (p4j1) objA;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to get sunset music app versions", new Object[0]);
            return null;
        }
    }

    public InputMethodManager d() {
        return (InputMethodManager) ((znb0) this.c).getValue();
    }

    public LinearLayout e() {
        return (LinearLayout) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, onm onmVar) {
        oz1 oz1Var;
        if (onmVar instanceof oz1) {
            oz1Var = (oz1) onmVar;
            int i = oz1Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                oz1Var.d = i - os00.INVALID_ID;
            } else {
                oz1Var = new oz1(this, onmVar);
            }
        } else {
            oz1Var = new oz1(this, onmVar);
        }
        Object objF = oz1Var.b;
        int i2 = oz1Var.d;
        if (i2 == 0) {
            hm5.M(objF);
            xq81 xq81Var = (xq81) this.b;
            hni1 hni1Var = (hni1) this.c;
            String str2 = hni1Var.b;
            if (hni1Var.a == 0) {
                throw null;
            }
            oz1Var.a = str;
            oz1Var.d = 1;
            objF = xq81Var.f(str2, str, "wrapped-party", oz1Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = oz1Var.a;
            hm5.M(objF);
        }
        tz1 tz1Var = (tz1) objF;
        if (u890.j(tz1Var, qz1.a)) {
            return new fmi1(str);
        }
        if (u890.j(tz1Var, sz1.a)) {
            return new gmi1(str, nd90.a);
        }
        if (u890.j(tz1Var, rz1.a)) {
            return new gmi1(str, nd90.b);
        }
        eg.o();
        return null;
    }

    public boolean j() {
        return ((Boolean) ((mo2) this.b).invoke()).booleanValue();
    }

    public void k() {
        i8h1 i8h1Var = (i8h1) this.b;
        wqk0 wqk0Var = (wqk0) this.c;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("later_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public String l() {
        i8h1 i8h1Var = (i8h1) this.b;
        wqk0 wqk0Var = (wqk0) this.c;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("link_account_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://alexa.amazon.com/spa/")), x6h1VarC.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public void m() {
        i8h1 i8h1Var = (i8h1) this.b;
        wqk0 wqk0Var = (wqk0) this.c;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("set_default_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://alexa.amazon.com/spa/index.html#settings/music-settings/service-preferences")), x6h1VarC.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public w7h1 n(String str) {
        v7h1 v7h1Var = new v7h1();
        v7h1Var.a = (y6h1) ((x5j1) this.c).b;
        v7h1Var.c = Long.valueOf(System.currentTimeMillis());
        t6h1 t6h1Var = t6h1.f;
        o3b1 o3b1VarJ = f3o1.j();
        o3b1VarJ.c = (String) this.b;
        o3b1VarJ.b = "navigate_to_external_uri";
        o3b1VarJ.a = (byte) 1;
        o3b1.b(o3b1VarJ, "destination", str);
        v7h1Var.e = o3b1VarJ.a();
        return v7h1Var.a();
    }

    public w7h1 o(String str) {
        v7h1 v7h1Var = new v7h1();
        v7h1Var.a = (y6h1) ((x5j1) this.c).b;
        v7h1Var.c = Long.valueOf(System.currentTimeMillis());
        t6h1 t6h1Var = t6h1.f;
        o3b1 o3b1VarJ = f3o1.j();
        o3b1VarJ.c = (String) this.b;
        o3b1VarJ.b = "play";
        o3b1VarJ.a = (byte) 1;
        o3b1.b(o3b1VarJ, "item_to_be_played", str);
        v7h1Var.e = o3b1VarJ.a();
        return v7h1Var.a();
    }

    public hfp1 p(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        l5o l5oVar = (l5o) this.c;
        return (!(wyo1.j() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? o0c.i(l5oVar, new p2r(context, intent, (byte) 2)).e(l5oVar, new uk4(context, intent, (byte) 23)) : a(context, intent);
    }

    public void q(int i) {
        this.c = new wqk0(String.valueOf(i), (byte) 0);
    }

    public w7h1 r(String str) {
        v7h1 v7h1Var = new v7h1();
        v7h1Var.a = (y6h1) ((x5j1) this.c).b;
        v7h1Var.c = Long.valueOf(System.currentTimeMillis());
        t6h1 t6h1Var = t6h1.f;
        o3b1 o3b1VarJ = f3o1.j();
        o3b1VarJ.c = (String) this.b;
        o3b1VarJ.b = "shuffle_play";
        o3b1VarJ.a = (byte) 1;
        o3b1.b(o3b1VarJ, "context_to_be_played", str);
        v7h1Var.e = o3b1VarJ.a();
        return v7h1Var.a();
    }

    public w7h1 s(String str) {
        v7h1 v7h1Var = new v7h1();
        v7h1Var.a = (y6h1) ((x5j1) this.c).b;
        v7h1Var.c = Long.valueOf(System.currentTimeMillis());
        t6h1 t6h1Var = t6h1.f;
        o3b1 o3b1VarJ = f3o1.j();
        o3b1VarJ.c = (String) this.b;
        o3b1VarJ.b = "ui_navigate";
        o3b1VarJ.a = (byte) 1;
        o3b1.b(o3b1VarJ, "destination", str);
        v7h1Var.e = o3b1VarJ.a();
        return v7h1Var.a();
    }

    public void subscribe(SingleEmitter singleEmitter) {
        String str = (String) this.b;
        if (str.length() == 0) {
            singleEmitter.onSuccess(new w3i1((Long) null, "Empty request url"));
            return;
        }
        cxc cxcVarC = ((eo0) this.c).a.d.c();
        ne neVar = new ne((byte) 9);
        neVar.t();
        neVar.e0(str);
        cxcVarC.a(new ln21(neVar)).d(new do0(singleEmitter));
    }

    public w7h1 t() {
        v7h1 v7h1Var = new v7h1();
        v7h1Var.a = (y6h1) ((x5j1) this.c).b;
        v7h1Var.c = Long.valueOf(System.currentTimeMillis());
        t6h1 t6h1Var = t6h1.f;
        o3b1 o3b1VarJ = f3o1.j();
        o3b1VarJ.c = (String) this.b;
        o3b1VarJ.b = "ui_reveal";
        o3b1VarJ.a = (byte) 1;
        v7h1Var.e = o3b1VarJ.a();
        return v7h1Var.a();
    }

    public /* synthetic */ oj80(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public oj80(i8h1 i8h1Var) {
        this.a = (byte) 25;
        this.b = i8h1Var;
        this.c = new wqk0("alexaAccountLinking", (byte) 0);
    }

    public /* synthetic */ oj80(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public oj80(ConstraintLayout constraintLayout, RecyclerView recyclerView, EncoreButton encoreButton, View view, FrameLayout frameLayout) {
        this.a = (byte) 8;
        this.c = constraintLayout;
        this.b = view;
    }

    public oj80(Context context) {
        this.a = (byte) 1;
        this.b = context;
        this.c = new l5o();
    }

    public oj80(View view) {
        this.a = (byte) 0;
        this.b = view;
        this.c = dm5.S(3, new g030(this, (byte) 9));
    }

    public oj80(x5j1 x5j1Var, String str) {
        this.a = (byte) 27;
        this.c = x5j1Var;
        this.b = str;
    }
}
