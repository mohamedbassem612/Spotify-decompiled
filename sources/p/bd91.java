package p;

import com.spotify.home.slotloading.SlotEffect$FetchLayout;
import com.spotify.home.slotloading.SlotEffect$LoadSlotContent;
import com.spotify.home.slotloading.SlotEffect$UpdateOnDemandSet;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.Collections;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bd91 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cd91 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd91(cd91 cd91Var, String str, boolean z, String str2, boolean z2, boolean z3, String str3, lnm lnmVar) {
        super(2, lnmVar);
        this.c = cd91Var;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.g = z2;
        this.h = z3;
        this.i = str3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        bd91 bd91Var = new bd91(this.c, this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
        bd91Var.b = obj;
        return bd91Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1.a);
        return d9n.a;
    }

    public final Object invokeSuspend(Object obj) {
        ssw0 ssw0Var = (ssw0) this.b;
        d9n d9nVar = d9n.a;
        boolean z = this.a;
        cd91 cd91Var = this.c;
        try {
            if (z) {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                throw new KotlinNothingValueException();
            }
            hm5.M(obj);
            CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
            CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
            String str = this.f;
            ad91 ad91Var = new ad91(str, cd91Var);
            jd11 jd11Var = rc11.a;
            coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(SlotEffect$FetchLayout.class), runSequentially.a(ad91Var));
            coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(SlotEffect$LoadSlotContent.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new yc91(this.c, this.f, this.g, this.h, this.i)));
            coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(SlotEffect$UpdateOnDemandSet.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wc91(str, cd91Var)));
            fns fnsVar = igu.a;
            v62 v62Var = new v62(olj0.T0, (byte) 21);
            fnsVar.getClass();
            MobiusLoop.Builder builderD = Mobius.d(new wam0((byte) 17), new a(flo1.l(fnsVar, v62Var), coroutinesSubtypeEffectHandlerBuilderI));
            z6x z6xVar = z6x.a;
            b7x b7xVar = b7x.a;
            String str2 = this.d;
            MobiusLoop mobiusLoopA = builderD.a(new qe91(z6xVar, b7xVar, null, false, str2), Collections.singleton(new SlotEffect$FetchLayout(this.e, str2)));
            cd91Var.g = mobiusLoopA;
            mobiusLoopA.b(new vc91(cd91Var, ssw0Var, this.g));
            this.b = null;
            this.a = true;
            hap1.f(this);
            return d9nVar;
        } catch (Throwable th) {
            MobiusLoop mobiusLoop = cd91Var.g;
            cd91Var.g = null;
            if (mobiusLoop != null) {
                mobiusLoop.dispose();
            }
            throw th;
        }
    }
}
