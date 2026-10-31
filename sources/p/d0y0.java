package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d0y0 extends a8d1 implements zu30 {
    public boolean a;
    public /* synthetic */ c0y0 b;
    public /* synthetic */ vzx0 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ wzx0 f;
    public final /* synthetic */ jjm0 g;
    public final /* synthetic */ c0y0 h;
    public final /* synthetic */ pt i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0y0(c9n c9nVar, iu30 iu30Var, wzx0 wzx0Var, jjm0 jjm0Var, c0y0 c0y0Var, pt ptVar, ven0 ven0Var, lnm lnmVar) {
        super(4, lnmVar);
        this.d = c9nVar;
        this.e = iu30Var;
        this.f = wzx0Var;
        this.g = jjm0Var;
        this.h = c0y0Var;
        this.i = ptVar;
        this.t = ven0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        pt ptVar = this.i;
        ven0 ven0Var = this.t;
        d0y0 d0y0Var = new d0y0(this.d, this.e, this.f, this.g, this.h, ptVar, ven0Var, (lnm) obj4);
        d0y0Var.b = (c0y0) obj;
        d0y0Var.c = (vzx0) obj2;
        return d0y0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        m231 m231Var;
        c0y0 c0y0Var = this.b;
        vzx0 vzx0Var = this.c;
        boolean z = this.a;
        m231 m231Var2 = rih1.a;
        try {
            if (!z) {
                hm5.M(obj);
                boolean z2 = vzx0Var instanceof uzx0;
                jjm0 jjm0Var = this.g;
                c9n c9nVar = this.d;
                wzx0 wzx0Var = this.f;
                pt ptVar = this.i;
                c0y0 c0y0Var2 = this.h;
                iu30 iu30Var = this.e;
                if (z2) {
                    fn31.T(c9nVar, (o8n) null, 0, new af0(vzx0Var, iu30Var, c0y0Var2, jjm0Var, ptVar, wzx0Var, (lnm) null, (byte) 19), 3);
                    return m231Var2;
                }
                boolean zJ = u890.j(vzx0Var, rzx0.a);
                ven0 ven0Var = this.t;
                if (zJ) {
                    b431 b431Var = (b431) ven0Var.getValue();
                    if (b431Var != null) {
                        b431Var.a(zpn1.y(6, c0y0Var.a(), (String) null), (String) null);
                        return m231Var2;
                    }
                } else if (u890.j(vzx0Var, qzx0.a)) {
                    yzx0 yzx0Var = c0y0Var instanceof yzx0 ? (yzx0) c0y0Var : null;
                    String str = yzx0Var != null ? yzx0Var.e : null;
                    b431 b431Var2 = (b431) ven0Var.getValue();
                    if (b431Var2 != null) {
                        b431Var2.a(zpn1.y(4, c0y0Var.a(), str), (String) null);
                        return m231Var2;
                    }
                } else if (u890.j(vzx0Var, szx0.a)) {
                    yzx0 yzx0Var2 = c0y0Var instanceof yzx0 ? (yzx0) c0y0Var : null;
                    if (yzx0Var2 != null) {
                        fn31.T(c9nVar, (o8n) null, 0, new af0(yzx0Var2, iu30Var, c0y0Var2, jjm0Var, ptVar, wzx0Var, (lnm) null, (byte) 20), 3);
                        return m231Var2;
                    }
                } else if (u890.j(vzx0Var, ozx0.a)) {
                    if (c0y0Var instanceof yzx0) {
                        iu30Var.invoke(yzx0.b((yzx0) c0y0Var, true));
                        return m231Var2;
                    }
                } else if (u890.j(vzx0Var, pzx0.a)) {
                    if (c0y0Var instanceof yzx0) {
                        iu30Var.invoke(new b0y0(wzx0Var.b, wzx0Var.c, wzx0Var.a));
                        tzr0 tzr0Var = (tzr0) ptVar.e;
                        String strA = c0y0Var2.a();
                        this.b = null;
                        this.c = null;
                        this.a = true;
                        Object objA = iyc0.a((iyc0) tzr0Var.c, strA, new ayc0("clear", null, null, false, null, 30), this);
                        d9n d9nVar = d9n.a;
                        if (objA != d9nVar) {
                            objA = m231Var2;
                        }
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else if (u890.j(vzx0Var, nzx0.a)) {
                    if (c0y0Var instanceof yzx0) {
                        iu30Var.invoke(yzx0.b((yzx0) c0y0Var, false));
                        return m231Var2;
                    }
                } else {
                    if (!u890.j(vzx0Var, tzx0.a)) {
                        eg.o();
                        return null;
                    }
                    xzx0 xzx0Var = c0y0Var instanceof xzx0 ? (xzx0) c0y0Var : null;
                    if (xzx0Var != null) {
                        String str2 = xzx0Var.d;
                        if (str2 != null && !ihc1.y0(str2)) {
                            fn31.T(c9nVar, (o8n) null, 0, new af0(str2, iu30Var, c0y0Var2, jjm0Var, ptVar, wzx0Var, (lnm) null), 3);
                            return m231Var2;
                        }
                        iu30Var.invoke(new b0y0(wzx0Var.b, wzx0Var.c, wzx0Var.a));
                    }
                }
                return m231Var2;
            }
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            n57.t("Failure when resetting promptable section", thA);
        }
        return m231Var2;
    }
}
