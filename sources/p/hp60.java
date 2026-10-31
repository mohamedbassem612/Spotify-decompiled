package p;

import com.spotify.home.slotloading.SlotEffect$LoadSlotContent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hp60 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp60(mp60 mp60Var, String str, ice0 ice0Var, boolean z, boolean z2, String str2, lnm lnmVar) {
        super(1, lnmVar);
        this.g = mp60Var;
        this.c = str;
        this.h = ice0Var;
        this.d = z;
        this.e = z2;
        this.f = str2;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                boolean z = this.e;
                String str = this.f;
                return new hp60((mp60) obj2, this.c, (ice0) obj, this.d, z, str, lnmVar);
            default:
                return new hp60((fad0) obj2, (SlotEffect$LoadSlotContent) obj, this.c, this.d, this.e, this.f, lnmVar);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.g;
        d9n d9nVar = d9n.a;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA = c2e.a(((mp60) obj2).a, this.c, (ice0) obj3, this.d, this.e, (String) null, this.f, (String) null, this, 208);
                    return objA == d9nVar ? d9nVar : objA;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                SlotEffect$LoadSlotContent slotEffect$LoadSlotContent = (SlotEffect$LoadSlotContent) obj3;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ua91 ua91Var = (ua91) ((fad0) obj2).b;
                ef91 slotType = slotEffect$LoadSlotContent.getSlotType();
                ice0 loadingStrategy = slotEffect$LoadSlotContent.getLoadingStrategy();
                String sessionId = slotEffect$LoadSlotContent.getSessionId();
                this.b = true;
                Object objZ = ua91Var.z(slotType, loadingStrategy, this.c, this.d, this.e, this.f, sessionId, this);
                return objZ == d9nVar ? d9nVar : objZ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp60(fad0 fad0Var, SlotEffect$LoadSlotContent slotEffect$LoadSlotContent, String str, boolean z, boolean z2, String str2, lnm lnmVar) {
        super(1, lnmVar);
        this.g = fad0Var;
        this.h = slotEffect$LoadSlotContent;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = str2;
    }
}
