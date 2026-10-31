package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g641 implements q8u0 {
    public final yqg a;
    public final muz b;
    public final ruz c;
    public final String d;
    public final long e;
    public final b9u0 f;
    public final d641 g;
    public final d641 h;
    public final huz i;

    public g641(yqg yqgVar, muz muzVar, zeu0 zeu0Var, ruz ruzVar, String str, long j, b9u0 b9u0Var) {
        this.a = yqgVar;
        this.b = muzVar;
        this.c = ruzVar;
        this.d = str;
        this.e = j;
        this.f = b9u0Var;
        Flowable flowableC = zeu0Var.c();
        vbm[] vbmVarArr = q601.a;
        this.g = new d641(new kge(flowableC), this, (byte) 0);
        this.h = new d641(new kge(zeu0Var.c()), this, (byte) 1);
        this.i = new huz(Boolean.FALSE, (byte) 10);
    }

    public final mr20 a() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(tv80 tv80Var, lnm lnmVar) {
        f641 f641Var;
        long jB;
        ou80 ou80Var;
        if (lnmVar instanceof f641) {
            f641Var = (f641) lnmVar;
            int i = f641Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                f641Var.e = i - Integer.MIN_VALUE;
            } else {
                f641Var = new f641(this, (onm) lnmVar);
            }
        } else {
            f641Var = new f641(this, (onm) lnmVar);
        }
        Object objI = f641Var.c;
        int i2 = f641Var.e;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            jB = this.a.b();
            ou80Var = tv80Var.a;
            f641Var.a = ou80Var;
            f641Var.b = jB;
            f641Var.e = 1;
            objI = b5p1.i(this.h, f641Var);
            if (objI != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return objI;
            }
            if (i2 == 3) {
                hm5.M(objI);
                return objI;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jB = f641Var.b;
        ou80Var = f641Var.a;
        hm5.M(objI);
        if (((Boolean) objI).booleanValue()) {
            String str = ou80Var.a;
            f641Var.a = null;
            f641Var.b = jB;
            f641Var.e = 2;
            Object objC = c(jB, str, f641Var);
            if (objC != obj) {
                return objC;
            }
        } else {
            f641Var.a = null;
            f641Var.b = jB;
            f641Var.e = 3;
            Object objD = d(ou80Var, jB, f641Var);
            if (objD != obj) {
                return objD;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, String str, onm onmVar) {
        z541 z541Var;
        if (onmVar instanceof z541) {
            z541Var = (z541) onmVar;
            int i = z541Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z541Var.c = i - Integer.MIN_VALUE;
            } else {
                z541Var = new z541(this, onmVar);
            }
        } else {
            z541Var = new z541(this, onmVar);
        }
        Object objJ = z541Var.a;
        int i2 = z541Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = this.c.a(new e9u0(PauseCommand.builder().loggingParams(LoggingParams.builder().interactionId(str).commandInitiatedTime(Long.valueOf(j)).build()).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder(this.f.a).build()).build()));
            z541Var.c = 1;
            objJ = fc11.j(singleA, z541Var);
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
        return Boolean.valueOf(((feh) objJ) instanceof ceh);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ou80 ou80Var, long j, onm onmVar) {
        a641 a641Var;
        if (onmVar instanceof a641) {
            a641Var = (a641) onmVar;
            int i = a641Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a641Var.c = i - Integer.MIN_VALUE;
            } else {
                a641Var = new a641(this, onmVar);
            }
        } else {
            a641Var = new a641(this, onmVar);
        }
        Object objJ = a641Var.a;
        int i2 = a641Var.c;
        String str = null;
        if (i2 == 0) {
            hm5.M(objJ);
            b9u0 b9u0Var = this.f;
            String str2 = b9u0Var.c;
            if (str2 != null && !ihc1.y0(str2)) {
                str = str2;
            }
            String str3 = this.d;
            ContextTrack.Builder builder = ContextTrack.builder(str3);
            if (str != null) {
                builder = builder.metadata(Collections.singletonMap("custom_reporting_attribution", str));
            }
            Context.Builder builderPages = Context.builder(str3).pages(Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(builder.build())).build()));
            if (str != null) {
                builderPages = builderPages.metadata(Collections.singletonMap("custom_reporting_attribution", str));
            }
            Context contextBuild = builderPages.build();
            Single singleA = this.b.a(PlayCommand.builder(contextBuild, PlayOrigin.builder(b9u0Var.a).referrerIdentifier(b9u0Var.b).build()).options(PreparePlayOptions.builder().seekTo(new Long(this.e)).build()).loggingParams(LoggingParams.builder().interactionId(ou80Var.a).commandInitiatedTime(Long.valueOf(j)).build()).build());
            a641Var.c = 1;
            objJ = fc11.j(singleA, a641Var);
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
        return Boolean.valueOf(((feh) objJ) instanceof ceh);
    }

    public final mr20 i() {
        return this.h;
    }

    public final mr20 isActive() {
        return this.g;
    }
}
