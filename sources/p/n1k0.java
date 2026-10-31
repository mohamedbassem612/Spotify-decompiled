package p;

import com.spotify.automix.esperanto.proto.EsAutomix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n1k0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jn7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1k0(jn7 jn7Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = jn7Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        jn7 jn7Var = this.d;
        switch (b) {
            case 0:
                n1k0 n1k0Var = new n1k0(jn7Var, lnmVar, (byte) 0);
                n1k0Var.c = obj;
                return n1k0Var;
            case 1:
                n1k0 n1k0Var2 = new n1k0(jn7Var, lnmVar, (byte) 1);
                n1k0Var2.c = obj;
                return n1k0Var2;
            case 2:
                n1k0 n1k0Var3 = new n1k0(jn7Var, lnmVar, (byte) 2);
                n1k0Var3.c = obj;
                return n1k0Var3;
            default:
                n1k0 n1k0Var4 = new n1k0(jn7Var, lnmVar, (byte) 3);
                n1k0Var4.c = obj;
                return n1k0Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((q1k0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((b6k0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((f6k0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((snk0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        jn7 jn7Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                q1k0 q1k0Var = (q1k0) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                flz flzVarO = EsAutomix.GetEqStylesForEqStyleIdRequest.o();
                ArrayList arrayList = q1k0Var.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Integer(((jez) it.next()).a));
                }
                flzVarO.n(arrayList2);
                Integer num = q1k0Var.b;
                if (num != null) {
                    flzVarO.q(num.intValue());
                }
                EsAutomix.GetEqStylesForEqStyleIdRequest getEqStylesForEqStyleIdRequestBuild = flzVarO.build();
                getEqStylesForEqStyleIdRequestBuild.getClass();
                this.c = null;
                this.b = true;
                Object objV = jn7Var.v(getEqStylesForEqStyleIdRequestBuild, this);
                return objV == d9nVar ? d9nVar : objV;
            case 1:
                b6k0 b6k0Var = (b6k0) this.c;
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
                glz glzVarO = EsAutomix.GetFilterFxStylesForFilterFxStyleIdRequest.o();
                ArrayList arrayList3 = b6k0Var.a;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new Integer(((ha20) it2.next()).a));
                }
                glzVarO.n(arrayList4);
                Integer num2 = b6k0Var.b;
                if (num2 != null) {
                    glzVarO.q(num2.intValue());
                }
                EsAutomix.GetFilterFxStylesForFilterFxStyleIdRequest getFilterFxStylesForFilterFxStyleIdRequestBuild = glzVarO.build();
                getFilterFxStylesForFilterFxStyleIdRequestBuild.getClass();
                this.c = null;
                this.b = true;
                Object objW = jn7Var.w(getFilterFxStylesForFilterFxStyleIdRequestBuild, this);
                return objW == d9nVar ? d9nVar : objW;
            case 2:
                f6k0 f6k0Var = (f6k0) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hlz hlzVarO = EsAutomix.GetFxStylesForFxStyleIdRequest.o();
                ArrayList arrayList5 = f6k0Var.a;
                ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(new Integer(((rx30) it3.next()).a));
                }
                hlzVarO.n(arrayList6);
                hlzVarO.q(f6k0Var.b);
                Integer num3 = f6k0Var.c;
                if (num3 != null) {
                    hlzVarO.r(num3.intValue());
                }
                EsAutomix.GetFxStylesForFxStyleIdRequest getFxStylesForFxStyleIdRequestBuild = hlzVarO.build();
                getFxStylesForFxStyleIdRequestBuild.getClass();
                this.c = null;
                this.b = true;
                Object objX = jn7Var.x(getFxStylesForFxStyleIdRequestBuild, this);
                return objX == d9nVar ? d9nVar : objX;
            default:
                snk0 snk0Var = (snk0) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mlz mlzVarO = EsAutomix.GetVolumeStylesForVolumeStyleIdRequest.o();
                ArrayList arrayList7 = snk0Var.a;
                ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(new Integer(((duk1) it4.next()).a));
                }
                mlzVarO.n(arrayList8);
                Integer num4 = snk0Var.b;
                if (num4 != null) {
                    mlzVarO.q(num4.intValue());
                }
                EsAutomix.GetVolumeStylesForVolumeStyleIdRequest getVolumeStylesForVolumeStyleIdRequestBuild = mlzVarO.build();
                getVolumeStylesForVolumeStyleIdRequestBuild.getClass();
                this.c = null;
                this.b = true;
                Object objH = jn7Var.H(getVolumeStylesForVolumeStyleIdRequestBuild, this);
                return objH == d9nVar ? d9nVar : objH;
        }
    }
}
