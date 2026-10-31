package p;

import com.spotify.ads.esperanto.proto.EventRequest;
import com.spotify.ads.esperanto.proto.EventResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ho0 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ co0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ jo0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho0(String str, co0 co0Var, long j, String str2, String str3, String str4, String str5, jo0 jo0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = str;
        this.d = co0Var;
        this.e = j;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.t = jo0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ho0 ho0Var = new ho0(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
        ho0Var.b = obj;
        return ho0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.b;
        boolean z = this.a;
        String str = this.c;
        jo0 jo0Var = this.t;
        String str2 = this.h;
        String str3 = this.g;
        co0 co0Var = this.d;
        try {
            if (!z) {
                hm5.M(obj);
                tb00 tb00VarN = EventRequest.n();
                tb00VarN.n(str);
                tb00VarN.u(co0Var.a);
                tb00VarN.v(this.e);
                String str4 = this.f;
                if (str4 != null) {
                    tb00VarN.r(str4);
                }
                if (str3 != null) {
                    tb00VarN.s(str3);
                }
                if (str2 != null) {
                    tb00VarN.t(str2);
                }
                String str5 = this.i;
                if (str5 != null) {
                    tb00VarN.q(str5);
                }
                re00 re00Var = jo0Var.a;
                EventRequest eventRequest = (EventRequest) tb00VarN.build();
                this.b = c9nVar;
                this.a = true;
                obj = re00Var.a(eventRequest, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            EventResponse eventResponse = (EventResponse) obj;
            if (eventResponse.n() != ub00.ACCEPTED) {
                jo0Var.c.a(new bo0(str, co0Var.a + " rejected with eventReason: " + str3 + " and eventSource: " + str2 + ", because of response: " + eventResponse, null, null));
            }
        } catch (Exception e) {
            smo1.t(c9nVar);
            jo0Var.c.a(new bo0(str, l1d.n(", error: ", e.getMessage(), gvg.n(co0Var.a, " failed with eventReason: ", str3, " and eventSource: ", str2)), null, null));
        }
        return rih1.a;
    }
}
