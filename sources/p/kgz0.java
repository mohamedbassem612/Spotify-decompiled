package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kgz0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lgz0 b;
    public final /* synthetic */ PlayOrigin c;
    public final /* synthetic */ LoggingParams d;

    public /* synthetic */ kgz0(lgz0 lgz0Var, PlayOrigin playOrigin, LoggingParams loggingParams, byte b) {
        this.a = b;
        this.b = lgz0Var;
        this.c = playOrigin;
        this.d = loggingParams;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        byte b2 = 12;
        byte b3 = 5;
        byte b4 = 8;
        byte b5 = 0;
        byte b6 = 6;
        byte b7 = 1;
        ngz0 ngz0Var = ngz0.a;
        mgz0 mgz0Var = mgz0.a;
        lgz0 lgz0Var = this.b;
        LoggingParams loggingParams = this.d;
        PlayOrigin playOrigin = this.c;
        switch (b) {
            case 0:
                if (((feh) obj) instanceof ceh) {
                    lgz0Var.b(loggingParams, playOrigin, ngz0Var, 4);
                    return ngz0Var;
                }
                lgz0Var.b(loggingParams, playOrigin, mgz0Var, 4);
                return mgz0Var;
            case 1:
                spq0 spq0Var = (spq0) obj;
                boolean zC = spq0Var.c();
                LoggingParams loggingParams2 = this.d;
                lgz0 lgz0Var2 = this.b;
                if (!zC) {
                    return lgz0Var2.g.flatMap(new kgz0(lgz0Var2, playOrigin, loggingParams2, b4));
                }
                Single map = lgz0.d(lgz0Var2, this.c, loggingParams2, (String) spq0Var.b(), (String) null, true, 952).map(new kgz0(lgz0Var2, loggingParams2, playOrigin, b5));
                map.getClass();
                return map;
            case 2:
                lgz0Var.b(loggingParams, playOrigin, mgz0Var, 6);
                return mgz0Var;
            case 3:
                if (((feh) obj) instanceof ceh) {
                    lgz0Var.b(loggingParams, playOrigin, ngz0Var, 1);
                    return ngz0Var;
                }
                lgz0Var.b(loggingParams, playOrigin, mgz0Var, 6);
                return mgz0Var;
            case 4:
                ry01 ry01Var = (ry01) obj;
                lgz0 lgz0Var3 = this.b;
                Flowable flowable = lgz0Var3.k;
                ry01Var.toString();
                boolean z = ry01Var instanceof qy01;
                PlayOrigin playOrigin2 = this.c;
                LoggingParams loggingParams3 = this.d;
                if (z) {
                    Single singleFlatMap = flowable.z().flatMap(new kdy0((Object) lgz0Var3, (Object) ((qy01) ry01Var).a, (Object) loggingParams3, (Object) playOrigin2, (byte) 7));
                    singleFlatMap.getClass();
                    return singleFlatMap;
                }
                if (ry01Var instanceof py01) {
                    return flowable.z().map(new m980((byte) 28, false)).flatMap(new kgz0(lgz0Var3, loggingParams3, playOrigin2, b2));
                }
                eg.o();
                return null;
            case 5:
                feh fehVar = (feh) obj;
                fehVar.toString();
                if (!(fehVar instanceof ceh)) {
                    return lgz0Var.g.flatMap(new kgz0(lgz0Var, playOrigin, loggingParams, b4));
                }
                lgz0Var.b(loggingParams, playOrigin, ngz0Var, 3);
                Single singleJust = Single.just(ngz0Var);
                singleJust.getClass();
                return singleJust;
            case 6:
                if (!((Boolean) obj).booleanValue()) {
                    return lgz0Var.g.flatMap(new kgz0(lgz0Var, playOrigin, loggingParams, b4));
                }
                String strFeatureIdentifier = playOrigin.featureIdentifier();
                lgz0Var.getClass();
                Single singleFlatMap2 = lgz0Var.c.a(q9u0.f(ResumeCommand.builder().loggingParams(loggingParams).resumeOrigin(PauseResumeOrigin.builder(strFeatureIdentifier).build()).build())).flatMap(new kgz0(lgz0Var, loggingParams, playOrigin, b3));
                singleFlatMap2.getClass();
                return singleFlatMap2;
            case 7:
                if (((feh) obj) instanceof ceh) {
                    lgz0Var.b(loggingParams, playOrigin, ngz0Var, 2);
                    return ngz0Var;
                }
                lgz0Var.b(loggingParams, playOrigin, mgz0Var, 2);
                return mgz0Var;
            case 8:
                spq0 spq0Var2 = (spq0) obj;
                boolean zC2 = spq0Var2.c();
                LoggingParams loggingParams4 = this.d;
                lgz0 lgz0Var4 = this.b;
                if (zC2) {
                    Context context = ((cup0) spq0Var2.b()).a;
                    return lgz0.d(lgz0Var4, this.c, loggingParams4, context.uri(), context.url(), ((cup0) spq0Var2.b()).b, 944).map(new kgz0(lgz0Var4, loggingParams4, playOrigin, (byte) 7));
                }
                lgz0Var4.b(loggingParams4, playOrigin, mgz0Var, 2);
                return Single.just(mgz0Var);
            case 9:
                boolean z2 = ((Throwable) obj) instanceof IOException;
                Flowable flowable2 = lgz0Var.k;
                return z2 ? flowable2.z().map(new m980((byte) 28, true)).flatMap(new kgz0(lgz0Var, loggingParams, playOrigin, b6)) : flowable2.z().map(new m980((byte) 28, false)).flatMap(new kgz0(lgz0Var, loggingParams, playOrigin, b2));
            case 10:
                lgz0Var.b(loggingParams, playOrigin, mgz0Var, 6);
                return mgz0Var;
            case 11:
                feh fehVar2 = (feh) obj;
                fehVar2.toString();
                if (!(fehVar2 instanceof ceh)) {
                    return lgz0Var.h.flatMap(new kgz0(lgz0Var, playOrigin, loggingParams, b7));
                }
                lgz0Var.b(loggingParams, playOrigin, ngz0Var, 5);
                Single singleJust2 = Single.just(ngz0Var);
                singleJust2.getClass();
                return singleJust2;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    return lgz0Var.h.flatMap(new kgz0(lgz0Var, playOrigin, loggingParams, b7));
                }
                String strFeatureIdentifier2 = playOrigin.featureIdentifier();
                lgz0Var.getClass();
                Single singleFlatMap3 = lgz0Var.c.a(q9u0.f(ResumeCommand.builder().loggingParams(loggingParams).resumeOrigin(PauseResumeOrigin.builder(strFeatureIdentifier2).build()).build())).flatMap(new kgz0(lgz0Var, loggingParams, playOrigin, (byte) 11));
                singleFlatMap3.getClass();
                return singleFlatMap3;
        }
    }

    public /* synthetic */ kgz0(lgz0 lgz0Var, LoggingParams loggingParams, PlayOrigin playOrigin, byte b) {
        this.a = b;
        this.b = lgz0Var;
        this.d = loggingParams;
        this.c = playOrigin;
    }
}
