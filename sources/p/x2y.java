package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x2y implements Connectable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;

    public x2y(bhm0 bhm0Var) {
        this.a = (byte) 6;
        bpb1 bpb1VarB = gio1.b(bhm0Var);
        this.b = bpb1VarB;
        this.c = d5p1.h(bpb1VarB);
    }

    public static final o5e0 a(vbe vbeVar, x2y x2yVar) {
        zeu zeuVar = (zeu) x2yVar.c;
        if (vbeVar instanceof u490) {
            return k5e0.a;
        }
        if (vbeVar instanceof r490) {
            return h5e0.a;
        }
        if (vbeVar instanceof q490) {
            return new f5e0((Observable) zeuVar.c);
        }
        if (vbeVar instanceof t490) {
            return j5e0.a;
        }
        if (vbeVar instanceof p490) {
            return new c5e0((Observable) zeuVar.c);
        }
        if (vbeVar instanceof s490) {
            s490 s490Var = (s490) vbeVar;
            return new i5e0(s490Var.e, s490Var.f);
        }
        if (vbeVar instanceof v490) {
            v490 v490Var = (v490) vbeVar;
            return new l5e0(v490Var.e, v490Var.f);
        }
        if (vbeVar instanceof w490) {
            return new m5e0(((w490) vbeVar).e);
        }
        eg.o();
        return null;
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                this.d = consumer;
                return new rp(this, (byte) 23);
            case 1:
                return new cn(((Connectable) obj2).L(new xzf(consumer, this, (byte) 2)), this, (byte) 26);
            case 2:
                jun junVar = new jun(consumer, (byte) 4);
                ((fai0) obj).g(junVar);
                p811 p811Var = new p811();
                Object value = ((zob1) obj2).getValue();
                p811Var.a = value;
                consumer.accept(new jpc0((rnc0) value));
                llm llmVarE = smo1.e((q8n) this.d);
                fn31.T(llmVarE, (o8n) null, 0, new n0a0(this, p811Var, consumer, (lnm) null, (byte) 8), 3);
                return new ibn(llmVarE, this, junVar, (byte) 3);
            case 3:
                return ((e7m0) obj2).c.L(new d7m0(obj, (l811) this.d, consumer));
            case 4:
                zeu zeuVar = (zeu) obj;
                m42 m42Var = new m42(consumer, (byte) 22);
                ((CopyOnWriteArraySet) zeuVar.a).add(m42Var);
                return new mgp0(this, consumer, new t3x(zeuVar, m42Var, b2));
            case 5:
                fn31.T((c9n) obj2, (o8n) null, 0, new b201((sen0) obj, consumer, (lnm) null, (byte) 0), 3);
                return new n1b0((ven0) this.d, (byte) 20);
            default:
                this.d = consumer;
                return new xj81(this, (byte) 0);
        }
    }

    public Consumer b() {
        Consumer consumer = (Consumer) this.d;
        if (consumer != null) {
            return consumer;
        }
        u890.C("eventConsumer");
        throw null;
    }

    public /* synthetic */ x2y(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public x2y() {
        this.a = (byte) 0;
        kdn0 kdn0Var = new kdn0();
        this.b = kdn0Var;
        this.c = kdn0Var;
    }

    public x2y(zob1 zob1Var, fai0 fai0Var) {
        this.a = (byte) 2;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        this.b = zob1Var;
        this.c = fai0Var;
        this.d = bs50Var;
    }
}
