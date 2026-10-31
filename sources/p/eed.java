package p;

import com.spotify.campfire.datasource.impl.proto.LeaveGroupRequest;
import com.spotify.campfire.datasource.impl.proto.LeaveMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eed extends a8d1 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eed(String str, gw70 gw70Var, boolean z, lnm lnmVar) {
        super(1, lnmVar);
        this.c = str;
        this.e = gw70Var;
        this.d = z;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new eed((bfd) this.e, this.c, this.d, lnmVar);
            default:
                return new eed(this.c, (gw70) this.e, this.d, lnmVar);
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
        boolean z = this.d;
        Object obj2 = this.e;
        String str = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                rih1 rih1Var = rih1.a;
                if (!z2) {
                    hm5.M(obj);
                    nad nadVar = ((bfd) obj2).b;
                    this.b = true;
                    Object objJ = nadVar.a.j(LeaveGroupRequest.newBuilder().setHierarchyId(str).setLeaveMode(z ? LeaveMode.DELETE : LeaveMode.READ_ONLY).build(), this);
                    if (objJ != d9nVar) {
                        objJ = rih1Var;
                    }
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
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
                str.getClass();
                this.b = true;
                Object objG = u3k.a.g(str, (gw70) obj2, z, this);
                return objG == d9nVar ? d9nVar : objG;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eed(bfd bfdVar, String str, boolean z, lnm lnmVar) {
        super(1, lnmVar);
        this.e = bfdVar;
        this.c = str;
        this.d = z;
    }
}
