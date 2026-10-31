package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class otq {
    public final /* synthetic */ tsq a;

    public otq(tsq tsqVar) {
        this.a = tsqVar;
    }

    public final tar0 a(boolean z) {
        qtq qtqVar = (qtq) this.a.c;
        vgq0 vgq0Var = new vgq0(new q55(false, qtqVar.a.b()), (byte) 2);
        wao0 wao0Var = new wao0(1, (ptq) qtqVar.R.get(), ptq.class, "create", "create(Lcom/spotify/ubi/model/Scene;)Lcom/spotify/ubi/pageboundubiloggerimpl/pagepresentation/PageVisitProcessorImpl;", 0, (byte) 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rj41 rj41Var = rj41.b;
        Object objInvoke = linkedHashMap.get(rj41Var);
        if (objInvoke == null) {
            objInvoke = wao0Var.invoke(rj41Var);
            linkedHashMap.put(rj41Var, objInvoke);
        }
        return new tar0(vgq0Var, (bjr0) objInvoke, qtqVar.a.a(), z);
    }
}
