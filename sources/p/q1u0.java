package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q1u0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t1u0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1u0(t1u0 t1u0Var, String str, byte b) {
        super(0);
        this.a = b;
        this.b = t1u0Var;
        this.c = str;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        t1u0 t1u0Var = this.b;
        switch (b) {
            case 0:
                if (!t1u0Var.b()) {
                    Completable completableFlatMapCompletable = t1u0Var.h.flatMapCompletable(new p1u0(t1u0Var, str, (byte) 0));
                    w9u0 w9u0Var = t1u0Var.t;
                    w9u0Var.getClass();
                    t1u0Var.Y.a(completableFlatMapCompletable.c(w9u0Var.a(new d9u0("PlaybackNotificationPlayerService", false)).ignoreElement()).subscribe());
                } else {
                    n57.e("Called outside of the lifecycle");
                }
                break;
            case 1:
                if (!t1u0Var.b()) {
                    Completable completableFlatMapCompletable2 = t1u0Var.h.flatMapCompletable(new r1u0(t1u0Var, str));
                    w9u0 w9u0Var2 = t1u0Var.t;
                    w9u0Var2.getClass();
                    t1u0Var.Y.a(completableFlatMapCompletable2.c(w9u0Var2.a(new g9u0("PlaybackNotificationPlayerService", false)).ignoreElement()).subscribe());
                } else {
                    n57.e("Called outside of the lifecycle");
                }
                break;
            case 2:
                if (!t1u0Var.b()) {
                    t1u0Var.Y.a(t1u0Var.h.flatMapCompletable(new s1u0(t1u0Var, str)).e(t1u0Var.c(-15000)).subscribe());
                } else {
                    n57.e("Called outside of the lifecycle");
                }
                break;
            case 3:
                if (!t1u0Var.b()) {
                    t1u0Var.Y.a(t1u0Var.h.flatMapCompletable(new p1u0(t1u0Var, str, (byte) 1)).e(t1u0Var.c(15000)).subscribe());
                } else {
                    n57.e("Called outside of the lifecycle");
                }
                break;
            case 4:
                if (!t1u0Var.b()) {
                    t1u0Var.g.b();
                    t1u0Var.Y.a(Single.zip(t1u0Var.h, t1u0Var.i, new r1u0(t1u0Var, str)).flatMap(new rut0(t1u0Var, (byte) 1)).subscribe());
                } else {
                    n57.e("Called outside of the lifecycle");
                }
                break;
            default:
                if (!t1u0Var.b()) {
                    t1u0Var.g.b();
                    t1u0Var.Y.a(Single.zip(t1u0Var.h, t1u0Var.i, new s1u0(t1u0Var, str)).flatMap(new sks0(t1u0Var, (byte) 4)).ignoreElement().subscribe());
                } else {
                    n57.e("Called outside of the lifecycle");
                }
                break;
        }
        return rih1Var;
    }
}
