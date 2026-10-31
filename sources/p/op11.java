package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class op11 implements bq11 {
    public final boolean a;
    public final boolean b;
    public final PlayOrigin c;
    public final muz d;
    public final ruz e;
    public final f5y0 f;

    public op11(cyp cypVar, zeu0 zeu0Var, yqg yqgVar, boolean z, boolean z2, PlayOrigin playOrigin) {
        this.a = z;
        this.b = z2;
        this.c = playOrigin;
        c4p1.B(playOrigin);
        this.d = cypVar.d();
        this.e = cypVar.a();
        Flowable flowableC = zeu0Var.c();
        vbm[] vbmVarArr = q601.a;
        this.f = new f5y0(new kge(flowableC), yqgVar, (byte) 22);
    }

    public static LoggingParams d(String str, String str2) {
        LoggingParams.Builder builder = LoggingParams.builder();
        if (str != null) {
            builder.interactionId(str);
        }
        if (str2 == null) {
            str2 = "";
        }
        return builder.pageInstanceId(str2).build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, onm onmVar) {
        ip11 ip11Var;
        if (onmVar instanceof ip11) {
            ip11Var = (ip11) onmVar;
            int i = ip11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ip11Var.c = i - Integer.MIN_VALUE;
            } else {
                ip11Var = new ip11(this, onmVar);
            }
        } else {
            ip11Var = new ip11(this, onmVar);
        }
        Object objJ = ip11Var.a;
        int i2 = ip11Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = this.e.a(q9u0.d(PauseCommand.builder().loggingParams(d(str, str2)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder(this.c.featureIdentifier()).build()).build()));
            ip11Var.c = 1;
            objJ = fc11.j(singleA, ip11Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return yah0.m(((feh) objJ).d());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Serializable f(String str, String str2, List list, String str3, String str4, Long l, wp11 wp11Var, boolean z, onm onmVar) {
        jp11 jp11Var;
        Context contextBuild;
        if (onmVar instanceof jp11) {
            jp11Var = (jp11) onmVar;
            int i = jp11Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jp11Var.d = i - Integer.MIN_VALUE;
            } else {
                jp11Var = new jp11(this, onmVar);
            }
        } else {
            jp11Var = new jp11(this, onmVar);
        }
        Object objJ = jp11Var.b;
        int i2 = jp11Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            List listR = str2 != null ? l3p1.r(str2, list) : o7h.d1(list, Math.min(list.size(), 100));
            if (this.b) {
                Context.Builder builder = Context.builder(str);
                ContextPage.Builder builder2 = ContextPage.builder();
                List list2 = listR;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(ContextTrack.create((String) it.next()).toBuilder().metadata(wp11Var.b()).build());
                }
                contextBuild = builder.pages(k4p1.x(builder2.tracks(arrayList).build())).metadata(sqg0.O(wp11Var.a(), zno1.t(oqn1.n("sorting.criteria", "added_at")))).build();
            } else {
                Context.Builder builder3 = Context.fromUri(str).toBuilder();
                if (this.a) {
                    ContextPage.Builder builder4 = ContextPage.builder();
                    List list3 = listR;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(ContextTrack.create((String) it2.next()));
                    }
                    builder3 = builder3.pages(k4p1.x(builder4.tracks(arrayList2).build()));
                }
                contextBuild = builder3.metadata(sqg0.O(wp11Var.a(), zno1.t(oqn1.n("sorting.criteria", "added_at")))).build();
            }
            PlayCommand.Builder builderLoggingParams = PlayCommand.builder(contextBuild, this.c).loggingParams(d(str3, str4));
            PreparePlayOptions.Builder builder5 = PreparePlayOptions.builder();
            if (str2 != null) {
                builder5.skipTo(SkipToTrack.fromUri(str2));
            }
            if (l != null) {
                builder5.seekTo(Long.valueOf(l.longValue()));
            }
            if (z) {
                builder5.initiallyPaused(true);
            }
            PreparePlayOptions.Builder builderSuppressions = builder5.suppressions(Suppressions.create(Collections.singleton("mft")));
            PlayerOptionOverrides.Builder builder6 = PlayerOptionOverrides.builder();
            Boolean bool = Boolean.FALSE;
            Single singleA = this.d.a(builderLoggingParams.options(builderSuppressions.playerOptionsOverride(builder6.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).systemInitiated(false).build()).build());
            jp11Var.a = str2;
            jp11Var.d = 1;
            objJ = fc11.j(singleA, jp11Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = jp11Var.a;
            hm5.M(objJ);
        }
        feh fehVar = (feh) objJ;
        if (fehVar.d()) {
            return str2 == null ? "" : str2;
        }
        String strG = fehVar.a().g();
        return new m231(new Exception(strG != null ? strG : ""));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(String str, String str2, String str3, List list, String str4, wp11 wp11Var, onm onmVar) {
        kp11 kp11Var;
        List listR;
        ContextTrack contextTrackBuild;
        if (onmVar instanceof kp11) {
            kp11Var = (kp11) onmVar;
            int i = kp11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kp11Var.c = i - Integer.MIN_VALUE;
            } else {
                kp11Var = new kp11(this, onmVar);
            }
        } else {
            kp11Var = new kp11(this, onmVar);
        }
        Object objJ = kp11Var.a;
        int i2 = kp11Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Context.Builder builder = Context.builder(str2);
            if (this.a) {
                listR = l3p1.r(str3, list);
            } else {
                ArrayList arrayList = new ArrayList(list);
                if (!arrayList.contains(str3)) {
                    arrayList.add(0, str3);
                }
                listR = arrayList;
            }
            ContextPage.Builder builder2 = ContextPage.builder();
            List<String> list2 = listR;
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            for (String str5 : list2) {
                Map mapB = u890.j(str5, str3) ? wp11Var.b() : b7x.a;
                if (str == null) {
                    contextTrackBuild = ContextTrack.builder(str5).metadata(mapB).build();
                } else {
                    if (this.b) {
                        ContextTrack.Builder builder3 = ContextTrack.create(str5).toBuilder();
                        LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{oqn1.n("subtitle", str)});
                        linkedHashMapM.putAll(mapB);
                        contextTrackBuild = builder3.metadata(linkedHashMapM).build();
                    } else {
                        ContextTrack.Builder builder4 = ContextTrack.builder(str5);
                        LinkedHashMap linkedHashMapM2 = sqg0.M(new mmr0[]{oqn1.n("subtitle", str)});
                        linkedHashMapM2.putAll(mapB);
                        contextTrackBuild = builder4.metadata(linkedHashMapM2).build();
                    }
                    if (contextTrackBuild == null) {
                        contextTrackBuild = ContextTrack.builder(str5).metadata(mapB).build();
                    }
                }
                arrayList2.add(contextTrackBuild);
            }
            builder.pages(k4p1.x(builder2.tracks(arrayList2).build()));
            PlayCommand.Builder builderLoggingParams = PlayCommand.create(builder.metadata(wp11Var.a()).build(), this.c).toBuilder().loggingParams(d(str4, null));
            PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(str3)).suppressions(Suppressions.create(Collections.singleton("mft")));
            PlayerOptionOverrides.Builder builder5 = PlayerOptionOverrides.builder();
            Boolean bool = Boolean.FALSE;
            Single singleA = this.d.a(builderLoggingParams.options(builderSuppressions.playerOptionsOverride(builder5.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).systemInitiated(false).build()).build());
            kp11Var.c = 1;
            objJ = fc11.j(singleA, kp11Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return yah0.m(((feh) objJ).d());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, String str2, onm onmVar) {
        lp11 lp11Var;
        if (onmVar instanceof lp11) {
            lp11Var = (lp11) onmVar;
            int i = lp11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lp11Var.c = i - Integer.MIN_VALUE;
            } else {
                lp11Var = new lp11(this, onmVar);
            }
        } else {
            lp11Var = new lp11(this, onmVar);
        }
        Object objJ = lp11Var.a;
        int i2 = lp11Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = this.e.a(q9u0.f(ResumeCommand.builder().loggingParams(d(str, str2)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder(this.c.featureIdentifier()).build()).build()));
            lp11Var.c = 1;
            objJ = fc11.j(singleA, lp11Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return yah0.m(((feh) objJ).d());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(onm onmVar) {
        np11 np11Var;
        if (onmVar instanceof np11) {
            np11Var = (np11) onmVar;
            int i = np11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                np11Var.c = i - Integer.MIN_VALUE;
            } else {
                np11Var = new np11(this, onmVar);
            }
        } else {
            np11Var = new np11(this, onmVar);
        }
        Object objJ = np11Var.a;
        int i2 = np11Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = this.e.a(q9u0.m());
            np11Var.c = 1;
            objJ = fc11.j(singleA, np11Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return yah0.m(((feh) objJ).d());
    }
}
