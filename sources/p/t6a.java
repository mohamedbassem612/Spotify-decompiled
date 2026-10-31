package p;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t6a extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6a(y6a y6aVar, z7a z7aVar, boolean z, y2j0 y2j0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.d = y6aVar;
        this.e = z7aVar;
        this.c = z;
        this.f = y2j0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                return new t6a((y6a) obj4, (z7a) obj3, this.c, (y2j0) obj2, lnmVar);
            case 1:
                return new t6a((iac0) obj4, (p1d0) obj3, (RecyclerView) obj2, this.c, lnmVar, (byte) 1);
            default:
                return new t6a((qns0) obj4, (List) obj3, (String) obj2, this.c, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008b  */
    public final Object invokeSuspend(Object obj) {
        Object objD;
        int i;
        l131 l131Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    d3j0 d3j0Var = new d3j0(new z2j0(z), (y2j0) obj2);
                    this.b = true;
                    return ((y6a) obj4).a((z7a) obj3, d3j0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    hl0 hl0Var = new hl0((p1d0) obj3, (RecyclerView) obj2, this.c, (lnm) null, (byte) 13);
                    this.b = true;
                    return z8p1.u((iac0) obj4, w8c0.d, hl0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    jn7 jn7Var = ((qns0) obj4).b;
                    uns0 uns0VarO = PermissionsEsperanto.CanPlayContentRequest.o();
                    uns0VarO.n((List) obj3);
                    uns0VarO.q((String) obj2);
                    uns0VarO.r(z);
                    PermissionsEsperanto.CanPlayContentRequest canPlayContentRequestBuild = uns0VarO.build();
                    this.b = true;
                    objD = jn7Var.d(canPlayContentRequestBuild, this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objD = obj;
                }
                h290<PermissionsEsperanto.CanPlayContentResult> h290VarO = ((PermissionsEsperanto.CanPlayContentResponse) objD).o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (PermissionsEsperanto.CanPlayContentResult canPlayContentResult : h290VarO) {
                    int i2 = rns0.b[canPlayContentResult.r().ordinal()];
                    if (i2 == 1) {
                        i = 1;
                    } else if (i2 == 2) {
                        i = 2;
                    } else if (i2 == 3) {
                        i = 3;
                    } else if (i2 != 4) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                    rh7 rh7Var = canPlayContentResult.t() ? new rh7(canPlayContentResult.o().getAgeThreshold()) : null;
                    d290<wns0> d290VarS = canPlayContentResult.s();
                    ArrayList arrayList2 = new ArrayList();
                    for (wns0 wns0Var : d290VarS) {
                        int i3 = wns0Var == null ? -1 : rns0.c[wns0Var.ordinal()];
                        if (i3 == 1) {
                            l131Var = l131.a;
                        } else if (i3 == 2) {
                            l131Var = l131.b;
                        } else if (i3 == 3) {
                            l131Var = l131.c;
                        } else if (i3 != 4) {
                            l131Var = i3 != 5 ? null : l131.e;
                        } else {
                            l131Var = l131.d;
                        }
                        if (l131Var != null) {
                            arrayList2.add(l131Var);
                        }
                    }
                    arrayList.add(new qfd(canPlayContentResult.q(), canPlayContentResult.p(), i, rh7Var, arrayList2));
                }
                return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6a(Object obj, Object obj2, Object obj3, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = z;
    }
}
