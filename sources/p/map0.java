package p;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class map0 extends hab0 implements Function0 {
    public final /* synthetic */ tv30 N0;
    public final /* synthetic */ tv30 O0;
    public final /* synthetic */ tv30 X;
    public final /* synthetic */ tv30 Y;
    public final /* synthetic */ tv30 Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ tv30 b;
    public final /* synthetic */ tv30 c;
    public final /* synthetic */ tv30 d;
    public final /* synthetic */ tv30 e;
    public final /* synthetic */ tv30 f;
    public final /* synthetic */ tv30 g;
    public final /* synthetic */ tv30 h;
    public final /* synthetic */ tv30 i;
    public final /* synthetic */ tv30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ map0(tv30 tv30Var, tv30 tv30Var2, tv30 tv30Var3, tv30 tv30Var4, tv30 tv30Var5, tv30 tv30Var6, tv30 tv30Var7, tv30 tv30Var8, tv30 tv30Var9, tv30 tv30Var10, tv30 tv30Var11, tv30 tv30Var12, tv30 tv30Var13, tv30 tv30Var14, byte b) {
        super(0);
        this.a = b;
        this.b = tv30Var;
        this.c = tv30Var2;
        this.d = tv30Var3;
        this.e = tv30Var4;
        this.f = tv30Var5;
        this.g = tv30Var6;
        this.h = tv30Var7;
        this.i = tv30Var8;
        this.t = tv30Var9;
        this.X = tv30Var10;
        this.Y = tv30Var11;
        this.Z = tv30Var12;
        this.N0 = tv30Var13;
        this.O0 = tv30Var14;
    }

    public final Object invoke() {
        byte b = this.a;
        pbp0 pbp0Var = this.O0;
        pbp0 pbp0Var2 = this.N0;
        pbp0 pbp0Var3 = this.Z;
        pbp0 pbp0Var4 = this.Y;
        pbp0 pbp0Var5 = this.X;
        qbp0 qbp0Var = this.t;
        qbp0 qbp0Var2 = this.i;
        qbp0 qbp0Var3 = this.h;
        qbp0 qbp0Var4 = this.g;
        pbp0 pbp0Var6 = this.f;
        pbp0 pbp0Var7 = this.e;
        pbp0 pbp0Var8 = this.d;
        pbp0 pbp0Var9 = this.c;
        pbp0 pbp0Var10 = this.b;
        switch (b) {
            case 0:
                return x2p1.j(new uw0((Context) pbp0Var10.invoke(), (liv0) pbp0Var9.invoke(), (i42) pbp0Var8.invoke(), (fza1) pbp0Var7.invoke(), (ov20) pbp0Var6.invoke(), (dy0) ((pbp0) qbp0Var4).invoke(), (bqb1) ((pbp0) qbp0Var3).invoke(), (ptt) ((pbp0) qbp0Var2).invoke(), (Scheduler) ((pbp0) qbp0Var).invoke(), (q8n) ((ibp0) pbp0Var5).invoke(), (Handler) ((ibp0) pbp0Var4).invoke(), (Observable) ((ibp0) pbp0Var3).invoke(), (x8c0) ((ibp0) pbp0Var2).invoke(), (luk) ((ibp0) pbp0Var).invoke(), (byte) 0));
            default:
                i72 i72Var = (i72) pbp0Var10.invoke();
                ContentResolver contentResolver = (ContentResolver) pbp0Var9.invoke();
                Flowable flowable = (Flowable) pbp0Var8.invoke();
                Scheduler scheduler = (Scheduler) pbp0Var7.invoke();
                pbp0Var6.invoke();
                q8n q8nVar = (q8n) qbp0Var4.invoke();
                ark1 ark1Var = (ark1) qbp0Var3.invoke();
                mwt mwtVar = (mwt) qbp0Var2.invoke();
                x8c0 x8c0Var = (x8c0) qbp0Var.invoke();
                mw7 mw7Var = (mw7) pbp0Var5.invoke();
                pbp0Var4.invoke();
                ao0 ao0Var = (ao0) pbp0Var3.invoke();
                pbp0Var2.invoke();
                return yap1.h(new h72(i72Var, contentResolver, flowable, scheduler, q8nVar, ark1Var, mwtVar, x8c0Var, mw7Var, ao0Var, (trd1) pbp0Var.invoke(), (byte) 0));
        }
    }
}
