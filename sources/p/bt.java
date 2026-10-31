package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bt implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ ss c;
    public final /* synthetic */ ts d;

    public /* synthetic */ bt(vr20 vr20Var, pt ptVar, ss ssVar, ts tsVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = ssVar;
        this.d = tsVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) {
        at atVar;
        dt dtVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ts tsVar = this.d;
        ss ssVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (lnmVar instanceof at) {
                    atVar = (at) lnmVar;
                    int i = atVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        atVar.b = i - Integer.MIN_VALUE;
                    } else {
                        atVar = new at(this, lnmVar);
                    }
                } else {
                    atVar = new at(this, lnmVar);
                }
                Object obj2 = atVar.a;
                int i2 = atVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rs rsVar = (rs) ssVar;
                ev evVar = rsVar.a;
                Object wsVar = evVar == null ? new ws(true) : new vs(pt.A(rsVar.b, tsVar.b, zBooleanValue), tsVar.c, evVar, true);
                atVar.b = 1;
                return vr20Var.emit(wsVar, atVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof dt) {
                    dtVar = (dt) lnmVar;
                    int i3 = dtVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dtVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        dtVar = new dt(this, lnmVar);
                    }
                } else {
                    dtVar = new dt(this, lnmVar);
                }
                Object obj3 = dtVar.a;
                int i4 = dtVar.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    xs xsVarJ = pt.J((qs) ssVar, tsVar, ((Boolean) obj).booleanValue());
                    dtVar.b = 1;
                    return vr20Var.emit(xsVarJ, dtVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
