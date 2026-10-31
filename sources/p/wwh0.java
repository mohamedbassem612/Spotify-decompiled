package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wwh0 implements zj {
    public final ynb0 a;
    public final o4o0 b;
    public final fwo c;
    public final jks d;
    public final q8n e;
    public final bpb1 f;
    public llm g;
    public final bpb1 h;

    public wwh0(ynb0 ynb0Var, o4o0 o4o0Var, fwo fwoVar, jks jksVar, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = o4o0Var;
        this.c = fwoVar;
        this.d = jksVar;
        this.e = q8nVar;
        bpb1 bpb1VarB = gio1.b(z6x.a);
        this.f = bpb1VarB;
        this.h = bpb1VarB;
    }

    @Override // p.zj
    public final void a() {
        this.f.m((Object) null, z6x.a);
        llm llmVar = this.g;
        if (llmVar != null) {
            smo1.q(llmVar);
        } else {
            u890.C("scope");
            throw null;
        }
    }

    @Override // p.zj
    public final void b() {
        llm llmVarT = cy30.t(this.e);
        this.g = llmVarT;
        c921.y(llmVarT, (o8n) null, 0, new uug0(this, (lnm) null, (byte) 3), 3);
    }

    public final void c() {
        int i;
        int i2;
        o4o0 o4o0Var = this.b;
        if (!o4o0Var.a()) {
            o4o0Var.a();
            return;
        }
        ArrayList arrayListD = ((p7s) this.c.get()).d();
        arrayListD.size();
        arrayListD.toString();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListD.iterator();
        while (true) {
            i = 20;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            pr31 pr31Var = (pr31) next;
            if (!((Boolean) pr31Var.o.getValue()).booleanValue() && ((i2 = pr31Var.e) == 3 || i2 == 22 || i2 == 13 || i2 == 14 || i2 == 20)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            String strU = null;
            if (!it2.hasNext()) {
                bpb1 bpb1Var = this.f;
                Objects.toString(bpb1Var.getValue());
                arrayList2.toString();
                bpb1Var.m((Object) null, arrayList2);
                return;
            }
            pr31 pr31Var2 = (pr31) it2.next();
            int i3 = pr31Var2.e;
            int i4 = (i3 == 3 || (i3 != i && (i3 == 22 || !(i3 == 13 || i3 == 14)))) ? 3 : 4;
            smc0 smc0VarN = k4p1.n();
            smc0VarN.add(new cz81(ak.d, pr31Var2.a));
            cn70 cn70Var = new cn70(k4p1.k(smc0VarN));
            String str = pr31Var2.b;
            if (i4 == 4) {
                strU = j9k1.u((Context) this.a.get());
            }
            qi qiVar = new qi(str, strU, null, i4, z6x.a, null, null, cn70Var, 100);
            qiVar.toString();
            arrayList2.add(qiVar);
            i = 20;
        }
    }

    @Override // p.zj
    public final mr20 d() {
        return this.h;
    }
}
