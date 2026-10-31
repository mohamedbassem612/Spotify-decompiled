package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bl1 implements vr20 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public bl1(String str, boolean z, qcy0 qcy0Var, iu30 iu30Var, ven0 ven0Var) {
        this.b = str;
        this.c = z;
        this.d = qcy0Var;
        this.e = iu30Var;
        this.f = ven0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        boolean z = this.c;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                el1 el1Var = (el1) obj2;
                if (z) {
                    el1Var.g.b.a(rih1Var);
                    return rih1Var;
                }
                o0i o0iVar = (o0i) obj4;
                String str = this.b;
                Object objD = el1Var.d(o0iVar, str, false, (String) obj3, new hh(el1Var, o0iVar, str, (byte) 6), new g3(el1Var, (byte) 16), lnmVar);
                return objD == d9n.a ? objD : rih1Var;
            default:
                iu30 iu30Var = (iu30) obj4;
                ven0 ven0Var = (ven0) obj3;
                qcy0 qcy0Var = (qcy0) obj2;
                xkk1 xkk1Var = ((uv00) obj).a(xkk1.class, this.b).b;
                if (xkk1Var != null) {
                    if (z) {
                        mq70 mq70Var = xkk1Var.e;
                        if (mq70Var == null && (mq70Var = xkk1Var.b) == null) {
                            mq70Var = xkk1Var.a;
                        }
                        up70 up70VarA = mq70Var.a(vp70.d);
                        qcy0 qcy0VarB = null;
                        String str2 = up70VarA != null ? up70VarA.a.a : null;
                        if (str2 == null || str2.length() == 0) {
                            qcy0 qcy0VarQ = b0o1.q(qcy0Var, (tcy0) ven0Var.getValue(), b0o1.j(xkk1Var));
                            if (qcy0VarQ != null) {
                                iu30Var.invoke(qcy0VarQ);
                            }
                        } else {
                            tcy0 tcy0Var = (tcy0) ven0Var.getValue();
                            qcy0 qcy0Var2 = tcy0Var instanceof qcy0 ? (qcy0) tcy0Var : null;
                            if (qcy0Var2 != null) {
                                qcy0 qcy0Var3 = (u890.j(qcy0Var2.a, qcy0Var.a) && u890.j(qcy0Var2.c, qcy0Var.c)) ? qcy0Var2 : null;
                                if (qcy0Var3 != null) {
                                    qcy0VarB = qcy0.b(qcy0Var3, str2, null, true, false, 703);
                                }
                            }
                            if (qcy0VarB != null) {
                                iu30Var.invoke(qcy0VarB);
                            }
                        }
                    } else {
                        qcy0 qcy0VarQ2 = b0o1.q(qcy0Var, (tcy0) ven0Var.getValue(), b0o1.j(xkk1Var));
                        if (qcy0VarQ2 != null) {
                            iu30Var.invoke(qcy0VarQ2);
                        }
                    }
                }
                return rih1Var;
        }
    }

    public bl1(boolean z, el1 el1Var, o0i o0iVar, String str, String str2) {
        this.c = z;
        this.d = el1Var;
        this.e = o0iVar;
        this.b = str;
        this.f = str2;
    }
}
