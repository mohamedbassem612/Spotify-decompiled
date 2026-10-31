package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ivn implements Connection {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final Object c;
    public final /* synthetic */ Object d;

    public ivn(j601 j601Var, Consumer consumer) {
        this.d = j601Var;
        this.c = j601Var.b.a(j601Var.c, j601Var.f, new v3v0(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 14));
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                hc91 hc91Var = (jc91) obj;
                if (hc91Var instanceof hc91) {
                    ((Consumer) obj3).accept(new ygx0(dm61.y0(this.b ? Collections.singleton((String) obj2) : w7x.a, o7h.p1(hc91Var.b))));
                    break;
                } else if (!hc91Var.equals(ic91.a)) {
                    eg.o();
                    break;
                }
                break;
            default:
                o501 o501Var = (o501) obj;
                e601 e601Var = (e601) obj3;
                j601 j601Var = (j601) obj2;
                if (j601Var.g && !this.b) {
                    this.b = true;
                    j601Var.a(e601Var, o501Var, true);
                } else {
                    j601Var.a(e601Var, o501Var, false);
                }
                break;
        }
    }

    public final void dispose() {
        byte b = this.a;
    }

    private final void a() {
    }

    private final void b() {
    }

    public ivn(Consumer consumer, boolean z, String str) {
        this.c = consumer;
        this.b = z;
        this.d = str;
    }
}
