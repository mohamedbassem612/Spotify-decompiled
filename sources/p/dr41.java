package p;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dr41 implements Function, Producer, qiw, std, jrq0, BiPredicate, sh {
    public final /* synthetic */ byte a;
    public final Object b;

    public dr41(qa61 qa61Var) {
        this.a = (byte) 7;
        this.b = new HashSet((Collection) qa61Var.a);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                return ((n851) obj2).b((MainViewResponse) obj);
            case 6:
                dwi0 dwi0Var = (dwi0) obj;
                p23 p23Var = (p23) obj2;
                return new s23(p23Var.b, new wvi0(dwi0Var.a, dwi0Var.c, p23Var.c, dwi0Var.e));
            case 8:
                j560 j560Var = (j560) obj;
                fk61 fk61Var = (fk61) obj2;
                if (j560Var instanceof d560) {
                    d560 d560Var = (d560) j560Var;
                    c560 c560Var = d560Var.a;
                    return fk61Var.a(c560Var.a(), c560Var.b(), d560Var.b);
                }
                if (j560Var instanceof f560) {
                    f560 f560Var = (f560) j560Var;
                    c560 c560Var2 = f560Var.a;
                    return fk61Var.a(c560Var2.a(), c560Var2.b(), f560Var.c);
                }
                if ((j560Var instanceof h560) || (j560Var instanceof i560)) {
                    return (CompletableSource) fk61Var.a.invoke();
                }
                if (j560Var instanceof e560) {
                    return CompletableEmpty.a;
                }
                if (j560Var instanceof g560) {
                    return CompletableEmpty.a;
                }
                eg.o();
                return null;
            case 10:
                PublishSubject publishSubject = new PublishSubject();
                y441 y441Var = (y441) obj2;
                q9t q9tVar = ((q0n1) obj).c;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131964176});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                lw6 lw6Var = new lw6(q9tVar, y441Var, (byte) 4);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131964176});
                ((kt91) y441Var.a).k(new er91((fs91) null, "", 2131964176, (String) null, 2131964177, new kw6(y441Var, q9tVar, publishSubject, (byte) 21), (cvr) null, lw6Var, false));
                return publishSubject;
            case 13:
                return new zp81(((ar81) obj2).g.n, ((e331) obj).a);
            case 14:
                hv81 hv81Var = (hv81) obj2;
                return hv81.h(hv81Var, hv81Var.b.j((List) obj), null, 13);
            case 17:
                return new a4a1(((a2a1) obj2).a, false);
            case 18:
                return new mmr0(((ContextTrack) obj2).uri(), (gqa1) obj);
            case 20:
                gbl gblVar = (gbl) obj;
                BehaviorSubject behaviorSubjectG = BehaviorSubject.g(gblVar);
                if (gblVar != gbl.f) {
                    return behaviorSubjectG;
                }
                Observable observableDelay = behaviorSubjectG.delay(1L, TimeUnit.SECONDS, (Scheduler) obj2);
                observableDelay.getClass();
                return observableDelay;
            case 25:
                r13 r13Var = (t13) obj;
                nt21 nt21Var = (nt21) ((g2x0) obj2).b;
                if (r13Var instanceof r13) {
                    nt21Var.i(2);
                    return new hcc1(r13Var.a);
                }
                if (r13Var instanceof s13) {
                    nt21Var.i(3);
                    return new gcc1(((s13) r13Var).a);
                }
                eg.o();
                return null;
            default:
                v491 v491Var = (v491) obj2;
                return v491.h(v491Var, v491Var.a.j((List) obj), (LinkedHashSet) null, 6);
        }
    }

    public void e(int i) {
        ((SlateMessageHostActivity) this.b).finish();
    }

    public void f(List list) {
        for (int i = 0; i < list.size(); i++) {
            ((HashSet) this.b).add(new pa61(((Integer) list.get(i)).intValue()));
        }
    }

    public void g(ArrayList arrayList) {
        ((HashSet) this.b).addAll(arrayList);
    }

    public Object get() {
        return new SchedulerWorkRunner(((c751) this.b).P0);
    }

    public qa61 h() {
        return new qa61((HashSet) this.b);
    }

    public jgb1 i() {
        c0g.x.getClass();
        return new jgb1("showRecentlyPlayedArtists", 2131962010, null, 2131962009, null, null, null, null, cxo1.P0, ((pcl) this.b).a(), new ibd1(new xad1(47, false), new ebd1(rz71.a1, rz71.b1, new nsm0(2, k981.b, i981.class, "toProductStateValue", "toProductStateValue$src_main_java_com_spotify_profile_settings_showrecentlyplayedartists_impl_impl(Ljava/lang/String;Z)Ljava/lang/String;", 0, (byte) 26))), null, 73658);
    }

    public void j(Intent intent, p371 p371Var, yn71 yn71Var) {
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", l0p1.j(p371Var, yn71Var.a));
        ((oiv) this.b).f(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(String str, onm onmVar) {
        hya1 hya1Var;
        if (onmVar instanceof hya1) {
            hya1Var = (hya1) onmVar;
            int i = hya1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hya1Var.d = i - Integer.MIN_VALUE;
            } else {
                hya1Var = new hya1(this, onmVar);
            }
        } else {
            hya1Var = new hya1(this, onmVar);
        }
        Object objJ = hya1Var.b;
        int i2 = hya1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Uri uri = Uri.parse(str);
                if (!"www.spotify.com".equalsIgnoreCase(uri.getHost())) {
                    return str;
                }
                Single singleC = ((g341) this.b).c(uri);
                hya1Var.a = str;
                hya1Var.d = 1;
                objJ = fc11.j(singleC, hya1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = hya1Var.a;
                hm5.M(objJ);
            }
            String string = ((Uri) objJ).toString();
            string.getClass();
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    public boolean r(View view) {
        ((View) this.b).performClick();
        return true;
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        c6b1 c6b1Var = (c6b1) this.b;
        bma1 bma1Var = c6b1.f;
        long jB = ((yqg) c6b1Var.b.get()).b();
        return playerState.isPlaying() == playerState2.isPlaying() && playerState.isPaused() == playerState2.isPaused() && u890.j(playerState.duration(), playerState2.duration()) && u890.j(playerState.position(jB), playerState2.position(jB));
    }

    public void v(Object obj) {
        hw31 hw31Var = (hw31) obj;
        e061 e061Var = (e061) this.b;
        dtw dtwVar = (dtw) e061Var.i.getValue();
        String str = hw31Var.a;
        String str2 = hw31Var.e;
        dtwVar.f(new yx51(str, str2, ago1.u(hw31Var.c, hw31Var.d, str2, str, hw31Var.b, true), hw31Var.c, hw31Var.d, new d061(1, e061Var, e061.class, "emitRowSelectionEvent", "emitRowSelectionEvent(Lcom/spotify/transcript/list/data/RowSelection;)V", 0, (byte) 0), e061Var.e));
    }

    public dr41() {
        this.a = (byte) 7;
        this.b = new HashSet();
    }

    public /* synthetic */ dr41(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a() {
    }

    public void b() {
    }

    public void d() {
    }

    public void c(double d, float f, int i) {
    }
}
