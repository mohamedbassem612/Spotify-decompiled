package p;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wg extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ch d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg(ch chVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = chVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ch chVar = this.d;
        switch (b) {
            case 0:
                wg wgVar = new wg(chVar, lnmVar, (byte) 0);
                wgVar.c = obj;
                return wgVar;
            default:
                wg wgVar2 = new wg(chVar, lnmVar, (byte) 1);
                wgVar2.c = obj;
                return wgVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ssw0 ssw0Var = (ssw0) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(ssw0Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ch chVar = this.d;
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
                vg vgVar = new vg(ssw0Var, chVar);
                AccessibilityManager accessibilityManager = chVar.b;
                if (accessibilityManager != null) {
                    accessibilityManager.addAccessibilityStateChangeListener(vgVar);
                }
                ssw0Var.l(Boolean.valueOf(chVar.a()));
                y4 y4Var = new y4(chVar, vgVar, (byte) 2);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, y4Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                AccessibilityManager accessibilityManager2 = chVar.b;
                ssw0 ssw0Var2 = (ssw0) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean z3 = false;
                zg zgVar = new zg(ssw0Var2, (byte) 0);
                if (accessibilityManager2 != null) {
                    accessibilityManager2.addTouchExplorationStateChangeListener(zgVar);
                }
                if (accessibilityManager2 != null && accessibilityManager2.isTouchExplorationEnabled()) {
                    z3 = true;
                }
                ssw0Var2.l(Boolean.valueOf(z3));
                y4 y4Var2 = new y4(chVar, zgVar, (byte) 3);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var2, y4Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
