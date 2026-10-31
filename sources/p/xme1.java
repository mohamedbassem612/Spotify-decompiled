package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xme1 extends a8d1 implements vu30 {
    public final /* synthetic */ hdn0 X;
    public final /* synthetic */ ven0 Y;
    public int a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ane1 d;
    public final /* synthetic */ SceneTemplate.TimeMachineContent.Card2.YearEntry e;
    public final /* synthetic */ o95 f;
    public final /* synthetic */ o95 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ hdn0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xme1(ane1 ane1Var, SceneTemplate.TimeMachineContent.Card2.YearEntry yearEntry, o95 o95Var, o95 o95Var2, ven0 ven0Var, hdn0 hdn0Var, ven0 ven0Var2, hdn0 hdn0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.d = ane1Var;
        this.e = yearEntry;
        this.f = o95Var;
        this.g = o95Var2;
        this.h = ven0Var;
        this.i = hdn0Var;
        this.t = ven0Var2;
        this.X = hdn0Var2;
        this.Y = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        xme1 xme1Var = new xme1(this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, lnmVar);
        xme1Var.c = obj;
        return xme1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x021c A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        byte b;
        o8n o8nVar;
        d9n d9nVar;
        int i;
        int i2;
        Float f;
        pxg1 pxg1VarO0;
        ane1 ane1Var = this.d;
        String str = ane1Var.h;
        c9n c9nVar = (c9n) this.c;
        byte b2 = this.b;
        o95 o95Var = this.f;
        hdn0 hdn0Var = this.X;
        hdn0 hdn0Var2 = this.i;
        rih1 rih1Var = rih1.a;
        d9n d9nVar2 = d9n.a;
        if (b2 != 0) {
            if (b2 == 1) {
                int i3 = this.a;
                hm5.M(obj);
                hdn0Var2 = hdn0Var2;
                o8nVar = null;
                d9nVar = d9nVar2;
                hdn0Var = hdn0Var;
                i = i3;
            } else {
                if (b2 != 2) {
                    if (b2 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.a;
                hm5.M(obj);
                hdn0Var2 = hdn0Var2;
                o8nVar = null;
                d9nVar = d9nVar2;
                hdn0Var = hdn0Var;
            }
            ((err0) hdn0Var).t(((err0) hdn0Var2).s());
            f = new Float(1.0f);
            ilv.a.getClass();
            pxg1VarO0 = irn1.o0(500, 0, flv.i, 2);
            this.c = o8nVar;
            this.a = i2;
            this.b = (byte) 3;
            if (o95.b(this.g, f, pxg1VarO0, (Float) null, (iu30) null, this, 12) != d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        hm5.M(obj);
        ven0 ven0Var = this.h;
        if (((Boolean) ven0Var.getValue()).booleanValue()) {
            ven0Var.setValue(Boolean.FALSE);
            return rih1Var;
        }
        ane1Var.o.invoke();
        err0 err0Var = (err0) hdn0Var2;
        int year = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) ane1Var.a.get(err0Var.s())).getYear();
        boolean zBooleanValue = ((Boolean) this.t.getValue()).booleanValue();
        sme1 sme1Var = ane1Var.k;
        b7x b7xVar = b7x.a;
        if (zBooleanValue) {
            i8h1 i8h1Var = sme1Var.c;
            r6h1 r6h1VarB = bcl1.b(sme1Var.a, (hp80) null, str);
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-wrapped-time-machine";
            x6h1VarI.f = "1.0.0";
            x6h1VarI.g = "22.0.0";
            y6h1 y6h1VarA = x6h1VarI.a();
            Integer numValueOf = Integer.valueOf(year);
            x6h1 x6h1VarC = y6h1VarA.c();
            b = 1;
            x6h1VarC.i.add(new a7h1("year_content", str, numValueOf, (String) null, (String) null));
            x6h1VarC.j = true;
            i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), r6h1VarB, System.currentTimeMillis()), (xj61) null);
            o8nVar = null;
        } else {
            b = 1;
            i8h1 i8h1Var2 = sme1Var.c;
            r6h1 r6h1VarB2 = bcl1.b(sme1Var.a, (hp80) null, str);
            y6h1 y6h1Var2 = y6h1.i;
            x6h1 x6h1VarI2 = i3o1.i();
            x6h1VarI2.h = "music";
            x6h1VarI2.a = "mobile-wrapped-time-machine";
            x6h1VarI2.f = "1.0.0";
            x6h1VarI2.g = "22.0.0";
            y6h1 y6h1VarA2 = x6h1VarI2.a();
            Integer numValueOf2 = Integer.valueOf(year);
            x6h1 x6h1VarC2 = y6h1VarA2.c();
            x6h1VarC2.i.add(new a7h1("year_content", str, numValueOf2, (String) null, (String) null));
            x6h1VarC2.j = true;
            o8nVar = null;
            i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1VarB2, System.currentTimeMillis()), (xj61) null);
        }
        if (!ane1Var.g) {
            ((err0) hdn0Var).t(err0Var.s());
            return rih1Var;
        }
        this.Y.setValue(new u7h(ror0.e(u7h.j, this.e.o())));
        Float f2 = new Float(1.0f);
        this.c = c9nVar;
        this.a = year;
        this.b = b;
        d9nVar = d9nVar2;
        if (o95Var.g(f2, this) != d9nVar) {
            i = year;
        }
        return d9nVar;
        fn31.T(c9nVar, o8nVar, 0, new b(o95Var, o8nVar, (byte) 24), 3);
        Float f3 = new Float(0.0f);
        ilv.a.getClass();
        pxg1 pxg1VarO1 = irn1.o0(100, 0, flv.i, 2);
        this.c = o8nVar;
        this.a = i;
        this.b = (byte) 2;
        if (o95.b(this.g, f3, pxg1VarO1, (Float) null, (iu30) null, this, 12) != d9nVar) {
            i2 = i;
            ((err0) hdn0Var).t(((err0) hdn0Var2).s());
            f = new Float(1.0f);
            ilv.a.getClass();
            pxg1VarO0 = irn1.o0(500, 0, flv.i, 2);
            this.c = o8nVar;
            this.a = i2;
            this.b = (byte) 3;
            if (o95.b(this.g, f, pxg1VarO0, (Float) null, (iu30) null, this, 12) != d9nVar) {
                return rih1Var;
            }
        }
        return d9nVar;
    }
}
