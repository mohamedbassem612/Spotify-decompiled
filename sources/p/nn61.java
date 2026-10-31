package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nn61 implements fsc1, Function, k1q0, ObservableOnSubscribe, BiFunction, Function3, p2r0, nxa {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public nn61(byte b) {
        this.a = b;
        switch (b) {
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                Subject subjectC = BehaviorSubject.g(Boolean.FALSE).c();
                this.b = subjectC;
                this.c = subjectC.distinctUntilChanged();
                break;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.u771 */
    /* JADX WARN: Code duplicated, block: B:38:0x0108  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object a(List list, int i, onm onmVar) throws u771 {
        me71 me71Var;
        int i2;
        List list2;
        Map map;
        Iterator it;
        u771 u771Var;
        Object next;
        boolean z;
        List<String> pathSegments;
        g871 g871Var = (g871) this.c;
        if (onmVar instanceof me71) {
            me71Var = (me71) onmVar;
            int i3 = me71Var.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                me71Var.e = i3 - Integer.MIN_VALUE;
            } else {
                me71Var = new me71(this, onmVar);
            }
        } else {
            me71Var = new me71(this, onmVar);
        }
        Object obj = me71Var.c;
        int i4 = me71Var.e;
        u771 u771Var2 = null;
        if (i4 == 0) {
            hm5.M(obj);
            me71Var.a = list;
            me71Var.b = i;
            me71Var.e = 1;
            le71 le71Var = (le71) this.b;
            List list3 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((u771) it2.next()).a.a.a);
            }
            Object objA = le71Var.a(arrayList, me71Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            obj = objA;
            i2 = i;
            list2 = list;
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = me71Var.b;
            list2 = me71Var.a;
            hm5.M(obj);
        }
        Map map2 = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            if (entry.getValue() instanceof q131) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            g871Var.c(new i8r("Failed to load restriction from server for entities\n".concat(o7h.y0(linkedHashMap.keySet(), "\n", (String) null, (String) null, (iu30) null, 62))));
        }
        ArrayList arrayList2 = new ArrayList();
        List list4 = list2;
        Iterator it3 = list4.iterator();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            int i8 = i5 + 1;
            if (i5 < 0) {
                u771 u771Var3 = u771Var2;
                p7h.T();
                throw u771Var3;
            }
            u771 u771VarA = (u771) next2;
            t771 t771Var = u771VarA.a;
            bj71 bj71Var = u771VarA.c;
            t131 t131Var = (t131) map2.get(t771Var.a.a);
            if (t131Var == null || t131Var.equals(r131.a)) {
                map = map2;
                it = it3;
            } else if (!t131Var.equals(q131.a)) {
                if (!(t131Var instanceof s131)) {
                    eg.o();
                    return null;
                }
                Iterator it4 = ((s131) t131Var).a.a.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        map = map2;
                        it = it3;
                        u771Var = u771Var2;
                        next = u771Var;
                        break;
                    }
                    next = it4.next();
                    u771Var = u771Var2;
                    z771 z771Var = u771VarA.a.b;
                    Uri uri = ((d871) next).a.a;
                    map = map2;
                    if (!q3c.B(uri, "shareformat") && !q3c.B(uri, "wrapped")) {
                        it = it3;
                        z = false;
                    } else if (uri == null || (pathSegments = uri.getPathSegments()) == null) {
                        it = it3;
                        z = true;
                    } else {
                        int i9 = 0;
                        z = true;
                        for (Object obj2 : pathSegments) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                p7h.T();
                                throw u771Var;
                            }
                            Iterator it5 = it3;
                            String str = (String) obj2;
                            if (z) {
                                Uri uri2 = z771Var.a.a;
                                u771 pathSegments2 = uri2 != null ? uri2.getPathSegments() : u771Var;
                                if (u890.j(str, pathSegments2 != null ? (String) pathSegments2.get(i9) : u771Var)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            i9 = i10;
                            it3 = it5;
                        }
                        it = it3;
                    }
                    if (z) {
                        break;
                    }
                    map2 = map;
                    u771Var2 = u771Var;
                    it3 = it;
                }
                d871 d871Var = (d871) next;
                if (d871Var != null) {
                    if (d871Var.b) {
                        u771VarA = u771Var;
                    } else {
                        u771 u771Var4 = u771Var;
                        u771VarA = u771.a(u771VarA, u771Var4, u771Var4, bj71.a(bj71Var, dm61.y0(bj71Var.a, d871Var.d)), 3);
                    }
                }
            } else if (bj71Var.b) {
                map = map2;
                it = it3;
            } else {
                map = map2;
                it = it3;
                u771VarA = u771Var2;
            }
            if (u771VarA != null) {
                if (i5 == i2) {
                    i7 = i6;
                }
                arrayList2.add(u771VarA);
                i6++;
            }
            map2 = map;
            i5 = i8;
            it3 = it;
            u771Var2 = null;
        }
        if (arrayList2.isEmpty()) {
            g871Var.c(new h8r(jhc1.K("Could not load any share format because restrictions are empty.\n                                          |Entity Uris: " + o7h.y0(list4, ", ", (String) null, (String) null, s571.W0, 30) + "\n                                          |Share format ids: " + o7h.y0(list4, ",", (String) null, (String) null, s571.X0, 30))));
        }
        return new o031(i7, arrayList2);
    }

    public Object apply(Object obj) {
        d991 d991Var;
        String strA0;
        switch (this.a) {
            case 1:
                cs61 cs61Var = (cs61) this.c;
                String str = (String) this.b;
                if (!((Boolean) obj).booleanValue()) {
                    Single singleJust = Single.just(new op61(str));
                    singleJust.getClass();
                    return singleJust;
                }
                SingleSubject singleSubject = new SingleSubject();
                l811 l811Var = new l811();
                cs61Var.b.b(new j7b(singleSubject, cs61Var, l811Var, (byte) 5), new ok5(singleSubject, str, cs61Var, l811Var, (byte) 4), new bs61(l811Var, singleSubject, str, cs61Var)).b();
                ax7 ax7Var = cs61Var.c;
                ((i8h1) ax7Var.a.get()).f(ax7Var.b.e(), (Set) null);
                Single singleFlatMap = singleSubject.flatMap(new bb01(cs61Var, (byte) 23));
                singleFlatMap.getClass();
                return singleFlatMap;
            case 3:
                im0 im0Var = (im0) this.b;
                wa71 wa71VarG = im0Var.g((PlayerState) obj);
                tqw tqwVar = (tqw) this.c;
                return new CompletableFromAction(new wf0(im0Var, wa71VarG, tqwVar != null ? n3o1.y(tqwVar) : null, (byte) 18));
            case 14:
                yon yonVar = (yon) this.b;
                cfr cfrVar = (cfr) yonVar.e;
                mz01 mz01Var = (mz01) this.c;
                return cfr.b(cfrVar, Collections.singletonList(mz01Var.a), ((lik1) yonVar.b).a, Collections.singletonList((String) obj), z6x.a, mz01Var.b);
            case 18:
                pf81 pf81Var = (pf81) this.b;
                PublishSubject publishSubject = pf81Var.e;
                String str2 = (String) this.c;
                return publishSubject.filter(new vdn1(str2, (byte) 15)).map(e2x0.Z).startWith(Single.fromCallable(new wra(pf81Var.b, (String) obj, str2, (byte) 7)).map(f2x0.Z));
            case 20:
                hv81 hv81Var = (hv81) this.b;
                return hv81.h(hv81Var, hv81Var.b.k((i) this.c, (List) obj, false), null, 13);
            case 26:
                bs0 bs0Var = (bs0) this.b;
                tqw tqwVar2 = (tqw) this.c;
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().b();
                contextTrack.getClass();
                if (l4o1.G(contextTrack)) {
                    d991Var = d991.c;
                } else if (l4o1.U(contextTrack) && (strA0 = l4o1.a0(contextTrack, "pointer.uri")) != null && nhc1.Y(strA0, "spotify:podcast-chapter:", false)) {
                    d991Var = d991.d;
                } else if (l4o1.T(contextTrack)) {
                    d991Var = d991.e;
                } else {
                    d991Var = l4o1.P(contextTrack) ? d991.b : d991.a;
                }
                return new FlowableSingleSingle(new FlowableTake((FlowableMap) bs0Var.b)).flatMapCompletable(new r961(bs0Var, d991Var, tqwVar2, (byte) 23));
            default:
                dxy dxyVar = (dxy) this.b;
                return ((Flowable) ((idd1) dxyVar.f).getValue()).z().flatMapMaybe(new r961((ContextTrack) this.c, (PlayerState) obj, dxyVar, (byte) 27));
        }
    }

    public void b(String str, String str2, iu30 iu30Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) ((dn81) this.c).b;
        cn81 cn81Var = new cn81(this, str, str2);
        iu30Var.invoke(cn81Var);
        String str3 = (String) this.b;
        ArrayList arrayList = cn81Var.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((mmr0) it.next()).a);
        }
        String strN = (String) cn81Var.c.a;
        StringBuilder sb = new StringBuilder(str);
        sb.append('(');
        sb.append(o7h.y0(arrayList2, "", (String) null, (String) null, j141.c, 30));
        sb.append(')');
        if (strN.length() > 1) {
            strN = cy30.n("L", strN, ';');
        }
        sb.append(strN);
        String strL = cy30.l(str3, '.', sb.toString());
        n0h1 n0h1Var = (n0h1) cn81Var.c.b;
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((n0h1) ((mmr0) it2.next()).b);
        }
        linkedHashMap.put(strL, new gmv0(n0h1Var, arrayList3, cn81Var.a));
    }

    public SharedPreferences c() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = ((Context) this.b).getSharedPreferences("com.spotify.eventsender.shared.prefs", 0);
        this.c = sharedPreferences2;
        return sharedPreferences2;
    }

    public Object d(Object obj) {
        Object objInvoke;
        Object obj2 = this.c;
        ytw0 ytw0Var = ytw0.i;
        if (obj2 != ytw0Var) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.c;
            if (objInvoke == ytw0Var) {
                iu30 iu30Var = (iu30) this.b;
                iu30Var.getClass();
                objInvoke = iu30Var.invoke(obj);
                this.c = objInvoke;
                this.b = null;
            }
        }
        return objInvoke;
    }

    public hfp1 e(Object obj) throws Throwable {
        FileWriter fileWriter;
        s880 s880Var = (s880) this.c;
        JSONObject jSONObject = (JSONObject) ((djn) ((uo5) this.b).d).a.submit((Callable) new lhn(this, (byte) 6)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            jm61 jm61VarG = (jSONObject.getInt("settings_version") != 3 ? new hfb((byte) 7) : new sjb((byte) 24)).g((mta) ((ep31) s880Var.d).b, jSONObject);
            fp8 fp8Var = (fp8) s880Var.e;
            long j = jm61VarG.c;
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) fp8Var.b);
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    eth.k(fileWriter2);
                    throw th;
                }
            } catch (Exception unused2) {
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
            }
            eth.k(fileWriter);
            jSONObject.toString();
            Log.isLoggable("FirebaseCrashlytics", 3);
            String str = ((at61) s880Var.c).f;
            SharedPreferences.Editor editorEdit = ((Context) s880Var.b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) s880Var.h).set(jm61VarG);
            ((bsd1) ((AtomicReference) s880Var.a).get()).d(jm61VarG);
        }
        return o0c.z((Object) null);
    }

    public Observable f() {
        return (Observable) this.c;
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        return new r961((iu30) this.b, (dx81) this.c);
    }

    public n8d0 i(tqh0 tqh0Var) {
        n8d0 n8d0VarI = ((sw9) this.b).i(tqh0Var);
        if (n8d0VarI == null) {
            return null;
        }
        return ia.y(n8d0VarI, new z0i0(this, (byte) 1), l5u.a);
    }

    public n8d0 m(Uri uri) {
        return ia.y(((sw9) this.b).m(uri), new z0i0(this, (byte) 1), l5u.a);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        j53 j53Var = (j53) obj2;
        fb6 fb6Var = (fb6) obj3;
        gv81 gv81Var = (gv81) this.b;
        String str = fb6Var.a;
        String strL = gv81Var.l(str);
        String str2 = fb6Var.b;
        q3t0 q3t0Var = (q3t0) this.c;
        long j = q3t0Var.c;
        List list2 = fb6Var.c;
        r87 r87Var = gv81Var.g;
        mmr0 mmr0Var = new mmr0(strL, new bkf1(str, str2, j, ejb.d(list2, r87Var, false, 12)));
        String str3 = j53Var.a;
        return sqg0.J(new mmr0[]{mmr0Var, new mmr0(gv81Var.l(str3), new bkf1(str3, j53Var.b, q3t0Var.c, ejb.d(j53Var.c, r87Var, false, 12))), new mmr0(gv81Var.l(q3t0Var.a), new bkf1(q3t0Var.a, q3t0Var.b, q3t0Var.c, ejb.d(list, r87Var, !list.isEmpty(), 8)))});
    }

    public n8d0 q(byte[] bArr) {
        return ia.y(((sw9) this.b).q(bArr), new z0i0(this, (byte) 1), l5u.a);
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        Observable observableJust;
        switch (this.a) {
            case 9:
                mt60 mt60Var = (mt60) this.b;
                bhh bhhVar = (bhh) mt60Var.c;
                mnh mnhVar = (mnh) this.c;
                String str = mnhVar.a;
                String str2 = mnhVar.b;
                ygh yghVar = mnhVar.c;
                lik1 lik1Var = (lik1) mt60Var.f;
                c861 c861Var = new c861(mnhVar, observableEmitter, (byte) 21);
                syf syfVar = (syf) mt60Var.b;
                if (yghVar instanceof xgh) {
                    Flowable flowable = bhhVar.b;
                    observableJust = x0d.j(flowable, flowable).filter(rzs0.Q0).map(new d520((xgh) yghVar, bhhVar, str, str2, c861Var, syfVar, lik1Var));
                } else if (!(yghVar instanceof wgh)) {
                    eg.o();
                } else {
                    wgh wghVar = (wgh) yghVar;
                    observableJust = Observable.just(new kjm(new igm(wghVar.b, new wfm(Uri.parse(wghVar.a), fgm.c), (String) null, 4), Collections.singletonList(bhhVar.a(str2, lik1Var, c861Var)), false));
                }
                Observable observable = observableJust;
                mfm mfmVar = (mfm) mt60Var.e;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.b(mfmVar, observable, yon1.G1("COMMENTS", "comments", 376, "comments"), new bjm(4, str2, str), mnhVar.d, 16);
                break;
            default:
                x981 x981Var = (x981) this.b;
                ((Handler) x981Var.d).post(new sl21(x981Var, (m401) this.c, observableEmitter, (byte) 6));
                break;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        View view2 = (View) this.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        View view3 = (View) this.c;
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = view3.getResources().getDimensionPixelSize(2131167023) + hsl1Var.a.i(519).d;
        view2.setLayoutParams(layoutParams);
        return hsl1Var;
    }

    public /* synthetic */ nn61(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public nn61(le71 le71Var, q3c q3cVar, g871 g871Var) {
        this.a = (byte) 5;
        this.b = le71Var;
        this.c = g871Var;
    }

    public /* synthetic */ nn61(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public nn61(xrc0 xrc0Var, iyc0 iyc0Var, vhc vhcVar, boolean z) {
        this.a = (byte) 2;
        this.b = xrc0Var;
        this.c = iyc0Var;
    }

    public nn61(Context context) {
        this.a = (byte) 8;
        this.b = context;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public Object apply(Object obj, Object obj2) {
        boolean z;
        Boolean bool = (Boolean) obj2;
        if (!((Boolean) obj).booleanValue() || bool.booleanValue()) {
            z = false;
        } else {
            ln91 ln91Var = (ln91) ((ac10) this.b).c;
            ContextTrack contextTrack = (ContextTrack) this.c;
            ln91Var.getClass();
            if (ydh.b(ln91.a(contextTrack))) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
