package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b041 extends a8d1 implements vu30 {
    public final /* synthetic */ hkm1 X;
    public final /* synthetic */ String Y;
    public voe1 a;
    public s2t b;
    public h120 c;
    public Map d;
    public gzl1 e;
    public l041 f;
    public long g;
    public byte h;
    public /* synthetic */ Object i;
    public final /* synthetic */ l041 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b041(l041 l041Var, hkm1 hkm1Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.t = l041Var;
        this.X = hkm1Var;
        this.Y = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        b041 b041Var = new b041(this.t, this.X, this.Y, lnmVar);
        b041Var.i = obj;
        return b041Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0120  */
    /* JADX WARN: Code duplicated, block: B:39:0x0135  */
    /* JADX WARN: Code duplicated, block: B:40:0x013d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0164  */
    public final Object invokeSuspend(Object obj) {
        long jB;
        voe1 voe1Var;
        s2t s2tVarQ;
        Object objQ;
        gzl1 gzl1VarA;
        Object objE;
        h120 h120Var;
        voe1 voe1Var2;
        l041 l041Var;
        Map map;
        gzl1 gzl1Var;
        Object objG;
        long j;
        Map map2;
        h120 h120Var2;
        wwx0 wwx0Var;
        Integer numC0;
        kby kbyVar;
        l041 l041Var2 = this.t;
        yqg yqgVar = l041Var2.e;
        c9n c9nVar = (c9n) this.i;
        byte b = this.h;
        String str = null;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            jB = yqgVar.b();
            voe1 voe1VarB = l041Var2.f.b();
            long j2 = l041.g;
            long j3 = voe1VarB.a;
            int i = sjm0.b;
            voe1Var = new voe1(kkn.x(j3, j2));
            String str2 = this.Y;
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new zz31(l041Var2, str2, (lnm) null, (byte) 6), 3);
            s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new zz31(l041Var2, str2, (lnm) null, (byte) 4), 3);
            this.i = null;
            this.a = voe1Var;
            this.b = s2tVarQ;
            this.g = jB;
            this.h = (byte) 1;
            objQ = s2tVarQ2.Q(this);
            if (objQ != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            long j4 = this.g;
            s2tVarQ = this.b;
            voe1 voe1Var3 = this.a;
            hm5.M(obj);
            jB = j4;
            voe1Var = voe1Var3;
            objQ = obj;
        } else {
            if (b == 2) {
                long j5 = this.g;
                l041 l041Var3 = this.f;
                gzl1 gzl1Var2 = this.e;
                Map map3 = this.d;
                h120 h120Var3 = this.c;
                voe1 voe1Var4 = this.a;
                hm5.M(obj);
                map = map3;
                h120Var = h120Var3;
                voe1Var2 = voe1Var4;
                jB = j5;
                l041Var = l041Var3;
                gzl1VarA = gzl1Var2;
                objE = obj;
                this.i = null;
                this.a = null;
                this.b = null;
                this.c = h120Var;
                this.d = map;
                this.e = gzl1VarA;
                this.f = null;
                this.g = jB;
                this.h = (byte) 3;
                vp70 vp70Var = l041.h;
                gzl1Var = gzl1VarA;
                objG = l041Var.g((List) objE, gzl1Var, 3, this.X, voe1Var2, this);
                if (objG != d9nVar) {
                    j = jB;
                    map2 = map;
                    h120Var2 = h120Var;
                }
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j6 = this.g;
            gzl1Var = this.e;
            Map map4 = this.d;
            h120Var2 = this.c;
            hm5.M(obj);
            j = j6;
            objG = obj;
            map2 = map4;
        }
        gzl1 gzl1Var3 = gzl1Var;
        c380 c380Var = (c380) objG;
        wwx0Var = (wwx0) map2.get("duration");
        if (wwx0Var != null) {
            numC0 = nhc1.c0(wwx0Var.b);
        } else {
            numC0 = null;
        }
        wwx0 wwx0Var2 = (wwx0) map2.get("genre");
        vp70 vp70Var2 = l041.h;
        c380 c380VarA = mqo1.A(l041Var2.a(wwx0Var2));
        c380 c380VarA2 = mqo1.A(q7h.V(c380Var));
        if (h120Var2 != null && (kbyVar = h120Var2.a) != null) {
            str = kbyVar.b;
        }
        if (str == null) {
            str = "";
        }
        return new wz31(gzl1Var3, numC0, c380VarA, c380VarA2, c380Var, str, j, yqgVar.g());
        h120 h120Var4 = (h120) objQ;
        List list = h120Var4 != null ? h120Var4.c : null;
        if (list == null) {
            list = z6x.a;
        }
        List list2 = list;
        int iS = zno1.s(q7h.U(list2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : list2) {
            linkedHashMap.put(((wwx0) obj2).a, obj2);
        }
        gzl1.Companion.getClass();
        gzl1VarA = fzl1.a(linkedHashMap);
        this.i = null;
        this.a = voe1Var;
        this.b = null;
        this.c = h120Var4;
        this.d = linkedHashMap;
        this.e = gzl1VarA;
        this.f = l041Var2;
        this.g = jB;
        this.h = (byte) 2;
        objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            h120Var = h120Var4;
            voe1Var2 = voe1Var;
            l041Var = l041Var2;
            map = linkedHashMap;
            this.i = null;
            this.a = null;
            this.b = null;
            this.c = h120Var;
            this.d = map;
            this.e = gzl1VarA;
            this.f = null;
            this.g = jB;
            this.h = (byte) 3;
            vp70 vp70Var3 = l041.h;
            gzl1Var = gzl1VarA;
            objG = l041Var.g((List) objE, gzl1Var, 3, this.X, voe1Var2, this);
            if (objG != d9nVar) {
                j = jB;
                map2 = map;
                h120Var2 = h120Var;
                gzl1 gzl1Var4 = gzl1Var;
                c380 c380Var2 = (c380) objG;
                wwx0Var = (wwx0) map2.get("duration");
                if (wwx0Var != null) {
                    numC0 = nhc1.c0(wwx0Var.b);
                } else {
                    numC0 = null;
                }
                wwx0 wwx0Var3 = (wwx0) map2.get("genre");
                vp70 vp70Var4 = l041.h;
                c380 c380VarA3 = mqo1.A(l041Var2.a(wwx0Var3));
                c380 c380VarA4 = mqo1.A(q7h.V(c380Var2));
                if (h120Var2 != null) {
                    str = kbyVar.b;
                }
                if (str == null) {
                    str = "";
                }
                return new wz31(gzl1Var4, numC0, c380VarA3, c380VarA4, c380Var2, str, j, yqgVar.g());
            }
        }
        return d9nVar;
    }
}
