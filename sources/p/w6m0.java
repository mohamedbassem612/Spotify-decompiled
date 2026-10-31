package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import io.reactivex.rxjava3.core.Observer;
import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w6m0 implements Update {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w6m0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Next a(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        kkn kknVar;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                fam1 fam1Var = (oam1) obj2;
                if (fam1Var instanceof w9m1) {
                    return ((Update) obj3).a(obj, ((w9m1) fam1Var).a);
                }
                if (!(fam1Var instanceof fam1)) {
                    return Next.h(obj);
                }
                uah0 uah0VarA = fam1Var.a();
                w0h1.o(1, uah0VarA);
                return (Next) uah0VarA.invoke(obj);
            default:
                oam0 oam0Var = (oam0) obj;
                cam0 cam0Var = (lam0) obj2;
                an41 an41Var = oam0Var.b;
                Observer observer = oam0Var.c;
                kkn kknVar2 = oam0Var.a;
                sam0 sam0Var = (sam0) obj3;
                boolean z = cam0Var instanceof cam0;
                v9m0 v9m0Var = v9m0.e;
                if (z) {
                    xbm xbmVar = cam0Var.a;
                    if (!(kknVar2 instanceof t9m0)) {
                        k220.k("Unexpected ComponentInitialized, the state of ", sam0Var.a, " is ", kknVar2);
                        return null;
                    }
                    if (!(an41Var instanceof an41) || xbmVar != sam0Var.c(an41Var.a) || !sam0Var.a()) {
                        return Next.i(oam0.a(oam0Var, v9m0Var, (cn41) null, (Observer) null, false, 14), Effects.a(new bam0[]{new bam0(xbmVar)}));
                    }
                    s9m0 s9m0Var = new s9m0(xbmVar);
                    return Next.i(oam0.a(oam0Var, s9m0Var, (cn41) null, (Observer) null, false, 14), observer == null ? Effects.a(new z9m0[0]) : Effects.a(new z9m0[]{new z9m0(s9m0Var.k(), observer)}));
                }
                boolean z2 = cam0Var instanceof dam0;
                t9m0 t9m0Var = t9m0.e;
                if (z2) {
                    an41 an41Var2 = ((dam0) cam0Var).a;
                    if (!sam0Var.a() || oam0Var.d) {
                        return Next.j();
                    }
                    return (!(kknVar2 instanceof u9m0) || observer == null) ? Next.h(oam0.a(oam0Var, (kkn) null, an41Var2, (Observer) null, false, 13)) : Next.i(oam0.a(oam0Var, t9m0Var, an41Var2, (Observer) null, false, 12), Effects.a(new y9m0[]{new y9m0(sam0Var.c(an41Var2.a))}));
                }
                if (cam0Var.equals(eam0.a)) {
                    return sam0.d(oam0Var);
                }
                if (cam0Var instanceof fam0) {
                    return sam0.d(oam0.a(oam0Var, (kkn) null, (cn41) null, (Observer) null, true, 7));
                }
                if (cam0Var instanceof gam0) {
                    return Next.h(oam0.a(oam0Var, (kkn) null, (cn41) null, (Observer) null, false, 7));
                }
                if (cam0Var instanceof iam0) {
                    Observer observer2 = ((iam0) cam0Var).a;
                    if (observer != null) {
                        eg.m("The subscriber should be removed before setting a new one.");
                        return null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if ((kknVar2 instanceof s9m0) || (kknVar2 instanceof w9m0) || (an41Var instanceof bn41)) {
                        linkedHashSet.add(new z9m0(kknVar2.k(), observer2));
                    }
                    return Next.i(oam0.a(oam0Var, (kkn) null, (cn41) null, observer2, false, 11), linkedHashSet);
                }
                if (cam0Var.equals(ham0.a)) {
                    HashSet hashSetA = Effects.a(new nln[0]);
                    if (kknVar2 instanceof s9m0) {
                        kkn w9m0Var = new w9m0(((s9m0) kknVar2).e);
                        hashSetA.add(aam0.e);
                        kknVar = w9m0Var;
                    } else {
                        kknVar = kknVar2;
                    }
                    return Next.i(oam0.a(oam0Var, kknVar, (cn41) null, (Observer) null, false, 8), hashSetA);
                }
                if (cam0Var.equals(jam0.a)) {
                    return an41Var instanceof an41 ? Next.i(oam0.a(oam0Var, t9m0Var, (cn41) null, (Observer) null, false, 14), Effects.a(new y9m0[]{new y9m0(sam0Var.c(an41Var.a))})) : Next.h(oam0.a(oam0Var, u9m0.e, (cn41) null, (Observer) null, false, 14));
                }
                if (!cam0Var.equals(kam0.a)) {
                    eg.o();
                    return null;
                }
                if (kknVar2 instanceof w9m0) {
                    return Next.i(oam0.a(oam0Var, v9m0Var, (cn41) null, (Observer) null, false, 14), observer == null ? Effects.a(new bam0[]{new bam0(((w9m0) kknVar2).e)}) : Effects.a(new x9m0[]{new x9m0(observer, ((w9m0) kknVar2).e)}));
                }
                hhg1.o(kknVar2, "Not expected event ShutdownHooksCompleted, state = ");
                return null;
        }
    }
}
