package p;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gt30 extends a8d1 implements xu30 {
    public ConcurrentHashMap a;
    public String b;
    public bn3 c;
    public smy d;
    public boolean e;
    public /* synthetic */ vt30 f;
    public /* synthetic */ smy g;
    public final /* synthetic */ bn3 h;
    public final /* synthetic */ ConcurrentHashMap i;
    public final /* synthetic */ kba t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt30(bn3 bn3Var, ConcurrentHashMap concurrentHashMap, kba kbaVar, lnm lnmVar) {
        super(3, lnmVar);
        this.h = bn3Var;
        this.i = concurrentHashMap;
        this.t = kbaVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ConcurrentHashMap concurrentHashMap = this.i;
        kba kbaVar = this.t;
        gt30 gt30Var = new gt30(this.h, concurrentHashMap, kbaVar, (lnm) obj3);
        gt30Var.f = (vt30) obj;
        gt30Var.g = (smy) obj2;
        return gt30Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    public final Object invokeSuspend(Object obj) {
        String str;
        ConcurrentHashMap concurrentHashMap;
        Object obj2;
        bn3 bn3Var;
        Object objL;
        bn3 bn3Var2;
        Context context;
        llw0 ilw0Var;
        omy omyVar;
        vt30 vt30Var = this.f;
        smy smyVar = this.g;
        boolean z = this.e;
        if (!z) {
            hm5.M(obj);
            str = vt30Var.d.a;
            concurrentHashMap = this.i;
            obj2 = concurrentHashMap.get(str);
            bn3Var = this.h;
            if (obj2 == null) {
                String str2 = vt30Var.d.a;
                this.f = null;
                this.g = null;
                this.a = concurrentHashMap;
                this.b = str;
                this.c = bn3Var;
                this.d = smyVar;
                this.e = true;
                objL = this.t.l(str2, this);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
                bn3Var2 = bn3Var;
            }
            List list = (List) obj2;
            bn3Var.getClass();
            String strB = smyVar.b();
            String strD = smyVar.d();
            String strC = smyVar.c();
            int iA = smyVar.a();
            context = bn3Var.a;
            if (smyVar.b().length() > 0) {
                ilw0Var = new jlw0(smyVar.b(), context.getString(2131956653));
            } else {
                ilw0Var = new ilw0(smyVar.a(), smyVar.a(), context.getString(2131956351));
            }
            llw0 llw0Var = ilw0Var;
            if (smyVar instanceof omy) {
                omyVar = (omy) smyVar;
            } else {
                omyVar = null;
            }
            return new qt30(strB, strD, strC, iA, llw0Var, list, omyVar != null ? omyVar.e : null);
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        smyVar = this.d;
        bn3Var2 = this.c;
        str = this.b;
        ConcurrentHashMap concurrentHashMap2 = this.a;
        hm5.M(obj);
        concurrentHashMap = concurrentHashMap2;
        objL = obj;
        List list2 = (List) objL;
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, list2);
        obj2 = objPutIfAbsent == null ? list2 : objPutIfAbsent;
        bn3Var = bn3Var2;
        List list3 = (List) obj2;
        bn3Var.getClass();
        String strB2 = smyVar.b();
        String strD2 = smyVar.d();
        String strC2 = smyVar.c();
        int iA2 = smyVar.a();
        context = bn3Var.a;
        if (smyVar.b().length() > 0) {
            ilw0Var = new jlw0(smyVar.b(), context.getString(2131956653));
        } else {
            ilw0Var = new ilw0(smyVar.a(), smyVar.a(), context.getString(2131956351));
        }
        llw0 llw0Var2 = ilw0Var;
        if (smyVar instanceof omy) {
            omyVar = (omy) smyVar;
        } else {
            omyVar = null;
        }
        return new qt30(strB2, strD2, strC2, iA2, llw0Var2, list3, omyVar != null ? omyVar.e : null);
    }
}
