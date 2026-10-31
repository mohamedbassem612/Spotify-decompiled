package p;

import com.spotify.preload.logger.LoginTimeReporterWorker;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class r2f0 implements Function {
    public final /* synthetic */ LoginTimeReporterWorker a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r2f0(LoginTimeReporterWorker loginTimeReporterWorker, long j, boolean z) {
        this.a = loginTimeReporterWorker;
        this.b = j;
        this.c = z;
    }

    public final Object apply(Object obj) {
        MaybeFlatMapCompletable maybeFlatMapCompletable;
        LoginTimeReporterWorker loginTimeReporterWorker = this.a;
        final s2f0 s2f0Var = new s2f0((e961) obj, this.b, loginTimeReporterWorker.j);
        s2f0Var.call();
        final zsc zscVar = loginTimeReporterWorker.i;
        if (this.c) {
            final byte b = 1;
            maybeFlatMapCompletable = new MaybeFlatMapCompletable(zscVar.v(), new Function() { // from class: p.h911
                public final Object apply(Object obj2) {
                    byte b2 = b;
                    s2f0 s2f0Var2 = s2f0Var;
                    zsc zscVar2 = zscVar;
                    uov0 uov0Var = (uov0) obj2;
                    zscVar2.getClass();
                    switch (b2) {
                        case 0:
                            String str = uov0Var.b;
                            str.getClass();
                            dm5.n(str.length() > 0, "referralCode must be set");
                            zscVar2.G(s2f0Var2, str, (String) null);
                            break;
                        default:
                            zscVar2.G(s2f0Var2, uov0Var.b, uov0Var.a);
                            break;
                    }
                    return CompletableEmpty.a;
                }
            });
        } else {
            final byte b2 = 0;
            maybeFlatMapCompletable = new MaybeFlatMapCompletable(zscVar.v(), new Function() { // from class: p.h911
                public final Object apply(Object obj2) {
                    byte b3 = b2;
                    s2f0 s2f0Var2 = s2f0Var;
                    zsc zscVar2 = zscVar;
                    uov0 uov0Var = (uov0) obj2;
                    zscVar2.getClass();
                    switch (b3) {
                        case 0:
                            String str = uov0Var.b;
                            str.getClass();
                            dm5.n(str.length() > 0, "referralCode must be set");
                            zscVar2.G(s2f0Var2, str, (String) null);
                            break;
                        default:
                            zscVar2.G(s2f0Var2, uov0Var.b, uov0Var.a);
                            break;
                    }
                    return CompletableEmpty.a;
                }
            });
        }
        return maybeFlatMapCompletable.x(y8d0.a());
    }
}
