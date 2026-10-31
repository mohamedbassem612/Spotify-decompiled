package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.First;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e7m0 implements mqw {
    public final iu30 a;
    public final Update b;
    public final Connectable c;
    public final vu30 d;
    public final cas e;

    public e7m0(iu30 iu30Var, Update update, Connectable connectable, vu30 vu30Var, cas casVar) {
        this.a = iu30Var;
        this.b = update;
        this.c = connectable;
        this.d = vu30Var;
        this.e = casVar;
    }

    public static final void e(p811 p811Var, First first, ArrayList arrayList, llm llmVar, ipb1 ipb1Var, p811 p811Var2) {
        MobiusLoop mobiusLoopA = ((MobiusLoop.Builder) p811Var.a).a(first.d(), first.a());
        mobiusLoopA.b(new xzf(llmVar, ipb1Var, (byte) 5));
        synchronized (arrayList) {
            try {
                p811Var2.a = mobiusLoopA;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mobiusLoopA.a((oam1) it.next());
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.mqw
    public final lqw a(Object obj, ipb1 ipb1Var) {
        First firstB;
        p811 p811Var;
        ArrayList arrayList;
        cas casVar = this.e;
        vu30 vu30Var = casVar.a;
        if (vu30Var == null || (firstB = (First) vu30Var.invoke(obj, ipb1Var.getState())) == null) {
            firstB = First.b(ipb1Var.getState());
        }
        First first = firstB;
        Object obj2 = new Object();
        l811 l811Var = new l811();
        x2y x2yVar = new x2y(this, obj2, l811Var, (byte) 3);
        iu30 iu30Var = casVar.h;
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(pyf0.a.f);
        p811 p811Var2 = new p811();
        MobiusLoop.Builder builderD = Mobius.d(this.b, x2yVar);
        p811Var2.a = builderD;
        Function0 function0 = casVar.d;
        if (function0 != null) {
            builderD = builderD.d(new y6e0(function0));
            p811Var2.a = builderD;
        }
        Function0 function1 = casVar.e;
        if (function1 != null) {
            builderD = builderD.b(new y6e0(function1));
            p811Var2.a = builderD;
        }
        EventSource eventSource = casVar.b;
        if (eventSource != null) {
            builderD = builderD.h(new acl(eventSource));
            p811Var2.a = builderD;
        }
        Connectable connectable = casVar.c;
        if (connectable != null) {
            builderD = builderD.i(new lud(connectable, (byte) 1));
            p811Var2.a = builderD;
        }
        MobiusLoop.Logger logger = casVar.g;
        if (logger != null) {
            p811Var2.a = builderD.f(new b7m0(logger));
        }
        o7g1 o7g1VarA = h7g1.a();
        p811 p811Var3 = new p811();
        llm llmVar = llmVarE;
        ArrayList arrayList2 = new ArrayList();
        p811 p811Var4 = new p811();
        if (o7g1VarA != null) {
            arrayList = arrayList2;
            p811Var = p811Var3;
            p811Var4.a = o7g1VarA.e(o7g1VarA.c(), new c7m0(p811Var2, first, arrayList2, llmVar, ipb1Var, p811Var3, (lnm) null));
        } else {
            p811Var = p811Var3;
            arrayList = arrayList2;
            e(p811Var2, first, arrayList, llmVar, ipb1Var, p811Var);
            llmVar = llmVar;
        }
        return new byp(arrayList, this, p811Var, obj2, p811Var4, iu30Var, ipb1Var, llmVar, l811Var);
    }

    @Override // p.mqw
    public final mc41 c() {
        bas basVar = this.e.f;
        return basVar == null ? new o7x() : basVar;
    }

    @Override // p.mqw
    public final Object d(Object obj) {
        return this.a.invoke(obj);
    }
}
