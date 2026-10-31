package p;

import android.content.SharedPreferences;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes14.dex */
public final class cs implements oq, jq {
    public final mr a;
    public final fo70 b;
    public final yqg c;
    public final Observable d;
    public final Observable e;
    public final Flowable f;
    public final uh8 g;
    public final wbd1 h;
    public final vv i;
    public final iq j;
    public final dpb k;
    public final q8n l;
    public volatile Boolean m;
    public llm n;

    public cs(mr mrVar, fo70 fo70Var, yqg yqgVar, Observable observable, Observable observable2, Flowable flowable, uh8 uh8Var, wbd1 wbd1Var, vv vvVar, iq iqVar, dpb dpbVar, q8n q8nVar) {
        this.a = mrVar;
        this.b = fo70Var;
        this.c = yqgVar;
        this.d = observable;
        this.e = observable2;
        this.f = flowable;
        this.g = uh8Var;
        this.h = wbd1Var;
        this.i = vvVar;
        this.j = iqVar;
        this.k = dpbVar;
        this.l = q8nVar;
    }

    public static int n(ev evVar) {
        if (evVar == null) {
            return 3;
        }
        return evVar.a() ? 2 : 1;
    }

    public static ev r(lw lwVar) {
        return new ev(lwVar.b().a, lwVar.d(), lwVar.e(), lwVar.c(), lwVar.h(), lwVar.f());
    }

    public final Single a(String str) {
        lw lwVarO = o(str);
        if (lwVarO != null) {
            iq iqVar = this.j;
            iqVar.f(str);
            return new CompletableToSingle(this.i.b(new t521(Integer.valueOf(iqVar.g()), lwVarO.h() ? 2 : 1)), ur.b, (Object) null);
        }
        Single singleJust = Single.just(Boolean.FALSE);
        singleJust.getClass();
        return singleJust;
    }

    public final Single b(mlb1 mlb1Var) {
        return this.f.z().flatMap(new wr(this, mlb1Var)).onErrorReturn(qr.c);
    }

    public final Single c(String str, String str2, boolean z) {
        Single singleFlatMap;
        lw lwVarO = o(str);
        return (lwVarO == null || (singleFlatMap = this.d.firstOrError().flatMap(new bs(this, lwVarO, str, str2, z))) == null) ? Single.just(Boolean.FALSE) : singleFlatMap;
    }

    public final Single d(String str) {
        return this.d.firstOrError().flatMap(new or(this, yg8.X, str, (byte) 0));
    }

    public final mr20 e() {
        iq iqVar = this.j;
        iqVar.getClass();
        return hu20.c(o4p1.r(new zp(r4p1.j(f5p1.t(h4p1.f(new cq(iqVar, (lnm) null))), dq.a)), iqVar.d), new gq(this, (lnm) null));
    }

    public final ev f() {
        Object next;
        Iterator it = this.j.c().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Long lF = ((lw) next).f();
                long jLongValue = lF != null ? lF.longValue() : 0L;
                do {
                    Object next2 = it.next();
                    Long lF2 = ((lw) next2).f();
                    long jLongValue2 = lF2 != null ? lF2.longValue() : 0L;
                    if (jLongValue < jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        lw lwVar = (lw) next;
        if (lwVar != null) {
            return new ev(lwVar.b().a, lwVar.d(), lwVar.e(), lwVar.c(), lwVar.h(), lwVar.f());
        }
        return null;
    }

    public final Single g(String str) {
        return this.d.firstOrError().flatMap(new or(this, yg8.Y, str, (byte) 0));
    }

    public final Single h(ArrayList arrayList) {
        return Single.defer(new xr(arrayList, this));
    }

    public final Object i(e3o0 e3o0Var) {
        iq iqVar = this.j;
        return c921.H(iqVar.d, new wp(iqVar, (lnm) null, (byte) 0), e3o0Var);
    }

    public final boolean j() {
        Boolean bool = this.m;
        return (!this.k.isEnabled() || bool == null) ? !this.j.c().isEmpty() : bool.booleanValue();
    }

    public final Single k() {
        return m(this.j.c());
    }

    public final void l() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorClear;
        SharedPreferences sharedPreferencesB = this.j.b();
        if (sharedPreferencesB == null || (editorEdit = sharedPreferencesB.edit()) == null || (editorClear = editorEdit.clear()) == null) {
            return;
        }
        editorClear.apply();
    }

    public final Single m(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f.z().flatMap(new pr((byte) 0, this, (lw) it.next())));
        }
        return this.d.filter(qr.b).timeout(800L, TimeUnit.MILLISECONDS, Observable.just(aw.a)).firstOrError().flatMap(new rr(this, (byte) 0)).flatMap(new mr(this, arrayList, (byte) 1));
    }

    public final lw o(String str) {
        iq iqVar = this.j;
        SharedPreferences sharedPreferencesB = iqVar.b();
        return iqVar.a(str, sharedPreferencesB != null ? sharedPreferencesB.getString(str, null) : null);
    }

    public final Single p(lw lwVar) {
        return this.a.a(lwVar.b(), false).map(new pr((byte) 1, this, lwVar)).onErrorReturn(new tr(lwVar, (byte) 0)).flatMap(new pr((byte) 2, this, lwVar)).doOnSuccess(new nr(lwVar, this));
    }

    public final q941 q(lw lwVar) {
        Object obj;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        String str = lwVar.b().a;
        iq iqVar = this.j;
        iqVar.getClass();
        m941 m941Var = k941.a;
        String str2 = lwVar.b().a;
        try {
            String strB = ((sw) iqVar.g.getValue()).b(lwVar);
            if (strB == null) {
                m941Var = new m941(new ev(lwVar.b().a, lwVar.d(), lwVar.e(), lwVar.c(), lwVar.h(), lwVar.f()));
            } else {
                SharedPreferences sharedPreferencesB = iqVar.b();
                if (sharedPreferencesB != null && (editorEdit = sharedPreferencesB.edit()) != null && (editorPutString = editorEdit.putString(str2, strB)) != null) {
                    editorPutString.commit();
                    m941Var = new m941(new ev(lwVar.b().a, lwVar.d(), lwVar.e(), lwVar.c(), lwVar.h(), lwVar.f()));
                }
            }
        } catch (IOException e) {
            Logger.e(e, "AccountSwitching: Could not serialize user info for " + str2, new Object[0]);
        }
        if ((m941Var instanceof m941) && iqVar.g() > this.h.a.a()) {
            Iterator it = iqVar.c().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Long lF = ((lw) next).f();
                    long jLongValue = lF != null ? lF.longValue() : Long.MAX_VALUE;
                    do {
                        Object next2 = it.next();
                        Long lF2 = ((lw) next2).f();
                        long jLongValue2 = lF2 != null ? lF2.longValue() : Long.MAX_VALUE;
                        if (jLongValue > jLongValue2) {
                            next = next2;
                            jLongValue = jLongValue2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            lw lwVar2 = (lw) obj;
            if (lwVar2 != null) {
                String str3 = lwVar2.b().a;
                iqVar.f(lwVar2.b().a);
            }
        }
        return m941Var;
    }

    public final void start() {
        if (this.k.isEnabled()) {
            llm llmVarE = smo1.e(ha71.A(guo1.B(), this.l));
            this.n = llmVarE;
            c921.y(llmVarE, (o8n) null, 0, new yr(this, (lnm) null), 3);
        }
    }

    public final void stop() {
        llm llmVar = this.n;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.m = null;
    }
}
