package p;

import android.app.Activity;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import android.view.View;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xu implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public xu(mou mouVar, lou louVar) {
        this.a = (byte) 23;
        this.b = mouVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void accept(Object obj) throws NoWhenBranchMatchedException {
        int mode;
        lny0 lny0Var;
        cos0 cos0Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                yu yuVar = (yu) this.b;
                kly0 kly0Var = yuVar.b;
                if (((kt91) kly0Var.get()).g()) {
                    String string = yuVar.c.getResources().getString(2131951759, str);
                    yuVar.h.m();
                    kt91 kt91Var = (kt91) kly0Var.get();
                    lgy lgyVarQ = k4k.q(string);
                    lgyVarQ.a0();
                    kt91Var.k(lgyVarQ.c());
                    ((vbd1) yuVar.a.get()).a.onNext(dwo0.a);
                }
                ((wbd1) yuVar.g.get()).a(ymb1.b);
                break;
            case 1:
                qx.a((qx) this.b).e("product_state_load");
                break;
            case 2:
                g72.d((g72) this.b, (ContextTrack) obj);
                break;
            case 3:
                ru7 ru7Var = (ru7) this.b;
                if (!ru7Var.X.d() || ((mode = ((uw7) ru7Var.Y).a.getMode()) != 2 && mode != 3 && mode != 1)) {
                    ru7Var.U0 = false;
                }
                break;
            case 4:
                String str2 = (String) obj;
                d48 d48Var = (d48) this.b;
                str2.getClass();
                if (!d48Var.i) {
                    a48 a48Var = d48Var.j;
                    String str3 = d48Var.k;
                    if (a48Var != null && str3 != null) {
                        d48Var.b(a48Var, str3);
                    }
                    d48Var.k = str2;
                    break;
                }
                break;
            case 5:
                ((dj8) this.b).a1((wi8) obj);
                break;
            case 6:
                vf2.c((vf2) this.b, ((Boolean) obj).booleanValue());
                break;
            case 7:
                mi8 mi8Var = (mi8) obj;
                it8 it8Var = (it8) this.b;
                if (mi8Var instanceof li8) {
                    it8.f(it8Var).a(((li8) mi8Var).a, false);
                } else if (mi8Var instanceof ki8) {
                    it8.f(it8Var).b(new ml8(yg8.c));
                    CompletableEmpty completableEmpty = CompletableEmpty.a;
                } else {
                    eg.o();
                }
                break;
            case 8:
                ((oir) this.b).b.onNext(Boolean.valueOf(((zc9) obj).a));
                break;
            case 9:
                we9 we9Var = (we9) obj;
                ((af9) this.b).getClass();
                fg9 fg9Var = we9Var.a;
                Map map = we9Var.b;
                if (fg9Var instanceof fg9) {
                    fg9 fg9Var2 = fg9Var;
                    String strA = fg9Var2.a();
                    fi9 fi9Var = (fi9) map.get(strA);
                    if (fi9Var == null || fi9Var == fi9.UNKNOWN) {
                        map.put(strA, fg9Var2.b());
                    }
                } else if (fg9Var instanceof pg9) {
                    String strA2 = ((pg9) fg9Var).a();
                    Map map2 = we9Var.c;
                    Object linkedList = map2.get(strA2);
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        map2.put(strA2, linkedList);
                    }
                    ((Queue) linkedList).add(fg9Var);
                }
                break;
            case 10:
                wg9.a((wg9) this.b).g(((fi41) ((mmr0) obj).a).a());
                break;
            case 11:
                ((xir) this.b).c.onNext(Boolean.valueOf(((xi9) obj).a));
                break;
            case 12:
                yi9 yi9Var = (yi9) obj;
                ((uf9) this.b).f(yi9Var.a, yi9Var.b.a);
                break;
            case 13:
                ofb.a((ofb) this.b, (m210) obj);
                break;
            case 14:
                njb njbVar = (ojb) obj;
                gjb gjbVar = (gjb) this.b;
                BehaviorSubject behaviorSubject = gjbVar.Y;
                if (njbVar instanceof hjb) {
                    behaviorSubject.onNext(new wib(1));
                } else if (njbVar instanceof ijb) {
                    behaviorSubject.onNext(new wib(2));
                } else if (njbVar instanceof jjb) {
                    behaviorSubject.onNext(new wib(5));
                } else if (njbVar instanceof kjb) {
                    behaviorSubject.onNext(new wib(3));
                } else if (njbVar instanceof njb) {
                    gjbVar.Z.onNext(njbVar.a());
                } else if (njbVar.equals(ljb.a)) {
                    behaviorSubject.onNext(new wib(4));
                } else {
                    eg.o();
                }
                break;
            case 15:
                ((zpb) this.b).b.onNext((wpb) obj);
                break;
            case 16:
                gfb gfbVar = (gfb) obj;
                if (gfbVar.a) {
                    ((xqd) this.b).g = true;
                }
                ((xqd) this.b).h = gfbVar.a;
                break;
            case 17:
                ((mcl) this.b).Q0.j((gbl) obj);
                break;
            case 18:
                Boolean bool = (Boolean) obj;
                apa apaVar = ((akm) this.b).b;
                if (apaVar != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    apaVar.Q0 = zBooleanValue;
                    apaVar.a.z(zBooleanValue);
                    apaVar.b.z(zBooleanValue);
                }
                break;
            case 19:
                ((inr) this.b).t = (d1l) obj;
                break;
            case 20:
                h06 h06Var = (h06) obj;
                knr knrVar = (knr) this.b;
                if (h06Var == h06.a) {
                    knrVar.c();
                }
                break;
            case 21:
                xpq0 xpq0Var = (ypq0) obj;
                xpq0 xpq0Var2 = xpq0Var instanceof xpq0 ? xpq0Var : null;
                if (xpq0Var2 != null) {
                    ((z1s) this.b).i.onNext(xpq0Var2.a());
                }
                break;
            case 22:
                ((BehaviorSubject) this.b).onNext((l0u) obj);
                break;
            case 23:
                Boolean bool2 = (Boolean) obj;
                mou mouVar = (mou) this.b;
                View viewC = mou.c(mouVar);
                if (viewC != null) {
                    mou.e(mouVar, viewC);
                } else {
                    mou.d(mouVar, bool2);
                }
                break;
            case 24:
                wpu wpuVarG = km0.g((km0) this.b);
                for (Activity activity : wpuVarG.a) {
                    activity.getClass();
                    wpuVarG.a(activity);
                }
                break;
            case 25:
                tuu tuuVar = (tuu) obj;
                ayl.b((ayl) this.b, tuuVar.a, tuuVar.b, 4);
                break;
            case 26:
                fc00 fc00Var = (fc00) this.b;
                fc00.c(fc00Var).invoke(ec00.c);
                fc00.b(fc00Var).e("Fatal error while writing to disk.", (Throwable) obj);
                break;
            case 27:
                hs00 hs00Var = (hs00) this.b;
                hs00Var.d = (String) obj;
                hs00Var.e.set(false);
                hs00Var.f.e();
                hs00Var.h = BehaviorSubject.g(z6x.a);
                break;
            case 28:
                uv00 uv00Var = (uv00) obj;
                if (!((wv00) uv00Var).f) {
                    ((djx) this.b).invoke(new e331(uv00Var));
                }
                break;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                td30 td30Var = (td30) this.b;
                qav qavVar = td30Var.c;
                zq4 zq4Var = td30Var.f;
                tfs0 tfs0Var = (tfs0) mmr0Var.a;
                Throwable th = (Throwable) mmr0Var.b;
                if (th == null) {
                    if (tfs0Var.b == 1) {
                        ((rav) qavVar).d(tfs0Var.d, qd00.PERSISTED);
                    }
                    zq4Var.a();
                } else {
                    ((rav) qavVar).d(tfs0Var.d, qd00.DROPPED);
                    zq4Var.e("Event " + tfs0Var + ".eventName persisting failed: " + th.getMessage(), th);
                }
                if (tfs0Var.b == 1 && (lny0Var = tfs0Var.c) != null) {
                    try {
                        if (th == null) {
                            cos0Var = cos0.b;
                        } else if (th instanceof SQLiteFullException) {
                            cos0Var = cos0.c;
                        } else if (th instanceof SQLiteDatabaseCorruptException) {
                            cos0Var = cos0.d;
                        } else {
                            cos0Var = th instanceof SQLiteCantOpenDatabaseException ? cos0.e : cos0.f;
                        }
                        lny0Var.onEventStored(cos0Var.a);
                    } catch (Throwable th2) {
                        zq4Var.e("Event " + tfs0Var + ".eventName callback call failed: " + th2.getMessage(), th2);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
