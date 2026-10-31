package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k020 implements Function {
    public final /* synthetic */ jyo0 a;
    public final /* synthetic */ fu41 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ hs41 d;
    public final /* synthetic */ lv4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ bw8 h;
    public final /* synthetic */ yqg i;

    public k020(jyo0 jyo0Var, fu41 fu41Var, long j, hs41 hs41Var, lv4 lv4Var, boolean z, boolean z2, bw8 bw8Var, yqg yqgVar) {
        this.a = jyo0Var;
        this.b = fu41Var;
        this.c = j;
        this.d = hs41Var;
        this.e = lv4Var;
        this.f = z;
        this.g = z2;
        this.h = bw8Var;
        this.i = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x0091 A[SYNTHETIC] */
    public final Object apply(Object obj) {
        ContextTrack contextTrack;
        String strB0;
        ContextTrack contextTrack2;
        Iterator it;
        Object next;
        mmr0 mmr0Var;
        Maybe maybe;
        Object next2;
        rbw rbwVar = (rbw) obj;
        z6x z6xVar = z6x.a;
        ContextTrack contextTrack3 = rbwVar.g;
        List list = er41.a;
        if (!l4o1.E(contextTrack3)) {
            List list2 = er41.a;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (nhc1.Y(contextTrack3.uri(), (String) it2.next(), false)) {
                    }
                }
                if (!l4o1.O(contextTrack3) && !nhc1.Y(contextTrack3.uri(), "spotify:media:", false)) {
                    if (l4o1.L(rbwVar.g)) {
                        jyo0 jyo0Var = this.a;
                        contextTrack2 = rbwVar.g;
                        List list3 = (List) jyo0Var.invoke(contextTrack2, rbwVar.m);
                        it = list3.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!u890.j(((mmr0) next).a, rc11.a.b(hxo0.class)));
                        mmr0Var = (mmr0) next;
                        if (mmr0Var != null || (maybe = (Maybe) mmr0Var.b) == null) {
                            return Single.just(new a500(contextTrack2, z6xVar));
                        }
                        Iterator it3 = list3.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                        } while (!u890.j(((mmr0) next2).a, rc11.a.b(ixo0.class)));
                        mmr0 mmr0Var2 = (mmr0) next2;
                        return new MaybeToSingle(new MaybeFlatMapSingle(maybe, new j3v(mmr0Var2 != null ? (Maybe) mmr0Var2.b : null, (byte) 19)).f(new vs10(contextTrack2, (byte) 1)), new a500(contextTrack2, z6xVar)).onErrorReturn(new il00(contextTrack2, (byte) 2));
                    }
                    fu41 fu41Var = this.b;
                    jyo0 jyo0Var2 = this.a;
                    String str = rbwVar.m;
                    long j = this.c;
                    hs41 hs41Var = this.d;
                    lv4 lv4Var = this.e;
                    bz60 bz60Var = new bz60(jyo0Var2, str, j, hs41Var, lv4Var, this.f);
                    contextTrack = rbwVar.g;
                    boolean z = rbwVar.h;
                    boolean z2 = rbwVar.i;
                    boolean z3 = rbwVar.j;
                    boolean z4 = rbwVar.k;
                    boolean z5 = this.g;
                    bw8 bw8Var = this.h;
                    yqg yqgVar = this.i;
                    qtf1 qtf1Var = rbwVar.l;
                    if (l4o1.U(contextTrack)) {
                        strB0 = l4o1.b0(contextTrack);
                    } else {
                        strB0 = contextTrack.uri();
                    }
                    String str2 = strB0;
                    int iJ = prn1.j(contextTrack);
                    String strUri = contextTrack.uri();
                    t45 t45VarA = hs41Var.a.a("now_playing_scroll_container");
                    t45VarA.h = "android-nowplaying-scroll-container";
                    t45.m(t45VarA, hs41.b(iJ, null), 4);
                    fu fuVar = new fu(t45VarA, hs41Var, iJ, strUri, (byte) 16);
                    p811 p811Var = new p811();
                    return fu41Var.a(str2, l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_CONTEXT_URI), z2, z3, z5, z4, z, yqgVar.g().getID()).timeout(1000L, TimeUnit.MILLISECONDS).doOnError(new wrk(p811Var, (byte) 1)).onErrorReturn(new kp00(contextTrack, bw8Var, (byte) 11)).map(new jl00(contextTrack, lv4Var, (byte) 4)).compose(bz60Var).map(new w2z(contextTrack, qtf1Var, (byte) 18)).doOnSuccess(new lgr(p811Var, fuVar, (byte) 19)).onErrorReturn(new t7y(fuVar, contextTrack, (byte) 21));
                }
            } else if (!l4o1.O(contextTrack3)) {
                if (l4o1.L(rbwVar.g)) {
                    jyo0 jyo0Var3 = this.a;
                    contextTrack2 = rbwVar.g;
                    List list4 = (List) jyo0Var3.invoke(contextTrack2, rbwVar.m);
                    it = list4.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!u890.j(((mmr0) next).a, rc11.a.b(hxo0.class)));
                    mmr0Var = (mmr0) next;
                    if (mmr0Var != null) {
                    }
                    return Single.just(new a500(contextTrack2, z6xVar));
                }
                fu41 fu41Var2 = this.b;
                jyo0 jyo0Var4 = this.a;
                String str3 = rbwVar.m;
                long j2 = this.c;
                hs41 hs41Var2 = this.d;
                lv4 lv4Var2 = this.e;
                bz60 bz60Var2 = new bz60(jyo0Var4, str3, j2, hs41Var2, lv4Var2, this.f);
                contextTrack = rbwVar.g;
                boolean z6 = rbwVar.h;
                boolean z7 = rbwVar.i;
                boolean z8 = rbwVar.j;
                boolean z9 = rbwVar.k;
                boolean z10 = this.g;
                bw8 bw8Var2 = this.h;
                yqg yqgVar2 = this.i;
                qtf1 qtf1Var2 = rbwVar.l;
                if (l4o1.U(contextTrack)) {
                    strB0 = contextTrack.uri();
                } else {
                    strB0 = l4o1.b0(contextTrack);
                }
                String str4 = strB0;
                int iJ2 = prn1.j(contextTrack);
                String strUri2 = contextTrack.uri();
                t45 t45VarA2 = hs41Var2.a.a("now_playing_scroll_container");
                t45VarA2.h = "android-nowplaying-scroll-container";
                t45.m(t45VarA2, hs41.b(iJ2, null), 4);
                fu fuVar2 = new fu(t45VarA2, hs41Var2, iJ2, strUri2, (byte) 16);
                p811 p811Var2 = new p811();
                return fu41Var2.a(str4, l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_CONTEXT_URI), z7, z8, z10, z9, z6, yqgVar2.g().getID()).timeout(1000L, TimeUnit.MILLISECONDS).doOnError(new wrk(p811Var2, (byte) 1)).onErrorReturn(new kp00(contextTrack, bw8Var2, (byte) 11)).map(new jl00(contextTrack, lv4Var2, (byte) 4)).compose(bz60Var2).map(new w2z(contextTrack, qtf1Var2, (byte) 18)).doOnSuccess(new lgr(p811Var2, fuVar2, (byte) 19)).onErrorReturn(new t7y(fuVar2, contextTrack, (byte) 21));
            }
        }
        Single singleJust = Single.just(new a500(rbwVar.g, z6xVar));
        singleJust.getClass();
        return singleJust;
    }
}
