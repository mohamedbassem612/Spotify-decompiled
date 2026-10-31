package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jcp0 extends hab0 implements Function0 {
    public final /* synthetic */ tv30 X;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ tv30 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ tv30 f;
    public final /* synthetic */ tv30 g;
    public final /* synthetic */ tv30 h;
    public final /* synthetic */ tv30 i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcp0(wbp0 wbp0Var, wbp0 wbp0Var2, wbp0 wbp0Var3, wbp0 wbp0Var4, wbp0 wbp0Var5, wbp0 wbp0Var6, wbp0 wbp0Var7, wbp0 wbp0Var8, wbp0 wbp0Var9, wbp0 wbp0Var10) {
        super(0);
        this.b = wbp0Var;
        this.c = wbp0Var2;
        this.d = wbp0Var3;
        this.e = wbp0Var4;
        this.f = wbp0Var5;
        this.g = wbp0Var6;
        this.h = wbp0Var7;
        this.i = wbp0Var8;
        this.t = wbp0Var9;
        this.X = wbp0Var10;
    }

    public final Object invoke() {
        byte b = this.a;
        wbp0 wbp0Var = this.X;
        Object obj = this.t;
        wbp0 wbp0Var2 = this.i;
        wbp0 wbp0Var3 = this.h;
        wbp0 wbp0Var4 = this.g;
        wbp0 wbp0Var5 = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        wbp0 wbp0Var6 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                x5u x5uVar = ((obp0) obj4).b.p1;
                Flowable flowable = (Flowable) ((ubp0) wbp0Var6).invoke();
                rkd0 rkd0VarP = ((vbp0) obj3).b.p();
                muz muzVarG = ((rbp0) obj2).b.G();
                x8c0 x8c0Var = (x8c0) ((ubp0) wbp0Var5).invoke();
                t8u0 t8u0Var = (t8u0) ((ubp0) wbp0Var4).invoke();
                zeu0 zeu0Var = (zeu0) ((ubp0) wbp0Var3).invoke();
                ((ubp0) wbp0Var2).invoke();
                ez11 ez11VarA = ((rbp0) obj).b.a();
                t2j0 t2j0Var = (t2j0) ((ubp0) wbp0Var).invoke();
                return new yjd0(x5uVar, new dzp0(flowable, t2j0Var), new kkd0(flowable, zeu0Var, new wht0(muzVarG), new t8r0(x8c0Var, t8u0Var), new zd1(rkd0VarP, t2j0Var), new hr0(t2j0Var)), (ikp) new z2p(new eea0(x5uVar, flowable, rkd0VarP, muzVarG, x8c0Var, t8u0Var, zeu0Var, ez11VarA, t2j0Var)).a);
            default:
                Context context = (Context) ((wbp0) obj4).invoke();
                Flowable flowable2 = (Flowable) wbp0Var6.invoke();
                luk lukVar = (luk) ((wbp0) obj3).invoke();
                Scheduler scheduler = (Scheduler) ((wbp0) obj2).invoke();
                Scheduler scheduler2 = (Scheduler) wbp0Var5.invoke();
                c3s c3sVar = (c3s) wbp0Var4.invoke();
                yqg yqgVar = (yqg) wbp0Var3.invoke();
                t2j0 t2j0Var2 = (t2j0) wbp0Var2.invoke();
                Flowable flowable3 = (Flowable) ((wbp0) obj).invoke();
                dma1 dma1Var = (dma1) wbp0Var.invoke();
                g2z g2zVar = new g2z();
                g2zVar.a = context;
                g2zVar.b = scheduler;
                g2zVar.c = yqgVar;
                g2zVar.d = t2j0Var2;
                g2zVar.e = flowable3;
                g2zVar.f = dma1Var;
                qjp qjpVar = new qjp(g2zVar);
                return new vf2(flowable2, new a0m(new lt4(false, lukVar), (byte) 1), c3sVar, (jly0) qjpVar.a, scheduler, scheduler2, (dlp) qjpVar.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcp0(obp0 obp0Var, obp0 obp0Var2, ubp0 ubp0Var, vbp0 vbp0Var, rbp0 rbp0Var, ubp0 ubp0Var2, ubp0 ubp0Var3, ubp0 ubp0Var4, ubp0 ubp0Var5, rbp0 rbp0Var2, ubp0 ubp0Var6) {
        super(0);
        this.b = obp0Var2;
        this.c = ubp0Var;
        this.d = vbp0Var;
        this.e = rbp0Var;
        this.f = ubp0Var2;
        this.g = ubp0Var3;
        this.h = ubp0Var4;
        this.i = ubp0Var5;
        this.t = rbp0Var2;
        this.X = ubp0Var6;
    }
}
