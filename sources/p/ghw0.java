package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ghw0 {
    public static final Map e = sqg0.J(new mmr0[]{new mmr0("media.start_position", "0"), new mmr0("type", "1")});
    public final b7r0 a;
    public final muz b;
    public final ruz c;
    public aru0 d = new aru0((Map) null, (Map) null, 7);

    public ghw0(cyp cypVar, b7r0 b7r0Var) {
        this.a = b7r0Var;
        this.b = cypVar.d();
        this.c = cypVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Single single, onm onmVar) {
        chw0 chw0Var;
        if (onmVar instanceof chw0) {
            chw0Var = (chw0) onmVar;
            int i = chw0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                chw0Var.c = i - Integer.MIN_VALUE;
            } else {
                chw0Var = new chw0(this, onmVar);
            }
        } else {
            chw0Var = new chw0(this, onmVar);
        }
        Object objJ = chw0Var.a;
        int i2 = chw0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            chw0Var.c = 1;
            objJ = fc11.j(single, chw0Var);
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
        feh fehVar = (feh) objJ;
        if (fehVar instanceof ceh) {
            return ahw0.a;
        }
        return fehVar instanceof beh ? new zgw0(((beh) fehVar).a) : new zgw0("Unknown error");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, onm onmVar) {
        dhw0 dhw0Var;
        Context.Builder builder;
        Collection collection;
        ContextPage.Builder builder2;
        if (onmVar instanceof dhw0) {
            dhw0Var = (dhw0) onmVar;
            int i = dhw0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dhw0Var.f = i - Integer.MIN_VALUE;
            } else {
                dhw0Var = new dhw0(this, onmVar);
            }
        } else {
            dhw0Var = new dhw0(this, onmVar);
        }
        Object obj = dhw0Var.d;
        int i2 = dhw0Var.f;
        if (i2 == 0) {
            hm5.M(obj);
            Context.Builder builder3 = Context.builder(str);
            ContextPage.Builder builder4 = ContextPage.builder();
            List listSingletonList = Collections.singletonList(c(str2, true));
            iu30 iu30Var = (iu30) this.d.b;
            dhw0Var.a = builder3;
            dhw0Var.b = builder4;
            dhw0Var.c = listSingletonList;
            dhw0Var.f = 1;
            Object objInvoke = iu30Var.invoke(dhw0Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
            builder = builder3;
            collection = listSingletonList;
            builder2 = builder4;
            obj = objInvoke;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            collection = dhw0Var.c;
            builder2 = dhw0Var.b;
            builder = dhw0Var.a;
            hm5.M(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c((String) it.next(), false));
        }
        Context.Builder builderPages = builder.pages(Collections.singletonList(builder2.tracks(o7h.N0(arrayList, collection)).build()));
        b7x b7xVar = (Map) this.d.c;
        if (b7xVar == null) {
            b7xVar = b7x.a;
        }
        return builderPages.metadata(b7xVar).build();
    }

    public final ContextTrack c(String str, boolean z) {
        ContextTrack.Builder builder = ContextTrack.builder(str);
        xkg0 xkg0Var = new xkg0();
        Map map = (Map) this.d.d;
        if (map != null) {
            xkg0Var.putAll(map);
        }
        if (z) {
            xkg0Var.putAll(e);
        }
        return builder.metadata(xkg0Var.b()).build();
    }

    public final LoggingParams d(tv80 tv80Var) {
        ou80 ou80Var;
        LoggingParams.Builder builder = LoggingParams.builder();
        y6r0 y6r0Var = this.a.get();
        String str = null;
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        LoggingParams.Builder builderPageInstanceId = builder.pageInstanceId(str2);
        if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
            str = ou80Var.a;
        }
        return builderPageInstanceId.interactionId(str).build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, tv80 tv80Var, onm onmVar) {
        ehw0 ehw0Var;
        muz muzVar;
        Object objF;
        if (onmVar instanceof ehw0) {
            ehw0Var = (ehw0) onmVar;
            int i = ehw0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ehw0Var.e = i - Integer.MIN_VALUE;
            } else {
                ehw0Var = new ehw0(this, onmVar);
            }
        } else {
            ehw0Var = new ehw0(this, onmVar);
        }
        Object obj = ehw0Var.c;
        int i2 = ehw0Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            ehw0Var.a = this;
            muzVar = this.b;
            ehw0Var.b = muzVar;
            ehw0Var.e = 1;
            objF = f(str, str2, tv80Var, ehw0Var);
            if (objF != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        muz muzVar2 = ehw0Var.b;
        ghw0 ghw0Var = ehw0Var.a;
        hm5.M(obj);
        muzVar = muzVar2;
        this = ghw0Var;
        objF = obj;
        Single singleA = muzVar.a((PlayCommand) objF);
        ehw0Var.a = null;
        ehw0Var.b = null;
        ehw0Var.e = 2;
        Object objA = this.a(singleA, ehw0Var);
        return objA == d9nVar ? d9nVar : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, tv80 tv80Var, onm onmVar) {
        fhw0 fhw0Var;
        String str3;
        ghw0 ghw0Var;
        if (onmVar instanceof fhw0) {
            fhw0Var = (fhw0) onmVar;
            int i = fhw0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fhw0Var.f = i - Integer.MIN_VALUE;
            } else {
                fhw0Var = new fhw0(this, onmVar);
            }
        } else {
            fhw0Var = new fhw0(this, onmVar);
        }
        Object objB = fhw0Var.d;
        int i2 = fhw0Var.f;
        if (i2 == 0) {
            hm5.M(objB);
            fhw0Var.a = str;
            fhw0Var.b = tv80Var;
            fhw0Var.c = this;
            fhw0Var.f = 1;
            objB = b(str2, str, fhw0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
            str3 = str;
            ghw0Var = this;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ghw0Var = fhw0Var.c;
            tv80Var = fhw0Var.b;
            str3 = fhw0Var.a;
            hm5.M(objB);
        }
        PlayCommand.Builder builderLoggingParams = PlayCommand.builder((Context) objB, PlayOrigin.create("PreviewElementPlayerImpl")).loggingParams(d(tv80Var));
        ghw0Var.getClass();
        PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(str3)).suppressions(Collections.singleton("mft"));
        PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        builderLoggingParams.options(builderSuppressions.playerOptionsOverride(builder.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).build());
        return builderLoggingParams.build();
    }
}
