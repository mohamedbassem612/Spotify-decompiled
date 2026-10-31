package p;

import android.view.accessibility.AccessibilityManager;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jh extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ AccessibilityManager d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh(AccessibilityManager accessibilityManager, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = accessibilityManager;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        AccessibilityManager accessibilityManager = this.d;
        switch (b) {
            case 0:
                jh jhVar = new jh(accessibilityManager, lnmVar, (byte) 0);
                jhVar.c = obj;
                return jhVar;
            case 1:
                jh jhVar2 = new jh(accessibilityManager, lnmVar, (byte) 1);
                jhVar2.c = obj;
                return jhVar2;
            default:
                jh jhVar3 = new jh(accessibilityManager, lnmVar, (byte) 2);
                jhVar3.c = obj;
                return jhVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        AccessibilityManager accessibilityManager = this.d;
        switch (b) {
            case 0:
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                y4 y4Var = new y4(ssw0Var, accessibilityManager, (byte) 5);
                ih ihVar = new ih(y4Var);
                zg zgVar = new zg(y4Var, (byte) 1);
                accessibilityManager.addAccessibilityStateChangeListener(ihVar);
                accessibilityManager.addTouchExplorationStateChangeListener(zgVar);
                y4Var.invoke();
                hh hhVar = new hh(accessibilityManager, ihVar, zgVar, (byte) 0);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, hhVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                psw0 psw0Var = (nsw0) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (accessibilityManager == null) {
                    psw0Var.setValue(Boolean.FALSE);
                    return rih1Var;
                }
                psw0 psw0Var2 = psw0Var;
                psw0Var2.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                xf90 xf90Var = new xf90(psw0Var2, (byte) 0);
                accessibilityManager.addTouchExplorationStateChangeListener(xf90Var);
                x680 x680Var = new x680(accessibilityManager, xf90Var, (byte) 8);
                this.c = null;
                this.b = true;
                psw0Var2.d(x680Var, this);
                return d9nVar;
            default:
                psw0 psw0Var3 = (nsw0) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (accessibilityManager == null) {
                    return rih1Var;
                }
                psw0 psw0Var4 = psw0Var3;
                psw0Var4.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                xf90 xf90Var2 = new xf90(psw0Var4, (byte) 1);
                accessibilityManager.addTouchExplorationStateChangeListener(xf90Var2);
                x680 x680Var2 = new x680(accessibilityManager, xf90Var2, (byte) 9);
                this.c = null;
                this.b = true;
                psw0Var4.d(x680Var2, this);
                return d9nVar;
        }
    }
}
