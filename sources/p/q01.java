package p;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.browse.clientnative.mobius.BrowseEffect;
import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.browse.clientnative.mobius.b;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class q01 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(Object obj, byte b) {
        super(0, obj, o86.class, "logUpdateConfirmationDialogImpression", "logUpdateConfirmationDialogImpression()V", 0);
        this.a = b;
        switch (b) {
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                super(0, obj, cw7.class, "close", "close()V", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke() {
        ContentCaptureSession contentCaptureSessionC;
        WeakReference weakReference;
        dg30 dg30Var;
        switch (this.a) {
            case 0:
                r01 r01Var = (r01) ((lyc) this).receiver;
                if (r01Var.a) {
                    r01Var.a = false;
                    r01Var.c.z(r01Var);
                }
                return rih1.a;
            case 1:
                ((v51) ((lyc) this).receiver).P0.setContent(r3i.b);
                return rih1.a;
            case 2:
                ((ju1) ((lyc) this).receiver).a.l(gu1.a);
                return rih1.a;
            case 3:
                wt1 wt1Var = (wt1) ((lyc) this).receiver;
                i8h1 i8h1Var = wt1Var.a;
                x6h1 x6h1VarC = wt1Var.b.a.c();
                x6h1VarC.i.add(new a7h1("filter_container", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("text_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("filter", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            case 4:
                wt1 wt1Var2 = (wt1) ((lyc) this).receiver;
                i8h1 i8h1Var2 = wt1Var2.a;
                gpk0 gpk0Var = wt1Var2.b;
                b7x b7xVar2 = b7x.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("drag", 1, b7xVar2), new x7h1("ui_reveal", 1, b7xVar2), gpk0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            case 5:
                ((ju1) ((lyc) this).receiver).a.l(gu1.a);
                return rih1.a;
            case 6:
                ((ju1) ((lyc) this).receiver).a.l(gu1.a);
                return rih1.a;
            case 7:
                ((p52) ((lyc) this).receiver).b = true;
                return rih1.a;
            case 8:
                return (n1n0) ((kly0) ((lyc) this).receiver).get();
            case 9:
                ((mh2) ((lyc) this).receiver).g.onNext(nh2.a);
                return rih1.a;
            case 10:
                ((mh2) ((lyc) this).receiver).g.onNext(rh2.a);
                return rih1.a;
            case 11:
                return (nz2) ((kly0) ((lyc) this).receiver).get();
            case 12:
                return (tzv0) ((kly0) ((lyc) this).receiver).get();
            case 13:
                ((yd3) ((lyc) this).receiver).a();
                return rih1.a;
            case 14:
                return (n1n0) ((kly0) ((lyc) this).receiver).get();
            case 15:
                View view = (View) ((lyc) this).receiver;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    w081.A(view);
                }
                if (i < 29 || (contentCaptureSessionC = g961.c(view)) == null) {
                    return null;
                }
                return new trl(contentCaptureSessionC, view);
            case 16:
                ((Runnable) ((lyc) this).receiver).run();
                return rih1.a;
            case 17:
                ((o86) ((lyc) this).receiver).f();
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                cw7 cw7Var = (cw7) ((lyc) this).receiver;
                lzn0 lzn0Var = cw7Var.b;
                if (lzn0Var.j(cw7Var.a)) {
                    lzn0Var.e();
                } else {
                    cw7Var.c.l();
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((vi8) ((lyc) this).receiver).a.onNext(slv0.a);
                return rih1.a;
            case 20:
                ys9 ys9Var = (ys9) ((lyc) this).receiver;
                String str = ys9Var.a.h;
                if (str != null && str.length() != 0) {
                    ot9 ot9Var = ys9Var.d;
                    if (ot9Var.c == 1 && (weakReference = (WeakReference) ot9Var.b.k()) != null && (dg30Var = (Activity) weakReference.get()) != null) {
                        ot9Var.c = 2;
                        ot9Var.d = new WeakReference(dg30Var);
                        a1r0 a1r0Var = (a1r0) ((jly0) ot9Var.a.a.a(dg30Var).f).get();
                        a1r0.j(a1r0Var, "spotify:internal:byom-volume-control", (String) null, (Bundle) null, a1r0Var.h(dg30Var), 6);
                    }
                }
                return rih1.a;
            case 21:
                t3b t3bVar = (t3b) ((lyc) this).receiver;
                fn31.T(t3bVar.i, (o8n) null, 0, new n3b(t3bVar, (lnm) null, (byte) 1), 3);
                return rih1.a;
            case 22:
                t8h1 t8h1Var = ((zdb) ((lyc) this).receiver).S1;
                if (t8h1Var == null) {
                    u890.C("ubiPageLocationChangeListener");
                    throw null;
                }
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.n(t8h1Var, yon1.u5());
                return rih1.a;
            case 23:
                a8c a8cVar = (a8c) ((lyc) this).receiver;
                a8cVar.getClass();
                PublishSubject publishSubject = new PublishSubject();
                BrowseState.Loading loading = BrowseState.Loading.INSTANCE;
                a8cVar.N0 = false;
                b bVar = a8cVar.d;
                b8c b8cVar = new b8c();
                CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
                coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(BrowseEffect.Load.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g8c(bVar.c)));
                MobiusLoop mobiusLoopG = Mobius.d(b8cVar, new a(bVar.a, coroutinesSubtypeEffectHandlerBuilderI)).d(new c8c(bVar)).b(new d8c(bVar)).i(new qn(bVar.b, new e8c(bVar, (lnm) null), (byte) 2)).g(loading);
                a8cVar.Z = mobiusLoopG.b(new x7c(a8cVar, publishSubject));
                a8cVar.Y = mobiusLoopG;
                return yoi1.g(publishSubject.distinctUntilChanged(y7c.a).map(new z7c(a8cVar)));
            case 24:
                ((lzn0) ((lyc) this).receiver).e();
                return rih1.a;
            case 25:
                return (qhd1) ((kly0) ((lyc) this).receiver).get();
            case 26:
                vkd vkdVar = (vkd) ((lyc) this).receiver;
                int i2 = vkdVar.r1;
                if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                    vkdVar.q1.post(new ukd(vkdVar, i2, (byte) 0));
                } else if (i2 == vkdVar.r1) {
                    vkdVar.p1 = true;
                    vkdVar.M();
                }
                return rih1.a;
            case 27:
                return (d0r) ((ynb0) ((lyc) this).receiver).get();
            case 28:
                return (n1n0) ((kly0) ((lyc) this).receiver).get();
            default:
                ChoiceScreenUcActivity choiceScreenUcActivity = (ChoiceScreenUcActivity) ((lyc) this).receiver;
                f5g f5gVar = ChoiceScreenUcActivity.y1;
                uba ubaVarL0 = choiceScreenUcActivity.l0();
                dsk0 dsk0Var = choiceScreenUcActivity.l1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC3 = dsk0Var.b.c();
                x6h1VarC3.i.add(new a7h1("item_unavailable", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("go_back_cta", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                b7x b7xVar3 = b7x.a;
                ubaVarL0.m(new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_navigate_back", 1, b7xVar3), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                choiceScreenUcActivity.m0().U(b7g.a);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q01(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(Runnable runnable) {
        super(0, runnable, Runnable.class, "run", "run()V", 0);
        this.a = (byte) 16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q01(ha4 ha4Var) {
        super(0, ha4Var, xa4.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
        this.a = (byte) 15;
    }
}
