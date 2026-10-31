package p;

import android.content.Context;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import j$.time.LocalDate;
import j$.time.Period;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fg2 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gg2 b;

    public /* synthetic */ fg2(gg2 gg2Var, byte b) {
        this.a = b;
        this.b = gg2Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        final gg2 gg2Var = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new ymm0(gg2Var, (byte) 10));
            default:
                Observable map = observable.map(u3x0.Z);
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                final byte b2 = 0;
                dg2 dg2Var = new dg2(gg2Var, (byte) 0);
                Scheduler scheduler = gg2Var.c;
                subtypeEffectHandlerBuilderC.b(yf2.class, dg2Var, scheduler);
                subtypeEffectHandlerBuilderC.g(bg2.class, new fg2(gg2Var, b2));
                subtypeEffectHandlerBuilderC.d(zf2.class, new Consumer() { // from class: p.eg2
                    public final void accept(Object obj) {
                        byte b3 = b2;
                        gg2 gg2Var2 = gg2Var;
                        switch (b3) {
                            case 0:
                                zf2 zf2Var = (zf2) obj;
                                gg2Var2.b.R(zf2Var.a, zf2Var.b, zf2Var.c);
                                break;
                            default:
                                ag2 ag2Var = (ag2) obj;
                                y3u y3uVar = gg2Var2.d;
                                int years = Period.between(LocalDate.of(ag2Var.a, ag2Var.b + 1, ag2Var.c), LocalDate.now()).getYears();
                                bpb1 bpb1Var = y3uVar.g;
                                Context context = y3uVar.a;
                                bpb1Var.m((Object) null, new j0f0(context.getResources().getQuantityString(2131820899, years, Integer.valueOf(years)), context.getResources().getQuantityString(2131820898, years, Integer.valueOf(years)), null, new h0f0(context.getString(2131962488), new x3u(y3uVar, (byte) 1)), new h0f0(context.getString(2131962487), new x3u(y3uVar, (byte) 2)), new i3u(4, false, false, false), new x3u(y3uVar, (byte) 3), null, 132));
                                break;
                        }
                    }
                }, scheduler);
                final byte b3 = 1;
                subtypeEffectHandlerBuilderC.d(ag2.class, new Consumer() { // from class: p.eg2
                    public final void accept(Object obj) {
                        byte b4 = b3;
                        gg2 gg2Var2 = gg2Var;
                        switch (b4) {
                            case 0:
                                zf2 zf2Var = (zf2) obj;
                                gg2Var2.b.R(zf2Var.a, zf2Var.b, zf2Var.c);
                                break;
                            default:
                                ag2 ag2Var = (ag2) obj;
                                y3u y3uVar = gg2Var2.d;
                                int years = Period.between(LocalDate.of(ag2Var.a, ag2Var.b + 1, ag2Var.c), LocalDate.now()).getYears();
                                bpb1 bpb1Var = y3uVar.g;
                                Context context = y3uVar.a;
                                bpb1Var.m((Object) null, new j0f0(context.getResources().getQuantityString(2131820899, years, Integer.valueOf(years)), context.getResources().getQuantityString(2131820898, years, Integer.valueOf(years)), null, new h0f0(context.getString(2131962488), new x3u(y3uVar, (byte) 1)), new h0f0(context.getString(2131962487), new x3u(y3uVar, (byte) 2)), new i3u(4, false, false, false), new x3u(y3uVar, (byte) 3), null, 132));
                                break;
                        }
                    }
                }, scheduler);
                subtypeEffectHandlerBuilderC.b(xf2.class, new dg2(gg2Var, (byte) 1), scheduler);
                return map.compose(subtypeEffectHandlerBuilderC.h()).map(a4x0.Y);
        }
    }
}
