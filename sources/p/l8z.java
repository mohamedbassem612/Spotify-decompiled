package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l8z implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ p811 c;
    public final /* synthetic */ vr20 d;

    public /* synthetic */ l8z(String str, p811 p811Var, vr20 vr20Var, byte b) {
        this.a = b;
        this.b = str;
        this.c = p811Var;
        this.d = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    public final Object emit(Object obj, lnm lnmVar) {
        ksm0 ksm0Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        vr20 vr20Var = this.d;
        p811 p811Var = this.c;
        String str = this.b;
        q1v q1vVar = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                yvg1 yvg1Var = (yvg1) obj;
                long jLongValue = ((Number) yvg1Var.a).longValue();
                i091 i091Var = (i091) yvg1Var.b;
                boolean zBooleanValue = ((Boolean) yvg1Var.c).booleanValue();
                lsm0 lsm0Var = i091Var.a;
                lsm0 lsm0Var2 = i091Var.a;
                if (lsm0Var != null && (ksm0Var = lsm0Var.b) != null) {
                    q1vVar = ksm0Var.e;
                }
                boolean z = zBooleanValue && (q1vVar == null || q1vVar.equals(str));
                hlw0 hlw0Var = (hlw0) p811Var.a;
                Long l = hlw0Var.c;
                o091 o091Var = i091Var.h;
                if (z) {
                    float f = i091Var.f;
                    if (u890.j(o091Var, l091.a) || u890.j(o091Var, new k091(f091.a))) {
                        hlw0Var = new hlw0(lsm0Var2, Long.valueOf(jLongValue), 2);
                    } else if (lsm0Var2 != null || !(o091Var instanceof k091)) {
                        hlw0Var = new hlw0(lsm0Var2, lsm0Var2 != null && ((u890.j(hlw0Var.a, lsm0Var2) && hlw0Var.b) || ((l == null || jLongValue != l.longValue()) && u890.j(o091Var, n091.a) && Math.abs(f) <= Float.MAX_VALUE && f > 0.0f)), l);
                    }
                } else {
                    hlw0Var = new hlw0(lsm0Var2, Long.valueOf(jLongValue), 2);
                }
                p811Var.a = hlw0Var;
                Object objEmit = vr20Var.emit(new j8z(i091Var, z, hlw0Var), lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            default:
                k2v k2vVar = (k2v) obj;
                h2v h2vVar = (h2v) k2vVar.a.get(str);
                q1v q1vVarD = q1v.a;
                q1v q1vVarD2 = h2vVar != null ? rwq0.D(h2vVar) : q1vVarD;
                h2v h2vVar2 = (h2v) k2vVar.b.get(str);
                if (h2vVar2 != null) {
                    q1vVarD = rwq0.D(h2vVar2);
                }
                dt11 dt11Var = (dt11) p811Var.a;
                if ((dt11Var != null ? dt11Var.a : null) == q1vVarD2) {
                    if ((dt11Var != null ? dt11Var.b : null) == q1vVarD) {
                        return rih1Var;
                    }
                }
                dt11 dt11Var2 = new dt11(q1vVarD2, q1vVarD);
                p811Var.a = dt11Var2;
                Object objEmit2 = vr20Var.emit(dt11Var2, lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
        }
    }
}
